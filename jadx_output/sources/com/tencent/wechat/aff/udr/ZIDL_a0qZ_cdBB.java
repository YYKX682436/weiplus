package com.tencent.wechat.aff.udr;

/* loaded from: classes15.dex */
class ZIDL_a0qZ_cdBB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.udr.h {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.udr.i f217528a;

    public ZIDL_a0qZ_cdBB(java.lang.Object obj) {
        com.tencent.wechat.aff.udr.i iVar = (com.tencent.wechat.aff.udr.i) obj;
        this.f217528a = iVar;
        iVar.setCallback(this);
    }

    private native void ZIDL_EX(long j17, long j18);

    private native void ZIDL_FX(long j17, long j18);

    private native void ZIDL_GX(long j17, long j18);

    private native void ZIDL_HX(long j17, long j18);

    private native void ZIDL_IX(long j17, long j18);

    private native void ZIDL_JX(long j17, long j18);

    @Override // com.tencent.wechat.aff.udr.h
    public void F(long j17) {
        ZIDL_HX(this.nativeHandler, j17);
    }

    @Override // com.tencent.wechat.aff.udr.h
    public void I(long j17) {
        ZIDL_IX(this.nativeHandler, j17);
    }

    @Override // com.tencent.wechat.aff.udr.h
    public void N1(long j17) {
        ZIDL_FX(this.nativeHandler, j17);
    }

    @Override // com.tencent.wechat.aff.udr.h
    public void Y0(long j17) {
        ZIDL_EX(this.nativeHandler, j17);
    }

    public byte[] ZIDL_A() {
        return this.f217528a.getProjectId().getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public byte[][] ZIDL_B() {
        return com.tencent.wechat.zidl2.ZidlUtil.stringListToArrayBytes(this.f217528a.getProjectIdList());
    }

    public boolean ZIDL_C() {
        return this.f217528a.addToPeriod();
    }

    public byte[][] ZIDL_D() {
        return com.tencent.wechat.zidl2.ZidlUtil.mmpbListSerializeToBasic(this.f217528a.getParameter());
    }

    public void ZIDL_EV(long j17, byte[] bArr) {
        this.f217528a.postProcessAsync(j17, (com.tencent.wechat.aff.udr.x) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.udr.x.L, bArr));
    }

    public void ZIDL_FV(long j17, byte[] bArr, byte[] bArr2, int i17, int i18, int i19) {
        this.f217528a.haveSpecifiedResourceAsync(j17, new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8), i17, i18, i19);
    }

    public void ZIDL_GV(long j17, byte[] bArr) {
        this.f217528a.onCallBackStartPeriodAsync(j17, new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8));
    }

    public void ZIDL_HV(long j17, byte[] bArr, byte[] bArr2, int i17, int i18) {
        this.f217528a.onCallBackCheckSuccessAsync(j17, new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8), i17, com.tencent.wechat.aff.udr.r.a(i18));
    }

    public void ZIDL_IV(long j17, byte[] bArr, byte[] bArr2, int i17, int i18) {
        this.f217528a.onCallBackSuccessAsync(j17, new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8), i17, com.tencent.wechat.aff.udr.r.a(i18));
    }

    public void ZIDL_JV(long j17, int i17, int i18, byte[] bArr, byte[] bArr2, int i19, int i27) {
        this.f217528a.onCallBackFailAsync(j17, i17, i18, new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8), i19, com.tencent.wechat.aff.udr.r.a(i27));
    }

    @Override // com.tencent.wechat.aff.udr.h
    public void c0(long j17) {
        ZIDL_GX(this.nativeHandler, j17);
    }

    @Override // com.tencent.wechat.aff.udr.h
    public void e(long j17) {
        ZIDL_JX(this.nativeHandler, j17);
    }
}
