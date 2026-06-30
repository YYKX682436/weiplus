package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes15.dex */
public class b extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.iam_scan.ZIDL_nneooqeyK f216950a;

    public b(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2, long j17) {
        com.tencent.wechat.aff.iam_scan.ZIDL_nneooqeyK zIDL_nneooqeyK = new com.tencent.wechat.aff.iam_scan.ZIDL_nneooqeyK();
        this.f216950a = zIDL_nneooqeyK;
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        this.refCntManagerHandler = j17;
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_scan", "aff_biz");
        zIDL_nneooqeyK.ZIDL_nneooqeyC(this, this.zidlCreateName, this.zidlSvrIdentity, null);
    }

    public void a(byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, java.nio.ByteBuffer byteBuffer) {
        this.f216950a.ZIDL_D(this.nativeHandler, bArr, i17, i18, i19, i27, i28, i29, i37, i38, byteBuffer);
    }

    public com.tencent.wechat.aff.iam_scan.e1 b() {
        return (com.tencent.wechat.aff.iam_scan.e1) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.iam_scan.e1.f217001f, this.f216950a.ZIDL_F(this.nativeHandler));
    }

    public int c(com.tencent.wechat.aff.iam_scan.b1 b1Var) {
        return this.f216950a.ZIDL_A(this.nativeHandler, b1Var.toByteArrayOrNull());
    }

    public void d() {
        this.f216950a.ZIDL_B(this.nativeHandler);
    }

    public com.tencent.wechat.aff.iam_scan.s e(byte[] bArr, int i17, int i18, float f17, float f18) {
        return (com.tencent.wechat.aff.iam_scan.s) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.iam_scan.s.f217127g, this.f216950a.ZIDL_C(this.nativeHandler, bArr, i17, i18, f17, f18));
    }

    public int f(int[] iArr, int i17, int i18, java.nio.ByteBuffer byteBuffer) {
        return this.f216950a.ZIDL_E(this.nativeHandler, iArr, i17, i18, byteBuffer);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.iam_scan.a aVar = new com.tencent.wechat.aff.iam_scan.a(this, this.nativeHandler);
        aVar.f216931c = this.nativeHandler;
        aVar.f216929a = this.zidlIdentity;
        aVar.f216930b = this.zidlSvrIdentity;
    }
}
