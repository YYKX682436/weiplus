package rf2;

/* loaded from: classes10.dex */
public final class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf2.o1 f394972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.w0 f394973e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.dm4 f394974f;

    public z0(rf2.o1 o1Var, rf2.w0 w0Var, r45.dm4 dm4Var) {
        this.f394972d = o1Var;
        this.f394973e = w0Var;
        this.f394974f = dm4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rf2.o1 o1Var = this.f394972d;
        com.tencent.mars.xlog.Log.i(o1Var.f394838c, "participatedBtn clicked");
        if (!rf2.o1.a(o1Var)) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        kotlinx.coroutines.y0 y0Var = this.f394973e.f293120d;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new rf2.y0(o1Var, this.f394974f, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
