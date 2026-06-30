package com.tencent.mm.plugin.gif;

/* loaded from: classes15.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gif.k f142131d;

    public f(com.tencent.mm.plugin.gif.k kVar) {
        this.f142131d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.gif.k kVar = this.f142131d;
        if ((kVar.f142137d || kVar.f142150t == 0) && android.os.SystemClock.uptimeMillis() >= kVar.A) {
            kVar.f142155y = java.lang.System.currentTimeMillis();
            kVar.I = true;
            kVar.invalidateSelf();
            com.tencent.mm.plugin.gif.x xVar = kVar.F;
            if (xVar != null) {
                xVar.invalidate();
            }
        }
    }
}
