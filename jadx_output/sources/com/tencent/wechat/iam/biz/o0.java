package com.tencent.wechat.iam.biz;

/* loaded from: classes11.dex */
public class o0 extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.iam.biz.o0 f217763b = new com.tencent.wechat.iam.biz.o0();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.ZIDL_wkT3ITVWK f217764a;

    public o0() {
        com.tencent.wechat.iam.biz.ZIDL_wkT3ITVWK zIDL_wkT3ITVWK = new com.tencent.wechat.iam.biz.ZIDL_wkT3ITVWK();
        this.f217764a = zIDL_wkT3ITVWK;
        com.tencent.wechat.iam.biz.ZIDL_wkT3ITVWKE zIDL_wkT3ITVWKE = new com.tencent.wechat.iam.biz.ZIDL_wkT3ITVWKE();
        this.zidlCreateName = "biz.IamBizNativeToCppManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_biz", "aff_biz");
        zIDL_wkT3ITVWK.ZIDL_wkT3ITVWC(this, zIDL_wkT3ITVWKE, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public boolean a(java.lang.String str, int i17) {
        return this.f217764a.ZIDL_H(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), i17);
    }

    public void b(java.lang.String str, int i17, com.tencent.wechat.iam.biz.m0 m0Var) {
        this.f217764a.ZIDL_JV(this.nativeHandler, m0Var, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), i17);
    }

    public void c(java.lang.String str, int i17, com.tencent.wechat.iam.biz.n0 n0Var) {
        this.f217764a.ZIDL_IV(this.nativeHandler, n0Var, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), i17);
    }
}
