package g36;

/* loaded from: classes14.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g36.f f268188d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g36.f fVar) {
        super(1);
        this.f268188d = fVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Double d17 = obj instanceof java.lang.Double ? (java.lang.Double) obj : null;
        if (d17 != null) {
            this.f268188d.f268192b.f(java.lang.Double.doubleToLongBits(d17.doubleValue()));
        }
        return jz5.f0.f302826a;
    }
}
