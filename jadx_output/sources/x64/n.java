package x64;

/* loaded from: classes4.dex */
public final class n implements j41.w {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f452308a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f452309b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.WeakReference f452310c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f452311d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.SnsInfo f452312e;

    /* renamed from: f, reason: collision with root package name */
    public final int f452313f;

    /* renamed from: g, reason: collision with root package name */
    public final int f452314g;

    public n(java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2, java.lang.ref.WeakReference weakReference3, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, int i18, java.lang.String str) {
        this.f452308a = weakReference;
        this.f452309b = weakReference2;
        this.f452310c = weakReference3;
        this.f452311d = adClickActionInfo;
        this.f452312e = snsInfo;
        this.f452313f = i17;
        this.f452314g = i18;
    }

    @Override // j41.w
    public void a(j41.i0 i0Var) {
        android.content.Context context;
        android.view.View view;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$AdGetContactCallback");
        java.lang.ref.WeakReference weakReference = this.f452309b;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = weakReference != null ? (com.tencent.mm.ui.widget.dialog.u3) weakReference.get() : null;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        j41.u uVar = i0Var != null ? i0Var.f297643d : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchConfirmInfo onFinish, isValid: ");
        sb6.append(uVar != null ? java.lang.Boolean.valueOf(((k41.g0) uVar).f303996p1) : null);
        sb6.append(", confirmType: ");
        sb6.append(i0Var != null ? java.lang.Integer.valueOf(i0Var.f297644e) : null);
        sb6.append(", ");
        sb6.append(uVar != null ? ((k41.g0) uVar).t0() : null);
        com.tencent.mars.xlog.Log.i("AdJumpWxKefuClick", sb6.toString());
        java.lang.ref.WeakReference weakReference2 = this.f452308a;
        if (weakReference2 == null || (context = (android.content.Context) weakReference2.get()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$AdGetContactCallback");
            return;
        }
        java.lang.ref.WeakReference weakReference3 = this.f452310c;
        if (weakReference3 == null || (view = (android.view.View) weakReference3.get()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$AdGetContactCallback");
            return;
        }
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && activity.isFinishing()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            com.tencent.mars.xlog.Log.w("AdJumpWxKefuClick", "fetchConfirmInfo, isFinishing return");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$AdGetContactCallback");
            return;
        }
        if (uVar != null && ((k41.g0) uVar).f303996p1) {
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.f452311d;
            com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo adJumpKefuConfirmInfo = adClickActionInfo != null ? adClickActionInfo.A0 : null;
            if (adJumpKefuConfirmInfo != null) {
                java.lang.String str5 = ((k41.g0) uVar).field_smallHeadImg;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setKefuIconUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
                adJumpKefuConfirmInfo.f162624g = str5;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setKefuIconUrl", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
            }
            com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo adJumpKefuConfirmInfo2 = adClickActionInfo != null ? adClickActionInfo.A0 : null;
            if (adJumpKefuConfirmInfo2 != null) {
                java.lang.String str6 = ((k41.g0) uVar).field_nickname;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setKefuNickname", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
                adJumpKefuConfirmInfo2.f162625h = str6;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setKefuNickname", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
            }
            com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo adJumpKefuConfirmInfo3 = adClickActionInfo != null ? adClickActionInfo.A0 : null;
            if (adJumpKefuConfirmInfo3 != null) {
                java.lang.String str7 = ((k41.g0) uVar).field_openImAppId;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOpenImAppId", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
                adJumpKefuConfirmInfo3.f162626i = str7;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOpenImAppId", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
            }
            com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo adJumpKefuConfirmInfo4 = adClickActionInfo != null ? adClickActionInfo.A0 : null;
            if (adJumpKefuConfirmInfo4 != null) {
                java.lang.String str8 = ((k41.g0) uVar).field_openImDescWordingId;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOpenImDescWordingId", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
                adJumpKefuConfirmInfo4.f162627m = str8;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOpenImDescWordingId", "com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo");
            }
            boolean z17 = adClickActionInfo != null && adClickActionInfo.f162575d == 1;
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f452312e;
            if (z17) {
                n44.p pVar = new n44.p();
                int i17 = this.f452314g;
                int i18 = this.f452313f;
                str = "onFinish";
                str2 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$AdGetContactCallback";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openHalfScreenKefuConfirmUI", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                if (!(adClickActionInfo == null)) {
                    if (!(snsInfo == null)) {
                        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
                        kotlin.jvm.internal.o.f(timeLine, "getTimeLine(...)");
                        com.tencent.mm.plugin.sns.storage.ADInfo adInfo = snsInfo.getAdInfo(i18);
                        if (adInfo != null) {
                            str4 = adInfo.uxInfo;
                            str3 = "kefu_url";
                        } else {
                            str3 = "kefu_url";
                            str4 = null;
                        }
                        java.lang.String aid = snsInfo.getAid();
                        java.lang.String t07 = ca4.z0.t0(snsInfo.field_snsId);
                        com.tencent.mars.xlog.Log.i("AdHalfScreenJumpHelper", "openHalfScreenKefuConfirmUI, snsId is " + t07 + ", uxInfo is " + str4 + ", aid is " + aid);
                        if (context instanceof com.tencent.mm.ui.MMActivity) {
                            if (!(str4 == null || str4.length() == 0)) {
                                if (!(t07 == null || t07.length() == 0)) {
                                    android.content.Intent b17 = pVar.b(view, timeLine, i17, aid, str4, t07, i18);
                                    if (b17 == null) {
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openHalfScreenKefuConfirmUI", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                                    } else {
                                        b17.putExtra("scroll_to_top", 0);
                                        b17.putExtra("click_action_type", adClickActionInfo.f162571b);
                                        b17.putExtra("is_half_screen_height_assigned", 1);
                                        b17.putExtra("kefu_confirm_info", adClickActionInfo.A0);
                                        b17.putExtra(str3, adClickActionInfo.f162598o0);
                                        b17.setClass(context, com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.class);
                                        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        arrayList.add(b17);
                                        java.util.Collections.reverse(arrayList);
                                        yj0.a.d(mMActivity, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/helper/halfscreen/AdHalfScreenJumpHelper", "openHalfScreenKefuConfirmUI", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;Landroid/content/Context;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;IILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                        mMActivity.startActivity((android.content.Intent) arrayList.get(0));
                                        yj0.a.f(mMActivity, "com/tencent/mm/plugin/sns/ad/helper/halfscreen/AdHalfScreenJumpHelper", "openHalfScreenKefuConfirmUI", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;Landroid/content/Context;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;IILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                        mMActivity.overridePendingTransition(0, 0);
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openHalfScreenKefuConfirmUI", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                                    }
                                }
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openHalfScreenKefuConfirmUI", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                        } else {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openHalfScreenKefuConfirmUI", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                        }
                    }
                }
                com.tencent.mars.xlog.Log.e("AdHalfScreenJumpHelper", "openHalfScreenKefuConfirmUI, click view or clickActionInfo or snsInfo is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openHalfScreenKefuConfirmUI", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
            } else {
                str = "onFinish";
                str2 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$AdGetContactCallback";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openKefuConfirmUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
                if (!(adClickActionInfo == null)) {
                    if (!(snsInfo == null)) {
                        kotlin.jvm.internal.o.f(snsInfo.getTimeLine(), "getTimeLine(...)");
                        int i19 = this.f452313f;
                        com.tencent.mm.plugin.sns.storage.ADInfo adInfo2 = snsInfo.getAdInfo(i19);
                        java.lang.String str9 = adInfo2 != null ? adInfo2.uxInfo : null;
                        java.lang.String aid2 = snsInfo.getAid();
                        java.lang.String t08 = ca4.z0.t0(snsInfo.field_snsId);
                        com.tencent.mars.xlog.Log.i("AdJumpWxKefuClick", "openKefuConfirmUI, snsId is " + t08 + ", uxInfo is " + str9 + ", aid is " + aid2);
                        if (context instanceof com.tencent.mm.ui.MMActivity) {
                            if (!(str9 == null || str9.length() == 0)) {
                                if (!(t08 == null || t08.length() == 0)) {
                                    android.content.Intent intent = new android.content.Intent();
                                    intent.putExtra("ad_uxInfo", str9);
                                    intent.putExtra("ad_source", i19);
                                    intent.putExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_IS_HALF_SCREEN, 0);
                                    intent.putExtra("click_action_type", adClickActionInfo.f162571b);
                                    intent.putExtra("kefu_confirm_info", adClickActionInfo.A0);
                                    intent.putExtra("kefu_url", adClickActionInfo.f162598o0);
                                    intent.putExtra("scroll_to_top", 0);
                                    intent.setClass(context, com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdGeneralPageUI.class);
                                    com.tencent.mm.ui.MMActivity mMActivity2 = (com.tencent.mm.ui.MMActivity) context;
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                    arrayList2.add(intent);
                                    java.util.Collections.reverse(arrayList2);
                                    yj0.a.d(mMActivity2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/impl/AdJumpWxKefuClick", "openKefuConfirmUI", "(Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;Landroid/content/Context;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;IZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                    mMActivity2.startActivity((android.content.Intent) arrayList2.get(0));
                                    yj0.a.f(mMActivity2, "com/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/impl/AdJumpWxKefuClick", "openKefuConfirmUI", "(Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;Landroid/content/Context;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;IZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openKefuConfirmUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
                                }
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openKefuConfirmUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
                        } else {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openKefuConfirmUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
                        }
                    }
                }
                com.tencent.mars.xlog.Log.e("AdJumpWxKefuClick", "openKefuConfirmUI, click view or clickActionInfo or snsInfo is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openKefuConfirmUI", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            }
        } else {
            str = "onFinish";
            str2 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$AdGetContactCallback";
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1903, 15);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("contact is not valid, errType is ");
            sb7.append(i0Var != null ? java.lang.Integer.valueOf(i0Var.f297640a) : null);
            sb7.append(", errCode is ");
            sb7.append(i0Var != null ? java.lang.Integer.valueOf(i0Var.f297641b) : null);
            sb7.append(", errMsg is ");
            sb7.append(i0Var != null ? i0Var.f297642c : null);
            com.tencent.mars.xlog.Log.w("AdJumpWxKefuClick", sb7.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    @Override // j41.w
    public void b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTryFetch", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$AdGetContactCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick");
        com.tencent.mars.xlog.Log.i("AdJumpWxKefuClick", "onTryFetch username: %s", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTryFetch", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$AdGetContactCallback");
    }
}
