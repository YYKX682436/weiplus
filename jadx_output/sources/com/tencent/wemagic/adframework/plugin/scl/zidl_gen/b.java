package com.tencent.wemagic.adframework.plugin.scl.zidl_gen;

/* loaded from: classes8.dex */
public class b extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wemagic.adframework.plugin.scl.zidl_gen.b f220042b = new com.tencent.wemagic.adframework.plugin.scl.zidl_gen.b();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wemagic.adframework.plugin.scl.zidl_gen.ZIDL__QrzOEKqK f220043a;

    public b() {
        com.tencent.wemagic.adframework.plugin.scl.zidl_gen.ZIDL__QrzOEKqK zIDL__QrzOEKqK = new com.tencent.wemagic.adframework.plugin.scl.zidl_gen.ZIDL__QrzOEKqK();
        this.f220043a = zIDL__QrzOEKqK;
        this.zidlCreateName = "wemagic.WeMagicAdPlatformToCpp@Get";
        uw5.a.f431764a.a("adframework");
        zIDL__QrzOEKqK.ZIDL__QrzOEKqC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public long a(com.tencent.wemagic.adframework.plugin.scl.zidl_gen.c cVar) {
        return this.f220043a.ZIDL_P(this.nativeHandler, cVar.toByteArrayOrNull());
    }

    public void b(long j17) {
        this.f220043a.ZIDL_Q(this.nativeHandler, j17);
    }

    public java.lang.String c(long j17, com.tencent.wemagic.adframework.plugin.scl.zidl_gen.e eVar, com.tencent.wemagic.adframework.plugin.scl.zidl_gen.d dVar) {
        return this.f220043a.ZIDL_U(this.nativeHandler, j17, eVar.toByteArrayOrNull(), dVar.toByteArrayOrNull());
    }

    public void d(long j17) {
        this.f220043a.ZIDL_R(this.nativeHandler, j17);
    }

    public void e(long j17) {
        this.f220043a.ZIDL_C(this.nativeHandler, j17);
    }

    public void f(long j17, java.lang.String str, java.lang.String str2, int i17, int i18) {
        this.f220043a.ZIDL_BB(this.nativeHandler, j17, str, str2, i17, i18);
    }
}
