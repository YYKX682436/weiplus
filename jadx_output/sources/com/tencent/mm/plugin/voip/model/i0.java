package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f176642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f176643e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f176644f;

    public i0(long j17, long j18, int i17) {
        this.f176642d = j17;
        this.f176643e = j18;
        this.f176644f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("markCgiCalled() executed with: roomId = ");
        long j17 = this.f176642d;
        sb6.append(j17);
        sb6.append(", roomKey = ");
        long j18 = this.f176643e;
        sb6.append(j18);
        sb6.append(", inviteId = ");
        int i17 = this.f176644f;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", sb6.toString());
        if (j17 == 0 && i17 > 0) {
            com.tencent.mm.plugin.voip.model.j0 j0Var = com.tencent.mm.plugin.voip.model.j0.f176682a;
            dm.sb i18 = j0Var.i(dm.sb.U0(i17));
            if (i18 != null) {
                if (i18.Q0() == 0 && j17 != 0) {
                    i18.q1(j17);
                    i18.r1(j18);
                }
                i18.Y0(1);
                j0Var.t(i18);
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", "markCgiCalled: update state by invite id");
                return;
            }
            return;
        }
        if (j17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPBubbleHelper", "markCgiCalled: get bubble info from db error");
            return;
        }
        com.tencent.mm.plugin.voip.model.j0 j0Var2 = com.tencent.mm.plugin.voip.model.j0.f176682a;
        dm.sb sbVar = (dm.sb) dm.sb.W0(j17).o(lq4.b.f320461n.a().Q4(), dm.sb.class);
        if (sbVar != null) {
            if (!(sbVar.R0() == j18)) {
                sbVar = null;
            }
            if (sbVar != null) {
                sbVar.Y0(1);
                com.tencent.mm.plugin.voip.model.j0.f176682a.t(sbVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", "markCgiCalled: update state");
            }
        }
    }
}
