package tn0;

/* loaded from: classes3.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.v0 f420652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tn0.j1 f420653e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(go0.v0 v0Var, tn0.j1 j1Var) {
        super(3);
        this.f420652d = v0Var;
        this.f420653e = j1Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        int intValue3 = ((java.lang.Number) obj3).intValue();
        rs0.h hVar = this.f420652d.f273885l;
        android.opengl.EGLContext eGLContext = hVar != null ? hVar.f399294c : null;
        if (eGLContext != null) {
            tn0.w0 w0Var = this.f420653e.f420698a;
            w0Var.s0(eGLContext, intValue, intValue2, intValue3, 0L, w0Var.f420758e);
        }
        return jz5.f0.f302826a;
    }
}
