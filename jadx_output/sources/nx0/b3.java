package nx0;

/* loaded from: classes5.dex */
public final class b3 {

    /* renamed from: g, reason: collision with root package name */
    public static final nx0.b3 f341074g;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f341075a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f341076b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f341077c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f341078d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f341079e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f341080f;

    static {
        java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.n1f);
        kotlin.jvm.internal.o.f(g17, "getString(...)");
        f341074g = new nx0.b3("", g17, "", false, false, true, 24, null);
    }

    public b3(java.lang.String id6, java.lang.String name, java.lang.String thumbnailURL, boolean z17, boolean z18, boolean z19, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 8) != 0 ? false : z17;
        z18 = (i17 & 16) != 0 ? false : z18;
        z19 = (i17 & 32) != 0 ? false : z19;
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(thumbnailURL, "thumbnailURL");
        this.f341075a = id6;
        this.f341076b = name;
        this.f341077c = thumbnailURL;
        this.f341078d = z17;
        this.f341079e = z18;
        this.f341080f = z19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx0.b3)) {
            return false;
        }
        nx0.b3 b3Var = (nx0.b3) obj;
        return kotlin.jvm.internal.o.b(this.f341075a, b3Var.f341075a) && kotlin.jvm.internal.o.b(this.f341076b, b3Var.f341076b) && kotlin.jvm.internal.o.b(this.f341077c, b3Var.f341077c) && this.f341078d == b3Var.f341078d && this.f341079e == b3Var.f341079e && this.f341080f == b3Var.f341080f;
    }

    public int hashCode() {
        return (((((((((this.f341075a.hashCode() * 31) + this.f341076b.hashCode()) * 31) + this.f341077c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f341078d)) * 31) + java.lang.Boolean.hashCode(this.f341079e)) * 31) + java.lang.Boolean.hashCode(this.f341080f);
    }

    public java.lang.String toString() {
        return "MakeupGroup(id=" + this.f341075a + ", name=" + this.f341076b + ", thumbnailURL=" + this.f341077c + ", isSelected=" + this.f341078d + ", isLoading=" + this.f341079e + ", isLoaded=" + this.f341080f + ')';
    }
}
