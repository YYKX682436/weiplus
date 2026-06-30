package g36;

/* loaded from: classes14.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g36.f f268186d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g36.f fVar) {
        super(1);
        this.f268186d = fVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        if (num != null) {
            this.f268186d.f268192b.g(num.intValue());
        }
        return jz5.f0.f302826a;
    }
}
