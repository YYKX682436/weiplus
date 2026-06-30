package df2;

/* loaded from: classes3.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f230023d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f230024e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f230025f;

    /* renamed from: g, reason: collision with root package name */
    public int f230026g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.sm1 f230027h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f230028i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ df2.k1 f230029m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(r45.sm1 sm1Var, yl2.g1 g1Var, df2.k1 k1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230027h = sm1Var;
        this.f230028i = g1Var;
        this.f230029m = k1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.e1(this.f230027h, this.f230028i, this.f230029m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.e1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        yl2.g1 g1Var;
        r45.sm1 sm1Var;
        df2.k1 k1Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230026g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.sm1 sm1Var2 = this.f230027h;
            if (sm1Var2 != null && (g1Var = this.f230028i) != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("gotoLive liveMode: ");
                r45.q12 q12Var = (r45.q12) sm1Var2.getCustom(0);
                sb6.append(q12Var != null ? new java.lang.Integer(q12Var.getInteger(0)) : null);
                sb6.append(" liveSubMode: ");
                r45.q12 q12Var2 = (r45.q12) sm1Var2.getCustom(0);
                sb6.append(q12Var2 != null ? new java.lang.Integer(q12Var2.getInteger(1)) : null);
                com.tencent.mars.xlog.Log.i("FinderCreateLiveGuideController", sb6.toString());
                df2.k1 k1Var2 = this.f230029m;
                this.f230023d = k1Var2;
                this.f230024e = g1Var;
                this.f230025f = sm1Var2;
                this.f230026g = 1;
                java.lang.Object t17 = yl2.g1.t(g1Var, null, false, this, 3, null);
                if (t17 == aVar) {
                    return aVar;
                }
                sm1Var = sm1Var2;
                obj = t17;
                k1Var = k1Var2;
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        sm1Var = (r45.sm1) this.f230025f;
        g1Var = (yl2.g1) this.f230024e;
        k1Var = (df2.k1) this.f230023d;
        kotlin.ResultKt.throwOnFailure(obj);
        yl2.a0 a0Var = (yl2.a0) obj;
        if (a0Var instanceof yl2.x) {
            com.tencent.mars.xlog.Log.i("FinderCreateLiveGuideController", "startLiveCheck failed, errCode:" + ((yl2.x) a0Var).f463081a);
        } else if (a0Var instanceof yl2.z) {
            com.tencent.mars.xlog.Log.i("FinderCreateLiveGuideController", "startLiveCheck continueLive");
            g1Var.d(((yl2.z) a0Var).f463087a);
        } else {
            if (!(a0Var instanceof yl2.y)) {
                throw new jz5.j();
            }
            com.tencent.mars.xlog.Log.i("FinderCreateLiveGuideController", "startLiveCheck success");
            com.tencent.mm.plugin.finder.live.plugin.wg0 wg0Var = (com.tencent.mm.plugin.finder.live.plugin.wg0) k1Var.R6(com.tencent.mm.plugin.finder.live.plugin.wg0.class);
            if (wg0Var != null) {
                wg0Var.u1(false);
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_PARAMS_POST_CREATE_LIVE", sm1Var.toByteArray());
            intent.putExtra("KEY_PARAMS_POST_STRATEGY_ID", k1Var.f230541t);
            intent.putExtra("KEY_PARAMS_POST_GUIDE_LIVE_ID", k1Var.f230542u);
            intent.putExtra("KEY_PARAMS_POST_GUIDE_FINDER_USER_NAME", k1Var.f230543v);
            g1Var.h(intent, ((yl2.y) a0Var).f463083a, false);
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f327583i;
            ml2.y3 y3Var = ml2.y3.f328278p;
            y4Var.getClass();
            y4Var.f328291c0 = y3Var;
            y4Var.m(y3Var);
            y4Var.a("strategy_id", java.lang.String.valueOf(k1Var.f230541t));
            y4Var.a("guide_live_id", java.lang.String.valueOf(k1Var.f230542u));
            y4Var.a("guide_finderusername", k1Var.f230543v);
        }
        return jz5.f0.f302826a;
    }
}
