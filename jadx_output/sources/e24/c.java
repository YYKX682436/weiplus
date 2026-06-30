package e24;

/* loaded from: classes.dex */
public final class c implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.chatting.SettingSwitchCustomSendBtn f247010a;

    public c(com.tencent.mm.plugin.setting.ui.setting_new.settings.chatting.SettingSwitchCustomSendBtn settingSwitchCustomSendBtn) {
        this.f247010a = settingSwitchCustomSendBtn;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.setting.ui.setting_new.settings.chatting.SettingSwitchCustomSendBtn settingSwitchCustomSendBtn = this.f247010a;
        settingSwitchCustomSendBtn.f161905h = z17;
        settingSwitchCustomSendBtn.t7(settingSwitchCustomSendBtn.getActivity().getIntent());
        gm0.j1.u().c().w(66832, java.lang.Boolean.valueOf(!z17));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, java.lang.Boolean.valueOf(z17));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("independent_send_msg_setting_btn", "view_clk", hashMap, 30529);
    }
}
