package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class wf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f200172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.rf f200173e;

    public wf(com.tencent.mm.ui.chatting.component.rf rfVar, int i17) {
        this.f200173e = rfVar;
        this.f200172d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.component.rf rfVar = this.f200173e;
        rfVar.f199832h = 2;
        com.tencent.mm.booter.g3 g3Var = com.tencent.mm.booter.h3.f63379q.f63384e;
        if (g3Var != null) {
            g3Var.f63372i = 2;
        }
        sb5.t0 t0Var = (sb5.t0) rfVar.f198580d.f460708c.a(sb5.t0.class);
        rfVar.f198580d.x();
        t0Var.getClass();
        sc5.a.f406561a.a(rfVar.f198580d.x(), null, ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().S6(rfVar.f198580d.x(), rfVar.f199831g - 1));
        com.tencent.mm.ui.chatting.component.rf.n0(rfVar, rfVar.A);
        if (com.tencent.mm.storage.z3.B3(rfVar.f198580d.x())) {
            com.tencent.mm.ui.chatting.component.s2 s2Var = (com.tencent.mm.ui.chatting.component.s2) ((sb5.o) rfVar.f198580d.f460708c.a(sb5.o.class));
            if (s2Var.n0()) {
                s2Var.m0(10, 0L, 0, null, 0, 0, 0L, 0, null, null, null);
            }
        }
        try {
            if (((com.tencent.mm.ui.chatting.component.h0) ((sb5.g) rfVar.f198580d.f460708c.a(sb5.g.class))).n0()) {
                com.tencent.wechat.aff.brand_service.a aVar = com.tencent.wechat.aff.brand_service.a.f216045b;
                com.tencent.wechat.mm.brand_service.y yVar = new com.tencent.wechat.mm.brand_service.y();
                com.tencent.wechat.mm.brand_service.x xVar = new com.tencent.wechat.mm.brand_service.x();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                xVar.f219214f = java.lang.System.currentTimeMillis();
                xVar.f219215g = com.tencent.wechat.mm.brand_service.w.Click;
                xVar.f219212d = aVar.b();
                xVar.f219216h = "102_1";
                xVar.f219217i = "elevator";
                cl0.g gVar = new cl0.g();
                gVar.o("new_noti_count", this.f200172d);
                xVar.f219222q = gVar.toString();
                yVar.f219254d = xVar;
                aVar.f(yVar);
            }
        } catch (cl0.f e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HistoryMsgTongueComponent", "json error: %s", e17);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/HistoryMsgTongueComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
