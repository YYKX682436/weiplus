package io.flutter.embedding.engine.systemchannels;

/* loaded from: classes13.dex */
public class SkiaChannel {
    private static final java.lang.String TAG = "SkiaChannel";
    public final io.flutter.plugin.common.MethodChannel channel;

    public SkiaChannel(io.flutter.embedding.engine.dart.DartExecutor dartExecutor) {
        this.channel = new io.flutter.plugin.common.MethodChannel(dartExecutor, "flutter/skia", io.flutter.plugin.common.JSONMethodCodec.INSTANCE);
    }

    public void setResourceCacheMaxBytes(int i17) {
        this.channel.invokeMethod("Skia.setResourceCacheMaxBytes", java.lang.Integer.valueOf(i17));
    }
}
