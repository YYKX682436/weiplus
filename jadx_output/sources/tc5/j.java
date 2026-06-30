package tc5;

/* loaded from: classes10.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.m implements yz5.l {
    public j(java.lang.Object obj) {
        super(1, obj, com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI.class, "buildToolbarPayload", "buildToolbarPayload(Lcom/tencent/mm/ui/chatting/history/operation/MsgHistoryGalleryOperation;)Lcom/tencent/mm/ui/chatting/history/operation/MsgHistoryGalleryOperationPayloads;", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ad5.l0 p07 = (ad5.l0) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI = (com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) this.receiver;
        int i17 = com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI.f201697x1;
        wc5.w wVar = (wc5.w) ((jz5.n) msgHistoryGalleryUI.W).getValue();
        wVar.getClass();
        ad5.t0 t0Var = new ad5.t0(null, 1, null);
        ad5.m0 m0Var = ad5.m0.f3285a;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = wVar.f444647d;
        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type kotlin.Any");
        java.util.Map map = t0Var.f3314a;
        map.put(m0Var, appCompatActivity);
        ad5.o0 o0Var = ad5.o0.f3290a;
        com.tencent.mm.sdk.coroutines.LifecycleScope k76 = ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) wVar.T6()).k7();
        kotlin.jvm.internal.o.e(k76, "null cannot be cast to non-null type kotlin.Any");
        map.put(o0Var, k76);
        ad5.q0 q0Var = ad5.q0.f3300a;
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(appCompatActivity).a(wc5.k1.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        java.util.List U6 = ((wc5.k1) a17).U6();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(U6, 10));
        java.util.Iterator it = U6.iterator();
        while (it.hasNext()) {
            arrayList.add(((uc5.d) it.next()).p());
        }
        map.put(q0Var, arrayList);
        map.put(ad5.n0.f3289a, new wc5.r(wVar));
        map.put(ad5.s0.f3307a, new wc5.s(wVar));
        map.put(ad5.r0.f3303a, ad5.p0.f3292e);
        return t0Var;
    }
}
