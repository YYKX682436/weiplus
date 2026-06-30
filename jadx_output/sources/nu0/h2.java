package nu0;

/* loaded from: classes5.dex */
public final class h2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f339953d;

    public h2(nu0.b4 b4Var) {
        this.f339953d = b4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nu0.b4 b4Var = this.f339953d;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q qVar = (com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q) ((nv0.d) ((jz5.n) b4Var.f339883s).getValue()).f340428b.j();
        boolean z17 = false;
        if ((qVar == null ? false : qVar instanceof com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.r) && com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.z.a(qVar)) {
            z17 = true;
        }
        if (!z17) {
            b4Var.j();
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/image_composing/uic/ImageMainComposingUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
