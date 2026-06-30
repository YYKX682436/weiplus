package com.tencent.xweb.pinus.sdk;

/* loaded from: classes13.dex */
public class j implements com.tencent.xweb.pinus.sdk.i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f220445a;

    /* renamed from: b, reason: collision with root package name */
    public by5.i0 f220446b;

    /* renamed from: c, reason: collision with root package name */
    public by5.i0 f220447c;

    /* renamed from: d, reason: collision with root package name */
    public by5.i0 f220448d;

    public j(java.lang.Object obj) {
        this.f220445a = obj;
    }

    public void a() {
        by5.i0 i0Var;
        try {
            synchronized (this) {
                i0Var = this.f220446b;
                if (i0Var == null) {
                    i0Var = new by5.i0(this.f220445a, "cancel", new java.lang.Class[0]);
                    this.f220446b = i0Var;
                }
            }
            i0Var.b(new java.lang.Object[0]);
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    public void b() {
        by5.i0 i0Var;
        try {
            synchronized (this) {
                i0Var = this.f220447c;
                if (i0Var == null) {
                    i0Var = new by5.i0(this.f220445a, "confirm", new java.lang.Class[0]);
                    this.f220447c = i0Var;
                }
            }
            i0Var.b(new java.lang.Object[0]);
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }
}
