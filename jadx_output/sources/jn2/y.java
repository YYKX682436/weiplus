package jn2;

/* loaded from: classes5.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.hy1 f300752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.z f300753e;

    public y(r45.hy1 hy1Var, jn2.z zVar) {
        this.f300752d = hy1Var;
        this.f300753e = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSmartBoxAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Choose smartbox ");
        r45.hy1 hy1Var = this.f300752d;
        sb6.append(hy1Var.f376553f);
        sb6.append(", id ");
        sb6.append(hy1Var.f376552e);
        sb6.append(", real key ");
        sb6.append(hy1Var.f376554g);
        sb6.append(", type ");
        sb6.append(hy1Var.f376551d);
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorSingSongAddPanelSmartBoxAdapter", sb6.toString());
        this.f300753e.f300760d.invoke(hy1Var);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSmartBoxAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
