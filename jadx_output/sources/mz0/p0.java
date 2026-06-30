package mz0;

/* loaded from: classes5.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f333018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f333019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f333020f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(int i17, kotlin.jvm.internal.e0 e0Var, mz0.b2 b2Var) {
        super(2);
        this.f333018d = i17;
        this.f333019e = e0Var;
        this.f333020f = b2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        java.lang.String source = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(source, "source");
        float max = java.lang.Math.max(0.0f, this.f333018d - floatValue);
        kotlin.jvm.internal.e0 e0Var = this.f333019e;
        boolean z17 = true;
        if (!(max == e0Var.f310115d)) {
            e0Var.f310115d = max;
            gz0.i iVar = (gz0.i) this.f333020f.A.getValue();
            iVar.f277672f = (int) max;
            if (iVar.f277674h <= 0 || (iVar.f277669c <= 0 && iVar.f277670d <= 0)) {
                z17 = false;
            }
            if (z17) {
                iVar.b();
            }
        }
        return jz5.f0.f302826a;
    }
}
