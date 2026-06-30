package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public class s8 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.LauncherUIBottomTabView f209777d;

    public s8(com.tencent.mm.ui.LauncherUIBottomTabView launcherUIBottomTabView) {
        this.f209777d = launcherUIBottomTabView;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/LauncherUIBottomTabView$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        if (intValue == 0) {
            com.tencent.mm.ui.LauncherUIBottomTabView launcherUIBottomTabView = this.f209777d;
            if (launcherUIBottomTabView.f196862y == intValue) {
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.conversation.RepairerConfigConvUnreadMode()) == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUITabView", "onMainTabLongClick");
                    launcherUIBottomTabView.C.removeMessages(0);
                    ((zr.b) com.tencent.mm.sdk.event.q.f192403a.a(zr.b.class)).O6(new zr.a(2, launcherUIBottomTabView.F));
                    launcherUIBottomTabView.f196861x = java.lang.System.currentTimeMillis();
                    launcherUIBottomTabView.f196862y = intValue;
                    yj0.a.i(true, this, "com/tencent/mm/ui/LauncherUIBottomTabView$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                    return true;
                }
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/LauncherUIBottomTabView$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
