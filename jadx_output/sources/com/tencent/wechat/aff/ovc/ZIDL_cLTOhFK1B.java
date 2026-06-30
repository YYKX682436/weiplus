package com.tencent.wechat.aff.ovc;

/* loaded from: classes15.dex */
class ZIDL_cLTOhFK1B extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.ovc.d {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.ovc.e f217454a;

    private native void ZIDL_CI(long j17, java.lang.String[] strArr, java.lang.String str);

    private native void ZIDL_DI(long j17, java.lang.String str, boolean z17);

    private native void ZIDL_EI(long j17, java.lang.String str, int i17);

    private native void ZIDL_FI(long j17, int i17, boolean z17);

    private native void ZIDL_GI(long j17, java.lang.String str);

    private native void ZIDL_HI(long j17, java.lang.String str, java.lang.String str2);

    private native void ZIDL_II(long j17);

    private native void ZIDL_JI(long j17, long j18);

    @Override // com.tencent.wechat.aff.ovc.d
    public void B1(java.lang.String str) {
        ZIDL_GI(this.nativeHandler, str);
    }

    @Override // com.tencent.wechat.aff.ovc.d
    public void G0() {
        ZIDL_II(this.nativeHandler);
    }

    @Override // com.tencent.wechat.aff.ovc.d
    public void N0(long j17) {
        ZIDL_JI(this.nativeHandler, j17);
    }

    public void ZIDL_B() {
        h41.i0 i0Var = (h41.i0) this.f217454a;
        i0Var.getClass();
        ey.q qVar = (ey.q) ((ey.u) i95.n0.c(ey.u.class));
        qVar.Ni(i0Var.f278795b);
        qVar.Ni(i0Var.f278796c);
        qVar.Ri(i0Var.f278797d);
        qVar.Ri(i0Var.f278798e);
        qVar.Ni(i0Var.f278800g);
        qVar.Ri(i0Var.f278804k);
        qVar.Ni(i0Var.f278799f);
        qVar.Ri(i0Var.f278802i);
        qVar.Ni(i0Var.f278803j);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.ovc.e eVar = (com.tencent.wechat.aff.ovc.e) obj;
        this.f217454a = eVar;
        ((h41.i0) eVar).f278794a = this;
    }

    @Override // com.tencent.wechat.aff.ovc.d
    public void c1(java.util.ArrayList arrayList, java.lang.String str) {
        ZIDL_CI(this.nativeHandler, com.tencent.wechat.zidl2.ZidlUtil.stringListToArray(arrayList), str);
    }

    @Override // com.tencent.wechat.aff.ovc.d
    public void l1(java.lang.String str, boolean z17) {
        ZIDL_DI(this.nativeHandler, str, z17);
    }

    @Override // com.tencent.wechat.aff.ovc.d
    public void m1(java.lang.String str, int i17) {
        ZIDL_EI(this.nativeHandler, str, i17);
    }

    @Override // com.tencent.wechat.aff.ovc.d
    public void n1(int i17, boolean z17) {
        ZIDL_FI(this.nativeHandler, i17, z17);
    }

    @Override // com.tencent.wechat.aff.ovc.d
    public void z1(java.lang.String str, java.lang.String str2) {
        ZIDL_HI(this.nativeHandler, str, str2);
    }
}
