package qm2;

/* loaded from: classes3.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qm2.u f364736d;

    public l(qm2.u uVar) {
        this.f364736d = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/startlive/FinderStartLiveNoticeUIC$initPostLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "coLiveAnchorBar clicked → openFromCurrentLive");
        com.tencent.mm.plugin.finder.live.widget.nb.W.a(this.f364736d.getActivity());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/startlive/FinderStartLiveNoticeUIC$initPostLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
