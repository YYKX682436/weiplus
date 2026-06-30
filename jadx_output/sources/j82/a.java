package j82;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f298150a;

    /* renamed from: b, reason: collision with root package name */
    public final i82.a f298151b;

    public a(android.content.Context context, i82.a aVar) {
        this.f298150a = context;
        this.f298151b = aVar;
    }

    @android.webkit.JavascriptInterface
    public void doImgPreview(java.lang.String str) {
        com.tencent.mm.vfs.z7 z7Var = new com.tencent.mm.vfs.z7(android.net.Uri.parse(str));
        java.lang.String str2 = z7Var.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                z7Var = new com.tencent.mm.vfs.z7(z7Var.f213277d, z7Var.f213278e, l17, z7Var.f213280g, z7Var.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(z7Var, null);
        if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.offline.FavOfflineJavaObj", "doImgPreview() currentPath:%s no exist", str);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.y1.c(z7Var.toString())) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.offline.FavOfflineJavaObj", "doImgPreview() currentPath:%s", str);
        i82.a aVar = this.f298151b;
        java.util.List O1 = com.tencent.mm.sdk.platformtools.t8.O1(aVar.field_imgPaths, ",");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z17 = false;
        int i17 = 0;
        for (int i18 = 0; i18 < O1.size(); i18++) {
            java.lang.String str3 = aVar.field_imgDirPath + "/" + ((java.lang.String) O1.get(i18));
            if (!com.tencent.mm.sdk.platformtools.y1.c(str3)) {
                arrayList.add(str3);
                if (!z17 && !com.tencent.mm.sdk.platformtools.t8.K0(str) && str.endsWith((java.lang.String) O1.get(i18))) {
                    z17 = true;
                } else if (!z17) {
                    i17++;
                }
            }
        }
        java.lang.String[] strArr = new java.lang.String[arrayList.size()];
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            strArr[i19] = (java.lang.String) arrayList.get(i19);
            java.lang.String str4 = (java.lang.String) arrayList.get(i19);
            java.lang.String str5 = z7Var.f213279f;
            int lastIndexOf = str5.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                str5 = str5.substring(lastIndexOf + 1);
            }
            if (com.tencent.mm.sdk.platformtools.t8.D0(str4, str5)) {
                i17 = i19;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("nowUrlPath", str);
        intent.putExtra("nowUrl", strArr[i17]);
        intent.putExtra("urlList", strArr);
        intent.putExtra("type", -255);
        intent.putExtra("isFromWebView", true);
        intent.putExtra("currentPos", i17);
        intent.putExtra("shouldShowScanQrCodeMenu", false);
        android.content.Context context = this.f298150a;
        if (context instanceof android.app.Service) {
            intent.addFlags(268435456);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("stat_scene", 4);
        bundle.putString("stat_url", "");
        intent.putExtra("_stat_obj", bundle);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.t(intent, context);
    }
}
