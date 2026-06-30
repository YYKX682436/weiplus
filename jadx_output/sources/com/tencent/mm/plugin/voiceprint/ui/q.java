package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes15.dex */
public class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI f176270d;

    public q(com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI voiceCreateUI) {
        this.f176270d = voiceCreateUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI voiceCreateUI = this.f176270d;
        voiceCreateUI.U6();
        com.tencent.mm.plugin.voiceprint.ui.g1.b(voiceCreateUI.f176168h, voiceCreateUI, new com.tencent.mm.plugin.voiceprint.ui.p(this));
        yj0.a.h(this, "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
