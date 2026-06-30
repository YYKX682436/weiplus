package fu0;

/* loaded from: classes5.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f266805d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f266806e;

    /* renamed from: f, reason: collision with root package name */
    public int f266807f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f266808g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(org.json.JSONObject jSONObject, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f266808g = jSONObject;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fu0.o(this.f266808g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fu0.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.protobuf.g gVar;
        com.tencent.mm.protobuf.g c17;
        java.util.List t07;
        java.util.List list;
        com.tencent.mm.protobuf.g gVar2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f266807f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            eu0.b a17 = eu0.b.f256694o.a(this.f266808g);
            gVar = null;
            if (a17 == null) {
                return null;
            }
            java.util.List list2 = a17.f256699e;
            java.util.List list3 = kz5.p0.f313996d;
            if (list2 == null) {
                list2 = list3;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list2) {
                if (!r26.n0.N((java.lang.String) obj2)) {
                    arrayList.add(obj2);
                }
            }
            java.util.List list4 = a17.f256700f;
            if (list4 != null) {
                list3 = list4;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj3 : list3) {
                if (!r26.n0.N((java.lang.String) obj3)) {
                    arrayList2.add(obj3);
                }
            }
            java.lang.String str = a17.f256697c;
            if (str == null) {
                str = "";
            }
            if (!(!r26.n0.N(str))) {
                str = null;
            }
            c17 = str != null ? com.tencent.mm.protobuf.g.c(str) : null;
            fu0.p pVar = fu0.p.f266809a;
            t07 = kz5.n0.t0(fu0.p.b(pVar, arrayList), fu0.p.b(pVar, arrayList2));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resolve: assetCount=");
            sb6.append(arrayList.size());
            sb6.append(", effectCount=");
            sb6.append(arrayList2.size());
            sb6.append(", resolvedImageCount=");
            sb6.append(((java.util.ArrayList) t07).size());
            sb6.append(", hasPrompt=");
            sb6.append(c17 != null);
            com.tencent.mars.xlog.Log.i("MJCC.MusicRecommendCtx", sb6.toString());
            if (!t07.isEmpty()) {
                this.f266805d = c17;
                this.f266806e = t07;
                this.f266807f = 1;
                java.lang.Object a18 = fu0.p.a(pVar, t07, this);
                if (a18 == aVar) {
                    return aVar;
                }
                list = t07;
                gVar2 = c17;
                obj = a18;
            }
            return new fu0.m(t07, gVar, c17, t07.size());
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        list = (java.util.List) this.f266806e;
        gVar2 = (com.tencent.mm.protobuf.g) this.f266805d;
        kotlin.ResultKt.throwOnFailure(obj);
        t07 = list;
        com.tencent.mm.protobuf.g gVar3 = gVar2;
        gVar = (com.tencent.mm.protobuf.g) obj;
        c17 = gVar3;
        return new fu0.m(t07, gVar, c17, t07.size());
    }
}
