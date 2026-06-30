package io.flutter.plugin.common;

/* loaded from: classes15.dex */
public final class EventChannel {
    private static final java.lang.String TAG = "EventChannel#";
    private final io.flutter.plugin.common.MethodCodec codec;
    private final io.flutter.plugin.common.BinaryMessenger messenger;
    private final java.lang.String name;
    private final io.flutter.plugin.common.BinaryMessenger.TaskQueue taskQueue;

    /* loaded from: classes15.dex */
    public interface EventSink {
        void endOfStream();

        void error(java.lang.String str, java.lang.String str2, java.lang.Object obj);

        void success(java.lang.Object obj);
    }

    /* loaded from: classes15.dex */
    public final class IncomingStreamRequestHandler implements io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler {
        private final java.util.concurrent.atomic.AtomicReference<io.flutter.plugin.common.EventChannel.EventSink> activeSink = new java.util.concurrent.atomic.AtomicReference<>(null);
        private final io.flutter.plugin.common.EventChannel.StreamHandler handler;

        /* loaded from: classes15.dex */
        public final class EventSinkImplementation implements io.flutter.plugin.common.EventChannel.EventSink {
            final java.util.concurrent.atomic.AtomicBoolean hasEnded;

            private EventSinkImplementation() {
                this.hasEnded = new java.util.concurrent.atomic.AtomicBoolean(false);
            }

            @Override // io.flutter.plugin.common.EventChannel.EventSink
            public void endOfStream() {
                if (this.hasEnded.getAndSet(true) || io.flutter.plugin.common.EventChannel.IncomingStreamRequestHandler.this.activeSink.get() != this) {
                    return;
                }
                io.flutter.plugin.common.EventChannel.this.messenger.send(io.flutter.plugin.common.EventChannel.this.name, null);
            }

            @Override // io.flutter.plugin.common.EventChannel.EventSink
            public void error(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
                if (this.hasEnded.get() || io.flutter.plugin.common.EventChannel.IncomingStreamRequestHandler.this.activeSink.get() != this) {
                    return;
                }
                io.flutter.plugin.common.EventChannel.this.messenger.send(io.flutter.plugin.common.EventChannel.this.name, io.flutter.plugin.common.EventChannel.this.codec.encodeErrorEnvelope(str, str2, obj));
            }

            @Override // io.flutter.plugin.common.EventChannel.EventSink
            public void success(java.lang.Object obj) {
                if (this.hasEnded.get() || io.flutter.plugin.common.EventChannel.IncomingStreamRequestHandler.this.activeSink.get() != this) {
                    return;
                }
                io.flutter.plugin.common.EventChannel.this.messenger.send(io.flutter.plugin.common.EventChannel.this.name, io.flutter.plugin.common.EventChannel.this.codec.encodeSuccessEnvelope(obj));
            }
        }

        public IncomingStreamRequestHandler(io.flutter.plugin.common.EventChannel.StreamHandler streamHandler) {
            this.handler = streamHandler;
        }

        private void onCancel(java.lang.Object obj, io.flutter.plugin.common.BinaryMessenger.BinaryReply binaryReply) {
            if (this.activeSink.getAndSet(null) == null) {
                binaryReply.reply(io.flutter.plugin.common.EventChannel.this.codec.encodeErrorEnvelope("error", "No active stream to cancel", null));
                return;
            }
            try {
                this.handler.onCancel(obj);
                binaryReply.reply(io.flutter.plugin.common.EventChannel.this.codec.encodeSuccessEnvelope(null));
            } catch (java.lang.RuntimeException e17) {
                io.flutter.Log.e(io.flutter.plugin.common.EventChannel.TAG + io.flutter.plugin.common.EventChannel.this.name, "Failed to close event stream", e17);
                binaryReply.reply(io.flutter.plugin.common.EventChannel.this.codec.encodeErrorEnvelope("error", e17.getMessage(), null));
            }
        }

        private void onListen(java.lang.Object obj, io.flutter.plugin.common.BinaryMessenger.BinaryReply binaryReply) {
            io.flutter.plugin.common.EventChannel.IncomingStreamRequestHandler.EventSinkImplementation eventSinkImplementation = new io.flutter.plugin.common.EventChannel.IncomingStreamRequestHandler.EventSinkImplementation();
            if (this.activeSink.getAndSet(eventSinkImplementation) != null) {
                try {
                    this.handler.onCancel(null);
                } catch (java.lang.RuntimeException e17) {
                    io.flutter.Log.e(io.flutter.plugin.common.EventChannel.TAG + io.flutter.plugin.common.EventChannel.this.name, "Failed to close existing event stream", e17);
                }
            }
            try {
                this.handler.onListen(obj, eventSinkImplementation);
                binaryReply.reply(io.flutter.plugin.common.EventChannel.this.codec.encodeSuccessEnvelope(null));
            } catch (java.lang.RuntimeException e18) {
                this.activeSink.set(null);
                io.flutter.Log.e(io.flutter.plugin.common.EventChannel.TAG + io.flutter.plugin.common.EventChannel.this.name, "Failed to open event stream", e18);
                binaryReply.reply(io.flutter.plugin.common.EventChannel.this.codec.encodeErrorEnvelope("error", e18.getMessage(), null));
            }
        }

        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler
        public void onMessage(java.nio.ByteBuffer byteBuffer, io.flutter.plugin.common.BinaryMessenger.BinaryReply binaryReply) {
            io.flutter.plugin.common.MethodCall decodeMethodCall = io.flutter.plugin.common.EventChannel.this.codec.decodeMethodCall(byteBuffer);
            if (decodeMethodCall.method.equals("listen")) {
                onListen(decodeMethodCall.arguments, binaryReply);
            } else if (decodeMethodCall.method.equals("cancel")) {
                onCancel(decodeMethodCall.arguments, binaryReply);
            } else {
                binaryReply.reply(null);
            }
        }
    }

    /* loaded from: classes11.dex */
    public interface StreamHandler {
        void onCancel(java.lang.Object obj);

        void onListen(java.lang.Object obj, io.flutter.plugin.common.EventChannel.EventSink eventSink);
    }

    public EventChannel(io.flutter.plugin.common.BinaryMessenger binaryMessenger, java.lang.String str) {
        this(binaryMessenger, str, io.flutter.plugin.common.StandardMethodCodec.INSTANCE);
    }

    public void setStreamHandler(io.flutter.plugin.common.EventChannel.StreamHandler streamHandler) {
        if (this.taskQueue != null) {
            this.messenger.setMessageHandler(this.name, streamHandler != null ? new io.flutter.plugin.common.EventChannel.IncomingStreamRequestHandler(streamHandler) : null, this.taskQueue);
        } else {
            this.messenger.setMessageHandler(this.name, streamHandler != null ? new io.flutter.plugin.common.EventChannel.IncomingStreamRequestHandler(streamHandler) : null);
        }
    }

    public EventChannel(io.flutter.plugin.common.BinaryMessenger binaryMessenger, java.lang.String str, io.flutter.plugin.common.MethodCodec methodCodec) {
        this(binaryMessenger, str, methodCodec, null);
    }

    public EventChannel(io.flutter.plugin.common.BinaryMessenger binaryMessenger, java.lang.String str, io.flutter.plugin.common.MethodCodec methodCodec, io.flutter.plugin.common.BinaryMessenger.TaskQueue taskQueue) {
        this.messenger = binaryMessenger;
        this.name = str;
        this.codec = methodCodec;
        this.taskQueue = taskQueue;
    }
}
