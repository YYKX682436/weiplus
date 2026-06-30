package rt1;

/* loaded from: classes16.dex */
public final class j0 extends rt1.k0 {

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f399426n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f399427o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f399428p;

    public j0(java.lang.String str, int i17) {
        super(str, i17, null);
        this.f399426n = jz5.h.b(rt1.i0.f399421d);
        this.f399427o = jz5.h.b(rt1.h0.f399416d);
        this.f399428p = jz5.h.b(new rt1.g0(this));
    }

    @Override // rt1.x
    public int h() {
        return ((java.lang.Number) ((jz5.n) this.f399428p).getValue()).intValue();
    }

    @Override // rt1.x
    public java.lang.CharSequence[] i() {
        return (java.lang.CharSequence[]) ((jz5.n) this.f399427o).getValue();
    }

    @Override // rt1.x
    public java.lang.CharSequence j() {
        return (java.lang.CharSequence) ((jz5.n) this.f399426n).getValue();
    }
}
