package com.tencent.wechat.aff.sns;

/* loaded from: classes4.dex */
public class b extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.sns.b f217501b = new com.tencent.wechat.aff.sns.b();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.sns.ZIDL_vWtfD3iFjK f217502a;

    public b() {
        com.tencent.wechat.aff.sns.ZIDL_vWtfD3iFjK zIDL_vWtfD3iFjK = new com.tencent.wechat.aff.sns.ZIDL_vWtfD3iFjK();
        this.f217502a = zIDL_vWtfD3iFjK;
        com.tencent.wechat.aff.sns.ZIDL_vWtfD3iFjKE zIDL_vWtfD3iFjKE = new com.tencent.wechat.aff.sns.ZIDL_vWtfD3iFjKE();
        this.zidlCreateName = "sns.SnsCoverLogicDBManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_sns", "aff_biz");
        zIDL_vWtfD3iFjK.ZIDL_vWtfD3iFjC(this, zIDL_vWtfD3iFjKE, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a() {
        this.f217502a.ZIDL_A(this.nativeHandler);
    }

    public void b(bw5.uj0 uj0Var, com.tencent.wechat.aff.sns.a aVar) {
        this.f217502a.ZIDL_CV(this.nativeHandler, aVar, uj0Var.toByteArrayOrNull());
    }
}
