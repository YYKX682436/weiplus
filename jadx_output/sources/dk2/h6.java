package dk2;

/* loaded from: classes3.dex */
public final class h6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.k6 f233566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ os5.n f233567e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(dk2.k6 k6Var, os5.n nVar) {
        super(0);
        this.f233566d = k6Var;
        this.f233567e = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dk2.k6 k6Var = this.f233566d;
        java.util.List list = k6Var.f233683a;
        os5.n nVar = this.f233567e;
        if (!list.contains(nVar)) {
            k6Var.f233683a.add(nVar);
        }
        return jz5.f0.f302826a;
    }
}
