package ym5;

/* loaded from: classes15.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f463210a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f463211b;

    /* renamed from: c, reason: collision with root package name */
    public long f463212c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View.OnAttachStateChangeListener f463213d;

    /* renamed from: e, reason: collision with root package name */
    public ym5.n0 f463214e;

    /* renamed from: f, reason: collision with root package name */
    public ym5.o0 f463215f;

    /* renamed from: g, reason: collision with root package name */
    public long f463216g;

    /* renamed from: h, reason: collision with root package name */
    public long f463217h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f463218i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f463219j;

    public b1(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f463210a = view;
        this.f463212c = -1L;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ym5.b1) && kotlin.jvm.internal.o.b(this.f463210a, ((ym5.b1) obj).f463210a);
    }

    public int hashCode() {
        return this.f463210a.hashCode();
    }

    public java.lang.String toString() {
        return "ExposedData(view=" + this.f463210a + ')';
    }
}
