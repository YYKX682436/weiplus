package ue2;

/* loaded from: classes3.dex */
public final class v implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.c1 f426860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ue2.x f426861e;

    public v(mm2.c1 c1Var, ue2.x xVar) {
        this.f426860d = c1Var;
        this.f426861e = xVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.String str = (java.lang.String) obj;
        mm2.c1 c1Var = this.f426860d;
        if (!c1Var.U7() && c1Var.l7()) {
            c1Var.w7();
            ue2.x xVar = this.f426861e;
            xVar.getClass();
            pm0.v.X(new ue2.u(xVar, str));
        }
        return jz5.f0.f302826a;
    }
}
