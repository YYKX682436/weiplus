package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes8.dex */
public final class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI f176273d;

    public r0(com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI voicePrintStateSettingUI) {
        this.f176273d = voicePrintStateSettingUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voiceprint/ui/VoicePrintStateSettingUI$showSwitchView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoicePrintStateSettingUI", "showSwitchView: reset layout click");
        int i17 = com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI.f176204f;
        com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI voicePrintStateSettingUI = this.f176273d;
        voicePrintStateSettingUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) voicePrintStateSettingUI, false, 1);
        k0Var.f211872n = new com.tencent.mm.plugin.voiceprint.ui.n0(voicePrintStateSettingUI);
        k0Var.f211881s = new com.tencent.mm.plugin.voiceprint.ui.o0(voicePrintStateSettingUI);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/voiceprint/ui/VoicePrintStateSettingUI$showSwitchView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
