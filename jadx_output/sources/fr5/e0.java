package fr5;

/* loaded from: classes15.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr5.f0 f265918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ er5.g f265919e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(fr5.f0 f0Var, er5.g gVar) {
        super(1);
        this.f265918d = f0Var;
        this.f265919e = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long j17 = ((zq5.l) obj).f475080a;
        fr5.f0 f0Var = this.f265918d;
        kotlinx.coroutines.l.d(f0Var.f265943h, null, null, new fr5.d0(f0Var, this.f265919e, j17, null), 3, null);
        return jz5.f0.f302826a;
    }
}
