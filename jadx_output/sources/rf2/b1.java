package rf2;

/* loaded from: classes10.dex */
public final class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.dm4 f394661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.o1 f394662e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rf2.w0 f394663f;

    public b1(r45.dm4 dm4Var, rf2.o1 o1Var, rf2.w0 w0Var) {
        this.f394661d = dm4Var;
        this.f394662e = o1Var;
        this.f394663f = w0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rf2.t tVar = rf2.t.f394890a;
        r45.dm4 dm4Var = this.f394661d;
        if (dm4Var == null || (str = dm4Var.f372575m) == null) {
            str = "";
        }
        tVar.e(str, 25, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        rf2.o1 o1Var = this.f394662e;
        com.tencent.mars.xlog.Log.i(o1Var.f394838c, "lotteryBtn clicked");
        if (!rf2.o1.a(o1Var)) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        kotlinx.coroutines.y0 y0Var = this.f394663f.f293120d;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new rf2.a1(o1Var, dm4Var, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
