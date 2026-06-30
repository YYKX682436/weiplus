package rf2;

/* loaded from: classes10.dex */
public final class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf2.o1 f394751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.dm4 f394752e;

    public g1(rf2.o1 o1Var, r45.dm4 dm4Var) {
        this.f394751d = o1Var;
        this.f394752e = dm4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rf2.o1 o1Var = this.f394751d;
        com.tencent.mm.plugin.finder.live.util.y.o(o1Var.f394837b, null, null, new rf2.f1(this.f394752e, o1Var, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget$initViews$2$1$_onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
