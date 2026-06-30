package com.tencent.xweb.pinus.sdk;

/* loaded from: classes13.dex */
public class h implements com.tencent.xweb.pinus.sdk.g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f220443a;

    /* renamed from: b, reason: collision with root package name */
    public by5.i0 f220444b;

    public h(java.lang.Object obj) {
        this.f220443a = obj;
    }

    public void a() {
        by5.i0 i0Var;
        try {
            synchronized (this) {
                i0Var = this.f220444b;
                if (i0Var == null) {
                    i0Var = new by5.i0(this.f220443a, "cancel", new java.lang.Class[0]);
                    this.f220444b = i0Var;
                }
            }
            i0Var.b(new java.lang.Object[0]);
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }
}
