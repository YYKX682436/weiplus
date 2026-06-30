package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes15.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.tmsqmsp.oaid2.y f215555a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.tmsqmsp.oaid2.a0 f215556b;

    public b0(com.tencent.tmsqmsp.oaid2.y yVar, com.tencent.tmsqmsp.oaid2.a0 a0Var) {
        this.f215555a = yVar;
        this.f215556b = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.tmsqmsp.oaid2.a0 a0Var;
        if (this.f215555a == null) {
            return;
        }
        int i17 = 0;
        boolean z17 = false;
        do {
            try {
                java.util.concurrent.TimeUnit.MICROSECONDS.sleep(10L);
                z17 = this.f215555a.c();
                i17++;
                if (z17) {
                    break;
                }
            } catch (java.lang.Exception unused) {
            }
        } while (i17 < 30);
        if (!z17 || (a0Var = this.f215556b) == null) {
            return;
        }
        a0Var.a(true);
    }
}
