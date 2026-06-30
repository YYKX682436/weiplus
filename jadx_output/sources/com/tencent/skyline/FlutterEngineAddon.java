package com.tencent.skyline;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/tencent/skyline/FlutterEngineAddon;", "", "flutterEngine", "Lio/flutter/embedding/engine/FlutterEngine;", "invokeMethodChannel", "Lio/flutter/plugin/common/MethodChannel;", "skylineTextureChannel", "jsApiInvoker", "Lcom/tencent/skyline/jsapi/SkylineJsApiInvoker;", "config", "Lcom/tencent/skyline/SkylineConfig;", "(Lio/flutter/embedding/engine/FlutterEngine;Lio/flutter/plugin/common/MethodChannel;Lio/flutter/plugin/common/MethodChannel;Lcom/tencent/skyline/jsapi/SkylineJsApiInvoker;Lcom/tencent/skyline/SkylineConfig;)V", "getConfig", "()Lcom/tencent/skyline/SkylineConfig;", "getFlutterEngine", "()Lio/flutter/embedding/engine/FlutterEngine;", "getInvokeMethodChannel", "()Lio/flutter/plugin/common/MethodChannel;", "getJsApiInvoker", "()Lcom/tencent/skyline/jsapi/SkylineJsApiInvoker;", "getSkylineTextureChannel", "skyline_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FlutterEngineAddon {
    private final com.tencent.skyline.SkylineConfig config;
    private final io.flutter.embedding.engine.FlutterEngine flutterEngine;
    private final io.flutter.plugin.common.MethodChannel invokeMethodChannel;
    private final com.tencent.skyline.jsapi.SkylineJsApiInvoker<?> jsApiInvoker;
    private final io.flutter.plugin.common.MethodChannel skylineTextureChannel;

    public FlutterEngineAddon(io.flutter.embedding.engine.FlutterEngine flutterEngine, io.flutter.plugin.common.MethodChannel invokeMethodChannel, io.flutter.plugin.common.MethodChannel skylineTextureChannel, com.tencent.skyline.jsapi.SkylineJsApiInvoker<?> jsApiInvoker, com.tencent.skyline.SkylineConfig config) {
        kotlin.jvm.internal.o.g(flutterEngine, "flutterEngine");
        kotlin.jvm.internal.o.g(invokeMethodChannel, "invokeMethodChannel");
        kotlin.jvm.internal.o.g(skylineTextureChannel, "skylineTextureChannel");
        kotlin.jvm.internal.o.g(jsApiInvoker, "jsApiInvoker");
        kotlin.jvm.internal.o.g(config, "config");
        this.flutterEngine = flutterEngine;
        this.invokeMethodChannel = invokeMethodChannel;
        this.skylineTextureChannel = skylineTextureChannel;
        this.jsApiInvoker = jsApiInvoker;
        this.config = config;
    }

    public final com.tencent.skyline.SkylineConfig getConfig() {
        return this.config;
    }

    public final io.flutter.embedding.engine.FlutterEngine getFlutterEngine() {
        return this.flutterEngine;
    }

    public final io.flutter.plugin.common.MethodChannel getInvokeMethodChannel() {
        return this.invokeMethodChannel;
    }

    public final com.tencent.skyline.jsapi.SkylineJsApiInvoker<?> getJsApiInvoker() {
        return this.jsApiInvoker;
    }

    public final io.flutter.plugin.common.MethodChannel getSkylineTextureChannel() {
        return this.skylineTextureChannel;
    }
}
