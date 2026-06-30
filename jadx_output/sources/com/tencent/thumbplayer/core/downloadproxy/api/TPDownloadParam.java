package com.tencent.thumbplayer.core.downloadproxy.api;

/* loaded from: classes16.dex */
public class TPDownloadParam {
    private static final java.lang.String FILE_NAME = "TPDownloadParam";
    private int dlType;
    private java.util.ArrayList<java.lang.String> urlList = new java.util.ArrayList<>();
    private java.util.Map<java.lang.String, java.lang.Object> extInfoMap = new java.util.HashMap();

    public TPDownloadParam(java.util.ArrayList<java.lang.String> arrayList, int i17, java.util.Map<java.lang.String, java.lang.Object> map) {
        this.dlType = i17;
        setUrlList(arrayList);
        setExtInfoMap(map);
    }

    private java.lang.String getExtraFormatNodesJsonInfo(java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> arrayList) {
        if (arrayList == null) {
            return "[]";
        }
        try {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("[");
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                java.util.Map<java.lang.String, java.lang.Object> map = arrayList.get(i17);
                if (i17 == arrayList.size() - 1) {
                    stringBuffer.append(java.lang.String.format("{\"dl_param_name\":\"%s\", \"dl_param_bitrate\":%s}", map.get("dl_param_name"), map.get("dl_param_bitrate")));
                } else {
                    stringBuffer.append(java.lang.String.format("{\"dl_param_name\":\"%s\", \"dl_param_bitrate\":%s}, ", map.get("dl_param_name"), map.get("dl_param_bitrate")));
                }
            }
            stringBuffer.append("]");
            return stringBuffer.toString();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getExtraJsonInfo failed, error:" + th6.toString());
            return "[]";
        }
    }

    private java.lang.String getUrlHostNodesJsonInfo(java.util.ArrayList<java.lang.String> arrayList) {
        if (arrayList == null) {
            return "[]";
        }
        try {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("[");
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                java.lang.String str = arrayList.get(i17);
                if (i17 == arrayList.size() - 1) {
                    stringBuffer.append(java.lang.String.format("\"%s\"", str));
                } else {
                    stringBuffer.append(java.lang.String.format("\"%s\", ", str));
                }
            }
            stringBuffer.append("]");
            return stringBuffer.toString();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getArrayListStr failed, error:" + th6.toString());
            return "[]";
        }
    }

    public java.lang.String getCdnUrls() {
        if (this.urlList == null) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.Map<java.lang.String, java.lang.Object> map = this.extInfoMap;
        boolean booleanValue = (map == null || !map.containsKey(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_ENABLE_EXPAND_DOWNLOAD_URL)) ? false : ((java.lang.Boolean) this.extInfoMap.get(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_ENABLE_EXPAND_DOWNLOAD_URL)).booleanValue();
        for (int i17 = 0; i17 < this.urlList.size(); i17++) {
            stringBuffer.append(this.urlList.get(i17));
            if (booleanValue) {
                if (this.urlList.get(i17).indexOf("?") > 0) {
                    stringBuffer.append("&cost=low");
                } else {
                    stringBuffer.append("?cost=low");
                }
            }
            stringBuffer.append(";");
        }
        if (stringBuffer.length() > 0) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }

    public int getClipCount() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.extInfoMap;
        if (map == null || map.isEmpty() || !this.extInfoMap.containsKey(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_PLAY_CLIP_COUNT)) {
            return 1;
        }
        return ((java.lang.Integer) this.extInfoMap.get(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_PLAY_CLIP_COUNT)).intValue();
    }

    public int getClipNo() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.extInfoMap;
        if (map == null || map.isEmpty() || !this.extInfoMap.containsKey(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_PLAY_CLIP_NO)) {
            return 1;
        }
        return ((java.lang.Integer) this.extInfoMap.get(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_PLAY_CLIP_NO)).intValue();
    }

    public int getDlType() {
        return this.dlType;
    }

    public java.lang.Object getExtInfo(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.Object> map = this.extInfoMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public java.util.Map<java.lang.String, java.lang.Object> getExtInfoMap() {
        return this.extInfoMap;
    }

    public java.lang.String getExtraJsonInfo() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.extInfoMap;
        if (map != null && !map.isEmpty()) {
            try {
                java.util.HashMap hashMap = new java.util.HashMap();
                for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : this.extInfoMap.entrySet()) {
                    if (!entry.getKey().equalsIgnoreCase(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_IS_OFFLINE) && !entry.getKey().equalsIgnoreCase(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_OFFLINE_PLAY_EXTRA_INFO) && !entry.getKey().equalsIgnoreCase(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_PLAY_DEFINITION) && !entry.getKey().equalsIgnoreCase(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_ENABLE_EXPAND_DOWNLOAD_URL)) {
                        hashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return new org.json.JSONObject(hashMap).toString();
            } catch (java.lang.Throwable th6) {
                com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog.e(FILE_NAME, 0, com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener.COMMON_TAG, "getExtraJsonInfo failed, error:" + th6.toString());
            }
        }
        return "";
    }

    public java.lang.String getFormat() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.extInfoMap;
        return (map == null || map.isEmpty() || !this.extInfoMap.containsKey(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_CURRENT_FORMAT)) ? "" : (java.lang.String) this.extInfoMap.get(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_CURRENT_FORMAT);
    }

    public java.lang.String getKeyid() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.extInfoMap;
        return (map == null || map.isEmpty() || !this.extInfoMap.containsKey(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_PLAY_KEYID)) ? "" : (java.lang.String) this.extInfoMap.get(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_PLAY_KEYID);
    }

    public java.util.Map<java.lang.String, java.lang.String> getOfflinePlayExtraInfo() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.extInfoMap;
        if (map == null || map.isEmpty() || !this.extInfoMap.containsKey(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_OFFLINE_PLAY_EXTRA_INFO)) {
            return null;
        }
        return (java.util.Map) this.extInfoMap.get(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_OFFLINE_PLAY_EXTRA_INFO);
    }

    public java.lang.String getPlayDefinition() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.extInfoMap;
        return (map == null || map.isEmpty() || !this.extInfoMap.containsKey(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_PLAY_DEFINITION)) ? "" : (java.lang.String) this.extInfoMap.get(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_PLAY_DEFINITION);
    }

    public java.lang.String getSavaPath() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.extInfoMap;
        return (map == null || map.isEmpty() || !this.extInfoMap.containsKey(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_SAVE_PATH)) ? "" : (java.lang.String) this.extInfoMap.get(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_SAVE_PATH);
    }

    public long getTotalDurationMS() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.extInfoMap;
        if (map == null || map.isEmpty() || !this.extInfoMap.containsKey(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_FILE_DURATION)) {
            return 0L;
        }
        return ((java.lang.Long) this.extInfoMap.get(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_FILE_DURATION)).longValue();
    }

    public java.util.ArrayList<java.lang.String> getUrlList() {
        return this.urlList;
    }

    public java.lang.String getVid() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.extInfoMap;
        return (map == null || map.isEmpty() || !this.extInfoMap.containsKey(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_VID)) ? "" : (java.lang.String) this.extInfoMap.get(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_VID);
    }

    public boolean isAdaptive() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.extInfoMap;
        return map != null && !map.isEmpty() && this.extInfoMap.containsKey(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_ADAPTIVE_TYPE) && ((java.lang.Integer) this.extInfoMap.get(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_ADAPTIVE_TYPE)).intValue() > 0;
    }

    public boolean isOffline() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.extInfoMap;
        if (map == null || map.isEmpty() || !this.extInfoMap.containsKey(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_IS_OFFLINE)) {
            return false;
        }
        return ((java.lang.Boolean) this.extInfoMap.get(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.DLPARAM_IS_OFFLINE)).booleanValue();
    }

    public void setDlType(int i17) {
        this.dlType = i17;
    }

    public void setExtInfoMap(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map != null) {
            this.extInfoMap = map;
        } else {
            this.extInfoMap.clear();
        }
    }

    public void setUrlList(java.util.ArrayList<java.lang.String> arrayList) {
        if (arrayList != null) {
            this.urlList = arrayList;
        } else {
            this.urlList.clear();
        }
    }
}
