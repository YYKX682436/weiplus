package ez;

/* loaded from: classes4.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f257714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f257715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f257716f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ez.f1 f257717g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(long j17, int i17, ez.f1 f1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f257715e = j17;
        this.f257716f = i17;
        this.f257717g = f1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ez.c1(this.f257715e, this.f257716f, this.f257717g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ez.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f257714d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doCgi] syncKey = ");
            long j17 = this.f257715e;
            sb6.append(j17);
            sb6.append(", scene = ");
            int i18 = this.f257716f;
            sb6.append(i18);
            com.tencent.mars.xlog.Log.i("MMTypingFeatureService", sb6.toString());
            r45.xq xqVar = new r45.xq();
            xqVar.f390327d = j17;
            xqVar.f390328e = i18;
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = 17849;
            lVar.f70666c = "/cgi-bin/micromsg-bin/bypinfosynctypingcontactticket";
            lVar.f70664a = xqVar;
            lVar.f70665b = new r45.yq();
            com.tencent.mm.modelbase.o a17 = lVar.a();
            com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
            iVar.p(a17);
            this.f257714d = 1;
            obj = rm0.h.b(iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.b()) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[doCgi] callback Success synckey_value = ");
            sb7.append(((r45.yq) fVar.f70618d).f391286e);
            sb7.append(" , synclistSiez = ");
            java.util.LinkedList linkedList = ((r45.yq) fVar.f70618d).f391287f;
            sb7.append(linkedList != null ? new java.lang.Integer(linkedList.size()) : null);
            sb7.append(", continue = ");
            sb7.append(((r45.yq) fVar.f70618d).f391285d);
            com.tencent.mars.xlog.Log.i("MMTypingFeatureService", sb7.toString());
            java.util.LinkedList<r45.wq> linkedList2 = ((r45.yq) fVar.f70618d).f391287f;
            ez.f1 f1Var = this.f257717g;
            if (linkedList2 != null) {
                for (r45.wq wqVar : linkedList2) {
                    try {
                        ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f1Var.f257729d).getValue()).H(wqVar.f389382d, wqVar.f389383e.g());
                        kotlin.jvm.internal.o.f(java.util.Arrays.toString(wqVar.f389383e.g()), "toString(...)");
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MMTypingFeatureService", th6, "mmkv  encode err", new java.lang.Object[0]);
                    }
                }
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_BYP_INFO_KEY_LONG_SYNC, new java.lang.Long(((r45.yq) fVar.f70618d).f391286e));
            r45.yq yqVar = (r45.yq) fVar.f70618d;
            if (yqVar.f391285d != 0) {
                ez.f1.wi(f1Var, yqVar.f391286e, 4);
            }
        }
        return jz5.f0.f302826a;
    }
}
