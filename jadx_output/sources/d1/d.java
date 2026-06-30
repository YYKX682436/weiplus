package d1;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public float f225619a;

    /* renamed from: b, reason: collision with root package name */
    public float f225620b;

    /* renamed from: c, reason: collision with root package name */
    public float f225621c;

    /* renamed from: d, reason: collision with root package name */
    public float f225622d;

    public d(float f17, float f18, float f19, float f27) {
        this.f225619a = f17;
        this.f225620b = f18;
        this.f225621c = f19;
        this.f225622d = f27;
    }

    public final void a(float f17, float f18, float f19, float f27) {
        this.f225619a = java.lang.Math.max(f17, this.f225619a);
        this.f225620b = java.lang.Math.max(f18, this.f225620b);
        this.f225621c = java.lang.Math.min(f19, this.f225621c);
        this.f225622d = java.lang.Math.min(f27, this.f225622d);
    }

    public final boolean b() {
        return this.f225619a >= this.f225621c || this.f225620b >= this.f225622d;
    }

    public java.lang.String toString() {
        return "MutableRect(" + d1.c.a(this.f225619a, 1) + ", " + d1.c.a(this.f225620b, 1) + ", " + d1.c.a(this.f225621c, 1) + ", " + d1.c.a(this.f225622d, 1) + ')';
    }
}
