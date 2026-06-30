package pe3;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f353676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pe3.g0 f353677e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.util.List list, pe3.g0 g0Var) {
        super(1);
        this.f353676d = list;
        this.f353677e = g0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        e0.u0 LazyColumn = (e0.u0) obj;
        kotlin.jvm.internal.o.g(LazyColumn, "$this$LazyColumn");
        pe3.p pVar = pe3.p.f353671d;
        java.util.List list = this.f353676d;
        ((e0.y0) LazyColumn).b(list.size(), new pe3.q(pVar, list), new pe3.r(list), u0.j.c(-1091073711, true, new pe3.s(list, this.f353677e)));
        return jz5.f0.f302826a;
    }
}
