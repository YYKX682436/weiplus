package rf2;

/* loaded from: classes10.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f394825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f394826e;

    public n0(android.view.View view, rf2.v0 v0Var) {
        this.f394825d = view;
        this.f394826e = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshLotteryContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f394825d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshLotteryContent$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshLotteryContent$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rf2.v0 v0Var = this.f394826e;
        v0Var.f394917d = null;
        df2.un unVar = v0Var.f394915b;
        java.lang.String str = unVar.f231539m;
        com.tencent.mars.xlog.Log.i(str, "backToMainPage");
        r45.g02 g02Var = (r45.g02) ((kotlinx.coroutines.flow.h3) ((mm2.v4) unVar.business(mm2.v4.class)).f329477g).getValue();
        if (g02Var == null) {
            com.tencent.mars.xlog.Log.i(str, "backToMainPage but metaInfo null");
            unVar.Z6();
        } else {
            android.view.View view3 = unVar.f231540n;
            if (view3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController", "backToMainPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/controller/LiveMilestoneLotteryMainController", "backToMainPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            rf2.o1 o1Var = unVar.f231541o;
            if (o1Var != null) {
                o1Var.b(g02Var, false, true);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneLotteryWidget$refreshLotteryContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
