package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes14.dex */
public final class lx implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.sx f135095a;

    public lx(com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar) {
        this.f135095a = sxVar;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop fail ");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f2487c) : null);
        com.tencent.mars.xlog.Log.e("FinderProjectionScreenUIC", sb6.toString());
        pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.kx(this.f135095a));
    }

    @Override // z91.a
    public void b(aa1.e eVar) {
        com.tencent.mars.xlog.Log.i("FinderProjectionScreenUIC", "stop success");
        com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = this.f135095a;
        x91.h hVar = sxVar.f135941w;
        if (hVar != null) {
            hVar.f452651e.f452663a = x91.j.Stopped;
        }
        if (hVar != null) {
            hVar.h();
        }
        x91.h hVar2 = sxVar.f135941w;
        if (hVar2 != null) {
            hVar2.i();
        }
        x91.h hVar3 = sxVar.f135941w;
        if (hVar3 != null) {
            hVar3.f452654h = null;
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.vw(hVar3, sxVar, true));
        sxVar.f135941w = null;
        sxVar.f135942x = 0L;
    }
}
