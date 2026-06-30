package j0;

/* loaded from: classes14.dex */
public final class c3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.j3 f296231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(j0.j3 j3Var) {
        super(1);
        this.f296231d = j3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        java.util.List it = (java.util.List) obj;
        kotlin.jvm.internal.o.g(it, "it");
        a2.k1 k1Var = this.f296231d.f296382d.f296292e;
        if (k1Var != null) {
            it.add(k1Var);
            z17 = true;
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
