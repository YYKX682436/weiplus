package com.tencent.thumbplayer.core.common;

/* loaded from: classes13.dex */
public final class TPMediaDecoderList {
    private static final int GET_SYSTEM_MEDIA_CODEC_LIST_TIMEOUT_MS = 2000;
    private static final java.lang.String MEDIA_DECODER_INFO_KEY = "DecoderInfos_Key";
    private static java.lang.String MEDIA_DECODER_VERSION = "2.33.0.1025.wechat";
    private static final java.lang.String MEDIA_DECODER_VERSION_KEY = "Version_Key";
    private static final java.lang.String TAG = "TPMediaDecoderList";
    private static com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[] sDecoderInfos;

    public static /* synthetic */ com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[] access$000() {
        return getSystemMediaCodecList();
    }

    private static java.lang.String buildCacheDecoderVersion() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(MEDIA_DECODER_VERSION);
        stringBuffer.append("_");
        stringBuffer.append(com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName());
        stringBuffer.append("_");
        stringBuffer.append(com.tencent.thumbplayer.core.common.TPSystemInfo.getProductBoard());
        stringBuffer.append("_");
        stringBuffer.append(com.tencent.thumbplayer.core.common.TPSystemInfo.getProductDevice());
        stringBuffer.append("_");
        stringBuffer.append(com.tencent.thumbplayer.core.common.TPSystemInfo.getApiLevel());
        return stringBuffer.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void cacheDecoderInfos(com.tencent.thumbplayer.core.thirdparties.LocalCache localCache, com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[] tPMediaDecoderInfoArr) {
        try {
            localCache.put(MEDIA_DECODER_INFO_KEY, (java.io.Serializable) tPMediaDecoderInfoArr);
        } catch (java.lang.Throwable unused) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "cache decode infos failed");
        }
    }

    private static void cacheVersion(com.tencent.thumbplayer.core.thirdparties.LocalCache localCache, java.lang.String str) {
        try {
            localCache.put(MEDIA_DECODER_VERSION_KEY, str);
        } catch (java.lang.Throwable unused) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "cache version failed");
        }
    }

    private static com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[] getCachedDecoderInfos(com.tencent.thumbplayer.core.thirdparties.LocalCache localCache) {
        try {
            return (com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[]) localCache.getAsObject(MEDIA_DECODER_INFO_KEY);
        } catch (java.lang.Throwable unused) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "get decoder info failed");
            return null;
        }
    }

    private static java.lang.String getCachedVersion(com.tencent.thumbplayer.core.thirdparties.LocalCache localCache) {
        try {
            java.lang.String asString = localCache.getAsString(MEDIA_DECODER_VERSION_KEY);
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "version:" + asString);
            return asString;
        } catch (java.lang.Throwable unused) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "get version failed");
            return null;
        }
    }

    private static final android.media.MediaCodecInfo[] getCodecInfos() {
        try {
            return new android.media.MediaCodecList(1).getCodecInfos();
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, "getCodecInfos MediaCodecList " + e17.getMessage());
            return new android.media.MediaCodecInfo[0];
        }
    }

    private static final com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[] getLocalCacheMediaCodecList(com.tencent.thumbplayer.core.thirdparties.LocalCache localCache) {
        com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[] cachedDecoderInfos;
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "getLocalCacheMediaCodecList");
        if (!android.text.TextUtils.equals(getCachedVersion(localCache), buildCacheDecoderVersion()) || (cachedDecoderInfos = getCachedDecoderInfos(localCache)) == null) {
            return null;
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "getCachedDecoderInfos length " + cachedDecoderInfos.length);
        return cachedDecoderInfos;
    }

    private static com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[] getSystemMediaCodecList() {
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "getSystemMediaCodecList");
        android.media.MediaCodecInfo[] codecInfos = getCodecInfos();
        if (codecInfos == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.media.MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (!mediaCodecInfo.isEncoder()) {
                for (java.lang.String str : mediaCodecInfo.getSupportedTypes()) {
                    com.tencent.thumbplayer.core.common.TPMediaDecoderInfo tPMediaDecoderInfo = new com.tencent.thumbplayer.core.common.TPMediaDecoderInfo(str, mediaCodecInfo.getName(), mediaCodecInfo.getCapabilitiesForType(str));
                    if (tPMediaDecoderInfo.isValidDecoder()) {
                        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "MediaCodecList codecName " + mediaCodecInfo.getName() + " supportedType " + str);
                        arrayList.add(tPMediaDecoderInfo);
                    }
                }
            }
        }
        return (com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[]) arrayList.toArray(new com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[arrayList.size()]);
    }

    private static com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[] getSystemMediaCodecListAsyncAndTimeOutWait() {
        boolean z17;
        final com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[][] tPMediaDecoderInfoArr = (com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) com.tencent.thumbplayer.core.common.TPMediaDecoderInfo.class, 1, 1);
        tPMediaDecoderInfoArr[0] = null;
        final boolean[] zArr = {false};
        new java.lang.Thread(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.core.common.TPMediaDecoderList.1
            @Override // java.lang.Runnable
            public void run() {
                tPMediaDecoderInfoArr[0] = com.tencent.thumbplayer.core.common.TPMediaDecoderList.access$000();
                synchronized (tPMediaDecoderInfoArr) {
                    zArr[0] = true;
                    tPMediaDecoderInfoArr.notify();
                }
            }
        }).start();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (tPMediaDecoderInfoArr) {
            z17 = false;
            for (long j17 = 2000; j17 > 0; j17 -= java.lang.System.currentTimeMillis() - currentTimeMillis) {
                if (zArr[0]) {
                    break;
                }
                try {
                    tPMediaDecoderInfoArr.wait(j17);
                } catch (java.lang.InterruptedException unused) {
                    z17 = true;
                }
            }
        }
        if (z17) {
            java.lang.Thread.currentThread().interrupt();
        }
        com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[] tPMediaDecoderInfoArr2 = tPMediaDecoderInfoArr[0];
        return tPMediaDecoderInfoArr2 == null ? new com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[0] : tPMediaDecoderInfoArr2;
    }

    public static final synchronized com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[] getTPMediaDecoderInfos(com.tencent.thumbplayer.core.thirdparties.LocalCache localCache) {
        com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[] tPMediaDecoderInfoArr;
        synchronized (com.tencent.thumbplayer.core.common.TPMediaDecoderList.class) {
            if (sDecoderInfos == null || localCache == null) {
                sDecoderInfos = initCodecList(localCache);
            }
            com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[] tPMediaDecoderInfoArr2 = sDecoderInfos;
            tPMediaDecoderInfoArr = (com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[]) java.util.Arrays.copyOf(tPMediaDecoderInfoArr2, tPMediaDecoderInfoArr2.length);
        }
        return tPMediaDecoderInfoArr;
    }

    private static final com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[] initCodecList(com.tencent.thumbplayer.core.thirdparties.LocalCache localCache) {
        com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[] localCacheMediaCodecList = getLocalCacheMediaCodecList(localCache);
        if (localCacheMediaCodecList != null && localCacheMediaCodecList.length != 0) {
            return localCacheMediaCodecList;
        }
        com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[] systemMediaCodecListAsyncAndTimeOutWait = getSystemMediaCodecListAsyncAndTimeOutWait();
        storeLocalCacheMediaCodecList(localCache, systemMediaCodecListAsyncAndTimeOutWait);
        return systemMediaCodecListAsyncAndTimeOutWait;
    }

    private static final void storeLocalCacheMediaCodecList(com.tencent.thumbplayer.core.thirdparties.LocalCache localCache, com.tencent.thumbplayer.core.common.TPMediaDecoderInfo[] tPMediaDecoderInfoArr) {
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "storeLocalCacheMediaCodecList");
        cacheDecoderInfos(localCache, tPMediaDecoderInfoArr);
        cacheVersion(localCache, buildCacheDecoderVersion());
    }
}
