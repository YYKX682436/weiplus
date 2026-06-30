package com.tencent.xweb.pinus.sdk;

/* loaded from: classes13.dex */
public class x implements com.tencent.xweb.pinus.sdk.y {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.xweb.pinus.sdk.y f220500a;

    public x(java.lang.Object obj) {
        com.tencent.xweb.pinus.PSCoreWrapper pSCoreWrapper = com.tencent.xweb.pinus.PSCoreWrapper.getInstance();
        if (pSCoreWrapper == null) {
            this.f220500a = null;
        } else if (pSCoreWrapper.getBridgeClass("WebStorageAdapter").isInstance(obj)) {
            this.f220500a = new com.tencent.xweb.pinus.sdk.z(obj);
        } else {
            by5.c4.c("WebStorage", "Object must be an instance of WebStorageAdapter");
            this.f220500a = null;
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.y
    public void a() {
        com.tencent.xweb.pinus.sdk.y yVar = this.f220500a;
        if (yVar != null) {
            ((com.tencent.xweb.pinus.sdk.z) yVar).a();
        }
    }

    @Override // com.tencent.xweb.pinus.sdk.y
    public void b(java.lang.String str) {
        com.tencent.xweb.pinus.sdk.y yVar = this.f220500a;
        if (yVar != null) {
            ((com.tencent.xweb.pinus.sdk.z) yVar).b(str);
        }
    }
}
