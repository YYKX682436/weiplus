package yf2;

/* loaded from: classes3.dex */
public final class a1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.m1 f461655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f461656e;

    public a1(yf2.m1 m1Var, kotlin.jvm.internal.h0 h0Var) {
        this.f461655d = m1Var;
        this.f461656e = h0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r45.hv1 hv1Var = (r45.hv1) obj;
        if (hv1Var != null) {
            yf2.m1 m1Var = this.f461655d;
            com.tencent.mm.plugin.finder.live.widget.nq nqVar = m1Var.f461750o;
            if (nqVar != null) {
                nqVar.e0(hv1Var);
            }
            ((kotlinx.coroutines.flow.h3) ((mm2.g1) m1Var.getStore().business(mm2.g1.class)).f329069g).k(java.lang.Boolean.FALSE);
            kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) this.f461656e.f310123d;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
