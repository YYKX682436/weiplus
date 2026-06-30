package lr4;

/* loaded from: classes11.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.w0 f320728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lr4.k f320729e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kr4.g f320730f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l75.w0 w0Var, lr4.k kVar, kr4.g gVar) {
        super(0);
        this.f320728d = w0Var;
        this.f320729e = kVar;
        this.f320730f = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onConversationStorageChange] eventData.eventId = ");
        l75.w0 w0Var = this.f320728d;
        sb6.append(w0Var.f316974b);
        sb6.append(',');
        com.tencent.mars.xlog.Log.i("W1wPersonalMsg.W1wPersonalMsgConvAdapter", sb6.toString());
        int i17 = w0Var.f316974b;
        lr4.k kVar = this.f320729e;
        if (i17 == 1 || i17 == 2) {
            java.lang.Object obj = w0Var.f316976d;
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.w1wpersonalmsg.storage.W1wConversation");
            lr4.k.B(kVar, (kr4.g) obj);
        } else if (i17 == 5) {
            java.lang.Object obj2 = w0Var.f316976d;
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.w1wpersonalmsg.storage.W1wConversation");
            kr4.g gVar = (kr4.g) obj2;
            java.util.HashMap hashMap = kVar.f320744g;
            kr4.g gVar2 = (kr4.g) hashMap.get(gVar.field_sessionId);
            java.util.ArrayList arrayList = kVar.f320743f;
            int c07 = kz5.n0.c0(arrayList, gVar2);
            gVar.t0();
            if (c07 >= 0 && c07 < arrayList.size()) {
                arrayList.set(c07, gVar);
                java.lang.String field_sessionId = gVar.field_sessionId;
                kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
                hashMap.put(field_sessionId, gVar);
                if (c07 >= 0 && c07 < arrayList.size()) {
                    kVar.notifyItemChanged(c07);
                }
            }
        } else if (i17 == 6) {
            java.lang.Object obj3 = w0Var.f316976d;
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.plugin.w1wpersonalmsg.storage.W1wConversation");
            kr4.g gVar3 = (kr4.g) obj3;
            java.util.HashMap hashMap2 = kVar.f320744g;
            kr4.g gVar4 = (kr4.g) hashMap2.get(gVar3.field_sessionId);
            java.util.ArrayList arrayList2 = kVar.f320743f;
            int c08 = kz5.n0.c0(arrayList2, gVar4);
            if (c08 >= 0 && c08 < arrayList2.size()) {
                arrayList2.remove(c08);
                hashMap2.remove(gVar3.field_sessionId);
                kVar.notifyItemRemoved(c08);
            }
            androidx.fragment.app.Fragment fragment = kVar.f320742e;
            kotlin.jvm.internal.o.e(fragment, "null cannot be cast to non-null type com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvFragment");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            kr4.g gVar5 = this.f320730f;
            sb7.append(gVar5.field_sessionId);
            sb7.append(":message_window");
            ((com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvFragment) fragment).K0(vu4.d.f440294g, mr4.a.a(sb7.toString()), mr4.a.b(), gVar5.field_sessionId);
        } else if (i17 == 7) {
            java.lang.Object obj4 = w0Var.f316976d;
            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type com.tencent.mm.plugin.w1wpersonalmsg.storage.W1wConversation");
            lr4.k.B(kVar, (kr4.g) obj4);
        } else if (i17 == 8) {
            java.util.Iterator it = kVar.f320743f.iterator();
            while (it.hasNext()) {
                kr4.g gVar6 = (kr4.g) it.next();
                gVar6.t0();
                gVar6.field_unReadCount = 0;
                gVar6.field_readStatus = 1;
                java.util.HashMap hashMap3 = kVar.f320744g;
                java.lang.String field_sessionId2 = gVar6.field_sessionId;
                kotlin.jvm.internal.o.f(field_sessionId2, "field_sessionId");
                hashMap3.put(field_sessionId2, gVar6);
            }
            kVar.notifyDataSetChanged();
        }
        return jz5.f0.f302826a;
    }
}
