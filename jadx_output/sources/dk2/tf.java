package dk2;

/* loaded from: classes3.dex */
public final class tf {

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.tf f234133a = new dk2.tf();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f234134b = jz5.h.b(dk2.sf.f234081d);

    public final long a(java.lang.String anchorUserName) {
        kotlin.jvm.internal.o.g(anchorUserName, "anchorUserName");
        long i17 = com.tencent.mm.sdk.platformtools.t8.i1();
        java.lang.Long l17 = (java.lang.Long) ((java.util.Map) ((jz5.n) f234134b).getValue()).get(anchorUserName);
        return i17 - (l17 != null ? l17.longValue() : i17);
    }
}
