package com.tencent.wechat.iam.finder_box;

/* loaded from: classes11.dex */
public class e extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.iam.finder_box.e f217831b = new com.tencent.wechat.iam.finder_box.e();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.iam.finder_box.ZIDL_E4kPx_59_K f217832a;

    public e() {
        com.tencent.wechat.iam.finder_box.ZIDL_E4kPx_59_K zIDL_E4kPx_59_K = new com.tencent.wechat.iam.finder_box.ZIDL_E4kPx_59_K();
        this.f217832a = zIDL_E4kPx_59_K;
        com.tencent.wechat.iam.finder_box.ZIDL_E4kPx_59_KE zIDL_E4kPx_59_KE = new com.tencent.wechat.iam.finder_box.ZIDL_E4kPx_59_KE();
        this.zidlCreateName = "finder_box.BoxIamBizAudioPlayListManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_finder_box", "aff_biz");
        zIDL_E4kPx_59_K.ZIDL_E4kPx_59_C(this, zIDL_E4kPx_59_KE, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(bw5.lp0 lp0Var, int i17, com.tencent.wechat.iam.finder_box.d dVar) {
        this.f217832a.ZIDL_GV(this.nativeHandler, dVar, lp0Var.toByteArrayOrNull(), i17);
    }
}
