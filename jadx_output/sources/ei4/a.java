package ei4;

/* loaded from: classes11.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.w0 f253201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ei4.h f253202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f253203f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l75.w0 w0Var, ei4.h hVar, kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f253201d = w0Var;
        this.f253202e = hVar;
        this.f253203f = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onConversationStorageChange] eventData.eventId = ");
        l75.w0 w0Var = this.f253201d;
        sb6.append(w0Var.f316974b);
        sb6.append(',');
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusConversationAdapter", sb6.toString());
        int i17 = w0Var.f316974b;
        kotlin.jvm.internal.h0 h0Var = this.f253203f;
        ei4.h hVar = this.f253202e;
        if (i17 == 1 || i17 == 2) {
            ei4.h.B(hVar, (hi4.a) h0Var.f310123d);
        } else if (i17 == 5) {
            hi4.a aVar = (hi4.a) h0Var.f310123d;
            java.util.HashMap hashMap = hVar.f253216f;
            hi4.a aVar2 = (hi4.a) hashMap.get(aVar.field_sessionId);
            java.util.LinkedList linkedList = hVar.f253215e;
            int c07 = kz5.n0.c0(linkedList, aVar2);
            aVar.t0();
            if (c07 >= 0 && c07 < linkedList.size()) {
                linkedList.set(c07, aVar);
                java.lang.String field_sessionId = aVar.field_sessionId;
                kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
                hashMap.put(field_sessionId, aVar);
                if (c07 >= 0 && c07 < linkedList.size()) {
                    hVar.notifyItemChanged(c07);
                }
            }
        } else if (i17 == 6) {
            hi4.a aVar3 = (hi4.a) h0Var.f310123d;
            java.util.HashMap hashMap2 = hVar.f253216f;
            hi4.a aVar4 = (hi4.a) hashMap2.get(aVar3.field_sessionId);
            java.util.LinkedList linkedList2 = hVar.f253215e;
            int c08 = kz5.n0.c0(linkedList2, aVar4);
            if (c08 >= 0 && c08 < linkedList2.size()) {
                linkedList2.remove(c08);
                hashMap2.remove(aVar3.field_sessionId);
                hVar.notifyItemRemoved(c08);
            }
        } else if (i17 == 7) {
            ei4.h.B(hVar, (hi4.a) h0Var.f310123d);
        }
        return jz5.f0.f302826a;
    }
}
