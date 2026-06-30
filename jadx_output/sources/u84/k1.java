package u84;

/* loaded from: classes4.dex */
public final class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u84.m1 f425574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f425575e;

    public k1(u84.m1 m1Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f425574d = m1Var;
        this.f425575e = snsInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Object m521constructorimpl;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        boolean z17;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$setClickEvent$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/interactionlabel/AdStateSettingBarComponent$setClickEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        u84.m1 m1Var = this.f425574d;
        android.view.ViewGroup A = u84.m1.A(m1Var);
        if (!(A != null && A.getVisibility() == 0)) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/interactionlabel/AdStateSettingBarComponent$setClickEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$setClickEvent$1");
            return;
        }
        u84.o1 y17 = u84.m1.y(m1Var);
        if (y17 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getJumpLinkActionInfo", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = (com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo) ((com.tencent.mm.plugin.sns.storage.k0) y17.f425635j).a(y17, u84.o1.f425625n[2]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getJumpLinkActionInfo", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
            if (adClickActionInfo != null) {
                adClickActionInfo.f162569a = 23;
                if (adClickActionInfo.f162571b == 21) {
                    kotlin.jvm.internal.o.d(view);
                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f425575e;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$dispatchOverrideAndJump", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchOverrideAndJump", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
                    if (m1Var.f425593J == null) {
                        m1Var.f425593J = adClickActionInfo.f162610u0;
                    }
                    s34.d dVar = m1Var.f425593J;
                    if (dVar != null) {
                        adClickActionInfo.f162610u0 = dVar;
                    }
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        m521constructorimpl = kotlin.Result.m521constructorimpl(snsInfo.getAid());
                    } catch (java.lang.Throwable th6) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                    }
                    if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                        m521constructorimpl = null;
                    }
                    java.lang.String str10 = (java.lang.String) m521constructorimpl;
                    m84.z b17 = !(str10 == null || str10.length() == 0) ? m84.a0.b(str10) : null;
                    java.lang.String a17 = b17 != null ? b17.a() : null;
                    if (b17 != null) {
                        str4 = "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$setClickEvent$1";
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAvatarMd5", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAvatarMd5", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
                        str5 = b17.f324823b;
                    } else {
                        str4 = "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$setClickEvent$1";
                        str5 = null;
                    }
                    if (str10 == null || str10.length() == 0) {
                        str6 = "onClick";
                        z17 = true;
                    } else {
                        str6 = "onClick";
                        z17 = false;
                    }
                    w64.n nVar = m1Var.f425597r;
                    if (!z17 && b17 != null) {
                        if (!(a17 == null || r26.n0.N(a17))) {
                            if (str5 == null || r26.n0.N(str5)) {
                                str = "(Landroid/view/View;)V";
                                kotlinx.coroutines.y0 h17 = m1Var.h();
                                if (h17 == null) {
                                    com.tencent.mars.xlog.Log.w(m1Var.j(), "dispatchOverrideAndJump: itemScope null, fallback sync PATH C, aid=" + str10);
                                    if (nVar != null) {
                                        nVar.n(adClickActionInfo, snsInfo);
                                    }
                                    if (nVar != null) {
                                        nVar.k(view);
                                    }
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchOverrideAndJump", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
                                } else {
                                    str7 = "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent";
                                    str8 = "access$dispatchOverrideAndJump";
                                    str2 = str4;
                                    m1Var.K = kotlinx.coroutines.l.d(h17, kotlinx.coroutines.q1.f310570c.plus(u84.m1.N), null, new u84.o0(m1Var, a17, adClickActionInfo, str10, snsInfo, view, null), 2, null);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchOverrideAndJump", str7);
                                    str3 = str6;
                                    str9 = str8;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str9, str7);
                                }
                            } else {
                                str = "(Landroid/view/View;)V";
                                com.tencent.mars.xlog.Log.i(m1Var.j(), "dispatchOverrideAndJump: PATH A — sync, storage carries md5, aid=" + str10 + ", urlLen=" + a17.length() + ", md5Len=" + str5.length());
                                m1Var.K(adClickActionInfo, a17, str5, str10);
                                if (nVar != null) {
                                    nVar.n(adClickActionInfo, snsInfo);
                                }
                                if (nVar != null) {
                                    nVar.k(view);
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchOverrideAndJump", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
                            }
                            str7 = "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent";
                            str3 = str6;
                            str9 = "access$dispatchOverrideAndJump";
                            str2 = str4;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str9, str7);
                        }
                    }
                    str = "(Landroid/view/View;)V";
                    str7 = "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent";
                    str3 = str6;
                    str8 = "access$dispatchOverrideAndJump";
                    str2 = str4;
                    com.tencent.mars.xlog.Log.w(m1Var.j(), "dispatchOverrideAndJump: storage miss / blank, sync jump with XML default, aid=" + str10);
                    if (nVar != null) {
                        nVar.n(adClickActionInfo, snsInfo);
                    }
                    if (nVar != null) {
                        nVar.k(view);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchOverrideAndJump", str7);
                    str9 = str8;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str9, str7);
                } else {
                    str = "(Landroid/view/View;)V";
                    str2 = "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$setClickEvent$1";
                    str3 = "onClick";
                    w64.n D = m1Var.D();
                    if (D != null) {
                        D.n(adClickActionInfo, this.f425575e);
                    }
                    w64.n D2 = m1Var.D();
                    if (D2 != null) {
                        D2.k(view);
                    }
                }
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/interactionlabel/AdStateSettingBarComponent$setClickEvent$1", "android/view/View$OnClickListener", str3, str);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, str2);
                return;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/interactionlabel/AdStateSettingBarComponent$setClickEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$setClickEvent$1");
    }
}
