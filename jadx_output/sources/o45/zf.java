package o45;

/* loaded from: classes12.dex */
public abstract class zf {

    /* renamed from: a, reason: collision with root package name */
    public static int f343040a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f343041b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f343042c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f343043d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f343044e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f343045f;

    static {
        int intValue = java.lang.Integer.decode(com.tencent.mm.sdk.platformtools.z.f193111g).intValue();
        f343040a = intValue;
        int i17 = intValue & 255;
        f343041b = i17 >= 48 && i17 <= 95;
        int i18 = intValue & 255;
        f343042c = i18 >= 64 && i18 <= 79;
        f343043d = (intValue & 255) >= 96;
        f343044e = com.tencent.mm.sdk.platformtools.v8.a(intValue);
        f343045f = com.tencent.mm.sdk.platformtools.v8.b(f343040a);
        iz5.a.d(null, com.tencent.mm.sdk.platformtools.z.f193111g);
    }
}
