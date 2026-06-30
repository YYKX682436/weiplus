package lo0;

/* loaded from: classes14.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f320008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f320009e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.util.Map map, java.util.HashMap hashMap) {
        super(1);
        this.f320008d = map;
        this.f320009e = hashMap;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String itemId = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(itemId, "itemId");
        lo0.k kVar = (lo0.k) this.f320008d.get(itemId);
        if (!(kVar == null)) {
            this.f320009e.put(kVar.f320018a, kVar);
        }
        return jz5.f0.f302826a;
    }
}
