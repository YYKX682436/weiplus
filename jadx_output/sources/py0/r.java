package py0;

/* loaded from: classes5.dex */
public final class r implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ py0.y f359010d;

    public r(py0.y yVar) {
        this.f359010d = yVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        py0.y yVar = this.f359010d;
        py0.f0 P6 = yVar.P6();
        java.lang.String string = yVar.getResources().getString(com.tencent.mm.R.string.gvv, new java.lang.Integer(a06.d.b(floatValue * 100)));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        P6.c(string);
        return jz5.f0.f302826a;
    }
}
