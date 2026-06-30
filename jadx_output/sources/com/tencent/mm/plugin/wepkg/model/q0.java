package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class q0 extends com.tencent.mm.plugin.wepkg.model.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f188455b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188456c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.p0 f188457d;

    public q0(com.tencent.mm.plugin.wepkg.model.p0 p0Var, boolean z17, java.lang.String str) {
        this.f188457d = p0Var;
        this.f188455b = z17;
        this.f188456c = str;
    }

    @Override // com.tencent.mm.plugin.wepkg.model.a
    public void a(com.tencent.mm.plugin.wepkg.model.BaseWepkgProcessTask baseWepkgProcessTask) {
        java.lang.Object obj = this.f188394a;
        boolean z17 = obj instanceof java.lang.String;
        boolean z18 = this.f188455b;
        com.tencent.mm.plugin.wepkg.model.p0 p0Var = this.f188457d;
        if (!z17) {
            p0Var.f(z18, this.f188456c, 2);
            return;
        }
        final java.lang.String str = (java.lang.String) obj;
        boolean z19 = baseWepkgProcessTask.f188333f;
        boolean z27 = !baseWepkgProcessTask.f188334g;
        p0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgUpdater", "notifyBigPkgDownloadComplete: " + str);
        com.tencent.mm.plugin.wepkg.event.h.a(new com.tencent.mm.plugin.wepkg.event.DownloadBigPkgCompleteNotify(str, z19, z27), null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgUpdater", "updateLiteApp, pkgId : %s, success : %b, haveDownloadAction : %b", str, java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z27));
        if (z19 && z27) {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(str), com.tencent.mm.plugin.wepkg.model.u0.class, new com.tencent.mm.ipcinvoker.r() { // from class: com.tencent.mm.plugin.wepkg.model.p0$$a
                @Override // com.tencent.mm.ipcinvoker.r
                public final void a(java.lang.Object obj2) {
                    if (((com.tencent.mm.ipcinvoker.type.IPCBoolean) obj2).f68400d) {
                        com.tencent.mm.plugin.wepkg.event.h.a(new com.tencent.mm.plugin.wepkg.event.LiteInfoUpdateCompleteNotify(str), null);
                    }
                }
            });
        }
        p0Var.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            p0Var.f(z18, str, 3);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgUpdater", "update preload files. pkgid:%s, isAutoUpdate:%s", str, java.lang.Boolean.valueOf(z18));
        java.util.List b17 = com.tencent.mm.plugin.wepkg.model.o0.b(str);
        if (!com.tencent.mm.sdk.platformtools.t8.L0(b17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WepkgUpdater", "pkgid:%s, %s preload files need to download", str, java.lang.Integer.valueOf(b17.size()));
        }
        p0Var.c(str, b17, z18);
    }
}
