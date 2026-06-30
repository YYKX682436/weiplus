package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class CircleToSearchWebViewUI extends com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSOSHomeWebViewUI {

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.CircleToSearchWebViewUI$1, reason: invalid class name */
    /* loaded from: classes8.dex */
    class AnonymousClass1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CircleToSearchClient2WebEvent> {
        public AnonymousClass1(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = -1728345878;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.CircleToSearchClient2WebEvent circleToSearchClient2WebEvent) {
            am.w2 w2Var;
            com.tencent.mm.autogen.events.CircleToSearchClient2WebEvent circleToSearchClient2WebEvent2 = circleToSearchClient2WebEvent;
            com.tencent.mm.plugin.webview.ui.tools.fts.CircleToSearchWebViewUI circleToSearchWebViewUI = com.tencent.mm.plugin.webview.ui.tools.fts.CircleToSearchWebViewUI.this;
            try {
                w2Var = circleToSearchClient2WebEvent2.f54058g;
            } catch (org.json.JSONException unused) {
            }
            if (w2Var != null && w2Var.f8254a == circleToSearchWebViewUI.f184266x4) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("event", w2Var.f8255b);
                hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, new org.json.JSONObject(w2Var.f8256c));
                circleToSearchWebViewUI.o9(new com.tencent.mm.plugin.webview.ui.tools.fts.s0(this, hashMap));
                return true;
            }
            return false;
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e0a;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI, com.tencent.mm.plugin.webview.ui.tools.WebViewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        new com.tencent.mm.plugin.webview.ui.tools.fts.CircleToSearchWebViewUI.AnonymousClass1(this).alive();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI
    public void u9() {
        super.u9();
        java.lang.String stringExtra = getIntent().getStringExtra("key_circle_search_data");
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            return;
        }
        com.tencent.mm.autogen.events.CircleToSearchClient2WebEvent circleToSearchClient2WebEvent = new com.tencent.mm.autogen.events.CircleToSearchClient2WebEvent();
        int i17 = this.f184266x4;
        am.w2 w2Var = circleToSearchClient2WebEvent.f54058g;
        w2Var.f8254a = i17;
        w2Var.f8255b = com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT;
        w2Var.f8256c = stringExtra;
        circleToSearchClient2WebEvent.e();
    }
}
