package nx0;

/* loaded from: classes5.dex */
public final class r1 {

    /* renamed from: g, reason: collision with root package name */
    public static final nx0.r1 f341209g;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f341210a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f341211b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f341212c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f341213d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f341214e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f341215f;

    static {
        java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.n1f);
        kotlin.jvm.internal.o.f(g17, "getString(...)");
        f341209g = new nx0.r1("", g17, "", false, false, true, 24, null);
    }

    public r1(java.lang.String id6, java.lang.String name, java.lang.String thumbnailURL, boolean z17, boolean z18, boolean z19, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 8) != 0 ? false : z17;
        z18 = (i17 & 16) != 0 ? false : z18;
        z19 = (i17 & 32) != 0 ? false : z19;
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(thumbnailURL, "thumbnailURL");
        this.f341210a = id6;
        this.f341211b = name;
        this.f341212c = thumbnailURL;
        this.f341213d = z17;
        this.f341214e = z18;
        this.f341215f = z19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx0.r1)) {
            return false;
        }
        nx0.r1 r1Var = (nx0.r1) obj;
        return kotlin.jvm.internal.o.b(this.f341210a, r1Var.f341210a) && kotlin.jvm.internal.o.b(this.f341211b, r1Var.f341211b) && kotlin.jvm.internal.o.b(this.f341212c, r1Var.f341212c) && this.f341213d == r1Var.f341213d && this.f341214e == r1Var.f341214e && this.f341215f == r1Var.f341215f;
    }

    public int hashCode() {
        return (((((((((this.f341210a.hashCode() * 31) + this.f341211b.hashCode()) * 31) + this.f341212c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f341213d)) * 31) + java.lang.Boolean.hashCode(this.f341214e)) * 31) + java.lang.Boolean.hashCode(this.f341215f);
    }

    public java.lang.String toString() {
        return "FaceEffectGroup(id=" + this.f341210a + ", name=" + this.f341211b + ", thumbnailURL=" + this.f341212c + ", isSelected=" + this.f341213d + ", isLoading=" + this.f341214e + ", isLoaded=" + this.f341215f + ')';
    }
}
