package sc3;

/* loaded from: classes7.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406439d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(sc3.k1 k1Var) {
        super(0);
        this.f406439d = k1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList wi6 = ((com.tencent.mm.plugin.magicbrush.k7) ((com.tencent.mm.plugin.magicbrush.r4) i95.n0.c(com.tencent.mm.plugin.magicbrush.r4.class))).wi(this.f406439d.D, "magicbrush");
        int d17 = kz5.b1.d(kz5.d0.q(wi6, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        for (java.lang.Object obj : wi6) {
            linkedHashMap.put((java.lang.String) obj, obj);
        }
        return linkedHashMap;
    }
}
