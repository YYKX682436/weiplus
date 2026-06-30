package ui2;

/* loaded from: classes8.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi2.b f428093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ui2.f f428094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f428095f;

    public e(vi2.b bVar, ui2.f fVar, int i17) {
        this.f428093d = bVar;
        this.f428094e = fVar;
        this.f428095f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetAcceptRecommendItemConvert$bindApplyButton$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vi2.b bVar = this.f428093d;
        boolean z17 = bVar.f437540m;
        int i17 = this.f428095f;
        ui2.f fVar = this.f428094e;
        if (z17) {
            si2.a aVar = fVar.f428096e;
            if (aVar != null) {
                aVar.f(i17, bVar.f437544d);
            }
        } else {
            si2.a aVar2 = fVar.f428096e;
            if (aVar2 != null) {
                aVar2.e(i17, bVar.f437544d);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetAcceptRecommendItemConvert$bindApplyButton$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
