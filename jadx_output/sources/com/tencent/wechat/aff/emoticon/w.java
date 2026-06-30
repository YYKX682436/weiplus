package com.tencent.wechat.aff.emoticon;

/* loaded from: classes15.dex */
public class w extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.emoticon.w f216679b = new com.tencent.wechat.aff.emoticon.w();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.emoticon.ZIDL_J6WrF5CiOK f216680a;

    public w() {
        com.tencent.wechat.aff.emoticon.ZIDL_J6WrF5CiOK zIDL_J6WrF5CiOK = new com.tencent.wechat.aff.emoticon.ZIDL_J6WrF5CiOK();
        this.f216680a = zIDL_J6WrF5CiOK;
        this.zidlCreateName = "emoticon.EmoticonFinderDesignerDataSource@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_emoticon", "aff_biz");
        zIDL_J6WrF5CiOK.ZIDL_J6WrF5CiOC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public java.util.ArrayList a(int i17) {
        return com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(r45.ri0.B, this.f216680a.ZIDL_C(this.nativeHandler, i17));
    }

    public java.util.ArrayList b(int i17) {
        return com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(r45.vd0.f388133h, this.f216680a.ZIDL_D(this.nativeHandler, i17));
    }

    public java.util.ArrayList c(int i17) {
        return com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(bw5.ra.T, this.f216680a.ZIDL_E(this.nativeHandler, i17));
    }
}
