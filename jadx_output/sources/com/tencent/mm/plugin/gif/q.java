package com.tencent.mm.plugin.gif;

/* loaded from: classes15.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gif.u f142185d;

    public q(com.tencent.mm.plugin.gif.u uVar) {
        this.f142185d = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.gif.u uVar = this.f142185d;
        if (uVar.f142191e) {
            return;
        }
        if ((uVar.f142190d || uVar.f142208y == 0) && android.os.SystemClock.uptimeMillis() >= uVar.F) {
            uVar.D = java.lang.System.currentTimeMillis();
            uVar.K = true;
            uVar.invalidateSelf();
        }
    }
}
