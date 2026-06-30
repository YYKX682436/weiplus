package su4;

/* loaded from: classes8.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f412906a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f412907b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f412908c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f412909d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f412910e;

    public h2(int i17, java.lang.String liteAppId, java.lang.String liteappPage) {
        kotlin.jvm.internal.o.g(liteAppId, "liteAppId");
        kotlin.jvm.internal.o.g(liteappPage, "liteappPage");
        this.f412906a = liteAppId;
        this.f412907b = liteappPage;
    }

    public final java.lang.String a() {
        return this.f412906a + this.f412907b;
    }

    public final boolean b(boolean z17) {
        java.lang.String str = this.f412908c;
        if (str == null) {
            return false;
        }
        if (kotlin.jvm.internal.o.b(str, "clicfg_discover_search_use_liteapp")) {
            return true;
        }
        try {
            return com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().j(str, "0", z17, true), 0) != 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("webSearch", "exception = " + e17.getStackTrace());
            return false;
        }
    }
}
