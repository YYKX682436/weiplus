package rf2;

/* loaded from: classes10.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.f02 f394758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f394759e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f394760f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.pl4 f394761g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f394762h;

    public h0(r45.f02 f02Var, rf2.v0 v0Var, boolean z17, r45.pl4 pl4Var, android.view.View view) {
        this.f394758d = f02Var;
        this.f394759e = v0Var;
        this.f394760f = z17;
        this.f394761g = pl4Var;
        this.f394762h = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshBtnStatus$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rf2.t tVar = rf2.t.f394890a;
        java.lang.String str = this.f394758d.f373878d;
        if (str == null) {
            str = "";
        }
        tVar.e(str, 27, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        rf2.v0 v0Var = this.f394759e;
        kotlinx.coroutines.y0 y0Var = v0Var.f394915b.f231544r;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new rf2.g0(this.f394760f, v0Var, this.f394761g, this.f394758d, this.f394762h, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshBtnStatus$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
