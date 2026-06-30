package g36;

/* loaded from: classes14.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g36.f f268187d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g36.f fVar) {
        super(1);
        this.f268187d = fVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Long l17 = obj instanceof java.lang.Long ? (java.lang.Long) obj : null;
        if (l17 != null) {
            this.f268187d.f268192b.h(l17.longValue());
        }
        return jz5.f0.f302826a;
    }
}
