package ws2;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.h f449015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ws2.k1 f449016e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ws2.h hVar, ws2.k1 k1Var) {
        super(0);
        this.f449015d = hVar;
        this.f449016e = k1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ws2.h hVar = this.f449015d;
        java.lang.String str = hVar.f449044b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("generator process config:");
        zs2.f fVar = hVar.f449043a;
        sb6.append(fVar);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        gk2.e eVar = this.f449016e.f449071c;
        int i17 = fVar.f475256a;
        ws2.u0 u0Var = ws2.k1.f449066r;
        return new ws2.b(eVar, i17, ((java.lang.Boolean) ((jz5.n) ws2.k1.f449068t).getValue()).booleanValue(), (ws2.d) ((jz5.n) hVar.f449047e).getValue(), (ws2.f) ((jz5.n) hVar.f449046d).getValue());
    }
}
