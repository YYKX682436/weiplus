package vw0;

/* loaded from: classes5.dex */
public final class f0 implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vw0.i0 f440774d;

    public f0(vw0.i0 i0Var) {
        this.f440774d = i0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).intValue();
        sw0.d data = (sw0.d) obj2;
        kotlin.jvm.internal.o.g(data, "data");
        vw0.d0 d0Var = this.f440774d.f440801x;
        if (d0Var != null) {
            d0Var.P5(data);
        }
        return jz5.f0.f302826a;
    }
}
