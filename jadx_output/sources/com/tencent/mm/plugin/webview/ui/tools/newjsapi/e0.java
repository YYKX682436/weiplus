package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class e0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.e0 f186045d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.e0();

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.util.HashMap hashMap;
        com.tencent.mm.plugin.webview.ui.tools.widget.r1 r1Var;
        com.tencent.mm.ui.widget.dialog.i0 i0Var;
        com.tencent.mm.ui.widget.dialog.a aVar;
        org.json.JSONObject jSONObject;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.util.HashMap hashMap2 = new java.util.HashMap();
        zg0.q2 a17 = env.a();
        java.lang.Object obj = a17 != null ? ((com.tencent.mm.plugin.webview.core.r0) a17).f181944o : null;
        com.tencent.mm.plugin.webview.ui.tools.widget.r1 r1Var2 = obj instanceof com.tencent.mm.plugin.webview.ui.tools.widget.r1 ? (com.tencent.mm.plugin.webview.ui.tools.widget.r1) obj : null;
        try {
            i0Var = new com.tencent.mm.ui.widget.dialog.i0(env.f340860a);
            aVar = i0Var.f211821b;
            jSONObject = msg.f341014d;
            if (jSONObject.has(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
                aVar.f211709a = jSONObject.getString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            }
            if (jSONObject.has("titleDesc")) {
                aVar.f211711b = jSONObject.getString("titleDesc");
            }
            if (jSONObject.has("titleColor")) {
                java.lang.String string = jSONObject.getString("titleColor");
                kotlin.jvm.internal.o.f(string, "getString(...)");
                aVar.O = android.graphics.Color.parseColor(string) | (-16777216);
            }
            if (jSONObject.has("titleMaxLine")) {
                aVar.P = jSONObject.getInt("titleMaxLine");
            }
            if (jSONObject.has("titleGravity")) {
                aVar.S = jSONObject.getInt("titleGravity");
            }
            if (jSONObject.has("msg")) {
                aVar.f211729s = jSONObject.getString("msg");
            }
            if (jSONObject.has("msgSubTitle")) {
                aVar.f211730t = jSONObject.getString("msgSubTitle");
            }
            if (jSONObject.has("msgSubDesc")) {
                aVar.f211731u = jSONObject.getString("msgSubDesc");
            }
            if (jSONObject.has("msgMaxLine")) {
                aVar.Q = jSONObject.getInt("msgMaxLine");
            }
            if (jSONObject.has("msgIconBase64")) {
                byte[] decode = android.util.Base64.decode(jSONObject.getString("msgIconBase64"), 0);
                int length = decode.length;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(length));
                arrayList.add(0);
                arrayList.add(decode);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiConfirmDialog", "handleMsg", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;)Z", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
                yj0.a.e(obj2, decodeByteArray, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiConfirmDialog", "handleMsg", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;)Z", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                aVar.f211726p = decodeByteArray;
            } else if (jSONObject.has("msgIconUrl")) {
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(config);
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(1);
                arrayList2.add(1);
                java.lang.Object obj3 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj3, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiConfirmDialog", "handleMsg", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;)Z", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
                yj0.a.e(obj3, createBitmap, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiConfirmDialog", "handleMsg", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;)Z", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                aVar.f211726p = createBitmap;
            }
            if (jSONObject.has("contentDesc")) {
                aVar.f211713c = jSONObject.getString("contentDesc");
            }
            if (jSONObject.has("contentDescGravity")) {
                aVar.R = jSONObject.getInt("contentDescGravity");
            }
            if (jSONObject.has("confirmText")) {
                aVar.f211732v = jSONObject.getString("confirmText");
            }
            if (jSONObject.has("confirmTextColor")) {
                java.lang.String string2 = jSONObject.getString("confirmTextColor");
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                aVar.W = android.graphics.Color.parseColor(string2) | (-16777216);
            }
            if (jSONObject.has("cancelText")) {
                aVar.f211733w = jSONObject.getString("cancelText");
            }
            if (jSONObject.has("cancelTextColor")) {
                java.lang.String string3 = jSONObject.getString("cancelTextColor");
                kotlin.jvm.internal.o.f(string3, "getString(...)");
                aVar.V = android.graphics.Color.parseColor(string3) | (-16777216);
            }
            if (jSONObject.has("cancelable")) {
                aVar.A = jSONObject.optBoolean("cancelable", false);
            }
            hashMap = hashMap2;
            r1Var = r1Var2;
        } catch (java.lang.Exception e17) {
            e = e17;
            hashMap = hashMap2;
            r1Var = r1Var2;
        }
        try {
            aVar.G = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.z(r1Var, env, msg, hashMap);
            aVar.H = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.a0(r1Var, env, msg, hashMap);
            aVar.E = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.b0(r1Var, env, msg, hashMap);
            aVar.F = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.c0(r1Var, env, msg, hashMap);
            pm0.v.X(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.d0(i0Var, jSONObject, "msgIconUrl", r1Var));
            return true;
        } catch (java.lang.Exception e18) {
            e = e18;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiConfirmDialog", e, "doConfirmDialog", new java.lang.Object[0]);
            if (r1Var != null) {
                ((com.tencent.mm.plugin.webview.ui.tools.widget.m1) r1Var).O("err");
            }
            env.f340863d.e(msg.f341013c, msg.f341019i + ":err", hashMap);
            return false;
        }
    }

    @Override // nw4.q2
    public int b() {
        return uc1.t1.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "confirmDialog";
    }
}
