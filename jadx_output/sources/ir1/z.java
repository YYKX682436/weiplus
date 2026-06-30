package ir1;

/* loaded from: classes11.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.w0 f294074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir1.e0 f294075e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hr1.e f294076f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(l75.w0 w0Var, ir1.e0 e0Var, hr1.e eVar) {
        super(0);
        this.f294074d = w0Var;
        this.f294075e = e0Var;
        this.f294076f = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onConversationStorageChange] eventData.eventId = ");
        l75.w0 w0Var = this.f294074d;
        sb6.append(w0Var.f316974b);
        sb6.append(',');
        com.tencent.mars.xlog.Log.i("BizFans.BizFansConversationAdapter", sb6.toString());
        int i17 = w0Var.f316974b;
        hr1.e eVar = this.f294076f;
        ir1.e0 e0Var = this.f294075e;
        if (i17 == 1 || i17 == 2) {
            ir1.e0.B(e0Var, eVar);
        } else if (i17 == 5) {
            java.util.HashMap hashMap = e0Var.f293962i;
            hr1.e eVar2 = (hr1.e) hashMap.get(eVar.field_sessionId);
            java.util.ArrayList arrayList = e0Var.f293961h;
            int c07 = kz5.n0.c0(arrayList, eVar2);
            eVar.u0();
            if (c07 >= 0 && c07 < arrayList.size()) {
                arrayList.set(c07, eVar);
                java.lang.String field_sessionId = eVar.field_sessionId;
                kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
                hashMap.put(field_sessionId, eVar);
                if (c07 >= 0 && c07 < arrayList.size()) {
                    e0Var.notifyItemChanged(c07);
                }
            }
        } else if (i17 == 6) {
            if (e0Var.f293960g == 1) {
                ((java.util.concurrent.ConcurrentHashMap.KeySetView) e0Var.f293963m).remove(eVar.field_sessionId);
            }
            java.lang.String field_sessionId2 = eVar.field_sessionId;
            kotlin.jvm.internal.o.f(field_sessionId2, "field_sessionId");
            e0Var.E(field_sessionId2);
        } else if (i17 == 7) {
            ir1.e0.B(e0Var, eVar);
        } else if (i17 == 8) {
            java.util.Iterator it = e0Var.f293961h.iterator();
            while (it.hasNext()) {
                hr1.e eVar3 = (hr1.e) it.next();
                eVar3.u0();
                eVar3.field_unReadCount = 0;
                eVar3.field_readStatus = 1;
                java.util.HashMap hashMap2 = e0Var.f293962i;
                java.lang.String field_sessionId3 = eVar3.field_sessionId;
                kotlin.jvm.internal.o.f(field_sessionId3, "field_sessionId");
                hashMap2.put(field_sessionId3, eVar3);
            }
            e0Var.notifyDataSetChanged();
        }
        return jz5.f0.f302826a;
    }
}
