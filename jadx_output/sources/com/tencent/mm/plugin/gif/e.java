package com.tencent.mm.plugin.gif;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gif.k f142130d;

    public e(com.tencent.mm.plugin.gif.k kVar) {
        this.f142130d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.gif.x xVar = this.f142130d.F;
        if (xVar != null) {
            xVar.onAnimationEnd();
        }
    }
}
