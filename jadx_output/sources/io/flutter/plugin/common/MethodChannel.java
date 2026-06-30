package io.flutter.plugin.common;

/* loaded from: classes15.dex */
public class MethodChannel {
    private static final java.lang.String TAG = "MethodChannel#";
    private final io.flutter.plugin.common.MethodCodec codec;
    private final io.flutter.plugin.common.BinaryMessenger messenger;
    private final java.lang.String name;
    private final io.flutter.plugin.common.BinaryMessenger.TaskQueue taskQueue;

    /* loaded from: classes15.dex */
    public final class IncomingMethodCallHandler implements io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler {
        private final io.flutter.plugin.common.MethodChannel.MethodCallHandler handler;

        public IncomingMethodCallHandler(io.flutter.plugin.common.MethodChannel.MethodCallHandler methodCallHandler) {
            this.handler = methodCallHandler;
        }

        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler
        public void onMessage(java.nio.ByteBuffer byteBuffer, final io.flutter.plugin.common.BinaryMessenger.BinaryReply binaryReply) {
            try {
                this.handler.onMethodCall(io.flutter.plugin.common.MethodChannel.this.codec.decodeMethodCall(byteBuffer), new io.flutter.plugin.common.MethodChannel.Result() { // from class: io.flutter.plugin.common.MethodChannel.IncomingMethodCallHandler.1
                    @Override // io.flutter.plugin.common.MethodChannel.Result
                    public void error(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
                        binaryReply.reply(io.flutter.plugin.common.MethodChannel.this.codec.encodeErrorEnvelope(str, str2, obj));
                    }

                    @Override // io.flutter.plugin.common.MethodChannel.Result
                    public void notImplemented() {
                        binaryReply.reply(null);
                    }

                    @Override // io.flutter.plugin.common.MethodChannel.Result
                    public void success(java.lang.Object obj) {
                        binaryReply.reply(io.flutter.plugin.common.MethodChannel.this.codec.encodeSuccessEnvelope(obj));
                    }
                });
            } catch (java.lang.RuntimeException e17) {
                io.flutter.Log.e(io.flutter.plugin.common.MethodChannel.TAG + io.flutter.plugin.common.MethodChannel.this.name, "Failed to handle method call", e17);
                binaryReply.reply(io.flutter.plugin.common.MethodChannel.this.codec.encodeErrorEnvelopeWithStacktrace("error", e17.getMessage(), null, io.flutter.Log.getStackTraceString(e17)));
            }
        }
    }

    /* loaded from: classes13.dex */
    public final class IncomingResultHandler implements io.flutter.plugin.common.BinaryMessenger.BinaryReply {
        private final io.flutter.plugin.common.MethodChannel.Result callback;

        public IncomingResultHandler(io.flutter.plugin.common.MethodChannel.Result result) {
            this.callback = result;
        }

        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryReply
        public void reply(java.nio.ByteBuffer byteBuffer) {
            try {
                if (byteBuffer == null) {
                    this.callback.notImplemented();
                } else {
                    try {
                        this.callback.success(io.flutter.plugin.common.MethodChannel.this.codec.decodeEnvelope(byteBuffer));
                    } catch (io.flutter.plugin.common.FlutterException e17) {
                        this.callback.error(e17.code, e17.getMessage(), e17.details);
                    }
                }
            } catch (java.lang.RuntimeException e18) {
                io.flutter.Log.e(io.flutter.plugin.common.MethodChannel.TAG + io.flutter.plugin.common.MethodChannel.this.name, "Failed to handle method call result", e18);
            }
        }
    }

    /* loaded from: classes13.dex */
    public interface MethodCallHandler {
        void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result);
    }

    /* loaded from: classes8.dex */
    public interface Result {
        void error(java.lang.String str, java.lang.String str2, java.lang.Object obj);

        void notImplemented();

        void success(java.lang.Object obj);
    }

    public MethodChannel(io.flutter.plugin.common.BinaryMessenger binaryMessenger, java.lang.String str) {
        this(binaryMessenger, str, io.flutter.plugin.common.StandardMethodCodec.INSTANCE);
    }

    public void invokeMethod(java.lang.String str, java.lang.Object obj) {
        invokeMethod(str, obj, null);
    }

    public void resizeChannelBuffer(int i17) {
        io.flutter.plugin.common.BasicMessageChannel.resizeChannelBuffer(this.messenger, this.name, i17);
    }

    public void setMethodCallHandler(io.flutter.plugin.common.MethodChannel.MethodCallHandler methodCallHandler) {
        if (this.taskQueue != null) {
            this.messenger.setMessageHandler(this.name, methodCallHandler != null ? new io.flutter.plugin.common.MethodChannel.IncomingMethodCallHandler(methodCallHandler) : null, this.taskQueue);
        } else {
            this.messenger.setMessageHandler(this.name, methodCallHandler != null ? new io.flutter.plugin.common.MethodChannel.IncomingMethodCallHandler(methodCallHandler) : null);
        }
    }

    public void setWarnsOnChannelOverflow(boolean z17) {
        io.flutter.plugin.common.BasicMessageChannel.setWarnsOnChannelOverflow(this.messenger, this.name, z17);
    }

    public MethodChannel(io.flutter.plugin.common.BinaryMessenger binaryMessenger, java.lang.String str, io.flutter.plugin.common.MethodCodec methodCodec) {
        this(binaryMessenger, str, methodCodec, null);
    }

    public void invokeMethod(java.lang.String str, java.lang.Object obj, io.flutter.plugin.common.MethodChannel.Result result) {
        this.messenger.send(this.name, this.codec.encodeMethodCall(new io.flutter.plugin.common.MethodCall(str, obj)), result == null ? null : new io.flutter.plugin.common.MethodChannel.IncomingResultHandler(result));
    }

    public MethodChannel(io.flutter.plugin.common.BinaryMessenger binaryMessenger, java.lang.String str, io.flutter.plugin.common.MethodCodec methodCodec, io.flutter.plugin.common.BinaryMessenger.TaskQueue taskQueue) {
        this.messenger = binaryMessenger;
        this.name = str;
        this.codec = methodCodec;
        this.taskQueue = taskQueue;
    }
}
