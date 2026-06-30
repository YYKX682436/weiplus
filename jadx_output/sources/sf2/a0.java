package sf2;

/* loaded from: classes3.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.p f407024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.u82 f407025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f407026f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(dk2.p pVar, r45.u82 u82Var, yz5.l lVar) {
        super(0);
        this.f407024d = pVar;
        this.f407025e = u82Var;
        this.f407026f = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dk2.p pVar = this.f407024d;
        java.lang.String str = pVar.f233879h;
        r45.u82 u82Var = this.f407025e;
        pVar.n(str, u82Var);
        java.util.LinkedList list = u82Var.getList(1);
        this.f407026f.invoke(java.lang.Integer.valueOf(list != null ? list.size() : 0));
        return jz5.f0.f302826a;
    }
}
