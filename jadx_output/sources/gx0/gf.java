package gx0;

/* loaded from: classes5.dex */
public final class gf extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f276471d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.j0 f276472e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.g0 f276473f;

    /* renamed from: g, reason: collision with root package name */
    public wu5.c f276474g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f276475h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f276471d = true;
        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0(com.tencent.maas.model.time.MJTime.InvalidTime);
        this.f276472e = j0Var;
        this.f276473f = j0Var;
        this.f276475h = jz5.h.b(new gx0.ef(activity));
    }

    public final void O6() {
        if (!this.f276471d && this.f276474g == null) {
            this.f276474g = ((ku5.t0) ku5.t0.f312615d).e(new gx0.ff(this), 0L, 16L);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        boolean z17 = this.f276471d;
        jz5.g gVar = this.f276475h;
        if (z17) {
            ((gx0.bf) ((jz5.n) gVar).getValue()).A.observe(getActivity(), new gx0.cf(this));
        } else {
            ((gx0.bf) ((jz5.n) gVar).getValue()).f276255v.observe(getActivity(), new gx0.df(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        super.onStart();
        gx0.fd fdVar = (gx0.fd) ((gx0.bf) ((jz5.n) this.f276475h).getValue()).f276255v.getValue();
        int ordinal = fdVar != null ? fdVar.ordinal() : 0;
        gx0.ed edVar = gx0.fd.f276428d;
        if (ordinal >= 2) {
            O6();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        wu5.c cVar;
        if (!this.f276471d && (cVar = this.f276474g) != null) {
            try {
                cVar.cancel(true);
            } catch (java.lang.Exception unused) {
            }
            this.f276474g = null;
        }
        super.onStop();
    }
}
