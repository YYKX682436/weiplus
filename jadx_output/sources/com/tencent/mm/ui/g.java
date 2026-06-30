package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.j f208613d;

    public g(com.tencent.mm.ui.j jVar) {
        this.f208613d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.j jVar = this.f208613d;
        int width = jVar.f208968a.getWidth();
        int i17 = jVar.f208987t;
        if (width < i17) {
            int i18 = i17 - width;
            com.tencent.mars.xlog.Log.i("MicroMsg.ActionBarCustomArea", "expand back touch right:%s", java.lang.Integer.valueOf(i18));
            com.tencent.mm.accessibility.core.area.ExpandTouchDelegate.INSTANCE.expand(jVar.f208968a, 0, 0, i18, 0);
        }
    }
}
