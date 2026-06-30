package com.tencent.wechat.aff.ecs;

/* loaded from: classes15.dex */
public class c extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.wechat.aff.ecs.c f216628b = new com.tencent.wechat.aff.ecs.c();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.ecs.ZIDL_RkVMF5OPgK f216629a;

    public c() {
        com.tencent.wechat.aff.ecs.ZIDL_RkVMF5OPgK zIDL_RkVMF5OPgK = new com.tencent.wechat.aff.ecs.ZIDL_RkVMF5OPgK();
        this.f216629a = zIDL_RkVMF5OPgK;
        this.zidlCreateName = "ecs.EcsChatTicketManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_ecs", "aff_biz");
        zIDL_RkVMF5OPgK.ZIDL_RkVMF5OPgC(this, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public java.lang.String a(int i17, java.lang.String str) {
        return new java.lang.String(this.f216629a.ZIDL_C(this.nativeHandler, i17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8)), java.nio.charset.StandardCharsets.UTF_8);
    }

    public void b() {
        this.f216629a.ZIDL_A(this.nativeHandler);
    }

    public void c(int i17, java.lang.String str, com.tencent.wechat.aff.ecs.b bVar) {
        this.f216629a.ZIDL_BV(this.nativeHandler, bVar, i17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }
}
