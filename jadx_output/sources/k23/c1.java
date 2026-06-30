package k23;

/* loaded from: classes12.dex */
public final class c1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final k23.b3 f303538d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f303539e;

    /* renamed from: f, reason: collision with root package name */
    public final k23.t2 f303540f;

    /* renamed from: g, reason: collision with root package name */
    public k23.v0 f303541g;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f303537i = {kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(k23.c1.class, "isEnable", "isEnable()Z", 0))};

    /* renamed from: h, reason: collision with root package name */
    public static final k23.x0 f303536h = new k23.x0(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f303538d = new k23.b3();
        this.f303539e = jz5.h.b(new k23.z0(this));
        this.f303540f = new k23.t2(new k23.y0(this));
    }

    public static final void T6(k23.c1 c1Var, java.lang.String str, boolean z17) {
        c1Var.getClass();
        vu4.a aVar = z17 ? vu4.a.F : vu4.a.f440246p;
        z50.d dVar = z50.e.f470163a;
        vu4.b bVar = vu4.b.C;
        android.app.Activity context = c1Var.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(z13.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        dVar.b(aVar, bVar, ((z13.f) a17).a7(), str);
        if (z17) {
            k23.v0 v0Var = c1Var.f303541g;
            if (v0Var != null) {
                v0Var.w(10, "", str);
                return;
            }
            return;
        }
        k23.v0 v0Var2 = c1Var.f303541g;
        if (v0Var2 != null) {
            v0Var2.w(9, "", str);
        }
    }

    public final boolean U6() {
        f06.v property = f303537i[0];
        k23.t2 t2Var = this.f303540f;
        t2Var.getClass();
        kotlin.jvm.internal.o.g(property, "property");
        java.lang.Object obj = t2Var.f303697b.get();
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return ((java.lang.Boolean) ((jz5.g) obj).getValue()).booleanValue();
    }

    public final boolean V6() {
        return U6() && ((java.lang.Boolean) ((jz5.n) this.f303538d.f303529b).getValue()).booleanValue();
    }

    public final boolean W6() {
        return ((java.lang.Boolean) ((jz5.n) this.f303539e).getValue()).booleanValue();
    }
}
