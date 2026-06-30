package com.tencent.mm.plugin.gif;

/* loaded from: classes10.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gif.n f142157d;

    public l(com.tencent.mm.plugin.gif.n nVar) {
        this.f142157d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        com.tencent.mm.plugin.gif.n nVar = this.f142157d;
        if (uptimeMillis >= nVar.B) {
            nVar.invalidateSelf();
        }
    }
}
