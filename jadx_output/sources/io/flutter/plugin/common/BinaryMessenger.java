package io.flutter.plugin.common;

/* loaded from: classes15.dex */
public interface BinaryMessenger {

    /* loaded from: classes15.dex */
    public interface BinaryMessageHandler {
        void onMessage(java.nio.ByteBuffer byteBuffer, io.flutter.plugin.common.BinaryMessenger.BinaryReply binaryReply);
    }

    /* loaded from: classes15.dex */
    public interface BinaryReply {
        void reply(java.nio.ByteBuffer byteBuffer);
    }

    /* loaded from: classes11.dex */
    public interface TaskQueue {
    }

    /* loaded from: classes15.dex */
    public static class TaskQueueOptions {
        private boolean isSerial = true;

        public boolean getIsSerial() {
            return this.isSerial;
        }

        public io.flutter.plugin.common.BinaryMessenger.TaskQueueOptions setIsSerial(boolean z17) {
            this.isSerial = z17;
            return this;
        }
    }

    default void disableBufferingIncomingMessages() {
        throw new java.lang.UnsupportedOperationException("disableBufferingIncomingMessages not implemented.");
    }

    default void enableBufferingIncomingMessages() {
        throw new java.lang.UnsupportedOperationException("enableBufferingIncomingMessages not implemented.");
    }

    default io.flutter.plugin.common.BinaryMessenger.TaskQueue makeBackgroundTaskQueue() {
        return makeBackgroundTaskQueue(new io.flutter.plugin.common.BinaryMessenger.TaskQueueOptions());
    }

    void send(java.lang.String str, java.nio.ByteBuffer byteBuffer);

    void send(java.lang.String str, java.nio.ByteBuffer byteBuffer, io.flutter.plugin.common.BinaryMessenger.BinaryReply binaryReply);

    void setMessageHandler(java.lang.String str, io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler binaryMessageHandler);

    default void setMessageHandler(java.lang.String str, io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler binaryMessageHandler, io.flutter.plugin.common.BinaryMessenger.TaskQueue taskQueue) {
        if (taskQueue == null) {
            setMessageHandler(str, binaryMessageHandler);
            return;
        }
        throw new java.lang.UnsupportedOperationException("setMessageHandler called with nonnull taskQueue is not supported.");
    }

    default io.flutter.plugin.common.BinaryMessenger.TaskQueue makeBackgroundTaskQueue(io.flutter.plugin.common.BinaryMessenger.TaskQueueOptions taskQueueOptions) {
        throw new java.lang.UnsupportedOperationException("makeBackgroundTaskQueue not implemented.");
    }
}
