package com.tencent.tmassistantsdk.openSDK.QQDownloader;

/* loaded from: classes6.dex */
public class AssistantStore {
    public static final java.lang.String AUTHORITY = "com.tencent.android.qqdownloader.provider";

    /* loaded from: classes6.dex */
    public static final class DownloadInfos implements android.provider.BaseColumns {
        public static final android.net.Uri CONTENT_URI = android.net.Uri.parse("content://com.tencent.android.qqdownloader.provider/downloadsinfo?notify=true");

        /* loaded from: classes6.dex */
        public interface DownloadInfoColumns {
            public static final java.lang.String APKID = "apkId";
            public static final java.lang.String APPURLS = "apkUrl";
            public static final java.lang.String CHANNELID = "channelId";
            public static final java.lang.String FILEPATH = "filePath";
            public static final java.lang.String PACKAGENAME = "packageName";
            public static final java.lang.String RECEIVEDLENGTH = "received_length";
            public static final java.lang.String STATE = "state";
            public static final java.lang.String TOTALLENGTH = "total_length";
            public static final java.lang.String VERSIONCODE = "versionCode";
        }
    }
}
