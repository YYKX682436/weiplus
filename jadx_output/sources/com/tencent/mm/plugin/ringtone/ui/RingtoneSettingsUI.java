package com.tencent.mm.plugin.ringtone.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/ringtone/ui/RingtoneSettingsUI;", "Lcom/tencent/mm/plugin/ringtone/uic/BaseRingtoneUI;", "<init>", "()V", "plugin-ringtone_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class RingtoneSettingsUI extends com.tencent.mm.plugin.ringtone.uic.BaseRingtoneUI {
    public final void U6() {
        super.finish();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.clu;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            return kz5.q1.i(importUIComponents, kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.ringtone.uic.z1.class, com.tencent.mm.plugin.ringtone.uic.v.class, com.tencent.mm.plugin.ringtone.uic.v0.class, com.tencent.mm.plugin.ringtone.uic.b0.class, com.tencent.mm.plugin.ringtone.uic.k1.class, com.tencent.mm.plugin.ringtone.uic.x1.class}));
        }
        return null;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        boolean z17 = true;
        if (i17 != 5) {
            if (i17 == 8 && i18 == -1 && intent != null) {
                java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
                if (stringExtra != null && stringExtra.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    mx3.s.a(mx3.u.f332620f, this, 2, stringExtra, ((com.tencent.mm.plugin.ringtone.uic.v) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.ringtone.uic.v.class)).f158499e, false, null, 48, null);
                    return;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.SettingsNewRingtoneUI", "empty or null contact: " + stringExtra);
                return;
            }
            return;
        }
        if (i18 != 6) {
            return;
        }
        java.lang.String stringExtra2 = intent != null ? intent.getStringExtra("exclusvie_name") : null;
        if (stringExtra2 != null && stringExtra2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("mmkv_ringtone_info");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        if (M.getBoolean("ringtone_exclusive_has_been_educated", false)) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(this, 2, 3, false);
        z2Var.y(getResources().getText(com.tencent.mm.R.string.i2t));
        z2Var.i(com.tencent.mm.R.layout.cgv);
        z2Var.F = new ay3.n(z2Var);
        z2Var.C();
    }

    @Override // com.tencent.mm.plugin.ringtone.uic.BaseRingtoneUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.ixs);
        setBackBtn(new ay3.o(this));
        addTextOptionMenu(0, "历史记录", new ay3.p(this));
        setBackGroundColorResource(com.tencent.mm.R.color.f478489a);
        setActionbarColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.f478489a));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
