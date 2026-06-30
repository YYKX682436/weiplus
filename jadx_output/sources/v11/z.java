package v11;

/* loaded from: classes11.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final v11.a0 f432491a;

    /* renamed from: b, reason: collision with root package name */
    public final v11.a0 f432492b;

    /* renamed from: c, reason: collision with root package name */
    public final v11.a0 f432493c;

    /* renamed from: d, reason: collision with root package name */
    public final v11.a0 f432494d;

    /* renamed from: e, reason: collision with root package name */
    public final v11.a0 f432495e;

    /* renamed from: f, reason: collision with root package name */
    public final v11.a0 f432496f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f432497g;

    /* renamed from: h, reason: collision with root package name */
    public final float f432498h;

    public z(v11.a0 h17, v11.a0 h27, v11.a0 h37, v11.a0 h47, v11.a0 h57, v11.a0 h66, boolean z17, float f17) {
        kotlin.jvm.internal.o.g(h17, "h1");
        kotlin.jvm.internal.o.g(h27, "h2");
        kotlin.jvm.internal.o.g(h37, "h3");
        kotlin.jvm.internal.o.g(h47, "h4");
        kotlin.jvm.internal.o.g(h57, "h5");
        kotlin.jvm.internal.o.g(h66, "h6");
        this.f432491a = h17;
        this.f432492b = h27;
        this.f432493c = h37;
        this.f432494d = h47;
        this.f432495e = h57;
        this.f432496f = h66;
        this.f432497g = z17;
        this.f432498h = f17;
    }

    public static v11.z a(v11.z zVar, v11.a0 a0Var, v11.a0 a0Var2, v11.a0 a0Var3, v11.a0 a0Var4, v11.a0 a0Var5, v11.a0 a0Var6, boolean z17, float f17, int i17, java.lang.Object obj) {
        v11.a0 h17 = (i17 & 1) != 0 ? zVar.f432491a : a0Var;
        v11.a0 h27 = (i17 & 2) != 0 ? zVar.f432492b : a0Var2;
        v11.a0 h37 = (i17 & 4) != 0 ? zVar.f432493c : a0Var3;
        v11.a0 h47 = (i17 & 8) != 0 ? zVar.f432494d : a0Var4;
        v11.a0 h57 = (i17 & 16) != 0 ? zVar.f432495e : a0Var5;
        v11.a0 h66 = (i17 & 32) != 0 ? zVar.f432496f : a0Var6;
        boolean z18 = (i17 & 64) != 0 ? zVar.f432497g : z17;
        float f18 = (i17 & 128) != 0 ? zVar.f432498h : f17;
        zVar.getClass();
        kotlin.jvm.internal.o.g(h17, "h1");
        kotlin.jvm.internal.o.g(h27, "h2");
        kotlin.jvm.internal.o.g(h37, "h3");
        kotlin.jvm.internal.o.g(h47, "h4");
        kotlin.jvm.internal.o.g(h57, "h5");
        kotlin.jvm.internal.o.g(h66, "h6");
        return new v11.z(h17, h27, h37, h47, h57, h66, z18, f18);
    }

    public final int b(int i17) {
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? this.f432496f.f432327b : this.f432495e.f432327b : this.f432494d.f432327b : this.f432493c.f432327b : this.f432492b.f432327b : this.f432491a.f432327b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.z)) {
            return false;
        }
        v11.z zVar = (v11.z) obj;
        return kotlin.jvm.internal.o.b(this.f432491a, zVar.f432491a) && kotlin.jvm.internal.o.b(this.f432492b, zVar.f432492b) && kotlin.jvm.internal.o.b(this.f432493c, zVar.f432493c) && kotlin.jvm.internal.o.b(this.f432494d, zVar.f432494d) && kotlin.jvm.internal.o.b(this.f432495e, zVar.f432495e) && kotlin.jvm.internal.o.b(this.f432496f, zVar.f432496f) && this.f432497g == zVar.f432497g && java.lang.Float.compare(this.f432498h, zVar.f432498h) == 0;
    }

    public int hashCode() {
        return (((((((((((((this.f432491a.hashCode() * 31) + this.f432492b.hashCode()) * 31) + this.f432493c.hashCode()) * 31) + this.f432494d.hashCode()) * 31) + this.f432495e.hashCode()) * 31) + this.f432496f.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f432497g)) * 31) + java.lang.Float.hashCode(this.f432498h);
    }

    public java.lang.String toString() {
        return "NativeMarkdownHeadingConfig(h1=" + this.f432491a + ", h2=" + this.f432492b + ", h3=" + this.f432493c + ", h4=" + this.f432494d + ", h5=" + this.f432495e + ", h6=" + this.f432496f + ", forceBold=" + this.f432497g + ", lineSpacingMultiplier=" + this.f432498h + ')';
    }
}
