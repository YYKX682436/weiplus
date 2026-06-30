package qg0;

/* loaded from: classes8.dex */
public interface h0 extends i95.m {
    static java.lang.String Fg(int i17) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("EnterScene", i17);
            return jSONObject.toString();
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    static void fe(android.content.Context context, java.lang.String str, boolean z17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", z17);
        intent.putExtra(com.tencent.mm.ui.w2.f211205r, true);
        intent.putExtra("allow_mix_content_mode", false);
        j45.l.j(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
    }
}
