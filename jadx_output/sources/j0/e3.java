package j0;

/* loaded from: classes14.dex */
public final class e3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.j3 f296271d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(j0.j3 j3Var) {
        super(1);
        this.f296271d = j3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g1.i drawBehind = (g1.i) obj;
        kotlin.jvm.internal.o.g(drawBehind, "$this$drawBehind");
        a2.k1 k1Var = this.f296271d.f296382d.f296292e;
        if (k1Var != null) {
            e1.u canvas = ((g1.b) drawBehind.p()).a();
            kotlin.jvm.internal.o.g(canvas, "canvas");
            a2.l1.f772a.a(canvas, k1Var);
        }
        return jz5.f0.f302826a;
    }
}
