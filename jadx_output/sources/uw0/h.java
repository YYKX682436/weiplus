package uw0;

/* loaded from: classes5.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.o f431563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.a f431564e;

    public h(uw0.o oVar, uw0.a aVar) {
        this.f431563d = oVar;
        this.f431564e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.maas.moviecomposing.segments.ClipSegment z76;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subpanels/ComposingAddContentDescPanelUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uw0.o oVar = this.f431563d;
        com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = oVar.f431589y;
        if (clipSegment != null && (z76 = oVar.z7(clipSegment)) != null) {
            oVar.R7();
            oVar.M7(z76);
            oVar.G7(this.f431564e, z76);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subpanels/ComposingAddContentDescPanelUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
