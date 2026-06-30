package g75;

/* loaded from: classes10.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f269375d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f269375d = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kotlin.jvm.internal.h0 h0Var = this.f269375d;
        g75.r rVar = (g75.r) h0Var.f310123d;
        if (rVar != null) {
            rVar.f269395g = null;
        }
        if (rVar != null) {
            rVar.c();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("continuation is cancel ");
        g75.r rVar2 = (g75.r) h0Var.f310123d;
        sb6.append(rVar2 != null ? rVar2.f269394f : null);
        sb6.append(' ');
        g75.r rVar3 = (g75.r) h0Var.f310123d;
        sb6.append(rVar3 != null ? java.lang.Integer.valueOf(rVar3.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Pipeline.Pipeline", sb6.toString());
        return jz5.f0.f302826a;
    }
}
