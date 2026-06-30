package xv0;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xv0.g f457379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xv0.a f457380e;

    public d(xv0.g gVar, xv0.a aVar) {
        this.f457379d = gVar;
        this.f457380e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/subpanels/color/ColorAdjPanel$setupViews$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xv0.g gVar = this.f457379d;
        xv0.a aVar = gVar.T;
        xv0.a aVar2 = this.f457380e;
        if (!kotlin.jvm.internal.o.b(aVar, aVar2)) {
            android.view.ViewGroup viewGroup = gVar.M;
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("seekbarContainer");
                throw null;
            }
            viewGroup.setVisibility(0);
            android.view.ViewGroup viewGroup2 = gVar.M;
            if (viewGroup2 == null) {
                kotlin.jvm.internal.o.o("seekbarContainer");
                throw null;
            }
            viewGroup2.setEnabled(true);
            xv0.a aVar3 = gVar.T;
            if (aVar3 != null) {
                aVar3.f457371b.setSelected(false);
            }
            aVar2.f457371b.setSelected(true);
            gVar.T = aVar2;
            gVar.L(aVar2.f457373d);
            com.tencent.mm.mj_publisher.finder.movie_composing.widgets.AdjustSeekBar adjustSeekBar = gVar.N;
            if (adjustSeekBar == null) {
                kotlin.jvm.internal.o.o("seekbar");
                throw null;
            }
            adjustSeekBar.setProgress(aVar2.f457373d);
            com.tencent.mm.mj_publisher.finder.movie_composing.widgets.AdjustSeekBar adjustSeekBar2 = gVar.N;
            if (adjustSeekBar2 == null) {
                kotlin.jvm.internal.o.o("seekbar");
                throw null;
            }
            adjustSeekBar2.getOnProgressChangedCallback().clear();
            com.tencent.mm.mj_publisher.finder.movie_composing.widgets.AdjustSeekBar adjustSeekBar3 = gVar.N;
            if (adjustSeekBar3 == null) {
                kotlin.jvm.internal.o.o("seekbar");
                throw null;
            }
            adjustSeekBar3.getOnProgressChangedCallback().add(new xv0.c(aVar2, gVar));
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/subpanels/color/ColorAdjPanel$setupViews$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
