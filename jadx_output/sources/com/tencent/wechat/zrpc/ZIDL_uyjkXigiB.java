package com.tencent.wechat.zrpc;

/* loaded from: classes11.dex */
class ZIDL_uyjkXigiB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.zrpc.e {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.zrpc.f f220035a;

    private native void ZIDL_CX(long j17, long j18, com.tencent.wechat.zidl2.ZidlObjHolder2 zidlObjHolder2);

    public void Q1(long j17, com.tencent.wechat.zrpc.b bVar) {
        ZIDL_CX(this.nativeHandler, j17, com.tencent.wechat.zidl2.ZidlUtil.javaObjToJni2(bVar));
    }

    public boolean ZIDL_B(java.lang.String req) {
        ((iw5.a) this.f220035a).getClass();
        kotlin.jvm.internal.o.g(req, "req");
        java.lang.String msg = "initClientFactory: req ".concat(req);
        kotlin.jvm.internal.o.g(msg, "msg");
        if (iw5.o.f295275a != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExtChannelClientFactory", msg);
        }
        jz5.l a17 = iw5.h.f295272a.a(req);
        if (a17 == null) {
            if (iw5.o.f295275a == null) {
                return false;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ExtChannelClientFactory", "initClientFactory: parse req failed");
            return false;
        }
        java.util.Map map = iw5.a.f295264b;
        java.lang.Object obj = a17.f302833d;
        if (!map.containsKey(obj)) {
            if (iw5.o.f295275a == null) {
                return false;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ExtChannelClientFactory", "initClientFactory: type not found");
            return false;
        }
        try {
            java.lang.Object obj2 = ((java.util.LinkedHashMap) map).get(obj);
            kotlin.jvm.internal.o.d(obj2);
            android.support.v4.media.f.a(obj2);
            throw null;
        } catch (java.lang.Exception e17) {
            java.lang.String msg2 = "initClientFactory: create instance failed " + e17;
            kotlin.jvm.internal.o.g(msg2, "msg");
            if (iw5.o.f295275a == null) {
                return false;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ExtChannelClientFactory", msg2);
            return false;
        }
    }

    public void ZIDL_CV(long j17, long j18) {
        iw5.a aVar = (iw5.a) this.f220035a;
        aVar.getClass();
        java.lang.String msg = "connectAsync: " + j17;
        kotlin.jvm.internal.o.g(msg, "msg");
        if (iw5.o.f295275a != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExtChannelClientFactory", msg);
        }
        com.tencent.wechat.zrpc.e eVar = aVar.f295265a;
        if (eVar != null) {
            ((com.tencent.wechat.zrpc.ZIDL_uyjkXigiB) eVar).Q1(j17, new com.tencent.wechat.zrpc.b(new iw5.g()));
        }
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.zrpc.f fVar = (com.tencent.wechat.zrpc.f) obj;
        this.f220035a = fVar;
        ((iw5.a) fVar).f295265a = this;
    }
}
