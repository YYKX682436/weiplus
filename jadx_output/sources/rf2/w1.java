package rf2;

/* loaded from: classes10.dex */
public final class w1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.c2 f394945e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rf2.d2 f394946f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394947g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f394948h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f394949i;

    public w1(java.lang.String str, rf2.c2 c2Var, rf2.d2 d2Var, java.lang.String str2, android.widget.TextView textView, android.view.View view) {
        this.f394944d = str;
        this.f394945e = c2Var;
        this.f394946f = d2Var;
        this.f394947g = str2;
        this.f394948h = textView;
        this.f394949i = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget$refreshVoteState$4$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rf2.t.f394890a.e(this.f394944d, 8, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        rf2.c2 c2Var = this.f394945e;
        kotlinx.coroutines.y0 y0Var = c2Var.f394680b.f231544r;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new rf2.v1(c2Var, this.f394946f, this.f394947g, this.f394948h, this.f394944d, this.f394949i, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget$refreshVoteState$4$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
