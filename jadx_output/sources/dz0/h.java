package dz0;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f244855a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f244856b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f244857c;

    /* renamed from: d, reason: collision with root package name */
    public final int f244858d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f244859e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f244860f;

    /* renamed from: g, reason: collision with root package name */
    public final int f244861g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f244862h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f244863i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f244864j;

    public h(java.lang.String scene, boolean z17, boolean z18, int i17, boolean z19, java.util.List defaultTemplateIDs, int i18, boolean z27, java.util.List list, boolean z28) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(defaultTemplateIDs, "defaultTemplateIDs");
        this.f244855a = scene;
        this.f244856b = z17;
        this.f244857c = z18;
        this.f244858d = i17;
        this.f244859e = z19;
        this.f244860f = defaultTemplateIDs;
        this.f244861g = i18;
        this.f244862h = z27;
        this.f244863i = list;
        this.f244864j = z28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz0.h)) {
            return false;
        }
        dz0.h hVar = (dz0.h) obj;
        return kotlin.jvm.internal.o.b(this.f244855a, hVar.f244855a) && this.f244856b == hVar.f244856b && this.f244857c == hVar.f244857c && this.f244858d == hVar.f244858d && this.f244859e == hVar.f244859e && kotlin.jvm.internal.o.b(this.f244860f, hVar.f244860f) && this.f244861g == hVar.f244861g && this.f244862h == hVar.f244862h && kotlin.jvm.internal.o.b(this.f244863i, hVar.f244863i) && this.f244864j == hVar.f244864j;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.f244855a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f244856b)) * 31) + java.lang.Boolean.hashCode(this.f244857c)) * 31) + java.lang.Integer.hashCode(this.f244858d)) * 31) + java.lang.Boolean.hashCode(this.f244859e)) * 31) + this.f244860f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f244861g)) * 31) + java.lang.Boolean.hashCode(this.f244862h)) * 31;
        java.util.List list = this.f244863i;
        return ((hashCode + (list == null ? 0 : list.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f244864j);
    }

    public java.lang.String toString() {
        return "MaasMovieSessionInitialParams(scene=" + this.f244855a + ", musicMuted=" + this.f244856b + ", originMuted=" + this.f244857c + ", maxDurationInSeconds=" + this.f244858d + ", shouldRetainOriginalMediaDuration=" + this.f244859e + ", defaultTemplateIDs=" + this.f244860f + ", retainOriginalMediaDurationThresholdInSeconds=" + this.f244861g + ", shouldAutoRecommendBGM=" + this.f244862h + ", initialTmplList=" + this.f244863i + ", shouldAutoRecommendBGMForAutoRecommendTemplate=" + this.f244864j + ')';
    }
}
