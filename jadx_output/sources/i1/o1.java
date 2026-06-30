package i1;

/* loaded from: classes14.dex */
public final class o1 extends i1.q1 implements java.lang.Iterable, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f286987d;

    /* renamed from: e, reason: collision with root package name */
    public final float f286988e;

    /* renamed from: f, reason: collision with root package name */
    public final float f286989f;

    /* renamed from: g, reason: collision with root package name */
    public final float f286990g;

    /* renamed from: h, reason: collision with root package name */
    public final float f286991h;

    /* renamed from: i, reason: collision with root package name */
    public final float f286992i;

    /* renamed from: m, reason: collision with root package name */
    public final float f286993m;

    /* renamed from: n, reason: collision with root package name */
    public final float f286994n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f286995o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f286996p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(java.lang.String name, float f17, float f18, float f19, float f27, float f28, float f29, float f37, java.util.List clipPathData, java.util.List children) {
        super(null);
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(clipPathData, "clipPathData");
        kotlin.jvm.internal.o.g(children, "children");
        this.f286987d = name;
        this.f286988e = f17;
        this.f286989f = f18;
        this.f286990g = f19;
        this.f286991h = f27;
        this.f286992i = f28;
        this.f286993m = f29;
        this.f286994n = f37;
        this.f286995o = clipPathData;
        this.f286996p = children;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i1.o1)) {
            return false;
        }
        i1.o1 o1Var = (i1.o1) obj;
        if (!kotlin.jvm.internal.o.b(this.f286987d, o1Var.f286987d)) {
            return false;
        }
        if (!(this.f286988e == o1Var.f286988e)) {
            return false;
        }
        if (!(this.f286989f == o1Var.f286989f)) {
            return false;
        }
        if (!(this.f286990g == o1Var.f286990g)) {
            return false;
        }
        if (!(this.f286991h == o1Var.f286991h)) {
            return false;
        }
        if (!(this.f286992i == o1Var.f286992i)) {
            return false;
        }
        if (this.f286993m == o1Var.f286993m) {
            return ((this.f286994n > o1Var.f286994n ? 1 : (this.f286994n == o1Var.f286994n ? 0 : -1)) == 0) && kotlin.jvm.internal.o.b(this.f286995o, o1Var.f286995o) && kotlin.jvm.internal.o.b(this.f286996p, o1Var.f286996p);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((this.f286987d.hashCode() * 31) + java.lang.Float.hashCode(this.f286988e)) * 31) + java.lang.Float.hashCode(this.f286989f)) * 31) + java.lang.Float.hashCode(this.f286990g)) * 31) + java.lang.Float.hashCode(this.f286991h)) * 31) + java.lang.Float.hashCode(this.f286992i)) * 31) + java.lang.Float.hashCode(this.f286993m)) * 31) + java.lang.Float.hashCode(this.f286994n)) * 31) + this.f286995o.hashCode()) * 31) + this.f286996p.hashCode();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new i1.n1(this);
    }
}
