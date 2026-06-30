package df2;

/* loaded from: classes3.dex */
public final class lj implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.oj f230670d;

    public lj(df2.oj ojVar) {
        this.f230670d = ojVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        df2.oj ojVar = this.f230670d;
        df2.pv pvVar = (df2.pv) ojVar.controller(df2.pv.class);
        java.lang.Object obj2 = pvVar != null ? pvVar.f231115p : null;
        boolean z17 = (obj2 instanceof com.tencent.mm.plugin.finder.live.plugin.r60 ? (com.tencent.mm.plugin.finder.live.plugin.r60) obj2 : null) != null;
        kotlin.jvm.internal.o.d(bool);
        if (bool.booleanValue() && !z17) {
            ojVar.d7();
            return;
        }
        android.view.View f76 = ojVar.f7();
        if (f76 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(f76, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveGameTeamUpController$onViewMount$2", "onChanged", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f76.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(f76, "com/tencent/mm/plugin/finder/live/controller/LiveGameTeamUpController$onViewMount$2", "onChanged", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (z17) {
            ((mm2.c1) ojVar.business(mm2.c1.class)).P8(false);
        }
    }
}
