package ij5;

/* loaded from: classes.dex */
public final class t extends zm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f291799d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f291800e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f291801f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f291802g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f291803h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f291804i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f291805m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f291806n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f291807o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f291799d = com.tencent.mm.ui.contact.i5.g(1, 2);
        this.f291800e = jz5.h.b(new ij5.i(this));
        this.f291801f = jz5.h.b(new ij5.p(activity));
        this.f291802g = jz5.h.b(new ij5.r(this));
        this.f291803h = jz5.h.b(new ij5.q(this));
        this.f291804i = jz5.h.b(new ij5.h(this));
        this.f291805m = jz5.h.b(new ij5.g(this));
        this.f291806n = jz5.h.b(new ij5.s(this));
        this.f291807o = jz5.h.b(new ij5.j(activity, this));
    }

    @Override // zm3.a
    public ym3.f T6() {
        return (qi5.b0) ((jz5.n) this.f291807o).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        j75.f stateCenter2;
        S6(new ij5.k(this));
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null && (stateCenter2 = P6.getStateCenter()) != null) {
            stateCenter2.L2(getActivity(), new ij5.n(this));
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 == null || (stateCenter = P62.getStateCenter()) == null) {
            return;
        }
        stateCenter.z3(getActivity(), new ij5.o(this));
    }
}
