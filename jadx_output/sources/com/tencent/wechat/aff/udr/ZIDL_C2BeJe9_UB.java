package com.tencent.wechat.aff.udr;

/* loaded from: classes15.dex */
class ZIDL_C2BeJe9_UB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.udr.d {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.udr.e f217526a;

    public ZIDL_C2BeJe9_UB(java.lang.Object obj) {
        com.tencent.wechat.aff.udr.e eVar = (com.tencent.wechat.aff.udr.e) obj;
        this.f217526a = eVar;
        eVar.setCallback(this);
    }

    private native void ZIDL_AX(long j17, long j18);

    private native void ZIDL_BX(long j17, long j18);

    private native void ZIDL_CX(long j17, long j18);

    @Override // com.tencent.wechat.aff.udr.d
    public void F(long j17) {
        ZIDL_AX(this.nativeHandler, j17);
    }

    @Override // com.tencent.wechat.aff.udr.d
    public void I(long j17) {
        ZIDL_BX(this.nativeHandler, j17);
    }

    public void ZIDL_AV(long j17, byte[] bArr, byte[] bArr2, int i17, int i18) {
        this.f217526a.onCallBackCheckSuccessAsync(j17, new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8), i17, com.tencent.wechat.aff.udr.r.a(i18));
    }

    public void ZIDL_BV(long j17, byte[] bArr, byte[] bArr2, int i17, int i18) {
        this.f217526a.onCallBackSuccessAsync(j17, new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8), i17, com.tencent.wechat.aff.udr.r.a(i18));
    }

    public void ZIDL_CV(long j17, int i17, int i18, byte[] bArr, byte[] bArr2, int i19, int i27) {
        this.f217526a.onCallBackFailAsync(j17, i17, i18, new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8), i19, com.tencent.wechat.aff.udr.r.a(i27));
    }

    @Override // com.tencent.wechat.aff.udr.d
    public void e(long j17) {
        ZIDL_CX(this.nativeHandler, j17);
    }
}
