package iw5;

/* loaded from: classes11.dex */
public final class f implements com.tencent.wechat.zrpc.h {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f295269c = new java.util.LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.zrpc.g f295270a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.wechat.zrpc.h f295271b;

    @Override // com.tencent.wechat.zrpc.h
    public void a(com.tencent.wechat.zrpc.g gVar) {
        this.f295270a = gVar;
    }

    @Override // com.tencent.wechat.zrpc.h
    public boolean b(java.lang.String req) {
        kotlin.jvm.internal.o.g(req, "req");
        java.lang.String msg = "listen: ".concat(req);
        kotlin.jvm.internal.o.g(msg, "msg");
        jz5.l a17 = iw5.h.f295272a.a(req);
        if (a17 == null) {
            if (iw5.o.f295275a != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExtChannelServerFactory", "listen: parse req error");
            }
            return false;
        }
        java.lang.String msg2 = "listen: " + a17;
        kotlin.jvm.internal.o.g(msg2, "msg");
        java.util.Map map = f295269c;
        java.lang.Object obj = a17.f302833d;
        if (!map.containsKey(obj)) {
            if (iw5.o.f295275a != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExtChannelServerFactory", "listen: type not found");
            }
            return false;
        }
        try {
            java.lang.Object obj2 = ((java.util.LinkedHashMap) map).get(obj);
            kotlin.jvm.internal.o.d(obj2);
            jw5.i iVar = new jw5.i();
            this.f295271b = iVar;
            iVar.a(this.f295270a);
            com.tencent.wechat.zrpc.h hVar = this.f295271b;
            kotlin.jvm.internal.o.d(hVar);
            return hVar.b((java.lang.String) a17.f302834e);
        } catch (java.lang.Exception e17) {
            java.lang.String msg3 = "listen: create impl error " + e17;
            kotlin.jvm.internal.o.g(msg3, "msg");
            if (iw5.o.f295275a != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExtChannelServerFactory", msg3);
            }
            return false;
        }
    }

    @Override // com.tencent.wechat.zrpc.h
    public void j() {
        if (iw5.o.f295275a != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExtChannelServerFactory", "unInit");
        }
        com.tencent.wechat.zrpc.h hVar = this.f295271b;
        if (hVar != null) {
            kotlin.jvm.internal.o.d(hVar);
            ((jw5.i) hVar).j();
        }
    }
}
