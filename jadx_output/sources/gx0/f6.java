package gx0;

/* loaded from: classes5.dex */
public final class f6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276406d;

    public f6(gx0.w8 w8Var) {
        this.f276406d = w8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/uic/MovieMainComposingUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gx0.w8 w8Var = this.f276406d;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q qVar = (com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q) w8Var.t7().f340428b.j();
        boolean z17 = false;
        if ((qVar == null ? false : qVar instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.r) && com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.a(qVar)) {
            z17 = true;
        }
        if (!z17) {
            w8Var.j();
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/MovieMainComposingUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
