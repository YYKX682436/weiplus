package io.flutter.embedding.engine.systemchannels;

/* loaded from: classes15.dex */
public class PlatformChannel {
    private static final java.lang.String TAG = "PlatformChannel";
    public final io.flutter.plugin.common.MethodChannel channel;
    final io.flutter.plugin.common.MethodChannel.MethodCallHandler parsingMethodCallHandler;
    private io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler platformMessageHandler;

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformChannel$2, reason: invalid class name */
    /* loaded from: classes15.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation;
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiMode;
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay;

        static {
            int[] iArr = new int[io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode.values().length];
            $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiMode = iArr;
            try {
                iArr[io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode.LEAN_BACK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiMode[io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode.IMMERSIVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiMode[io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode.IMMERSIVE_STICKY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiMode[io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode.EDGE_TO_EDGE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.values().length];
            $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay = iArr2;
            try {
                iArr2[io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.TOP_OVERLAYS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay[io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[io.flutter.embedding.engine.systemchannels.PlatformChannel.DeviceOrientation.values().length];
            $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation = iArr3;
            try {
                iArr3[io.flutter.embedding.engine.systemchannels.PlatformChannel.DeviceOrientation.PORTRAIT_UP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation[io.flutter.embedding.engine.systemchannels.PlatformChannel.DeviceOrientation.PORTRAIT_DOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation[io.flutter.embedding.engine.systemchannels.PlatformChannel.DeviceOrientation.LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation[io.flutter.embedding.engine.systemchannels.PlatformChannel.DeviceOrientation.LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes15.dex */
    public static class AppSwitcherDescription {
        public final int color;
        public final java.lang.String label;

        public AppSwitcherDescription(int i17, java.lang.String str) {
            this.color = i17;
            this.label = str;
        }
    }

    /* loaded from: classes15.dex */
    public enum Brightness {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");

        private java.lang.String encodedName;

        Brightness(java.lang.String str) {
            this.encodedName = str;
        }

        public static io.flutter.embedding.engine.systemchannels.PlatformChannel.Brightness fromValue(java.lang.String str) {
            for (io.flutter.embedding.engine.systemchannels.PlatformChannel.Brightness brightness : values()) {
                if (brightness.encodedName.equals(str)) {
                    return brightness;
                }
            }
            throw new java.lang.NoSuchFieldException("No such Brightness: " + str);
        }
    }

    /* loaded from: classes15.dex */
    public enum ClipboardContentFormat {
        PLAIN_TEXT("text/plain");

        private java.lang.String encodedName;

        ClipboardContentFormat(java.lang.String str) {
            this.encodedName = str;
        }

        public static io.flutter.embedding.engine.systemchannels.PlatformChannel.ClipboardContentFormat fromValue(java.lang.String str) {
            for (io.flutter.embedding.engine.systemchannels.PlatformChannel.ClipboardContentFormat clipboardContentFormat : values()) {
                if (clipboardContentFormat.encodedName.equals(str)) {
                    return clipboardContentFormat;
                }
            }
            throw new java.lang.NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    /* loaded from: classes15.dex */
    public enum DeviceOrientation {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");

        private java.lang.String encodedName;

        DeviceOrientation(java.lang.String str) {
            this.encodedName = str;
        }

        public static io.flutter.embedding.engine.systemchannels.PlatformChannel.DeviceOrientation fromValue(java.lang.String str) {
            for (io.flutter.embedding.engine.systemchannels.PlatformChannel.DeviceOrientation deviceOrientation : values()) {
                if (deviceOrientation.encodedName.equals(str)) {
                    return deviceOrientation;
                }
            }
            throw new java.lang.NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    /* loaded from: classes15.dex */
    public enum HapticFeedbackType {
        STANDARD(null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");

        private final java.lang.String encodedName;

        HapticFeedbackType(java.lang.String str) {
            this.encodedName = str;
        }

        public static io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType fromValue(java.lang.String str) {
            for (io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType hapticFeedbackType : values()) {
                java.lang.String str2 = hapticFeedbackType.encodedName;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return hapticFeedbackType;
                }
            }
            throw new java.lang.NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    /* loaded from: classes15.dex */
    public interface PlatformMessageHandler {
        boolean clipboardHasStrings();

        java.lang.CharSequence getClipboardData(io.flutter.embedding.engine.systemchannels.PlatformChannel.ClipboardContentFormat clipboardContentFormat);

        void playSystemSound(io.flutter.embedding.engine.systemchannels.PlatformChannel.SoundType soundType);

        void popSystemNavigator();

        void restoreSystemUiOverlays();

        void setApplicationSwitcherDescription(io.flutter.embedding.engine.systemchannels.PlatformChannel.AppSwitcherDescription appSwitcherDescription);

        void setClipboardData(java.lang.String str);

        default void setFrameworkHandlesBack(boolean z17) {
        }

        void setPreferredOrientations(int i17);

        void setSystemUiChangeListener();

        void setSystemUiOverlayStyle(io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemChromeStyle systemChromeStyle);

        void share(java.lang.String str);

        void showSystemOverlays(java.util.List<io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay> list);

        void showSystemUiMode(io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode systemUiMode);

        void vibrateHapticFeedback(io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType hapticFeedbackType);
    }

    /* loaded from: classes15.dex */
    public enum SoundType {
        CLICK("SystemSoundType.click"),
        TICK("SystemSoundType.tick"),
        ALERT("SystemSoundType.alert");

        private final java.lang.String encodedName;

        SoundType(java.lang.String str) {
            this.encodedName = str;
        }

        public static io.flutter.embedding.engine.systemchannels.PlatformChannel.SoundType fromValue(java.lang.String str) {
            for (io.flutter.embedding.engine.systemchannels.PlatformChannel.SoundType soundType : values()) {
                if (soundType.encodedName.equals(str)) {
                    return soundType;
                }
            }
            throw new java.lang.NoSuchFieldException("No such SoundType: " + str);
        }
    }

    /* loaded from: classes15.dex */
    public static class SystemChromeStyle {
        public final java.lang.Integer statusBarColor;
        public final io.flutter.embedding.engine.systemchannels.PlatformChannel.Brightness statusBarIconBrightness;
        public final java.lang.Integer systemNavigationBarColor;
        public final java.lang.Boolean systemNavigationBarContrastEnforced;
        public final java.lang.Integer systemNavigationBarDividerColor;
        public final io.flutter.embedding.engine.systemchannels.PlatformChannel.Brightness systemNavigationBarIconBrightness;
        public final java.lang.Boolean systemStatusBarContrastEnforced;

        public SystemChromeStyle(java.lang.Integer num, io.flutter.embedding.engine.systemchannels.PlatformChannel.Brightness brightness, java.lang.Boolean bool, java.lang.Integer num2, io.flutter.embedding.engine.systemchannels.PlatformChannel.Brightness brightness2, java.lang.Integer num3, java.lang.Boolean bool2) {
            this.statusBarColor = num;
            this.statusBarIconBrightness = brightness;
            this.systemStatusBarContrastEnforced = bool;
            this.systemNavigationBarColor = num2;
            this.systemNavigationBarIconBrightness = brightness2;
            this.systemNavigationBarDividerColor = num3;
            this.systemNavigationBarContrastEnforced = bool2;
        }
    }

    /* loaded from: classes15.dex */
    public enum SystemUiMode {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");

        private java.lang.String encodedName;

        SystemUiMode(java.lang.String str) {
            this.encodedName = str;
        }

        public static io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode fromValue(java.lang.String str) {
            for (io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode systemUiMode : values()) {
                if (systemUiMode.encodedName.equals(str)) {
                    return systemUiMode;
                }
            }
            throw new java.lang.NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    /* loaded from: classes15.dex */
    public enum SystemUiOverlay {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");

        private java.lang.String encodedName;

        SystemUiOverlay(java.lang.String str) {
            this.encodedName = str;
        }

        public static io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay fromValue(java.lang.String str) {
            for (io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay systemUiOverlay : values()) {
                if (systemUiOverlay.encodedName.equals(str)) {
                    return systemUiOverlay;
                }
            }
            throw new java.lang.NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public PlatformChannel(io.flutter.embedding.engine.dart.DartExecutor dartExecutor) {
        io.flutter.plugin.common.MethodChannel.MethodCallHandler methodCallHandler = new io.flutter.plugin.common.MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.PlatformChannel.1
            /* JADX WARN: Removed duplicated region for block: B:26:0x013a A[Catch: JSONException -> 0x0267, TryCatch #5 {JSONException -> 0x0267, blocks: (B:7:0x002a, B:8:0x002e, B:13:0x00db, B:15:0x00e0, B:17:0x00f0, B:19:0x0109, B:21:0x011d, B:31:0x0121, B:24:0x012e, B:26:0x013a, B:28:0x0147, B:33:0x0126, B:34:0x014c, B:36:0x015a, B:38:0x0190, B:40:0x019e, B:50:0x022f, B:57:0x024b, B:89:0x0187, B:68:0x01c5, B:82:0x01e7, B:47:0x0207, B:75:0x0227, B:54:0x0243, B:61:0x025f, B:91:0x0033, B:94:0x003e, B:97:0x0049, B:100:0x0055, B:103:0x0061, B:106:0x006c, B:109:0x0077, B:112:0x0081, B:115:0x008b, B:118:0x0095, B:121:0x009f, B:124:0x00a9, B:127:0x00b4, B:130:0x00bf, B:133:0x00ca, B:43:0x01f0), top: B:6:0x002a, inners: #2, #6, #8, #12 }] */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0147 A[Catch: JSONException -> 0x0267, TryCatch #5 {JSONException -> 0x0267, blocks: (B:7:0x002a, B:8:0x002e, B:13:0x00db, B:15:0x00e0, B:17:0x00f0, B:19:0x0109, B:21:0x011d, B:31:0x0121, B:24:0x012e, B:26:0x013a, B:28:0x0147, B:33:0x0126, B:34:0x014c, B:36:0x015a, B:38:0x0190, B:40:0x019e, B:50:0x022f, B:57:0x024b, B:89:0x0187, B:68:0x01c5, B:82:0x01e7, B:47:0x0207, B:75:0x0227, B:54:0x0243, B:61:0x025f, B:91:0x0033, B:94:0x003e, B:97:0x0049, B:100:0x0055, B:103:0x0061, B:106:0x006c, B:109:0x0077, B:112:0x0081, B:115:0x008b, B:118:0x0095, B:121:0x009f, B:124:0x00a9, B:127:0x00b4, B:130:0x00bf, B:133:0x00ca, B:43:0x01f0), top: B:6:0x002a, inners: #2, #6, #8, #12 }] */
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onMethodCall(io.flutter.plugin.common.MethodCall r6, io.flutter.plugin.common.MethodChannel.Result r7) {
                /*
                    Method dump skipped, instructions count: 734
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.PlatformChannel.AnonymousClass1.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
            }
        };
        this.parsingMethodCallHandler = methodCallHandler;
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(dartExecutor, "flutter/platform", io.flutter.plugin.common.JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.flutter.embedding.engine.systemchannels.PlatformChannel.AppSwitcherDescription decodeAppSwitcherDescription(org.json.JSONObject jSONObject) {
        int i17 = jSONObject.getInt("primaryColor");
        if (i17 != 0) {
            i17 |= -16777216;
        }
        return new io.flutter.embedding.engine.systemchannels.PlatformChannel.AppSwitcherDescription(i17, jSONObject.getString("label"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x003e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int decodeOrientations(org.json.JSONArray r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L4:
            int r4 = r10.length()
            r5 = 4
            r6 = 2
            r7 = 1
            if (r1 >= r4) goto L38
            java.lang.String r4 = r10.getString(r1)
            io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation r4 = io.flutter.embedding.engine.systemchannels.PlatformChannel.DeviceOrientation.fromValue(r4)
            int[] r8 = io.flutter.embedding.engine.systemchannels.PlatformChannel.AnonymousClass2.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation
            int r4 = r4.ordinal()
            r4 = r8[r4]
            if (r4 == r7) goto L30
            if (r4 == r6) goto L2d
            r6 = 3
            if (r4 == r6) goto L2a
            if (r4 == r5) goto L27
            goto L32
        L27:
            r2 = r2 | 8
            goto L32
        L2a:
            r2 = r2 | 2
            goto L32
        L2d:
            r2 = r2 | 4
            goto L32
        L30:
            r2 = r2 | 1
        L32:
            if (r3 != 0) goto L35
            r3 = r2
        L35:
            int r1 = r1 + 1
            goto L4
        L38:
            if (r2 == 0) goto L57
            r10 = 9
            r1 = 8
            switch(r2) {
                case 2: goto L56;
                case 3: goto L4d;
                case 4: goto L4c;
                case 5: goto L4a;
                case 6: goto L4d;
                case 7: goto L4d;
                case 8: goto L49;
                case 9: goto L4d;
                case 10: goto L46;
                case 11: goto L45;
                case 12: goto L4d;
                case 13: goto L4d;
                case 14: goto L4d;
                case 15: goto L42;
                default: goto L41;
            }
        L41:
            goto L53
        L42:
            r10 = 13
            return r10
        L45:
            return r6
        L46:
            r10 = 11
            return r10
        L49:
            return r1
        L4a:
            r10 = 12
        L4c:
            return r10
        L4d:
            if (r3 == r6) goto L56
            if (r3 == r5) goto L55
            if (r3 == r1) goto L54
        L53:
            return r7
        L54:
            return r1
        L55:
            return r10
        L56:
            return r0
        L57:
            r10 = -1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.PlatformChannel.decodeOrientations(org.json.JSONArray):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemChromeStyle decodeSystemChromeStyle(org.json.JSONObject jSONObject) {
        return new io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemChromeStyle(!jSONObject.isNull("statusBarColor") ? java.lang.Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? io.flutter.embedding.engine.systemchannels.PlatformChannel.Brightness.fromValue(jSONObject.getString("statusBarIconBrightness")) : null, !jSONObject.isNull("systemStatusBarContrastEnforced") ? java.lang.Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? java.lang.Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? io.flutter.embedding.engine.systemchannels.PlatformChannel.Brightness.fromValue(jSONObject.getString("systemNavigationBarIconBrightness")) : null, !jSONObject.isNull("systemNavigationBarDividerColor") ? java.lang.Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : java.lang.Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode decodeSystemUiMode(java.lang.String str) {
        int i17 = io.flutter.embedding.engine.systemchannels.PlatformChannel.AnonymousClass2.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiMode[io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode.fromValue(str).ordinal()];
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode.EDGE_TO_EDGE : io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode.EDGE_TO_EDGE : io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode.IMMERSIVE_STICKY : io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode.IMMERSIVE : io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode.LEAN_BACK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.List<io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay> decodeSystemUiOverlays(org.json.JSONArray jSONArray) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            int i18 = io.flutter.embedding.engine.systemchannels.PlatformChannel.AnonymousClass2.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay[io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.fromValue(jSONArray.getString(i17)).ordinal()];
            if (i18 == 1) {
                arrayList.add(io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.TOP_OVERLAYS);
            } else if (i18 == 2) {
                arrayList.add(io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.BOTTOM_OVERLAYS);
            }
        }
        return arrayList;
    }

    public void setPlatformMessageHandler(io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler platformMessageHandler) {
        this.platformMessageHandler = platformMessageHandler;
    }

    public void systemChromeChanged(boolean z17) {
        io.flutter.Log.v(TAG, "Sending 'systemUIChange' message.");
        this.channel.invokeMethod("SystemChrome.systemUIChange", java.util.Arrays.asList(java.lang.Boolean.valueOf(z17)));
    }
}
