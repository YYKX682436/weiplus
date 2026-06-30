package df2;

/* loaded from: classes3.dex */
public final class rs extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f231265d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs(df2.lt ltVar) {
        super(0);
        this.f231265d = ltVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df2.lt ltVar = this.f231265d;
        android.view.ViewGroup viewGroup = ltVar.f230704J;
        android.content.Context context = viewGroup != null ? viewGroup.getContext() : null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            ml2.e4 e4Var = ml2.e4.f327378g;
            r0Var.Qk(e4Var);
            pf5.z zVar = pf5.z.f353948a;
            if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveExitAnimateOpUIC.class)).f116991q = true;
            com.tencent.mm.plugin.finder.live.view.ub ubVar = ltVar.f291099e;
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
            if (k0Var != null) {
                qo0.c.a(k0Var, qo0.b.f365391o, null, 2, null);
            }
            te2.t8.f418440a.a(3, ((mm2.c1) ltVar.business(mm2.c1.class)).U4, ((mm2.c1) ltVar.business(mm2.c1.class)).f328807g2, true);
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0 r0Var2 = (ml2.r0) c17;
            km2.n nVar = dk2.ef.H;
            ml2.r0.Ck(r0Var2, activity, e4Var, nVar != null ? nVar.f309160l : null, false, null, 24, null);
            ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Rj().y0();
            ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Nj().J0();
        }
        return jz5.f0.f302826a;
    }
}
