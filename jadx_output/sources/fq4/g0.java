package fq4;

/* loaded from: classes15.dex */
public class g0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public fq4.f0 f265595d;

    /* renamed from: e, reason: collision with root package name */
    public int f265596e = -1;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f265597f = null;

    public g0(fq4.f0 f0Var) {
        this.f265595d = null;
        c01.d9.e().a(611, this);
        c01.d9.e().a(613, this);
        this.f265595d = f0Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 && i18 != 0) {
            if (i18 == -34) {
                fq4.f0 f0Var = this.f265595d;
                if (f0Var != null) {
                    com.tencent.mm.plugin.voiceprint.ui.VoiceUnLockUI voiceUnLockUI = (com.tencent.mm.plugin.voiceprint.ui.VoiceUnLockUI) f0Var;
                    voiceUnLockUI.f176168h.setErr(com.tencent.mm.R.string.k9n);
                    voiceUnLockUI.f176168h.c();
                    return;
                }
                return;
            }
            fq4.f0 f0Var2 = this.f265595d;
            if (f0Var2 != null) {
                com.tencent.mm.plugin.voiceprint.ui.VoiceUnLockUI voiceUnLockUI2 = (com.tencent.mm.plugin.voiceprint.ui.VoiceUnLockUI) f0Var2;
                voiceUnLockUI2.f176168h.setErr(com.tencent.mm.R.string.k9u);
                voiceUnLockUI2.f176168h.c();
                return;
            }
            return;
        }
        if (m1Var.getType() == 611) {
            fq4.e eVar = (fq4.e) m1Var;
            this.f265596e = eVar.f265590g;
            java.lang.String str2 = eVar.f265589f;
            this.f265597f = str2;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            fq4.f0 f0Var3 = this.f265595d;
            if (f0Var3 != null) {
                com.tencent.mm.plugin.voiceprint.ui.VoiceUnLockUI voiceUnLockUI3 = (com.tencent.mm.plugin.voiceprint.ui.VoiceUnLockUI) f0Var3;
                voiceUnLockUI3.f176172o = str2;
                voiceUnLockUI3.f176168h.d();
                voiceUnLockUI3.f176168h.setTipText(str2);
                voiceUnLockUI3.T6();
                voiceUnLockUI3.f176165e.setEnabled(true);
            }
        }
        if (m1Var.getType() == 613) {
            if (((fq4.q) m1Var).f265641n == 0) {
                fq4.f0 f0Var4 = this.f265595d;
                if (f0Var4 != null) {
                    ((com.tencent.mm.plugin.voiceprint.ui.VoiceUnLockUI) f0Var4).Z6(true);
                    return;
                }
                return;
            }
            fq4.f0 f0Var5 = this.f265595d;
            if (f0Var5 != null) {
                ((com.tencent.mm.plugin.voiceprint.ui.VoiceUnLockUI) f0Var5).Z6(false);
            }
        }
    }
}
