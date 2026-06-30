package hi4;

/* loaded from: classes11.dex */
public final class m extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: f, reason: collision with root package name */
    public static final hi4.k f281555f = new hi4.k(null);

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f281556g = "";

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f281557d;

    /* renamed from: e, reason: collision with root package name */
    public int f281558e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f281557d = jz5.h.b(new hi4.l(this));
    }

    public static void O6(hi4.m mVar, int i17, int i18, int i19, int i27, int i28, java.lang.Object obj) {
        int j17 = (i28 & 2) != 0 ? ai4.m0.f5173a.j() : i18;
        int D0 = (i28 & 4) != 0 ? ni4.x.f337776d.h().D0() : i19;
        int y07 = (i28 & 8) != 0 ? li4.b.y0(ni4.x.f337776d.k(), 0, 1, null) : i27;
        mVar.getClass();
        qj4.s.o(qj4.s.f363958a, i17, null, f281556g, 0, null, 0, j17, D0, y07, null, null, null, null, null, 15930, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        int j17 = ai4.m0.f5173a.j();
        ni4.x xVar = ni4.x.f337776d;
        int D0 = xVar.h().D0();
        int y07 = li4.b.y0(xVar.k(), 0, 1, null);
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(hi4.j.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        qj4.s.o(qj4.s.f363958a, 1L, "0", f281556g, ((java.lang.Number) ((jz5.n) this.f281557d).getValue()).intValue(), null, ((java.lang.Number) ((jz5.n) ((hi4.j) a17).f281553f).getValue()).intValue(), j17, D0, y07, null, null, null, null, null, 15888, null);
    }
}
