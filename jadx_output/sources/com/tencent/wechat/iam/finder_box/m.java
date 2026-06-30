package com.tencent.wechat.iam.finder_box;

/* loaded from: classes8.dex */
public class m extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.iam.finder_box.m f217846b = new com.tencent.wechat.iam.finder_box.m();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.iam.finder_box.ZIDL_M7NeSRzhK f217847a;

    public m() {
        com.tencent.wechat.iam.finder_box.ZIDL_M7NeSRzhK zIDL_M7NeSRzhK = new com.tencent.wechat.iam.finder_box.ZIDL_M7NeSRzhK();
        this.f217847a = zIDL_M7NeSRzhK;
        this.zidlCreateName = "finder_box.BoxIamBizNotifyMsgManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_finder_box", "aff_biz");
        zIDL_M7NeSRzhK.ZIDL_M7NeSRzhC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(com.tencent.wechat.mm.finder_box.j2 j2Var, com.tencent.wechat.iam.finder_box.l lVar) {
        this.f217847a.ZIDL_AV(this.nativeHandler, lVar, j2Var.toByteArrayOrNull());
    }
}
