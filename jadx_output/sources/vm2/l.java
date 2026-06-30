package vm2;

/* loaded from: classes10.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vm2.m f438095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vm2.n f438096e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f438097f;

    public l(vm2.m mVar, vm2.n nVar, int i17) {
        this.f438095d = mVar;
        this.f438096e = nVar;
        this.f438097f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f438095d.f438098e.m1(this.f438096e.f438099d, this.f438097f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
