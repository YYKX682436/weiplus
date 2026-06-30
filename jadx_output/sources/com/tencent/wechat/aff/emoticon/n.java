package com.tencent.wechat.aff.emoticon;

/* loaded from: classes15.dex */
public class n extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.emoticon.n f216655b = new com.tencent.wechat.aff.emoticon.n();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.emoticon.ZIDL_J6WrC23whK f216656a;

    public n() {
        com.tencent.wechat.aff.emoticon.ZIDL_J6WrC23whK zIDL_J6WrC23whK = new com.tencent.wechat.aff.emoticon.ZIDL_J6WrC23whK();
        this.f216656a = zIDL_J6WrC23whK;
        this.zidlCreateName = "emoticon.EmoticonDesignerPortfolioPackDataSource@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_emoticon", "aff_biz");
        zIDL_J6WrC23whK.ZIDL_J6WrC23whC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }
}
