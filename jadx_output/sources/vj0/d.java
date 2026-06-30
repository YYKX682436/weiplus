package vj0;

/* loaded from: classes4.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f437641d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w15.a f437642e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.WebViewExWindowCloseEvent f437643f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f437644g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(w15.a aVar, com.tencent.mm.autogen.events.WebViewExWindowCloseEvent webViewExWindowCloseEvent, com.tencent.mm.ui.widget.dialog.u3 u3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f437642e = aVar;
        this.f437643f = webViewExWindowCloseEvent;
        this.f437644g = u3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vj0.d(this.f437642e, this.f437643f, this.f437644g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vj0.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f437641d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.rc5 rc5Var = new r45.rc5();
            w15.a aVar2 = this.f437642e;
            rc5Var.f384730f = aVar2.getScene();
            rc5Var.f384728d = aVar2.j();
            java.lang.Object l17 = gm0.j1.u().c().l(274436, null);
            java.lang.String str = l17 instanceof java.lang.String ? (java.lang.String) l17 : null;
            if (str == null) {
                str = "";
            }
            rc5Var.f384729e = str;
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = 268;
            lVar.f70666c = "/cgi-bin/micromsg-bin/privacypolicychoise";
            lVar.f70664a = rc5Var;
            lVar.f70665b = new r45.sc5();
            com.tencent.mm.modelbase.o a17 = lVar.a();
            com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
            iVar.p(a17);
            this.f437641d = 1;
            obj = rm0.h.b(iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.CommonLiteAppGuidanceManager", "closeWindow " + fVar.f70616b + ':' + fVar.f70615a + ':' + fVar.f70617c);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        vj0.c cVar = new vj0.c(this.f437643f, this.f437644g, null);
        this.f437641d = 2;
        if (kotlinx.coroutines.l.g(g3Var, cVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
