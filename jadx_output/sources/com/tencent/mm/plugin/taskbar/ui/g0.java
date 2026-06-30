package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes11.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f172613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.z f172614e;

    public g0(com.tencent.mm.plugin.taskbar.ui.z zVar, int i17) {
        this.f172614e = zVar;
        this.f172613d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.taskbar.ui.z zVar = this.f172614e;
        int bottom = zVar.f172764f.getBottom() - zVar.f172769m;
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarAnimController", "closeHeader distance: %d, bottom: %d", java.lang.Integer.valueOf(bottom), java.lang.Integer.valueOf(zVar.f172764f.getBottom()));
        int i17 = zVar.f172761J ? 10 : 600;
        zVar.f172763e.smoothScrollBy(bottom, i17);
        zVar.F = !zVar.f172761J;
        zVar.f172761J = false;
        int i18 = zVar.I;
        if (i18 != 0) {
            zVar.I = 0;
        } else {
            i18 = this.f172613d;
        }
        zVar.j(false, false, i18, i17);
    }
}
