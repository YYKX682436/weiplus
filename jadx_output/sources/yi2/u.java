package yi2;

/* loaded from: classes10.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi2.i0 f462590d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(yi2.i0 i0Var) {
        super(0);
        this.f462590d = i0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yi2.i0 i0Var = this.f462590d;
        i0Var.F.b();
        wi2.c cVar = i0Var.F;
        cVar.getClass();
        com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorAutoPlayManager", "refresh");
        pm0.v.V(100L, new wi2.b(cVar));
        return jz5.f0.f302826a;
    }
}
