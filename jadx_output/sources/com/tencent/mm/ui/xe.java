package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class xe implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.he f212552d;

    public xe(com.tencent.mm.ui.he heVar) {
        this.f212552d = heVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.he heVar = this.f212552d;
        if (heVar.f208868i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.MainTabUnreadMgr", "remove setTagRunnable");
            com.tencent.mm.sdk.platformtools.u3.l(heVar.f208869m);
        }
    }
}
