package lr4;

/* loaded from: classes11.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lr4.k f320739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f320740e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f320741f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(lr4.k kVar, java.util.List list, boolean z17) {
        super(0);
        this.f320739d = kVar;
        this.f320740e = list;
        this.f320741f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        lr4.k kVar = this.f320739d;
        int itemCount = kVar.getItemCount();
        for (kr4.g gVar : this.f320740e) {
            java.util.HashMap hashMap = kVar.f320744g;
            if (!hashMap.containsKey(gVar.field_sessionId)) {
                gVar.t0();
                java.lang.String field_sessionId = gVar.field_sessionId;
                kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
                hashMap.put(field_sessionId, gVar);
                kVar.f320743f.add(gVar);
            }
        }
        if (this.f320741f) {
            kVar.f320747m.clear();
            kVar.notifyDataSetChanged();
        } else {
            kVar.notifyItemRangeInserted(itemCount, kVar.getItemCount());
        }
        return jz5.f0.f302826a;
    }
}
