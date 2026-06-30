package org.chromium.base;

/* loaded from: classes16.dex */
public final class CallbackController {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private java.util.ArrayList<java.lang.ref.WeakReference<org.chromium.base.CallbackController.Cancelable>> mCancelables = new java.util.ArrayList<>();
    private final java.util.concurrent.locks.ReentrantLock mReentrantLock = new java.util.concurrent.locks.ReentrantLock(true);

    /* loaded from: classes16.dex */
    public static class AutoCloseableLock implements java.lang.AutoCloseable {
        private boolean mIsLocked;
        private final java.util.concurrent.locks.Lock mLock;

        private AutoCloseableLock(java.util.concurrent.locks.Lock lock, boolean z17) {
            this.mLock = lock;
            this.mIsLocked = z17;
        }

        public static org.chromium.base.CallbackController.AutoCloseableLock lock(java.util.concurrent.locks.Lock lock) {
            lock.lock();
            return new org.chromium.base.CallbackController.AutoCloseableLock(lock, true);
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            if (!this.mIsLocked) {
                throw new java.lang.IllegalStateException("mLock isn't locked.");
            }
            this.mIsLocked = false;
            this.mLock.unlock();
        }
    }

    /* loaded from: classes16.dex */
    public interface Cancelable {
        void cancel();
    }

    /* loaded from: classes16.dex */
    public class CancelableCallback<T> implements org.chromium.base.CallbackController.Cancelable, org.chromium.base.Callback<T> {
        private org.chromium.base.Callback<T> mCallback;

        @Override // org.chromium.base.CallbackController.Cancelable
        public void cancel() {
            this.mCallback = null;
        }

        @Override // org.chromium.base.Callback
        /* renamed from: onResult */
        public void lambda$bind$0(T t17) {
            org.chromium.base.CallbackController.AutoCloseableLock lock = org.chromium.base.CallbackController.AutoCloseableLock.lock(org.chromium.base.CallbackController.this.mReentrantLock);
            try {
                org.chromium.base.Callback<T> callback = this.mCallback;
                if (callback != null) {
                    callback.lambda$bind$0(t17);
                }
                if (lock != null) {
                    lock.close();
                }
            } catch (java.lang.Throwable th6) {
                if (lock != null) {
                    try {
                        lock.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }

        private CancelableCallback(org.chromium.base.Callback<T> callback) {
            this.mCallback = callback;
        }
    }

    /* loaded from: classes16.dex */
    public class CancelableRunnable implements org.chromium.base.CallbackController.Cancelable, java.lang.Runnable {
        private java.lang.Runnable mRunnable;

        @Override // org.chromium.base.CallbackController.Cancelable
        public void cancel() {
            this.mRunnable = null;
        }

        @Override // java.lang.Runnable
        public void run() {
            org.chromium.base.CallbackController.AutoCloseableLock lock = org.chromium.base.CallbackController.AutoCloseableLock.lock(org.chromium.base.CallbackController.this.mReentrantLock);
            try {
                java.lang.Runnable runnable = this.mRunnable;
                if (runnable != null) {
                    runnable.run();
                }
                if (lock != null) {
                    lock.close();
                }
            } catch (java.lang.Throwable th6) {
                if (lock != null) {
                    try {
                        lock.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }

        private CancelableRunnable(java.lang.Runnable runnable) {
            this.mRunnable = runnable;
        }
    }

    private void checkNotCanceled() {
        if (this.mCancelables == null) {
            throw new java.lang.IllegalStateException("This CallbackController has already been destroyed.");
        }
    }

    public void destroy() {
        org.chromium.base.CallbackController.AutoCloseableLock lock = org.chromium.base.CallbackController.AutoCloseableLock.lock(this.mReentrantLock);
        try {
            checkNotCanceled();
            java.util.Iterator it = org.chromium.base.CollectionUtil.strengthen(this.mCancelables).iterator();
            while (it.hasNext()) {
                ((org.chromium.base.CallbackController.Cancelable) it.next()).cancel();
            }
            this.mCancelables = null;
            if (lock != null) {
                lock.close();
            }
        } catch (java.lang.Throwable th6) {
            if (lock != null) {
                try {
                    lock.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public <T> org.chromium.base.Callback<T> makeCancelable(org.chromium.base.Callback<T> callback) {
        org.chromium.base.CallbackController.AutoCloseableLock lock = org.chromium.base.CallbackController.AutoCloseableLock.lock(this.mReentrantLock);
        try {
            checkNotCanceled();
            org.chromium.base.CallbackController.CancelableCallback cancelableCallback = new org.chromium.base.CallbackController.CancelableCallback(callback);
            this.mCancelables.add(new java.lang.ref.WeakReference<>(cancelableCallback));
            if (lock != null) {
                lock.close();
            }
            return cancelableCallback;
        } catch (java.lang.Throwable th6) {
            if (lock != null) {
                try {
                    lock.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public java.lang.Runnable makeCancelable(java.lang.Runnable runnable) {
        org.chromium.base.CallbackController.AutoCloseableLock lock = org.chromium.base.CallbackController.AutoCloseableLock.lock(this.mReentrantLock);
        try {
            checkNotCanceled();
            org.chromium.base.CallbackController.CancelableRunnable cancelableRunnable = new org.chromium.base.CallbackController.CancelableRunnable(runnable);
            this.mCancelables.add(new java.lang.ref.WeakReference<>(cancelableRunnable));
            if (lock != null) {
                lock.close();
            }
            return cancelableRunnable;
        } catch (java.lang.Throwable th6) {
            if (lock != null) {
                try {
                    lock.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }
}
