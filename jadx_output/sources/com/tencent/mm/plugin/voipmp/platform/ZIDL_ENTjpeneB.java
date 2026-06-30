package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes14.dex */
class ZIDL_ENTjpeneB extends com.tencent.wechat.zidl2.ZidlBaseBridge {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.voipmp.platform.h1 f177196a;

    public int ZIDL_A() {
        ((do5.a) this.f177196a).getClass();
        return bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.ilink_voip.RepairConfigVoIPMPMultiPathUsingCellularTipTime());
    }

    public boolean ZIDL_B() {
        ((do5.a) this.f177196a).getClass();
        return bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.ilink_voip.RepairConfigVoIPMPSimulateCellularNetwork()) == 1;
    }

    public boolean ZIDL_C() {
        ((do5.a) this.f177196a).getClass();
        jp5.o oVar = (jp5.o) i95.n0.c(jp5.o.class);
        if (oVar != null) {
            return oVar.ib();
        }
        return false;
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        this.f177196a = (com.tencent.mm.plugin.voipmp.platform.h1) obj;
    }
}
