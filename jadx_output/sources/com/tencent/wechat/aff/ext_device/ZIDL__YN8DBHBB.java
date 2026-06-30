package com.tencent.wechat.aff.ext_device;

/* loaded from: classes11.dex */
class ZIDL__YN8DBHBB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.ext_device.b {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.ext_device.c f216684a;

    private native void ZIDL_AX(long j17, long j18);

    private native void ZIDL_BX(long j17, long j18);

    private native void ZIDL_DX(long j17, long j18, boolean z17);

    public void Q1(long j17, boolean z17) {
        ZIDL_DX(this.nativeHandler, j17, z17);
    }

    public void ZIDL_AV(long j17) {
        iy4.c cVar = (iy4.c) this.f216684a;
        cVar.f295936b.post(new iy4.b(cVar, j17));
    }

    public void ZIDL_BV(long j17) {
        iy4.c cVar = (iy4.c) this.f216684a;
        cVar.f295936b.post(new iy4.a(cVar, j17));
    }

    public boolean ZIDL_C() {
        ((iy4.c) this.f216684a).getClass();
        boolean b17 = kotlin.jvm.internal.o.b(j62.e.g().j("clicfg_ext_device_sync_record_android", "0", true, true), "1");
        ot5.g.c("MicroMsg.ExtDeviceService", "enableSyncRecordImpl: " + b17);
        return b17;
    }

    public void ZIDL_DV(long j17) {
        iy4.c cVar = (iy4.c) this.f216684a;
        cVar.getClass();
        boolean b17 = kotlin.jvm.internal.o.b(j62.e.g().j("clicfg_ext_device_sync_record_android", "0", true, true), "1");
        ot5.g.c("MicroMsg.ExtDeviceService", "enableSyncRecordImpl: " + b17);
        com.tencent.wechat.aff.ext_device.b bVar = cVar.f295935a;
        if (bVar != null) {
            ((com.tencent.wechat.aff.ext_device.ZIDL__YN8DBHBB) bVar).Q1(j17, b17);
        }
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.ext_device.c cVar = (com.tencent.wechat.aff.ext_device.c) obj;
        this.f216684a = cVar;
        ((iy4.c) cVar).f295935a = this;
    }

    @Override // com.tencent.wechat.aff.ext_device.b
    public void v0(long j17) {
        ZIDL_BX(this.nativeHandler, j17);
    }

    @Override // com.tencent.wechat.aff.ext_device.b
    public void y1(long j17) {
        ZIDL_AX(this.nativeHandler, j17);
    }
}
