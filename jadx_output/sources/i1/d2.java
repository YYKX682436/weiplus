package i1;

/* loaded from: classes14.dex */
public final class d2 extends i1.q1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f286865d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f286866e;

    /* renamed from: f, reason: collision with root package name */
    public final int f286867f;

    /* renamed from: g, reason: collision with root package name */
    public final e1.r f286868g;

    /* renamed from: h, reason: collision with root package name */
    public final float f286869h;

    /* renamed from: i, reason: collision with root package name */
    public final e1.r f286870i;

    /* renamed from: m, reason: collision with root package name */
    public final float f286871m;

    /* renamed from: n, reason: collision with root package name */
    public final float f286872n;

    /* renamed from: o, reason: collision with root package name */
    public final int f286873o;

    /* renamed from: p, reason: collision with root package name */
    public final int f286874p;

    /* renamed from: q, reason: collision with root package name */
    public final float f286875q;

    /* renamed from: r, reason: collision with root package name */
    public final float f286876r;

    /* renamed from: s, reason: collision with root package name */
    public final float f286877s;

    /* renamed from: t, reason: collision with root package name */
    public final float f286878t;

    public d2(java.lang.String str, java.util.List list, int i17, e1.r rVar, float f17, e1.r rVar2, float f18, float f19, int i18, int i19, float f27, float f28, float f29, float f37, kotlin.jvm.internal.i iVar) {
        super(null);
        this.f286865d = str;
        this.f286866e = list;
        this.f286867f = i17;
        this.f286868g = rVar;
        this.f286869h = f17;
        this.f286870i = rVar2;
        this.f286871m = f18;
        this.f286872n = f19;
        this.f286873o = i18;
        this.f286874p = i19;
        this.f286875q = f27;
        this.f286876r = f28;
        this.f286877s = f29;
        this.f286878t = f37;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.o.b(kotlin.jvm.internal.i0.a(i1.d2.class), kotlin.jvm.internal.i0.a(obj.getClass()))) {
            return false;
        }
        i1.d2 d2Var = (i1.d2) obj;
        if (!kotlin.jvm.internal.o.b(this.f286865d, d2Var.f286865d) || !kotlin.jvm.internal.o.b(this.f286868g, d2Var.f286868g)) {
            return false;
        }
        if (!(this.f286869h == d2Var.f286869h) || !kotlin.jvm.internal.o.b(this.f286870i, d2Var.f286870i)) {
            return false;
        }
        if (!(this.f286871m == d2Var.f286871m)) {
            return false;
        }
        if (!(this.f286872n == d2Var.f286872n)) {
            return false;
        }
        if (!(this.f286873o == d2Var.f286873o)) {
            return false;
        }
        if (!(this.f286874p == d2Var.f286874p)) {
            return false;
        }
        if (!(this.f286875q == d2Var.f286875q)) {
            return false;
        }
        if (!(this.f286876r == d2Var.f286876r)) {
            return false;
        }
        if (!(this.f286877s == d2Var.f286877s)) {
            return false;
        }
        if (this.f286878t == d2Var.f286878t) {
            return (this.f286867f == d2Var.f286867f) && kotlin.jvm.internal.o.b(this.f286866e, d2Var.f286866e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f286865d.hashCode() * 31) + this.f286866e.hashCode()) * 31;
        e1.r rVar = this.f286868g;
        int hashCode2 = (((hashCode + (rVar != null ? rVar.hashCode() : 0)) * 31) + java.lang.Float.hashCode(this.f286869h)) * 31;
        e1.r rVar2 = this.f286870i;
        return ((((((((((((((((((hashCode2 + (rVar2 != null ? rVar2.hashCode() : 0)) * 31) + java.lang.Float.hashCode(this.f286871m)) * 31) + java.lang.Float.hashCode(this.f286872n)) * 31) + java.lang.Integer.hashCode(this.f286873o)) * 31) + java.lang.Integer.hashCode(this.f286874p)) * 31) + java.lang.Float.hashCode(this.f286875q)) * 31) + java.lang.Float.hashCode(this.f286876r)) * 31) + java.lang.Float.hashCode(this.f286877s)) * 31) + java.lang.Float.hashCode(this.f286878t)) * 31) + java.lang.Integer.hashCode(this.f286867f);
    }
}
