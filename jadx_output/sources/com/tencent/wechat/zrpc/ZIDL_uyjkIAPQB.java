package com.tencent.wechat.zrpc;

/* loaded from: classes11.dex */
class ZIDL_uyjkIAPQB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.zrpc.g {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.zrpc.h f220034a;

    private native void ZIDL_CI(long j17, com.tencent.wechat.zidl2.ZidlObjHolder2 zidlObjHolder2);

    @Override // com.tencent.wechat.zrpc.g
    public void O0(com.tencent.wechat.zrpc.b bVar) {
        ZIDL_CI(this.nativeHandler, com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni2(bVar));
    }

    public boolean ZIDL_B(java.lang.String str) {
        return this.f220034a.b(str);
    }

    public void ZIDL_D() {
        this.f220034a.j();
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.zrpc.h hVar = (com.tencent.wechat.zrpc.h) obj;
        this.f220034a = hVar;
        hVar.a(this);
    }
}
