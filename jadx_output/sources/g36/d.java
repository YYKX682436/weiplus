package g36;

/* loaded from: classes14.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g36.f f268189d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g36.f fVar) {
        super(1);
        this.f268189d = fVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
        if (bool != null) {
            bool.booleanValue();
            this.f268189d.f268192b.g(((java.lang.Boolean) obj).booleanValue() ? 1 : 0);
        }
        return jz5.f0.f302826a;
    }
}
