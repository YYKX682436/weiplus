package dr4;

/* loaded from: classes14.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.h f242592d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(dr4.h hVar) {
        super(1);
        this.f242592d = hVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        is0.c cVar = (is0.c) obj;
        if (cVar != null) {
            dr4.h hVar = this.f242592d;
            dr4.r1 r1Var = hVar.f242686l;
            if (r1Var != null) {
                r1Var.F(!cVar.f294396f);
            }
            hVar.d(new dr4.m(hVar, cVar));
            hVar.i(cVar);
        }
        return jz5.f0.f302826a;
    }
}
