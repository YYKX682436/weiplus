package iu3;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f294987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f294988e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ iu3.e f294989f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kotlin.jvm.internal.e0 e0Var, int i17, iu3.e eVar) {
        super(2);
        this.f294987d = e0Var;
        this.f294988e = i17;
        this.f294989f = eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        java.lang.String source = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.e0 e0Var = this.f294987d;
        if (!(floatValue == e0Var.f310115d)) {
            e0Var.f310115d = floatValue;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putFloat("PARAM_1_FLOAT", 1.0f - (floatValue / this.f294988e));
            this.f294989f.f294992e.w(ju3.c0.F1, bundle);
        }
        return jz5.f0.f302826a;
    }
}
