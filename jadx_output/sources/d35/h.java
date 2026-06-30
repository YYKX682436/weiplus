package d35;

/* loaded from: classes9.dex */
public final class h implements bt3.p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d35.h f226344a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f226345b;

    /* renamed from: c, reason: collision with root package name */
    public static final d35.g f226346c;

    static {
        d35.h hVar = new d35.h();
        f226344a = hVar;
        bt3.l0.C = hVar;
        f226345b = new java.util.HashMap();
        f226346c = new d35.g();
    }

    public void a(com.tencent.mm.storage.f9 f9Var) {
        jz5.f0 f0Var;
        if (f9Var != null) {
            java.lang.String mediaid = f226344a.b(f9Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.FileLanDownloadMgr", "cancelLanDownloadFile " + mediaid);
            kotlin.jvm.internal.o.g(mediaid, "mediaid");
            com.tencent.mars.xlog.Log.i("MicroMsg.FileLanDownloadMgr", "cancelLanDownloadFile ".concat(mediaid));
            ((ux.a) ((vx.e) i95.n0.c(vx.e.class))).getClass();
            hv1.d.f().e().w(mediaid);
            java.util.HashMap hashMap = f226345b;
            jz5.l lVar = (jz5.l) hashMap.get(mediaid);
            if (lVar != null) {
                com.tencent.mm.vfs.w6.h((java.lang.String) lVar.f302834e);
                jx3.f.INSTANCE.idkeyStat(1680L, 16L, 1L, false);
            }
            hashMap.remove(mediaid);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileLanDownloadMgr", "cancelLanDownloadFile msginfo is null");
        }
    }

    public final java.lang.String b(com.tencent.mm.storage.f9 f9Var) {
        return "lan_" + f9Var.Q0() + '_' + f9Var.getMsgId();
    }

    public final void c(com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        d(msgInfo, ot0.q.v(msgInfo.j()));
    }

    public final void d(com.tencent.mm.storage.f9 msgInfo, ot0.q qVar) {
        java.lang.String field_cgi;
        java.lang.String field_aeskey;
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        long a17 = c01.id.a() - msgInfo.getCreateTime();
        d35.i iVar = d35.i.f226347a;
        if (a17 >= iVar.b()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileLanDownloadMgr", "startToLanDownloadFile exceed limit time, %s", java.lang.Long.valueOf(iVar.b()));
            return;
        }
        if (qVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileLanDownloadMgr", "appmsgContent is null!");
            return;
        }
        if (!ez.v0.f257777a.k(java.lang.Integer.valueOf(qVar.f348666i))) {
            a95.a y07 = ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class)).wi().y0(msgInfo.I0());
            if (y07 != null) {
                field_cgi = y07.field_cgi;
                kotlin.jvm.internal.o.f(field_cgi, "field_cgi");
                field_aeskey = y07.field_aeskey;
                kotlin.jvm.internal.o.f(field_aeskey, "field_aeskey");
            }
            field_cgi = "";
            field_aeskey = "";
        } else {
            if (x51.t1.b(qVar.f348729x2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FileLanDownloadMgr", "fileLanInfo is null!");
                return;
            }
            java.lang.String fileLanInfo = qVar.f348729x2;
            kotlin.jvm.internal.o.f(fileLanInfo, "fileLanInfo");
            java.lang.String[] strArr = (java.lang.String[]) new r26.t(";").g(fileLanInfo, 0).toArray(new java.lang.String[0]);
            if (strArr != null && strArr.length == 2) {
                field_cgi = strArr[0];
                field_aeskey = strArr[1];
                com.tencent.mars.xlog.Log.i("MicroMsg.FileLanDownloadMgr", "startToLanDownloadFile cgi:%s aesKey:%s", field_cgi, field_aeskey);
            }
            field_cgi = "";
            field_aeskey = "";
        }
        java.lang.String b17 = b(msgInfo);
        java.util.HashMap hashMap = f226345b;
        if (hashMap.containsKey(b17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileLanDownloadMgr", "downloadImp " + b17 + " has exist");
            return;
        }
        if (x51.t1.b(field_cgi)) {
            return;
        }
        java.lang.String str = com.tencent.mm.pluginsdk.model.app.k0.f(lp0.b.t(), qVar.n(), qVar.f348690o) + "_lan_tmp";
        if (com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.vfs.w6.h(str);
        }
        hashMap.put(b17, new jz5.l(msgInfo, str));
        ((ux.a) ((vx.e) i95.n0.c(vx.e.class))).getClass();
        com.tencent.mm.modelcdntran.l1 e17 = hv1.d.f().e();
        int b18 = (int) iVar.b();
        e17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "startLanDownload: mediaid:" + b17);
        com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest = new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest();
        c2CDownloadRequest.fileKey = b17;
        c2CDownloadRequest.url = field_cgi;
        c2CDownloadRequest.aeskey = field_aeskey;
        c2CDownloadRequest.setSavePath(str);
        c2CDownloadRequest.queueTimeoutSeconds = b18;
        c2CDownloadRequest.transforTimeoutSeconds = 600;
        c2CDownloadRequest.bizid = -2;
        int startHttpMultiSocketDownloadTask = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startHttpMultiSocketDownloadTask(c2CDownloadRequest, f226346c);
        jx3.f.INSTANCE.idkeyStat(1680L, startHttpMultiSocketDownloadTask == 0 ? 11L : 12L, 1L, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.FileLanDownloadMgr", "fetch: start mediaId:" + b17 + " cgi:" + field_cgi + " aesKey:" + field_aeskey + " tmpFile " + b17 + ' ' + startHttpMultiSocketDownloadTask);
    }
}
