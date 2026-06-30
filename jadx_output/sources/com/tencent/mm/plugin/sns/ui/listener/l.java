package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class l implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f169832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f169833e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f169834f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.m f169835g;

    public l(com.tencent.mm.plugin.sns.ui.listener.m mVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.lang.String str, java.lang.String str2) {
        this.f169835g = mVar;
        this.f169832d = snsInfo;
        this.f169833e = str;
        this.f169834f = str2;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$2");
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.sns.ui.listener.m mVar = this.f169835g;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f169832d;
        if (itemId == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("sns_permission_snsinfo_svr_id", snsInfo == null ? 0L : snsInfo.field_snsId);
            intent.putExtra("sns_permission_userName", this.f169833e);
            intent.putExtra("sns_permission_anim", true);
            intent.putExtra("sns_permission_block_scene", 5);
            j45.l.n(com.tencent.mm.plugin.sns.ui.listener.i.e(mVar.f169837d), com.google.android.gms.common.Scopes.PROFILE, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_set_default_chatonly, 0) == 0 ? ".ui.PermissionSettingUI" : ".ui.PermissionSettingUI2", intent, 11);
        } else if (itemId == 1) {
            com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
            java.lang.String str = this.f169834f;
            com.tencent.mm.plugin.sns.storage.SnsInfo k17 = Fj.k1(str);
            if (k17 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "error get snsinfo by id " + str);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$2");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "expose id " + k17.getSnsId() + " " + k17.field_userName);
            if (j62.e.g().l("clicfg_sns_expose_config_switch_android", false, false, true)) {
                q80.d0 d0Var = new q80.d0();
                android.os.Bundle bundle = new android.os.Bundle();
                d0Var.f360649a = "wxalited4df4810a40b1d9ddc0cbea44d263fd9";
                d0Var.f360651c = "{\"scene\":33}";
                bundle.putString("k_username", k17.field_userName);
                bundle.putLong("k_expose_msg_id", k17.field_snsId);
                d0Var.f360655g = bundle;
                com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9,page:");
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(com.tencent.mm.plugin.sns.ui.listener.i.e(mVar.f169837d), d0Var, new com.tencent.mm.plugin.sns.ui.listener.k(this, k17));
            } else {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("k_expose_msg_id", k17.field_snsId);
                intent2.putExtra("k_username", k17.field_userName);
                intent2.putExtra("showShare", false);
                intent2.putExtra("rawUrl", java.lang.String.format(com.tencent.mm.ui.n2.f209398a, 33));
                j45.l.j(com.tencent.mm.plugin.sns.ui.listener.i.e(mVar.f169837d), "webview", ".ui.tools.WebViewUI", intent2, null);
            }
            gm0.j1.i();
            com.tencent.mm.storage.z3 f07 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(snsInfo.getUserName());
            if (f07 != null && com.tencent.mm.storage.z3.m4(snsInfo.getUserName()) && "3552365301".equals(f07.Q0())) {
                com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
                java.lang.String userName = k17.getUserName();
                s0Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportWechatWorkExpose", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                com.tencent.mm.autogen.mmdata.rpt.WechatWorkSnsStruct wechatWorkSnsStruct = new com.tencent.mm.autogen.mmdata.rpt.WechatWorkSnsStruct();
                wechatWorkSnsStruct.f62978f = wechatWorkSnsStruct.b("OpenimUsername", userName, true);
                wechatWorkSnsStruct.f62976d = 3L;
                wechatWorkSnsStruct.f62977e = 1L;
                wechatWorkSnsStruct.k();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportWechatWorkExpose", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$2");
    }
}
