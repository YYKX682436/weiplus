package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes15.dex */
public class t implements com.tencent.mm.plugin.voiceprint.ui.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI f176276a;

    public t(com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI voiceCreateUI) {
        this.f176276a = voiceCreateUI;
    }

    @Override // com.tencent.mm.plugin.voiceprint.ui.f1
    public void a() {
    }

    @Override // com.tencent.mm.plugin.voiceprint.ui.f1
    public void b() {
        com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI voiceCreateUI = this.f176276a;
        voiceCreateUI.f176168h.setTitleText(com.tencent.mm.R.string.k_2);
        voiceCreateUI.f176168h.f176226f.setVisibility(0);
        voiceCreateUI.f176168h.b();
        voiceCreateUI.T6();
        voiceCreateUI.f176165e.setEnabled(true);
        android.view.View view = voiceCreateUI.f176165e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI$5", "onNewViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI$5", "onNewViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        voiceCreateUI.Y6();
    }
}
