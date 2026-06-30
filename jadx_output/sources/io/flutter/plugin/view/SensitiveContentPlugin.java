package io.flutter.plugin.view;

/* loaded from: classes14.dex */
public class SensitiveContentPlugin implements io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.SensitiveContentMethodHandler {
    private android.app.Activity mFlutterActivity;
    private final int mFlutterViewId;
    private final io.flutter.embedding.engine.systemchannels.SensitiveContentChannel mSensitiveContentChannel;

    public SensitiveContentPlugin(int i17, android.app.Activity activity, io.flutter.embedding.engine.systemchannels.SensitiveContentChannel sensitiveContentChannel) {
        this.mFlutterActivity = activity;
        this.mFlutterViewId = i17;
        this.mSensitiveContentChannel = sensitiveContentChannel;
        sensitiveContentChannel.setSensitiveContentMethodHandler(this);
    }

    private java.lang.String getFlutterViewNotFoundErrorReason() {
        return "FlutterView with ID " + this.mFlutterViewId + "not found";
    }

    private java.lang.String getNotSupportedErrorReason() {
        return "isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.";
    }

    public void destroy() {
        this.mSensitiveContentChannel.setSensitiveContentMethodHandler(null);
        this.mFlutterActivity = null;
    }

    @Override // io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.SensitiveContentMethodHandler
    public int getContentSensitivity() {
        if (!isSupported()) {
            return 2;
        }
        android.view.View findViewById = this.mFlutterActivity.findViewById(this.mFlutterViewId);
        if (findViewById != null) {
            return findViewById.getContentSensitivity();
        }
        throw new java.lang.IllegalArgumentException(getFlutterViewNotFoundErrorReason());
    }

    @Override // io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.SensitiveContentMethodHandler
    public boolean isSupported() {
        return android.os.Build.VERSION.SDK_INT >= 35;
    }

    @Override // io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.SensitiveContentMethodHandler
    public void setContentSensitivity(int i17) {
        if (!isSupported()) {
            throw new java.lang.IllegalStateException(getNotSupportedErrorReason());
        }
        android.view.View findViewById = this.mFlutterActivity.findViewById(this.mFlutterViewId);
        if (findViewById == null) {
            throw new java.lang.IllegalArgumentException(getFlutterViewNotFoundErrorReason());
        }
        if (findViewById.getContentSensitivity() == i17) {
            return;
        }
        findViewById.setContentSensitivity(i17);
        findViewById.invalidate();
    }
}
