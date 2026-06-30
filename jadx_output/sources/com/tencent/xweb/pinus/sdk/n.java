package com.tencent.xweb.pinus.sdk;

/* loaded from: classes13.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.xweb.pinus.sdk.o f220461a;

    public n(com.tencent.xweb.pinus.sdk.l lVar) {
        this.f220461a = null;
        com.tencent.xweb.pinus.PSCoreWrapper pSCoreWrapper = com.tencent.xweb.pinus.PSCoreWrapper.getInstance();
        if (pSCoreWrapper == null) {
            return;
        }
        try {
            this.f220461a = new com.tencent.xweb.pinus.sdk.p(new by5.h0(pSCoreWrapper.getBridgeClass("ProfileStore"), new java.lang.Class[0]).a(new java.lang.Object[0]));
        } catch (java.lang.UnsupportedOperationException e17) {
            by5.c4.d("ProfileStore", "ProfileStore constructor for pinus error", e17);
        }
    }

    public com.tencent.xweb.pinus.sdk.k a(java.lang.String str) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.o oVar = this.f220461a;
        if (oVar == null) {
            return null;
        }
        com.tencent.xweb.pinus.sdk.p pVar = (com.tencent.xweb.pinus.sdk.p) oVar;
        pVar.getClass();
        try {
            synchronized (pVar) {
                i0Var = pVar.f220463b;
                if (i0Var == null) {
                    i0Var = new by5.i0(pVar.f220462a, "getOrCreateProfile", java.lang.String.class);
                    pVar.f220463b = i0Var;
                }
            }
            java.lang.Object b17 = i0Var.b(str);
            if (b17 == null) {
                return null;
            }
            return new com.tencent.xweb.pinus.sdk.k(b17);
        } catch (java.lang.UnsupportedOperationException unused) {
            return null;
        }
    }
}
