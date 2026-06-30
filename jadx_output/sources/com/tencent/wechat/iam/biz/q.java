package com.tencent.wechat.iam.biz;

/* loaded from: classes11.dex */
public class q extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.iam.biz.q f217769b = new com.tencent.wechat.iam.biz.q();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.ZIDL_X3vrGQ5PK f217770a;

    public q() {
        com.tencent.wechat.iam.biz.ZIDL_X3vrGQ5PK zIDL_X3vrGQ5PK = new com.tencent.wechat.iam.biz.ZIDL_X3vrGQ5PK();
        this.f217770a = zIDL_X3vrGQ5PK;
        this.zidlCreateName = "biz.IamBizAudioReportService@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_biz", "aff_biz");
        zIDL_X3vrGQ5PK.ZIDL_X3vrGQ5PC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(bw5.y2 y2Var) {
        this.f217770a.ZIDL_A(this.nativeHandler, y2Var.toByteArrayOrNull());
    }
}
