package com.tencent.wechat.aff.brand_service;

/* loaded from: classes11.dex */
public class a0 extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.brand_service.a0 f216047b = new com.tencent.wechat.aff.brand_service.a0();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.brand_service.ZIDL_eRuvSxNiKE f216048a;

    public a0() {
        com.tencent.wechat.aff.brand_service.ZIDL_eRuvSxNiK zIDL_eRuvSxNiK = new com.tencent.wechat.aff.brand_service.ZIDL_eRuvSxNiK();
        com.tencent.wechat.aff.brand_service.ZIDL_eRuvSxNiKE zIDL_eRuvSxNiKE = new com.tencent.wechat.aff.brand_service.ZIDL_eRuvSxNiKE();
        this.f216048a = zIDL_eRuvSxNiKE;
        this.zidlCreateName = "brand_service.BrandServiceNativeNotifyBridge@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_brand_service", "aff_biz");
        zIDL_eRuvSxNiK.ZIDL_eRuvSxNiC(this, zIDL_eRuvSxNiKE, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(java.lang.String str, com.tencent.wechat.aff.brand_service.w wVar) {
        this.f216048a.f216041a.put(str, wVar);
    }

    public void b(java.lang.String str, com.tencent.wechat.aff.brand_service.x xVar) {
        this.f216048a.f216043c.put(str, xVar);
    }

    public void c(java.lang.String str, com.tencent.wechat.aff.brand_service.y yVar) {
        this.f216048a.f216042b.put(str, yVar);
    }

    public void d(java.lang.String str, com.tencent.wechat.aff.brand_service.z zVar) {
        this.f216048a.f216044d.put(str, zVar);
    }
}
