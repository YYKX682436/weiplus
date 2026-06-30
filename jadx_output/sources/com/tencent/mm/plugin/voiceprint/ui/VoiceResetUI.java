package com.tencent.mm.plugin.voiceprint.ui;

@ul5.d(0)
/* loaded from: classes15.dex */
public class VoiceResetUI extends com.tencent.mm.plugin.voiceprint.ui.VoiceUnLockUI {
    @Override // com.tencent.mm.plugin.voiceprint.ui.VoiceUnLockUI
    public void a7() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoiceResetUI", "onUnlockSuccess", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/voiceprint/ui/VoiceResetUI", "onUnlockSuccess", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }
}
