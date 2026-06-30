package vw0;

/* loaded from: classes5.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView f440773d;

    public f(com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView captionView) {
        this.f440773d = captionView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView.f69319s;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView captionView = this.f440773d;
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(captionView.getContext());
        i0Var.d(com.tencent.mm.R.string.m_d);
        i0Var.f(com.tencent.mm.R.string.m_c);
        int color = j65.q.a(captionView.getContext()).getColor(com.tencent.mm.R.color.acu, null);
        com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
        aVar.W = color;
        aVar.E = new vw0.i(captionView);
        i0Var.e(com.tencent.mm.R.string.apj);
        i0Var.h();
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
