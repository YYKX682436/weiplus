package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class se implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.he f209812d;

    public se(com.tencent.mm.ui.he heVar) {
        this.f209812d = heVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LauncherUI.MainTabUnreadMgr", "Account not Ready!!!");
            return;
        }
        if (this.f209812d.f208866g == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LauncherUI.MainTabUnreadMgr", "set tag job, but tab view is null");
            return;
        }
        ((km5.q) km5.u.d()).q(new com.tencent.mm.ui.je(this)).h(new com.tencent.mm.ui.ie(this)).f(this.f209812d.f208863d);
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.le(this), "UpdateSettingsRedDot");
    }

    public java.lang.String toString() {
        return super.toString() + "|setTagRunnable";
    }
}
