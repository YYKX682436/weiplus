package fq4;

/* loaded from: classes15.dex */
public class t implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public int f265642d = 71;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f265643e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f265644f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f265645g = 0;

    /* renamed from: h, reason: collision with root package name */
    public fq4.s f265646h;

    public t(fq4.s sVar) {
        this.f265646h = null;
        c01.d9.e().a(611, this);
        c01.d9.e().a(612, this);
        this.f265646h = sVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        fq4.s sVar;
        if (i17 != 0 && i18 != 0) {
            if (i18 != -34) {
                fq4.s sVar2 = this.f265646h;
                if (sVar2 != null) {
                    com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI voiceCreateUI = (com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI) sVar2;
                    voiceCreateUI.f176168h.setErr(com.tencent.mm.R.string.k9u);
                    voiceCreateUI.f176168h.c();
                    voiceCreateUI.a7();
                    return;
                }
                return;
            }
            fq4.s sVar3 = this.f265646h;
            if (sVar3 != null) {
                com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI voiceCreateUI2 = (com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI) sVar3;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str = voiceCreateUI2.getString(com.tencent.mm.R.string.k9n);
                }
                voiceCreateUI2.f176168h.setErr(str);
                voiceCreateUI2.f176168h.c();
                voiceCreateUI2.a7();
                return;
            }
            return;
        }
        if (m1Var.getType() == 611) {
            fq4.e eVar = (fq4.e) m1Var;
            this.f265644f = eVar.f265590g;
            java.lang.String str2 = eVar.f265589f;
            this.f265643e = str2;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            fq4.s sVar4 = this.f265646h;
            if (sVar4 != null) {
                int i19 = this.f265642d;
                if (i19 == 71) {
                    com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI voiceCreateUI3 = (com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI) sVar4;
                    voiceCreateUI3.Y6();
                    voiceCreateUI3.f176172o = str2;
                    voiceCreateUI3.T6();
                    voiceCreateUI3.f176168h.d();
                    voiceCreateUI3.f176168h.setTipText(str2);
                    voiceCreateUI3.f176165e.setEnabled(true);
                } else if (i19 == 72) {
                    com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI voiceCreateUI4 = (com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI) sVar4;
                    voiceCreateUI4.f176172o = str2;
                    voiceCreateUI4.T6();
                    voiceCreateUI4.f176168h.d();
                    voiceCreateUI4.f176168h.setTipText(str2);
                    voiceCreateUI4.f176165e.setEnabled(true);
                }
            }
        }
        if (m1Var.getType() == 612) {
            fq4.i iVar = (fq4.i) m1Var;
            int i27 = iVar.f265609n;
            boolean z18 = (i27 == 72 && iVar.f265610o == 0) || i27 == 71;
            if (z18) {
                this.f265645g = iVar.f265608m;
                fq4.s sVar5 = this.f265646h;
                if (sVar5 != null) {
                    ((com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI) sVar5).Z6(true, i27);
                }
            } else {
                fq4.s sVar6 = this.f265646h;
                if (sVar6 != null) {
                    ((com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI) sVar6).Z6(false, i27);
                }
            }
            if (z18 && i27 == 71 && (sVar = this.f265646h) != null) {
                java.lang.String str3 = this.f265643e;
                com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI voiceCreateUI5 = (com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI) sVar;
                voiceCreateUI5.f176172o = str3;
                voiceCreateUI5.T6();
                voiceCreateUI5.f176168h.d();
                voiceCreateUI5.f176168h.setTipText(str3);
                voiceCreateUI5.f176165e.setEnabled(true);
            }
        }
    }
}
