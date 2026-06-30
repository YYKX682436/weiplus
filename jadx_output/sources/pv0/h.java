package pv0;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.segments.Segment f358525a;

    /* renamed from: b, reason: collision with root package name */
    public final pv0.a f358526b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f358527c;

    /* renamed from: d, reason: collision with root package name */
    public final pv0.j f358528d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f358529e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f358530f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f358531g;

    public h(com.tencent.maas.moviecomposing.segments.Segment segment, pv0.a timbrePanelCallback, java.lang.String panelTitle, pv0.j panelType, boolean z17, boolean z18, boolean z19) {
        kotlin.jvm.internal.o.g(segment, "segment");
        kotlin.jvm.internal.o.g(timbrePanelCallback, "timbrePanelCallback");
        kotlin.jvm.internal.o.g(panelTitle, "panelTitle");
        kotlin.jvm.internal.o.g(panelType, "panelType");
        this.f358525a = segment;
        this.f358526b = timbrePanelCallback;
        this.f358527c = panelTitle;
        this.f358528d = panelType;
        this.f358529e = z17;
        this.f358530f = z18;
        this.f358531g = z19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv0.h)) {
            return false;
        }
        pv0.h hVar = (pv0.h) obj;
        return kotlin.jvm.internal.o.b(this.f358525a, hVar.f358525a) && kotlin.jvm.internal.o.b(this.f358526b, hVar.f358526b) && kotlin.jvm.internal.o.b(this.f358527c, hVar.f358527c) && this.f358528d == hVar.f358528d && this.f358529e == hVar.f358529e && this.f358530f == hVar.f358530f && this.f358531g == hVar.f358531g;
    }

    public int hashCode() {
        return (((((((((((this.f358525a.hashCode() * 31) + this.f358526b.hashCode()) * 31) + this.f358527c.hashCode()) * 31) + this.f358528d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f358529e)) * 31) + java.lang.Boolean.hashCode(this.f358530f)) * 31) + java.lang.Boolean.hashCode(this.f358531g);
    }

    public java.lang.String toString() {
        return "Args(segment=" + this.f358525a + ", timbrePanelCallback=" + this.f358526b + ", panelTitle=" + this.f358527c + ", panelType=" + this.f358528d + ", isAutoApply=" + this.f358529e + ", isAllowApplyInLoading=" + this.f358530f + ", isAllowClose=" + this.f358531g + ')';
    }
}
