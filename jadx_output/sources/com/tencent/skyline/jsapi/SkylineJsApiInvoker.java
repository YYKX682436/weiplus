package com.tencent.skyline.jsapi;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u001cB\u000f\u0012\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ \u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0014\u0010\u0010\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R(\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R(\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00170\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/tencent/skyline/jsapi/SkylineJsApiInvoker;", "Lcom/tencent/skyline/jsapi/SkylineJsApiExecutor;", "EXECUTOR", "", "", "jsapiName", "Lorg/json/JSONObject;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "", "callbackId", "Lcom/tencent/skyline/jsapi/SkylineJsApiInvoker$SkylineJsApiCallback;", "callback", "Ljz5/f0;", "invoke", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, "onCallback", "mSkylineJsApiExecutor", "Lcom/tencent/skyline/jsapi/SkylineJsApiExecutor;", "", "Lcom/tencent/skyline/jsapi/BaseJsApiForSkyline;", "mJsApiMap", "Ljava/util/Map;", "", "Ljava/lang/ref/WeakReference;", "mJsApiCallbackMap", "executor", "<init>", "(Lcom/tencent/skyline/jsapi/SkylineJsApiExecutor;)V", "SkylineJsApiCallback", "skyline_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class SkylineJsApiInvoker<EXECUTOR extends com.tencent.skyline.jsapi.SkylineJsApiExecutor> {
    private java.util.Map<java.lang.Integer, java.lang.ref.WeakReference<com.tencent.skyline.jsapi.SkylineJsApiInvoker.SkylineJsApiCallback>> mJsApiCallbackMap;
    private java.util.Map<java.lang.String, ? extends com.tencent.skyline.jsapi.BaseJsApiForSkyline<EXECUTOR>> mJsApiMap;
    private final EXECUTOR mSkylineJsApiExecutor;

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/tencent/skyline/jsapi/SkylineJsApiInvoker$SkylineJsApiCallback;", "", "", "callbackId", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, "Lorg/json/JSONObject;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Ljz5/f0;", "callback", "skyline_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes13.dex */
    public interface SkylineJsApiCallback {
        void callback(int i17, java.lang.String str, org.json.JSONObject jSONObject);
    }

    public SkylineJsApiInvoker(EXECUTOR executor) {
        kotlin.jvm.internal.o.g(executor, "executor");
        this.mSkylineJsApiExecutor = executor;
        this.mJsApiCallbackMap = new java.util.HashMap();
        com.tencent.skyline.jsapi.JsApiPoolForSkyline jsApiPoolForSkyline = com.tencent.skyline.jsapi.JsApiPoolForSkyline.INSTANCE;
        jsApiPoolForSkyline.init();
        java.util.Map<java.lang.String, com.tencent.skyline.jsapi.BaseJsApiForSkyline<?>> jsApiMap = jsApiPoolForSkyline.getJsApiMap();
        kotlin.jvm.internal.o.e(jsApiMap, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, com.tencent.skyline.jsapi.BaseJsApiForSkyline<EXECUTOR of com.tencent.skyline.jsapi.SkylineJsApiInvoker>>");
        this.mJsApiMap = jsApiMap;
        executor.attach(this);
    }

    public final void invoke(java.lang.String jsapiName, org.json.JSONObject data, int i17, com.tencent.skyline.jsapi.SkylineJsApiInvoker.SkylineJsApiCallback callback) {
        kotlin.jvm.internal.o.g(jsapiName, "jsapiName");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (this.mJsApiMap.containsKey(jsapiName)) {
            com.tencent.skyline.jsapi.BaseJsApiForSkyline<EXECUTOR> baseJsApiForSkyline = this.mJsApiMap.get(jsapiName);
            if (baseJsApiForSkyline != null) {
                baseJsApiForSkyline.invoke(this.mSkylineJsApiExecutor, data, i17);
            }
            this.mJsApiCallbackMap.put(java.lang.Integer.valueOf(i17), new java.lang.ref.WeakReference<>(callback));
        }
    }

    public final void onCallback(int i17, java.lang.String reason, org.json.JSONObject jSONObject) {
        com.tencent.skyline.jsapi.SkylineJsApiInvoker.SkylineJsApiCallback skylineJsApiCallback;
        kotlin.jvm.internal.o.g(reason, "reason");
        java.lang.ref.WeakReference<com.tencent.skyline.jsapi.SkylineJsApiInvoker.SkylineJsApiCallback> weakReference = this.mJsApiCallbackMap.get(java.lang.Integer.valueOf(i17));
        if (weakReference == null || (skylineJsApiCallback = weakReference.get()) == null) {
            return;
        }
        skylineJsApiCallback.callback(i17, reason, jSONObject);
    }
}
