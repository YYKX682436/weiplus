package d84;

/* loaded from: classes4.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d84.j0 f227055d;

    public e(d84.j0 j0Var) {
        this.f227055d = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mb4.e eVar;
        mb4.e eVar2;
        mb4.e eVar3;
        mb4.e eVar4;
        mb4.e eVar5;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$handleInteractType$1$1$1$1$1");
        com.tencent.mm.plugin.sns.ad.widget.adpag.c0 c0Var = com.tencent.mm.plugin.sns.ad.widget.adpag.c0.f163333a;
        d84.j0 j0Var = this.f227055d;
        android.content.Context z17 = d84.j0.z(j0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsAdLeftDecorPAGContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdLeftDecorPAGContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) j0Var.I).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdLeftDecorPAGContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsAdLeftDecorPAGContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        d84.l0 y17 = d84.j0.y(j0Var);
        java.lang.String c17 = (y17 == null || (eVar5 = y17.f227112k) == null) ? null : eVar5.c();
        d84.l0 y18 = d84.j0.y(j0Var);
        java.lang.String a17 = (y18 == null || (eVar4 = y18.f227112k) == null) ? null : eVar4.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMLeftDecorPAGViewListener$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        d84.l lVar = j0Var.f227078c0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMLeftDecorPAGViewListener$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.tencent.mm.view.MMPAGView b17 = com.tencent.mm.plugin.sns.ad.widget.adpag.c0.b(c0Var, z17, frameLayout, c17, a17, lVar, 0, 0, 64, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMLeftDecorPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        j0Var.G = b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMLeftDecorPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.content.Context z18 = d84.j0.z(j0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsAdRightDecorPAGContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdRightDecorPAGContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ((jz5.n) j0Var.f227075J).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdRightDecorPAGContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsAdRightDecorPAGContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        d84.l0 y19 = d84.j0.y(j0Var);
        java.lang.String c18 = (y19 == null || (eVar3 = y19.f227113l) == null) ? null : eVar3.c();
        d84.l0 y27 = d84.j0.y(j0Var);
        java.lang.String a18 = (y27 == null || (eVar2 = y27.f227113l) == null) ? null : eVar2.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMRightDecorPAGViewListener$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        d84.o oVar = j0Var.f227079d0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMRightDecorPAGViewListener$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.tencent.mm.view.MMPAGView b18 = com.tencent.mm.plugin.sns.ad.widget.adpag.c0.b(c0Var, z18, frameLayout2, c18, a18, oVar, 0, 0, 64, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMRightDecorPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        j0Var.H = b18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMRightDecorPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        if (com.tencent.mm.ui.bk.C()) {
            d84.l0 y28 = d84.j0.y(j0Var);
            if (y28 != null) {
                eVar = y28.f227105d;
            }
            eVar = null;
        } else {
            d84.l0 y29 = d84.j0.y(j0Var);
            if (y29 != null) {
                eVar = y29.f227104c;
            }
            eVar = null;
        }
        android.content.Context z19 = d84.j0.z(j0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsAdRockPaperScissorsPAGContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.tencent.mm.ui.widget.RoundCornerFrameLayout Q = j0Var.Q();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsAdRockPaperScissorsPAGContainer", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        java.lang.String c19 = eVar != null ? eVar.c() : null;
        java.lang.String a19 = eVar != null ? eVar.a() : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsAdRockPaperScissorsPAGViewListener$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        d84.y yVar = j0Var.f227080e0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsAdRockPaperScissorsPAGViewListener$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.tencent.mm.view.MMPAGView b19 = com.tencent.mm.plugin.sns.ad.widget.adpag.c0.b(c0Var, z19, Q, c19, a19, yVar, 0, 0, 96, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMSnsAdRockPaperScissorsPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        j0Var.F = b19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMSnsAdRockPaperScissorsPAGView", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$handleInteractType$1$1$1$1$1");
    }
}
