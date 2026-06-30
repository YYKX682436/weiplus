package nw4;

/* loaded from: classes.dex */
public final class c3 implements nw4.j {

    /* renamed from: b, reason: collision with root package name */
    public static final nw4.c3 f340812b = new nw4.c3();

    /* renamed from: c, reason: collision with root package name */
    public static java.util.Map f340813c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final nw4.m f340814d = new nw4.m();

    @Override // nw4.j
    public boolean a(nw4.k env, nw4.y2 msg) {
        boolean z17;
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!f340813c.containsKey(msg.f341019i)) {
            return false;
        }
        java.lang.Object obj = f340813c.get(msg.f341019i);
        kotlin.jvm.internal.o.d(obj);
        qw4.a aVar = (qw4.a) obj;
        int b17 = aVar.b();
        nw4.m mVar = f340814d;
        boolean a17 = mVar.a(b17);
        nw4.g gVar = env.f340863d;
        if (a17) {
            gVar.e(msg.f341013c, "system:too_frequent", null);
            java.lang.Object obj2 = env.f340860a;
            if (obj2 instanceof com.tencent.mm.plugin.webview.core.w0) {
                mVar.b(aVar.b(), aVar.c(), ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) ((com.tencent.mm.plugin.webview.core.w0) obj2)).x7());
            }
            return true;
        }
        int b18 = aVar.b();
        com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper = env.f340861b;
        boolean f17 = jsapiPermissionWrapper != null ? jsapiPermissionWrapper.f(b18) : false;
        if (f17) {
            z17 = aVar.a(env, msg);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewJsApiPool", "handleMsg access denied func: " + msg.f341019i);
            if (!kotlin.jvm.internal.o.b(msg.f341019i, "log")) {
                gVar.e(msg.f341013c, "system:access_denied", null);
            }
            z17 = false;
        }
        if (!z17 && aVar.d() && f17) {
            return false;
        }
        java.lang.Object obj3 = env.f340860a;
        if (obj3 instanceof com.tencent.mm.plugin.webview.core.w0) {
            com.tencent.mm.plugin.webview.core.w0 w0Var = (com.tencent.mm.plugin.webview.core.w0) obj3;
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) w0Var;
            java.lang.String F7 = webViewUI.F7();
            java.lang.String x76 = webViewUI.x7();
            java.lang.String stringExtra = w0Var.getIntent().getStringExtra("srcUsername");
            nw4.e3.f340831b = F7;
            nw4.e3.f340832c = x76;
            nw4.e3.f340833d = stringExtra;
        } else {
            zg0.q2 a18 = env.a();
            if (a18 == null || (str = a18.i()) == null) {
                str = "";
            }
            zg0.q2 a19 = env.a();
            if (a19 == null || (str2 = ((com.tencent.mm.plugin.webview.core.r0) a19).Z()) == null) {
                str2 = "";
            }
            if (str2.length() == 0) {
                str2 = str;
            }
            com.tencent.mm.plugin.webview.stub.z0 b19 = env.b();
            java.lang.String za6 = b19 != null ? b19.za() : null;
            if (za6 == null) {
                za6 = "";
            }
            nw4.e3.f340831b = str;
            nw4.e3.f340832c = str2;
            nw4.e3.f340833d = za6;
        }
        int d17 = jsapiPermissionWrapper != null ? jsapiPermissionWrapper.d(aVar.b()) : 0;
        java.lang.String str4 = msg.f341019i;
        java.util.Map map = msg.f341018h;
        java.lang.Object obj4 = ((java.util.HashMap) msg.f340790a).get("key_webview_init_url");
        java.lang.String str5 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str5 == null) {
            str5 = "";
        }
        java.lang.Object obj5 = ((java.util.HashMap) msg.f340790a).get("key_wxapp_id");
        java.lang.String str6 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
        if (str6 == null) {
            str6 = "";
        }
        java.lang.Object obj6 = ((java.util.HashMap) msg.f340790a).get("key_wxapp_path");
        java.lang.String str7 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
        java.lang.String str8 = str7 != null ? str7 : "";
        if (map != null) {
            java.util.HashMap hashMap = (java.util.HashMap) map;
            hashMap.put("isSuccess", java.lang.Boolean.valueOf(z17));
            hashMap.put("report_initUrl", str5);
            hashMap.put("containerEnv", str6);
            hashMap.put("miniProgramPath", str8);
            hashMap.put("permissionValue", java.lang.Integer.valueOf(d17));
        }
        nw4.e3.b(str4, map);
        return true;
    }

    @Override // nw4.j
    public boolean b(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        return f340813c.containsKey(msg.f341019i);
    }

    @Override // nw4.j
    public qw4.a f(java.lang.String function) {
        kotlin.jvm.internal.o.g(function, "function");
        if (f340813c.containsKey(function)) {
            return (qw4.a) f340813c.get(function);
        }
        return null;
    }
}
