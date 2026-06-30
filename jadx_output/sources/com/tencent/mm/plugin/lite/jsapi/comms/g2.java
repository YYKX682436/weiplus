package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/g2;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class g2 extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f143582g = "";

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String optString = jSONObject != null ? jSONObject.optString("pid") : null;
        if (optString == null || optString.length() == 0) {
            this.f143443f.a("emoticonUsePackInChat:fail_missing arguments");
            return;
        }
        this.f143582g = optString;
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c(), com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.class);
        intent.putExtra("proxyui_action_code_key", 0);
        intent.putExtra("callback_id", m93.j.a(this));
        intent.putExtra("webview_params", new java.util.HashMap());
        intent.putExtra("Select_Conv_Type", com.tencent.mars.cdn.proto.AppType.APPTYPE_259_VALUE);
        android.content.Context c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiEmoticonUsePackInChat", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiEmoticonUsePackInChat", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f143443f.d(false);
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public void x(int i17, int i18, android.content.Intent intent) {
        java.lang.String member = intent != null ? intent.getStringExtra("Select_Conv_User") : null;
        if (member == null || member.length() == 0) {
            return;
        }
        com.tencent.mm.feature.emoji.api.o6 o6Var = (com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class);
        android.content.Context c17 = c();
        kotlin.jvm.internal.o.f(c17, "getContext(...)");
        java.lang.String pid = this.f143582g;
        com.tencent.mm.feature.emoji.c4 c4Var = (com.tencent.mm.feature.emoji.c4) o6Var;
        c4Var.getClass();
        kotlin.jvm.internal.o.g(pid, "pid");
        kotlin.jvm.internal.o.g(member, "member");
        com.tencent.mars.xlog.Log.i(c4Var.f66207d, "usePackInChat, pid=".concat(pid));
        if (c17 instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) c17;
            if (com.tencent.mm.sdk.platformtools.t8.K0(member)) {
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Chat_User", member);
            intent2.putExtra("smiley_product_id", pid);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(intent2, activity);
        }
    }
}
