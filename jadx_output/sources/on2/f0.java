package on2;

/* loaded from: classes3.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on2.v0 f346900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.cz1 f346901e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(on2.v0 v0Var, r45.cz1 cz1Var) {
        super(1);
        this.f346900d = v0Var;
        this.f346901e = cz1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        on2.v0 v0Var = this.f346900d;
        pf5.e.launch$default(v0Var, kotlinx.coroutines.q1.f310570c, null, new on2.e0(v0Var, it, this.f346901e, null), 2, null);
        return jz5.f0.f302826a;
    }
}
