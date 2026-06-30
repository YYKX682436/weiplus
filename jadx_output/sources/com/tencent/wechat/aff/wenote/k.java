package com.tencent.wechat.aff.wenote;

/* loaded from: classes16.dex */
public class k extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.wenote.k f217694b = new com.tencent.wechat.aff.wenote.k();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.wenote.ZIDL_Qi32ag9_K f217695a;

    public k() {
        com.tencent.wechat.aff.wenote.ZIDL_Qi32ag9_K zIDL_Qi32ag9_K = new com.tencent.wechat.aff.wenote.ZIDL_Qi32ag9_K();
        this.f217695a = zIDL_Qi32ag9_K;
        this.zidlCreateName = "wenote.WeNoteNativeToCppSingleton@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_wenote", "aff_biz");
        zIDL_Qi32ag9_K.ZIDL_Qi32ag9_C(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public java.lang.String a(java.lang.String str) {
        return new java.lang.String(this.f217695a.ZIDL_A(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8)), java.nio.charset.StandardCharsets.UTF_8);
    }

    public java.lang.String b(java.lang.String str) {
        return new java.lang.String(this.f217695a.ZIDL_B(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8)), java.nio.charset.StandardCharsets.UTF_8);
    }

    public java.lang.String c(boolean z17, java.lang.String str, java.lang.String str2, boolean z18) {
        return new java.lang.String(this.f217695a.ZIDL_C(this.nativeHandler, z17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8), z18), java.nio.charset.StandardCharsets.UTF_8);
    }

    public boolean d(java.lang.String str) {
        return this.f217695a.ZIDL_F(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public boolean e(java.lang.String str) {
        return this.f217695a.ZIDL_E(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public int f(long j17) {
        return this.f217695a.ZIDL_G(this.nativeHandler, j17);
    }

    public void g(long j17, java.lang.String str) {
        this.f217695a.ZIDL_D(this.nativeHandler, j17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }
}
