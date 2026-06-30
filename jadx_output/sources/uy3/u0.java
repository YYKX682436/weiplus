package uy3;

/* loaded from: classes8.dex */
public final class u0 extends uy3.o {

    /* renamed from: b, reason: collision with root package name */
    public final wq1.d f431997b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(wq1.d uiComponent) {
        super(uiComponent);
        kotlin.jvm.internal.o.g(uiComponent, "uiComponent");
        this.f431997b = uiComponent;
    }

    public final boolean b(java.lang.String str) {
        boolean z17 = str == null || str.length() == 0;
        wq1.d dVar = this.f431997b;
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScanBoxWebViewJSApi", "doOpenProfilePage fail, username is null");
            dp.a.makeText(dVar.H(), dVar.H().getString(com.tencent.mm.R.string.fds, 3, -1), 0).show();
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanBoxWebViewJSApi", "doOpenProfilePage success, username is " + str);
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(268435456);
        intent.putExtra("Contact_User", str);
        intent.putExtra("Contact_Scene", 300);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        j45.l.j(dVar.H(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        return true;
    }

    @android.webkit.JavascriptInterface
    public final void closePage(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanBoxWebViewJSApi", "scanBoxJsApi closePage: %s", str);
        ((ku5.t0) ku5.t0.f312615d).B(new uy3.t0(this));
    }

    @android.webkit.JavascriptInterface
    public final void openAdPage(java.lang.String params) {
        wq1.d dVar = this.f431997b;
        kotlin.jvm.internal.o.g(params, "params");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(params);
            java.lang.String optString = jSONObject.optString("adXml", "");
            java.lang.String optString2 = jSONObject.optString("uxinfo", "");
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanBoxWebViewJSApi", "openAdPage, adXml=" + optString);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("sns_landing_pages_xml", optString);
            intent.putExtra("sns_landig_pages_from_source", 14);
            intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
            intent.putExtra("sns_landing_pages_ux_info", optString2);
            if (dVar.H() != null) {
                j45.l.j(dVar.H(), "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, null);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanBoxWebViewJSApi", e17, "openAdPage exception", new java.lang.Object[0]);
        }
    }

    @android.webkit.JavascriptInterface
    public final void openProfilePage(java.lang.String params) {
        kotlin.jvm.internal.o.g(params, "params");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanBoxWebViewJSApi", "openProfilePage result: %b", java.lang.Boolean.valueOf(b(new org.json.JSONObject(params).optString(dm.i4.COL_USERNAME, ""))));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanBoxWebViewJSApi", e17, "openProfilePage exception", new java.lang.Object[0]);
        }
    }

    @android.webkit.JavascriptInterface
    public final void openVideoPage(java.lang.String params) {
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanBoxWebViewJSApi", "openVideoPage param = ".concat(params));
        try {
            java.lang.String optString = new org.json.JSONObject(params).optString("videoUrl", "");
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanBoxWebViewJSApi", "openVideoPage videoUrl null");
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", optString);
            android.content.Context H = this.f431997b.H();
            if (H != null) {
                j45.l.j(H, "brandservice", ".ui.timeline.video.lite.VideoLiteUI", intent, null);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @android.webkit.JavascriptInterface
    public final void openWebView(java.lang.String params) {
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanBoxWebViewJSApi", "openWebView %s", params);
        try {
            java.lang.String optString = new org.json.JSONObject(params).optString("url", "");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", optString);
            intent.putExtra("geta8key_scene", 67);
            android.content.Context H = this.f431997b.H();
            if (H != null) {
                j45.l.j(H, "webview", ".ui.tools.WebViewUI", intent, null);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanBoxWebViewJSApi", e17, "openWebView exception", new java.lang.Object[0]);
        }
    }

    @android.webkit.JavascriptInterface
    public final void showShareMenu(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage2;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage3;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage4;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanBoxWebViewJSApi", "scanBoxJsApi showShareMenu: %s", str);
        android.content.Context H = this.f431997b.H();
        kotlin.jvm.internal.o.f(H, "getActivityContext(...)");
        uy3.r0 r0Var = uy3.r0.f431990d;
        uy3.r0 r0Var2 = uy3.r0.f431990d;
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString("url");
            uy3.p0 p0Var = uy3.r0.f431993g;
            kotlin.jvm.internal.o.d(optString);
            p0Var.getClass();
            uy3.r0.f431992f = (uy3.o0) p0Var.f431988a.get(optString);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shareToFriend, imageUrl: ");
            uy3.o0 o0Var = uy3.r0.f431992f;
            sb6.append(o0Var != null ? o0Var.f431987b : null);
            sb6.append(", desc: ");
            uy3.o0 o0Var2 = uy3.r0.f431992f;
            sb6.append((o0Var2 == null || (wXMediaMessage4 = o0Var2.f431986a) == null) ? null : wXMediaMessage4.description);
            sb6.append(", title: ");
            uy3.o0 o0Var3 = uy3.r0.f431992f;
            sb6.append((o0Var3 == null || (wXMediaMessage3 = o0Var3.f431986a) == null) ? null : wXMediaMessage3.title);
            sb6.append(", url: ");
            sb6.append(optString);
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanBoxShareHelper", sb6.toString());
            java.util.HashMap hashMap = new java.util.HashMap();
            uy3.o0 o0Var4 = uy3.r0.f431992f;
            java.lang.String str4 = "";
            if (o0Var4 == null || (str2 = o0Var4.f431987b) == null) {
                str2 = "";
            }
            hashMap.put("img_url", str2);
            uy3.o0 o0Var5 = uy3.r0.f431992f;
            java.lang.String str5 = (o0Var5 == null || (wXMediaMessage2 = o0Var5.f431986a) == null) ? null : wXMediaMessage2.description;
            if (str5 == null) {
                str5 = "";
            }
            hashMap.put("desc", str5);
            uy3.o0 o0Var6 = uy3.r0.f431992f;
            java.lang.String str6 = (o0Var6 == null || (wXMediaMessage = o0Var6.f431986a) == null) ? null : wXMediaMessage.title;
            if (str6 == null) {
                str6 = "";
            }
            hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, str6);
            hashMap.put("url", optString);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("webview_params", hashMap);
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("scene_from", 2);
            intent.putExtra("mutil_select_is_ret", true);
            intent.putExtra("Retr_Msg_Type", 2);
            if (H instanceof com.tencent.mm.ui.MMActivity) {
                uy3.o0 o0Var7 = uy3.r0.f431992f;
                if (o0Var7 != null && (str3 = o0Var7.f431987b) != null) {
                    str4 = str3;
                }
                if (!(str4.length() == 0) && r26.i0.y(str4, "http", false)) {
                    ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Ai(str4, null);
                }
                j45.l.w((com.tencent.mm.ui.MMActivity) H, ".ui.transmit.SelectConversationUI", intent, 1, r0Var2);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanBoxShareHelper", e17, "shareToFriend exception", new java.lang.Object[0]);
        }
    }

    @android.webkit.JavascriptInterface
    public final void updateShareData(java.lang.String str) {
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanBoxWebViewJSApi", "scanBoxJsApi updateShareData: %s", str);
        uy3.r0 r0Var = uy3.r0.f431990d;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ScanBoxShareHelper", "updateShareData params is invalid");
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        int optInt = jSONObject.optInt("action");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanBoxShareHelper", "updateShareData action: %d", java.lang.Integer.valueOf(optInt));
        if (optInt == 1) {
            java.lang.String optString = jSONObject.optString("url");
            if (optString == null) {
                optString = "";
            }
            java.lang.String optString2 = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            java.lang.String optString3 = jSONObject.optString("desc");
            java.lang.String optString4 = jSONObject.optString("image_url");
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanBoxShareHelper", "shareToFriend, imageUrl: " + optString4 + ", desc: " + optString3 + ", title: " + optString2 + ", url: " + optString);
            java.lang.String optString5 = jSONObject.optString("url");
            java.lang.String str2 = optString5 != null ? optString5 : "";
            if (str2.length() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ScanSendAppMsgHelper", "convertToAppMsg fail, url is null");
                wXMediaMessage = null;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanSendAppMsgHelper", "convertToAppMsg url: %s", str2);
                wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage();
                com.tencent.mm.opensdk.modelmsg.WXWebpageObject wXWebpageObject = new com.tencent.mm.opensdk.modelmsg.WXWebpageObject();
                wXWebpageObject.webpageUrl = str2;
                wXMediaMessage.mediaObject = wXWebpageObject;
                wXMediaMessage.title = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                wXMediaMessage.description = jSONObject.optString("desc");
            }
            uy3.o0 o0Var = new uy3.o0(wXMediaMessage, optString4);
            uy3.p0 p0Var = uy3.r0.f431993g;
            p0Var.getClass();
            p0Var.f431988a.put(optString, o0Var);
        }
    }
}
