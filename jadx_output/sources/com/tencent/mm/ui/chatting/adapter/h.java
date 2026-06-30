package com.tencent.mm.ui.chatting.adapter;

/* loaded from: classes9.dex */
public final class h implements wf0.u1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.adapter.k f198418d;

    public h(com.tencent.mm.ui.chatting.adapter.k kVar) {
        this.f198418d = kVar;
    }

    @Override // wf0.u1
    public final void h(wf0.r1 r1Var) {
        int i17;
        int i18;
        int i19;
        boolean z17 = false;
        if (r1Var != null && (i17 = r1Var.f445532d) != 3 && (i17 == 2 || i17 == -1 || i17 == 1)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingDataAdapterV3", "updateStatus, notifyInfo: " + r1Var.f445530b);
            android.util.SparseArray sparseArray = ze5.ia.f472007n;
            if (r1Var.f445530b == wf0.s1.UPDATE) {
                java.lang.String str = r1Var.f445529a;
                java.lang.String substring = (str == null || !str.contains(ya.b.ORIGIN)) ? str : str.substring(0, str.indexOf(ya.b.ORIGIN));
                ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
                t21.v2 h17 = t21.d3.h(substring);
                if (h17 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.VideoItemHolder", "update status, filename %s, videoInfo not found", str);
                } else {
                    fk4.k a17 = com.tencent.mm.ui.chatting.gallery.l.f201163a.a(h17.f415016n);
                    com.tencent.mm.ui.chatting.gallery.p pVar = com.tencent.mm.ui.chatting.gallery.p.f201254a;
                    fk4.k kVar = (fk4.k) com.tencent.mm.ui.chatting.gallery.p.f201255b.get(java.lang.Long.valueOf(h17.f415016n));
                    wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                    java.lang.String str2 = h17.S;
                    ((vf0.y1) x1Var).getClass();
                    t21.v2 h18 = t21.d3.h(str2);
                    if (ze5.ia.b() ? (i18 = h17.f415011i) == 104 || i18 == 103 || i18 == 112 || i18 == 120 || i18 == 121 || i18 == 122 || i18 == 199 || a17 != null : (i19 = h17.f415011i) == 112 || i19 == 104 || i19 == 103 || a17 != null) {
                        com.tencent.mm.sdk.platformtools.u3.h(new ze5.ba(h17, h18, a17, kVar));
                        z17 = true;
                    }
                }
            }
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.adapter.f(r1Var, this.f198418d));
        }
        if (z17) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.adapter.g(this.f198418d));
    }
}
