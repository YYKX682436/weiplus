package com.tencent.wechat.iam.biz;

/* loaded from: classes11.dex */
public class p extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.iam.biz.p f217765b = new com.tencent.wechat.iam.biz.p();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.ZIDL_azs2FiDaK f217766a;

    public p() {
        com.tencent.wechat.iam.biz.ZIDL_azs2FiDaK zIDL_azs2FiDaK = new com.tencent.wechat.iam.biz.ZIDL_azs2FiDaK();
        this.f217766a = zIDL_azs2FiDaK;
        this.zidlCreateName = "biz.IamBizAudioRecommendManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_biz", "aff_biz");
        zIDL_azs2FiDaK.ZIDL_azs2FiDaC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a() {
        this.f217766a.ZIDL_A(this.nativeHandler);
    }
}
