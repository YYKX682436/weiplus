package mz0;

/* loaded from: classes3.dex */
public final class m1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f333001d;

    public m1(mz0.b2 b2Var) {
        this.f333001d = b2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        mz0.b2 b2Var = this.f333001d;
        py0.f0 f76 = b2Var.f7();
        java.lang.String string = b2Var.getResources().getString(com.tencent.mm.R.string.gvv, new java.lang.Integer(a06.d.b(floatValue * 100)));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        f76.c(string);
        return jz5.f0.f302826a;
    }
}
