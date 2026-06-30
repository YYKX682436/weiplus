package com.tencent.mm.plugin.voiceprint.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/voiceprint/ui/VoicePrintStateSettingUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes8.dex */
public final class VoicePrintStateSettingUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f176204f = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f176205d = jz5.h.b(new com.tencent.mm.plugin.voiceprint.ui.f0(this));

    /* renamed from: e, reason: collision with root package name */
    public boolean f176206e;

    public static final void T6(com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI voicePrintStateSettingUI, boolean z17) {
        voicePrintStateSettingUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.VoicePrintStateSettingUI", "showSwitchView() called with: enable = " + z17);
        voicePrintStateSettingUI.W6().f265433b.setVisibility(8);
        voicePrintStateSettingUI.W6().f265437f.setVisibility(8);
        voicePrintStateSettingUI.W6().f265438g.setVisibility(0);
        voicePrintStateSettingUI.W6().f265434c.setCheck(z17);
        voicePrintStateSettingUI.W6().f265434c.setSwitchListener(new com.tencent.mm.plugin.voiceprint.ui.q0(voicePrintStateSettingUI));
        voicePrintStateSettingUI.W6().f265436e.setOnClickListener(new com.tencent.mm.plugin.voiceprint.ui.r0(voicePrintStateSettingUI));
        voicePrintStateSettingUI.W6().f265435d.setOnClickListener(new com.tencent.mm.plugin.voiceprint.ui.s0(voicePrintStateSettingUI));
    }

    public final void U6(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoicePrintStateSettingUI", "checkState() called with: opCode = " + i17);
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.k9p), true, false, com.tencent.mm.plugin.voiceprint.ui.j0.f176259d);
        Q.show();
        kotlinx.coroutines.l.d(v65.m.b(this), null, null, new com.tencent.mm.plugin.voiceprint.ui.i0(i17, this, Q, null), 3, null);
    }

    public final void V6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoicePrintStateSettingUI", "createLock() called");
        java.lang.String str = fq4.e0.f265591a;
        if (str == null) {
            str = v61.d.a(1);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("voicelock_create", "view_clk", kz5.c1.k(new jz5.l("voicelock_sessionid", str), new jz5.l("page_id", "50395")), 34575);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this, com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI.class);
        intent.putExtra("kscene_type", 71);
        intent.putExtra("trans_out_anim", com.tencent.mm.R.anim.f477855dd);
        intent.putExtra("createVoicePrint", true);
        startActivityForResult(intent, 1);
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
    }

    public final fq.f W6() {
        return (fq.f) ((jz5.n) this.f176205d).getValue();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d4j;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoicePrintStateSettingUI", "onActivityResult() called with: requestCode = " + i17 + ", resultCode = " + i18 + ", data = " + intent);
        if (i17 == 1 && i18 == -1) {
            if (intent != null ? intent.getBooleanExtra("KIsCreateSuccess", false) : false) {
                U6(1);
                return;
            } else {
                this.f176206e = true;
                return;
            }
        }
        if (i17 == 2 && i18 == -1) {
            if (intent != null ? intent.getBooleanExtra("KIsCreateSuccess", false) : false) {
                U6(0);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        com.tencent.mm.storage.n3 p17 = c01.d9.b().p();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_VOICEPRINT_MORE_TAB_DOT_SHOW_BOOLEAN;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        p17.x(u3Var, bool);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERFINO_VOICEPRINT_SETTING_DOT_SHOW_BOOLEAN, bool);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_VOICEPRINT_SETTING_ACCOUNT_INFO_DOT_SHOW_BOOLEAN, bool);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_VOICEPRINT_SETTING_ACCOUNT_INFO_NEW_SHOW_BOOLEAN, bool);
        setBackBtn(new com.tencent.mm.plugin.voiceprint.ui.k0(this));
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        com.tencent.mm.ui.bk.s0(W6().f265439h.getPaint());
        U6(0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        long n17 = j62.e.g().n();
        if (n17 == 0) {
            str = "0";
        } else if (n17 > 0) {
            str = java.lang.Long.toString(n17, 10);
        } else {
            char[] cArr = new char[64];
            long j17 = (n17 >>> 1) / 5;
            long j18 = 10;
            int i17 = 63;
            cArr[63] = java.lang.Character.forDigit((int) (n17 - (j17 * j18)), 10);
            while (j17 > 0) {
                i17--;
                cArr[i17] = java.lang.Character.forDigit((int) (j17 % j18), 10);
                j17 /= j18;
            }
            str = new java.lang.String(cArr, i17, 64 - i17);
        }
        sb6.append(str);
        sb6.append('_');
        sb6.append(java.lang.System.currentTimeMillis());
        fq4.e0.f265591a = sb6.toString();
        java.lang.String str2 = fq4.e0.f265591a;
        if (str2 == null) {
            str2 = v61.d.a(1);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("page_in", kz5.c1.k(new jz5.l("voicelock_sessionid", str2), new jz5.l("page_id", "50395")), 34575);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        if (grantResults.length == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoicePrintStateSettingUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoicePrintStateSettingUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(grantResults[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 80) {
            if (grantResults[0] == 0) {
                V6();
            } else {
                db5.e1.C(this, getString(com.tencent.mm.R.string.hhn), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.aq7), false, new com.tencent.mm.plugin.voiceprint.ui.l0(this), com.tencent.mm.plugin.voiceprint.ui.m0.f176264d);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.f176206e) {
            U6(0);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(com.tencent.mm.plugin.voiceprint.ui.z.class);
    }
}
