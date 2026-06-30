package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.SettingsVoicePrintUI f176263d;

    public m(com.tencent.mm.plugin.voiceprint.ui.SettingsVoicePrintUI settingsVoicePrintUI) {
        this.f176263d = settingsVoicePrintUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voiceprint/ui/SettingsVoicePrintUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.tencent.mm.plugin.voiceprint.ui.SettingsVoicePrintUI settingsVoicePrintUI = this.f176263d;
        java.lang.String string = settingsVoicePrintUI.getString(com.tencent.mm.R.string.j0y);
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(settingsVoicePrintUI, "android.permission.RECORD_AUDIO", 80, "", string);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceSettingsUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), settingsVoicePrintUI);
        if (!a17) {
            yj0.a.h(this, "com/tencent/mm/plugin/voiceprint/ui/SettingsVoicePrintUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int i17 = com.tencent.mm.plugin.voiceprint.ui.SettingsVoicePrintUI.f176187i;
        settingsVoicePrintUI.V6();
        yj0.a.h(this, "com/tencent/mm/plugin/voiceprint/ui/SettingsVoicePrintUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
