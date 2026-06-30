package xn2;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f455483d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(xn2.p0 p0Var) {
        super(0);
        this.f455483d = p0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xn2.p0 p0Var = this.f455483d;
        do2.b bVar = p0Var.f455567y;
        if (bVar != null) {
            if (bVar.isShowing()) {
                bVar.dismiss();
            }
            p0Var.f455567y = null;
        }
        return jz5.f0.f302826a;
    }
}
