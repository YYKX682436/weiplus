package com.tencent.mm.plugin.multitalk.ui;

/* loaded from: classes14.dex */
public class MultiTalkAddMembersUI extends com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI {
    @Override // com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI, com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        this.f206450h.setBackgroundResource(com.tencent.mm.R.color.f478870jg);
        com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = this.f206450h;
        int i17 = sj3.i1.f408558c;
        multiSelectContactView.setPadding(i17, i17, i17, 0);
    }

    @Override // com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI, com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("keyguard");
        android.os.PowerManager powerManager = (android.os.PowerManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power");
        keyguardManager.inKeyguardRestrictedInputMode();
        hasWindowFocus();
        powerManager.isScreenOn();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        if (this.D) {
            this.D = false;
            p7();
            com.tencent.mm.plugin.multitalk.model.e3.Ri().C(false);
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI, com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void p7() {
        this.D = false;
        super.p7();
    }
}
