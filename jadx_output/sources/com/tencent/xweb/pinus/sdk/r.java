package com.tencent.xweb.pinus.sdk;

/* loaded from: classes13.dex */
public class r implements com.tencent.xweb.pinus.sdk.q {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f220465a;

    /* renamed from: b, reason: collision with root package name */
    public by5.i0 f220466b;

    /* renamed from: c, reason: collision with root package name */
    public by5.i0 f220467c;

    public r(java.lang.Object obj) {
        this.f220465a = obj;
    }

    public void a() {
        by5.i0 i0Var;
        try {
            synchronized (this) {
                i0Var = this.f220467c;
                if (i0Var == null) {
                    i0Var = new by5.i0(this.f220465a, "cancel", new java.lang.Class[0]);
                    this.f220467c = i0Var;
                }
            }
            i0Var.b(new java.lang.Object[0]);
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }
}
