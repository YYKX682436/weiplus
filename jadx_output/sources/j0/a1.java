package j0;

/* loaded from: classes14.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f296209d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(j0.c5 c5Var) {
        super(1);
        this.f296209d = c5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        java.util.List it = (java.util.List) obj;
        kotlin.jvm.internal.o.g(it, "it");
        j0.d5 d5Var = this.f296209d.f296239g;
        if (d5Var != null) {
            it.add(d5Var.f296265a);
            z17 = true;
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
