package df2;

/* loaded from: classes3.dex */
public final class op implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.sp f230994d;

    public op(df2.sp spVar) {
        this.f230994d = spVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var;
        android.view.ViewGroup J1;
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        kotlin.jvm.internal.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        df2.sp spVar = this.f230994d;
        if (booleanValue) {
            spVar.c7("onCardVisibleLiveData", false);
            return;
        }
        com.tencent.mars.xlog.Log.i(spVar.f231353m, "[onCardVisibleLiveData] try show bubble");
        android.view.View view = spVar.f231354n;
        if (view != null) {
            int i17 = spVar.f231362v;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LivePkgGiftBubbleGuideViewController$onViewMount$3$1", "onChanged", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/LivePkgGiftBubbleGuideViewController$onViewMount$3$1", "onChanged", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (spVar.f231362v != 0 || (ag0Var = (com.tencent.mm.plugin.finder.live.plugin.ag0) spVar.R6(com.tencent.mm.plugin.finder.live.plugin.ag0.class)) == null || (J1 = ag0Var.J1()) == null) {
            return;
        }
        if (!J1.isShown()) {
            J1 = null;
        }
        if (J1 == null || spVar.b7(J1)) {
            return;
        }
        spVar.c7("onCardVisibleLiveData", false);
    }
}
