package eo5;

/* loaded from: classes10.dex */
public final class b extends h.b {
    @Override // h.b
    public android.content.Intent a(android.content.Context context, java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent();
        if (str == null) {
            str = "";
        }
        intent.putExtra("kintent_talker", str);
        intent.putExtra("key_media_type", 2);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
        intent.setClassName(context, "com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI");
        return intent;
    }

    @Override // h.b
    public java.lang.Object c(int i17, android.content.Intent intent) {
        if (i17 == -1 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            java.lang.String stringExtra2 = intent.getStringExtra("fileExt");
            java.lang.String stringExtra3 = intent.getStringExtra(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME);
            if (stringExtra != null && stringExtra2 != null && stringExtra3 != null) {
                return new jz5.o(stringExtra, stringExtra2, stringExtra3);
            }
        }
        return null;
    }
}
