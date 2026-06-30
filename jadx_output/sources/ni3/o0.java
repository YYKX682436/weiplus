package ni3;

/* loaded from: classes10.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f337647a;

    /* renamed from: b, reason: collision with root package name */
    public final int f337648b;

    /* renamed from: c, reason: collision with root package name */
    public final int f337649c;

    /* renamed from: d, reason: collision with root package name */
    public int f337650d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f337651e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f337652f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f337653g;

    public o0(java.lang.String contextId, int i17, int i18, int i19, java.lang.String description, java.lang.String specFormat, java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(contextId, "contextId");
        kotlin.jvm.internal.o.g(description, "description");
        kotlin.jvm.internal.o.g(specFormat, "specFormat");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        this.f337647a = contextId;
        this.f337648b = i17;
        this.f337649c = i18;
        this.f337650d = i19;
        this.f337651e = description;
        this.f337652f = specFormat;
        this.f337653g = mediaId;
    }

    public final void a(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f337651e = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3.o0)) {
            return false;
        }
        ni3.o0 o0Var = (ni3.o0) obj;
        return kotlin.jvm.internal.o.b(this.f337647a, o0Var.f337647a) && this.f337648b == o0Var.f337648b && this.f337649c == o0Var.f337649c && this.f337650d == o0Var.f337650d && kotlin.jvm.internal.o.b(this.f337651e, o0Var.f337651e) && kotlin.jvm.internal.o.b(this.f337652f, o0Var.f337652f) && kotlin.jvm.internal.o.b(this.f337653g, o0Var.f337653g);
    }

    public int hashCode() {
        return (((((((((((this.f337647a.hashCode() * 31) + java.lang.Integer.hashCode(this.f337648b)) * 31) + java.lang.Integer.hashCode(this.f337649c)) * 31) + java.lang.Integer.hashCode(this.f337650d)) * 31) + this.f337651e.hashCode()) * 31) + this.f337652f.hashCode()) * 31) + this.f337653g.hashCode();
    }

    public java.lang.String toString() {
        return this.f337650d + '.' + hc2.b0.k(this.f337651e, 0, 0, 3, null) + '.' + this.f337652f;
    }
}
