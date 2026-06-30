package io.flutter.plugin.platform;

/* loaded from: classes15.dex */
public class PlatformPlugin {
    public static final int DEFAULT_SYSTEM_UI = 1280;
    private static final java.lang.String TAG = "PlatformPlugin";
    private byte _hellAccFlag_;
    private final android.app.Activity activity;
    private io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemChromeStyle currentTheme;
    private int mEnabledOverlays;
    final io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler mPlatformMessageHandler;
    private final io.flutter.embedding.engine.systemchannels.PlatformChannel platformChannel;
    private final io.flutter.plugin.platform.PlatformPlugin.PlatformPluginDelegate platformPluginDelegate;

    /* renamed from: io.flutter.plugin.platform.PlatformPlugin$2, reason: invalid class name */
    /* loaded from: classes15.dex */
    public class AnonymousClass2 implements android.view.View.OnSystemUiVisibilityChangeListener {
        final /* synthetic */ android.view.View val$decorView;

        public AnonymousClass2(android.view.View view) {
            this.val$decorView = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSystemUiVisibilityChange$0(int i17) {
            if ((i17 & 4) == 0) {
                io.flutter.plugin.platform.PlatformPlugin.this.platformChannel.systemChromeChanged(true);
            } else {
                io.flutter.plugin.platform.PlatformPlugin.this.platformChannel.systemChromeChanged(false);
            }
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(final int i17) {
            this.val$decorView.post(new java.lang.Runnable() { // from class: io.flutter.plugin.platform.PlatformPlugin$2$$a
                @Override // java.lang.Runnable
                public final void run() {
                    io.flutter.plugin.platform.PlatformPlugin.AnonymousClass2.this.lambda$onSystemUiVisibilityChange$0(i17);
                }
            });
        }
    }

    /* renamed from: io.flutter.plugin.platform.PlatformPlugin$3, reason: invalid class name */
    /* loaded from: classes15.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness;
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType;
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay;

        static {
            int[] iArr = new int[io.flutter.embedding.engine.systemchannels.PlatformChannel.Brightness.values().length];
            $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness = iArr;
            try {
                iArr[io.flutter.embedding.engine.systemchannels.PlatformChannel.Brightness.DARK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness[io.flutter.embedding.engine.systemchannels.PlatformChannel.Brightness.LIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.values().length];
            $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay = iArr2;
            try {
                iArr2[io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.TOP_OVERLAYS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay[io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.values().length];
            $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType = iArr3;
            try {
                iArr3[io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.STANDARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType[io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.LIGHT_IMPACT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType[io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.MEDIUM_IMPACT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType[io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.HEAVY_IMPACT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType[io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.SELECTION_CLICK.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
        }
    }

    /* loaded from: classes15.dex */
    public interface PlatformPluginDelegate {
        boolean popSystemNavigator();

        default void setFrameworkHandlesBack(boolean z17) {
        }
    }

    public PlatformPlugin(android.app.Activity activity, io.flutter.embedding.engine.systemchannels.PlatformChannel platformChannel) {
        this(activity, platformChannel, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean clipboardHasStrings() {
        android.content.ClipDescription primaryClipDescription;
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) this.activity.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.CharSequence getClipboardData(io.flutter.embedding.engine.systemchannels.PlatformChannel.ClipboardContentFormat clipboardContentFormat) {
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) this.activity.getSystemService("clipboard");
        java.lang.CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                android.content.ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (clipboardContentFormat != null && clipboardContentFormat != io.flutter.embedding.engine.systemchannels.PlatformChannel.ClipboardContentFormat.PLAIN_TEXT) {
                    return null;
                }
                android.content.ClipData.Item itemAt = primaryClip.getItemAt(0);
                java.lang.CharSequence text = itemAt.getText();
                if (text == null) {
                    try {
                        android.net.Uri uri = itemAt.getUri();
                        if (uri == null) {
                            io.flutter.Log.w(TAG, "Clipboard item contained no textual content nor a URI to retrieve it from.");
                            return null;
                        }
                        java.lang.String scheme = uri.getScheme();
                        if (!scheme.equals("content")) {
                            io.flutter.Log.w(TAG, "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                            return null;
                        }
                        android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor = this.activity.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                        text = itemAt.coerceToText(this.activity);
                        if (openTypedAssetFileDescriptor != null) {
                            openTypedAssetFileDescriptor.close();
                        }
                    } catch (java.io.IOException e17) {
                        e = e17;
                        charSequence = text;
                        io.flutter.Log.w(TAG, "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                        return charSequence;
                    }
                }
                return text;
            } catch (java.io.IOException e18) {
                e = e18;
            }
        } catch (java.io.FileNotFoundException unused) {
            io.flutter.Log.w(TAG, "Clipboard text was unable to be received from content URI.");
            return null;
        } catch (java.lang.SecurityException e19) {
            io.flutter.Log.w(TAG, "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e19);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playSystemSound(io.flutter.embedding.engine.systemchannels.PlatformChannel.SoundType soundType) {
        if (soundType == io.flutter.embedding.engine.systemchannels.PlatformChannel.SoundType.CLICK) {
            this.activity.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void popSystemNavigator() {
        io.flutter.plugin.platform.PlatformPlugin.PlatformPluginDelegate platformPluginDelegate = this.platformPluginDelegate;
        if (platformPluginDelegate == null || !platformPluginDelegate.popSystemNavigator()) {
            android.app.Activity activity = this.activity;
            if (!(activity instanceof androidx.activity.k)) {
                activity.finish();
            } else {
                try {
                    ((androidx.activity.k) activity).getOnBackPressedDispatcher().c();
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restoreSystemChromeSystemUIOverlays() {
        updateSystemUiOverlays();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClipboardData(java.lang.String str) {
        ((android.content.ClipboardManager) this.activity.getSystemService("clipboard")).setPrimaryClip(android.content.ClipData.newPlainText("text label?", str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrameworkHandlesBack(boolean z17) {
        io.flutter.plugin.platform.PlatformPlugin.PlatformPluginDelegate platformPluginDelegate = this.platformPluginDelegate;
        if (platformPluginDelegate != null) {
            platformPluginDelegate.setFrameworkHandlesBack(z17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemChromeApplicationSwitcherDescription(io.flutter.embedding.engine.systemchannels.PlatformChannel.AppSwitcherDescription appSwitcherDescription) {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            this.activity.setTaskDescription(new android.app.ActivityManager.TaskDescription(appSwitcherDescription.label, (android.graphics.Bitmap) null, appSwitcherDescription.color));
        } else {
            this.activity.setTaskDescription(new android.app.ActivityManager.TaskDescription(appSwitcherDescription.label, 0, appSwitcherDescription.color));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemChromeChangeListener() {
        android.view.View decorView = this.activity.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new io.flutter.plugin.platform.PlatformPlugin.AnonymousClass2(decorView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemChromeEnabledSystemUIMode(io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode systemUiMode) {
        int i17;
        if (systemUiMode == io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode.LEAN_BACK) {
            i17 = 1798;
        } else if (systemUiMode == io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode.IMMERSIVE) {
            i17 = 3846;
        } else if (systemUiMode == io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode.IMMERSIVE_STICKY) {
            i17 = 5894;
        } else if (systemUiMode != io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode.EDGE_TO_EDGE || android.os.Build.VERSION.SDK_INT < 29) {
            return;
        } else {
            i17 = 1792;
        }
        this.mEnabledOverlays = i17;
        updateSystemUiOverlays();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemChromeEnabledSystemUIOverlays(java.util.List<io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay> list) {
        int i17 = list.size() == 0 ? 5894 : 1798;
        for (int i18 = 0; i18 < list.size(); i18++) {
            int i19 = io.flutter.plugin.platform.PlatformPlugin.AnonymousClass3.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay[list.get(i18).ordinal()];
            if (i19 == 1) {
                i17 &= -5;
            } else if (i19 == 2) {
                i17 = i17 & (-513) & (-3);
            }
        }
        this.mEnabledOverlays = i17;
        updateSystemUiOverlays();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemChromePreferredOrientations(int i17) {
        this.activity.setRequestedOrientation(i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @java.lang.Deprecated
    public void setSystemChromeSystemUIOverlayStyle(io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemChromeStyle systemChromeStyle) {
        android.view.Window window = this.activity.getWindow();
        n3.m3 m3Var = new n3.m3(window, window.getDecorView());
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        io.flutter.embedding.engine.systemchannels.PlatformChannel.Brightness brightness = systemChromeStyle.statusBarIconBrightness;
        if (brightness != null) {
            int i18 = io.flutter.plugin.platform.PlatformPlugin.AnonymousClass3.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness[brightness.ordinal()];
            if (i18 == 1) {
                m3Var.c(true);
            } else if (i18 == 2) {
                m3Var.c(false);
            }
        }
        java.lang.Integer num = systemChromeStyle.statusBarColor;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        java.lang.Boolean bool = systemChromeStyle.systemStatusBarContrastEnforced;
        if (bool != null && i17 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i17 >= 26) {
            io.flutter.embedding.engine.systemchannels.PlatformChannel.Brightness brightness2 = systemChromeStyle.systemNavigationBarIconBrightness;
            if (brightness2 != null) {
                int i19 = io.flutter.plugin.platform.PlatformPlugin.AnonymousClass3.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness[brightness2.ordinal()];
                if (i19 == 1) {
                    m3Var.b(true);
                } else if (i19 == 2) {
                    m3Var.b(false);
                }
            }
            java.lang.Integer num2 = systemChromeStyle.systemNavigationBarColor;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        java.lang.Integer num3 = systemChromeStyle.systemNavigationBarDividerColor;
        if (num3 != null && i17 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        java.lang.Boolean bool2 = systemChromeStyle.systemNavigationBarContrastEnforced;
        if (bool2 != null && i17 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.currentTheme = systemChromeStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void share(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        android.app.Activity activity = this.activity;
        android.content.Intent createChooser = android.content.Intent.createChooser(intent, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(createChooser);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "io/flutter/plugin/platform/PlatformPlugin", ya.a.SHARE, "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "io/flutter/plugin/platform/PlatformPlugin", ya.a.SHARE, "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void destroy() {
        this.platformChannel.setPlatformMessageHandler(null);
    }

    public void updateSystemUiOverlays() {
        this.activity.getWindow().getDecorView().setSystemUiVisibility(this.mEnabledOverlays);
        io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemChromeStyle systemChromeStyle = this.currentTheme;
        if (systemChromeStyle != null) {
            setSystemChromeSystemUIOverlayStyle(systemChromeStyle);
        }
    }

    public void vibrateHapticFeedback(io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType hapticFeedbackType) {
        android.view.View decorView = this.activity.getWindow().getDecorView();
        int i17 = io.flutter.plugin.platform.PlatformPlugin.AnonymousClass3.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType[hapticFeedbackType.ordinal()];
        if (i17 == 1) {
            decorView.performHapticFeedback(0);
            return;
        }
        if (i17 == 2) {
            decorView.performHapticFeedback(1);
            return;
        }
        if (i17 == 3) {
            decorView.performHapticFeedback(3);
        } else if (i17 == 4) {
            decorView.performHapticFeedback(6);
        } else {
            if (i17 != 5) {
                return;
            }
            decorView.performHapticFeedback(4);
        }
    }

    public PlatformPlugin(android.app.Activity activity, io.flutter.embedding.engine.systemchannels.PlatformChannel platformChannel, io.flutter.plugin.platform.PlatformPlugin.PlatformPluginDelegate platformPluginDelegate) {
        io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler platformMessageHandler = new io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler() { // from class: io.flutter.plugin.platform.PlatformPlugin.1
            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public boolean clipboardHasStrings() {
                return io.flutter.plugin.platform.PlatformPlugin.this.clipboardHasStrings();
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public java.lang.CharSequence getClipboardData(io.flutter.embedding.engine.systemchannels.PlatformChannel.ClipboardContentFormat clipboardContentFormat) {
                return io.flutter.plugin.platform.PlatformPlugin.this.getClipboardData(clipboardContentFormat);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void playSystemSound(io.flutter.embedding.engine.systemchannels.PlatformChannel.SoundType soundType) {
                io.flutter.plugin.platform.PlatformPlugin.this.playSystemSound(soundType);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void popSystemNavigator() {
                io.flutter.plugin.platform.PlatformPlugin.this.popSystemNavigator();
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void restoreSystemUiOverlays() {
                io.flutter.plugin.platform.PlatformPlugin.this.restoreSystemChromeSystemUIOverlays();
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void setApplicationSwitcherDescription(io.flutter.embedding.engine.systemchannels.PlatformChannel.AppSwitcherDescription appSwitcherDescription) {
                io.flutter.plugin.platform.PlatformPlugin.this.setSystemChromeApplicationSwitcherDescription(appSwitcherDescription);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void setClipboardData(java.lang.String str) {
                io.flutter.plugin.platform.PlatformPlugin.this.setClipboardData(str);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void setFrameworkHandlesBack(boolean z17) {
                io.flutter.plugin.platform.PlatformPlugin.this.setFrameworkHandlesBack(z17);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void setPreferredOrientations(int i17) {
                io.flutter.plugin.platform.PlatformPlugin.this.setSystemChromePreferredOrientations(i17);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void setSystemUiChangeListener() {
                io.flutter.plugin.platform.PlatformPlugin.this.setSystemChromeChangeListener();
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void setSystemUiOverlayStyle(io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemChromeStyle systemChromeStyle) {
                io.flutter.plugin.platform.PlatformPlugin.this.setSystemChromeSystemUIOverlayStyle(systemChromeStyle);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void share(java.lang.String str) {
                io.flutter.plugin.platform.PlatformPlugin.this.share(str);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void showSystemOverlays(java.util.List<io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay> list) {
                io.flutter.plugin.platform.PlatformPlugin.this.setSystemChromeEnabledSystemUIOverlays(list);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void showSystemUiMode(io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode systemUiMode) {
                io.flutter.plugin.platform.PlatformPlugin.this.setSystemChromeEnabledSystemUIMode(systemUiMode);
            }

            @Override // io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
            public void vibrateHapticFeedback(io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType hapticFeedbackType) {
                io.flutter.plugin.platform.PlatformPlugin.this.vibrateHapticFeedback(hapticFeedbackType);
            }
        };
        this.mPlatformMessageHandler = platformMessageHandler;
        this.activity = activity;
        this.platformChannel = platformChannel;
        platformChannel.setPlatformMessageHandler(platformMessageHandler);
        this.platformPluginDelegate = platformPluginDelegate;
        this.mEnabledOverlays = 1280;
    }
}
