package hb2;

/* loaded from: classes8.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f280084d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(yz5.l lVar) {
        super(1);
        this.f280084d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.l13 l13Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        hb2.s0.f280090e.getClass();
        java.lang.String str = hb2.s0.f280091f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("upload head img errType ");
        java.lang.String str2 = null;
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
        sb6.append(" errCode ");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
        sb6.append(" errMsg ");
        sb6.append(fVar != null ? fVar.f70617c : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        r45.ri2 ri2Var = new r45.ri2();
        if (fVar != null && (l13Var = (r45.l13) fVar.f70618d) != null) {
            str2 = l13Var.getString(3);
        }
        ri2Var.set(3, str2);
        this.f280084d.invoke(ri2Var);
        return jz5.f0.f302826a;
    }
}
