package k84;

/* loaded from: classes4.dex */
public final class s5 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.c6 f305247d;

    public s5(k84.c6 c6Var) {
        this.f305247d = c6Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$setAttitudeViewUI$1$2");
        jz5.l lVar = (jz5.l) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$setAttitudeViewUI$1$2");
        java.lang.Boolean bool = (java.lang.Boolean) lVar.f302833d;
        boolean booleanValue = ((java.lang.Boolean) lVar.f302834e).booleanValue();
        k84.c6 c6Var = this.f305247d;
        java.lang.String j17 = c6Var.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("icon play observe liked is ");
        sb6.append(bool);
        sb6.append(", isPlaying is ");
        sb6.append(booleanValue);
        sb6.append(", mIsDoPAGPlaying is ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMIsDoPAGPlaying$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        boolean z17 = c6Var.K;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMIsDoPAGPlaying$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        sb6.append(z17);
        sb6.append(", mIsPAGValid is ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMIsPAGValid$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        boolean z18 = c6Var.M;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMIsPAGValid$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        sb6.append(z18);
        com.tencent.mars.xlog.Log.i(j17, sb6.toString());
        boolean b17 = kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (b17) {
            com.tencent.mm.ui.widget.imageview.WeImageView C = k84.c6.C(c6Var);
            if (C != null) {
                C.setVisibility(8);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView B = k84.c6.B(c6Var);
            if (B != null) {
                B.setVisibility(0);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$stopPAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            c6Var.K();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$stopPAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMResumePAGPlaying$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            c6Var.L = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMResumePAGPlaying$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMIsPAGValid$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            boolean z19 = c6Var.M;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMIsPAGValid$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            if (!z19) {
                com.tencent.mm.ui.widget.imageview.WeImageView C2 = k84.c6.C(c6Var);
                if (C2 != null) {
                    C2.setVisibility(0);
                }
                com.tencent.mm.ui.widget.imageview.WeImageView B2 = k84.c6.B(c6Var);
                if (B2 != null) {
                    B2.setVisibility(8);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$setAttitudeViewUI$1$2");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$setAttitudeViewUI$1$2");
                return f0Var;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMIsPlayingState$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            kotlinx.coroutines.flow.j2 j2Var = c6Var.f304977J;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMIsPlayingState$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            boolean booleanValue2 = ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) j2Var).getValue()).booleanValue();
            k84.k5 k5Var = c6Var.P;
            if (booleanValue2) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMResumePAGPlaying$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                boolean z27 = c6Var.L;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMResumePAGPlaying$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                if (z27) {
                    com.tencent.mm.ui.widget.imageview.WeImageView C3 = k84.c6.C(c6Var);
                    if (C3 != null) {
                        C3.setVisibility(8);
                    }
                    com.tencent.mm.ui.widget.imageview.WeImageView B3 = k84.c6.B(c6Var);
                    if (B3 != null) {
                        B3.setVisibility(8);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$resumePAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumePAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    com.tencent.mm.view.MMPAGView H = c6Var.H();
                    if (H != null) {
                        H.setVisibility(0);
                    }
                    if (c6Var.K) {
                        com.tencent.mars.xlog.Log.w(c6Var.j(), "resumePAGPlay return");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumePAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    } else {
                        c6Var.K = true;
                        com.tencent.mm.view.MMPAGView H2 = c6Var.H();
                        if (H2 != null) {
                            H2.post(new k84.q5(c6Var));
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumePAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$resumePAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                } else {
                    com.tencent.mm.ui.widget.imageview.WeImageView C4 = k84.c6.C(c6Var);
                    if (C4 != null) {
                        C4.setVisibility(0);
                    }
                    com.tencent.mm.ui.widget.imageview.WeImageView B4 = k84.c6.B(c6Var);
                    if (B4 != null) {
                        B4.setVisibility(8);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$startPAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    com.tencent.mm.view.MMPAGView H3 = c6Var.H();
                    if (H3 != null) {
                        H3.setProgress(0.0d);
                    }
                    com.tencent.mm.view.MMPAGView H4 = c6Var.H();
                    if (H4 != null) {
                        H4.setVisibility(0);
                    }
                    if (c6Var.K) {
                        com.tencent.mars.xlog.Log.w(c6Var.j(), "startPAGPlay return");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    } else {
                        c6Var.K = true;
                        com.tencent.mm.view.MMPAGView H5 = c6Var.H();
                        if (H5 != null) {
                            H5.a(k5Var);
                        }
                        com.tencent.mm.view.MMPAGView H6 = c6Var.H();
                        if (H6 != null) {
                            H6.post(new k84.a6(c6Var));
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$startPAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMResumePAGPlaying$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                c6Var.L = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMResumePAGPlaying$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMResumePAGPlaying$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                boolean z28 = c6Var.L;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMResumePAGPlaying$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                if (z28) {
                    com.tencent.mm.ui.widget.imageview.WeImageView C5 = k84.c6.C(c6Var);
                    if (C5 != null) {
                        C5.setVisibility(8);
                    }
                    com.tencent.mm.ui.widget.imageview.WeImageView B5 = k84.c6.B(c6Var);
                    if (B5 != null) {
                        B5.setVisibility(8);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$pausePAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    com.tencent.mm.view.MMPAGView H7 = c6Var.H();
                    if (H7 != null) {
                        H7.setVisibility(0);
                    }
                    com.tencent.mm.view.MMPAGView H8 = c6Var.H();
                    if (H8 != null) {
                        H8.i(k5Var);
                    }
                    com.tencent.mm.view.MMPAGView H9 = c6Var.H();
                    if (H9 != null) {
                        H9.j(c6Var.O);
                    }
                    if (c6Var.K) {
                        c6Var.K = false;
                        com.tencent.mm.view.MMPAGView H10 = c6Var.H();
                        if (H10 != null) {
                            H10.post(new k84.p5(c6Var));
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    } else {
                        com.tencent.mars.xlog.Log.w(c6Var.j(), "pausePAGPlay return");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$pausePAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                } else {
                    com.tencent.mm.ui.widget.imageview.WeImageView C6 = k84.c6.C(c6Var);
                    if (C6 != null) {
                        C6.setVisibility(0);
                    }
                    com.tencent.mm.ui.widget.imageview.WeImageView B6 = k84.c6.B(c6Var);
                    if (B6 != null) {
                        B6.setVisibility(8);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$stopPAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    c6Var.K();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$stopPAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMResumePAGPlaying$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                    c6Var.L = false;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMResumePAGPlaying$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$setAttitudeViewUI$1$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$setAttitudeViewUI$1$2");
        return f0Var;
    }
}
