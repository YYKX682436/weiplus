package yl2;

/* loaded from: classes.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f463085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f463086e;

    public y0(com.tencent.mm.ui.widget.dialog.y1 y1Var, v65.n nVar) {
        this.f463085d = y1Var;
        this.f463086e = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/ui/livepost/FinderLivePostHelper$showEligibilityDialog$2$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelper", "eligibilityJumpInfo click cancel");
        this.f463085d.q();
        this.f463086e.a(jz5.f0.f302826a);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ui/livepost/FinderLivePostHelper$showEligibilityDialog$2$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
