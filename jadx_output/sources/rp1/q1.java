package rp1;

/* loaded from: classes14.dex */
public class q1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.FloatMenuView f398516d;

    public q1(com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView) {
        this.f398516d = floatMenuView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/view/FloatMenuView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView = this.f398516d;
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = floatMenuView.f93582m;
        if (floatBallView != null) {
            int i17 = floatMenuView.f93583n;
            int i18 = floatMenuView.f93584o;
            if (floatBallView.f93550q == null || !floatBallView.l(i17, i18)) {
                z17 = false;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "checkClickInCustomView click in customView");
                floatBallView.f93550q.performClick();
                z17 = true;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatMenuView", "checkClickInCustomView true");
                yj0.a.h(this, "com/tencent/mm/plugin/ball/view/FloatMenuView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) floatMenuView.f93586q).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.ball.ui.d dVar = (com.tencent.mm.plugin.ball.ui.d) ((mp1.f) it.next());
            dVar.getClass();
            yj0.a.a("com/tencent/mm/plugin/ball/ui/FloatBallContainer$2", "com/tencent/mm/plugin/ball/listener/OnFloatMenuViewListener", "onFloatMenuBackgroundClicked", "()V", dVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onFloatMenuBackgroundClicked");
            com.tencent.mm.plugin.ball.ui.n nVar = dVar.f93283a;
            nVar.f93328m.a(2);
            nVar.i();
            yj0.a.h(dVar, "com/tencent/mm/plugin/ball/ui/FloatBallContainer$2", "com/tencent/mm/plugin/ball/listener/OnFloatMenuViewListener", "onFloatMenuBackgroundClicked", "()V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ball/view/FloatMenuView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
