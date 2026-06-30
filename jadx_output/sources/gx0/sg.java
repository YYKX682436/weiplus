package gx0;

/* loaded from: classes5.dex */
public final class sg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.bh f276966d;

    public sg(gx0.bh bhVar) {
        this.f276966d = bhVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC$initTimelineToolbarListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gx0.fd fdVar = (gx0.fd) this.f276966d.V6().f276255v.getValue();
        int i17 = fdVar == null ? -1 : gx0.rg.f276934a[fdVar.ordinal()];
        if (i17 == 1) {
            gx0.bh bhVar = this.f276966d;
            pf5.e.launchUI$default(bhVar, null, null, new gx0.pg(bhVar, null), 3, null);
        } else if (i17 == 2 || i17 == 3) {
            gx0.bh bhVar2 = this.f276966d;
            pf5.e.launchUI$default(bhVar2, null, null, new gx0.qg(bhVar2, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/TimelineToolbarUIC$initTimelineToolbarListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
