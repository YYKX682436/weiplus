package com.tencent.xweb.pinus.sdk;

/* loaded from: classes13.dex */
public class z implements com.tencent.xweb.pinus.sdk.y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f220501a;

    /* renamed from: b, reason: collision with root package name */
    public by5.i0 f220502b;

    /* renamed from: c, reason: collision with root package name */
    public by5.i0 f220503c;

    public z(java.lang.Object obj) {
        this.f220501a = obj;
    }

    @Override // com.tencent.xweb.pinus.sdk.y
    public void a() {
        by5.i0 i0Var;
        try {
            synchronized (this) {
                i0Var = this.f220503c;
                if (i0Var == null) {
                    i0Var = new by5.i0(this.f220501a, "deleteAllData", new java.lang.Class[0]);
                    this.f220503c = i0Var;
                }
            }
            i0Var.b(new java.lang.Object[0]);
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.y
    public void b(java.lang.String str) {
        by5.i0 i0Var;
        try {
            synchronized (this) {
                i0Var = this.f220502b;
                if (i0Var == null) {
                    i0Var = new by5.i0(this.f220501a, "deleteOrigin", java.lang.String.class);
                    this.f220502b = i0Var;
                }
            }
            i0Var.b(str);
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }
}
