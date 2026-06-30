package com.tencent.wechat.iam.biz;

/* loaded from: classes8.dex */
public class q0 extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.iam.biz.q0 f217771b = new com.tencent.wechat.iam.biz.q0();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.ZIDL_dN2Kz8ouK f217772a;

    public q0() {
        com.tencent.wechat.iam.biz.ZIDL_dN2Kz8ouK zIDL_dN2Kz8ouK = new com.tencent.wechat.iam.biz.ZIDL_dN2Kz8ouK();
        this.f217772a = zIDL_dN2Kz8ouK;
        this.zidlCreateName = "biz.IamBizNotifyMsgManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_biz", "aff_biz");
        zIDL_dN2Kz8ouK.ZIDL_dN2Kz8ouC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(com.tencent.wechat.mm.biz.h3 h3Var, com.tencent.wechat.iam.biz.p0 p0Var) {
        this.f217772a.ZIDL_AV(this.nativeHandler, p0Var, h3Var.toByteArrayOrNull());
    }
}
