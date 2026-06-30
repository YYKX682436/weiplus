package qn2;

/* loaded from: classes3.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.v0 f365160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.cz1 f365161e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(qn2.v0 v0Var, r45.cz1 cz1Var) {
        super(1);
        this.f365160d = v0Var;
        this.f365161e = cz1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        qn2.v0 v0Var = this.f365160d;
        com.tencent.mm.plugin.finder.live.util.y.e(v0Var.f365176a, kotlinx.coroutines.q1.f310570c, null, new qn2.t0(v0Var, it, this.f365161e, null), 2, null);
        return jz5.f0.f302826a;
    }
}
