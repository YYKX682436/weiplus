package io.flutter.embedding.engine.systemchannels;

/* loaded from: classes15.dex */
public class SystemChannel {
    private static final java.lang.String TAG = "SystemChannel";
    public final io.flutter.plugin.common.BasicMessageChannel<java.lang.Object> channel;

    public SystemChannel(io.flutter.embedding.engine.dart.DartExecutor dartExecutor) {
        this.channel = new io.flutter.plugin.common.BasicMessageChannel<>(dartExecutor, "flutter/system", io.flutter.plugin.common.JSONMessageCodec.INSTANCE);
    }

    public void sendMemoryPressureWarning() {
        io.flutter.Log.v(TAG, "Sending memory pressure warning to Flutter.");
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("type", "memoryPressure");
        this.channel.send(hashMap);
    }
}
