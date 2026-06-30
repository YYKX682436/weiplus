package ls0;

/* loaded from: classes10.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.r0 f320960d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ls0.r0 r0Var) {
        super(0);
        this.f320960d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ls0.r0 r0Var = this.f320960d;
        fs0.g gVar = r0Var.B;
        if (gVar != null) {
            gVar.e();
        }
        com.tencent.mm.sdk.platformtools.u3.i(new ls0.w(r0Var), 1000L);
        return jz5.f0.f302826a;
    }
}
