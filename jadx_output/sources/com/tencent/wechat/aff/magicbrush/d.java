package com.tencent.wechat.aff.magicbrush;

/* loaded from: classes8.dex */
public class d extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.magicbrush.d f217380b = new com.tencent.wechat.aff.magicbrush.d();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.magicbrush.ZIDL_IevTXWafK f217381a;

    public d() {
        com.tencent.wechat.aff.magicbrush.ZIDL_IevTXWafK zIDL_IevTXWafK = new com.tencent.wechat.aff.magicbrush.ZIDL_IevTXWafK();
        this.f217381a = zIDL_IevTXWafK;
        this.zidlCreateName = "magicbrush_zidl.MagicBrushManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_magicbrush", "aff_biz");
        zIDL_IevTXWafK.ZIDL_IevTXWafC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(com.tencent.wechat.aff.magicbrush.b bVar) {
        this.f217381a.ZIDL_A(this.nativeHandler, bVar.toByteArrayOrNull());
    }
}
