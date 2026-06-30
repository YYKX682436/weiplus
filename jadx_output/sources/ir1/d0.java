package ir1;

/* loaded from: classes11.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir1.e0 f293952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f293953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f293954f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(ir1.e0 e0Var, java.util.List list, boolean z17) {
        super(0);
        this.f293952d = e0Var;
        this.f293953e = list;
        this.f293954f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ir1.e0 e0Var = this.f293952d;
        int itemCount = e0Var.getItemCount();
        for (hr1.e eVar : this.f293953e) {
            java.util.HashMap hashMap = e0Var.f293962i;
            if (!hashMap.containsKey(eVar.field_sessionId)) {
                java.lang.String field_sessionId = eVar.field_sessionId;
                kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
                hashMap.put(field_sessionId, eVar);
                e0Var.f293961h.add(eVar);
            }
        }
        if (this.f293954f) {
            e0Var.notifyDataSetChanged();
        } else {
            e0Var.notifyItemRangeInserted(itemCount, e0Var.getItemCount());
        }
        return jz5.f0.f302826a;
    }
}
