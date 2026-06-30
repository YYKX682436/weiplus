package rm2;

/* loaded from: classes3.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rm2.d f397436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rm2.a f397437e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f397438f;

    public c(rm2.d dVar, rm2.a aVar, int i17) {
        this.f397436d = dVar;
        this.f397437e = aVar;
        this.f397438f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeModeSelectAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.p pVar = this.f397436d.f397440e;
        if (pVar != null) {
            pVar.invoke(this.f397437e, java.lang.Integer.valueOf(this.f397438f));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeModeSelectAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
