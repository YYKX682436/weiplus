package su4;

/* loaded from: classes8.dex */
public class x2 extends com.tencent.xweb.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMWebView f413136a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ su4.e3 f413137b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ su4.d3 f413138c;

    public x2(su4.d3 d3Var, com.tencent.mm.ui.widget.MMWebView mMWebView, su4.e3 e3Var) {
        this.f413138c = d3Var;
        this.f413136a = mMWebView;
        this.f413137b = e3Var;
    }

    @Override // com.tencent.xweb.h1
    public boolean B(com.tencent.xweb.WebView webView, java.lang.String str) {
        ((yg0.s4) ((zg0.q3) i95.n0.c(zg0.q3.class))).getClass();
        com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
        if (!nf.z.d(str, "weixin://private/setresult/")) {
            return false;
        }
        com.tencent.mars.xlog.Log.i(this.f413138c.f412858a, "handleUrl %s ,view %s", str, webView.toString());
        this.f413136a.evaluateJavascript("javascript:WeixinJSBridge._continueSetResult()", null);
        return true;
    }

    @Override // com.tencent.xweb.h1
    public void n(com.tencent.xweb.WebView webView, java.lang.String str) {
        java.lang.String str2;
        su4.d3 d3Var = this.f413138c;
        com.tencent.mars.xlog.Log.i(d3Var.f412858a, "onPageFinished, view %s", webView.toString());
        d3Var.getClass();
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f413136a;
        java.lang.Object[] objArr = {mMWebView.toString()};
        java.lang.String str3 = d3Var.f412858a;
        com.tencent.mars.xlog.Log.i(str3, "begin jsapi init,wv %s", objArr);
        try {
            str2 = com.tencent.mm.sdk.platformtools.t8.e(mMWebView.getContext().getAssets().open("jsapi/wxjs.js"));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str3, e17, "", new java.lang.Object[0]);
            str2 = null;
        }
        if (str2 == null) {
            com.tencent.mars.xlog.Log.e(str3, "loadJavaScript fail, jsContent is null");
            return;
        }
        mMWebView.evaluateJavascript("javascript:".concat(str2), new su4.y2(d3Var, mMWebView));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("javascript:WeixinJSBridge._handleMessageFromWeixin(");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("webview_type", "1");
        hashMap.put("init_url", mMWebView.getUrl());
        hashMap.put("init_font_size", "1");
        sb6.append(su4.c3.b("sys:init", hashMap, false, mMWebView.getRandomStr()));
        sb6.append(")");
        mMWebView.evaluateJavascript(sb6.toString(), new su4.z2(d3Var, mMWebView));
        mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + su4.c3.b("sys:bridged", null, false, mMWebView.getRandomStr()) + ")", new su4.a3(d3Var, mMWebView));
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("javascript:WeixinJSBridge._handleMessageFromWeixin(");
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add("menu:share:timeline");
        linkedList.add("menu:share:appmessage");
        linkedList.add("menu:share:weiboApp");
        linkedList.add("menu:share:QZone");
        linkedList.add("menu:share:qq");
        linkedList.add("onVoiceRecordEnd");
        linkedList.add("onVoicePlayBegin");
        linkedList.add("onVoicePlayEnd");
        linkedList.add("onLocalImageUploadProgress");
        linkedList.add("onImageDownloadProgress");
        linkedList.add("onVoiceUploadProgress");
        linkedList.add("onVoiceDownloadProgress");
        linkedList.add("onVideoUploadProgress");
        linkedList.add("onMediaFileUploadProgress");
        linkedList.add("menu:setfont");
        linkedList.add("menu:share:weibo");
        linkedList.add("menu:share:email");
        linkedList.add("wxdownload:state_change");
        linkedList.add("wxdownload:progress_change");
        linkedList.add("hdOnDeviceStateChanged");
        linkedList.add("activity:state_change");
        linkedList.add("onWXDeviceBluetoothStateChange");
        linkedList.add("onWXDeviceLanStateChange");
        linkedList.add("onWXDeviceBindStateChange");
        linkedList.add("onReceiveDataFromWXDevice");
        linkedList.add("onScanWXDeviceResult");
        linkedList.add("onWXDeviceStateChange");
        linkedList.add("onNfcTouch");
        linkedList.add("onBeaconMonitoring");
        linkedList.add("onBeaconsInRange");
        linkedList.add("menu:custom");
        linkedList.add("onSearchWAWidgetOpenApp");
        linkedList.add("onSearchDataReady");
        linkedList.add("onCurrentLocationReady");
        linkedList.add("onClientNavAction");
        linkedList.add("onNavBarShadowManuallyHidden");
        linkedList.add("onChatSearchDataReady");
        linkedList.add("onSearchHistoryReady");
        linkedList.add("onSearchWAWidgetOnTapCallback");
        linkedList.add("onSearchImageListReady");
        linkedList.add("onTeachSearchDataReady");
        linkedList.add("onSearchGuideDataReady");
        linkedList.add("onSearchInputChange");
        linkedList.add("onSearchInputConfirm");
        linkedList.add("onStreamVoiceInputStatus");
        linkedList.add("onSearchSuggestionDataReady");
        linkedList.add("onMusicStatusChanged");
        linkedList.add("switchToTabSearch");
        linkedList.add("onVideoPlayerCallback");
        linkedList.add("onSelectContact");
        linkedList.add("onSearchWAWidgetAttrChanged");
        linkedList.add("onSearchWAWidgetReloadData");
        linkedList.add("onSearchWAWidgetReloadDataFinish");
        linkedList.add("onSearchWAWidgetStateChange");
        linkedList.add("onSearchWAWidgetDataPush");
        linkedList.add("onGetVertSearchEntriesData");
        linkedList.add("emoticonIsChosen");
        linkedList.add("onSimilarEmoticonReady");
        linkedList.add("onSearchWebQueryReady");
        linkedList.add("onPullDownRefresh");
        linkedList.add(pf1.r.NAME);
        linkedList.add("onGetKeyboardHeight");
        linkedList.add(hc1.d.NAME);
        linkedList.add("onAddShortcutStatus");
        linkedList.add("onFocusSearchInput");
        linkedList.add("onGetA8KeyUrl");
        linkedList.add("deleteAccountSuccess");
        linkedList.add("onGetMsgProofItems");
        linkedList.add("WNJSHandlerInsert");
        linkedList.add("WNJSHandlerMultiInsert");
        linkedList.add("WNJSHandlerExportData");
        linkedList.add("WNJSHandlerHeaderAndFooterChange");
        linkedList.add("WNJSHandlerEditableChange");
        linkedList.add("WNJSHandlerEditingChange");
        linkedList.add("WNJSHandlerSaveSelectionRange");
        linkedList.add("WNJSHandlerLoadSelectionRange");
        linkedList.add("onCustomGameMenuClicked");
        linkedList.add("onNewlifeFeedStatusChanged");
        linkedList.add("onTingAudioStateChanged");
        linkedList.add("onFinderViewEvent");
        linkedList.add("showLoading");
        linkedList.add("getSearchEmotionDataCallBack");
        linkedList.add("onNavigationBarRightButtonClick");
        linkedList.add("onSearchActionSheetClick");
        linkedList.add("onGetMatchContactList");
        linkedList.add("onUiInit");
        linkedList.add("onUserToggleFullScreen");
        linkedList.add("onHalfScreenHeightWillChange");
        linkedList.add("onHalfScreenHeightIsChanging");
        linkedList.add("onHalfScreenHeightDidChange");
        linkedList.add("onCircleToSearchEvent");
        linkedList.add("onScreenShotJump");
        linkedList.add("onNetWorkChange");
        linkedList.add("onBackgroundAudioStateChange");
        if (!com.tencent.mm.sdk.platformtools.t8.L0(null)) {
            linkedList.addAll(null);
        }
        hashMap2.put("__runOn3rd_apis", new org.json.JSONArray((java.util.Collection) linkedList));
        sb7.append(su4.c3.b("sys:attach_runOn3rd_apis", hashMap2, false, mMWebView.getRandomStr()));
        sb7.append(")");
        mMWebView.evaluateJavascript(sb7.toString(), new su4.b3(d3Var, mMWebView, this.f413137b));
        com.tencent.mars.xlog.Log.i(str3, "jsapi init done");
    }

    @Override // com.tencent.xweb.h1
    public void o(com.tencent.xweb.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        com.tencent.mars.xlog.Log.i(this.f413138c.f412858a, "onPageStarted, view %s", webView.toString());
        ((yg0.s4) ((zg0.q3) i95.n0.c(zg0.q3.class))).getClass();
        com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f413136a;
        if (mMWebView == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.pluginsdk.ui.tools.w8(new com.tencent.mm.pluginsdk.ui.tools.v8(mMWebView)));
    }
}
