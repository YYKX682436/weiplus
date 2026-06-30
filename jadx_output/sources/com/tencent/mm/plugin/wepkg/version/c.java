package com.tencent.mm.plugin.wepkg.version;

/* loaded from: classes8.dex */
public class c implements com.tencent.mm.plugin.wepkg.utils.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.version.WepkgVersionUpdater$WepkgNetSceneProcessTask f188513a;

    public c(com.tencent.mm.plugin.wepkg.version.WepkgVersionUpdater$WepkgNetSceneProcessTask wepkgVersionUpdater$WepkgNetSceneProcessTask) {
        this.f188513a = wepkgVersionUpdater$WepkgNetSceneProcessTask;
    }

    @Override // com.tencent.mm.plugin.wepkg.utils.i
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar;
        if (i17 != 0 || i18 != 0 || (fVar = oVar.f70711b.f70700a) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.WepkgVersionUpdater", "check wepkg version, cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, oVar.f70711b.f70700a);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(859L, 16L, 1L, false);
        } else {
            try {
                com.tencent.mm.plugin.wepkg.utils.n.d().postToWorker(new com.tencent.mm.plugin.wepkg.version.b(this, (r45.d30) fVar));
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.WepkgVersionUpdater", "get checkwepkgversion error");
            }
        }
    }
}
