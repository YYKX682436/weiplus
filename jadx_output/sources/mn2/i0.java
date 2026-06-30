package mn2;

/* loaded from: classes10.dex */
public final class i0 extends zo0.g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f330020a;

    public i0(mn2.g0 g0Var) {
        cq.k1.a();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f330020a = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Nf).getValue()).r()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zo0.g
    public void b(ip0.a item, ep0.h fileNameCreator, zo0.b callback) {
        java.lang.String str;
        java.lang.String format;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(fileNameCreator, "fileNameCreator");
        kotlin.jvm.internal.o.g(callback, "callback");
        mn2.h3 h3Var = (mn2.h3) item.f293573a;
        if (h3Var.getMediaType() == com.tencent.mm.plugin.finder.storage.y90.f128355e) {
            str = h3Var.getUrl() + h3Var.i();
            com.tencent.mars.xlog.Log.i("Finder.FinderCdnDownloader", "[loadByCdn] finder image, " + h3Var.getMediaType() + ' ' + h3Var.i() + " uniqueValue=" + h3Var.n() + ' ' + str);
        } else {
            str = h3Var.l() + h3Var.m();
            com.tencent.mars.xlog.Log.i("Finder.FinderCdnDownloader", "[loadByCdn] finder image, " + h3Var.getMediaType() + ' ' + h3Var.m() + " uniqueValue=" + h3Var.n() + ' ' + str);
        }
        if (this.f330020a) {
            format = "";
        } else {
            format = java.lang.String.format("https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt) + "/?version=%d&nettype=%d&signal=%d%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(o45.wf.f343029g), java.lang.Integer.valueOf(com.tencent.mars.comm.NetStatusUtil.getNetTypeForStat(com.tencent.mm.sdk.platformtools.x2.f193071a)), java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.v0.f193027a.c()), ""}, 4));
            kotlin.jvm.internal.o.f(format, "format(...)");
        }
        dn.j jVar = new dn.j();
        jVar.f241785d = "task_FinderCdnDownloader";
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127846nd).getValue()).r()).booleanValue()) {
            jVar.N = "X-Support-Wxam:1\r\n";
        }
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        java.lang.String str2 = com.tencent.mm.plugin.finder.assist.e9.f102143l + h3Var.n();
        com.tencent.mm.vfs.w6.h(str2);
        com.tencent.mm.vfs.w6.u(new com.tencent.mm.vfs.r6(str2).r());
        boolean z17 = false;
        try {
            java.lang.String host = new java.net.URL(str).getHost();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int f17 = com.tencent.mm.network.n.f(host, false, arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int f18 = com.tencent.mm.network.n.f(host, true, arrayList2);
            jVar.field_mediaId = h3Var.n();
            jVar.D1 = str;
            jVar.O1 = h3Var.h();
            jVar.E1 = host;
            jVar.F1 = format;
            jVar.G1 = str2;
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
            jVar.M1 = "" + com.tencent.mm.sdk.platformtools.v0.f193027a.c();
            jVar.N1 = "";
            jVar.f241789h = 3;
            jVar.P1 = 251;
            jVar.Q1 = 20201;
            jVar.A = 60;
            jVar.B = 60;
            com.tencent.mars.xlog.Log.i("Finder.FinderCdnDownloader", "attachSnsImgTaskInfo decodeKey:%s, imageUrl:%s", h3Var.h(), str);
            z17 = true;
        } catch (java.net.MalformedURLException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderCdnDownloader", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.w("Finder.FinderCdnDownloader", "attachSnsImgTaskInfo fail:" + e17);
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.w("Finder.FinderCdnDownloader", "attachSnsImgTaskInfo failed");
            callback.a();
            return;
        }
        jVar.f241787f = new mn2.h0(h3Var, callback, str2);
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(jVar)) {
            com.tencent.mars.xlog.Log.i("Finder.FinderCdnDownloader", "SubCoreCdnTransport addRecvTask suc");
        } else {
            com.tencent.mars.xlog.Log.w("Finder.FinderCdnDownloader", "SubCoreCdnTransport addRecvTask failed");
            callback.a();
        }
    }

    public /* synthetic */ i0(mn2.g0 g0Var, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : g0Var);
    }
}
