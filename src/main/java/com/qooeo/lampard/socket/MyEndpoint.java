package com.qooeo.lampard.socket;

import javax.websocket.server.ServerEndpoint;

import org.nextrtc.signalingserver.api.ConfigurationBuilder;
import org.nextrtc.signalingserver.api.EndpointConfiguration;
import org.nextrtc.signalingserver.api.NextRTCEndpoint;
import org.nextrtc.signalingserver.api.NextRTCHandler;
import org.nextrtc.signalingserver.api.annotation.NextRTCEventListener;
import org.nextrtc.signalingserver.api.dto.NextRTCEvent;
import org.nextrtc.signalingserver.codec.MessageDecoder;
import org.nextrtc.signalingserver.codec.MessageEncoder;
import org.nextrtc.signalingserver.domain.Signal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.nextrtc.signalingserver.api.NextRTCEvents;


@NextRTCEventListener(NextRTCEvents.UNEXPECTED_SITUATION)
class ExceptionHandler implements NextRTCHandler {
	private static Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);
	
    @Override
    public void handleEvent(NextRTCEvent nextRTCEvent) {
    	logger.error(nextRTCEvent.toString());
    }

}

//@NextRTCEventListener(NextRTCEvents.TEXT)
//class TextHandler implements NextRTCHandler {
//	private static Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);
//	
//    @Override
//    public void handleEvent(NextRTCEvent nextRTCEvent) {
//    	logger.error(nextRTCEvent.toString());
//    }
//}

@ServerEndpoint(value = "/socket/signaling",//
decoders = MessageDecoder.class,//
encoders = MessageEncoder.class)
public class MyEndpoint extends NextRTCEndpoint {
	protected EndpointConfiguration manualConfiguration(final ConfigurationBuilder builder) {
        EndpointConfiguration configuration = builder.createDefaultEndpoint();
//        configuration.eventDispatcher().addListener(new ExceptionHandler());
//        configuration.eventDispatcher().addListener(new TextHandler());
        return configuration;
    }
}
