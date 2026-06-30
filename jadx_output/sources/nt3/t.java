package nt3;

/* loaded from: classes10.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt3.a0 f339809d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(nt3.a0 a0Var) {
        super(4);
        this.f339809d = a0Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        long longValue = ((java.lang.Number) obj2).longValue();
        ((java.lang.Boolean) obj4).booleanValue();
        kotlin.jvm.internal.o.g((android.media.MediaCodec.BufferInfo) obj3, "<anonymous parameter 2>");
        nt3.a0 a0Var = this.f339809d;
        int i17 = a0Var.H + 1;
        a0Var.H = i17;
        long j17 = a0Var.f339724o;
        if (j17 >= 0) {
            longValue -= j17 * 1000;
        }
        if (!a0Var.f339720k) {
            ls0.b1 b1Var = a0Var.f339730u;
            if (i17 == 1) {
                b1Var.f((-1) * java.lang.Math.round(((float) 1000) / a0Var.f339719j) * 1000);
            }
            b1Var.f(longValue);
        }
        return jz5.f0.f302826a;
    }
}
