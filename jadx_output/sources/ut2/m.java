package ut2;

/* loaded from: classes3.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.p f430990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.hw0 f430991e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ut2.p pVar, r45.hw0 hw0Var) {
        super(0);
        this.f430990d = pVar;
        this.f430991e = hw0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ut2.p pVar = this.f430990d;
        pVar.f431028f.notifyDataSetChanged();
        pm0.v.V(1000L, new ut2.l(pVar, this.f430991e));
        return jz5.f0.f302826a;
    }
}
