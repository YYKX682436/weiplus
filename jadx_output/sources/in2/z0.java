package in2;

/* loaded from: classes8.dex */
public final class z0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.a1 f292940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f292941e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.yg f292942f;

    public z0(in2.a1 a1Var, int i17, dk2.yg ygVar) {
        this.f292940d = a1Var;
        this.f292941e = i17;
        this.f292942f = ygVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapter$onBindSingSongHolder$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        in2.a1 a1Var = this.f292940d;
        java.lang.String str = a1Var.f292796f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLongClickListener position:");
        int i17 = this.f292941e;
        sb6.append(i17);
        sb6.append(",dataList.size:");
        sb6.append(a1Var.f292798h.size());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        yz5.q qVar = a1Var.f292800m;
        if (qVar != null) {
            kotlin.jvm.internal.o.d(view);
            qVar.invoke(view, java.lang.Integer.valueOf(i17), this.f292942f);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapter$onBindSingSongHolder$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
