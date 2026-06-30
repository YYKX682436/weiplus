package k84;

/* loaded from: classes4.dex */
public final class z4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.c6 f305366d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(k84.c6 c6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f305366d = c6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initPAGView$1");
        k84.z4 z4Var = new k84.z4(this.f305366d, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initPAGView$1");
        return z4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initPAGView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initPAGView$1");
        java.lang.Object invokeSuspend = ((k84.z4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initPAGView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initPAGView$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        org.libpag.PAGFile c17;
        mb4.a aVar;
        mb4.l b17;
        java.lang.String a17;
        mb4.a aVar2;
        mb4.l b18;
        java.lang.String str2;
        mb4.a aVar3;
        mb4.m a18;
        java.lang.String a19;
        mb4.a aVar4;
        mb4.m a27;
        java.lang.String str3;
        com.tencent.mm.rfx.RfxPagFile d17;
        mb4.a aVar5;
        mb4.l b19;
        java.lang.String a28;
        mb4.a aVar6;
        mb4.l b27;
        java.lang.String str4;
        mb4.a aVar7;
        mb4.m a29;
        java.lang.String a37;
        mb4.a aVar8;
        mb4.m a38;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initPAGView$1");
        pz5.a aVar9 = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        k84.c6 c6Var = this.f305366d;
        com.tencent.mm.view.MMPAGView D = k84.c6.D(c6Var);
        boolean z17 = D != null && D.getUseRfx();
        jz5.f0 f0Var = jz5.f0.f302826a;
        java.lang.String str5 = "";
        if (z17) {
            if (com.tencent.mm.ui.bk.C()) {
                java.lang.String j17 = c6Var.j();
                mb4.c A = k84.c6.A(c6Var);
                if (A == null || (aVar6 = A.f325389n) == null || (b27 = aVar6.b()) == null || (str3 = b27.c()) == null) {
                    str3 = "";
                }
                mb4.c A2 = k84.c6.A(c6Var);
                if (A2 != null && (aVar5 = A2.f325389n) != null && (b19 = aVar5.b()) != null && (a28 = b19.a()) != null) {
                    str5 = a28;
                }
                d17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.d(j17, str3, str5);
            } else {
                java.lang.String j18 = c6Var.j();
                mb4.c A3 = k84.c6.A(c6Var);
                if (A3 == null || (aVar8 = A3.f325389n) == null || (a38 = aVar8.a()) == null || (str4 = a38.c()) == null) {
                    str4 = "";
                }
                mb4.c A4 = k84.c6.A(c6Var);
                if (A4 != null && (aVar7 = A4.f325389n) != null && (a29 = aVar7.a()) != null && (a37 = a29.a()) != null) {
                    str5 = a37;
                }
                d17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.d(j18, str4, str5);
            }
            if (d17 == null) {
                com.tencent.mars.xlog.Log.e(c6Var.j(), "initPAGView, PAGFile read error or isNotResumed!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initPAGView$1");
                return f0Var;
            }
            com.tencent.mm.view.MMPAGView D2 = k84.c6.D(c6Var);
            if (D2 != null) {
                D2.setComposition(d17);
            }
            com.tencent.mm.view.MMPAGView D3 = k84.c6.D(c6Var);
            if (D3 != null) {
                D3.setProgress(0.0d);
            }
            com.tencent.mm.view.MMPAGView D4 = k84.c6.D(c6Var);
            if (D4 != null) {
                D4.setRepeatCount(0);
            }
            com.tencent.mm.view.MMPAGView D5 = k84.c6.D(c6Var);
            if (D5 != null) {
                D5.setScaleMode(3);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMIsPAGValid$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            c6Var.M = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMIsPAGValid$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        } else {
            if (com.tencent.mm.ui.bk.C()) {
                java.lang.String j19 = c6Var.j();
                mb4.c A5 = k84.c6.A(c6Var);
                if (A5 == null || (aVar2 = A5.f325389n) == null || (b18 = aVar2.b()) == null || (str = b18.c()) == null) {
                    str = "";
                }
                mb4.c A6 = k84.c6.A(c6Var);
                if (A6 != null && (aVar = A6.f325389n) != null && (b17 = aVar.b()) != null && (a17 = b17.a()) != null) {
                    str5 = a17;
                }
                c17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.c(j19, str, str5);
            } else {
                java.lang.String j27 = c6Var.j();
                mb4.c A7 = k84.c6.A(c6Var);
                if (A7 == null || (aVar4 = A7.f325389n) == null || (a27 = aVar4.a()) == null || (str2 = a27.c()) == null) {
                    str2 = "";
                }
                mb4.c A8 = k84.c6.A(c6Var);
                if (A8 != null && (aVar3 = A8.f325389n) != null && (a18 = aVar3.a()) != null && (a19 = a18.a()) != null) {
                    str5 = a19;
                }
                c17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.c(j27, str2, str5);
            }
            if (c17 == null) {
                com.tencent.mars.xlog.Log.e(c6Var.j(), "initPAGView, PAGFile read error or isNotResumed!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initPAGView$1");
                return f0Var;
            }
            com.tencent.mm.view.MMPAGView D6 = k84.c6.D(c6Var);
            if (D6 != null) {
                D6.setComposition(c17);
            }
            com.tencent.mm.view.MMPAGView D7 = k84.c6.D(c6Var);
            if (D7 != null) {
                D7.setProgress(0.0d);
            }
            com.tencent.mm.view.MMPAGView D8 = k84.c6.D(c6Var);
            if (D8 != null) {
                D8.setRepeatCount(0);
            }
            com.tencent.mm.view.MMPAGView D9 = k84.c6.D(c6Var);
            if (D9 != null) {
                D9.setScaleMode(3);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMIsPAGValid$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            c6Var.M = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMIsPAGValid$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$initPAGView$1");
        return f0Var;
    }
}
