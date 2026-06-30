package com.tencent.wechat.aff.star;

/* loaded from: classes8.dex */
public class e extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.star.e f217508b = new com.tencent.wechat.aff.star.e();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.star.ZIDL_C2K0tzJXdK f217509a;

    public e() {
        com.tencent.wechat.aff.star.ZIDL_C2K0tzJXdK zIDL_C2K0tzJXdK = new com.tencent.wechat.aff.star.ZIDL_C2K0tzJXdK();
        this.f217509a = zIDL_C2K0tzJXdK;
        this.zidlCreateName = "star.AffStarManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_star_api", "aff_biz");
        zIDL_C2K0tzJXdK.ZIDL_C2K0tzJXdC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public boolean a() {
        return this.f217509a.ZIDL_A(this.nativeHandler);
    }

    public void b(boolean z17) {
        this.f217509a.ZIDL_B(this.nativeHandler, z17);
    }
}
