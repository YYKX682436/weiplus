package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes14.dex */
public final class mw implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.sx f135218a;

    public mw(com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar) {
        this.f135218a = sxVar;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set AVTransportURI fail ");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f2487c) : null);
        com.tencent.mars.xlog.Log.e("FinderProjectionScreenUIC", sb6.toString());
        com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = this.f135218a;
        android.os.Message obtainMessage = ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) sxVar.f135940v).getValue()).obtainMessage(7);
        obtainMessage.arg1 = eVar != null ? eVar.f2487c : 0;
        obtainMessage.sendToTarget();
        com.tencent.mm.plugin.finder.viewmodel.component.sx.P6(sxVar, false);
    }

    @Override // z91.a
    public void b(aa1.e eVar) {
        com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = this.f135218a;
        x91.h hVar = sxVar.f135941w;
        if (hVar != null) {
            hVar.f452651e.f452663a = x91.j.Transitioning;
        }
        sxVar.getClass();
        pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.xw(hVar, sxVar));
        x91.h hVar2 = sxVar.f135941w;
        if (hVar2 != null) {
            hVar2.c(new com.tencent.mm.plugin.finder.viewmodel.component.lw(sxVar));
        }
    }
}
