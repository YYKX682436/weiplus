package h31;

/* loaded from: classes9.dex */
public final class o implements m31.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h31.r f278423a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.SubscribeMsgRequestResult f278424b;

    public o(h31.r rVar, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult) {
        this.f278423a = rVar;
        this.f278424b = subscribeMsgRequestResult;
    }

    @Override // m31.c1
    public void a(int i17, java.util.List resultData) {
        kotlin.jvm.internal.o.g(resultData, "resultData");
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandSubscribeMsgRequestController", "showSubscribeRequestDialog onEvent: %s, result size: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(resultData.size()));
        int i18 = 3;
        if (i17 == 1 || i17 == 2 || i17 == 3) {
            com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult = this.f278424b;
            java.util.ArrayList arrayList = subscribeMsgRequestResult.f71785h;
            h31.r rVar = this.f278423a;
            rVar.getClass();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i19 = 0;
            for (java.lang.Object obj : resultData) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) arrayList.get(i19);
                if (((m31.q0) obj).f323200a) {
                    subscribeMsgTmpItem.f71805h = 1;
                } else {
                    subscribeMsgTmpItem.f71805h = 0;
                }
                arrayList2.add(subscribeMsgTmpItem);
                i19 = i27;
            }
            arrayList.clear();
            arrayList.addAll(arrayList2);
            rVar.f278435i = subscribeMsgRequestResult.f71785h;
            rVar.f278428b = h31.s.b(rVar.f278428b);
            rVar.f278442p = subscribeMsgRequestResult.f71792r;
            com.tencent.mm.msgsubscription.a aVar = com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData.f71773g;
            java.util.List V0 = kz5.n0.V0(resultData);
            m31.p1 p1Var = rVar.f278438l;
            rVar.f278443q = aVar.a(i17, V0, p1Var != null ? p1Var.A.isChecked() : false);
            h31.s sVar = h31.s.f278446a;
            rVar.c();
            boolean z17 = subscribeMsgRequestResult.f71786i;
            j31.b bVar = rVar.f278445s;
            if (z17) {
                bVar.f297368f = 2;
            } else {
                m31.p1 p1Var2 = rVar.f278438l;
                bVar.f297368f = (p1Var2 == null || !p1Var2.A.isChecked()) ? 0 : 1;
            }
            if (i17 == 1) {
                i18 = 2;
            } else if (i17 != 2) {
                i18 = i17 != 3 ? 0 : 4;
            }
            j31.e.f297392a.c(i18, bVar);
        }
    }

    @Override // m31.c1
    public void b(m31.b1 b1Var, boolean z17, m31.q0 item, boolean z18) {
        kotlin.jvm.internal.o.g(b1Var, "switch");
        kotlin.jvm.internal.o.g(item, "item");
    }
}
