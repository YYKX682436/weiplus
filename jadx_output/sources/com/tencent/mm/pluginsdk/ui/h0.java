package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes.dex */
public class h0 implements com.tencent.mm.pluginsdk.ui.g0 {

    /* renamed from: a, reason: collision with root package name */
    public int f190861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.BioHelperUI f190862b;

    public h0(com.tencent.mm.pluginsdk.ui.BioHelperUI bioHelperUI, com.tencent.mm.pluginsdk.ui.c0 c0Var) {
        this.f190862b = bioHelperUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.g0
    public int a() {
        return com.tencent.mm.R.drawable.btr;
    }

    @Override // com.tencent.mm.pluginsdk.ui.g0
    public java.lang.String b() {
        return this.f190862b.getString(com.tencent.mm.R.string.ais);
    }

    @Override // com.tencent.mm.pluginsdk.ui.g0
    public java.lang.String c() {
        return this.f190862b.getString(com.tencent.mm.R.string.air);
    }

    @Override // com.tencent.mm.pluginsdk.ui.g0
    public java.lang.String d() {
        return this.f190862b.getString(com.tencent.mm.R.string.ain);
    }

    @Override // com.tencent.mm.pluginsdk.ui.g0
    public void e(int i17, int i18, android.content.Intent intent) {
        if (i18 == -1) {
            com.tencent.mm.pluginsdk.ui.BioHelperUI bioHelperUI = this.f190862b;
            if (i17 == 1024 && intent != null) {
                java.lang.String stringExtra = intent.getStringExtra("VoiceLoginAuthPwd");
                com.tencent.mm.sdk.platformtools.t8.K0(stringExtra);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    stringExtra.length();
                }
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("VoiceLoginAuthPwd", stringExtra);
                intent2.putExtra("KVoiceHelpCode", bioHelperUI.f189763i);
                bioHelperUI.setResult(-1, intent2);
            }
            bioHelperUI.finish();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.g0
    public void f(android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        this.f190861a = intent.getIntExtra("kscene_type", 73);
    }

    @Override // com.tencent.mm.pluginsdk.ui.g0
    public void g(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("kscene_type", this.f190861a);
        com.tencent.mm.pluginsdk.ui.BioHelperUI bioHelperUI = this.f190862b;
        intent.putExtra("Kusername", bioHelperUI.f189759e);
        intent.putExtra("Kvertify_key", bioHelperUI.f189760f);
        j45.l.n(context, "voiceprint", ".ui.VoiceLoginUI", intent, 1024);
    }
}
