package io.flutter.plugin.platform;

/* loaded from: classes13.dex */
public abstract class PlatformViewFactory {
    private final io.flutter.plugin.common.MessageCodec<java.lang.Object> createArgsCodec;

    public PlatformViewFactory(io.flutter.plugin.common.MessageCodec<java.lang.Object> messageCodec) {
        this.createArgsCodec = messageCodec;
    }

    public abstract io.flutter.plugin.platform.PlatformView create(android.content.Context context, int i17, java.lang.Object obj);

    public final io.flutter.plugin.common.MessageCodec<java.lang.Object> getCreateArgsCodec() {
        return this.createArgsCodec;
    }
}
