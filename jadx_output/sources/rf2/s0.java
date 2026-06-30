package rf2;

/* loaded from: classes10.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f394884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.pl4 f394885e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.f02 f394886f;

    public s0(rf2.v0 v0Var, r45.pl4 pl4Var, r45.f02 f02Var) {
        this.f394884d = v0Var;
        this.f394885e = pl4Var;
        this.f394886f = f02Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshLotteryContent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rf2.v0.c(this.f394884d, this.f394885e);
        rf2.t tVar = rf2.t.f394890a;
        java.lang.String str = this.f394886f.f373878d;
        if (str == null) {
            str = "";
        }
        tVar.e(str, 29, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshLotteryContent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
