package io.flutter.plugin.common;

/* loaded from: classes15.dex */
public final class BasicMessageChannel<T> {
    public static final java.lang.String CHANNEL_BUFFERS_CHANNEL = "dev.flutter/channel-buffers";
    private static final java.lang.String TAG = "BasicMessageChannel#";
    private final io.flutter.plugin.common.MessageCodec<T> codec;
    private final io.flutter.plugin.common.BinaryMessenger messenger;
    private final java.lang.String name;
    private final io.flutter.plugin.common.BinaryMessenger.TaskQueue taskQueue;

    /* loaded from: classes15.dex */
    public final class IncomingMessageHandler implements io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler {
        private final io.flutter.plugin.common.BasicMessageChannel.MessageHandler<T> handler;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler
        public void onMessage(java.nio.ByteBuffer byteBuffer, final io.flutter.plugin.common.BinaryMessenger.BinaryReply binaryReply) {
            try {
                this.handler.onMessage(io.flutter.plugin.common.BasicMessageChannel.this.codec.decodeMessage(byteBuffer), new io.flutter.plugin.common.BasicMessageChannel.Reply<T>() { // from class: io.flutter.plugin.common.BasicMessageChannel.IncomingMessageHandler.1
                    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                    public void reply(T t17) {
                        binaryReply.reply(io.flutter.plugin.common.BasicMessageChannel.this.codec.encodeMessage(t17));
                    }
                });
            } catch (java.lang.Exception e17) {
                io.flutter.Log.e(io.flutter.plugin.common.BasicMessageChannel.TAG + io.flutter.plugin.common.BasicMessageChannel.this.name, "Failed to handle message", e17);
                binaryReply.reply(null);
            }
        }

        private IncomingMessageHandler(io.flutter.plugin.common.BasicMessageChannel.MessageHandler<T> messageHandler) {
            this.handler = messageHandler;
        }
    }

    /* loaded from: classes15.dex */
    public final class IncomingReplyHandler implements io.flutter.plugin.common.BinaryMessenger.BinaryReply {
        private final io.flutter.plugin.common.BasicMessageChannel.Reply<T> callback;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryReply
        public void reply(java.nio.ByteBuffer byteBuffer) {
            try {
                this.callback.reply(io.flutter.plugin.common.BasicMessageChannel.this.codec.decodeMessage(byteBuffer));
            } catch (java.lang.RuntimeException e17) {
                io.flutter.Log.e(io.flutter.plugin.common.BasicMessageChannel.TAG + io.flutter.plugin.common.BasicMessageChannel.this.name, "Failed to handle message reply", e17);
            }
        }

        private IncomingReplyHandler(io.flutter.plugin.common.BasicMessageChannel.Reply<T> reply) {
            this.callback = reply;
        }
    }

    /* loaded from: classes11.dex */
    public interface MessageHandler<T> {
        void onMessage(T t17, io.flutter.plugin.common.BasicMessageChannel.Reply<T> reply);
    }

    /* loaded from: classes11.dex */
    public interface Reply<T> {
        void reply(T t17);
    }

    public BasicMessageChannel(io.flutter.plugin.common.BinaryMessenger binaryMessenger, java.lang.String str, io.flutter.plugin.common.MessageCodec<T> messageCodec) {
        this(binaryMessenger, str, messageCodec, null);
    }

    private static java.nio.ByteBuffer packetFromEncodedMessage(java.nio.ByteBuffer byteBuffer) {
        byteBuffer.flip();
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(remaining);
        allocateDirect.put(bArr);
        return allocateDirect;
    }

    public void resizeChannelBuffer(int i17) {
        resizeChannelBuffer(this.messenger, this.name, i17);
    }

    public void send(T t17) {
        send(t17, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.flutter.plugin.common.BinaryMessenger] */
    /* JADX WARN: Type inference failed for: r1v0, types: [io.flutter.plugin.common.BasicMessageChannel$1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [io.flutter.plugin.common.BinaryMessenger$BinaryMessageHandler] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public void setMessageHandler(io.flutter.plugin.common.BasicMessageChannel.MessageHandler<T> messageHandler) {
        if (this.taskQueue != null) {
            this.messenger.setMessageHandler(this.name, messageHandler != null ? new io.flutter.plugin.common.BasicMessageChannel.IncomingMessageHandler(messageHandler) : null, this.taskQueue);
        } else {
            this.messenger.setMessageHandler(this.name, messageHandler != null ? new io.flutter.plugin.common.BasicMessageChannel.IncomingMessageHandler(messageHandler) : 0);
        }
    }

    public void setWarnsOnChannelOverflow(boolean z17) {
        setWarnsOnChannelOverflow(this.messenger, this.name, z17);
    }

    public BasicMessageChannel(io.flutter.plugin.common.BinaryMessenger binaryMessenger, java.lang.String str, io.flutter.plugin.common.MessageCodec<T> messageCodec, io.flutter.plugin.common.BinaryMessenger.TaskQueue taskQueue) {
        this.messenger = binaryMessenger;
        this.name = str;
        this.codec = messageCodec;
        this.taskQueue = taskQueue;
    }

    public static void resizeChannelBuffer(io.flutter.plugin.common.BinaryMessenger binaryMessenger, java.lang.String str, int i17) {
        binaryMessenger.send(CHANNEL_BUFFERS_CHANNEL, packetFromEncodedMessage(io.flutter.plugin.common.StandardMethodCodec.INSTANCE.encodeMethodCall(new io.flutter.plugin.common.MethodCall("resize", java.util.Arrays.asList(str, java.lang.Integer.valueOf(i17))))));
    }

    public static void setWarnsOnChannelOverflow(io.flutter.plugin.common.BinaryMessenger binaryMessenger, java.lang.String str, boolean z17) {
        binaryMessenger.send(CHANNEL_BUFFERS_CHANNEL, packetFromEncodedMessage(io.flutter.plugin.common.StandardMethodCodec.INSTANCE.encodeMethodCall(new io.flutter.plugin.common.MethodCall("overflow", java.util.Arrays.asList(str, java.lang.Boolean.valueOf(!z17))))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void send(T t17, io.flutter.plugin.common.BasicMessageChannel.Reply<T> reply) {
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = this.messenger;
        java.lang.String str = this.name;
        java.nio.ByteBuffer encodeMessage = this.codec.encodeMessage(t17);
        io.flutter.plugin.common.BinaryMessenger.BinaryReply binaryReply = null;
        java.lang.Object[] objArr = 0;
        if (reply != null) {
            binaryReply = new io.flutter.plugin.common.BasicMessageChannel.IncomingReplyHandler(reply);
        }
        binaryMessenger.send(str, encodeMessage, binaryReply);
    }
}
