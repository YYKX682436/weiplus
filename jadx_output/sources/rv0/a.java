package rv0;

/* loaded from: classes5.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.d f399915d;

    public a(rv0.d dVar) {
        this.f399915d = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/BgmVolumeAdjPanel$setupViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rv0.d dVar = this.f399915d;
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJTextSeekBar mJTextSeekBar = dVar.L;
        if (mJTextSeekBar == null) {
            kotlin.jvm.internal.o.o("seekBar");
            throw null;
        }
        if (mJTextSeekBar.getValue() > 0) {
            dVar.setVolume(0.0f);
        } else {
            dVar.setVolume(100.0f);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/BgmVolumeAdjPanel$setupViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
