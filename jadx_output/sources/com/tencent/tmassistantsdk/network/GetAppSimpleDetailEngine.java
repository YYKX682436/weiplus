package com.tencent.tmassistantsdk.network;

/* loaded from: classes13.dex */
public class GetAppSimpleDetailEngine extends com.tencent.tmassistantsdk.network.PostHttpRequest {
    protected static final java.lang.String TAG = "GetAppSimpleDetailHttpRequest";
    protected com.tencent.tmassistantsdk.downloadclient.ITMAssistantExchangeURLListenner mListener;

    public GetAppSimpleDetailEngine(com.tencent.tmassistantsdk.downloadclient.ITMAssistantExchangeURLListenner iTMAssistantExchangeURLListenner) {
        this.mListener = iTMAssistantExchangeURLListenner;
    }

    @Override // com.tencent.tmassistantsdk.network.PostHttpRequest
    public void onFinished(com.qq.taf.jce.JceStruct jceStruct, com.qq.taf.jce.JceStruct jceStruct2, int i17) {
        if (jceStruct2 == null) {
            return;
        }
        if (this.mListener == null || i17 != 0) {
            com.tencent.tmassistantsdk.util.TMLog.w(TAG, " error happened!!");
            com.tencent.tmassistantsdk.downloadclient.ITMAssistantExchangeURLListenner iTMAssistantExchangeURLListenner = this.mListener;
            if (iTMAssistantExchangeURLListenner != null) {
                iTMAssistantExchangeURLListenner.onExchangedURLSucceed(null, false);
                return;
            }
            return;
        }
        if (jceStruct2 instanceof com.tencent.tmassistantsdk.protocol.jce.GetAppSimpleDetailResponse) {
            com.tencent.tmassistantsdk.protocol.jce.GetAppSimpleDetailResponse getAppSimpleDetailResponse = (com.tencent.tmassistantsdk.protocol.jce.GetAppSimpleDetailResponse) jceStruct2;
            if (getAppSimpleDetailResponse.ret != 0) {
                com.tencent.tmassistantsdk.util.TMLog.w(TAG, " 后台返回的ret错误，错误值为：" + getAppSimpleDetailResponse.ret);
                this.mListener.onExchangedURLSucceed(null, false);
                return;
            }
            java.util.ArrayList<com.tencent.tmassistantsdk.protocol.jce.AppSimpleDetail> arrayList = getAppSimpleDetailResponse.appSimpleDetailList;
            if (arrayList != null && arrayList.size() > 0) {
                this.mListener.onExchangedURLSucceed(arrayList, true);
            } else {
                com.tencent.tmassistantsdk.util.TMLog.w(TAG, " appDetails 为空!!");
                this.mListener.onExchangedURLSucceed(null, false);
            }
        }
    }

    public boolean sendReuqest(java.util.ArrayList<com.tencent.tmassistantsdk.protocol.jce.AppDetailParam> arrayList) {
        com.tencent.tmassistantsdk.protocol.jce.GetAppSimpleDetailRequest getAppSimpleDetailRequest = new com.tencent.tmassistantsdk.protocol.jce.GetAppSimpleDetailRequest();
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        getAppSimpleDetailRequest.appReqList = arrayList;
        super.sendRequest(getAppSimpleDetailRequest);
        return true;
    }
}
