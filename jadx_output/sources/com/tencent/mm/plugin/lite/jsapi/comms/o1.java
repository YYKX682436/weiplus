package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/o1;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class o1 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        android.content.Intent intent = new android.content.Intent().setClass(c(), com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI.class);
        kotlin.jvm.internal.o.f(intent, "setClass(...)");
        intent.addFlags(603979776);
        if (!(c() instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiEmoticonPostedFinish", "context is not Activity");
            this.f143442e.a();
            return;
        }
        android.content.Context c17 = c();
        kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type android.app.Activity");
        ((android.app.Activity) c17).finish();
        android.content.Context c18 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c18, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiEmoticonPostedFinish", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c18.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c18, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiEmoticonPostedFinish", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f143442e.d();
    }
}
