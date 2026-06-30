package com.tencent.tmassistantsdk.downloadservice;

/* loaded from: classes13.dex */
public class DownloadSetting {
    public static final java.lang.String ISDOWNLOADWIFIONLY = "isDownloadWifiOnly";
    public static final java.lang.String ISTASKAUTORESUME = "isTaskAutoResume";
    public static final java.lang.String MAXTASKNUM = "maxTaskNum";
    private static final java.lang.String TAG = "DownloadSetting";
    public static final java.lang.String TYPE_BOOLEAN = "boolean";
    public static final java.lang.String TYPE_INTEGER = "Integer";
    protected static com.tencent.tmassistantsdk.downloadservice.DownloadSetting mInstance;
    protected boolean isTaskAutoResume = true;
    protected boolean isDownloadWifiOnly = false;
    protected int maxTaskNum = 5;

    public DownloadSetting() {
        loadFromDB();
    }

    public static synchronized com.tencent.tmassistantsdk.downloadservice.DownloadSetting getInstance() {
        com.tencent.tmassistantsdk.downloadservice.DownloadSetting downloadSetting;
        synchronized (com.tencent.tmassistantsdk.downloadservice.DownloadSetting.class) {
            if (mInstance == null) {
                mInstance = new com.tencent.tmassistantsdk.downloadservice.DownloadSetting();
            }
            downloadSetting = mInstance;
        }
        return downloadSetting;
    }

    public static int getSplitSizeInBytes(java.lang.String str) {
        if (str.equalsIgnoreCase("WIFI")) {
            throw new java.lang.UnsupportedOperationException("Split is not allowed in current version. netType: ".concat(str));
        }
        return (!str.contains("net") && str.contains("wap")) ? com.tencent.tmassistantsdk.downloadservice.Downloads.SPLIT_RANGE_SIZE_WAP : com.tencent.tmassistantsdk.downloadservice.Downloads.SPLIT_RANGE_SIZE_NET;
    }

    private void loadFromDB() {
        java.util.HashMap<java.lang.String, java.lang.String> query = com.tencent.tmassistantsdk.storage.table.DownloadSettingTable.query();
        java.lang.String str = query.get(ISTASKAUTORESUME);
        if (str != null && str.length() > 0) {
            this.isTaskAutoResume = !str.equals("false");
        }
        java.lang.String str2 = query.get(ISDOWNLOADWIFIONLY);
        if (str2 != null && str2.length() > 0) {
            this.isDownloadWifiOnly = !str2.equals("false");
        }
        java.lang.String str3 = query.get(MAXTASKNUM);
        if (str3 == null || str3.length() <= 0) {
            return;
        }
        this.maxTaskNum = com.tencent.mm.sdk.platformtools.t8.P(str3, 0);
    }

    public boolean getIsDownloadWifiOnly() {
        return this.isDownloadWifiOnly;
    }

    public boolean getIsTaskAutoResume() {
        return this.isTaskAutoResume;
    }

    public int getMaxTaskNum() {
        return this.maxTaskNum;
    }

    public boolean isAutoDownload() {
        if (!this.isTaskAutoResume) {
            return false;
        }
        java.lang.String netStatus = com.tencent.tmassistantsdk.downloadservice.DownloadHelper.getNetStatus();
        return netStatus.contains("wifi") || netStatus.contains("net");
    }

    public void setIsDownloadWifiOnly(boolean z17) {
        com.tencent.tmassistantsdk.downloadservice.DownloadSetting downloadSetting = mInstance;
        if (downloadSetting.isDownloadWifiOnly == z17) {
            return;
        }
        downloadSetting.isDownloadWifiOnly = z17;
        com.tencent.tmassistantsdk.storage.table.DownloadSettingTable.save(ISDOWNLOADWIFIONLY, java.lang.String.valueOf(z17), TYPE_BOOLEAN);
    }

    public void setIsTaskAutoResume(boolean z17) {
        com.tencent.tmassistantsdk.downloadservice.DownloadSetting downloadSetting = mInstance;
        if (downloadSetting.isTaskAutoResume == z17) {
            return;
        }
        downloadSetting.isTaskAutoResume = z17;
        com.tencent.tmassistantsdk.storage.table.DownloadSettingTable.save(ISTASKAUTORESUME, java.lang.String.valueOf(z17), TYPE_BOOLEAN);
    }

    public void setMaxTaskNum(int i17) {
        com.tencent.tmassistantsdk.downloadservice.DownloadSetting downloadSetting = mInstance;
        if (downloadSetting.maxTaskNum == i17) {
            return;
        }
        downloadSetting.maxTaskNum = i17;
        com.tencent.tmassistantsdk.storage.table.DownloadSettingTable.save(MAXTASKNUM, java.lang.String.valueOf(i17), TYPE_INTEGER);
    }

    public boolean isAutoDownload(java.lang.String str, java.lang.String str2) {
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "downloadInfoNetType = " + str);
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "currentNetType = " + str2);
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        if (str2.equalsIgnoreCase("WIFI")) {
            return true;
        }
        return str2.contains("net") && !str.equalsIgnoreCase("WIFI");
    }
}
