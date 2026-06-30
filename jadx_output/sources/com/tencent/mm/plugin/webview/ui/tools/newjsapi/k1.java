package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class k1 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.k1 f186293d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.k1();

    /* renamed from: e, reason: collision with root package name */
    public static nw4.k f186294e;

    /* renamed from: f, reason: collision with root package name */
    public static nw4.y2 f186295f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f186296g;

    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f186296g = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.JSAPIPayEndResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiGetBrandWCPayRequest$jsapiPayEndResultListener$1
            {
                this.__eventId = 963039593;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.JSAPIPayEndResultEvent jSAPIPayEndResultEvent) {
                nw4.y2 y2Var;
                com.tencent.mm.autogen.events.JSAPIPayEndResultEvent event = jSAPIPayEndResultEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetBrandWCPayRequest", "receive JSAPIPayEndResultEvent callback");
                am.rh rhVar = event.f54442g;
                int i17 = rhVar.f7816c;
                if (i17 != 214) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetBrandWCPayRequest", "reqestcode is " + i17 + ",not REQUEST_CODE_GET_BRAND_WCPAY_REQUEST, ignore");
                    return false;
                }
                nw4.k kVar = com.tencent.mm.plugin.webview.ui.tools.newjsapi.k1.f186294e;
                if (kVar == null || (y2Var = com.tencent.mm.plugin.webview.ui.tools.newjsapi.k1.f186295f) == null) {
                    return false;
                }
                com.tencent.mm.plugin.webview.ui.tools.newjsapi.k1.f186293d.e(kVar, y2Var, i17, rhVar.f7815b, rhVar.f7814a);
                return false;
            }
        };
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:1|(1:3)(1:169)|4|(1:6)|7|(4:157|158|(1:160)(1:166)|(1:164))(1:11)|(4:12|13|(1:154)(1:17)|18)|(2:19|20)|(18:24|25|26|27|(1:146)(25:31|32|33|34|35|36|37|38|39|40|41|42|(1:44)|(5:46|(5:48|(2:50|(2:52|(2:54|(3:58|(4:60|61|62|(1:64))(1:132)|128))))|133|(0)(0)|128)|134|(0)(0)|128)(1:135)|65|(1:67)|68|(1:70)|71|(1:73)|74|(1:76)|77|(1:79)|80)|81|82|(1:84)(1:124)|(9:86|87|88|89|(1:91)(1:119)|92|93|(1:95)(2:112|(1:114)(1:(1:116)(1:117)))|(2:97|98)(2:100|(2:102|(2:104|(2:106|107)(2:108|109))(1:110))(1:111)))|123|87|88|89|(0)(0)|92|93|(0)(0)|(0)(0))|150|25|26|27|(1:29)|146|81|82|(0)(0)|(0)|123|87|88|89|(0)(0)|92|93|(0)(0)|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(32:1|(1:3)(1:169)|4|(1:6)|7|(4:157|158|(1:160)(1:166)|(1:164))(1:11)|12|13|(1:154)(1:17)|18|19|20|(18:24|25|26|27|(1:146)(25:31|32|33|34|35|36|37|38|39|40|41|42|(1:44)|(5:46|(5:48|(2:50|(2:52|(2:54|(3:58|(4:60|61|62|(1:64))(1:132)|128))))|133|(0)(0)|128)|134|(0)(0)|128)(1:135)|65|(1:67)|68|(1:70)|71|(1:73)|74|(1:76)|77|(1:79)|80)|81|82|(1:84)(1:124)|(9:86|87|88|89|(1:91)(1:119)|92|93|(1:95)(2:112|(1:114)(1:(1:116)(1:117)))|(2:97|98)(2:100|(2:102|(2:104|(2:106|107)(2:108|109))(1:110))(1:111)))|123|87|88|89|(0)(0)|92|93|(0)(0)|(0)(0))|150|25|26|27|(1:29)|146|81|82|(0)(0)|(0)|123|87|88|89|(0)(0)|92|93|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02af, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02b0, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiGetBrandWCPayRequest", r0, "getRawUrl", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0294, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0295, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiGetBrandWCPayRequest", r0, "AC_GET_PAY_CODE_SCENE", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x026f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0270, code lost:
    
        r16 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0281 A[Catch: all -> 0x0294, TryCatch #2 {all -> 0x0294, blocks: (B:82:0x027b, B:84:0x0281, B:86:0x028d), top: B:81:0x027b }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x028d A[Catch: all -> 0x0294, TRY_LEAVE, TryCatch #2 {all -> 0x0294, blocks: (B:82:0x027b, B:84:0x0281, B:86:0x028d), top: B:81:0x027b }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a6 A[Catch: all -> 0x02af, TryCatch #8 {all -> 0x02af, blocks: (B:89:0x02a0, B:91:0x02a6, B:92:0x02ac), top: B:88:0x02a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03a5  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // nw4.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(nw4.k r24, nw4.y2 r25) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.newjsapi.k1.a(nw4.k, nw4.y2):boolean");
    }

    @Override // nw4.q2
    public int b() {
        return 28;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "getBrandWCPayRequest";
    }

    public final void e(nw4.k env, nw4.y2 msg, int i17, int i18, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetBrandWCPayRequest", "mmActivityResult requestCode: %d, resultCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (!com.tencent.mm.sdk.platformtools.t8.D0("getBrandWCPayRequest", msg.f341019i)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetBrandWCPayRequest", "request pay, wrong function");
            return;
        }
        nw4.g gVar = env.f340863d;
        if (i18 == -1) {
            java.util.HashMap hashMap = new java.util.HashMap();
            com.tencent.mm.plugin.webview.model.z3 z3Var = com.tencent.mm.plugin.webview.model.h4.f182914i;
            if (intent != null) {
                int intExtra = intent.getIntExtra("key_is_clear_failure", -1);
                if (intExtra == 0) {
                    hashMap.put("pay_status", "pending");
                } else if (intExtra == 1) {
                    hashMap.put("pay_status", "fail");
                }
                java.lang.String stringExtra = intent.getStringExtra("key_pay_overseaPayData");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    hashMap.put("overseaPayData", stringExtra);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetBrandWCPayRequest", "jsapi callback values: %s", hashMap);
                z3Var.a(hy4.a0.f286077m);
                gVar.e(msg.f341013c, "get_brand_wcpay_request:ok", hashMap);
                int intExtra2 = intent.getIntExtra("key_jsapi_close_page_after_pay", 0);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetBrandWCPayRequest", "closePage: %s", java.lang.Integer.valueOf(intExtra2));
                if (intExtra2 == 1) {
                    try {
                        com.tencent.mm.plugin.webview.stub.z0 b17 = env.b();
                        if (b17 != null) {
                            b17.ec();
                        }
                        com.tencent.mm.plugin.webview.stub.z0 b18 = env.b();
                        if (b18 != null) {
                            b18.b(null);
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiGetBrandWCPayRequest", e17, "", new java.lang.Object[0]);
                    }
                }
            } else {
                z3Var.a(hy4.a0.f286077m);
                gVar.e(msg.f341013c, "get_brand_wcpay_request:ok", hashMap);
            }
        } else if (i18 != 5) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            if (intent != null) {
                int intExtra3 = intent.getIntExtra("key_is_clear_failure", -1);
                if (intExtra3 == 0) {
                    hashMap2.put("pay_status", "pending");
                } else if (intExtra3 == 1) {
                    hashMap2.put("pay_status", "fail");
                }
                java.lang.String stringExtra2 = intent.getStringExtra("key_pay_fail_reason");
                if (stringExtra2 != null) {
                    if (!(stringExtra2.length() > 0)) {
                        stringExtra2 = null;
                    }
                    if (stringExtra2 != null) {
                        hashMap2.put("fail_reason", stringExtra2);
                    }
                }
            }
            gVar.e(msg.f341013c, "get_brand_wcpay_request:cancel", hashMap2);
        } else {
            java.util.HashMap hashMap3 = new java.util.HashMap();
            if (intent != null) {
                int intExtra4 = intent.getIntExtra("key_jsapi_pay_err_code", 0);
                java.lang.String stringExtra3 = intent.getStringExtra("key_jsapi_pay_err_msg");
                java.lang.String str = stringExtra3 != null ? stringExtra3 : "";
                hashMap3.put("err_code", java.lang.Integer.valueOf(intExtra4));
                hashMap3.put("err_desc", str);
                java.lang.String stringExtra4 = intent.getStringExtra("key_pay_fail_reason");
                if (stringExtra4 != null) {
                    if (!(stringExtra4.length() > 0)) {
                        stringExtra4 = null;
                    }
                    if (stringExtra4 != null) {
                        hashMap3.put("fail_reason", stringExtra4);
                    }
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetBrandWCPayRequest", "hy: pay jsapi failed. errCode: %d, errMsg: %s", java.lang.Integer.valueOf(intExtra4), str);
            }
            gVar.e(msg.f341013c, "get_brand_wcpay_request:fail", hashMap3);
        }
        f186296g.dead();
        f186294e = null;
        f186295f = null;
    }
}
