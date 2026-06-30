package ui2;

/* loaded from: classes8.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi2.b f428105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ui2.q f428106e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f428107f;

    public p(vi2.b bVar, ui2.q qVar, int i17) {
        this.f428105d = bVar;
        this.f428106e = qVar;
        this.f428107f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicWaitItemConvert$onBindViewHolder$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vi2.b bVar = this.f428105d;
        boolean z17 = bVar.f437540m;
        int i17 = this.f428107f;
        ui2.q qVar = this.f428106e;
        if (z17) {
            si2.a aVar = qVar.f428108e;
            if (aVar != null) {
                aVar.f(i17, bVar.f437544d);
            }
        } else {
            si2.a aVar2 = qVar.f428108e;
            if (aVar2 != null) {
                aVar2.e(i17, bVar.f437544d);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicWaitItemConvert$onBindViewHolder$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
