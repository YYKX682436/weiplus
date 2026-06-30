package z;

/* loaded from: classes14.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.l2 f468669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f468670e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(z.l2 l2Var, float f17) {
        super(1);
        this.f468669d = l2Var;
        this.f468670e = f17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        z.l2 l2Var = this.f468669d;
        if (!l2Var.e()) {
            l2Var.f(longValue / 1, this.f468670e);
        }
        return jz5.f0.f302826a;
    }
}
