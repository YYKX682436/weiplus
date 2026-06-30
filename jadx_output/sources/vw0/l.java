package vw0;

/* loaded from: classes5.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetContentDescView f440803d;

    public l(com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetContentDescView setContentDescView) {
        this.f440803d = setContentDescView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.maas.base.MJID selectedClipSegmentID;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/SetContentDescView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetContentDescView setContentDescView = this.f440803d;
        selectedClipSegmentID = setContentDescView.getSelectedClipSegmentID();
        if (selectedClipSegmentID == null) {
            yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/SetContentDescView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        rw0.b bVar = setContentDescView.f69332d;
        if (bVar != null) {
            bVar.B(selectedClipSegmentID);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/SetContentDescView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
