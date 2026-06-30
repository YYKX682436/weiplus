package com.tencent.tmassistantsdk.openSDK;

/* loaded from: classes13.dex */
public abstract class BaseQQDownloaderOpenSDK {
    protected static final java.lang.String TAG = "BaseQQDownloaderOpenSDK";
    private byte _hellAccFlag_;
    protected int sdkAPILevel = 1;
    protected android.content.Context mContext = null;
    protected java.lang.String hostPackageName = null;
    protected int hostVersionCode = 0;
    protected com.tencent.tmassistantsdk.channel.TMAssistantSDKChannel sdkChannel = new com.tencent.tmassistantsdk.channel.TMAssistantSDKChannel();
    protected java.lang.ref.ReferenceQueue<com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener> mListenerQueue = new java.lang.ref.ReferenceQueue<>();
    protected java.util.ArrayList<java.lang.ref.WeakReference<com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener>> mWeakListenerArrayList = new java.util.ArrayList<>();

    public static int getQQDownloadApiLevel(android.content.Context context) {
        android.os.Bundle bundle;
        if (context == null) {
            return 0;
        }
        try {
            android.content.pm.ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.tencent.android.qqdownloader", 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return 0;
            }
            return bundle.getInt("com.tencent.android.qqdownloader.sdk.apilevel");
        } catch (java.lang.Exception unused) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "packagename not found！");
            return 0;
        }
    }

    public abstract long addDownloadTaskFromAppDetail(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z17, boolean z18);

    public abstract long addDownloadTaskFromAuthorize(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, java.lang.String str);

    public abstract long addDownloadTaskFromTaskList(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z17, boolean z18);

    public long addDownloadTaskFromWebview(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("url", str);
        java.lang.String formatIntentUriPath = formatIntentUriPath(5, hashMap);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "addDownloadTaskFromTaskList,hostPackageName=" + this.hostPackageName + "; hostVersionCode=" + this.hostVersionCode + "; hostUserIdentity=; dataItemType=0;dataItemAction=" + formatIntentUriPath);
        return this.sdkChannel.AddDataItem(this.hostPackageName, this.hostVersionCode, "", 0, formatIntentUriPath, currentTimeMillis, currentTimeMillis + 300000, 0, null);
    }

    public long buildAddDBData(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z17, boolean z18, java.lang.String str, java.lang.String str2, int i17) {
        java.util.Map<java.lang.String, java.lang.String> formatMapParams;
        if (android.text.TextUtils.isEmpty(str2)) {
            formatMapParams = formatMapParams(tMQQDownloaderOpenSDKParam, z17, z18);
        } else {
            formatMapParams = formatMapParams(tMQQDownloaderOpenSDKParam, true, true);
            formatMapParams.put("verifytype", str2);
        }
        java.lang.String formatIntentUriPath = formatIntentUriPath(i17, formatMapParams);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "addDownloadTaskFromTaskList,hostPackageName=" + this.hostPackageName + "; hostVersionCode=" + this.hostVersionCode + "; hostUserIdentity=; dataItemType=0;dataItemAction=" + formatIntentUriPath);
        return this.sdkChannel.AddDataItem(this.hostPackageName, this.hostVersionCode, "", 0, formatIntentUriPath, currentTimeMillis, currentTimeMillis + 300000, 0, null);
    }

    public int checkQQDownloaderInstalled() {
        android.content.Context context = this.mContext;
        if (context == null) {
            throw new java.lang.Exception("you must initial openSDK,by calling initQQDownloaderOpenSDK method!");
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                if (packageManager.getPackageInfo("com.tencent.android.qqdownloader", 0) != null) {
                    return this.sdkAPILevel > com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().getQQDownloaderAPILevel() ? 2 : 0;
                }
                return 1;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                com.tencent.tmassistantsdk.util.TMLog.i(TAG, "packagename not found！");
            }
        }
        return 1;
    }

    public abstract void destroyQQDownloaderOpenSDK();

    public java.lang.String formatEncryptUrl(java.lang.String str) {
        return "tmast://encrypt?encryptdata=" + java.net.URLEncoder.encode(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.encryptUri(str));
    }

    public java.lang.String formatIntentUriPath(int i17, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String str;
        if (i17 != 1) {
            str = "appdetails";
            if (i17 != 2 && i17 != 3) {
                if (i17 == 4) {
                    str = "updatedownload";
                } else if (i17 == 5) {
                    str = "webview";
                }
            }
        } else {
            str = "download";
        }
        java.lang.String str2 = "tpmast://" + str + "?";
        java.lang.String str3 = "";
        if (map != null && map.size() > 0) {
            int i18 = 0;
            java.lang.String str4 = "";
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.String value = entry.getValue();
                if (!android.text.TextUtils.isEmpty(key) && !android.text.TextUtils.isEmpty(value)) {
                    str4 = str4 + (i18 <= 0 ? "" : "&") + key + "=" + java.net.URLEncoder.encode(value);
                }
                i18++;
            }
            str3 = str4;
        }
        java.lang.String str5 = str2 + str3;
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "path:" + str5);
        return formatEncryptUrl(str5);
    }

    public java.util.Map<java.lang.String, java.lang.String> formatMapParams(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z17, boolean z18) {
        java.lang.String formatOplist = formatOplist(z17, z18);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("hostpname", this.hostPackageName);
        hashMap.put("hostversioncode", java.lang.String.valueOf(this.hostVersionCode));
        hashMap.put("sngappid", tMQQDownloaderOpenSDKParam.SNGAppId);
        hashMap.put("appid", tMQQDownloaderOpenSDKParam.taskAppId);
        hashMap.put("apkid", tMQQDownloaderOpenSDKParam.taskApkId);
        hashMap.put("pname", tMQQDownloaderOpenSDKParam.taskPackageName);
        hashMap.put(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_VIA, tMQQDownloaderOpenSDKParam.via);
        hashMap.put("uin", tMQQDownloaderOpenSDKParam.uin);
        hashMap.put("uintype", tMQQDownloaderOpenSDKParam.uinType);
        hashMap.put("versioncode", java.lang.String.valueOf(tMQQDownloaderOpenSDKParam.taskVersion));
        hashMap.put("oplist", formatOplist);
        hashMap.put("channelid", tMQQDownloaderOpenSDKParam.channelId);
        hashMap.put("actionflag", tMQQDownloaderOpenSDKParam.actionFlag);
        hashMap.put("sdkid", tMQQDownloaderOpenSDKParam.sdkId);
        return hashMap;
    }

    public java.lang.String formatOplist(boolean z17, boolean z18) {
        return (z17 && z18) ? "1;2" : z18 ? "2" : z17 ? "1" : "";
    }

    public abstract com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo getDownloadTaskState(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam);

    public abstract void initQQDownloaderOpenSDK(android.content.Context context);

    public void onStateChanged(com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, int i17, int i18, java.lang.String str) {
        java.util.Iterator<java.lang.ref.WeakReference<com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener>> it = this.mWeakListenerArrayList.iterator();
        while (it.hasNext()) {
            com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener iTMQQDownloaderOpenSDKListener = it.next().get();
            if (iTMQQDownloaderOpenSDKListener == null) {
                com.tencent.tmassistantsdk.util.TMLog.i(TAG, "onDownloadStateChanged listener = null");
            } else {
                iTMQQDownloaderOpenSDKListener.OnDownloadTaskStateChanged(tMQQDownloaderOpenSDKParam, i17, i18, str);
            }
        }
    }

    public boolean registerListener(com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener iTMQQDownloaderOpenSDKListener) {
        if (iTMQQDownloaderOpenSDKListener == null) {
            return false;
        }
        while (true) {
            java.lang.ref.Reference<? extends com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener> poll = this.mListenerQueue.poll();
            if (poll == null) {
                break;
            }
            this.mWeakListenerArrayList.remove(poll);
        }
        java.util.Iterator<java.lang.ref.WeakReference<com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener>> it = this.mWeakListenerArrayList.iterator();
        while (it.hasNext()) {
            if (it.next().get() == iTMQQDownloaderOpenSDKListener) {
                return true;
            }
        }
        this.mWeakListenerArrayList.add(new java.lang.ref.WeakReference<>(iTMQQDownloaderOpenSDKListener, this.mListenerQueue));
        return true;
    }

    public boolean removeDownloadTask(long j17) {
        if (j17 >= 0) {
            return this.sdkChannel.delDataItem(j17);
        }
        return false;
    }

    public abstract void startToAuthorized(android.content.Context context, com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, java.lang.String str);

    public void startToDownloadTaskList(android.content.Context context) {
        if (context == null) {
            throw new java.lang.Exception("you must input an application or activity context!");
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("tmast://download?hostpname=" + this.hostPackageName + "&hostversion=" + this.hostVersionCode));
        if (context instanceof android.app.Application) {
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/tmassistantsdk/openSDK/BaseQQDownloaderOpenSDK", "startToDownloadTaskList", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/tmassistantsdk/openSDK/BaseQQDownloaderOpenSDK", "startToDownloadTaskList", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public abstract void startToWebView(android.content.Context context, java.lang.String str);

    public boolean unregisterListener(com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener iTMQQDownloaderOpenSDKListener) {
        if (iTMQQDownloaderOpenSDKListener == null) {
            return false;
        }
        java.util.Iterator<java.lang.ref.WeakReference<com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDKListener>> it = this.mWeakListenerArrayList.iterator();
        while (it.hasNext()) {
            if (it.next().get() == iTMQQDownloaderOpenSDKListener) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public long buildAddDBData(byte[] bArr) {
        if (bArr == null) {
            return -1L;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        return this.sdkChannel.AddDataItem(null, 0, null, 0, null, currentTimeMillis, currentTimeMillis + 300000, 1, bArr);
    }
}
