package rv0;

/* loaded from: classes5.dex */
public final class l3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400101d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(rv0.n1 n1Var) {
        super(1);
        this.f400101d = n1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.model.time.MJTime time = (com.tencent.maas.model.time.MJTime) obj;
        kotlin.jvm.internal.o.g(time, "time");
        this.f400101d.p7().p7(new ou0.g(2L, time), true, 2L);
        return jz5.f0.f302826a;
    }
}
