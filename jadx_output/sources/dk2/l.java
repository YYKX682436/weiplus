package dk2;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.l f233709a = new dk2.l();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f233710b = new java.util.HashMap();

    static {
        ki.i.f308101c.c(new dk2.k());
    }

    public final void a(java.lang.String prefix) {
        kotlin.jvm.internal.o.g(prefix, "prefix");
        try {
            com.tencent.mars.xlog.Log.i("FinderLiveActivityDataTransaction", prefix.concat(" clear cache feed!"));
            f233710b.clear();
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "FinderLiveActivityDataTransaction-".concat(prefix));
        }
    }
}
