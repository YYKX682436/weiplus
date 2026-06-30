package ui2;

/* loaded from: classes8.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ui2.i f428097d;

    public g(ui2.i iVar) {
        this.f428097d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetHeaderConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        si2.a aVar = this.f428097d.f428099e;
        if (aVar != null) {
            aVar.c();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetHeaderConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
