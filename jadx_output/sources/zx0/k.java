package zx0;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f477023a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f477024b;

    static {
        int[] iArr = new int[com.tencent.maas.camstudio.gesture.MJGestureEvent.MJGesturePhase.values().length];
        try {
            iArr[com.tencent.maas.camstudio.gesture.MJGestureEvent.MJGesturePhase.Began.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.tencent.maas.camstudio.gesture.MJGestureEvent.MJGesturePhase.Changed.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.tencent.maas.camstudio.gesture.MJGestureEvent.MJGesturePhase.Ended.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        f477023a = iArr;
        int[] iArr2 = new int[com.tencent.maas.camstudio.p.values().length];
        try {
            iArr2[2] = 1;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            iArr2[4] = 2;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        f477024b = iArr2;
    }
}
