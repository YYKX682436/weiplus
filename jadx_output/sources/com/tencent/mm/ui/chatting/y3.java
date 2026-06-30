package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class y3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f206255d;

    public y3(java.util.List list) {
        this.f206255d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        ot0.q v17;
        java.util.List<com.tencent.mm.storage.f9> list = this.f206255d;
        if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            return;
        }
        for (com.tencent.mm.storage.f9 f9Var : list) {
            if (f9Var.k2() && (v17 = ot0.q.v(f9Var.j())) != null && v17.y(ot0.a.class) != null) {
                com.tencent.mm.message.OnAppBrandAppMessageRetransmitEvent onAppBrandAppMessageRetransmitEvent = new com.tencent.mm.message.OnAppBrandAppMessageRetransmitEvent();
                onAppBrandAppMessageRetransmitEvent.f68985g = v17;
                onAppBrandAppMessageRetransmitEvent.e();
            }
            if (f9Var.t2()) {
                java.util.LinkedList<ot0.s0> linkedList = ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(f9Var.getMsgId(), f9Var.j()).f348581i;
                if (linkedList != null) {
                    for (ot0.s0 s0Var : linkedList) {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(s0Var.f348780w) && k01.o.a(s0Var.f348775r)) {
                            l01.d0.f314761a.n(new com.tencent.mm.ui.chatting.z3(s0Var), s0Var.f348780w, null, ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).Bi(112, 90));
                        }
                    }
                }
            }
        }
    }
}
