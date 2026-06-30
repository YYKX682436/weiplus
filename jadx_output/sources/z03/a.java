package z03;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f469202a;

    static {
        int[] iArr = new int[com.tencent.pigeon.flutter_voip.AudioDevice.values().length];
        try {
            iArr[com.tencent.pigeon.flutter_voip.AudioDevice.BLUETOOTH.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.tencent.pigeon.flutter_voip.AudioDevice.HEADSET.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.tencent.pigeon.flutter_voip.AudioDevice.EARPIECE.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[com.tencent.pigeon.flutter_voip.AudioDevice.SPEAKER.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        f469202a = iArr;
    }
}
