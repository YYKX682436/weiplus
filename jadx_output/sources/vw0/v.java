package vw0;

/* loaded from: classes5.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetTitleView f440815d;

    public v(com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetTitleView setTitleView) {
        this.f440815d = setTitleView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/SetTitleView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rw0.e eVar = this.f440815d.f69337d;
        if (eVar != null) {
            eVar.S();
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/SetTitleView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
