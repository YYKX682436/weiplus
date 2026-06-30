package qh0;

@j95.b
/* loaded from: classes.dex */
public final class m extends i95.w implements rh0.u {
    public java.lang.String Ai() {
        return com.tencent.mm.vfs.q7.c("scan_passport_model") + "/card.xnet";
    }

    public boolean Bi(java.lang.String originResourceFilePath) {
        kotlin.jvm.internal.o.g(originResourceFilePath, "originResourceFilePath");
        java.lang.String Ai = Ai();
        if (!com.tencent.mm.vfs.w6.j(originResourceFilePath)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScanPassportFeatureService", "[saveFiletoLocal] failed：originResourceFilePath not exist");
            return false;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(originResourceFilePath);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(a17.toString());
        kotlin.jvm.internal.o.d(p17);
        com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanPassportFeatureService", "[recordMd5] ".concat(p17));
        L.putString("ScanPassportFeatureService.ScanPassportModelMd5", p17);
        if (com.tencent.mm.vfs.w6.j(Ai)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanPassportFeatureService", "[saveFiletoLocal] targetFilePath fileExists exist, first delete file ");
            com.tencent.mm.vfs.w6.h(Ai);
            ((qh0.m) ((rh0.u) i95.n0.c(rh0.u.class))).getClass();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(32227, "5,16," + java.lang.System.currentTimeMillis() + ",0");
        } else {
            ((qh0.m) ((rh0.u) i95.n0.c(rh0.u.class))).getClass();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(32227, "5,14," + java.lang.System.currentTimeMillis() + ",0");
        }
        com.tencent.mm.vfs.w6.c(originResourceFilePath, Ai);
        return true;
    }

    public final boolean wi() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanPassportFeatureService", "[getFileFromCache] begin");
        java.lang.String Bi = ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).Bi(193, 1);
        if (Bi == null) {
            Bi = "";
        }
        boolean Bi2 = Bi(Bi);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanPassportFeatureService", "[getFileFromCache] cacheFilePath : " + Bi + ", saveRet： " + Bi2);
        if (Bi2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanPassportFeatureService", "[getFileFromCache] success");
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ScanPassportFeatureService", "[getFileFromCache] failed");
        return false;
    }
}
