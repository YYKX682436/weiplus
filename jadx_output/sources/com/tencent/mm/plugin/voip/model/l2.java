package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class l2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.h2 f176740d;

    public l2(com.tencent.mm.plugin.voip.model.h2 h2Var) {
        this.f176740d = h2Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.voip.model.h2 h2Var = this.f176740d;
        if (h2Var.f176576s == null) {
            h2Var.f176577t = 0L;
            h2Var.C.d();
            return false;
        }
        if (!com.tencent.mm.app.w.INSTANCE.f53889n) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.voip.model.h2 h2Var2 = this.f176740d;
            if (currentTimeMillis - h2Var2.f176577t < 60000) {
                return true;
            }
            h2Var2.f176576s = null;
            h2Var2.f176577t = 0L;
            h2Var2.C.d();
            return false;
        }
        com.tencent.mm.plugin.voip.model.h2 h2Var3 = this.f176740d;
        r45.r27 r27Var = h2Var3.f176576s;
        h2Var3.B(r27Var.f384489d, r27Var.f384490e, r27Var.f384495m == 0, r27Var.f384494i);
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "steve:voip callin in mRepeatCheckHandler, roomid:%d, roomkey:%s, time:%d", java.lang.Integer.valueOf(this.f176740d.f176576s.f384489d), java.lang.Long.valueOf(this.f176740d.f176576s.f384490e), java.lang.Integer.valueOf(this.f176740d.f176576s.f384491f));
        com.tencent.mm.plugin.voip.model.h2 h2Var4 = this.f176740d;
        h2Var4.h(h2Var4.f176576s);
        com.tencent.mm.plugin.voip.model.h2 h2Var5 = this.f176740d;
        h2Var5.f176576s = null;
        h2Var5.f176577t = 0L;
        h2Var5.C.d();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(500L, 5L, 1L, false);
        return false;
    }
}
