package yf2;

/* loaded from: classes3.dex */
public final class d2 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.i2 f461679d;

    public d2(yf2.i2 i2Var) {
        this.f461679d = i2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r45.s63 s63Var;
        r45.n73 n73Var = (r45.n73) obj;
        zl2.r4 r4Var = zl2.r4.f473950a;
        yf2.i2 i2Var = this.f461679d;
        if (r4Var.T1((r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) i2Var.business(mm2.g1.class)).f329068f).getValue())) {
            ((kotlinx.coroutines.flow.h3) ((mm2.g1) i2Var.business(mm2.g1.class)).f329076q).k((n73Var == null || (s63Var = (r45.s63) n73Var.getCustom(3)) == null) ? null : s63Var.getString(0));
        }
        return jz5.f0.f302826a;
    }
}
