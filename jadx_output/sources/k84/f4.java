package k84;

/* loaded from: classes4.dex */
public abstract class f4 {
    public static void a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, u74.d dVar) {
        android.view.ViewStub viewStub;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkAttractAnimationView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        if ((d(snsInfo) || snsInfo.isFireworkCheerAd()) && !snsInfo.useNewAdSocialLogic()) {
            if (dVar.M == null && (viewStub = dVar.L) != null) {
                dVar.M = (com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView) viewStub.inflate();
            }
            com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView adAttitudeAttractView = dVar.M;
            if (adAttitudeAttractView != null) {
                dVar.H.setOnCancelAttractAnimationListener(adAttitudeAttractView);
                com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView adAttitudeAttractView2 = dVar.M;
                adAttitudeAttractView2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                java.lang.String snsId = snsInfo.getSnsId();
                if (com.tencent.mm.sdk.platformtools.t8.K0(snsId)) {
                    com.tencent.mars.xlog.Log.e("AdAttitudeAttractView", "resetUI, snsId is null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                } else if (com.tencent.mm.sdk.platformtools.t8.D0(snsId, adAttitudeAttractView2.f163404i)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                } else {
                    adAttitudeAttractView2.f163404i = snsId;
                    adAttitudeAttractView2.f163399d = snsInfo;
                    adAttitudeAttractView2.f163400e = dVar;
                    u74.c cVar = dVar.T;
                    if (cVar != null) {
                        int i17 = cVar.f425131a;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                        if (i17 == 0) {
                            adAttitudeAttractView2.f163416x = i65.a.b(adAttitudeAttractView2.getContext(), 14);
                            adAttitudeAttractView2.f163417y = i65.a.b(adAttitudeAttractView2.getContext(), 56);
                            adAttitudeAttractView2.f163418z = adAttitudeAttractView2.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.i_);
                        } else {
                            android.content.Context context = adAttitudeAttractView2.f163401f;
                            adAttitudeAttractView2.f163416x = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.i_);
                            adAttitudeAttractView2.f163417y = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.aa7) + context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl);
                            adAttitudeAttractView2.f163418z = adAttitudeAttractView2.f163416x;
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                    }
                    adAttitudeAttractView2.f163403h = false;
                    ((kotlinx.coroutines.flow.h3) adAttitudeAttractView2.E).k(java.lang.Boolean.FALSE);
                    adAttitudeAttractView2.D = false;
                    adAttitudeAttractView2.f163405m = null;
                    adAttitudeAttractView2.j();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                }
            }
        } else {
            com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView adAttitudeAttractView3 = dVar.M;
            if (adAttitudeAttractView3 != null) {
                adAttitudeAttractView3.setVisibility(8);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAttractAnimationView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
    }

    public static void b(u74.d dVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ui.listener.i iVar, com.tencent.mm.plugin.sns.ui.item.y yVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkShowAdAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        try {
            if (!g(snsInfo) || snsInfo.useNewAdSocialLogic()) {
                com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView adAttitudeAttractView = dVar.M;
                if (adAttitudeAttractView != null) {
                    adAttitudeAttractView.setVisibility(8);
                }
                com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = dVar.H;
                if (adSocialAttitudeView != null) {
                    adSocialAttitudeView.setVisibility(8);
                }
                com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView adAttitudePlayView = dVar.O;
                if (adAttitudePlayView != null) {
                    adAttitudePlayView.setVisibility(8);
                }
                if (snsInfo != null && !snsInfo.useNewAdSocialLogic()) {
                    f(0, dVar);
                }
            } else {
                boolean k17 = mb4.r.k(snsInfo);
                if (dVar.O == null) {
                    dVar.O = (com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView) dVar.N.inflate();
                }
                if (!dVar.E && !k17) {
                    dVar.G = (com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView) dVar.F.inflate();
                    dVar.E = true;
                }
                if (!dVar.I && k17) {
                    dVar.K = (com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView) dVar.f425139J.inflate();
                    dVar.I = true;
                }
                com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView2 = dVar.G;
                if (adSocialAttitudeView2 != null) {
                    adSocialAttitudeView2.setOnShowAttitudeListener(null);
                }
                if (k17) {
                    dVar.H = dVar.K;
                    com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView3 = dVar.G;
                    if (adSocialAttitudeView3 != null) {
                        adSocialAttitudeView3.setVisibility(8);
                    }
                } else {
                    dVar.H = dVar.G;
                    com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView4 = dVar.K;
                    if (adSocialAttitudeView4 != null) {
                        adSocialAttitudeView4.setVisibility(8);
                    }
                }
                dVar.H.setOnShowAttitudeListener(dVar.O);
                dVar.O.setOnAnimationStatusListener(dVar.H);
                a(snsInfo, dVar);
                f(8, dVar);
                dVar.H.setTag(yVar);
                dVar.H.setOnCommentClickListener(iVar);
                dVar.H.setVisibility(0);
                dVar.H.n(snsInfo, dVar.T.f425131a, dVar.B, dVar.C, dVar.D);
                dVar.O.e(dVar, snsInfo);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdSocialAttitudeHelper", "checkShowAdAttitude exp: " + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowAdAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
    }

    public static void c(int i17, u74.d dVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkStartPlayAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        try {
            if (!g(snsInfo)) {
                com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView adAttitudeAttractView = dVar.M;
                if (adAttitudeAttractView != null) {
                    adAttitudeAttractView.setVisibility(8);
                }
            } else if (h(snsInfo, i17, dVar)) {
                if (dVar.T.f425137g) {
                    com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = dVar.H;
                    if (adSocialAttitudeView != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasShowAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        boolean z17 = adSocialAttitudeView.f163452p1;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasShowAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                        if (!z17) {
                            com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView2 = dVar.H;
                            adSocialAttitudeView2.getClass();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlayIconAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                            adSocialAttitudeView2.u(true);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlayIconAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                            com.tencent.mars.xlog.Log.i("AdSocialAttitudeHelper", "checkStartPlayAttractAnimation, but isMagicWindowUseAd, only start play icon attract animation");
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkStartPlayAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
                    return;
                }
                com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView adAttitudeAttractView2 = dVar.M;
                if (adAttitudeAttractView2 != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasShowAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                    boolean z18 = adAttitudeAttractView2.f163403h;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasShowAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView");
                    if (!z18) {
                        dVar.M.h(snsInfo);
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdSocialAttitudeHelper", "checkStartPlayAttractAnimation exp: " + th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkStartPlayAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
    }

    public static boolean d(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasAdAttractAnimationInfo", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        boolean z17 = g(snsInfo) && (snsInfo.getAdXml().adSocialInfo.attractingAnimationInfo != null || snsInfo.isFireworkCheerAd());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasAdAttractAnimationInfo", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        return z17;
    }

    public static boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLikedHapticFeedback", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_social_comp_liked_haptic_feedback, 1);
            com.tencent.mars.xlog.Log.i("AdSocialAttitudeHelper", "isLikedHapticFeedback is " + Ni);
            boolean z17 = Ni == 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLikedHapticFeedback", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdSocialAttitudeHelper", "isLikedHapticFeedback, exp is " + th6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLikedHapticFeedback", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
            return false;
        }
    }

    public static void f(int i17, u74.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCommentVisibility", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        if (dVar.T.f425131a == 0) {
            android.widget.ImageView imageView = (android.widget.ImageView) dVar.f425163x.findViewById(com.tencent.mm.R.id.f482894r2);
            if (imageView != null) {
                imageView.setVisibility(i17);
            }
        } else {
            android.widget.ImageButton imageButton = (android.widget.ImageButton) dVar.f425163x.findViewById(com.tencent.mm.R.id.f482894r2);
            if (imageButton != null) {
                imageButton.setVisibility(i17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCommentVisibility", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
    }

    public static boolean g(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showAdAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        boolean z17 = snsInfo != null && snsInfo.isSocialAttitudeAd();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showAdAttitude", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        return z17;
    }

    public static boolean h(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, u74.d dVar) {
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showAdAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        if (!d(snsInfo)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showAdAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
            return false;
        }
        if (dVar == null || dVar.H == null) {
            com.tencent.mars.xlog.Log.e("AdSocialAttitudeHelper", "showAdAttractAnimation, viewHolder or showAdAttitudeView is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showAdAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
            return false;
        }
        mb4.c cVar = snsInfo.getAdXml().adSocialInfo;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAttractDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo");
        mb4.r rVar = cVar.f325388m;
        if (rVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAttractDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
            i18 = rVar.f325461h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAttractDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAttractDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo");
        } else {
            mb4.b bVar = cVar.attractingAnimationInfo;
            if (bVar != null) {
                i18 = bVar.f325371a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAttractDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAttractDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.AdSocialInfo");
                i18 = 0;
            }
        }
        if (i17 < i18 || i17 >= i18 + 1000) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showAdAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
            return false;
        }
        boolean m17 = dVar.H.m();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showAdAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeHelper");
        return m17;
    }
}
