package com.tencent.mm.plugin.voiceprint.ui;

@ul5.d(0)
/* loaded from: classes15.dex */
public class VoiceUnLockUI extends com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI implements fq4.f0 {

    /* renamed from: x, reason: collision with root package name */
    public fq4.g0 f176229x;

    @Override // com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI
    public void V6() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.m3m);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoiceUnLockUI", "initCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/voiceprint/ui/VoiceUnLockUI", "initCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        T6();
        this.f176168h.setTitleText(com.tencent.mm.R.string.k9m);
        this.f176168h.f176226f.setVisibility(8);
        this.f176165e.setEnabled(false);
    }

    @Override // com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI
    public void W6() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f176171n) || com.tencent.mm.sdk.platformtools.t8.K0(this.f176229x.f265597f)) {
            return;
        }
        fq4.q qVar = new fq4.q(this.f176171n, this.f176229x.f265596e, 0);
        qVar.f265638h = true;
        c01.d9.e().g(qVar);
        this.f176165e.setEnabled(false);
        X6();
    }

    public void Z6(boolean z17) {
        T6();
        this.f176165e.setEnabled(true);
        if (z17) {
            a7();
        } else {
            this.f176168h.setErr(com.tencent.mm.R.string.k9l);
            this.f176168h.c();
        }
    }

    public void a7() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("kscene_type", 73);
        intent.setClass(this, com.tencent.mm.plugin.voiceprint.ui.VoicePrintCreateFinishUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoiceUnLockUI", "onUnlockSuccess", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/voiceprint/ui/VoiceUnLockUI", "onUnlockSuccess", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    @Override // com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f176229x = new fq4.g0(this);
        c01.d9.e().g(new fq4.e(73, ""));
    }

    @Override // com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        fq4.g0 g0Var = this.f176229x;
        g0Var.getClass();
        c01.d9.e().q(611, g0Var);
        c01.d9.e().q(613, g0Var);
        g0Var.f265595d = null;
    }
}
