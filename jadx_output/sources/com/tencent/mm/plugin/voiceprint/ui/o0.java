package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes8.dex */
public final class o0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI f176267d;

    public o0(com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI voicePrintStateSettingUI) {
        this.f176267d = voicePrintStateSettingUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI voicePrintStateSettingUI = this.f176267d;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.VoicePrintStateSettingUI", "resetLogic: delete click");
            int i18 = com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI.f176204f;
            voicePrintStateSettingUI.U6(3);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoicePrintStateSettingUI", "resetLogic: reset click");
        java.lang.String str = fq4.e0.f265591a;
        if (str == null) {
            str = v61.d.a(1);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("voicelock_create", "view_clk", kz5.c1.k(new jz5.l("voicelock_sessionid", str), new jz5.l("page_id", "50395")), 34575);
        android.content.Intent intent = new android.content.Intent(voicePrintStateSettingUI, (java.lang.Class<?>) com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI.class);
        intent.putExtra("KvoicePrintReset", true);
        intent.putExtra("kscene_type", 73);
        intent.putExtra("trans_out_anim", com.tencent.mm.R.anim.f477855dd);
        voicePrintStateSettingUI.startActivityForResult(intent, 2);
        voicePrintStateSettingUI.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
    }
}
