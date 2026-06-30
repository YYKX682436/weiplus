package ij5;

/* loaded from: classes.dex */
public final class n0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f291787d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f291788e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f291789f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f291790g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f291791h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f291792i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f291793m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f291787d = jz5.h.b(new ij5.h0(this));
        this.f291788e = jz5.h.b(new ij5.m0(this));
        this.f291789f = jz5.h.b(new ij5.l0(this));
        this.f291790g = jz5.h.b(new ij5.j0(this));
        this.f291791h = jz5.h.b(new ij5.k0(this));
        this.f291792i = jz5.h.b(new ij5.i0(this));
        this.f291793m = jz5.h.b(new ij5.e0(this));
    }

    public final int T6() {
        return ((java.lang.Number) ((jz5.n) this.f291791h).getValue()).intValue();
    }

    public final int U6() {
        return ((java.lang.Number) ((jz5.n) this.f291789f).getValue()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6(wi5.n0 r14) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ij5.n0.V6(wi5.n0):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new ij5.g0(this));
    }
}
