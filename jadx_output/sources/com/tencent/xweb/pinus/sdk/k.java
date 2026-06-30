package com.tencent.xweb.pinus.sdk;

/* loaded from: classes13.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f220449a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f220450b;

    /* renamed from: c, reason: collision with root package name */
    public by5.i0 f220451c;

    /* renamed from: d, reason: collision with root package name */
    public by5.i0 f220452d;

    /* renamed from: e, reason: collision with root package name */
    public by5.i0 f220453e;

    public k(java.lang.Object obj) {
        com.tencent.xweb.pinus.PSCoreWrapper pSCoreWrapper = com.tencent.xweb.pinus.PSCoreWrapper.getInstance();
        if (pSCoreWrapper == null) {
            return;
        }
        if (pSCoreWrapper.getBridgeClass("Profile").isInstance(obj)) {
            this.f220449a = obj;
        } else {
            by5.c4.c("Profile", "Object must be an instance of Profile");
        }
    }

    public final java.lang.String a() {
        by5.i0 i0Var;
        java.lang.String str = this.f220450b;
        if (str == null || str.isEmpty()) {
            java.lang.String str2 = "";
            try {
                synchronized (this) {
                    i0Var = this.f220451c;
                    if (i0Var == null) {
                        i0Var = new by5.i0(this.f220449a, "getName", new java.lang.Class[0]);
                        this.f220451c = i0Var;
                    }
                }
                str2 = (java.lang.String) i0Var.b(new java.lang.Object[0]);
            } catch (java.lang.UnsupportedOperationException unused) {
            }
            this.f220450b = str2;
        }
        return this.f220450b;
    }
}
