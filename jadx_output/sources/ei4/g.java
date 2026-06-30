package ei4;

/* loaded from: classes11.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ei4.h f253213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f253214e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ei4.h hVar, java.util.List list) {
        super(0);
        this.f253213d = hVar;
        this.f253214e = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ei4.h hVar = this.f253213d;
        int itemCount = hVar.getItemCount();
        java.util.List<hi4.a> list = this.f253214e;
        for (hi4.a aVar : list) {
            java.util.HashMap hashMap = hVar.f253216f;
            java.lang.String field_sessionId = aVar.field_sessionId;
            kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
            hashMap.put(field_sessionId, aVar);
        }
        hVar.f253215e.addAll(list);
        hVar.notifyItemRangeInserted(itemCount, list.size());
        return jz5.f0.f302826a;
    }
}
