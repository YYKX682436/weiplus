package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes15.dex */
public class h4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.VoiceInputUI f190864d;

    public h4(com.tencent.mm.pluginsdk.ui.VoiceInputUI voiceInputUI) {
        this.f190864d = voiceInputUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/VoiceInputUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior voiceInputBehavior = new com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior();
        voiceInputBehavior.send = 3;
        int i17 = com.tencent.mm.pluginsdk.ui.VoiceInputUI.f189870x;
        com.tencent.mm.pluginsdk.ui.VoiceInputUI voiceInputUI = this.f190864d;
        voiceInputUI.U6(voiceInputBehavior);
        voiceInputUI.T6(7);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/VoiceInputUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
