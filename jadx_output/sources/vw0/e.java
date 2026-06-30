package vw0;

/* loaded from: classes5.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView f440771d;

    public e(com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.CaptionView captionView) {
        this.f440771d = captionView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rw0.a aVar = this.f440771d.f69331r;
        if (aVar != null) {
            aVar.d0();
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/CaptionView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
