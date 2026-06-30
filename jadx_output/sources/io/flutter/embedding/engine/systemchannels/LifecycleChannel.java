package io.flutter.embedding.engine.systemchannels;

/* loaded from: classes15.dex */
public class LifecycleChannel {
    private static final java.lang.String CHANNEL_NAME = "flutter/lifecycle";
    private static final java.lang.String TAG = "LifecycleChannel";
    private final io.flutter.plugin.common.BasicMessageChannel<java.lang.String> channel;
    private io.flutter.embedding.engine.systemchannels.LifecycleChannel.AppLifecycleState lastAndroidState;
    private io.flutter.embedding.engine.systemchannels.LifecycleChannel.AppLifecycleState lastFlutterState;
    private boolean lastFocus;

    /* renamed from: io.flutter.embedding.engine.systemchannels.LifecycleChannel$1, reason: invalid class name */
    /* loaded from: classes15.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$engine$systemchannels$LifecycleChannel$AppLifecycleState;

        static {
            int[] iArr = new int[io.flutter.embedding.engine.systemchannels.LifecycleChannel.AppLifecycleState.values().length];
            $SwitchMap$io$flutter$embedding$engine$systemchannels$LifecycleChannel$AppLifecycleState = iArr;
            try {
                iArr[io.flutter.embedding.engine.systemchannels.LifecycleChannel.AppLifecycleState.RESUMED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$LifecycleChannel$AppLifecycleState[io.flutter.embedding.engine.systemchannels.LifecycleChannel.AppLifecycleState.INACTIVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$LifecycleChannel$AppLifecycleState[io.flutter.embedding.engine.systemchannels.LifecycleChannel.AppLifecycleState.HIDDEN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$LifecycleChannel$AppLifecycleState[io.flutter.embedding.engine.systemchannels.LifecycleChannel.AppLifecycleState.PAUSED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$LifecycleChannel$AppLifecycleState[io.flutter.embedding.engine.systemchannels.LifecycleChannel.AppLifecycleState.DETACHED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes15.dex */
    public enum AppLifecycleState {
        DETACHED,
        RESUMED,
        INACTIVE,
        HIDDEN,
        PAUSED
    }

    public LifecycleChannel(io.flutter.embedding.engine.dart.DartExecutor dartExecutor) {
        this((io.flutter.plugin.common.BasicMessageChannel<java.lang.String>) new io.flutter.plugin.common.BasicMessageChannel(dartExecutor, CHANNEL_NAME, io.flutter.plugin.common.StringCodec.INSTANCE));
    }

    private void sendState(io.flutter.embedding.engine.systemchannels.LifecycleChannel.AppLifecycleState appLifecycleState, boolean z17) {
        io.flutter.embedding.engine.systemchannels.LifecycleChannel.AppLifecycleState appLifecycleState2 = this.lastAndroidState;
        if (appLifecycleState2 == appLifecycleState && z17 == this.lastFocus) {
            return;
        }
        if (appLifecycleState == null && appLifecycleState2 == null) {
            this.lastFocus = z17;
            return;
        }
        int i17 = io.flutter.embedding.engine.systemchannels.LifecycleChannel.AnonymousClass1.$SwitchMap$io$flutter$embedding$engine$systemchannels$LifecycleChannel$AppLifecycleState[appLifecycleState.ordinal()];
        io.flutter.embedding.engine.systemchannels.LifecycleChannel.AppLifecycleState appLifecycleState3 = i17 != 1 ? (i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5) ? appLifecycleState : null : z17 ? io.flutter.embedding.engine.systemchannels.LifecycleChannel.AppLifecycleState.RESUMED : io.flutter.embedding.engine.systemchannels.LifecycleChannel.AppLifecycleState.INACTIVE;
        this.lastAndroidState = appLifecycleState;
        this.lastFocus = z17;
        if (appLifecycleState3 == this.lastFlutterState) {
            return;
        }
        java.lang.String str = "AppLifecycleState." + appLifecycleState3.name().toLowerCase(java.util.Locale.ROOT);
        io.flutter.Log.v(TAG, "Sending " + str + " message.");
        this.channel.send(str);
        this.lastFlutterState = appLifecycleState3;
    }

    public void aWindowIsFocused() {
        sendState(this.lastAndroidState, true);
    }

    public void appIsDetached() {
        sendState(io.flutter.embedding.engine.systemchannels.LifecycleChannel.AppLifecycleState.DETACHED, this.lastFocus);
    }

    public void appIsInactive() {
        sendState(io.flutter.embedding.engine.systemchannels.LifecycleChannel.AppLifecycleState.INACTIVE, this.lastFocus);
    }

    public void appIsPaused() {
        sendState(io.flutter.embedding.engine.systemchannels.LifecycleChannel.AppLifecycleState.PAUSED, this.lastFocus);
    }

    public void appIsResumed() {
        sendState(io.flutter.embedding.engine.systemchannels.LifecycleChannel.AppLifecycleState.RESUMED, this.lastFocus);
    }

    public void noWindowsAreFocused() {
        sendState(this.lastAndroidState, false);
    }

    public LifecycleChannel(io.flutter.plugin.common.BasicMessageChannel<java.lang.String> basicMessageChannel) {
        this.lastAndroidState = null;
        this.lastFlutterState = null;
        this.lastFocus = true;
        this.channel = basicMessageChannel;
    }
}
