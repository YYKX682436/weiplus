package qn2;

/* loaded from: classes3.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.n f365069d;

    public h(qn2.n nVar) {
        this.f365069d = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.cz1 cz1Var;
        r45.cz1 cz1Var2;
        r45.xy1 xy1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin$initRunningView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qn2.n nVar = this.f365069d;
        int i17 = 0;
        long j17 = ((mm2.e1) nVar.P0(mm2.e1.class)).f328988r.getLong(0);
        long j18 = ((on2.z2) nVar.P0(on2.z2.class)).f347097r.f369857d;
        long j19 = ((mm2.e1) nVar.P0(mm2.e1.class)).f328983m;
        java.lang.String str = ((mm2.e1) nVar.P0(mm2.e1.class)).f328992v;
        km2.z zVar = ((on2.z2) nVar.P0(on2.z2.class)).f347092m;
        int integer = (zVar == null || (cz1Var2 = zVar.f309232d) == null || (xy1Var = (r45.xy1) cz1Var2.getCustom(5)) == null) ? 0 : xy1Var.getInteger(0);
        int i18 = ek2.s0.f253530v;
        km2.z zVar2 = ((on2.z2) nVar.P0(on2.z2.class)).f347092m;
        if (zVar2 != null && (cz1Var = zVar2.f309232d) != null) {
            i17 = cz1Var.getInteger(6);
        }
        new ek2.s0(new ek2.t0(j17, j19, str, 0, "", integer, "", 1, i17, j18, null, null, 0, null, null)).l().K(new qn2.j(nVar));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin$initRunningView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
