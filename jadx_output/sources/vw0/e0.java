package vw0;

/* loaded from: classes5.dex */
public final class e0 implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vw0.i0 f440772d;

    public e0(vw0.i0 i0Var) {
        this.f440772d = i0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        vw0.d0 d0Var;
        ((java.lang.Number) obj).intValue();
        sw0.d data = (sw0.d) obj2;
        kotlin.jvm.internal.o.g(data, "data");
        if (!data.f413424c && (d0Var = this.f440772d.f440801x) != null) {
            d0Var.s(data);
        }
        return jz5.f0.f302826a;
    }
}
