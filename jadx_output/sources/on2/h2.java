package on2;

/* loaded from: classes3.dex */
public final class h2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on2.j2 f346927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f346928e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.c3 f346929f;

    public h2(on2.j2 j2Var, in5.s0 s0Var, so2.c3 c3Var) {
        this.f346927d = j2Var;
        this.f346928e = s0Var;
        this.f346929f = c3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersHeaderConvert$setClaimInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        on2.j2.n(this.f346927d, this.f346928e, this.f346929f.f410299g);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersHeaderConvert$setClaimInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
