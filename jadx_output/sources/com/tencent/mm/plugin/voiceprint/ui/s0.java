package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI f176275d;

    public s0(com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI voicePrintStateSettingUI) {
        this.f176275d = voicePrintStateSettingUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voiceprint/ui/VoicePrintStateSettingUI$showSwitchView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoicePrintStateSettingUI", "showSwitchView: check layout click");
        com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI voicePrintStateSettingUI = this.f176275d;
        android.content.Intent intent = new android.content.Intent(voicePrintStateSettingUI, (java.lang.Class<?>) com.tencent.mm.plugin.voiceprint.ui.VoiceUnLockUI.class);
        intent.putExtra("kscene_type", 73);
        intent.putExtra("trans_out_anim", com.tencent.mm.R.anim.f477855dd);
        com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI voicePrintStateSettingUI2 = this.f176275d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(voicePrintStateSettingUI2, arrayList2.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoicePrintStateSettingUI$showSwitchView$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        voicePrintStateSettingUI2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(voicePrintStateSettingUI2, "com/tencent/mm/plugin/voiceprint/ui/VoicePrintStateSettingUI$showSwitchView$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        voicePrintStateSettingUI.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
        yj0.a.h(this, "com/tencent/mm/plugin/voiceprint/ui/VoicePrintStateSettingUI$showSwitchView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
