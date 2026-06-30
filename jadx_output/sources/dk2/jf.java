package dk2;

/* loaded from: classes3.dex */
public final class jf {

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.jf f233665a = new dk2.jf();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f233666b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f233667c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f233668d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f233669e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f233670f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f233671g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f233672h = new java.util.HashMap();

    public final void a(java.lang.String key, yz5.a aVar) {
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveSysMsgCallback", "register close live callback");
        if (aVar != null) {
            java.util.HashMap hashMap = f233669e;
            if (hashMap.get(key) == null) {
                hashMap.put(key, aVar);
            }
        }
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveSysMsgCallback", "release callback");
        f233666b.clear();
        f233667c.clear();
        f233668d.clear();
        f233669e.clear();
        f233670f.clear();
        f233671g.clear();
        f233672h.clear();
    }
}
