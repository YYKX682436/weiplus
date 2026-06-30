package gx0;

/* loaded from: classes5.dex */
public final class ag implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.gg f276212d;

    public ag(gx0.gg ggVar) {
        this.f276212d = ggVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/uic/SubtitleRecommendedUseUIC$subtitleTipView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gx0.gg ggVar = this.f276212d;
        yy0.m7 m7Var = (yy0.m7) ggVar.R6().O6();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.w2(m7Var, null), 3, null);
        ggVar.a7();
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/SubtitleRecommendedUseUIC$subtitleTipView$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
