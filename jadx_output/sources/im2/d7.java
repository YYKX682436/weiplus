package im2;

/* loaded from: classes2.dex */
public final class d7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.f7 f292300d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(im2.f7 f7Var) {
        super(0);
        this.f292300d = f7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object r17 = ((lb2.j) ((jz5.n) ae2.b2.M).getValue()).r();
        if (!(((java.lang.Number) r17).intValue() != 0)) {
            r17 = null;
        }
        java.lang.Integer num = (java.lang.Integer) r17;
        im2.f7 f7Var = this.f292300d;
        f7Var.f292332h = num != null ? num.intValue() : f7Var.f292332h;
        return jz5.f0.f302826a;
    }
}
