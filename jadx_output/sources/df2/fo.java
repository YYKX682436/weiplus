package df2;

/* loaded from: classes15.dex */
public final class fo extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.g10 f230155d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo(bw5.g10 g10Var) {
        super(1);
        this.f230155d = g10Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        so2.j5 it = (so2.j5) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf((it instanceof cm2.m0) && ((cm2.m0) it).f43369w == this.f230155d.f27613d);
    }
}
