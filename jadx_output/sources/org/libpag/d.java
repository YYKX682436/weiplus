package org.libpag;

/* loaded from: classes13.dex */
class d extends android.os.Handler {

    /* loaded from: classes13.dex */
    public static final class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final org.libpag.d.b f347831a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f347832b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f347833c = false;

        public a(org.libpag.d.b bVar) {
            this.f347831a = bVar;
        }

        public boolean a(android.os.Handler handler, long j17) {
            if (!handler.post(this)) {
                return false;
            }
            synchronized (this) {
                if (j17 > 0) {
                    long uptimeMillis = android.os.SystemClock.uptimeMillis() + j17;
                    while (!this.f347832b) {
                        long uptimeMillis2 = uptimeMillis - android.os.SystemClock.uptimeMillis();
                        if (uptimeMillis2 <= 0) {
                            this.f347833c = true;
                            return false;
                        }
                        try {
                            wait(uptimeMillis2);
                        } catch (java.lang.InterruptedException unused) {
                        }
                    }
                } else {
                    while (!this.f347832b) {
                        try {
                            wait();
                        } catch (java.lang.InterruptedException unused2) {
                        }
                    }
                }
                return true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f347831a.run();
                synchronized (this) {
                    this.f347832b = true;
                    notifyAll();
                    this.f347831a.a(this.f347833c);
                }
            } catch (java.lang.Throwable th6) {
                synchronized (this) {
                    this.f347832b = true;
                    notifyAll();
                    this.f347831a.a(this.f347833c);
                    throw th6;
                }
            }
        }
    }

    /* loaded from: classes13.dex */
    public interface b extends java.lang.Runnable {
        void a(boolean z17);
    }

    public d(android.os.Looper looper) {
        super(looper);
    }

    public final boolean a(org.libpag.d.b bVar, long j17) {
        if (bVar == null) {
            throw new java.lang.IllegalArgumentException("runnable must not be null");
        }
        if (j17 < 0) {
            throw new java.lang.IllegalArgumentException("timeout must be non-negative");
        }
        if (android.os.Looper.myLooper() != getLooper()) {
            return new org.libpag.d.a(bVar).a(this, j17);
        }
        bVar.run();
        return true;
    }
}
