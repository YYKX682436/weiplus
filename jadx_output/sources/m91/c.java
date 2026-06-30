package m91;

/* loaded from: classes7.dex */
public final class c implements java.lang.Comparable {

    /* renamed from: m, reason: collision with root package name */
    public static final m91.b f324942m = new m91.b(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f324943d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f324944e;

    /* renamed from: f, reason: collision with root package name */
    public final int f324945f;

    /* renamed from: g, reason: collision with root package name */
    public final int f324946g;

    /* renamed from: h, reason: collision with root package name */
    public final int f324947h;

    /* renamed from: i, reason: collision with root package name */
    public final int f324948i;

    public c(java.lang.String appId, java.lang.String appName, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(appName, "appName");
        this.f324943d = appId;
        this.f324944e = appName;
        this.f324945f = i17;
        this.f324946g = i18;
        this.f324947h = i19;
        this.f324948i = i27;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(m91.c other) {
        kotlin.jvm.internal.o.g(other, "other");
        int compareTo = this.f324943d.compareTo(other.f324943d);
        int i17 = this.f324945f;
        if (compareTo == 0) {
            compareTo = i17 - other.f324945f;
        }
        return (compareTo == 0 && com.tencent.mm.plugin.appbrand.appcache.g0.b(i17)) ? this.f324946g - other.f324946g : compareTo;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof m91.c) && compareTo((m91.c) obj) == 0;
    }

    public int hashCode() {
        return ("[" + this.f324943d + "::" + this.f324945f + "::" + this.f324946g + ']').hashCode();
    }
}
