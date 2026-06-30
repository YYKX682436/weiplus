package com.tencent.mm.ui.chatting.adapter;

/* loaded from: classes5.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wf0.r1 f198406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.adapter.k f198407e;

    public f(wf0.r1 r1Var, com.tencent.mm.ui.chatting.adapter.k kVar) {
        this.f198406d = r1Var;
        this.f198407e = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String str = this.f198406d.f445529a;
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(str);
        if (h17 != null) {
            long j17 = h17.f415016n;
            if (j17 > 0) {
                pt0.e0 e0Var = pt0.f0.f358209b1;
                com.tencent.mm.storage.f9 n17 = e0Var.n(h17.f415020r, j17);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(n17.z0()) || e0Var.i()) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(n17.getType());
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingDataAdapterV3", "updateStatus, check revoke status msg type " + valueOf + ", status: " + h17.f415011i + ", info svrId: " + h17.f415004c + ", msgSvrId: " + java.lang.Long.valueOf(n17.I0()));
                    if (valueOf != null && 43 == valueOf.intValue()) {
                        return;
                    }
                    if ((valueOf != null && 62 == valueOf.intValue()) || h17.f415011i != 199) {
                        return;
                    }
                    if ((n17.I0() == h17.f415004c) || !t21.d3.s()) {
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingDataAdapterV3", "had uploaded after msg revoke, do revoke again, svrId: " + h17.f415004c);
                    n17.o1(h17.f415004c);
                    n17.setType(43);
                    ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.chatting.adapter.e(this.f198407e, n17));
                }
            }
        }
    }
}
