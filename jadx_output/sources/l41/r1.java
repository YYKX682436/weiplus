package l41;

/* loaded from: classes4.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final l41.r1 f315913a = new l41.r1();

    /* renamed from: b, reason: collision with root package name */
    public static i11.c f315914b;

    public static /* synthetic */ void b(l41.r1 r1Var, java.lang.String str, java.lang.String str2, int i17, yz5.l lVar, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            str2 = "wgs84";
        }
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        if ((i18 & 8) != 0) {
            lVar = l41.o1.f315888d;
        }
        r1Var.a(str, str2, i17, lVar);
    }

    public final void a(java.lang.String talkUsername, java.lang.String locationType, int i17, yz5.l successCallback) {
        kotlin.jvm.internal.o.g(talkUsername, "talkUsername");
        kotlin.jvm.internal.o.g(locationType, "locationType");
        kotlin.jvm.internal.o.g(successCallback, "successCallback");
        java.lang.String lowerCase = locationType.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        boolean b17 = kotlin.jvm.internal.o.b(lowerCase, "wgs84");
        if (f315914b == null) {
            f315914b = new l41.q1(talkUsername, b17, i17, successCallback);
        }
        if (b17) {
            i11.h.e().k(f315914b, false);
        } else {
            i11.h.e().j(f315914b, false);
        }
    }
}
