package io.flutter.embedding.engine.dart;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public class DartMessenger implements io.flutter.plugin.common.BinaryMessenger, io.flutter.embedding.engine.dart.PlatformMessageHandler, io.flutter.embedding.engine.SharedBinaryMessenger {
    private static final java.lang.String TAG = "DartMessenger";
    private java.util.Map<java.lang.String, java.util.List<io.flutter.embedding.engine.dart.DartMessenger.BufferedMessageInfo>> bufferedMessages;
    private java.util.WeakHashMap<io.flutter.plugin.common.BinaryMessenger.TaskQueue, io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue> createdTaskQueues;
    private final java.util.concurrent.atomic.AtomicBoolean enableBufferingIncomingMessages;
    private final io.flutter.embedding.engine.FlutterJNI flutterJNI;
    private final java.lang.Object handlersLock;
    private final java.util.Map<java.lang.String, io.flutter.embedding.engine.dart.DartMessenger.HandlerInfo> messageHandlers;
    private int nextReplyId;
    private final java.util.Map<java.lang.Integer, io.flutter.plugin.common.BinaryMessenger.BinaryReply> pendingReplies;
    private final io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue platformTaskQueue;
    private io.flutter.embedding.engine.SharedBinaryMessenger sharedBinaryMessenger;
    private io.flutter.embedding.engine.dart.DartMessenger.TaskQueueFactory taskQueueFactory;

    /* loaded from: classes15.dex */
    public static class BufferedMessageInfo {
        public final java.nio.ByteBuffer message;
        long messageData;
        int replyId;

        public BufferedMessageInfo(java.nio.ByteBuffer byteBuffer, int i17, long j17) {
            this.message = byteBuffer;
            this.replyId = i17;
            this.messageData = j17;
        }
    }

    /* loaded from: classes15.dex */
    public static class ConcurrentTaskQueue implements io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue {
        private final java.util.concurrent.ExecutorService executor;

        public ConcurrentTaskQueue(java.util.concurrent.ExecutorService executorService) {
            this.executor = executorService;
        }

        @Override // io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue
        public void dispatch(java.lang.Runnable runnable) {
            this.executor.execute(runnable);
        }
    }

    /* loaded from: classes15.dex */
    public interface DartMessengerTaskQueue {
        void dispatch(java.lang.Runnable runnable);
    }

    /* loaded from: classes15.dex */
    public static class DefaultTaskQueueFactory implements io.flutter.embedding.engine.dart.DartMessenger.TaskQueueFactory {
        java.util.concurrent.ExecutorService executorService = io.flutter.FlutterInjector.instance().executorService();

        @Override // io.flutter.embedding.engine.dart.DartMessenger.TaskQueueFactory
        public io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue makeBackgroundTaskQueue(io.flutter.plugin.common.BinaryMessenger.TaskQueueOptions taskQueueOptions) {
            return taskQueueOptions.getIsSerial() ? new io.flutter.embedding.engine.dart.DartMessenger.SerialTaskQueue(this.executorService) : new io.flutter.embedding.engine.dart.DartMessenger.ConcurrentTaskQueue(this.executorService);
        }
    }

    /* loaded from: classes15.dex */
    public static class HandlerInfo {
        public final io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler handler;
        public final io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue taskQueue;

        public HandlerInfo(io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler binaryMessageHandler, io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue dartMessengerTaskQueue) {
            this.handler = binaryMessageHandler;
            this.taskQueue = dartMessengerTaskQueue;
        }
    }

    /* loaded from: classes15.dex */
    public static class Reply implements io.flutter.plugin.common.BinaryMessenger.BinaryReply {
        private final java.util.concurrent.atomic.AtomicBoolean done = new java.util.concurrent.atomic.AtomicBoolean(false);
        private final io.flutter.embedding.engine.FlutterJNI flutterJNI;
        private final int replyId;

        public Reply(io.flutter.embedding.engine.FlutterJNI flutterJNI, int i17) {
            this.flutterJNI = flutterJNI;
            this.replyId = i17;
        }

        @Override // io.flutter.plugin.common.BinaryMessenger.BinaryReply
        public void reply(java.nio.ByteBuffer byteBuffer) {
            if (this.done.getAndSet(true)) {
                throw new java.lang.IllegalStateException("Reply already submitted");
            }
            if (byteBuffer == null) {
                this.flutterJNI.invokePlatformMessageEmptyResponseCallback(this.replyId);
            } else {
                this.flutterJNI.invokePlatformMessageResponseCallback(this.replyId, byteBuffer, byteBuffer.position());
            }
        }
    }

    /* loaded from: classes15.dex */
    public static class SerialTaskQueue implements io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue {
        private final java.util.concurrent.ExecutorService executor;
        private final java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> queue = new java.util.concurrent.ConcurrentLinkedQueue<>();
        private final java.util.concurrent.atomic.AtomicBoolean isRunning = new java.util.concurrent.atomic.AtomicBoolean(false);

        public SerialTaskQueue(java.util.concurrent.ExecutorService executorService) {
            this.executor = executorService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: flush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public void lambda$flush$1() {
            if (this.isRunning.compareAndSet(false, true)) {
                try {
                    java.lang.Runnable poll = this.queue.poll();
                    if (poll != null) {
                        poll.run();
                    }
                } finally {
                    this.isRunning.set(false);
                    if (!this.queue.isEmpty()) {
                        this.executor.execute(new java.lang.Runnable() { // from class: io.flutter.embedding.engine.dart.DartMessenger$SerialTaskQueue$$a
                            @Override // java.lang.Runnable
                            public final void run() {
                                io.flutter.embedding.engine.dart.DartMessenger.SerialTaskQueue.this.lambda$flush$1();
                            }
                        });
                    }
                }
            }
        }

        @Override // io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue
        public void dispatch(java.lang.Runnable runnable) {
            this.queue.add(runnable);
            this.executor.execute(new java.lang.Runnable() { // from class: io.flutter.embedding.engine.dart.DartMessenger$SerialTaskQueue$$b
                @Override // java.lang.Runnable
                public final void run() {
                    io.flutter.embedding.engine.dart.DartMessenger.SerialTaskQueue.this.lambda$dispatch$0();
                }
            });
        }
    }

    /* loaded from: classes15.dex */
    public interface TaskQueueFactory {
        io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue makeBackgroundTaskQueue(io.flutter.plugin.common.BinaryMessenger.TaskQueueOptions taskQueueOptions);
    }

    /* loaded from: classes15.dex */
    public static class TaskQueueToken implements io.flutter.plugin.common.BinaryMessenger.TaskQueue {
        private TaskQueueToken() {
        }
    }

    public DartMessenger(io.flutter.embedding.engine.FlutterJNI flutterJNI, io.flutter.embedding.engine.dart.DartMessenger.TaskQueueFactory taskQueueFactory) {
        this.messageHandlers = new java.util.HashMap();
        this.bufferedMessages = new java.util.HashMap();
        this.handlersLock = new java.lang.Object();
        this.enableBufferingIncomingMessages = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.pendingReplies = new java.util.HashMap();
        this.nextReplyId = 1;
        this.platformTaskQueue = new io.flutter.embedding.engine.dart.PlatformTaskQueue();
        this.createdTaskQueues = new java.util.WeakHashMap<>();
        this.flutterJNI = flutterJNI;
        this.taskQueueFactory = taskQueueFactory;
    }

    private void dispatchMessageToQueue(final java.lang.String str, final io.flutter.embedding.engine.dart.DartMessenger.HandlerInfo handlerInfo, final java.nio.ByteBuffer byteBuffer, final int i17, final long j17) {
        io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue dartMessengerTaskQueue = handlerInfo != null ? handlerInfo.taskQueue : null;
        io.flutter.util.TraceSection.beginAsyncSection("PlatformChannel ScheduleHandler on " + str, i17);
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: io.flutter.embedding.engine.dart.DartMessenger$$a
            @Override // java.lang.Runnable
            public final void run() {
                io.flutter.embedding.engine.dart.DartMessenger.this.lambda$dispatchMessageToQueue$0(str, i17, handlerInfo, byteBuffer, j17);
            }
        };
        if (dartMessengerTaskQueue == null) {
            dartMessengerTaskQueue = this.platformTaskQueue;
        }
        dartMessengerTaskQueue.dispatch(runnable);
    }

    private static void handleError(java.lang.Error error) {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        if (currentThread.getUncaughtExceptionHandler() == null) {
            throw error;
        }
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, error);
    }

    private void invokeHandler(java.lang.String str, io.flutter.embedding.engine.dart.DartMessenger.HandlerInfo handlerInfo, java.nio.ByteBuffer byteBuffer, int i17) {
        io.flutter.embedding.engine.SharedBinaryMessenger sharedBinaryMessenger;
        io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler messageHandler;
        if (handlerInfo == null && (sharedBinaryMessenger = this.sharedBinaryMessenger) != null && (messageHandler = sharedBinaryMessenger.getMessageHandler(str)) != null) {
            messageHandler.onMessage(byteBuffer, new io.flutter.embedding.engine.dart.DartMessenger.Reply(this.flutterJNI, i17));
            return;
        }
        if (handlerInfo == null) {
            io.flutter.Log.v(TAG, "No registered handler for message. Responding to Dart with empty reply message.");
            this.flutterJNI.invokePlatformMessageEmptyResponseCallback(i17);
            return;
        }
        try {
            io.flutter.Log.v(TAG, "Deferring to registered handler to process message.");
            handlerInfo.handler.onMessage(byteBuffer, new io.flutter.embedding.engine.dart.DartMessenger.Reply(this.flutterJNI, i17));
        } catch (java.lang.Error e17) {
            handleError(e17);
        } catch (java.lang.Exception e18) {
            io.flutter.Log.e(TAG, "Uncaught exception in binary message listener", e18);
            this.flutterJNI.invokePlatformMessageEmptyResponseCallback(i17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispatchMessageToQueue$0(java.lang.String str, int i17, io.flutter.embedding.engine.dart.DartMessenger.HandlerInfo handlerInfo, java.nio.ByteBuffer byteBuffer, long j17) {
        io.flutter.util.TraceSection.endAsyncSection("PlatformChannel ScheduleHandler on " + str, i17);
        try {
            io.flutter.util.TraceSection scoped = io.flutter.util.TraceSection.scoped("DartMessenger#handleMessageFromDart on " + str);
            try {
                invokeHandler(str, handlerInfo, byteBuffer, i17);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
                if (scoped != null) {
                    scoped.close();
                }
            } finally {
            }
        } finally {
            this.flutterJNI.cleanupMessageData(j17);
        }
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public void disableBufferingIncomingMessages() {
        java.util.Map<java.lang.String, java.util.List<io.flutter.embedding.engine.dart.DartMessenger.BufferedMessageInfo>> map;
        synchronized (this.handlersLock) {
            this.enableBufferingIncomingMessages.set(false);
            map = this.bufferedMessages;
            this.bufferedMessages = new java.util.HashMap();
        }
        for (java.util.Map.Entry<java.lang.String, java.util.List<io.flutter.embedding.engine.dart.DartMessenger.BufferedMessageInfo>> entry : map.entrySet()) {
            for (io.flutter.embedding.engine.dart.DartMessenger.BufferedMessageInfo bufferedMessageInfo : entry.getValue()) {
                dispatchMessageToQueue(entry.getKey(), null, bufferedMessageInfo.message, bufferedMessageInfo.replyId, bufferedMessageInfo.messageData);
            }
        }
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public void enableBufferingIncomingMessages() {
        this.enableBufferingIncomingMessages.set(true);
    }

    @Override // io.flutter.embedding.engine.SharedBinaryMessenger
    public io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler getMessageHandler(java.lang.String str) {
        io.flutter.embedding.engine.dart.DartMessenger.HandlerInfo handlerInfo = this.messageHandlers.get(str);
        if (handlerInfo != null) {
            return handlerInfo.handler;
        }
        return null;
    }

    public int getPendingChannelResponseCount() {
        return this.pendingReplies.size();
    }

    @Override // io.flutter.embedding.engine.dart.PlatformMessageHandler
    public void handleMessageFromDart(java.lang.String str, java.nio.ByteBuffer byteBuffer, int i17, long j17) {
        io.flutter.embedding.engine.dart.DartMessenger.HandlerInfo handlerInfo;
        boolean z17;
        io.flutter.Log.v(TAG, "Received message from Dart over channel '" + str + "'");
        synchronized (this.handlersLock) {
            handlerInfo = this.messageHandlers.get(str);
            z17 = this.enableBufferingIncomingMessages.get() && handlerInfo == null;
            if (z17) {
                if (!this.bufferedMessages.containsKey(str)) {
                    this.bufferedMessages.put(str, new java.util.LinkedList());
                }
                this.bufferedMessages.get(str).add(new io.flutter.embedding.engine.dart.DartMessenger.BufferedMessageInfo(byteBuffer, i17, j17));
            }
        }
        if (z17) {
            return;
        }
        dispatchMessageToQueue(str, handlerInfo, byteBuffer, i17, j17);
    }

    @Override // io.flutter.embedding.engine.dart.PlatformMessageHandler
    public void handlePlatformMessageResponse(int i17, java.nio.ByteBuffer byteBuffer) {
        io.flutter.Log.v(TAG, "Received message reply from Dart.");
        io.flutter.plugin.common.BinaryMessenger.BinaryReply remove = this.pendingReplies.remove(java.lang.Integer.valueOf(i17));
        if (remove != null) {
            try {
                io.flutter.Log.v(TAG, "Invoking registered callback for reply from Dart.");
                remove.reply(byteBuffer);
                if (byteBuffer == null || !byteBuffer.isDirect()) {
                    return;
                }
                byteBuffer.limit(0);
            } catch (java.lang.Error e17) {
                handleError(e17);
            } catch (java.lang.Exception e18) {
                io.flutter.Log.e(TAG, "Uncaught exception in binary message reply handler", e18);
            }
        }
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public io.flutter.plugin.common.BinaryMessenger.TaskQueue makeBackgroundTaskQueue(io.flutter.plugin.common.BinaryMessenger.TaskQueueOptions taskQueueOptions) {
        io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue makeBackgroundTaskQueue = this.taskQueueFactory.makeBackgroundTaskQueue(taskQueueOptions);
        io.flutter.embedding.engine.dart.DartMessenger.TaskQueueToken taskQueueToken = new io.flutter.embedding.engine.dart.DartMessenger.TaskQueueToken();
        this.createdTaskQueues.put(taskQueueToken, makeBackgroundTaskQueue);
        return taskQueueToken;
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public void send(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
        io.flutter.Log.v(TAG, "Sending message over channel '" + str + "'");
        send(str, byteBuffer, null);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public void setMessageHandler(java.lang.String str, io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler binaryMessageHandler) {
        setMessageHandler(str, binaryMessageHandler, null);
    }

    public void setSharedBinaryMessenger(io.flutter.embedding.engine.SharedBinaryMessenger sharedBinaryMessenger) {
        if (sharedBinaryMessenger == this) {
            return;
        }
        this.sharedBinaryMessenger = sharedBinaryMessenger;
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public void setMessageHandler(java.lang.String str, io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler binaryMessageHandler, io.flutter.plugin.common.BinaryMessenger.TaskQueue taskQueue) {
        io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue dartMessengerTaskQueue;
        if (binaryMessageHandler == null) {
            io.flutter.Log.v(TAG, "Removing handler for channel '" + str + "'");
            synchronized (this.handlersLock) {
                this.messageHandlers.remove(str);
            }
            return;
        }
        if (taskQueue != null) {
            dartMessengerTaskQueue = this.createdTaskQueues.get(taskQueue);
            if (dartMessengerTaskQueue == null) {
                throw new java.lang.IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            dartMessengerTaskQueue = null;
        }
        io.flutter.Log.v(TAG, "Setting handler for channel '" + str + "'");
        synchronized (this.handlersLock) {
            this.messageHandlers.put(str, new io.flutter.embedding.engine.dart.DartMessenger.HandlerInfo(binaryMessageHandler, dartMessengerTaskQueue));
            java.util.List<io.flutter.embedding.engine.dart.DartMessenger.BufferedMessageInfo> remove = this.bufferedMessages.remove(str);
            if (remove == null) {
                return;
            }
            for (io.flutter.embedding.engine.dart.DartMessenger.BufferedMessageInfo bufferedMessageInfo : remove) {
                dispatchMessageToQueue(str, this.messageHandlers.get(str), bufferedMessageInfo.message, bufferedMessageInfo.replyId, bufferedMessageInfo.messageData);
            }
        }
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public void send(java.lang.String str, java.nio.ByteBuffer byteBuffer, io.flutter.plugin.common.BinaryMessenger.BinaryReply binaryReply) {
        io.flutter.util.TraceSection scoped = io.flutter.util.TraceSection.scoped("DartMessenger#send on " + str);
        try {
            io.flutter.Log.v(TAG, "Sending message with callback over channel '" + str + "'");
            int i17 = this.nextReplyId;
            this.nextReplyId = i17 + 1;
            if (binaryReply != null) {
                this.pendingReplies.put(java.lang.Integer.valueOf(i17), binaryReply);
            }
            if (byteBuffer == null) {
                this.flutterJNI.dispatchEmptyPlatformMessage(str, i17);
            } else {
                this.flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i17);
            }
            if (scoped != null) {
                scoped.close();
            }
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public DartMessenger(io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        this(flutterJNI, new io.flutter.embedding.engine.dart.DartMessenger.DefaultTaskQueueFactory());
    }
}
