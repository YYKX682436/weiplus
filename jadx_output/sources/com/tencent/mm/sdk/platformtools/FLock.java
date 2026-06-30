package com.tencent.mm.sdk.platformtools;

/* loaded from: classes11.dex */
public class FLock {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.vfs.r6 f192411a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f192412b;

    static {
        try {
            java.util.Set set = fp.d0.f265166a;
            fp.b0.f265163a.b("wechatcommon");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FLock", th6, "fail to load so.", new java.lang.Object[0]);
        }
    }

    public FLock(java.lang.String str, boolean z17) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        this.f192411a = null;
        this.f192412b = -1;
        if (r6Var.m()) {
            if (!r6Var.A()) {
                throw new java.lang.IllegalArgumentException("target is not a file.");
            }
        } else {
            if (!z17) {
                throw new java.lang.IllegalArgumentException("target is not exists or create failed.");
            }
            try {
                r6Var.k();
            } catch (java.io.IOException e17) {
                throw new java.lang.IllegalStateException(e17);
            }
        }
        this.f192411a = r6Var;
    }

    private static native void nativeFree(int i17);

    private static native int nativeInit(java.lang.String str);

    private static native int nativeLockRead(int i17, boolean z17);

    private static native int nativeLockWrite(int i17, boolean z17);

    private static native int nativeUnlock(int i17);

    public final synchronized int a() {
        if (!this.f192411a.m()) {
            try {
                this.f192411a.k();
            } catch (java.io.IOException unused) {
            }
            this.f192412b = -1;
        }
        if (this.f192412b == -1) {
            this.f192412b = nativeInit(this.f192411a.o());
        }
        return this.f192412b;
    }

    public synchronized void b() {
        int a17 = a();
        while (true) {
            int nativeLockRead = nativeLockRead(a17, true);
            if (nativeLockRead != 4) {
                if (nativeLockRead == 9) {
                    throw new java.lang.IllegalStateException("bad file descriptor.");
                }
                if (nativeLockRead != 11) {
                    if (nativeLockRead == 22) {
                        throw new java.lang.IllegalStateException("bad operation.");
                    }
                    if (nativeLockRead == 46) {
                        throw new java.lang.IllegalStateException("kernel lock spaces ran out.");
                    }
                }
            }
            try {
                java.lang.Thread.sleep(0L);
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }

    public synchronized void c() {
        int a17 = a();
        while (true) {
            int nativeLockWrite = nativeLockWrite(a17, true);
            if (nativeLockWrite != 4) {
                if (nativeLockWrite == 9) {
                    throw new java.lang.IllegalStateException("bad file descriptor.");
                }
                if (nativeLockWrite != 11) {
                    if (nativeLockWrite == 22) {
                        throw new java.lang.IllegalStateException("bad operation.");
                    }
                    if (nativeLockWrite == 46) {
                        throw new java.lang.IllegalStateException("kernel lock spaces ran out.");
                    }
                }
            }
            try {
                java.lang.Thread.sleep(0L);
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }

    public synchronized boolean d() {
        int nativeLockWrite;
        int a17 = a();
        while (true) {
            nativeLockWrite = nativeLockWrite(a17, false);
            if (nativeLockWrite != 4) {
                break;
            }
            try {
                java.lang.Thread.sleep(0L);
            } catch (java.lang.InterruptedException unused) {
            }
        }
        if (nativeLockWrite == 9) {
            throw new java.lang.IllegalStateException("bad file descriptor.");
        }
        if (nativeLockWrite == 11) {
            return false;
        }
        if (nativeLockWrite == 22) {
            throw new java.lang.IllegalStateException("bad operation.");
        }
        if (nativeLockWrite != 46) {
            return true;
        }
        throw new java.lang.IllegalStateException("kernel lock spaces ran out.");
    }

    public synchronized void e() {
        if (this.f192412b == -1) {
            return;
        }
        try {
            int nativeUnlock = nativeUnlock(this.f192412b);
            if (nativeUnlock == 0) {
                synchronized (this) {
                    if (this.f192412b != -1) {
                        nativeFree(this.f192412b);
                        this.f192412b = -1;
                    }
                }
                return;
            }
            if (nativeUnlock == 9) {
                throw new java.lang.IllegalArgumentException(this.f192412b + " is not a valid fd.");
            }
            if (nativeUnlock == 22) {
                throw new java.lang.IllegalStateException("bad operation.");
            }
            throw new java.lang.IllegalStateException("other err: " + nativeUnlock);
        } catch (java.lang.Throwable th6) {
            synchronized (this) {
                if (this.f192412b != -1) {
                    nativeFree(this.f192412b);
                    this.f192412b = -1;
                }
                throw th6;
            }
        }
    }

    public void finalize() {
        super.finalize();
        e();
    }
}
