package com.tencent.tmassistantsdk.network;

/* loaded from: classes13.dex */
public class GetSettingHttpRequest extends com.tencent.tmassistantsdk.network.PostHttpRequest {
    protected static final java.lang.String TAG = "GetSettingHttpRequest";
    protected com.tencent.tmassistantsdk.network.IGetSettingHttpListener mListener = null;

    @Override // com.tencent.tmassistantsdk.network.PostHttpRequest
    public void onFinished(com.qq.taf.jce.JceStruct jceStruct, com.qq.taf.jce.JceStruct jceStruct2, int i17) {
        if (jceStruct2 == null) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "response is null!");
            return;
        }
        com.tencent.tmassistantsdk.network.IGetSettingHttpListener iGetSettingHttpListener = this.mListener;
        if (iGetSettingHttpListener != null && i17 == 0 && (jceStruct2 instanceof com.tencent.tmassistantsdk.protocol.jce.GetSettingsResponse)) {
            com.tencent.tmassistantsdk.protocol.jce.GetSettingsResponse getSettingsResponse = (com.tencent.tmassistantsdk.protocol.jce.GetSettingsResponse) jceStruct2;
            if (getSettingsResponse.ret == 0) {
                iGetSettingHttpListener.onSettingHttpRequestFinish((com.tencent.tmassistantsdk.protocol.jce.GetSettingsRequest) jceStruct, getSettingsResponse, true);
            } else {
                iGetSettingHttpListener.onSettingHttpRequestFinish((com.tencent.tmassistantsdk.protocol.jce.GetSettingsRequest) jceStruct, getSettingsResponse, false);
            }
        }
    }

    public void sendSettingRequest() {
        super.sendRequest(new com.tencent.tmassistantsdk.protocol.jce.GetSettingsRequest());
    }

    public void setGetSettingHttpListener(com.tencent.tmassistantsdk.network.IGetSettingHttpListener iGetSettingHttpListener) {
        this.mListener = iGetSettingHttpListener;
    }
}
