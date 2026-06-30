package io.flutter.util;

/* loaded from: classes15.dex */
public class ImmediateExecutor implements java.util.concurrent.Executor {
    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        runnable.run();
    }
}
