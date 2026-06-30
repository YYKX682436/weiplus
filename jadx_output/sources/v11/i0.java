package v11;

/* loaded from: classes5.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f432404a;

    /* renamed from: b, reason: collision with root package name */
    public final float f432405b;

    /* renamed from: c, reason: collision with root package name */
    public final float f432406c;

    /* renamed from: d, reason: collision with root package name */
    public final float f432407d;

    /* renamed from: e, reason: collision with root package name */
    public final float f432408e;

    /* renamed from: f, reason: collision with root package name */
    public final float f432409f;

    /* renamed from: g, reason: collision with root package name */
    public final float f432410g;

    /* renamed from: h, reason: collision with root package name */
    public final float f432411h;

    /* renamed from: i, reason: collision with root package name */
    public final float f432412i;

    /* renamed from: j, reason: collision with root package name */
    public final float f432413j;

    public i0(float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38, float f39, float f47) {
        this.f432404a = f17;
        this.f432405b = f18;
        this.f432406c = f19;
        this.f432407d = f27;
        this.f432408e = f28;
        this.f432409f = f29;
        this.f432410g = f37;
        this.f432411h = f38;
        this.f432412i = f39;
        this.f432413j = f47;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.i0)) {
            return false;
        }
        v11.i0 i0Var = (v11.i0) obj;
        return java.lang.Float.compare(this.f432404a, i0Var.f432404a) == 0 && java.lang.Float.compare(this.f432405b, i0Var.f432405b) == 0 && java.lang.Float.compare(this.f432406c, i0Var.f432406c) == 0 && java.lang.Float.compare(this.f432407d, i0Var.f432407d) == 0 && java.lang.Float.compare(this.f432408e, i0Var.f432408e) == 0 && java.lang.Float.compare(this.f432409f, i0Var.f432409f) == 0 && java.lang.Float.compare(this.f432410g, i0Var.f432410g) == 0 && java.lang.Float.compare(this.f432411h, i0Var.f432411h) == 0 && java.lang.Float.compare(this.f432412i, i0Var.f432412i) == 0 && java.lang.Float.compare(this.f432413j, i0Var.f432413j) == 0;
    }

    public int hashCode() {
        return (((((((((((((((((java.lang.Float.hashCode(this.f432404a) * 31) + java.lang.Float.hashCode(this.f432405b)) * 31) + java.lang.Float.hashCode(this.f432406c)) * 31) + java.lang.Float.hashCode(this.f432407d)) * 31) + java.lang.Float.hashCode(this.f432408e)) * 31) + java.lang.Float.hashCode(this.f432409f)) * 31) + java.lang.Float.hashCode(this.f432410g)) * 31) + java.lang.Float.hashCode(this.f432411h)) * 31) + java.lang.Float.hashCode(this.f432412i)) * 31) + java.lang.Float.hashCode(this.f432413j);
    }

    public java.lang.String toString() {
        return "NativeMarkdownTextSizeConfig(bodyTextSizeDp=" + this.f432404a + ", h1TextSizeDp=" + this.f432405b + ", h2TextSizeDp=" + this.f432406c + ", h3TextSizeDp=" + this.f432407d + ", h4TextSizeDp=" + this.f432408e + ", h5TextSizeDp=" + this.f432409f + ", h6TextSizeDp=" + this.f432410g + ", codeTextSizeDp=" + this.f432411h + ", inlineCodeTextSizeDp=" + this.f432412i + ", tableHeaderTextSizeDp=" + this.f432413j + ')';
    }
}
