package x44;

/* loaded from: classes4.dex */
public final class w0 extends w44.d {
    @Override // w44.d
    public void c(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenChatUI");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString(dm.i4.COL_USERNAME);
        if (optString == null || r26.n0.N(optString)) {
            com.tencent.mars.xlog.Log.e("SnsAd.JsApi", "the user name is empty!");
            b(w44.d.h(this, null, 1, null));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenChatUI");
            return;
        }
        android.app.Activity a17 = env.a();
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.JsApi", "the activity is null!");
            b(w44.d.h(this, null, 1, null));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenChatUI");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", optString);
        intent.putExtra("key_has_add_contact", true);
        intent.putExtra("finish_direct", true);
        intent.setClassName(a17, "com.tencent.mm.ui.chatting.ChattingUI");
        a84.d0.e(a17, intent);
        a17.overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
        b(l());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OpenChatUI");
    }
}
