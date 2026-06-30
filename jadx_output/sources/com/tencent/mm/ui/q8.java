package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public class q8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.LauncherUIBottomTabView f209546d;

    public q8(com.tencent.mm.ui.LauncherUIBottomTabView launcherUIBottomTabView) {
        this.f209546d = launcherUIBottomTabView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/LauncherUIBottomTabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.tencent.mm.ui.LauncherUIBottomTabView launcherUIBottomTabView = this.f209546d;
        if (launcherUIBottomTabView.f196862y == intValue && intValue == 0 && java.lang.System.currentTimeMillis() - launcherUIBottomTabView.f196861x <= 300) {
            launcherUIBottomTabView.C.removeMessages(0);
            ((zr.b) com.tencent.mm.sdk.event.q.f192403a.a(zr.b.class)).O6(new zr.a(1, launcherUIBottomTabView.F));
            launcherUIBottomTabView.f196861x = java.lang.System.currentTimeMillis();
            launcherUIBottomTabView.f196862y = intValue;
            yj0.a.h(this, "com/tencent/mm/ui/LauncherUIBottomTabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (intValue == 0) {
            fg5.c.f262501a.a(1L, launcherUIBottomTabView.F, null, null);
        }
        if (launcherUIBottomTabView.f196845e != null) {
            if (intValue != 0 || launcherUIBottomTabView.f196862y != 0) {
                launcherUIBottomTabView.f196861x = java.lang.System.currentTimeMillis();
                launcherUIBottomTabView.f196862y = intValue;
                launcherUIBottomTabView.f196845e.onTabClick(intValue);
                yj0.a.h(this, "com/tencent/mm/ui/LauncherUIBottomTabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            launcherUIBottomTabView.C.sendEmptyMessageDelayed(0, 300L);
        }
        launcherUIBottomTabView.f196861x = java.lang.System.currentTimeMillis();
        launcherUIBottomTabView.f196862y = intValue;
        com.tencent.mars.xlog.Log.w("MicroMsg.LauncherUITabView", "on tab click, index %d, but listener is null", (java.lang.Integer) view.getTag());
        yj0.a.h(this, "com/tencent/mm/ui/LauncherUIBottomTabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
