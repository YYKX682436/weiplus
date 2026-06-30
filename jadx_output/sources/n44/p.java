package n44;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public android.app.ProgressDialog f335011a;

    public static final void a(n44.p pVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$dismissDialog", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
        pVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dismissDialog", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
        android.app.ProgressDialog progressDialog = pVar.f335011a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        pVar.f335011a = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dismissDialog", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$dismissDialog", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
    }

    public final android.content.Intent b(android.view.View v17, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18) {
        int i19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createHalfScreenIntent", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(timeLineObject, "timeLineObject");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("timeline_material_outer_index", i17);
        intent.putExtra("ad_id", str);
        intent.putExtra("ad_uxInfo", str2);
        intent.putExtra("ad_snsId", str3);
        intent.putExtra("ad_source", i18);
        intent.putExtra("ad_half_screen_click_time", java.lang.System.currentTimeMillis());
        java.util.LinkedList mediaObjList = timeLineObject.ContentObj.f369840h;
        char c17 = 1;
        char c18 = 0;
        if (mediaObjList == null || mediaObjList.isEmpty()) {
            com.tencent.mars.xlog.Log.e("AdHalfScreenJumpHelper", "mediaList is null or empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createHalfScreenIntent", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
            return null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseMediaListToArrayList", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialParseHelper$Companion");
        kotlin.jvm.internal.o.g(mediaObjList, "mediaObjList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = mediaObjList.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(((r45.jj4) it.next()).toByteArray());
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("AdHalfScreenMultipleMaterialParseHelper", "parseMediaListToArrayList, e is " + e17);
            }
        }
        com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList mediaObjectList = new com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaObjectList(arrayList);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseMediaListToArrayList", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialParseHelper$Companion");
        if (mediaObjectList.a().isEmpty()) {
            com.tencent.mars.xlog.Log.e("AdHalfScreenJumpHelper", "mediaObjectList is null or empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createHalfScreenIntent", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
            return null;
        }
        intent.putExtra("media_list", mediaObjectList);
        java.lang.Object tag = v17.getTag(com.tencent.mm.R.id.v8r);
        java.util.ArrayList arrayList2 = tag instanceof java.util.ArrayList ? (java.util.ArrayList) tag : null;
        if ((arrayList2 == null || arrayList2.isEmpty()) || mediaObjectList.a().size() != arrayList2.size()) {
            com.tencent.mars.xlog.Log.e("AdHalfScreenJumpHelper", "viewPositionAndSizeList is error");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2023, 29);
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList();
            }
            arrayList2.clear();
            int size = mediaObjectList.a().size();
            int i27 = 0;
            while (i27 < size) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addViewSizeAndPositionInList", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialParseHelper$Companion");
                int[] iArr = new int[2];
                if (com.tencent.mm.ui.bk.y()) {
                    v17.getLocationOnScreen(iArr);
                } else {
                    v17.getLocationInWindow(iArr);
                }
                arrayList2.add(new com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize(iArr[c18], iArr[c17], v17.getWidth(), v17.getHeight()));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addViewSizeAndPositionInList", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialParseHelper$Companion");
                i27++;
                c17 = 1;
                c18 = 0;
            }
            if (arrayList2.isEmpty() || mediaObjectList.a().size() != arrayList2.size()) {
                com.tencent.mars.xlog.Log.e("AdHalfScreenJumpHelper", "viewPositionAndSizeList is empty, or dataList size is not equals viewPositionAndSizeList size");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2023, 30);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createHalfScreenIntent", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                return null;
            }
            i19 = 0;
        } else {
            i19 = 0;
        }
        intent.putExtra("view_position_and_size_list", (android.os.Parcelable[]) arrayList2.toArray(new com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize[i19]));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createHalfScreenIntent", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
        return intent;
    }

    public final void c(android.view.View view, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, android.content.Context context, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.modelsns.SnsAdClick snsAdClick, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4) {
        java.lang.String str5;
        java.lang.String str6;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpH5", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
        kotlin.jvm.internal.o.g(snsAdClick, "snsAdClick");
        if (!(view == null)) {
            if (!(adClickActionInfo == null)) {
                if (!(snsInfo == null)) {
                    com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
                    kotlin.jvm.internal.o.f(timeLine, "getTimeLine(...)");
                    com.tencent.mars.xlog.Log.i("AdHalfScreenJumpHelper", "jumpH5, snsId is " + str3 + ", uxInfo is " + str + ", aid is " + str2);
                    if (!(context instanceof com.tencent.mm.ui.MMActivity)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpH5", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                        return;
                    }
                    if (!(str == null || str.length() == 0)) {
                        if (!(str3 == null || str3.length() == 0)) {
                            android.content.Intent b17 = b(view, timeLine, i17, str2, str, str3, i18);
                            if (b17 == null) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpH5", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                                return;
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateHalfScreenH5Intent", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                            java.lang.String str7 = "";
                            if (adClickActionInfo == null) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateHalfScreenH5Intent", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                                str5 = "jumpH5";
                            } else {
                                java.lang.String str8 = adClickActionInfo.f162573c;
                                com.tencent.mars.xlog.Log.i("AdHalfScreenJumpHelper", "updateHalfScreenH5Intent, url is " + str8 + ", source is " + i18 + ", snsInfo is " + snsInfo + ", notAppendParamsToActionLink is " + adClickActionInfo.f162579f);
                                if (str8 == null || str8.length() == 0) {
                                    str5 = "jumpH5";
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateHalfScreenH5Intent", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                                } else {
                                    com.tencent.mm.plugin.sns.storage.ADInfo adInfo = snsInfo.getAdInfo(i18);
                                    if (adInfo != null) {
                                        java.lang.String uxInfo = adInfo.uxInfo;
                                        kotlin.jvm.internal.o.f(uxInfo, "uxInfo");
                                        if (adClickActionInfo.f162579f) {
                                            kotlin.jvm.internal.o.d(str8);
                                            str5 = "jumpH5";
                                        } else {
                                            java.lang.String D = ca4.m0.D(uxInfo);
                                            java.lang.String P = ca4.m0.P(uxInfo);
                                            if (!(D.length() == 0)) {
                                                if (!(P.length() == 0)) {
                                                    str5 = "jumpH5";
                                                    str7 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.b(str8, "traceid=" + P + "&aid=" + D);
                                                    kotlin.jvm.internal.o.f(str7, "appendUri(...)");
                                                    str8 = ca4.z0.b(str7, adInfo.uxInfo);
                                                    kotlin.jvm.internal.o.f(str8, "appendAdUxInfo(...)");
                                                }
                                            }
                                            str5 = "jumpH5";
                                            str8 = ca4.z0.b(str7, adInfo.uxInfo);
                                            kotlin.jvm.internal.o.f(str8, "appendAdUxInfo(...)");
                                        }
                                        java.lang.String e17 = f44.a.e(str8);
                                        kotlin.jvm.internal.o.f(e17, "usePrefetch(...)");
                                        b17.putExtra("KsnsViewId", adInfo.viewId);
                                        ca4.z0.c(b17, adInfo.uxInfo);
                                        com.tencent.mars.xlog.Log.i("AdHalfScreenJumpHelper", "updateHalfScreenH5Intent, updateUrl is " + e17 + ", uxInfo is " + uxInfo);
                                        str6 = e17;
                                        str7 = uxInfo;
                                    } else {
                                        str5 = "jumpH5";
                                        com.tencent.mars.xlog.Log.e("AdHalfScreenJumpHelper", "updateHalfScreenH5Intent, adInfo is null");
                                        str6 = "";
                                    }
                                    android.os.Bundle bundle = new android.os.Bundle();
                                    bundle.putParcelable("KSnsAdTag", snsAdClick);
                                    bundle.putString("key_snsad_statextstr", snsInfo.getTimeLine().statExtStr);
                                    if (str7.length() > 0) {
                                        bundle.putString("KAnsUxInfo", str7);
                                    }
                                    b17.putExtra("jsapiargs", bundle);
                                    b17.putExtra("rawUrl", str6);
                                    b17.putExtra("useJs", true);
                                    b17.putExtra("srcUsername", snsInfo.field_userName);
                                    b17.putExtra("stastic_scene", 15);
                                    java.lang.String str9 = "sns_" + ca4.z0.t0(snsInfo.field_snsId);
                                    b17.putExtra("KPublisherId", str9);
                                    b17.putExtra("pre_username", snsInfo.field_userName);
                                    b17.putExtra("prePublishId", str9);
                                    b17.putExtra("preUsername", snsInfo.field_userName);
                                    if (i18 == 0) {
                                        ca4.z0.a(b17, 81);
                                    } else {
                                        ca4.z0.a(b17, 82);
                                    }
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateHalfScreenH5Intent", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                                    str7 = str6;
                                }
                            }
                            b17.putExtra("can_show_common_more_btn", adClickActionInfo.f162581g);
                            b17.putExtra("h5_url", str7);
                            b17.putExtra("is_half_screen_height_assigned", 0);
                            b17.putExtra("scroll_to_top", 1);
                            b17.putExtra("click_action_type", adClickActionInfo.f162571b);
                            b17.putExtra("half_screen_min_height_percent", adClickActionInfo.f162577e);
                            b17.setClass(context, com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.class);
                            com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(b17);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(mMActivity, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/helper/halfscreen/AdHalfScreenJumpHelper", "jumpH5", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;Landroid/content/Context;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/modelsns/SnsAdClick;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            mMActivity.startActivity((android.content.Intent) arrayList.get(0));
                            yj0.a.f(mMActivity, "com/tencent/mm/plugin/sns/ad/helper/halfscreen/AdHalfScreenJumpHelper", "jumpH5", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/ad/adxml/AdClickActionInfo;Landroid/content/Context;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/modelsns/SnsAdClick;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            mMActivity.overridePendingTransition(0, 0);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                            return;
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpH5", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("AdHalfScreenJumpHelper", "jumpH5, click view or clickActionInfo or snsInfo is null");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpH5", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
    }

    public final void d(android.view.View view, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, com.tencent.mm.ui.MMActivity activity, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openHalfScreenWeComProfile", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
        kotlin.jvm.internal.o.g(activity, "activity");
        if (!(view == null)) {
            if (!(adClickActionInfo == null)) {
                if (!(snsInfo == null)) {
                    s34.p1 p1Var = adClickActionInfo.f162612v0;
                    if (p1Var == null) {
                        com.tencent.mars.xlog.Log.e("AdHalfScreenJumpHelper", "openHalfScreenWeComProfile, qrInfo is null");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openHalfScreenWeComProfile", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("AdHalfScreenJumpHelper", "openHalfScreenWeComProfile and qrUrl is " + p1Var.a() + ", snsId is " + str3 + ", uxInfo is " + str + ", aid is " + str2);
                    java.lang.String a17 = p1Var.a();
                    if (a17 == null || a17.length() == 0) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openHalfScreenWeComProfile", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                        return;
                    }
                    com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
                    kotlin.jvm.internal.o.f(timeLine, "getTimeLine(...)");
                    if (!(str == null || str.length() == 0)) {
                        if (!(str3 == null || str3.length() == 0)) {
                            android.content.Intent b17 = b(view, timeLine, i17, str2, str, str3, i18);
                            if (b17 == null) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openHalfScreenWeComProfile", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                                return;
                            }
                            int i19 = adClickActionInfo.f162571b;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doHalfScreenWeComProfile", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                            r45.bx5 bx5Var = new r45.bx5();
                            r45.u2 u2Var = new r45.u2();
                            u2Var.f386952d = (i18 == 0 || i18 == 1 || i18 == 2) ? 1 : 0;
                            u2Var.f386953e = ca4.z0.F0(str2);
                            bx5Var.f371136h = u2Var;
                            com.tencent.mars.xlog.Log.i("AdHalfScreenJumpHelper", "doHalfScreenWeComProfile, qrUrl is " + p1Var.a() + ", long type aid is " + bx5Var.f371136h.f386953e + ", source is " + i18);
                            ab0.b0 b0Var = (ab0.b0) i95.n0.c(ab0.b0.class);
                            java.lang.String a18 = p1Var.a();
                            ((za0.k) b0Var).getClass();
                            l41.e0 e0Var = new l41.e0(a18, 10, bx5Var);
                            java.lang.String string = activity.getString(com.tencent.mm.R.string.f493179ly3);
                            kotlin.jvm.internal.o.f(string, "getString(...)");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showTipsDialog$default", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showTipsDialog", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                            android.app.ProgressDialog progressDialog = this.f335011a;
                            if (progressDialog != null) {
                                progressDialog.dismiss();
                            }
                            this.f335011a = db5.e1.Q(activity, "", string, true, true, new n44.o(null));
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showTipsDialog", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showTipsDialog$default", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                            if (android.os.Build.VERSION.SDK_INT >= 29) {
                                activity.registerActivityLifecycleCallbacks(new n44.j(this));
                            }
                            v65.i.c(new com.tencent.mm.sdk.coroutines.LifecycleScope("doHalfScreenWeComProfile", activity, 0, 4, null), null, new n44.l(this, e0Var, b17, i19, activity, str, str3, str2, i18, p1Var, str4, null), 1, null);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doHalfScreenWeComProfile", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openHalfScreenWeComProfile", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                            return;
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openHalfScreenWeComProfile", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("AdHalfScreenJumpHelper", "openHalfScreenWeComProfile, click view or clickActionInfo or snsInfo is null");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openHalfScreenWeComProfile", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper");
    }
}
