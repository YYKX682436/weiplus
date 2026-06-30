package com.tencent.wechat.mm.brand_service;

/* loaded from: classes11.dex */
class ZIDL_ZiHEpDanB extends com.tencent.wechat.zidl2.ZidlBaseBridge {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.a f218843a;

    public void ZIDL_A() {
        this.f218843a.forceInitBrsAffEnv();
    }

    public int ZIDL_B() {
        return this.f218843a.getLocalCanvasPkgVersion();
    }

    public boolean ZIDL_C() {
        return this.f218843a.getAllowEmptyListResortSwitch();
    }

    public long ZIDL_D() {
        return this.f218843a.getSyncServerTimeMs();
    }

    public boolean ZIDL_E(int i17) {
        return this.f218843a.registerDIct(i17);
    }

    public boolean ZIDL_F() {
        return this.f218843a.checkBrandListDBHasStartCompression();
    }

    public boolean ZIDL_G() {
        return this.f218843a.checkBrandNotiListDBHasStartCompression();
    }

    public byte[] ZIDL_H(byte[] bArr) {
        return this.f218843a.getDigest((com.tencent.wechat.mm.brand_service.j) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.brand_service.j.K, bArr)).getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public boolean ZIDL_I(byte[] bArr) {
        return this.f218843a.getUserNameIsFollowed(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8));
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        this.f218843a = (com.tencent.wechat.mm.brand_service.a) obj;
    }
}
