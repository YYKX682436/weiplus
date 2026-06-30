package com.tencent.wechat.mm.brand_service;

/* loaded from: classes11.dex */
public class b extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.mm.brand_service.b f218850b = new com.tencent.wechat.mm.brand_service.b();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.mm.brand_service.ZIDL_q1bTF5JNVK f218851a;

    public b() {
        com.tencent.wechat.mm.brand_service.ZIDL_q1bTF5JNVK zIDL_q1bTF5JNVK = new com.tencent.wechat.mm.brand_service.ZIDL_q1bTF5JNVK();
        this.f218851a = zIDL_q1bTF5JNVK;
        this.zidlCreateName = "brand_service.AffBrandServiceRedDotManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_brand_service", "aff_biz");
        zIDL_q1bTF5JNVK.ZIDL_q1bTF5JNVC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public com.tencent.wechat.mm.brand_service.i a() {
        return (com.tencent.wechat.mm.brand_service.i) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.brand_service.i.f218950r, this.f218851a.ZIDL_A(this.nativeHandler));
    }
}
