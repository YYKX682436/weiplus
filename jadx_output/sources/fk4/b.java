package fk4;

/* loaded from: classes4.dex */
public final class b extends zo0.g {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // zo0.g
    public void b(ip0.a url, ep0.h fileNameCreator, zo0.b callback) {
        boolean z17;
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(fileNameCreator, "fileNameCreator");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.Object obj = url.f293573a;
        fk4.n nVar = (fk4.n) obj;
        sb6.append(nVar.f263643d);
        java.lang.String str = nVar.f263646g;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt) + "/?version=%d&nettype=%d&signal=%d%s";
        java.lang.Integer valueOf = java.lang.Integer.valueOf(o45.wf.f343029g);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.tencent.mars.comm.NetStatusUtil.getNetTypeForStat(com.tencent.mm.sdk.platformtools.x2.f193071a));
        com.tencent.mm.sdk.platformtools.i0 i0Var = com.tencent.mm.sdk.platformtools.v0.f193027a;
        java.lang.String format = java.lang.String.format(str2, java.util.Arrays.copyOf(new java.lang.Object[]{valueOf, valueOf2, java.lang.Integer.valueOf(i0Var.c()), ""}, 4));
        kotlin.jvm.internal.o.f(format, "format(...)");
        dn.j jVar = new dn.j();
        jVar.f241785d = "task_FinderCdnDownloader";
        java.lang.String str3 = nVar.f263644e;
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnImageDownloder", "start load tmpFileFilePath:" + str3 + ", url:" + nVar.f263643d);
        com.tencent.mm.vfs.w6.u(new com.tencent.mm.vfs.r6(str3).r());
        kotlin.jvm.internal.o.f(obj, "value(...)");
        fk4.n nVar2 = (fk4.n) obj;
        try {
            java.lang.String host = new java.net.URL(sb7).getHost();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int f17 = com.tencent.mm.network.n.f(host, false, arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int f18 = com.tencent.mm.network.n.f(host, true, arrayList2);
            java.lang.String n17 = nVar2.n();
            java.lang.String str4 = nVar2.f263645f;
            jVar.field_mediaId = n17;
            jVar.D1 = sb7;
            jVar.O1 = str4;
            jVar.E1 = host;
            jVar.F1 = format;
            jVar.G1 = str3;
            int size = arrayList.size();
            java.lang.String[] strArr = new java.lang.String[size];
            for (int i17 = 0; i17 < size; i17++) {
                strArr[i17] = arrayList.get(i17);
            }
            jVar.H1 = strArr;
            int size2 = arrayList2.size();
            java.lang.String[] strArr2 = new java.lang.String[size2];
            for (int i18 = 0; i18 < size2; i18++) {
                strArr2[i18] = arrayList2.get(i18);
            }
            jVar.I1 = strArr2;
            jVar.J1 = f17;
            jVar.K1 = f18;
            jVar.L1 = false;
            jVar.M1 = "" + i0Var.c();
            jVar.N1 = "";
            jVar.f241789h = 3;
            jVar.P1 = 150;
            jVar.Q1 = 20201;
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnImageDownloder", "attachSnsImgTaskInfo, imageUrl:%s， " + str4, sb7);
            z17 = true;
        } catch (java.net.MalformedURLException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CdnImageDownloder", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.w("MicroMsg.CdnImageDownloder", "attachSnsImgTaskInfo fail:" + e17);
            z17 = false;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CdnImageDownloder", "attachSnsImgTaskInfo failed");
            callback.a();
            return;
        }
        jVar.f241787f = new fk4.a(this, str3, callback);
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(jVar)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnImageDownloder", "SubCoreCdnTransport addRecvTask succ");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.CdnImageDownloder", "SubCoreCdnTransport addRecvTask failed");
            callback.a();
        }
    }
}
