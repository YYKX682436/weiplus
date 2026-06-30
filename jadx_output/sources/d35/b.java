package d35;

/* loaded from: classes12.dex */
public final class b extends com.tencent.mm.modelbase.i {
    static {
        new d35.a(null);
    }

    public b(com.tencent.mm.pluginsdk.model.app.d attachInfo) {
        kotlin.jvm.internal.o.g(attachInfo, "attachInfo");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.yy5 yy5Var = new r45.yy5();
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(attachInfo.field_msgInfoTalker, attachInfo.field_msgInfoId);
        yy5Var.f391500d = n17.Q0();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(java.lang.Long.valueOf(n17.getMsgId()));
        sb6.append('_');
        sb6.append(java.lang.Long.valueOf(n17.getCreateTime()));
        yy5Var.f391501e = sb6.toString();
        yy5Var.f391502f = 1;
        java.lang.String j17 = n17.j();
        v05.b bVar = new v05.b();
        bVar.fromXml(j17 == null ? "" : j17);
        int i17 = bVar.f432315e;
        int i18 = i17 + 24;
        if (com.tencent.mm.sdk.platformtools.t8.K0(bVar.getString(i18))) {
            java.lang.String e17 = com.tencent.mm.modelcdntran.s1.cj().e(attachInfo.field_fileFullPath);
            kotlin.jvm.internal.o.f(e17, "nativeGetFileMD5(...)");
            bVar.set(i18, e17);
            l15.c cVar = new l15.c();
            cVar.q(bVar);
            n17.d1(cVar.toXml());
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(n17.getMsgId(), n17, true);
            com.tencent.mars.xlog.Log.w("MicroMsg.CgiSendFileUploadMsg", "set filemd5! msgId:" + java.lang.Long.valueOf(n17.getMsgId()) + " path:" + attachInfo.field_fileFullPath);
        }
        r45.xy5 xy5Var = new r45.xy5();
        java.lang.String wi6 = ((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).wi(bVar);
        xy5Var.f390595d = wi6 == null ? bVar.getString(bVar.f368365d + 2) : wi6;
        v05.a aVar = (v05.a) bVar.getCustom(i17 + 8);
        xy5Var.f390596e = aVar != null ? aVar.r() : null;
        xy5Var.f390597f = bVar.getString(i18);
        xy5Var.f390598g = com.tencent.mm.vfs.w6.k(attachInfo.field_fileFullPath);
        yy5Var.f391503g = xy5Var;
        d35.i iVar = d35.i.f226347a;
        iVar.e();
        com.tencent.mm.lan_cs.SmartServer$ServerFileInfo smartServer$ServerFileInfo = new com.tencent.mm.lan_cs.SmartServer$ServerFileInfo();
        smartServer$ServerFileInfo.cryptKey = com.tencent.mm.modelcdntran.s1.cj().d();
        smartServer$ServerFileInfo.cgi = iVar.a(n17);
        smartServer$ServerFileInfo.filePath = com.tencent.mm.vfs.w6.i(attachInfo.field_fileFullPath, false);
        smartServer$ServerFileInfo.idleTimeoutMs = (int) iVar.b();
        smartServer$ServerFileInfo.totalSendTimeoutMs = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_file_lan_send_total_send_timeout_ms, -1);
        smartServer$ServerFileInfo.betweenRequestTimeoutMs = (int) ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_file_lan_send_between_request_timeout_ms, 60000L);
        com.tencent.mm.lan_cs.SmartServer$Java2C.addFileInfo(smartServer$ServerFileInfo);
        java.lang.String cgi = smartServer$ServerFileInfo.cgi;
        kotlin.jvm.internal.o.f(cgi, "cgi");
        java.lang.String cryptKey = smartServer$ServerFileInfo.cryptKey;
        kotlin.jvm.internal.o.f(cryptKey, "cryptKey");
        java.lang.String c17 = iVar.c(cgi, cryptKey);
        com.tencent.mars.xlog.Log.i("MicroMsg.FileSmartServerMgr", "addFileInfo msgInfo:" + n17.getMsgId() + " filePath:" + attachInfo.field_fileFullPath + " url:" + c17 + " aesKey:" + com.tencent.mm.sdk.platformtools.t8.G1(smartServer$ServerFileInfo.cryptKey));
        if (c17 != null) {
            yy5Var.f391506m = c17;
        }
        r45.zy5 zy5Var = new r45.zy5();
        zy5Var.setBaseResponse(new r45.ie());
        zy5Var.getBaseResponse().f376960e = new r45.du5();
        lVar.f70664a = yy5Var;
        lVar.f70665b = zy5Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/sendfileuploadmsg";
        lVar.f70667d = 6691;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiSendFileUploadMsg", "request msgId:" + attachInfo.field_msgInfoId + " md5:" + xy5Var.f390597f + " fileExt:" + xy5Var.f390596e + " path:" + attachInfo.field_fileFullPath + " lanInfo:" + yy5Var.f391506m);
    }
}
