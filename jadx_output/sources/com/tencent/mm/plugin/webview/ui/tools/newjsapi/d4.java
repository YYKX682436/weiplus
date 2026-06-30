package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class d4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f186030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186031f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186032g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186033h;

    public d4(int i17, nw4.k kVar, kotlin.jvm.internal.h0 h0Var, int i18, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, int i19) {
        this.f186029d = kVar;
        this.f186030e = h0Var;
        this.f186031f = str;
        this.f186032g = str2;
        this.f186033h = webViewUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.webview.ui.tools.widget.d7 d7Var;
        com.tencent.mm.plugin.webview.ui.tools.widget.d7 d7Var2;
        com.tencent.mm.plugin.webview.ui.tools.widget.d7 d7Var3;
        com.tencent.mm.plugin.webview.ui.tools.widget.d7 d7Var4;
        int itemId = menuItem.getItemId();
        kotlin.jvm.internal.h0 h0Var = this.f186030e;
        java.lang.String str = this.f186031f;
        java.lang.String str2 = this.f186032g;
        nw4.k kVar = this.f186029d;
        if (itemId == 2147483646) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "itemIDShareToFriend onClick");
            android.content.Context context = kVar.f340860a;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_File_Name", str);
            ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
            intent.putExtra("Retr_Msg_content", str);
            intent.putExtra("Retr_Compress_Type", 1);
            intent.putExtra("Retr_Msg_Type", 0);
            intent.putExtra("Retr_show_success_tips", true);
            intent.putExtra("img_source_url", ((qv.a) ((rv.h2) i95.n0.c(rv.h2.class))).wi(str2));
            j45.l.w((com.tencent.mm.ui.MMActivity) context, ".ui.transmit.MsgRetransmitUI", intent, com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.f186305e, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.b4(str2, kVar));
            if (!com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.f186311n || (d7Var4 = (com.tencent.mm.plugin.webview.ui.tools.widget.d7) h0Var.f310123d) == null) {
                return;
            }
            d7Var4.c();
            return;
        }
        if (itemId != 2147483645) {
            if (itemId != 2147483644) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "else value");
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, menuItem.getTitle());
                hashMap.put(dm.i4.COL_ID, java.lang.Integer.valueOf(menuItem.getItemId()));
                nw4.g gVar = kVar.f340863d;
                kotlin.jvm.internal.o.e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
                ((nw4.n) gVar).o("onShareCustomMenuItemClick", hashMap);
                if (!com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.f186311n || (d7Var = (com.tencent.mm.plugin.webview.ui.tools.widget.d7) h0Var.f310123d) == null) {
                    return;
                }
                d7Var.c();
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "itemIDShareToBiz onClick");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            boolean Di = ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Di();
            r01.l1 l1Var = (r01.l1) i95.n0.c(r01.l1.class);
            hashMap2.put("biz", Di ? l1Var.f368148m.f368153a : l1Var.f368147i.f368153a);
            nw4.g gVar2 = kVar.f340863d;
            kotlin.jvm.internal.o.e(gVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
            ((nw4.n) gVar2).o("menu:publish", hashMap2);
            if (!com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.f186311n || (d7Var2 = (com.tencent.mm.plugin.webview.ui.tools.widget.d7) h0Var.f310123d) == null) {
                return;
            }
            d7Var2.c();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandleMPPageAction", "itemIDShareToSns onClick");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        java.lang.String str3 = "biz_excerpt" + c01.z1.r() + '_' + str;
        java.lang.String a17 = c01.n2.a(str3);
        c01.l2 c17 = c01.n2.d().c(a17, true);
        c17.i("prePublishId", str3);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("reportSessionId", a17);
        intent2.putExtra("Ksnsupload_type", 36);
        intent2.putExtra("sns_kemdia_path", str);
        intent2.putExtra("sns_exceprt_url", str2);
        intent2.putExtra("KBlockAdd", true);
        intent2.putExtra("need_result", true);
        intent2.putExtra("need_ban_back_tips", true);
        intent2.putExtra("need_ban_pic_touch", true);
        intent2.putExtra("k_need_delete", false);
        intent2.putExtra("need_result", false);
        intent2.putExtra("sns_upload_is_show_dialog", true);
        j45.l.w(this.f186033h, ".plugin.sns.ui.SnsUploadUI", intent2, com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.f186305e, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.c4(str2, c17, kVar));
        if (!com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.f186311n || (d7Var3 = (com.tencent.mm.plugin.webview.ui.tools.widget.d7) h0Var.f310123d) == null) {
            return;
        }
        d7Var3.c();
    }
}
