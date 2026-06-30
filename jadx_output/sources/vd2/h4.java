package vd2;

/* loaded from: classes3.dex */
public final class h4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f435757d;

    /* renamed from: e, reason: collision with root package name */
    public int f435758e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.FinderLiveViewCallback f435759f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.m84 f435760g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback, r45.m84 m84Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f435759f = finderLiveViewCallback;
        this.f435760g = m84Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vd2.h4(this.f435759f, this.f435760g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vd2.h4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        yl2.g1 g1Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f435758e;
        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = this.f435759f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.ui.MMActivity mMActivity = finderLiveViewCallback.f111484f;
            kotlin.jvm.internal.o.e(mMActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            yl2.g1 g1Var2 = new yl2.g1(mMActivity, 15, 0L, 4, null);
            g1Var2.f463012e = false;
            this.f435757d = g1Var2;
            this.f435758e = 1;
            java.lang.Object t17 = yl2.g1.t(g1Var2, null, false, this, 3, null);
            if (t17 == aVar) {
                return aVar;
            }
            g1Var = g1Var2;
            obj = t17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g1Var = (yl2.g1) this.f435757d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        yl2.a0 a0Var = (yl2.a0) obj;
        if (a0Var instanceof yl2.x) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "startLiveCheck failed, errCode:" + ((yl2.x) a0Var).f463081a);
        } else if (a0Var instanceof yl2.z) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "startLiveCheck continueLive");
            g1Var.d(((yl2.z) a0Var).f463087a);
        } else if (a0Var instanceof yl2.y) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "startLiveCheck success, creating KTV room");
            vd2.w5.f435980a = new vd2.g4(g1Var, a0Var, this.f435760g);
            com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = finderLiveViewCallback.f111495t.f436054e;
            com.tencent.mm.plugin.finder.live.plugin.wg0 wg0Var = finderLiveVisitorPluginLayout != null ? (com.tencent.mm.plugin.finder.live.plugin.wg0) finderLiveVisitorPluginLayout.getPlugin(com.tencent.mm.plugin.finder.live.plugin.wg0.class) : null;
            if (wg0Var != null) {
                wg0Var.u1(false);
            }
        }
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
        ml2.y4 y4Var = ml2.j0.f327583i;
        ml2.y3 y3Var = ml2.y3.f328280r;
        y4Var.getClass();
        y4Var.f328291c0 = y3Var;
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f327325e;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 2);
        jSONObject.put("entrance_type", 15);
        jSONObject.put("entrance_id", g1Var.f463010c);
        zy2.zb.j5(zbVar, 36L, jSONObject.toString(), null, 4, null);
        return jz5.f0.f302826a;
    }
}
