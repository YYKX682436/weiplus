package v60;

/* loaded from: classes.dex */
public class w extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public static long f433416d;

    public w() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Class, java.lang.Class<zy.r>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        long j17;
        java.lang.Class cls = zy.r.class;
        am.r2 r2Var = ((com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent) iEvent).f54053g;
        boolean z17 = false;
        if (r2Var.f7759a != 200) {
            return false;
        }
        long j18 = f433416d;
        if (j18 > 0) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            j17 = java.lang.System.currentTimeMillis() - j18;
            if (j17 < 50) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2049, 2);
            } else if (j17 < 100) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2049, 3);
            } else if (j17 < 500) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2049, 4);
            } else if (j17 < 1000) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2049, 5);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2049, 6);
            }
        } else {
            j17 = -1;
        }
        try {
            try {
                java.lang.String str = r2Var.f7761c;
                com.tencent.mars.xlog.Log.i("MicroMsg.WxPayGetA8KeyResUpdateListener", "get update res type:%d subType:%d useTime:%d filePatch:%s", java.lang.Integer.valueOf(r2Var.f7759a), java.lang.Integer.valueOf(r2Var.f7760b), java.lang.Long.valueOf(j17), str);
                if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !com.tencent.mm.vfs.w6.j(str)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WxPayGetA8KeyResUpdateListener", "file:%s not exits", str);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2049, 1);
                    jx3.f.INSTANCE.d(31531, 0, 101);
                } else {
                    java.lang.String M = com.tencent.mm.vfs.w6.M(str);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(M)) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.WxPayGetA8KeyResUpdateListener", "file:%s content is empty", str);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2049, 1);
                        jx3.f.INSTANCE.d(31531, 0, 101);
                    } else {
                        com.tencent.mm.sdk.platformtools.o4.M("mmkv.wallet").putString("MMKV_KEY_GETA8KEY_CONFIG_FILE", str);
                        jx3.f.INSTANCE.d(31531, java.lang.Integer.valueOf(new org.json.JSONObject(M).getInt("version")), 0);
                    }
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxPayGetA8KeyResUpdateListener", e17, "", new java.lang.Object[0]);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2049, 7);
                jx3.f.INSTANCE.d(31531, 0, 102);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxPayGetA8KeyResUpdateListener", e18, "", new java.lang.Object[0]);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2049, 1);
                jx3.f.INSTANCE.d(31531, 0, 103);
            }
            zy.r rVar = (zy.r) i95.n0.c(cls);
            int i17 = r2Var.f7759a;
            cls = r2Var.f7760b;
            ((yy.a) rVar).Ui(i17, cls, r2Var.f7762d, false);
            z17 = true;
            return true;
        } catch (java.lang.Throwable th6) {
            ((yy.a) ((zy.r) i95.n0.c(cls))).Ui(r2Var.f7759a, r2Var.f7760b, r2Var.f7762d, z17);
            throw th6;
        }
    }
}
