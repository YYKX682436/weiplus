package org.webrtc;

/* loaded from: classes15.dex */
public class ThreadUtils {

    /* renamed from: org.webrtc.ThreadUtils$1CaughtException, reason: invalid class name */
    /* loaded from: classes15.dex */
    public class C1CaughtException {

        /* renamed from: e, reason: collision with root package name */
        java.lang.Exception f347948e;
    }

    /* renamed from: org.webrtc.ThreadUtils$1Result, reason: invalid class name */
    /* loaded from: classes15.dex */
    public class C1Result {
        public V value;
    }

    /* loaded from: classes15.dex */
    public interface BlockingOperation {
        void run();
    }

    /* loaded from: classes14.dex */
    public static class ThreadChecker {
        private java.lang.Thread thread = java.lang.Thread.currentThread();

        public void checkIsOnValidThread() {
            if (this.thread == null) {
                this.thread = java.lang.Thread.currentThread();
            }
            if (java.lang.Thread.currentThread() != this.thread) {
                throw new java.lang.IllegalStateException("Wrong thread");
            }
        }

        public void detachThread() {
            this.thread = null;
        }
    }

    public static void awaitUninterruptibly(final java.util.concurrent.CountDownLatch countDownLatch) {
        executeUninterruptibly(new org.webrtc.ThreadUtils.BlockingOperation() { // from class: org.webrtc.ThreadUtils.2
            @Override // org.webrtc.ThreadUtils.BlockingOperation
            public void run() {
                countDownLatch.await();
            }
        });
    }

    public static void checkIsOnMainThread() {
        if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
            throw new java.lang.IllegalStateException("Not on main thread!");
        }
    }

    public static java.lang.StackTraceElement[] concatStackTraces(java.lang.StackTraceElement[] stackTraceElementArr, java.lang.StackTraceElement[] stackTraceElementArr2) {
        java.lang.StackTraceElement[] stackTraceElementArr3 = new java.lang.StackTraceElement[stackTraceElementArr.length + stackTraceElementArr2.length];
        java.lang.System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr3, 0, stackTraceElementArr.length);
        java.lang.System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, stackTraceElementArr.length, stackTraceElementArr2.length);
        return stackTraceElementArr3;
    }

    public static void executeUninterruptibly(org.webrtc.ThreadUtils.BlockingOperation blockingOperation) {
        boolean z17 = false;
        while (true) {
            try {
                blockingOperation.run();
                break;
            } catch (java.lang.InterruptedException unused) {
                z17 = true;
            }
        }
        if (z17) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public static <V> V invokeAtFrontUninterruptibly(android.os.Handler handler, final java.util.concurrent.Callable<V> callable) {
        if (handler.getLooper().getThread() == java.lang.Thread.currentThread()) {
            try {
                return callable.call();
            } catch (java.lang.Exception e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
        final org.webrtc.ThreadUtils.C1Result c1Result = new org.webrtc.ThreadUtils.C1Result();
        final org.webrtc.ThreadUtils.C1CaughtException c1CaughtException = new org.webrtc.ThreadUtils.C1CaughtException();
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        handler.post(new java.lang.Runnable() { // from class: org.webrtc.ThreadUtils.3
            /* JADX WARN: Type inference failed for: r1v2, types: [V, java.lang.Object] */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    org.webrtc.ThreadUtils.C1Result.this.value = callable.call();
                } catch (java.lang.Exception e18) {
                    c1CaughtException.f347948e = e18;
                }
                countDownLatch.countDown();
            }
        });
        awaitUninterruptibly(countDownLatch);
        if (c1CaughtException.f347948e == null) {
            return c1Result.value;
        }
        java.lang.RuntimeException runtimeException = new java.lang.RuntimeException(c1CaughtException.f347948e);
        runtimeException.setStackTrace(concatStackTraces(c1CaughtException.f347948e.getStackTrace(), runtimeException.getStackTrace()));
        throw runtimeException;
    }

    public static boolean joinUninterruptibly(java.lang.Thread thread, long j17) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        boolean z17 = false;
        long j18 = j17;
        while (j18 > 0) {
            try {
                thread.join(j18);
                break;
            } catch (java.lang.InterruptedException unused) {
                j18 = j17 - (android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
                z17 = true;
            }
        }
        if (z17) {
            java.lang.Thread.currentThread().interrupt();
        }
        return !thread.isAlive();
    }

    public static boolean awaitUninterruptibly(java.util.concurrent.CountDownLatch countDownLatch, long j17) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        boolean z17 = false;
        long j18 = j17;
        boolean z18 = false;
        while (true) {
            try {
                z17 = countDownLatch.await(j18, java.util.concurrent.TimeUnit.MILLISECONDS);
                break;
            } catch (java.lang.InterruptedException unused) {
                j18 = j17 - (android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
                if (j18 <= 0) {
                    z18 = true;
                    break;
                }
                z18 = true;
            }
        }
        if (z18) {
            java.lang.Thread.currentThread().interrupt();
        }
        return z17;
    }

    public static void joinUninterruptibly(final java.lang.Thread thread) {
        executeUninterruptibly(new org.webrtc.ThreadUtils.BlockingOperation() { // from class: org.webrtc.ThreadUtils.1
            @Override // org.webrtc.ThreadUtils.BlockingOperation
            public void run() {
                thread.join();
            }
        });
    }

    public static void invokeAtFrontUninterruptibly(android.os.Handler handler, final java.lang.Runnable runnable) {
        invokeAtFrontUninterruptibly(handler, new java.util.concurrent.Callable<java.lang.Void>() { // from class: org.webrtc.ThreadUtils.4
            @Override // java.util.concurrent.Callable
            public java.lang.Void call() {
                runnable.run();
                return null;
            }
        });
    }
}
