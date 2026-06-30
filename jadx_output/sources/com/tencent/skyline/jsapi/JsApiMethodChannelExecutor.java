package com.tencent.skyline.jsapi;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\n\u0012\u0002\b\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002J \u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/tencent/skyline/jsapi/JsApiMethodChannelExecutor;", "Lcom/tencent/skyline/jsapi/SkylineJsApiExecutor;", "Lorg/json/JSONObject;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "", "callbackId", "Ljz5/f0;", "addDartJsApiInvokeData", "src", "", "", "json2HashMap", "jsapiName", "dispatchJsApiCall", "Lio/flutter/plugin/common/MethodChannel;", "mJsApiMethodChannel", "Lio/flutter/plugin/common/MethodChannel;", "Lio/flutter/plugin/common/BinaryMessenger;", "binaryMessenger", "<init>", "(Lio/flutter/plugin/common/BinaryMessenger;)V", "Companion", "skyline_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class JsApiMethodChannelExecutor extends com.tencent.skyline.jsapi.SkylineJsApiExecutor {
    private static final java.lang.String SKYLINE_JSAPI_KEY_CALLBACK_ID = "skyline_invoke_callback_id";
    private static final java.lang.String SKYLINE_JSAPI_NAME = "skyline/jsapi_method_channel";
    private static final java.lang.String TAG = "Skyline.MethodChannelExecutor";
    private io.flutter.plugin.common.MethodChannel mJsApiMethodChannel;

    public JsApiMethodChannelExecutor(io.flutter.plugin.common.BinaryMessenger binaryMessenger) {
        kotlin.jvm.internal.o.g(binaryMessenger, "binaryMessenger");
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(binaryMessenger, SKYLINE_JSAPI_NAME, io.flutter.plugin.common.JSONMethodCodec.INSTANCE);
        methodChannel.setMethodCallHandler(new io.flutter.plugin.common.MethodChannel.MethodCallHandler() { // from class: com.tencent.skyline.jsapi.JsApiMethodChannelExecutor$1$1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public final void onMethodCall(io.flutter.plugin.common.MethodCall call, io.flutter.plugin.common.MethodChannel.Result result) {
                kotlin.jvm.internal.o.g(call, "call");
                kotlin.jvm.internal.o.g(result, "result");
                if (!kotlin.jvm.internal.o.b(call.method, "Skyline.JsApi.Callback")) {
                    result.notImplemented();
                    return;
                }
                try {
                    java.lang.Object obj = call.arguments;
                    kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                    int i17 = jSONObject.getInt("skyline_invoke_callback_id");
                    java.lang.String string = jSONObject.getString("skyline_invoke_callback_reason");
                    org.json.JSONObject optJSONObject = jSONObject.optJSONObject("skyline_invoke_callback_data");
                    com.tencent.skyline.jsapi.SkylineJsApiInvoker<?> mInvoker = com.tencent.skyline.jsapi.JsApiMethodChannelExecutor.this.getMInvoker();
                    kotlin.jvm.internal.o.d(string);
                    mInvoker.onCallback(i17, string, optJSONObject);
                    result.success(null);
                } catch (org.json.JSONException e17) {
                    result.error("error", e17.getMessage(), null);
                }
            }
        });
        this.mJsApiMethodChannel = methodChannel;
    }

    private final void addDartJsApiInvokeData(org.json.JSONObject jSONObject, int i17) {
        jSONObject.put(SKYLINE_JSAPI_KEY_CALLBACK_ID, i17);
    }

    private final java.util.Map<java.lang.String, ?> json2HashMap(org.json.JSONObject src) {
        java.util.Iterator<java.lang.String> keys = src.keys();
        kotlin.jvm.internal.o.f(keys, "keys(...)");
        java.util.HashMap hashMap = new java.util.HashMap();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.String string = src.getString(next);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            hashMap.put(next, string);
        }
        return hashMap;
    }

    @Override // com.tencent.skyline.jsapi.SkylineJsApiExecutor
    public void dispatchJsApiCall(java.lang.String jsapiName, org.json.JSONObject data, int i17) {
        kotlin.jvm.internal.o.g(jsapiName, "jsapiName");
        kotlin.jvm.internal.o.g(data, "data");
        addDartJsApiInvokeData(data, i17);
        this.mJsApiMethodChannel.invokeMethod(jsapiName, json2HashMap(data));
    }
}
