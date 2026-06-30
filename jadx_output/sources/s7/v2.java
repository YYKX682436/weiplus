package s7;

/* loaded from: classes16.dex */
public class v2 implements s7.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f403866a;

    /* renamed from: b, reason: collision with root package name */
    public float f403867b;

    /* renamed from: c, reason: collision with root package name */
    public float f403868c;

    /* renamed from: d, reason: collision with root package name */
    public s7.w2 f403869d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f403870e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f403871f;

    /* renamed from: g, reason: collision with root package name */
    public int f403872g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f403873h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s7.f3 f403874i;

    public v2(s7.f3 f3Var, s7.a1 a1Var) {
        this.f403874i = f3Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f403866a = arrayList;
        this.f403869d = null;
        this.f403870e = false;
        this.f403871f = true;
        this.f403872g = -1;
        if (a1Var == null) {
            return;
        }
        a1Var.h(this);
        if (this.f403873h) {
            this.f403869d.b((s7.w2) arrayList.get(this.f403872g));
            arrayList.set(this.f403872g, this.f403869d);
            this.f403873h = false;
        }
        s7.w2 w2Var = this.f403869d;
        if (w2Var != null) {
            arrayList.add(w2Var);
        }
    }

    @Override // s7.b1
    public void a(float f17, float f18) {
        boolean z17 = this.f403873h;
        java.util.List list = this.f403866a;
        if (z17) {
            this.f403869d.b((s7.w2) list.get(this.f403872g));
            list.set(this.f403872g, this.f403869d);
            this.f403873h = false;
        }
        s7.w2 w2Var = this.f403869d;
        if (w2Var != null) {
            list.add(w2Var);
        }
        this.f403867b = f17;
        this.f403868c = f18;
        this.f403869d = new s7.w2(this.f403874i, f17, f18, 0.0f, 0.0f);
        this.f403872g = list.size();
    }

    @Override // s7.b1
    public void b(float f17, float f18) {
        this.f403869d.a(f17, f18);
        this.f403866a.add(this.f403869d);
        s7.f3 f3Var = this.f403874i;
        s7.w2 w2Var = this.f403869d;
        this.f403869d = new s7.w2(f3Var, f17, f18, f17 - w2Var.f403882a, f18 - w2Var.f403883b);
        this.f403873h = false;
    }

    @Override // s7.b1
    public void c(float f17, float f18, float f19, float f27) {
        this.f403869d.a(f17, f18);
        this.f403866a.add(this.f403869d);
        this.f403869d = new s7.w2(this.f403874i, f19, f27, f19 - f17, f27 - f18);
        this.f403873h = false;
    }

    @Override // s7.b1
    public void close() {
        this.f403866a.add(this.f403869d);
        b(this.f403867b, this.f403868c);
        this.f403873h = true;
    }

    @Override // s7.b1
    public void d(float f17, float f18, float f19, float f27, float f28, float f29) {
        if (this.f403871f || this.f403870e) {
            this.f403869d.a(f17, f18);
            this.f403866a.add(this.f403869d);
            this.f403870e = false;
        }
        this.f403869d = new s7.w2(this.f403874i, f28, f29, f28 - f19, f29 - f27);
        this.f403873h = false;
    }

    @Override // s7.b1
    public void e(float f17, float f18, float f19, boolean z17, boolean z18, float f27, float f28) {
        this.f403870e = true;
        this.f403871f = false;
        s7.w2 w2Var = this.f403869d;
        s7.f3.a(w2Var.f403882a, w2Var.f403883b, f17, f18, f19, z17, z18, f27, f28, this);
        this.f403871f = true;
        this.f403873h = false;
    }
}
