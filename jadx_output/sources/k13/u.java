package k13;

/* loaded from: classes3.dex */
public final class u implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI f303267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k13.x f303268e;

    public u(com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI forceNotifyListUI, k13.x xVar) {
        this.f303267d = forceNotifyListUI;
        this.f303268e = xVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI forceNotifyListUI = this.f303267d;
        com.tencent.mars.xlog.Log.i(forceNotifyListUI.f137335d, "OnLongClick!");
        rl5.r rVar = new rl5.r(forceNotifyListUI.getContext());
        k13.x xVar = this.f303268e;
        int[] iArr = forceNotifyListUI.f137341m;
        rVar.g(view, 0, 0L, xVar, xVar, iArr[0], iArr[1]);
        yj0.a.i(true, this, "com/tencent/mm/plugin/forcenotify/ui/ForceNotifyListUI$ForceNotifyViewHolder$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
