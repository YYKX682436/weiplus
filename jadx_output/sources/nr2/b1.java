package nr2;

/* loaded from: classes2.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr2.i1 f339166d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(nr2.i1 i1Var) {
        super(0);
        this.f339166d = i1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nr2.i1 i1Var = this.f339166d;
        nr2.l1 l1Var = i1Var.f339212c;
        if (l1Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        l1Var.f();
        i1Var.c();
        return jz5.f0.f302826a;
    }
}
