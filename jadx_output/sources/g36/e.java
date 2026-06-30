package g36;

/* loaded from: classes14.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g36.f f268190d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g36.f fVar) {
        super(1);
        this.f268190d = fVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Float f17 = obj instanceof java.lang.Float ? (java.lang.Float) obj : null;
        if (f17 != null) {
            float floatValue = f17.floatValue();
            f36.a aVar = this.f268190d.f268192b;
            int floatToIntBits = java.lang.Float.floatToIntBits(floatValue);
            aVar.d(floatToIntBits & 255);
            aVar.d((floatToIntBits >> 8) & 255);
            aVar.d((floatToIntBits >> 16) & 255);
            aVar.d((floatToIntBits >> 24) & 255);
        }
        return jz5.f0.f302826a;
    }
}
