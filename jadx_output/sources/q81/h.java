package q81;

/* loaded from: classes7.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f360706d;

    /* renamed from: e, reason: collision with root package name */
    public int f360707e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f360708f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f360709g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.UUID f360710h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z17, java.util.List list, java.util.UUID uuid, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f360708f = z17;
        this.f360709g = list;
        this.f360710h = uuid;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new q81.h(this.f360708f, this.f360709g, this.f360710h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((q81.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.launching.q9 q9Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f360707e;
        java.util.UUID uuid = this.f360710h;
        jz5.f0 f0Var = jz5.f0.f302826a;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.tencent.mm.plugin.appbrand.launching.q9 aj6 = com.tencent.mm.plugin.appbrand.app.r9.aj();
                if (aj6 == null) {
                    return f0Var;
                }
                boolean z17 = this.f360708f;
                java.util.List<java.lang.String> list = this.f360709g;
                if (!z17) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : list) {
                        if (aj6.z0((java.lang.String) obj2) == null) {
                            arrayList.add(obj2);
                        }
                    }
                    list = arrayList;
                }
                if (list.isEmpty()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.CmdGetJsApiControlBytes", "doSyncJsApiControlBytes need sync appIdList is empty, requestId:" + uuid);
                    return f0Var;
                }
                og1.e eVar = new og1.e();
                r45.mr5 mr5Var = eVar.f68420a;
                r45.y50 y50Var = new r45.y50();
                y50Var.f390799f = 1;
                ((r45.zd7) mr5Var).f391946e = y50Var;
                java.util.LinkedList linkedList = ((r45.zd7) mr5Var).f391945d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
                for (java.lang.String str : list) {
                    r45.be7 be7Var = new r45.be7();
                    be7Var.f370712d = str;
                    be7Var.f370713e = 1;
                    arrayList2.add(be7Var);
                }
                linkedList.addAll(arrayList2);
                this.f360706d = aj6;
                this.f360707e = 1;
                java.lang.Object h17 = og1.c.h(eVar, this);
                if (h17 == aVar) {
                    return aVar;
                }
                q9Var = aj6;
                obj = h17;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q9Var = (com.tencent.mm.plugin.appbrand.launching.q9) this.f360706d;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            java.util.LinkedList<r45.ce7> appinfo_list = ((r45.ae7) obj).f369974d;
            kotlin.jvm.internal.o.f(appinfo_list, "appinfo_list");
            for (r45.ce7 ce7Var : appinfo_list) {
                q9Var.y0(ce7Var.f371512d.f370712d, ce7Var.f371513e);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CmdGetJsApiControlBytes", "doSyncJsApiControlBytes flush completed, requestId:" + uuid);
        } catch (com.tencent.mm.plugin.appbrand.networking.p e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.CmdGetJsApiControlBytes", "doSyncJsApiControlBytes cgi.send failed:" + e17 + ", requestId:" + uuid);
        }
        return f0Var;
    }
}
