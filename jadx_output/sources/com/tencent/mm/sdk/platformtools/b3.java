package com.tencent.mm.sdk.platformtools;

/* loaded from: classes10.dex */
public class b3 {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f192472a;

    public b3() {
        this.f192472a = false;
    }

    public boolean a(long j17) {
        boolean z17;
        if (j17 == 0) {
            synchronized (this) {
                while (!this.f192472a) {
                    try {
                        wait();
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
            }
            return true;
        }
        synchronized (this) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j18 = j17 + currentTimeMillis;
            while (!this.f192472a && currentTimeMillis < j18) {
                try {
                    wait(j18 - currentTimeMillis);
                } catch (java.lang.InterruptedException unused2) {
                }
                currentTimeMillis = java.lang.System.currentTimeMillis();
            }
            z17 = this.f192472a;
        }
        return z17;
    }

    public void b() {
        synchronized (this) {
            this.f192472a = false;
        }
    }

    public void c() {
        synchronized (this) {
            boolean z17 = this.f192472a;
            this.f192472a = true;
            if (!z17) {
                notifyAll();
            }
        }
    }

    public java.lang.String toString() {
        return "MMConditionVariable[" + hashCode() + "," + this.f192472a + "]";
    }

    public b3(boolean z17) {
        this.f192472a = z17;
    }
}
