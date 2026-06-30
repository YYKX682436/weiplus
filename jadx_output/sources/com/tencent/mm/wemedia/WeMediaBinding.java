package com.tencent.mm.wemedia;

/* loaded from: classes7.dex */
public class WeMediaBinding {
    private static final java.lang.String TAG = "hi.WeMediaBinding";
    private android.content.Context mContext;
    private volatile long mNativeInst = 0;

    static {
        if (kq5.c.f311286a) {
            return;
        }
        kq5.g.a("hi.LoadDelegate", "loadLibraries start", new java.lang.Object[0]);
        kq5.c.f311287b.loadLibrary("c++_shared");
        kq5.c.f311287b.loadLibrary("wxVcodec1");
        kq5.c.f311287b.loadLibrary("xffmpeg");
        kq5.c.f311287b.loadLibrary("mmmedia");
        kq5.c.f311287b.loadLibrary("wemedia");
        kq5.g.a("hi.LoadDelegate", "loadLibraries end", new java.lang.Object[0]);
        kq5.c.f311286a = true;
    }

    public WeMediaBinding(android.content.Context context) {
        this.mContext = context;
        kq5.g.a(TAG, "construct", new java.lang.Object[0]);
    }

    private native long nativeCreate(long j17, long j18, long j19, java.lang.String str, com.tencent.mm.wemedia.WeMediaCallback weMediaCallback);

    private native void nativeDestroy(long j17);

    private native void nativeOnBackground(long j17);

    private native void nativeOnForeground(long j17);

    private native void nativeOnSuspend(long j17);

    private native void nativeSetLoglvl(long j17, int i17);

    public void finalize() {
        kq5.g.a(TAG, "finalize", new java.lang.Object[0]);
        uint();
    }

    public synchronized boolean init(long j17, long j18, long j19, java.lang.String str, com.tencent.mm.wemedia.WeMediaCallback weMediaCallback) {
        kq5.g.a(TAG, "init, isolate_ptr: " + j17 + ", context_ptr: " + j18 + ", uvloop_ptr: " + j19, new java.lang.Object[0]);
        try {
            try {
                try {
                    if (this.mNativeInst != 0) {
                        kq5.g.f311288a.e(TAG, "already init", new java.lang.Object[0]);
                        kq5.g.a(TAG, "init, mNativeInst: " + this.mNativeInst, new java.lang.Object[0]);
                        return this.mNativeInst > 0;
                    }
                    this.mNativeInst = nativeCreate(j17, j18, j19, str, weMediaCallback);
                    kq5.g.a(TAG, "init, mNativeInst: " + this.mNativeInst, new java.lang.Object[0]);
                    return this.mNativeInst > 0;
                } catch (java.lang.Exception e17) {
                    kq5.g.b(TAG, e17, "init Exception", new java.lang.Object[0]);
                    kq5.g.a(TAG, "init, mNativeInst: " + this.mNativeInst, new java.lang.Object[0]);
                    return this.mNativeInst > 0;
                }
            } catch (java.lang.UnsatisfiedLinkError e18) {
                kq5.g.b(TAG, e18, "init UnsatisfiedLinkError", new java.lang.Object[0]);
                kq5.g.a(TAG, "init, mNativeInst: " + this.mNativeInst, new java.lang.Object[0]);
                return this.mNativeInst > 0;
            }
        } catch (java.lang.Throwable unused) {
            kq5.g.a(TAG, "init, mNativeInst: " + this.mNativeInst, new java.lang.Object[0]);
            return this.mNativeInst > 0;
        }
    }

    public synchronized void onBackground() {
        kq5.g.a(TAG, "onBackground, mNativeInst: " + this.mNativeInst, new java.lang.Object[0]);
        try {
            try {
            } catch (java.lang.UnsatisfiedLinkError e17) {
                kq5.g.b(TAG, e17, "onBackground UnsatisfiedLinkError", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception e18) {
            kq5.g.b(TAG, e18, "onBackground Exception", new java.lang.Object[0]);
        }
        if (this.mNativeInst == 0) {
            return;
        }
        nativeOnBackground(this.mNativeInst);
    }

    public synchronized void onForeground() {
        kq5.g.a(TAG, "onForeground, mNativeInst: " + this.mNativeInst, new java.lang.Object[0]);
        try {
            try {
            } catch (java.lang.UnsatisfiedLinkError e17) {
                kq5.g.b(TAG, e17, "onForeground UnsatisfiedLinkError", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception e18) {
            kq5.g.b(TAG, e18, "onForeground Exception", new java.lang.Object[0]);
        }
        if (this.mNativeInst == 0) {
            return;
        }
        nativeOnForeground(this.mNativeInst);
    }

    public synchronized void onSuspend() {
        kq5.g.a(TAG, "onSuspend, mNativeInst: " + this.mNativeInst, new java.lang.Object[0]);
        try {
            try {
            } catch (java.lang.UnsatisfiedLinkError e17) {
                kq5.g.b(TAG, e17, "onSuspend UnsatisfiedLinkError", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception e18) {
            kq5.g.b(TAG, e18, "onSuspend Exception", new java.lang.Object[0]);
        }
        if (this.mNativeInst == 0) {
            return;
        }
        nativeOnSuspend(this.mNativeInst);
    }

    public synchronized void setLoglvl(int i17) {
        kq5.g.a(TAG, "setLoglvl, mNativeInst: " + this.mNativeInst + ", loglvl: " + i17, new java.lang.Object[0]);
        try {
        } catch (java.lang.Exception e17) {
            kq5.g.b(TAG, e17, "setLoglvl Exception", new java.lang.Object[0]);
        } catch (java.lang.UnsatisfiedLinkError e18) {
            kq5.g.b(TAG, e18, "setLoglvl UnsatisfiedLinkError", new java.lang.Object[0]);
        }
        if (this.mNativeInst == 0) {
            return;
        }
        nativeSetLoglvl(this.mNativeInst, i17);
    }

    public synchronized void uint() {
        kq5.g.a(TAG, "uint, mNativeInst: " + this.mNativeInst, new java.lang.Object[0]);
        try {
            try {
                if (this.mNativeInst != 0) {
                    nativeDestroy(this.mNativeInst);
                    this.mNativeInst = 0L;
                }
            } catch (java.lang.UnsatisfiedLinkError e17) {
                kq5.g.b(TAG, e17, "uint UnsatisfiedLinkError", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception e18) {
            kq5.g.b(TAG, e18, "uint Exception", new java.lang.Object[0]);
        }
    }
}
