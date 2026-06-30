package d35;

@j95.b
/* loaded from: classes12.dex */
public final class j extends jm0.o implements qx.h0 {
    public java.lang.String Zi(oi3.g gVar, java.lang.String sendFilePath) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(sendFilePath, "sendFilePath");
        d35.i iVar = d35.i.f226347a;
        if (gVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileSmartServerMgr", "msgInfo is null, or attachInfo is null");
            return null;
        }
        iVar.e();
        com.tencent.mm.lan_cs.SmartServer$ServerFileInfo smartServer$ServerFileInfo = new com.tencent.mm.lan_cs.SmartServer$ServerFileInfo();
        smartServer$ServerFileInfo.cryptKey = com.tencent.mm.modelcdntran.s1.cj().d();
        boolean z17 = d35.i.f226348b;
        int i17 = gVar.f345617d;
        if (z17) {
            str = "/lan_" + gVar.getString(i17 + 3) + '_' + gm0.m.g() + '_' + gVar.getLong(i17 + 0) + '_' + gVar.getLong(i17 + 2);
        } else {
            str = "";
        }
        smartServer$ServerFileInfo.cgi = str;
        smartServer$ServerFileInfo.filePath = com.tencent.mm.vfs.w6.i(sendFilePath, false);
        smartServer$ServerFileInfo.idleTimeoutMs = (int) iVar.b();
        smartServer$ServerFileInfo.totalSendTimeoutMs = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_file_lan_send_total_send_timeout_ms, -1);
        smartServer$ServerFileInfo.betweenRequestTimeoutMs = (int) ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_file_lan_send_between_request_timeout_ms, 60000L);
        com.tencent.mm.lan_cs.SmartServer$Java2C.addFileInfo(smartServer$ServerFileInfo);
        java.lang.String cgi = smartServer$ServerFileInfo.cgi;
        kotlin.jvm.internal.o.f(cgi, "cgi");
        java.lang.String cryptKey = smartServer$ServerFileInfo.cryptKey;
        kotlin.jvm.internal.o.f(cryptKey, "cryptKey");
        java.lang.String c17 = iVar.c(cgi, cryptKey);
        com.tencent.mars.xlog.Log.i("MicroMsg.FileSmartServerMgr", "addFileInfo msgInfo:" + gVar.getLong(i17 + 0) + " filePath:" + sendFilePath + " url:" + c17 + " aesKey:" + com.tencent.mm.sdk.platformtools.t8.G1(smartServer$ServerFileInfo.cryptKey));
        return c17;
    }

    public void aj(long j17, java.lang.String str) {
        com.tencent.mm.pluginsdk.model.app.d J0 = com.tencent.mm.pluginsdk.model.app.u5.wi().J0(j17, str);
        if (J0 != null) {
            com.tencent.mm.vfs.w6.h(J0.field_fileFullPath);
            com.tencent.mm.pluginsdk.model.app.u5.wi().delete(J0, "msgInfoId");
        }
        tg3.o1 o1Var = tg3.p1.f419206a;
        if (str == null) {
            str = "";
        }
        o1Var.e(str, j17);
    }

    public boolean bj() {
        return j62.e.g().c(new com.tencent.mm.repairer.config.file.RepairerConfigRemoveCheckBig()) != 1;
    }
}
