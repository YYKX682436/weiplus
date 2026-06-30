package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.type.IPCString f188471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f188472e;

    public t0(com.tencent.mm.plugin.wepkg.model.u0 u0Var, com.tencent.mm.ipcinvoker.type.IPCString iPCString, com.tencent.mm.ipcinvoker.r rVar) {
        this.f188471d = iPCString;
        this.f188472e = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wepkg.model.WepkgVersion e17 = com.tencent.mm.plugin.wepkg.model.o0.e(this.f188471d.f68406d);
        if (e17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.WepkgUpdater", "updateLiteApp, wepkgVersion is null");
            this.f188472e.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(e17.f188377g)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.WepkgUpdater", "pkgPath is null");
            this.f188472e.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
            return;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(e17.f188377g);
        if (!r6Var.m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.WepkgUpdater", "file not exists");
            this.f188472e.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
            return;
        }
        com.tencent.mm.plugin.wepkg.model.o oVar = new com.tencent.mm.plugin.wepkg.model.o(r6Var);
        if (!oVar.f188447b) {
            this.f188472e.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
            return;
        }
        java.util.Iterator it = oVar.c().iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.wepkg.model.j.a((com.tencent.mm.plugin.wepkg.model.k) it.next());
        }
        this.f188472e.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(true));
    }
}
