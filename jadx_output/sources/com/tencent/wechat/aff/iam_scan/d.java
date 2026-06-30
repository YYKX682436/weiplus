package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes15.dex */
public class d extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.iam_scan.d f216983b = new com.tencent.wechat.aff.iam_scan.d();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.iam_scan.ZIDL_nneo_QSmK f216984a;

    public d() {
        com.tencent.wechat.aff.iam_scan.ZIDL_nneo_QSmK zIDL_nneo_QSmK = new com.tencent.wechat.aff.iam_scan.ZIDL_nneo_QSmK();
        this.f216984a = zIDL_nneo_QSmK;
        this.zidlCreateName = "scan.AffQBarManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_scan", "aff_biz");
        zIDL_nneo_QSmK.ZIDL_nneo_QSmC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public com.tencent.wechat.aff.iam_scan.b a() {
        return (com.tencent.wechat.aff.iam_scan.b) com.tencent.wechat.zidl2.ZidlUtil.jniToJavaObj2(this.f216984a.ZIDL_A(this.nativeHandler), new com.tencent.wechat.aff.iam_scan.d$$a());
    }
}
