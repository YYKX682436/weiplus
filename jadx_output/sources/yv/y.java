package yv;

/* loaded from: classes11.dex */
public class y extends com.tencent.mm.sdk.event.n {
    public y() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        if (!gm0.j1.a()) {
            return false;
        }
        if (!(iEvent instanceof com.tencent.mm.autogen.events.CheckHotPatchAlertEvent)) {
            if (iEvent instanceof com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent) {
                ((y73.a0) i95.n0.c(y73.a0.class)).getClass();
                b83.s.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
                fy5.a.d().b(com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("tinker_patch_share_config", 4).getInt("check_tinker_update_interval", 12));
                return false;
            }
            if (iEvent instanceof com.tencent.mm.autogen.events.CheckTinkerUpdateEvent) {
                ((y73.a0) i95.n0.c(y73.a0.class)).getClass();
                ((com.tencent.mm.autogen.events.CheckTinkerUpdateEvent) iEvent).f54056g.getClass();
                gm0.j1.d().g(new z73.g("", "", null, false));
            }
            return false;
        }
        y73.a0 a0Var = (y73.a0) i95.n0.c(y73.a0.class);
        com.tencent.mm.autogen.events.CheckHotPatchAlertEvent checkHotPatchAlertEvent = (com.tencent.mm.autogen.events.CheckHotPatchAlertEvent) iEvent;
        if (a0Var.f459699d) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("tinker_patch_share_config", 4).getString("tinker_patch_msg_key", "");
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("tinker_patch_share_config", 4).getString("tinker_patch_version_key", "");
            com.tencent.mars.xlog.Log.i("Tinker.SubCoreHotpatch", "v1:%s, v2:%s, wording:%s", java.lang.String.format("0x%08X", java.lang.Integer.valueOf(o45.wf.f343029g)), string2, string);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string) && java.lang.String.format("0x%08X", java.lang.Integer.valueOf(o45.wf.f343029g)).equalsIgnoreCase(string2)) {
                am.o2 o2Var = checkHotPatchAlertEvent.f54050g;
                o2Var.f7506a = true;
                o2Var.f7507b = string;
                y73.a.b(2);
                com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_patch_version_key", "").apply();
                com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_patch_msg_key", "").apply();
            }
            a0Var.f459699d = false;
        }
        return false;
    }
}
