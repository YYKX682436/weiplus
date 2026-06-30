package com.tencent.mm.plugin.webview.emojistore;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.emojistore.c f182033a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f182034b;

    /* renamed from: c, reason: collision with root package name */
    public long f182035c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f182036d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f182037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.emojistore.b f182038f;

    public a(com.tencent.mm.plugin.webview.emojistore.b bVar, com.tencent.mm.plugin.webview.emojistore.EmojiStoreWebViewLogic$1 emojiStoreWebViewLogic$1) {
        this.f182038f = bVar;
    }

    public void a(int i17, java.lang.String str, java.lang.String str2, int i18, long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = str;
            objArr[1] = java.lang.Integer.valueOf(i17);
            objArr[2] = str2 == null ? "" : str2;
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "error query:%s type:%d pagebuf:%s ", objArr);
            return;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(i17);
        java.lang.String g17 = kk.k.g(stringBuffer.toString().getBytes());
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f182034b) && this.f182034b.equals(g17) && java.lang.System.currentTimeMillis() - this.f182035c <= 8000 && com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            if (this.f182037e) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "hit the search cache %s", str);
                com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i18).w6(this.f182033a.H().f381714d, true, x51.j1.f(this.f182033a.H().f381715e), this.f182033a.H().f381716f);
                return;
            } else {
                if (this.f182036d) {
                    com.tencent.mm.plugin.webview.emojistore.c cVar = this.f182033a;
                    if (cVar != null) {
                        cVar.f182045i = i18;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "wait the netscene running");
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "netscene error try again");
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "start New NetScene query:%s newMD5:%s webviewID:%d", str, g17, java.lang.Integer.valueOf(i18));
        if (this.f182033a != null) {
            gm0.j1.d().d(this.f182033a);
        }
        this.f182034b = g17;
        this.f182035c = java.lang.System.currentTimeMillis();
        this.f182036d = true;
        this.f182037e = false;
        gm0.j1.d().a(234, this.f182038f);
        this.f182033a = new com.tencent.mm.plugin.webview.emojistore.c(i17, str, str2.getBytes(), i18, j17);
        gm0.j1.d().g(this.f182033a);
    }
}
