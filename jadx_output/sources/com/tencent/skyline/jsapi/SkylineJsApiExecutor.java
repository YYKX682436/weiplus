package com.tencent.skyline.jsapi;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002J \u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&R&\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00028\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/tencent/skyline/jsapi/SkylineJsApiExecutor;", "", "Lcom/tencent/skyline/jsapi/SkylineJsApiInvoker;", "invoker", "Ljz5/f0;", "attach", "", "jsapiName", "Lorg/json/JSONObject;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "", "callbackId", "dispatchJsApiCall", "mInvoker", "Lcom/tencent/skyline/jsapi/SkylineJsApiInvoker;", "getMInvoker", "()Lcom/tencent/skyline/jsapi/SkylineJsApiInvoker;", "setMInvoker", "(Lcom/tencent/skyline/jsapi/SkylineJsApiInvoker;)V", "<init>", "()V", "skyline_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public abstract class SkylineJsApiExecutor {
    protected com.tencent.skyline.jsapi.SkylineJsApiInvoker<?> mInvoker;

    public final void attach(com.tencent.skyline.jsapi.SkylineJsApiInvoker<?> invoker) {
        kotlin.jvm.internal.o.g(invoker, "invoker");
        setMInvoker(invoker);
    }

    public abstract void dispatchJsApiCall(java.lang.String str, org.json.JSONObject jSONObject, int i17);

    public final com.tencent.skyline.jsapi.SkylineJsApiInvoker<?> getMInvoker() {
        com.tencent.skyline.jsapi.SkylineJsApiInvoker<?> skylineJsApiInvoker = this.mInvoker;
        if (skylineJsApiInvoker != null) {
            return skylineJsApiInvoker;
        }
        kotlin.jvm.internal.o.o("mInvoker");
        throw null;
    }

    public final void setMInvoker(com.tencent.skyline.jsapi.SkylineJsApiInvoker<?> skylineJsApiInvoker) {
        kotlin.jvm.internal.o.g(skylineJsApiInvoker, "<set-?>");
        this.mInvoker = skylineJsApiInvoker;
    }
}
