package n3;

/* loaded from: classes14.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public final e3.d f334343a;

    /* renamed from: b, reason: collision with root package name */
    public final e3.d f334344b;

    public i2(e3.d dVar, e3.d dVar2) {
        this.f334343a = dVar;
        this.f334344b = dVar2;
    }

    public java.lang.String toString() {
        return "Bounds{lower=" + this.f334343a + " upper=" + this.f334344b + "}";
    }

    public i2(android.view.WindowInsetsAnimation.Bounds bounds) {
        this.f334343a = e3.d.d(bounds.getLowerBound());
        this.f334344b = e3.d.d(bounds.getUpperBound());
    }
}
