package k13;

/* loaded from: classes8.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI f303274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k13.x f303275e;

    public w(com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI forceNotifyListUI, k13.x xVar) {
        this.f303274d = forceNotifyListUI;
        this.f303275e = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = this.f303274d.f137335d;
        k13.x xVar = this.f303275e;
        com.tencent.mars.xlog.Log.i(str, "resetView onClick! username:%s", xVar.f303281h);
        ((h13.l0) i95.n0.c(h13.l0.class)).fj(xVar.f303281h);
        xVar.f303280g.animate().rotation(360.0f).setDuration(300L).withEndAction(new k13.v(xVar)).start();
        yj0.a.h(this, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
