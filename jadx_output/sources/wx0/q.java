package wx0;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wx0.c0 f450529d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(wx0.c0 c0Var) {
        super(2);
        this.f450529d = c0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        nx0.w beautyGroupItem = (nx0.w) obj;
        yz5.a completeFunc = (yz5.a) obj2;
        kotlin.jvm.internal.o.g(beautyGroupItem, "beautyGroupItem");
        kotlin.jvm.internal.o.g(completeFunc, "completeFunc");
        wx0.c0 c0Var = this.f450529d;
        kotlinx.coroutines.y0 g17 = c0Var.g();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(g17, kotlinx.coroutines.internal.b0.f310484a, null, new wx0.p(c0Var, completeFunc, beautyGroupItem, null), 2, null);
        return jz5.f0.f302826a;
    }
}
