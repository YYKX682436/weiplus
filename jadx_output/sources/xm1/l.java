package xm1;

/* loaded from: classes14.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f455179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xm1.n f455180e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(kotlin.jvm.internal.f0 f0Var, xm1.n nVar) {
        super(0);
        this.f455179d = f0Var;
        this.f455180e = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f455179d.f310116d;
        xm1.n nVar = this.f455180e;
        if (i17 != nVar.f()) {
            int i18 = nVar.f455172d;
            if (i18 == 0) {
                nVar.f455172d = 1;
            } else if (i18 == 2) {
                nVar.f455172d = 3;
            }
        }
        return jz5.f0.f302826a;
    }
}
