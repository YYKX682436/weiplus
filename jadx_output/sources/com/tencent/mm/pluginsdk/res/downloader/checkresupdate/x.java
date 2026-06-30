package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes12.dex */
public abstract class x {
    public static void a(com.tencent.mm.pluginsdk.res.downloader.model.n0 n0Var, boolean z17, boolean z18) {
        if (n0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "get null record, skip");
            return;
        }
        java.lang.String str = n0Var.field_urlKey;
        java.lang.String str2 = n0Var.field_filePath;
        java.lang.String str3 = n0Var.field_md5;
        boolean z19 = n0Var.field_fileCompress;
        boolean z27 = n0Var.field_fileEncrypt;
        byte[] bArr = n0Var.field_eccSignature;
        int P = com.tencent.mm.sdk.platformtools.t8.P(n0Var.field_fileVersion, 0);
        int i17 = n0Var.field_keyVersion;
        java.lang.String str4 = n0Var.field_encryptKey;
        boolean z28 = n0Var.field_deleted;
        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "queried info: deleted = " + z28 + ", filePath = " + str2 + ", md5 = " + str3 + ", originalMd5 = " + n0Var.field_originalMd5 + ", fileCompress = " + z19 + ", fileEncrypt = " + z27 + ", eccSignature = " + bArr + ", fileVersion = " + P + ", (encrypt key == empty) = " + com.tencent.mm.sdk.platformtools.t8.K0(str4));
        if (!z27) {
            if (z17) {
                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(n0Var.field_reportId, 53L);
                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(n0Var.field_reportId, 45L);
            }
            if (!z19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "file is not encrypted nor compressed, just return");
                return;
            }
        }
        if (i17 != P && z27) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "file version(%d) != key version(%d), skip", java.lang.Integer.valueOf(P), java.lang.Integer.valueOf(i17));
            if (i17 >= 0) {
                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(n0Var.field_reportId, 52L);
                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(n0Var.field_reportId, 45L);
                return;
            }
            return;
        }
        if (z28) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "this file should have been deleted, skip this decrypt-op");
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(n0Var.field_reportId, 51L);
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(n0Var.field_reportId, 45L);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4) && z27) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "encryptKey invalid, skip");
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(n0Var.field_reportId, 54L);
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(n0Var.field_reportId, 45L);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "this decrypt-op is invalid, record.md5 = %s, record.filePath = %s", str3, str2);
            return;
        }
        com.tencent.mm.pluginsdk.res.downloader.model.l0 l0Var = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a;
        if (l0Var.c(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "request(%s) is downloading or queueing, hold this decrypt-op", str);
            return;
        }
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(str2);
        if (p17 == null) {
            p17 = "";
        }
        if (!p17.equals(str3)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "md5 not match, file spoiled, skip this decrypt-op");
            n0Var.field_status = 3;
            l0Var.g(n0Var, true);
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(n0Var.field_reportId, 56L);
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.e0.a(n0Var.field_reportId, 45L);
            return;
        }
        if (l0Var.c(str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdate.DoDecryptLogic", "request supposed to complete, send decrypt request %s", n0Var.field_urlKey);
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p c17 = com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c();
        int i18 = n0Var.field_resType;
        int i19 = n0Var.field_subType;
        java.lang.String str5 = n0Var.field_groupId2;
        c17.i(i18, i19, 1, (str5 != null ? str5 : "").equals("NewXml"));
        if (!z18) {
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().a(n0Var);
            return;
        }
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p c18 = com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c();
        c18.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "performDecryptDirectly, urlkey %s", n0Var.field_urlKey);
        c18.f189633b.getClass();
        new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.g0(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a.b(n0Var)).run();
    }
}
