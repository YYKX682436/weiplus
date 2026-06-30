package sc2;

/* loaded from: classes2.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f405899d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f405900e;

    /* renamed from: f, reason: collision with root package name */
    public int f405901f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f405902g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405903h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405904i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f405905m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(sc2.h1 h1Var, in5.s0 s0Var, android.view.View view, xc2.p0 p0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f405902g = h1Var;
        this.f405903h = s0Var;
        this.f405904i = view;
        this.f405905m = p0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sc2.g1(this.f405902g, this.f405903h, this.f405904i, this.f405905m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sc2.g1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j17;
        sc2.g1 g1Var;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f405901f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            j17 = this.f405902g.C;
            android.content.Context context = this.f405903h.f293121e;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = activity != null ? (com.tencent.mm.view.RefreshLoadMoreLayout) activity.findViewById(com.tencent.mm.R.id.m6e) : null;
            g1Var = this;
            refreshLoadMoreLayout = refreshLoadMoreLayout2;
        } else if (i17 == 1) {
            long j18 = this.f405899d;
            refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) this.f405900e;
            kotlin.ResultKt.throwOnFailure(obj);
            g1Var = this;
            j17 = j18 - 100;
            g1Var.f405902g.C = j17;
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j17 = this.f405899d;
            refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) this.f405900e;
            kotlin.ResultKt.throwOnFailure(obj);
            g1Var = this;
        }
        while (true) {
            jz5.f0 f0Var = jz5.f0.f302826a;
            in5.s0 s0Var = g1Var.f405903h;
            sc2.h1 h1Var = g1Var.f405902g;
            if (j17 <= 0) {
                android.view.ViewGroup viewGroup = h1Var.H;
                if (viewGroup != null) {
                    h1Var.K(viewGroup, 8);
                }
                h1Var.S(s0Var, g1Var.f405904i, g1Var.f405905m);
                h1Var.R(s0Var);
                return f0Var;
            }
            boolean z17 = false;
            if (refreshLoadMoreLayout != null && refreshLoadMoreLayout.isRefreshing) {
                z17 = true;
            }
            if (z17) {
                h1Var.J(s0Var);
                return f0Var;
            }
            if (h1Var.D) {
                g1Var.f405900e = refreshLoadMoreLayout;
                g1Var.f405899d = j17;
                g1Var.f405901f = 2;
                if (kotlinx.coroutines.k1.b(100L, g1Var) == aVar) {
                    return aVar;
                }
            } else {
                g1Var.f405900e = refreshLoadMoreLayout;
                g1Var.f405899d = j17;
                g1Var.f405901f = 1;
                if (kotlinx.coroutines.k1.b(100L, g1Var) == aVar) {
                    return aVar;
                }
                j17 -= 100;
                g1Var.f405902g.C = j17;
            }
        }
    }
}
