package he0;

/* loaded from: classes.dex */
public class m extends com.tencent.mm.sdk.event.n {
    public m() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListener");
        if (gm0.j1.a()) {
            int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsHEVCSwitch", 0);
            int b18 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsWXPCSwitch", 0);
            boolean z17 = b17 == 1;
            boolean z18 = b18 == 1;
            android.content.SharedPreferences.Editor edit = com.tencent.mm.sdk.platformtools.l4.c(com.tencent.mm.sdk.platformtools.x2.f193071a, "sp_sns_dynswitch_stg", 4, false).edit();
            edit.putBoolean("sw_use_vcodec_img", z17);
            edit.putBoolean("sw_use_wxpc_img", z18);
            edit.commit();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListener");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.DynamicConfigUpdatedListener", "PostSyncTaskEvent arrived before account was ready, ignore it.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.DynamicConfigUpdatedListener");
        return false;
    }
}
