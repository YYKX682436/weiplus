package fq4;

/* loaded from: classes15.dex */
public class w implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f265647d = null;

    /* renamed from: e, reason: collision with root package name */
    public fq4.v f265648e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f265649f = -1;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f265650g = null;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f265651h = null;

    public w() {
        c01.d9.e().a(com.tencent.mm.plugin.appbrand.jsapi.ia.CTRL_INDEX, this);
        c01.d9.e().a(616, this);
        c01.d9.e().a(617, this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 && i18 != 0) {
            if (i18 == -34 && m1Var.getType() == 617) {
                fq4.v vVar = this.f265648e;
                if (vVar != null) {
                    com.tencent.mm.plugin.voiceprint.ui.VoiceLoginUI voiceLoginUI = (com.tencent.mm.plugin.voiceprint.ui.VoiceLoginUI) vVar;
                    android.content.Intent intent = new android.content.Intent(voiceLoginUI, (java.lang.Class<?>) com.tencent.mm.plugin.voiceprint.ui.VoicePrintCreateFinishUI.class);
                    intent.putExtra("kscene_type", 76);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(voiceLoginUI, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoiceLoginUI", "onBlockedByLimit", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    voiceLoginUI.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(voiceLoginUI, "com/tencent/mm/plugin/voiceprint/ui/VoiceLoginUI", "onBlockedByLimit", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    voiceLoginUI.finish();
                    return;
                }
                return;
            }
            fq4.v vVar2 = this.f265648e;
            if (vVar2 != null) {
                com.tencent.mm.plugin.voiceprint.ui.VoiceLoginUI voiceLoginUI2 = (com.tencent.mm.plugin.voiceprint.ui.VoiceLoginUI) vVar2;
                android.content.Intent intent2 = new android.content.Intent(voiceLoginUI2, (java.lang.Class<?>) com.tencent.mm.plugin.voiceprint.ui.VoicePrintCreateFinishUI.class);
                intent2.putExtra("kscene_type", 77);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(voiceLoginUI2, arrayList2.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoiceLoginUI", "onNetworkError", "(II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                voiceLoginUI2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(voiceLoginUI2, "com/tencent/mm/plugin/voiceprint/ui/VoiceLoginUI", "onNetworkError", "(II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                voiceLoginUI2.finish();
                return;
            }
            return;
        }
        if (m1Var.getType() == 618) {
            java.lang.String str2 = ((fq4.h) m1Var).f265600f;
            this.f265647d = str2;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                c01.d9.e().g(new fq4.l(73, this.f265647d));
            }
        }
        if (m1Var.getType() == 616) {
            fq4.l lVar = (fq4.l) m1Var;
            this.f265649f = lVar.f265617g;
            java.lang.String str3 = lVar.f265616f;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            fq4.v vVar3 = this.f265648e;
            if (vVar3 != null) {
                com.tencent.mm.plugin.voiceprint.ui.VoiceLoginUI voiceLoginUI3 = (com.tencent.mm.plugin.voiceprint.ui.VoiceLoginUI) vVar3;
                voiceLoginUI3.f176172o = str3;
                voiceLoginUI3.f176168h.d();
                voiceLoginUI3.f176168h.setTipText(str3);
                voiceLoginUI3.T6();
                voiceLoginUI3.f176165e.setEnabled(true);
            }
        }
        if (m1Var.getType() == 617) {
            fq4.o oVar = (fq4.o) m1Var;
            if (oVar.f265628n != 0) {
                fq4.v vVar4 = this.f265648e;
                if (vVar4 != null) {
                    ((com.tencent.mm.plugin.voiceprint.ui.VoiceLoginUI) vVar4).Z6(false);
                    return;
                }
                return;
            }
            this.f265650g = oVar.f265629o;
            fq4.v vVar5 = this.f265648e;
            if (vVar5 != null) {
                ((com.tencent.mm.plugin.voiceprint.ui.VoiceLoginUI) vVar5).Z6(true);
            }
        }
    }
}
