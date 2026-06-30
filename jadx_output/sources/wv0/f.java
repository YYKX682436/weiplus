package wv0;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f449909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f449910e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(rv0.n1 n1Var, ex0.a0 a0Var) {
        super(1);
        this.f449909d = n1Var;
        this.f449910e = a0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.base.MJID segmentID = (com.tencent.maas.base.MJID) obj;
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        rv0.n1 n1Var = this.f449909d;
        kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new wv0.e(this.f449910e, segmentID, n1Var, null), 3, null);
        return jz5.f0.f302826a;
    }
}
