package mi1;

/* loaded from: classes7.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi1.v f326689d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(mi1.v vVar) {
        super(0);
        this.f326689d = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mi1.u0 u0Var = this.f326689d.f326710i;
        if (u0Var != null) {
            u0Var.q();
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("blinkWrapper");
        throw null;
    }
}
