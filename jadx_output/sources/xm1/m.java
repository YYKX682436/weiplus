package xm1;

/* loaded from: classes14.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f455181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xm1.n f455182e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(kotlin.jvm.internal.f0 f0Var, xm1.n nVar) {
        super(0);
        this.f455181d = f0Var;
        this.f455182e = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f455181d.f310116d;
        xm1.n nVar = this.f455182e;
        if (i17 != nVar.f()) {
            int i18 = nVar.f455172d;
            if (i18 == 0) {
                nVar.f455172d = 2;
            } else if (i18 == 1) {
                nVar.f455172d = 3;
            }
        }
        return jz5.f0.f302826a;
    }
}
