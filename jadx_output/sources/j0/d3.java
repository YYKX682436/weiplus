package j0;

/* loaded from: classes14.dex */
public final class d3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a2.d f296260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j0.j3 f296261e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(a2.d dVar, j0.j3 j3Var) {
        super(1);
        this.f296260d = dVar;
        this.f296261e = j3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        y1.p0 semantics = (y1.p0) obj;
        kotlin.jvm.internal.o.g(semantics, "$this$semantics");
        f06.v[] vVarArr = y1.m0.f458770a;
        a2.d value = this.f296260d;
        kotlin.jvm.internal.o.g(value, "value");
        y1.l lVar = (y1.l) semantics;
        lVar.g(y1.i0.f458736r, kz5.b0.c(value));
        lVar.g(y1.k.f458749a, new y1.a(null, new j0.c3(this.f296261e)));
        return jz5.f0.f302826a;
    }
}
