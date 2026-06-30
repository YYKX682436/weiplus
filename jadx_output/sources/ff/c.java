package ff;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f261577a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f261578b;

    static {
        int[] iArr = new int[io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.values().length];
        f261578b = iArr;
        try {
            iArr[io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.TOP_OVERLAYS.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            f261578b[io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.BOTTOM_OVERLAYS.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.values().length];
        f261577a = iArr2;
        try {
            iArr2[io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.STANDARD.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            f261577a[io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.LIGHT_IMPACT.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            f261577a[io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.MEDIUM_IMPACT.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            f261577a[io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.HEAVY_IMPACT.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            f261577a[io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.SELECTION_CLICK.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
    }
}
