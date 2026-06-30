package nx0;

/* loaded from: classes5.dex */
public final class i2 {

    /* renamed from: f, reason: collision with root package name */
    public static final nx0.i2 f341131f;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f341132a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f341133b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f341134c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f341135d;

    /* renamed from: e, reason: collision with root package name */
    public float f341136e;

    static {
        java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.n1f);
        kotlin.jvm.internal.o.f(g17, "getString(...)");
        f341131f = new nx0.i2("", g17, "", false, 0.0f, 24, null);
    }

    public i2(java.lang.String id6, java.lang.String name, java.lang.String thumbnailURL, boolean z17, float f17, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 8) != 0 ? false : z17;
        f17 = (i17 & 16) != 0 ? 0.0f : f17;
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(thumbnailURL, "thumbnailURL");
        this.f341132a = id6;
        this.f341133b = name;
        this.f341134c = thumbnailURL;
        this.f341135d = z17;
        this.f341136e = f17;
    }

    public final boolean a() {
        return this == f341131f;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx0.i2)) {
            return false;
        }
        nx0.i2 i2Var = (nx0.i2) obj;
        return kotlin.jvm.internal.o.b(this.f341132a, i2Var.f341132a) && kotlin.jvm.internal.o.b(this.f341133b, i2Var.f341133b) && kotlin.jvm.internal.o.b(this.f341134c, i2Var.f341134c) && this.f341135d == i2Var.f341135d && java.lang.Float.compare(this.f341136e, i2Var.f341136e) == 0;
    }

    public int hashCode() {
        return (((((((this.f341132a.hashCode() * 31) + this.f341133b.hashCode()) * 31) + this.f341134c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f341135d)) * 31) + java.lang.Float.hashCode(this.f341136e);
    }

    public java.lang.String toString() {
        return "FilterItem(id=" + this.f341132a + ", name=" + this.f341133b + ", thumbnailURL=" + this.f341134c + ", isSelected=" + this.f341135d + ", intensity=" + this.f341136e + ')';
    }
}
