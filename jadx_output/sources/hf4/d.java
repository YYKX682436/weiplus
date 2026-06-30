package hf4;

/* loaded from: classes4.dex */
public final class d extends zo0.g {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // zo0.g
    public void b(ip0.a data, ep0.h fileNameCreator, zo0.b callback) {
        java.lang.String concat;
        boolean z17;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(fileNameCreator, "fileNameCreator");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.Object obj = data.f293573a;
        hf4.e eVar = (hf4.e) obj;
        java.lang.String str = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt) + "/?version=%d&nettype=%d&signal=%d%s";
        java.lang.Integer valueOf = java.lang.Integer.valueOf(o45.wf.f343029g);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.tencent.mars.comm.NetStatusUtil.getNetTypeForStat(com.tencent.mm.sdk.platformtools.x2.f193071a));
        com.tencent.mm.sdk.platformtools.i0 i0Var = com.tencent.mm.sdk.platformtools.v0.f193027a;
        java.lang.String format = java.lang.String.format(str, java.util.Arrays.copyOf(new java.lang.Object[]{valueOf, valueOf2, java.lang.Integer.valueOf(i0Var.c()), ""}, 4));
        kotlin.jvm.internal.o.f(format, "format(...)");
        dn.j jVar = new dn.j();
        jVar.f241785d = "task_StoryDownloader";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadDataImp ");
        sb6.append(obj);
        sb6.append(" story ");
        r45.xe6 xe6Var = eVar.f281224d;
        sb6.append(xe6Var.f390023f);
        com.tencent.mars.xlog.Log.i("MicroMsg.Loader.StoryDownloader", sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        ef4.c0 c0Var = ef4.c0.f252438a;
        java.lang.String str2 = eVar.f281224d.f390023f;
        java.lang.String str3 = eVar.f281225e;
        if (str2 == null) {
            concat = "";
        } else {
            java.lang.String concat2 = c0Var.a(str3).concat("pic/");
            byte[] bytes = str2.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            concat = c0Var.e(concat2, kk.k.g(bytes)).concat(".d");
        }
        sb7.append(concat);
        sb7.append((!com.tencent.mm.sdk.platformtools.t8.K0(data.toString()) ? kk.k.g(data.toString().getBytes()) : null) + ".tmp");
        java.lang.String sb8 = sb7.toString();
        try {
            java.lang.String host = new java.net.URL(xe6Var.f390025h).getHost();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int f17 = com.tencent.mm.network.n.f(host, false, arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int f18 = com.tencent.mm.network.n.f(host, true, arrayList2);
            jVar.field_mediaId = xe6Var.f390021d + '_';
            jVar.D1 = xe6Var.f390025h;
            jVar.E1 = host;
            jVar.F1 = format;
            jVar.G1 = sb8;
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
            jVar.O1 = xe6Var.f390039y;
            jVar.f241789h = 3;
            jVar.P1 = 100;
            jVar.Q1 = 20201;
            com.tencent.mars.xlog.Log.i("MicroMsg.Loader.StoryDownloader", "attachSnsImgTaskInfo reqDownType:%s", jVar);
            z17 = true;
        } catch (java.net.MalformedURLException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Loader.StoryDownloader", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.w("MicroMsg.Loader.StoryDownloader", "attachSnsImgTaskInfo fail:" + e17);
            z17 = false;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Loader.StoryDownloader", "attachSnsImgTaskInfo failed");
            callback.a();
            return;
        }
        jVar.f241787f = new hf4.c(eVar, callback, sb8);
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(jVar)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Loader.StoryDownloader", "SubCoreCdnTransport addRecvTask suc");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.Loader.StoryDownloader", "SubCoreCdnTransport addRecvTask failed");
            callback.a();
        }
    }
}
