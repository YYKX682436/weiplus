package wt3;

/* loaded from: classes5.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f449485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wt3.t0 f449486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f449487f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(wt3.t0 t0Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f449486e = t0Var;
        this.f449487f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wt3.r0(this.f449486e, this.f449487f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wt3.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.r2 r2Var;
        byte[] bArr;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f449485d;
        wt3.t0 t0Var = this.f449486e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.r2 r2Var2 = t0Var.f449501v;
            if ((r2Var2 != null && r2Var2.a()) && (r2Var = t0Var.f449501v) != null) {
                this.f449485d = 1;
                if (r2Var.C(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLifeGetImageListRecommendAudioTask", "getMusicListResultCgi: classifyResultDatas.size=" + ((java.util.ArrayList) t0Var.f449500u).size());
        wt3.v0 v0Var = t0Var.f449498s;
        java.util.List<r45.iz6> list = t0Var.f449500u;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (r45.iz6 iz6Var : list) {
            r45.gb gbVar = new r45.gb();
            if (iz6Var == null || (bArr = pm0.v.D(iz6Var)) == null) {
                bArr = new byte[0];
            }
            gbVar.f375066e = new com.tencent.mm.protobuf.g(bArr, 0, bArr.length);
            arrayList.add(gbVar);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(arrayList);
        boolean z17 = this.f449487f;
        if (z17) {
            v0Var.f449519f = null;
        } else {
            v0Var.getClass();
        }
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        int enterScene = finderFeedReportObject != null ? finderFeedReportObject.getEnterScene() : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("GetListenVideoBgmList: type:");
        sb6.append(v0Var.f449517d);
        sb6.append(" loadFirstPage:");
        sb6.append(z17);
        sb6.append(", enterScene:");
        sb6.append(enterScene);
        sb6.append(" templateId:");
        sb6.append(v0Var.f449520g);
        sb6.append(" cgiSessionBuffer:");
        sb6.append(v0Var.f449519f != null);
        sb6.append(" idList:");
        sb6.append((java.lang.Object) null);
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLifeGetListenVideoBgmListHelper", sb6.toString());
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            jSONObject.put("enter_scene", enterScene);
            kotlin.Result.m521constructorimpl(jSONObject.put("template_id", v0Var.f449520g));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        pq5.g l17 = new jv3.a(v0Var.f449517d, v0Var.f449515b, v0Var.f449519f, v0Var.f449516c, null, linkedList, null, jSONObject.toString(), null, null, 0, 0, 0, null, 16144, null).l();
        if (l17 != null) {
            l17.f(v0Var.f449514a);
            l17.h(new wt3.u0(v0Var, z17));
        }
        return jz5.f0.f302826a;
    }
}
