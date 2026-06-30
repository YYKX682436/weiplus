package io.flutter.embedding.engine.dart;

/* loaded from: classes12.dex */
public class PlatformTaskQueue implements io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue {
    private final android.os.Handler handler = io.flutter.util.HandlerCompat.createAsyncHandler(android.os.Looper.getMainLooper());

    @Override // io.flutter.embedding.engine.dart.DartMessenger.DartMessengerTaskQueue
    public void dispatch(java.lang.Runnable runnable) {
        this.handler.post(runnable);
    }
}
