package o45;

/* loaded from: classes8.dex */
public abstract class uf {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.Set f343010a;

    public static final boolean a(java.lang.String str) {
        if (f343010a == null) {
            java.util.HashSet hashSet = new java.util.HashSet();
            f343010a = hashSet;
            hashSet.add("menu:share:QZone");
            f343010a.add("onImageDownloadProgress");
            f343010a.add("onVoiceUploadProgress");
            f343010a.add("onVoiceDownloadProgress");
            f343010a.add("onVoiceRecordEnd");
            f343010a.add("onVoicePlayBegin");
            f343010a.add("onVoicePlayEnd");
            f343010a.add("onLocalImageUploadProgress");
            f343010a.add("wxdownload:state_change");
            f343010a.add("wxdownload:progress_change");
            f343010a.add("hdOnDeviceStateChanged");
            f343010a.add("activity:state_change");
            f343010a.add("onWXDeviceBluetoothStateChange");
            f343010a.add("onWXDeviceLanStateChange");
            f343010a.add("onWXDeviceBindStateChange");
            f343010a.add("onReceiveDataFromWXDevice");
            f343010a.add("onScanWXDeviceResult");
            f343010a.add("onWXDeviceStateChange");
            f343010a.add("onGetKeyboardHeight");
            f343010a.add(hc1.d.NAME);
            f343010a.add("onAddShortcutStatus");
            f343010a.add("onMediaFileUploadProgess");
            f343010a.add("onGetA8KeyUrl");
            f343010a.add(pf1.r.NAME);
            f343010a.add("onGetMsgProofItems");
            f343010a.add("onNavigationBarRightButtonClick");
            f343010a.add("onBackgroundAudioStateChange");
            f343010a.add("onNetWorkChange");
            f343010a.add("onCustomGameMenuClicked");
            f343010a.add("onArticleReadingBtnClicked");
            f343010a.add("onRecordHistory");
            f343010a.add("onBeaconsInRange");
            f343010a.add("onPublishHaowanEnd");
            f343010a.add("onPublishHaowanProgress");
            f343010a.add("onMiniProgramData");
            f343010a.add("onUserGoBack");
            f343010a.add("onShareEmbedExcerptEvent");
        }
        return f343010a.contains(str);
    }
}
