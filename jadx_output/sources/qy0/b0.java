package qy0;

/* loaded from: classes5.dex */
public final class b0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qy0.d0 f367565d;

    public b0(qy0.d0 d0Var) {
        this.f367565d = d0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        qy0.d0 d0Var = this.f367565d;
        py0.f0 P6 = d0Var.P6();
        java.lang.String string = d0Var.getResources().getString(com.tencent.mm.R.string.gvx, new java.lang.Integer(a06.d.b(floatValue * 100)));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        P6.c(string);
        return jz5.f0.f302826a;
    }
}
