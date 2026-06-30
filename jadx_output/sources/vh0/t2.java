package vh0;

/* loaded from: classes7.dex */
public final class t2 extends vh0.x0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh0.j1 f436968e;

    public t2(vh0.j1 j1Var) {
        this.f436968e = j1Var;
    }

    @Override // vh0.y0
    public void Ah(java.lang.String filePath, long j17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(filePath, "filePath");
        yb1.r rVar = (yb1.r) this.f436968e;
        rVar.getClass();
        if (!com.tencent.mm.vfs.w6.j(filePath)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGenRedPackageCover", "[-] file: '" + filePath + "' does not exist.");
            com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover.H(rVar.f460677a, rVar.f460678b, rVar.f460679c, com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover.f80281h, null, 8, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGenRedPackageCover", "[+] ok, received valid file: '" + filePath + '\'');
        com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover jsApiGenRedPackageCover = rVar.f460677a;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = rVar.f460678b;
        java.lang.String D = com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover.D(jsApiGenRedPackageCover, lVar, filePath);
        if (D == null) {
            return;
        }
        jz5.l[] lVarArr = new jz5.l[2];
        lVarArr[0] = new jz5.l(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, D);
        if (j17 == 0) {
            str = "0";
        } else if (j17 > 0) {
            str = java.lang.Long.toString(j17, 10);
        } else {
            char[] cArr = new char[64];
            long j18 = (j17 >>> 1) / 5;
            long j19 = 10;
            int i17 = 63;
            cArr[63] = java.lang.Character.forDigit((int) (j17 - (j18 * j19)), 10);
            for (long j27 = 0; j18 > j27; j27 = 0) {
                i17--;
                cArr[i17] = java.lang.Character.forDigit((int) (j18 % j19), 10);
                j18 /= j19;
            }
            str = new java.lang.String(cArr, i17, 64 - i17);
        }
        lVarArr[1] = new jz5.l("msgid", str);
        com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover.E(jsApiGenRedPackageCover, lVar, rVar.f460679c, kz5.c1.k(lVarArr));
    }

    @Override // vh0.y0
    public void onCancel() {
        yb1.r rVar = (yb1.r) this.f436968e;
        rVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGenRedPackageCover", "[+] user close yuanbao chatting ui without clicking deeplink.");
        com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover.H(rVar.f460677a, rVar.f460678b, rVar.f460679c, com.tencent.mm.plugin.appbrand.jsapi.chatbot.JsApiGenRedPackageCover.f80282i, null, 8, null);
    }
}
