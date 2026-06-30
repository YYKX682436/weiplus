package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class bb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ga f197875d;

    public bb(com.tencent.mm.ui.ga gaVar) {
        this.f197875d = gaVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.ga gaVar = this.f197875d;
        int width = gaVar.f208631J.getWidth();
        int i17 = gaVar.f208645g0;
        if (width < i17) {
            int i18 = i17 - width;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "expand back touch right:%s", java.lang.Integer.valueOf(i18));
            com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.INSTANCE.expand(gaVar.f208631J, 0, 0, i18, 0);
        }
    }
}
