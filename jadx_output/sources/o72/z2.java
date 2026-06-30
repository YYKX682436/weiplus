package o72;

/* loaded from: classes12.dex */
public abstract class z2 {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.List f343535a = null;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f343536b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f343537c = "";

    /* renamed from: d, reason: collision with root package name */
    public static long f343538d;

    public static void a(java.lang.String str) {
        b(str, "");
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f343536b)) {
            c(f343536b, f343537c);
        }
        f343536b = str;
        f343537c = str2;
        f343538d = java.lang.System.currentTimeMillis();
    }

    public static void c(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.equals(f343536b)) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = f343538d;
        int i17 = (int) (currentTimeMillis - j17);
        f343538d = j17 / 1000;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str2 = "-1";
        }
        long j18 = f343538d;
        if (f343535a != null) {
            o72.y2 y2Var = new o72.y2(null);
            y2Var.f343526a = str;
            y2Var.f343527b = j18;
            y2Var.f343528c = i17;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                y2Var.f343529d = "-1";
            } else {
                y2Var.f343529d = str2;
            }
            java.util.List list = f343535a;
            if (list != null) {
                ((java.util.Vector) list).add(y2Var);
            }
        }
        f343536b = "";
        f343537c = "";
        f343538d = 0L;
    }
}
