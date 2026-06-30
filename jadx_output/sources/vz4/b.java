package vz4;

/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.plugin.wepkg.model.s f441718a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f441719b;

    public static java.lang.String a() {
        com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion;
        com.tencent.mm.plugin.wepkg.model.s sVar = f441718a;
        return (sVar == null || (wepkgVersion = sVar.f188462d) == null) ? "" : wepkgVersion.f188376f;
    }

    public static void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CommJsLoader", "load");
        java.lang.String c17 = c();
        vz4.a aVar = new vz4.a();
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Wepkg.WepkgProcessTaskPerformer", "getWepkgVersionRecordWithAbleAsync", new java.lang.Object[0]);
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask();
        wepkgCrossProcessTask.f188343h = 3002;
        wepkgCrossProcessTask.f188344i.f188374d = c17;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            wepkgCrossProcessTask.z();
        } else {
            wepkgCrossProcessTask.f188350r = new com.tencent.mm.plugin.wepkg.model.j0(aVar, wepkgCrossProcessTask);
            wepkgCrossProcessTask.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c() {
        /*
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r0 = com.tencent.mm.plugin.game.commlib.i.e()
            if (r0 == 0) goto Lf
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r0 = com.tencent.mm.plugin.game.commlib.i.f139381a
            m53.v r0 = r0.CommJsLib
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.f324115d
            goto L13
        Lf:
            com.tencent.mm.plugin.game.commlib.i.s()
        L12:
            r0 = 0
        L13:
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r1 != 0) goto L1a
            return r0
        L1a:
            java.lang.String r0 = "commlib"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vz4.b.c():java.lang.String");
    }
}
