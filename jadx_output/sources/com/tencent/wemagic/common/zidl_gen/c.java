package com.tencent.wemagic.common.zidl_gen;

/* loaded from: classes8.dex */
public class c extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wemagic.common.zidl_gen.c f220085b = new com.tencent.wemagic.common.zidl_gen.c();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wemagic.common.zidl_gen.ZIDL_G685KsMXvK f220086a;

    public c() {
        com.tencent.wemagic.common.zidl_gen.ZIDL_G685KsMXvK zIDL_G685KsMXvK = new com.tencent.wemagic.common.zidl_gen.ZIDL_G685KsMXvK();
        this.f220086a = zIDL_G685KsMXvK;
        this.zidlCreateName = "wemagic.WeMagicPlatformToCpp@Get";
        uw5.a.f431764a.a("wemagic_common");
        zIDL_G685KsMXvK.ZIDL_G685KsMXvC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public void a(boolean z17) {
        this.f220086a.ZIDL_Q(this.nativeHandler, z17);
    }

    public void b(boolean z17) {
        this.f220086a.ZIDL_N(this.nativeHandler, z17);
    }

    public void c(boolean z17) {
        this.f220086a.ZIDL_P(this.nativeHandler, z17);
    }

    public void d(long j17, int i17, int i18, java.lang.String str, java.lang.String str2) {
        this.f220086a.ZIDL_G(this.nativeHandler, j17, i17, i18, str, str2);
    }

    public void e(com.tencent.wemagic.common.zidl_gen.a aVar) {
        this.f220086a.ZIDL_S(this.nativeHandler, aVar.toByteArrayOrNull());
    }
}
