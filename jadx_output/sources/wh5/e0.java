package wh5;

/* loaded from: classes12.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wh5.g0 f446050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mf3.k f446051e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(wh5.g0 g0Var, mf3.k kVar) {
        super(1);
        this.f446050d = g0Var;
        this.f446051e = kVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        wh5.g0 g0Var = this.f446050d;
        mf3.k kVar = this.f446051e;
        vf3.e eVar = vf3.e.f436380g;
        vf3.i.Z6(g0Var, kVar, eVar, new vf3.f(eVar, null, 0, floatValue, 6, null), null, null, 12, null);
        return jz5.f0.f302826a;
    }
}
