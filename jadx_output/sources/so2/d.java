package so2;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f410302a;

    /* renamed from: b, reason: collision with root package name */
    public int f410303b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f410304c;

    /* renamed from: d, reason: collision with root package name */
    public final so2.e f410305d;

    /* renamed from: e, reason: collision with root package name */
    public final so2.e f410306e;

    /* renamed from: f, reason: collision with root package name */
    public final so2.e f410307f;

    public d(int i17, int i18, boolean z17, so2.e preRenderLife, so2.e oneStagePreload, so2.e twoStagePreload) {
        kotlin.jvm.internal.o.g(preRenderLife, "preRenderLife");
        kotlin.jvm.internal.o.g(oneStagePreload, "oneStagePreload");
        kotlin.jvm.internal.o.g(twoStagePreload, "twoStagePreload");
        this.f410302a = i17;
        this.f410303b = i18;
        this.f410304c = z17;
        this.f410305d = preRenderLife;
        this.f410306e = oneStagePreload;
        this.f410307f = twoStagePreload;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.d)) {
            return false;
        }
        so2.d dVar = (so2.d) obj;
        return this.f410302a == dVar.f410302a && this.f410303b == dVar.f410303b && this.f410304c == dVar.f410304c && kotlin.jvm.internal.o.b(this.f410305d, dVar.f410305d) && kotlin.jvm.internal.o.b(this.f410306e, dVar.f410306e) && kotlin.jvm.internal.o.b(this.f410307f, dVar.f410307f);
    }

    public int hashCode() {
        return (((((((((java.lang.Integer.hashCode(this.f410302a) * 31) + java.lang.Integer.hashCode(this.f410303b)) * 31) + java.lang.Boolean.hashCode(this.f410304c)) * 31) + this.f410305d.hashCode()) * 31) + this.f410306e.hashCode()) * 31) + this.f410307f.hashCode();
    }

    public java.lang.String toString() {
        return "ContextInStream(position=" + this.f410302a + ", curScrollDirection=" + this.f410303b + ", isComeToPreRender=" + this.f410304c + ", preRenderLife=" + this.f410305d + ", oneStagePreload=" + this.f410306e + ", twoStagePreload=" + this.f410307f + ')';
    }
}
