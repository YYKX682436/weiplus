package tw;

/* loaded from: classes9.dex */
public final class h implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tw.i f422401a;

    public h(tw.i iVar) {
        this.f422401a = iVar;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        tw.i iVar = this.f422401a;
        iVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsNotifySettingUIC", "onSwitchGlobalAutoNotify: " + z17);
        e31.k U6 = iVar.U6();
        if (U6 != null) {
            g31.c0 c0Var = ((g31.l) U6).f268092e;
            c0Var.getClass();
            com.tencent.mars.xlog.Log.i("SubscribeSwitchInfoSyncer", "[updateGlobalAutoNotify] start, isGlobalAutoNotify=%b", java.lang.Boolean.valueOf(z17));
            if (c0Var.f268071c != null) {
                com.tencent.mars.xlog.Log.i("SubscribeSwitchInfoSyncer", "[updateGlobalAutoNotify] cancel previous task");
                l31.y yVar = c0Var.f268071c;
                if (yVar != null) {
                    yVar.a();
                }
            }
            l31.y yVar2 = new l31.y(c0Var.f268069a, z17, new g31.b0(c0Var));
            c0Var.f268071c = yVar2;
            yVar2.run();
        }
        java.lang.String str = z17 ? "ecs_tl_notification_setting_auto_notify_switch_on" : "ecs_tl_notification_setting_auto_notify_switch_off";
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            ((cy1.a) rVar).Bj(str, "view_clk", kz5.q0.f314001d, 12, false);
        }
        uw.p.f431501a.c(iVar.getActivity());
    }
}
