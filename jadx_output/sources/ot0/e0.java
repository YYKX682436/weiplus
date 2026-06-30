package ot0;

/* loaded from: classes4.dex */
public final class e0 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public static final ot0.e0 f348448a = new ot0.e0();

    @Override // km5.e
    public final void a(java.lang.Object obj) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = ot0.f0.f348472a;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        ot0.f0.f348472a = null;
        ot0.f0.f348473b = false;
        if (obj instanceof ot0.p0) {
            ot0.p0 p0Var = (ot0.p0) obj;
            int i17 = p0Var.f348628a;
            if (i17 == 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1908L, 15, 1L, false);
            } else if (i17 == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1908L, 12, 1L, false);
            } else if (i17 == 2) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1908L, 14, 1L, false);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgBizClickHandler", p0Var.f348629b);
        }
    }
}
