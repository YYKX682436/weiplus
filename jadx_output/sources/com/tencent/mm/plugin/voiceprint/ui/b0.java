package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.VoicePrintCreateFinishUI f176234d;

    public b0(com.tencent.mm.plugin.voiceprint.ui.VoicePrintCreateFinishUI voicePrintCreateFinishUI) {
        this.f176234d = voicePrintCreateFinishUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voiceprint/ui/VoicePrintCreateFinishUI$initPageView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoicePrintCreateFinishUI", "iknown button clicked");
        int i17 = com.tencent.mm.plugin.voiceprint.ui.VoicePrintCreateFinishUI.f176201f;
        com.tencent.mm.plugin.voiceprint.ui.VoicePrintCreateFinishUI voicePrintCreateFinishUI = this.f176234d;
        if (((java.lang.Number) ((jz5.n) voicePrintCreateFinishUI.f176203e).getValue()).intValue() == 75) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoicePrintCreateFinishUI", "create");
            android.content.Intent intent = new android.content.Intent(voicePrintCreateFinishUI, (java.lang.Class<?>) com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(voicePrintCreateFinishUI, arrayList2.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoicePrintCreateFinishUI", "create", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            voicePrintCreateFinishUI.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(voicePrintCreateFinishUI, "com/tencent/mm/plugin/voiceprint/ui/VoicePrintCreateFinishUI", "create", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            voicePrintCreateFinishUI.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
        }
        voicePrintCreateFinishUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/voiceprint/ui/VoicePrintCreateFinishUI$initPageView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
