package com.tencent.tmassistantsdk.logreport;

/* loaded from: classes13.dex */
public class GetSettingEngine implements com.tencent.tmassistantsdk.network.IGetSettingHttpListener {
    protected static final java.lang.String TAG = "GetSettingEngine";
    protected static com.tencent.tmassistantsdk.logreport.GetSettingEngine mInstance;
    protected com.tencent.tmassistantsdk.network.GetSettingHttpRequest httpRequest = null;

    public static synchronized com.tencent.tmassistantsdk.logreport.GetSettingEngine getInstance() {
        com.tencent.tmassistantsdk.logreport.GetSettingEngine getSettingEngine;
        synchronized (com.tencent.tmassistantsdk.logreport.GetSettingEngine.class) {
            if (mInstance == null) {
                mInstance = new com.tencent.tmassistantsdk.logreport.GetSettingEngine();
            }
            getSettingEngine = mInstance;
        }
        return getSettingEngine;
    }

    public synchronized void cancleRequest() {
        com.tencent.tmassistantsdk.network.GetSettingHttpRequest getSettingHttpRequest = this.httpRequest;
        if (getSettingHttpRequest != null) {
            getSettingHttpRequest.cancleRequest();
            this.httpRequest = null;
        }
    }

    @Override // com.tencent.tmassistantsdk.network.IGetSettingHttpListener
    public void onSettingHttpRequestFinish(com.tencent.tmassistantsdk.protocol.jce.GetSettingsRequest getSettingsRequest, com.tencent.tmassistantsdk.protocol.jce.GetSettingsResponse getSettingsResponse, boolean z17) {
        com.tencent.tmassistantsdk.protocol.jce.SettingsCfg settingsCfg;
        byte[] bArr;
        this.httpRequest = null;
        if (!z17) {
            com.tencent.tmassistantsdk.util.TMLog.i(TAG, "get settings failed!");
            return;
        }
        java.util.ArrayList<com.tencent.tmassistantsdk.protocol.jce.SettingsCfg> arrayList = getSettingsResponse.settings;
        if (arrayList != null && arrayList.size() > 0 && (settingsCfg = getSettingsResponse.settings.get(0)) != null && (bArr = settingsCfg.cfg) != null) {
            com.tencent.tmassistantsdk.protocol.jce.StatCfg statCfg = (com.tencent.tmassistantsdk.protocol.jce.StatCfg) com.tencent.tmassistantsdk.protocol.ProtocolPackage.bytes2JceObj(bArr, com.tencent.tmassistantsdk.protocol.jce.StatCfg.class);
            if (statCfg != null) {
                com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().setNetTypeValue(statCfg.netType);
            } else {
                com.tencent.tmassistantsdk.util.TMLog.i(TAG, "response  StatCfg is null !");
            }
        }
        com.tencent.tmassistantsdk.util.TMLog.i(TAG, "response.settings is null !");
    }

    public void sendRequest() {
        if (this.httpRequest != null) {
            return;
        }
        com.tencent.tmassistantsdk.network.GetSettingHttpRequest getSettingHttpRequest = new com.tencent.tmassistantsdk.network.GetSettingHttpRequest();
        this.httpRequest = getSettingHttpRequest;
        getSettingHttpRequest.setGetSettingHttpListener(this);
        this.httpRequest.sendSettingRequest();
    }
}
