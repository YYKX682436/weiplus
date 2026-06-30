package qs;

/* loaded from: classes15.dex */
public class s implements com.tencent.mm.app.v6 {
    @Override // com.tencent.mm.app.v6
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        boolean z17;
        java.lang.String[] split;
        z71.l.a().getClass();
        java.util.LinkedList linkedList = y52.a.a().f377354d;
        if (linkedList == null || linkedList.size() == 0) {
            return;
        }
        if (activity.getClass().getName().endsWith(((r45.jw3) linkedList.get(linkedList.size() - 1)).f378159d)) {
            linkedList.remove(linkedList.size() - 1);
        }
        if (linkedList.size() == 0) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            r45.jw3 jw3Var = (r45.jw3) it.next();
            if (jw3Var != null) {
                if ("CropImageNewUI;MiniQbCallBackUI;MiniQBReaderUI;NfcWebViewUI;WNNoteFavWebViewUI;WNNoteMsgWebViewUI;SnsAdNativeLandingPagesUI;VideoFullScreenActivity;EmojiCaptureUI;StickerPreviewUI;AppBrandNearbyWebViewUI;AppBrandSOSUI;ShortCutPermissionDetailUI;GameWebViewUI;GameTabWebUI;GameTabWebUI1;GameTabWebUI2;LuggageGameWebViewUI;TmplWebViewToolUI;DownloadDetailUI;WebViewUI;CustomSchemeEntryWebViewUI;WebViewTestUI;TransparentWebViewUI;ContactQZoneWebView;QRCodeIntroductionWebViewUI;GameChattingRoomWebViewUI;H5GameWebViewUI;EmojiStoreSearchWebViewUI;ToolsRecordUI;SightCaptureUITest;FaceDetectUI;ReadMailUI;MailWebViewUI;SightCaptureUI;SightSettingsUI;MMSightEditUI;MMNewPhotoEditUI;VideoSegmentUI;VideoCompressUI;AppBrandSearchUI;LuggageGameUI;LuggageGameHalfWebViewUI;GameWebTabUI;FTSWebViewUI;FTSSearchTabWebViewUI;FTSSOSHomeWebViewUI;FTSSOSMoreWebViewUI;SosWebViewUI;".contains(jw3Var.f378159d + ";")) {
                    z17 = true;
                    break;
                }
            }
        }
        if (z17 || (split = activity.getClass().getName().split("\\.")) == null || split.length == 0) {
            return;
        }
        java.lang.String str = split[split.length - 1] + ";";
        if (com.tencent.mm.plugin.ai.data.business.tools_mp.a.f74655e.contains(str) || str.contains("LauncherUI") || str.contains("SnsTimeLineUI")) {
            return;
        }
        com.tencent.mm.plugin.ai.data.business.tools_mp.a.f74655e += str;
        com.tencent.mm.sdk.platformtools.o4.L().putString("ai_is_tools_or_mp_entry", com.tencent.mm.plugin.ai.data.business.tools_mp.a.f74655e);
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityDestroyed(android.app.Activity activity) {
        z71.l.a().getClass();
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityPaused(android.app.Activity activity) {
        z71.l.a().getClass();
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityResumed(android.app.Activity activity) {
        z71.l.a().getClass();
    }

    @Override // com.tencent.mm.app.v6
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        z71.l.a().getClass();
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityStarted(android.app.Activity activity) {
        z71.l.a().getClass();
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityStopped(android.app.Activity activity) {
        z71.l.a().getClass();
    }
}
