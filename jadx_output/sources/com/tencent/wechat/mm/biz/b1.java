package com.tencent.wechat.mm.biz;

/* loaded from: classes11.dex */
public class b1 extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.mm.biz.b1 f217902b = new com.tencent.wechat.mm.biz.b1();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.mm.biz.ZIDL_HtXvE4pW3K f217903a;

    public b1() {
        com.tencent.wechat.mm.biz.ZIDL_HtXvE4pW3K zIDL_HtXvE4pW3K = new com.tencent.wechat.mm.biz.ZIDL_HtXvE4pW3K();
        this.f217903a = zIDL_HtXvE4pW3K;
        this.zidlCreateName = "biz.BizDynamicCardMrg@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_biz", "aff_biz");
        zIDL_HtXvE4pW3K.ZIDL_HtXvE4pW3C(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public boolean a(long j17, int i17) {
        return this.f217903a.ZIDL_F(this.nativeHandler, j17, i17);
    }

    public com.tencent.wechat.mm.biz.r3 b(int i17) {
        return (com.tencent.wechat.mm.biz.r3) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.biz.r3.f218521f, this.f217903a.ZIDL_B(this.nativeHandler, i17));
    }

    public void c(int i17, java.lang.String str, java.lang.String str2) {
        this.f217903a.ZIDL_A(this.nativeHandler, i17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public boolean d(long j17, java.lang.String str) {
        return this.f217903a.ZIDL_E(this.nativeHandler, j17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public boolean e(java.lang.String str, java.lang.String str2) {
        return this.f217903a.ZIDL_C(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public boolean f(java.lang.String str, java.lang.String str2) {
        return this.f217903a.ZIDL_D(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }
}
