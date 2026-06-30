package mm2;

/* loaded from: classes3.dex */
public final class a6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f328749d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(so2.j5 j5Var) {
        super(1);
        this.f328749d = j5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        so2.j5 local = (so2.j5) obj;
        kotlin.jvm.internal.o.g(local, "local");
        return java.lang.Boolean.valueOf((local instanceof cm2.m0) && ((cm2.m0) local).f43369w == ((cm2.m0) this.f328749d).f43369w);
    }
}
