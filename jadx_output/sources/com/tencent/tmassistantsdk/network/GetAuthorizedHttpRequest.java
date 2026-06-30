package com.tencent.tmassistantsdk.network;

/* loaded from: classes13.dex */
public class GetAuthorizedHttpRequest extends com.tencent.tmassistantsdk.network.GetHttpRequest {
    protected static final java.lang.String TAG = "GetAuthorizedHttpRequest";
    protected com.tencent.tmassistantsdk.network.IGetAuthorizedHttpRequestListenner mGetAuthorizedListener = null;

    private java.lang.String authorizedInfoToString(com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKAuthorizedInfo tMOpenSDKAuthorizedInfo) {
        return ((((((((((("?appId=" + java.net.URLEncoder.encode(tMOpenSDKAuthorizedInfo.appId)) + "&userId=" + java.net.URLEncoder.encode(tMOpenSDKAuthorizedInfo.userId)) + "&userIdType=" + java.net.URLEncoder.encode(tMOpenSDKAuthorizedInfo.userIdType)) + "&identityInfo=" + java.net.URLEncoder.encode(tMOpenSDKAuthorizedInfo.identityInfo)) + "&identityType=" + java.net.URLEncoder.encode(tMOpenSDKAuthorizedInfo.identityType)) + "&gamePackageName=" + java.net.URLEncoder.encode(tMOpenSDKAuthorizedInfo.gamePackageName)) + "&gameVersionCode=" + java.net.URLEncoder.encode(tMOpenSDKAuthorizedInfo.gameVersionCode)) + "&gameChannelId=" + java.net.URLEncoder.encode(tMOpenSDKAuthorizedInfo.gameChannelId)) + "&actionFlag=" + java.net.URLEncoder.encode(tMOpenSDKAuthorizedInfo.actionFlag)) + "&verifyType=" + java.net.URLEncoder.encode(tMOpenSDKAuthorizedInfo.verifyType)) + "&via=" + java.net.URLEncoder.encode(tMOpenSDKAuthorizedInfo.via)) + "&actionType=" + tMOpenSDKAuthorizedInfo.actionType;
    }

    private com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.AuthorizedResult jsonObjectToRespData(org.json.JSONObject jSONObject) {
        com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.TipsInfo tipsInfo;
        com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.AuthorizedResult authorizedResult = new com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.AuthorizedResult();
        authorizedResult.hasAuthoried = jSONObject.getInt("hasAuthoried");
        authorizedResult.errorCode = jSONObject.getInt(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE);
        authorizedResult.downloadUrl = jSONObject.getString("downloadUrl");
        authorizedResult.versionCode = jSONObject.getInt(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.VERSIONCODE);
        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("tipsInfo");
        if (jSONObject2 == null || jSONObject2.length() <= 0) {
            tipsInfo = null;
        } else {
            tipsInfo = new com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.TipsInfo();
            tipsInfo.title = jSONObject2.getString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            tipsInfo.content = jSONObject2.getString("content");
            org.json.JSONArray jSONArray = jSONObject2.getJSONArray("actionButton");
            java.util.ArrayList<com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.ActionButton> arrayList = new java.util.ArrayList<>();
            if (jSONArray != null && jSONArray.length() > 0) {
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.ActionButton actionButton = new com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.ActionButton();
                    actionButton.textInstalled = jSONArray.getJSONObject(i17).getString("textInstalled");
                    actionButton.textUninstalled = jSONArray.getJSONObject(i17).getString("textUninstalled");
                    actionButton.jumpType = jSONArray.getJSONObject(i17).getInt("jumpType");
                    actionButton.jumpUrl = jSONArray.getJSONObject(i17).getString("jumpUrl");
                    arrayList.add(actionButton);
                }
            }
            tipsInfo.actionButton = arrayList;
        }
        authorizedResult.tipsInfo = tipsInfo;
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "dataInfo :" + authorizedResult.toString());
        return authorizedResult;
    }

    @Override // com.tencent.tmassistantsdk.network.GetHttpRequest
    public void onFinished(org.json.JSONObject jSONObject, int i17) {
        com.tencent.tmassistantsdk.network.IGetAuthorizedHttpRequestListenner iGetAuthorizedHttpRequestListenner = this.mGetAuthorizedListener;
        if (iGetAuthorizedHttpRequestListenner == null) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "mGetAuthorizedListener is null !");
            return;
        }
        try {
            if (i17 != 0 || jSONObject == null) {
                iGetAuthorizedHttpRequestListenner.onGetAuthorizedRequestFinished(null, i17);
            } else {
                com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.AuthorizedResult jsonObjectToRespData = jsonObjectToRespData(jSONObject);
                if (jsonObjectToRespData != null) {
                    this.mGetAuthorizedListener.onGetAuthorizedRequestFinished(jsonObjectToRespData, 0);
                }
            }
        } catch (org.json.JSONException e17) {
            this.mGetAuthorizedListener.onGetAuthorizedRequestFinished(null, 704);
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    public void sendRequest(com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKAuthorizedInfo tMOpenSDKAuthorizedInfo) {
        if (tMOpenSDKAuthorizedInfo != null) {
            super.sendData(authorizedInfoToString(tMOpenSDKAuthorizedInfo));
        }
    }

    public void setListenner(com.tencent.tmassistantsdk.network.IGetAuthorizedHttpRequestListenner iGetAuthorizedHttpRequestListenner) {
        this.mGetAuthorizedListener = iGetAuthorizedHttpRequestListenner;
    }
}
