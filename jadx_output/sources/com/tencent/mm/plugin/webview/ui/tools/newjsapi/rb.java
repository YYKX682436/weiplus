package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes10.dex */
public final class rb extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.rb f186493d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.rb();

    /* renamed from: e, reason: collision with root package name */
    public static com.tencent.mm.sdk.event.IListener f186494e = null;

    /* renamed from: f, reason: collision with root package name */
    public static com.tencent.mm.sdk.event.IListener f186495f = null;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f186496g = "";

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f186497h = "";

    /* renamed from: i, reason: collision with root package name */
    public static boolean f186498i = false;

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.String f186499m = "";

    @Override // nw4.q2
    public boolean a(final nw4.k env, final nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        boolean z17 = env.f340860a instanceof android.app.Activity;
        nw4.g gVar = env.f340863d;
        if (!z17 || !(gVar instanceof nw4.n)) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiScanBankCard", "context error!", null);
            gVar.e(msg.f341013c, msg.f341019i + ":fail, context error", null);
            return false;
        }
        if (((java.util.HashMap) msg.f340790a).isEmpty()) {
            java.lang.String str = msg.f341013c;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("err_msg", "fail");
            hashMap.put("err_code", 10001);
            hashMap.put("scanResult", "");
            gVar.e(str, "scanBankCard:fail", hashMap);
            return false;
        }
        if (!((java.util.HashMap) msg.f340790a).containsKey("certPem") || !((java.util.HashMap) msg.f340790a).containsKey("baseRequest")) {
            java.lang.String str2 = msg.f341013c;
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("err_msg", "fail");
            hashMap2.put("err_code", 10001);
            hashMap2.put("scanResult", "");
            gVar.e(str2, "scanBankCard:fail", hashMap2);
            return false;
        }
        java.lang.Object obj = ((java.util.HashMap) msg.f340790a).get("trueName");
        java.lang.String str3 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str3 == null) {
            str3 = "";
        }
        f186497h = str3;
        java.lang.Object obj2 = ((java.util.HashMap) msg.f340790a).get("useHttp");
        java.lang.String str4 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str4 == null) {
            str4 = "false";
        }
        f186498i = com.tencent.mm.sdk.platformtools.t8.y(str4, false);
        java.lang.Object obj3 = ((java.util.HashMap) msg.f340790a).get("certPem");
        java.lang.String str5 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        if (str5 == null) {
            str5 = "";
        }
        f186496g = str5;
        java.lang.Object obj4 = ((java.util.HashMap) msg.f340790a).get("baseRequest");
        java.lang.String str6 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        f186499m = str6 != null ? str6 : "";
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiScanBankCard", "Start Scan", null);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f186494e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanBankCardResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiScanBankCard$startScan$1
            {
                this.__eventId = 96068484;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ScanBankCardResultEvent scanBankCardResultEvent) {
                com.tencent.mm.autogen.events.ScanBankCardResultEvent event = scanBankCardResultEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.qs qsVar = event.f54727g;
                boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(qsVar.f7741a);
                nw4.y2 y2Var = msg;
                nw4.k kVar = nw4.k.this;
                if (K0) {
                    com.tencent.mm.sdk.event.IListener iListener = com.tencent.mm.plugin.webview.ui.tools.newjsapi.rb.f186494e;
                    if (iListener != null) {
                        iListener.dead();
                    }
                    nw4.g gVar2 = kVar.f340863d;
                    java.lang.String str7 = y2Var.f341013c;
                    java.util.HashMap hashMap3 = new java.util.HashMap();
                    hashMap3.put("err_msg", "fail");
                    hashMap3.put("err_code", 10002);
                    hashMap3.put("scanResult", "");
                    gVar2.e(str7, "scanBankCard:fail", hashMap3);
                    return false;
                }
                java.lang.String cardId = qsVar.f7741a;
                kotlin.jvm.internal.o.f(cardId, "cardId");
                java.util.regex.Pattern compile = java.util.regex.Pattern.compile("-");
                kotlin.jvm.internal.o.f(compile, "compile(...)");
                java.lang.String replaceAll = compile.matcher(cardId).replaceAll(" ");
                kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
                java.lang.String concat = "scan success: ".concat(replaceAll);
                int i19 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiScanBankCard", concat, null);
                nw4.g gVar3 = kVar.f340863d;
                java.lang.String str8 = y2Var.f341013c;
                java.util.HashMap hashMap4 = new java.util.HashMap();
                hashMap4.put("err_msg", "ok");
                hashMap4.put("err_code", 0);
                hashMap4.put("scanResult", replaceAll);
                gVar3.e(str8, "scanBankCard:ok", hashMap4);
                com.tencent.mm.sdk.event.IListener iListener2 = com.tencent.mm.plugin.webview.ui.tools.newjsapi.rb.f186494e;
                if (iListener2 != null) {
                    iListener2.dead();
                }
                return true;
            }
        };
        f186495f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScanQRCodeOprationEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiScanBankCard$startScan$2
            {
                this.__eventId = 2058274619;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ScanQRCodeOprationEvent scanQRCodeOprationEvent) {
                com.tencent.mm.autogen.events.ScanQRCodeOprationEvent event = scanQRCodeOprationEvent;
                kotlin.jvm.internal.o.g(event, "event");
                int i19 = event.f54734g.f8400a;
                nw4.y2 y2Var = msg;
                nw4.k kVar = nw4.k.this;
                if (i19 == 1) {
                    nw4.g gVar2 = kVar.f340863d;
                    java.lang.String str7 = y2Var.f341013c;
                    java.util.HashMap hashMap3 = new java.util.HashMap();
                    hashMap3.put("err_msg", "cancel");
                    hashMap3.put("err_code", java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL));
                    hashMap3.put("scanResult", "");
                    gVar2.e(str7, "scanBankCard:cancel", hashMap3);
                } else {
                    nw4.g gVar3 = kVar.f340863d;
                    java.lang.String str8 = y2Var.f341013c;
                    java.util.HashMap hashMap4 = new java.util.HashMap();
                    hashMap4.put("err_msg", "fail");
                    hashMap4.put("err_code", 10002);
                    hashMap4.put("scanResult", "");
                    gVar3.e(str8, "scanBankCard:fail", hashMap4);
                }
                com.tencent.mm.sdk.event.IListener iListener = com.tencent.mm.plugin.webview.ui.tools.newjsapi.rb.f186495f;
                if (iListener != null) {
                    iListener.dead();
                }
                return true;
            }
        };
        com.tencent.mm.sdk.event.IListener iListener = f186494e;
        if (iListener != null) {
            iListener.alive();
        }
        com.tencent.mm.sdk.event.IListener iListener2 = f186495f;
        if (iListener2 != null) {
            iListener2.alive();
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("BaseScanUI_select_scan_mode", 7);
        intent.putExtra("scan_bankcard_with_confirm_ui", true);
        intent.putExtra("scan_bankcard_use_http", f186498i);
        intent.putExtra("bank_card_owner", f186497h);
        intent.putExtra("scan_bankcard_cert_pem", f186496g);
        intent.putExtra("scan_bankcard_baserequest", f186499m);
        j45.l.j(env.f340860a, "scanner", ".ui.ScanCardUI", intent, null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 512;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "scanBankCard";
    }
}
