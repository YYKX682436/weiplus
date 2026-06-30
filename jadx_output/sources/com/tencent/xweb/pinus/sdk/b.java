package com.tencent.xweb.pinus.sdk;

/* loaded from: classes13.dex */
public class b implements com.tencent.xweb.pinus.sdk.c {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.xweb.pinus.sdk.c f220375a;

    public b() {
        com.tencent.xweb.pinus.PSCoreWrapper pSCoreWrapper = com.tencent.xweb.pinus.PSCoreWrapper.getInstance();
        if (pSCoreWrapper == null) {
            return;
        }
        try {
            this.f220375a = new com.tencent.xweb.pinus.sdk.d(new by5.h0(pSCoreWrapper.getBridgeClass("CookieManager"), new java.lang.Class[0]).a(new java.lang.Object[0]));
        } catch (java.lang.UnsupportedOperationException e17) {
            by5.c4.d("CookieManager", "ReflectConstructor cookieManager error", e17);
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.c
    public java.lang.String a(java.lang.String str) {
        com.tencent.xweb.pinus.sdk.c cVar = this.f220375a;
        return cVar != null ? ((com.tencent.xweb.pinus.sdk.d) cVar).a(str) : "";
    }

    @Override // com.tencent.xweb.pinus.sdk.c
    public void b(java.lang.String str, java.lang.String str2) {
        com.tencent.xweb.pinus.sdk.c cVar = this.f220375a;
        if (cVar != null) {
            ((com.tencent.xweb.pinus.sdk.d) cVar).b(str, str2);
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.c
    public void c() {
        com.tencent.xweb.pinus.sdk.c cVar = this.f220375a;
        if (cVar != null) {
            ((com.tencent.xweb.pinus.sdk.d) cVar).c();
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.c
    public void d(boolean z17) {
        com.tencent.xweb.pinus.sdk.c cVar = this.f220375a;
        if (cVar != null) {
            ((com.tencent.xweb.pinus.sdk.d) cVar).d(z17);
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.c
    public void e() {
        com.tencent.xweb.pinus.sdk.c cVar = this.f220375a;
        if (cVar != null) {
            ((com.tencent.xweb.pinus.sdk.d) cVar).e();
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.c
    public void flush() {
        com.tencent.xweb.pinus.sdk.c cVar = this.f220375a;
        if (cVar != null) {
            ((com.tencent.xweb.pinus.sdk.d) cVar).flush();
        }
    }

    public b(java.lang.Object obj) {
        com.tencent.xweb.pinus.PSCoreWrapper pSCoreWrapper = com.tencent.xweb.pinus.PSCoreWrapper.getInstance();
        if (pSCoreWrapper == null) {
            return;
        }
        if (!pSCoreWrapper.getBridgeClass("CookieManager").isInstance(obj)) {
            by5.c4.c("CookieManager", "Object must be an instance of CookieManager");
        } else {
            this.f220375a = new com.tencent.xweb.pinus.sdk.d(obj);
        }
    }
}
