package lf4;

/* loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.m f318444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf4.m f318445e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lf4.b0 f318446f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(lf4.m mVar, lf4.m mVar2, lf4.b0 b0Var) {
        super(0);
        this.f318444d = mVar;
        this.f318445e = mVar2;
        this.f318446f = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        lf4.b0 b0Var = this.f318446f;
        lf4.m mVar = this.f318444d;
        if (mVar != null) {
            b0Var.p(mVar);
        }
        lf4.m mVar2 = this.f318445e;
        if (mVar2 != null) {
            b0Var.f318362o.add(mVar2);
        }
        b0Var.n();
        return jz5.f0.f302826a;
    }
}
