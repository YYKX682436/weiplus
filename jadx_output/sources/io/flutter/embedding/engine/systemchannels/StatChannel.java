package io.flutter.embedding.engine.systemchannels;

/* loaded from: classes13.dex */
public class StatChannel {
    private static final java.lang.String TAG = "StatChannel";
    public final io.flutter.plugin.common.MethodChannel channel;

    public StatChannel(io.flutter.embedding.engine.dart.DartExecutor dartExecutor) {
        this.channel = new io.flutter.plugin.common.MethodChannel(dartExecutor, "flutter/data_stat", io.flutter.plugin.common.JSONMethodCodec.INSTANCE);
    }

    public void reportMemoryUsage() {
        this.channel.invokeMethod("MMDataStat.MemoryUsage", null);
    }
}
