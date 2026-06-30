package i62;

/* loaded from: classes13.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i62.i f288948a = new i62.i();

    /* renamed from: b, reason: collision with root package name */
    public static final yj0.b f288949b = new i62.g();

    /* renamed from: c, reason: collision with root package name */
    public static final yj0.d f288950c = new i62.h();

    /* renamed from: d, reason: collision with root package name */
    public static final i62.e f288951d = new i62.e();

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.app.s2 f288952e = new i62.f();

    public final java.lang.String a(java.lang.Object[] objArr, java.lang.String title) {
        kotlin.jvm.internal.o.g(title, "title");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(title);
        if (objArr != null) {
            int length = objArr.length;
            int i17 = 0;
            int i18 = 0;
            while (i17 < length) {
                sb6.append("i:" + i18 + " v:" + objArr[i17]);
                i17++;
                i18++;
            }
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
