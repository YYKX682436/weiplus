package z65;

/* loaded from: classes12.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f470455a = false;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f470456b = "unknow";

    /* renamed from: c, reason: collision with root package name */
    public static z65.d f470457c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f470458d = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f470459e = false;

    /* renamed from: f, reason: collision with root package name */
    public static long f470460f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f470461g = "";

    /* renamed from: h, reason: collision with root package name */
    public static volatile z65.b f470462h;

    public static boolean a() {
        if (f470462h == null) {
            return false;
        }
        com.tencent.mm.booter.r rVar = (com.tencent.mm.booter.r) f470462h;
        rVar.getClass();
        try {
            return rVar.f63557a.f63564c.get() != null;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        z65.d dVar = f470457c;
        if (dVar != null) {
            dVar.b(str, str2);
        }
    }
}
