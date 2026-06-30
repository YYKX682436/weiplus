package io.flutter.embedding.engine.dart;

/* loaded from: classes15.dex */
public class DartExecutor implements io.flutter.plugin.common.BinaryMessenger {
    private static final java.lang.String TAG = "DartExecutor";
    private final android.content.res.AssetManager assetManager;
    private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;
    private final io.flutter.embedding.engine.dart.DartMessenger dartMessenger;
    private final long engineId;
    private final io.flutter.embedding.engine.FlutterJNI flutterJNI;
    private boolean isApplicationRunning;
    private final io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler isolateChannelMessageHandler;
    private java.lang.String isolateServiceId;
    private io.flutter.embedding.engine.dart.DartExecutor.IsolateServiceIdListener isolateServiceIdListener;

    /* loaded from: classes15.dex */
    public static class DartCallback {
        public final android.content.res.AssetManager androidAssetManager;
        public final io.flutter.view.FlutterCallbackInformation callbackHandle;
        public final java.lang.String pathToBundle;

        public DartCallback(android.content.res.AssetManager assetManager, java.lang.String str, io.flutter.view.FlutterCallbackInformation flutterCallbackInformation) {
            this.androidAssetManager = assetManager;
            this.pathToBundle = str;
            this.callbackHandle = flutterCallbackInformation;
        }

        public java.lang.String toString() {
            return "DartCallback( bundle path: " + this.pathToBundle + ", library path: " + this.callbackHandle.callbackLibraryPath + ", function: " + this.callbackHandle.callbackName + " )";
        }
    }

    /* loaded from: classes15.dex */
    public static class DefaultBinaryMessenger implements io.flutter.plugin.common.BinaryMessenger {
        private final io.flutter.embedding.engine.dart.DartMessenger messenger;

        @Override // io.flutter.plugin.common.BinaryMessenger
        public void disableBufferingIncomingMessages() {
            this.messenger.disableBufferingIncomingMessages();
        }

        @Override // io.flutter.plugin.common.BinaryMessenger
        public void enableBufferingIncomingMessages() {
            this.messenger.enableBufferingIncomingMessages();
        }

        @Override // io.flutter.plugin.common.BinaryMessenger
        public io.flutter.plugin.common.BinaryMessenger.TaskQueue makeBackgroundTaskQueue(io.flutter.plugin.common.BinaryMessenger.TaskQueueOptions taskQueueOptions) {
            return this.messenger.makeBackgroundTaskQueue(taskQueueOptions);
        }

        @Override // io.flutter.plugin.common.BinaryMessenger
        public void send(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
            this.messenger.send(str, byteBuffer, null);
        }

        @Override // io.flutter.plugin.common.BinaryMessenger
        public void setMessageHandler(java.lang.String str, io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler binaryMessageHandler) {
            this.messenger.setMessageHandler(str, binaryMessageHandler);
        }

        private DefaultBinaryMessenger(io.flutter.embedding.engine.dart.DartMessenger dartMessenger) {
            this.messenger = dartMessenger;
        }

        @Override // io.flutter.plugin.common.BinaryMessenger
        public void send(java.lang.String str, java.nio.ByteBuffer byteBuffer, io.flutter.plugin.common.BinaryMessenger.BinaryReply binaryReply) {
            this.messenger.send(str, byteBuffer, binaryReply);
        }

        @Override // io.flutter.plugin.common.BinaryMessenger
        public void setMessageHandler(java.lang.String str, io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler binaryMessageHandler, io.flutter.plugin.common.BinaryMessenger.TaskQueue taskQueue) {
            this.messenger.setMessageHandler(str, binaryMessageHandler, taskQueue);
        }
    }

    /* loaded from: classes15.dex */
    public interface IsolateServiceIdListener {
        void onIsolateServiceIdAvailable(java.lang.String str);
    }

    public DartExecutor(io.flutter.embedding.engine.FlutterJNI flutterJNI, android.content.res.AssetManager assetManager) {
        this(flutterJNI, assetManager, 0L);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    @java.lang.Deprecated
    public void disableBufferingIncomingMessages() {
        this.dartMessenger.disableBufferingIncomingMessages();
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    @java.lang.Deprecated
    public void enableBufferingIncomingMessages() {
        this.dartMessenger.enableBufferingIncomingMessages();
    }

    public void executeDartCallback(io.flutter.embedding.engine.dart.DartExecutor.DartCallback dartCallback) {
        if (this.isApplicationRunning) {
            io.flutter.Log.w(TAG, "Attempted to run a DartExecutor that is already running.");
            return;
        }
        io.flutter.util.TraceSection scoped = io.flutter.util.TraceSection.scoped("DartExecutor#executeDartCallback");
        try {
            io.flutter.Log.v(TAG, "Executing Dart callback: " + dartCallback);
            io.flutter.embedding.engine.FlutterJNI flutterJNI = this.flutterJNI;
            java.lang.String str = dartCallback.pathToBundle;
            io.flutter.view.FlutterCallbackInformation flutterCallbackInformation = dartCallback.callbackHandle;
            flutterJNI.runBundleAndSnapshotFromLibrary(str, flutterCallbackInformation.callbackName, flutterCallbackInformation.callbackLibraryPath, dartCallback.androidAssetManager, null, this.engineId);
            this.isApplicationRunning = true;
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

    public void executeDartEntrypoint(io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint dartEntrypoint) {
        executeDartEntrypoint(dartEntrypoint, null);
    }

    public void executeDartEntrypointForce(io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint dartEntrypoint, java.util.List<java.lang.String> list) {
        io.flutter.util.TraceSection.begin("DartExecutor#executeDartEntrypointForce");
        io.flutter.Log.v(TAG, "Executing Dart entrypoint force: " + dartEntrypoint);
        try {
            this.flutterJNI.runBundleAndSnapshotFromLibrary(dartEntrypoint.pathToBundle, dartEntrypoint.dartEntrypointFunctionName, dartEntrypoint.dartEntrypointLibrary, this.assetManager, list, this.engineId);
            this.isApplicationRunning = true;
        } finally {
            io.flutter.util.TraceSection.end();
        }
    }

    public io.flutter.plugin.common.BinaryMessenger getBinaryMessenger() {
        return this.binaryMessenger;
    }

    public java.lang.String getIsolateServiceId() {
        return this.isolateServiceId;
    }

    public int getPendingChannelResponseCount() {
        return this.dartMessenger.getPendingChannelResponseCount();
    }

    public io.flutter.embedding.engine.SharedBinaryMessenger getSharedBinaryMessenger() {
        return this.dartMessenger;
    }

    public boolean isExecutingDart() {
        return this.isApplicationRunning;
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    @java.lang.Deprecated
    public io.flutter.plugin.common.BinaryMessenger.TaskQueue makeBackgroundTaskQueue(io.flutter.plugin.common.BinaryMessenger.TaskQueueOptions taskQueueOptions) {
        return this.binaryMessenger.makeBackgroundTaskQueue(taskQueueOptions);
    }

    public void notifyLowMemoryWarning() {
        if (this.flutterJNI.isAttached()) {
            this.flutterJNI.notifyLowMemoryWarning();
        }
    }

    public void onAttachedToJNI() {
        io.flutter.Log.v(TAG, "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            this.flutterJNI.setPlatformMessageHandler(this.dartMessenger);
        } else {
            this.flutterJNI.setPlatformMessageHandlerNotInMainThread(this.dartMessenger);
        }
    }

    public void onDetachFromJNINotInMainThread() {
        io.flutter.Log.v(TAG, "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.flutterJNI.setPlatformMessageHandlerNotInMainThread(null);
    }

    public void onDetachedFromJNI() {
        io.flutter.Log.v(TAG, "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.flutterJNI.setPlatformMessageHandler(null);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    @java.lang.Deprecated
    public void send(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
        this.binaryMessenger.send(str, byteBuffer);
    }

    public void setIsolateServiceIdListener(io.flutter.embedding.engine.dart.DartExecutor.IsolateServiceIdListener isolateServiceIdListener) {
        java.lang.String str;
        this.isolateServiceIdListener = isolateServiceIdListener;
        if (isolateServiceIdListener == null || (str = this.isolateServiceId) == null) {
            return;
        }
        isolateServiceIdListener.onIsolateServiceIdAvailable(str);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    @java.lang.Deprecated
    public void setMessageHandler(java.lang.String str, io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler binaryMessageHandler) {
        this.binaryMessenger.setMessageHandler(str, binaryMessageHandler);
    }

    public void setSharedBinaryMessenger(io.flutter.embedding.engine.SharedBinaryMessenger sharedBinaryMessenger) {
        this.dartMessenger.setSharedBinaryMessenger(sharedBinaryMessenger);
    }

    public DartExecutor(io.flutter.embedding.engine.FlutterJNI flutterJNI, android.content.res.AssetManager assetManager, long j17) {
        this.isApplicationRunning = false;
        io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler binaryMessageHandler = new io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler() { // from class: io.flutter.embedding.engine.dart.DartExecutor.1
            @Override // io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler
            public void onMessage(java.nio.ByteBuffer byteBuffer, io.flutter.plugin.common.BinaryMessenger.BinaryReply binaryReply) {
                io.flutter.embedding.engine.dart.DartExecutor.this.isolateServiceId = io.flutter.plugin.common.StringCodec.INSTANCE.decodeMessage(byteBuffer);
                if (io.flutter.embedding.engine.dart.DartExecutor.this.isolateServiceIdListener != null) {
                    io.flutter.embedding.engine.dart.DartExecutor.this.isolateServiceIdListener.onIsolateServiceIdAvailable(io.flutter.embedding.engine.dart.DartExecutor.this.isolateServiceId);
                }
            }
        };
        this.isolateChannelMessageHandler = binaryMessageHandler;
        this.flutterJNI = flutterJNI;
        this.assetManager = assetManager;
        this.engineId = j17;
        io.flutter.embedding.engine.dart.DartMessenger dartMessenger = new io.flutter.embedding.engine.dart.DartMessenger(flutterJNI);
        this.dartMessenger = dartMessenger;
        dartMessenger.setMessageHandler("flutter/isolate", binaryMessageHandler);
        this.binaryMessenger = new io.flutter.embedding.engine.dart.DartExecutor.DefaultBinaryMessenger(dartMessenger);
        if (flutterJNI.isAttached()) {
            this.isApplicationRunning = true;
        }
    }

    public void executeDartEntrypoint(io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint dartEntrypoint, java.util.List<java.lang.String> list) {
        if (this.isApplicationRunning) {
            io.flutter.Log.w(TAG, "Attempted to run a DartExecutor that is already running.");
            return;
        }
        this.flutterJNI.recordStartupTiming("java_execute_dart_entrypoint_start");
        io.flutter.util.TraceSection scoped = io.flutter.util.TraceSection.scoped("DartExecutor#executeDartEntrypoint");
        try {
            io.flutter.Log.v(TAG, "Executing Dart entrypoint: " + dartEntrypoint);
            this.flutterJNI.runBundleAndSnapshotFromLibrary(dartEntrypoint.pathToBundle, dartEntrypoint.dartEntrypointFunctionName, dartEntrypoint.dartEntrypointLibrary, this.assetManager, list, this.engineId);
            this.isApplicationRunning = true;
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

    @Override // io.flutter.plugin.common.BinaryMessenger
    @java.lang.Deprecated
    public void send(java.lang.String str, java.nio.ByteBuffer byteBuffer, io.flutter.plugin.common.BinaryMessenger.BinaryReply binaryReply) {
        this.binaryMessenger.send(str, byteBuffer, binaryReply);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    @java.lang.Deprecated
    public void setMessageHandler(java.lang.String str, io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler binaryMessageHandler, io.flutter.plugin.common.BinaryMessenger.TaskQueue taskQueue) {
        this.binaryMessenger.setMessageHandler(str, binaryMessageHandler, taskQueue);
    }

    /* loaded from: classes11.dex */
    public static class DartEntrypoint {
        public final java.lang.String dartEntrypointFunctionName;
        public final java.lang.String dartEntrypointLibrary;
        public final java.lang.String pathToBundle;

        public DartEntrypoint(java.lang.String str, java.lang.String str2) {
            this.pathToBundle = str;
            this.dartEntrypointLibrary = null;
            this.dartEntrypointFunctionName = str2;
        }

        public static io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint createDefault() {
            io.flutter.embedding.engine.loader.FlutterLoader flutterLoader = io.flutter.FlutterInjector.instance().flutterLoader();
            if (flutterLoader.initialized()) {
                return new io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint(flutterLoader.findAppBundlePath(), com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM);
            }
            throw new java.lang.AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint dartEntrypoint = (io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint) obj;
            if (this.pathToBundle.equals(dartEntrypoint.pathToBundle)) {
                return this.dartEntrypointFunctionName.equals(dartEntrypoint.dartEntrypointFunctionName);
            }
            return false;
        }

        public int hashCode() {
            return (this.pathToBundle.hashCode() * 31) + this.dartEntrypointFunctionName.hashCode();
        }

        public java.lang.String toString() {
            return "DartEntrypoint( bundle path: " + this.pathToBundle + ", function: " + this.dartEntrypointFunctionName + " )";
        }

        public DartEntrypoint(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.pathToBundle = str;
            this.dartEntrypointLibrary = str2;
            this.dartEntrypointFunctionName = str3;
        }
    }
}
