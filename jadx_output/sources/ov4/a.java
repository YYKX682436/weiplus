package ov4;

/* loaded from: classes.dex */
public final class a implements nv4.h {

    /* renamed from: a, reason: collision with root package name */
    public final int f349181a;

    /* renamed from: b, reason: collision with root package name */
    public final int f349182b;

    /* renamed from: c, reason: collision with root package name */
    public final int f349183c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f349184d;

    /* renamed from: e, reason: collision with root package name */
    public final int f349185e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f349186f;

    /* renamed from: g, reason: collision with root package name */
    public final int f349187g;

    public a(int i17, int i18, int i19, java.lang.String searchId, int i27, java.lang.String sessionId, int i28, int i29, kotlin.jvm.internal.i iVar) {
        i18 = (i29 & 2) != 0 ? 0 : i18;
        searchId = (i29 & 8) != 0 ? "" : searchId;
        i27 = (i29 & 16) != 0 ? 0 : i27;
        i28 = (i29 & 64) != 0 ? 2 : i28;
        kotlin.jvm.internal.o.g(searchId, "searchId");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        this.f349181a = i17;
        this.f349182b = i18;
        this.f349183c = i19;
        this.f349184d = searchId;
        this.f349185e = i27;
        this.f349186f = sessionId;
        this.f349187g = i28;
    }

    @Override // nv4.h
    public java.lang.String A() {
        return "12845-" + this.f349186f + ',' + this.f349181a + ',' + this.f349183c;
    }

    @Override // nv4.h
    public nv4.h B(nv4.h item) {
        kotlin.jvm.internal.o.g(item, "item");
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov4.a)) {
            return false;
        }
        ov4.a aVar = (ov4.a) obj;
        return this.f349181a == aVar.f349181a && this.f349182b == aVar.f349182b && this.f349183c == aVar.f349183c && kotlin.jvm.internal.o.b(this.f349184d, aVar.f349184d) && this.f349185e == aVar.f349185e && kotlin.jvm.internal.o.b(this.f349186f, aVar.f349186f) && this.f349187g == aVar.f349187g;
    }

    public int hashCode() {
        return (((((((((((java.lang.Integer.hashCode(this.f349181a) * 31) + java.lang.Integer.hashCode(this.f349182b)) * 31) + java.lang.Integer.hashCode(this.f349183c)) * 31) + this.f349184d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f349185e)) * 31) + this.f349186f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f349187g);
    }

    public java.lang.String toString() {
        return "FTSReportItem12845(businessType=" + this.f349181a + ", guideStyle=" + this.f349182b + ", scene=" + this.f349183c + ", searchId=" + this.f349184d + ", isTabGuide=" + this.f349185e + ", sessionId=" + this.f349186f + ", h5version=" + this.f349187g + ')';
    }

    @Override // nv4.h
    public void z() {
        jx3.f.INSTANCE.kvStat(12845, this.f349181a + ',' + this.f349182b + ',' + this.f349183c + ',' + this.f349184d + ',' + this.f349185e + ',' + this.f349186f + ",," + this.f349187g);
    }
}
