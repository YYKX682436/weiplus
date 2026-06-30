package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes14.dex */
public final class lw implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.sx f135094a;

    public lw(com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar) {
        this.f135094a = sxVar;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("play new fail ");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f2487c) : null);
        com.tencent.mars.xlog.Log.e("FinderProjectionScreenUIC", sb6.toString());
        com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = this.f135094a;
        android.os.Message obtainMessage = ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) sxVar.f135940v).getValue()).obtainMessage(7);
        obtainMessage.arg1 = eVar != null ? eVar.f2487c : 0;
        obtainMessage.sendToTarget();
        com.tencent.mm.plugin.finder.viewmodel.component.sx.P6(sxVar, false);
    }

    @Override // z91.a
    public void b(aa1.e eVar) {
        com.tencent.mars.xlog.Log.i("FinderProjectionScreenUIC", "play new success");
        com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = this.f135094a;
        x91.h hVar = sxVar.f135941w;
        if (hVar != null) {
            hVar.f452651e.f452663a = x91.j.Playing;
        }
        if (hVar != null) {
            hVar.f();
        }
        x91.h hVar2 = sxVar.f135941w;
        if (hVar2 != null) {
            hVar2.g();
        }
        x91.h hVar3 = sxVar.f135941w;
        if (hVar3 != null) {
            hVar3.f452654h = (x91.i) ((jz5.n) sxVar.f135924J).getValue();
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.ww(sxVar.f135941w, sxVar));
        ((com.tencent.mm.sdk.platformtools.b4) ((jz5.n) sxVar.M).getValue()).d();
        com.tencent.mm.plugin.finder.viewmodel.component.sx.P6(sxVar, true);
    }
}
