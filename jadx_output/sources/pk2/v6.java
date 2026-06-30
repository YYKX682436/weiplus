package pk2;

/* loaded from: classes3.dex */
public final class v6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.w6 f356305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.h4 f356306e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f356307f;

    public v6(pk2.w6 w6Var, db5.h4 h4Var, int i17) {
        this.f356305d = w6Var;
        this.f356306e = h4Var;
        this.f356307f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet$RecycleViewAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        db5.t4 t4Var = this.f356305d.f356330e;
        if (t4Var != null) {
            t4Var.onMMMenuItemSelected(this.f356306e, this.f356307f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet$RecycleViewAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
