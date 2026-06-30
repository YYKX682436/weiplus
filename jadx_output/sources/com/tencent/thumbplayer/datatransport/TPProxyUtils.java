package com.tencent.thumbplayer.datatransport;

/* loaded from: classes16.dex */
public class TPProxyUtils {
    public static final java.lang.String PROXY_SO_NAME = "DownloadProxy";
    public static final java.lang.String TAG = "TPProxyUtils";

    public static com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam convertProxyDownloadParams(java.lang.String str, com.tencent.thumbplayer.api.proxy.TPDownloadParamData tPDownloadParamData, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.Object> map2) {
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> arrayList;
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> arrayList2 = null;
        if (tPDownloadParamData == null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(1);
            arrayList3.add(str);
            return new com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam(arrayList3, 0, null);
        }
        java.util.ArrayList<java.lang.String> arrayList4 = new java.util.ArrayList<>();
        if (tPDownloadParamData.getUrlCdnidList() == null || tPDownloadParamData.getUrlCdnidList().isEmpty()) {
            if (android.text.TextUtils.isEmpty(str)) {
                arrayList4.add(tPDownloadParamData.url);
            } else {
                arrayList4.add(str);
            }
            java.lang.String[] bakUrl = tPDownloadParamData.getBakUrl();
            if (bakUrl != null && bakUrl.length > 0) {
                for (int i17 = 0; i17 < bakUrl.length; i17++) {
                    if (!android.text.TextUtils.isEmpty(bakUrl[i17])) {
                        arrayList4.add(bakUrl[i17]);
                    }
                }
            }
            if (map != null) {
                arrayList2 = new java.util.ArrayList<>();
                arrayList2.add(map);
            }
            arrayList = arrayList2;
        } else {
            arrayList4 = tPDownloadParamData.getUrlCdnidList();
            arrayList = tPDownloadParamData.getUrlCdnidHttpHeaderList();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!android.text.TextUtils.isEmpty(tPDownloadParamData.getFlowId())) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, tPDownloadParamData.getFlowId());
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_PLAY_FLOWID, tPDownloadParamData.getFlowId());
        }
        if (tPDownloadParamData.getUrlExpireTime() > 0) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_URL_EXPIRE_TIME, java.lang.Integer.valueOf(tPDownloadParamData.getUrlExpireTime()));
        }
        if (tPDownloadParamData.getFileSize() > 0) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_FILE_SIZE, java.lang.Long.valueOf(tPDownloadParamData.getFileSize()));
        }
        if (tPDownloadParamData.getFileDuration() > 0) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_FILE_DURATION, java.lang.Long.valueOf(tPDownloadParamData.getFileDuration()));
        }
        if (!android.text.TextUtils.isEmpty(tPDownloadParamData.getDownloadFileID())) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_PLAY_KEYID, tPDownloadParamData.getDownloadFileID());
        }
        if (!android.text.TextUtils.isEmpty(tPDownloadParamData.getVid())) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_VID, tPDownloadParamData.getVid());
        }
        if (!android.text.TextUtils.isEmpty(tPDownloadParamData.getPlayDefinition())) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_PLAY_DEFINITION, tPDownloadParamData.getPlayDefinition());
        }
        if (!android.text.TextUtils.isEmpty(tPDownloadParamData.getCurrentFormat())) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_CURRENT_FORMAT, tPDownloadParamData.getCurrentFormat());
        }
        if (tPDownloadParamData.getCurrentFormatID() > 0) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_CURRENT_FORMATID, java.lang.Integer.valueOf(tPDownloadParamData.getCurrentFormatID()));
        }
        if (!com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(tPDownloadParamData.getFormatInfo())) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_FORMAT_INFO, tPDownloadParamData.getFormatInfo());
        }
        if (tPDownloadParamData.getBandwidthLevel() > 0) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_BAND_WIDTH_LEVEL, java.lang.Integer.valueOf(tPDownloadParamData.getBandwidthLevel()));
        }
        hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_SOURCE_IS_CHARGE, java.lang.Boolean.valueOf(tPDownloadParamData.isCharge()));
        hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_CACHE_NEED_ENCRYPT, java.lang.Boolean.valueOf(tPDownloadParamData.isNeedEncryptCache()));
        hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_IS_OFFLINE, java.lang.Boolean.valueOf(tPDownloadParamData.isOffline()));
        hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_ENABLE_EXPAND_DOWNLOAD_URL, java.lang.Boolean.valueOf(tPDownloadParamData.isExtraParam()));
        if (arrayList != null && !arrayList.isEmpty()) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_URL_HEADER, arrayList);
        }
        if (tPDownloadParamData.getPreloadSize() > 0) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_PRELOAD_SIZE, java.lang.Long.valueOf(tPDownloadParamData.getPreloadSize()));
        }
        if (tPDownloadParamData.getPreloadDuration() > 0) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_PRELOAD_DURATION, java.lang.Long.valueOf(tPDownloadParamData.getPreloadDuration()));
        }
        if (!android.text.TextUtils.isEmpty(tPDownloadParamData.getSavePath())) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_SAVE_PATH, tPDownloadParamData.getSavePath());
        }
        if (tPDownloadParamData.getStarTimeMS() > 0) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_PLAY_START_TIME, java.lang.Integer.valueOf(tPDownloadParamData.getStarTimeMS()));
        }
        if (tPDownloadParamData.getEndTimeMS() > 0) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_PLAY_END_TIME, java.lang.Integer.valueOf(tPDownloadParamData.getEndTimeMS()));
        }
        if (tPDownloadParamData.getClipCount() > 0) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_PLAY_CLIP_COUNT, java.lang.Integer.valueOf(tPDownloadParamData.getClipCount()));
        }
        if (tPDownloadParamData.getClipNo() > 0) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_PLAY_CLIP_NO, java.lang.Integer.valueOf(tPDownloadParamData.getClipNo()));
        }
        if (!android.text.TextUtils.isEmpty(tPDownloadParamData.getBase())) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_VINFO_BASE, tPDownloadParamData.getBase());
        }
        if (!android.text.TextUtils.isEmpty(tPDownloadParamData.getLinkVid())) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_VINFO_LINK_VID, tPDownloadParamData.getLinkVid());
        }
        if (!android.text.TextUtils.isEmpty(tPDownloadParamData.getFileMD5())) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_FILE_MD5, tPDownloadParamData.getFileMD5());
        }
        if (!android.text.TextUtils.isEmpty(tPDownloadParamData.getM3u8())) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_VINFO_M3U8, tPDownloadParamData.getM3u8());
        }
        if (tPDownloadParamData.getTm() > 0) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_VINFO_TM, java.lang.Long.valueOf(tPDownloadParamData.getTm()));
        }
        if (!android.text.TextUtils.isEmpty(tPDownloadParamData.getNonce())) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "nonce:" + tPDownloadParamData.getNonce());
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_NONCE, tPDownloadParamData.getNonce());
        }
        if (!android.text.TextUtils.isEmpty(tPDownloadParamData.getDecKey())) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "encrypt stream key:" + tPDownloadParamData.getDecKey());
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_ENCRYPT_STREAM_KEY, tPDownloadParamData.getDecKey());
        }
        if (!android.text.TextUtils.isEmpty(tPDownloadParamData.getRandoms())) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "encrypt randoms:" + tPDownloadParamData.getRandoms());
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_ENCRYPT_STREAM_RANDOMS, tPDownloadParamData.getRandoms());
        }
        hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_VINFO_FP2P, java.lang.Integer.valueOf(tPDownloadParamData.getFp2p()));
        if (tPDownloadParamData.getTestid() > 0) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_VINFO_TESTID, java.lang.Integer.valueOf(tPDownloadParamData.getTestid()));
        }
        if (tPDownloadParamData.getExceptDelay() > 0) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_EXPECT_DELAY_TIME, java.lang.Integer.valueOf(tPDownloadParamData.getExceptDelay()));
        }
        if (tPDownloadParamData.getSecondaryM3u8List() != null) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_VINFO_SECONDARY_M3U8_LIST, tPDownloadParamData.getSecondaryM3u8List());
        }
        if (tPDownloadParamData.getPreloadHttpStartTimeMs() >= 0) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_PREPARE_HTTP_START_TIME, java.lang.Long.valueOf(tPDownloadParamData.getPreloadHttpStartTimeMs()));
        }
        if (!android.text.TextUtils.isEmpty(tPDownloadParamData.getSceneId())) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_SCENE_ID, tPDownloadParamData.getSceneId());
        }
        if (!android.text.TextUtils.isEmpty(tPDownloadParamData.getPcdnChargeId())) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_PCDN_CHARGE_ID, tPDownloadParamData.getPcdnChargeId());
        }
        hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_CACHE_COPY_FIRST, java.lang.Boolean.valueOf(tPDownloadParamData.isCacheCopyFirst()));
        hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_NEED_FLOW_CONTROL, java.lang.Boolean.valueOf(tPDownloadParamData.isNeedFlowControl()));
        if (!com.tencent.thumbplayer.utils.TPCommonUtils.isEmpty(tPDownloadParamData.getExtInfoMap())) {
            hashMap.putAll(tPDownloadParamData.getExtInfoMap());
        }
        hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_FORMAT_NODES, tPDownloadParamData.getDefInfoList());
        if (map2 != null && !map2.isEmpty()) {
            hashMap.putAll(map2);
        }
        if (tPDownloadParamData.getPcdnUrlList() != null && !tPDownloadParamData.getPcdnUrlList().isEmpty()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            java.util.Iterator<java.lang.String> it = tPDownloadParamData.getPcdnUrlList().iterator();
            while (it.hasNext()) {
                sb6.append(it.next());
                sb6.append(";");
            }
            if (sb6.length() > 0) {
                sb6.deleteCharAt(sb6.length() - 1);
            }
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "pcdn url list: " + sb6.toString());
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_PCDN_URLS, sb6.toString());
        }
        if (tPDownloadParamData.getPcdnVtList() != null && !tPDownloadParamData.getPcdnVtList().isEmpty()) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("");
            java.util.Iterator<java.lang.Integer> it6 = tPDownloadParamData.getPcdnVtList().iterator();
            while (it6.hasNext()) {
                sb7.append(it6.next().intValue());
                sb7.append(";");
            }
            if (sb7.length() > 0) {
                sb7.deleteCharAt(sb7.length() - 1);
            }
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_PCDN_VTS, sb7.toString());
        }
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> headersList = tPDownloadParamData.getHeadersList();
        if (headersList != null && !headersList.isEmpty()) {
            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_URL_HEADER, headersList);
        }
        return new com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam(arrayList4, com.tencent.thumbplayer.datatransport.TPProxyEnumUtils.dlType2Inner(tPDownloadParamData.getDlType()), hashMap);
    }
}
