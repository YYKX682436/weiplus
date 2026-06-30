package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes.dex */
public class ic implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f184839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f184840b;

    public ic(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, android.content.Intent intent) {
        this.f184840b = webViewUI;
        this.f184839a = intent;
    }

    @Override // ly1.a
    public java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!"page_out".equals(str)) {
            return hashMap;
        }
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f184840b;
        hashMap.put("web_currenturl", webViewUI.F7());
        hashMap.put("web_geta8keyscene", java.lang.Integer.valueOf(webViewUI.getIntent().getIntExtra("geta8key_scene", 0)));
        hashMap.put("web_publisher", webViewUI.getIntent().getStringExtra("srcUsername"));
        hashMap.put("web_nickname", webViewUI.getIntent().getStringExtra("srcDisplayname"));
        hashMap.put("web_username", webViewUI.getIntent().getStringExtra("geta8key_username"));
        hashMap.put("web_publisherid", webViewUI.getIntent().getStringExtra("KPublisherId"));
        try {
            str2 = webViewUI.getIntent().getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            java.lang.String stringExtra = this.f184839a.getStringExtra("webpageTitle");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = stringExtra;
            }
            try {
                webViewUI.getIntent().getStringExtra("share_report_pre_msg_desc");
            } catch (java.lang.Exception unused) {
                hashMap.put("web_sharesourcetitle", str2);
                hashMap.put("web_sharesourcedesc", "");
                return hashMap;
            }
        } catch (java.lang.Exception unused2) {
            str2 = "";
        }
    }
}
