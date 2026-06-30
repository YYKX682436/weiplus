package ys2;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ys2.o f465168d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ys2.o oVar) {
        super(1);
        this.f465168d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ys2.o oVar = this.f465168d;
        kk4.c cVar = oVar.f465179s;
        if (cVar != null) {
            kk4.f0 f0Var = (kk4.f0) cVar;
            f0Var.setDataSource(it);
            f0Var.prepareAsync();
            f0Var.setOnPreparedListener(new ys2.i(oVar));
        }
        return jz5.f0.f302826a;
    }
}
