package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class kj {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f169635c = new java.util.ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f169636a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final android.app.Activity f169637b;

    public kj(android.app.Activity activity) {
        this.f169637b = activity;
    }

    public static boolean a(java.lang.String str, int i17, java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initDataMediaList", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.storage.l1.b(str);
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[initDataMediaList] snsinfo is null! localId:%s index:%ss", str, java.lang.Integer.valueOf(i17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initDataMediaList", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return false;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = b17.getTimeLine();
        r45.a90 a90Var = timeLine.ContentObj;
        if (a90Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[initDataMediaList] timeline.ContentObj is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initDataMediaList", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return false;
        }
        if (a90Var.f369840h.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[initDataMediaList] timeline.ContentObj.MediaObjList.size() == 0");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initDataMediaList", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return false;
        }
        list.clear();
        java.util.Iterator it = timeLine.ContentObj.f369840h.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            r45.jj4 jj4Var = (r45.jj4) it.next();
            list.add(jj4Var);
            if (i17 == i18 && !com.tencent.mm.plugin.sns.model.l4.hj().A(jj4Var)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[initDataMediaList] is not exists");
                if (pc4.d.f353410a.k()) {
                    com.tencent.mm.autogen.events.SnsReDownloadEvent snsReDownloadEvent = new com.tencent.mm.autogen.events.SnsReDownloadEvent();
                    snsReDownloadEvent.f54832g.f7580a = ca4.z0.t0(b17.field_snsId);
                    snsReDownloadEvent.e();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initDataMediaList", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
                return false;
            }
            i18++;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initDataMediaList", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        return true;
    }

    public static void c(android.app.Activity activity, android.content.Intent intent, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ui.oj ojVar, int i17, int i18, com.tencent.mm.plugin.sns.model.k4 k4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] intent is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return;
        }
        if (k4Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] snsContext is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return;
        }
        if (snsInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] info is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return;
        }
        gm0.j1.i();
        if (!gm0.j1.u().l()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] is not SDCardAvailable");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return;
        }
        java.lang.String str = ojVar.f170102a;
        int i19 = ojVar.f170103b;
        int i27 = ojVar.f170104c;
        r45.a90 a90Var = snsInfo.getTimeLine().ContentObj;
        if (a90Var == null || a90Var.f369840h.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] is ContentObj null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return;
        }
        if (k4Var.a() != null) {
            k4Var.a().e(snsInfo);
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
        r45.jj4 jj4Var = i19 < timeLine.ContentObj.f369840h.size() ? (r45.jj4) timeLine.ContentObj.f369840h.get(i19) : new r45.jj4();
        if (!com.tencent.mm.plugin.sns.model.l4.hj().A(jj4Var)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] media[%s] is illegal", java.lang.Integer.valueOf(jj4Var.f377870s));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return;
        }
        if (i17 == 1) {
            m21.w.d(716);
        } else {
            m21.w.c(716);
        }
        ca4.z0.T(snsInfo);
        snsInfo.isAd();
        snsInfo.getUxinfo();
        java.lang.String str2 = jj4Var.f377855d;
        timeLine.ContentObj.f369840h.size();
        m21.w d17 = i17 == 1 ? m21.w.d(744) : m21.w.c(744);
        ca4.z0.T(snsInfo);
        snsInfo.isAd();
        snsInfo.getUxinfo();
        d17.g(intent);
        intent.putExtra("sns_soon_enter_photoedit_ui", true);
        intent.putExtra("sns_gallery_localId", str);
        intent.putExtra("sns_gallery_position", i19);
        intent.putExtra("sns_position", i27);
        intent.putExtra("sns_gallery_showtype", 1);
        intent.putExtra("K_ad_scene", i17);
        intent.putExtra("K_ad_source", i18);
        intent.putExtra("k_is_from_sns_main_timeline", true);
        if (i17 == -1) {
            intent.putExtra("key_from_scene", 3);
        } else if (i17 == 1) {
            intent.putExtra("key_from_scene", 1);
        } else if (i17 == 2) {
            intent.putExtra("key_from_scene", 2);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("stat_scene", 3);
        bundle.putString("stat_msg_id", "sns_" + ca4.z0.t0(snsInfo.field_snsId));
        bundle.putString("stat_send_msg_user", snsInfo.getUserName());
        bundle.putInt("pay_qrcode_session_type", 3);
        bundle.putString("pay_qrcode_session_name", snsInfo.getUserName());
        bundle.putString("pay_qrcode_timeline_objid", ca4.z0.t0(snsInfo.field_snsId));
        bundle.putString("pay_qrcode_sender_username", snsInfo.getUserName());
        intent.putExtra("_stat_obj", bundle);
        com.tencent.mm.plugin.sns.ui.SnsBrowseUI.w7(activity, intent, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
    }

    public void b(java.lang.String str, r45.jj4 jj4Var, java.lang.String str2, int i17, long j17, int[] iArr, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showCommentImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        gm0.j1.i();
        if (!gm0.j1.u().l()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] isSDCardAvailable:false");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showCommentImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_from_scene", 8);
        try {
            intent.putExtra("K_media_obj", jj4Var.toByteArray());
        } catch (java.lang.Exception unused) {
        }
        intent.putExtra("sns_gallery_showtype", 1);
        intent.putExtra("K_ad_scene", 8);
        intent.putExtra("K_source", 8);
        intent.putExtra("K_ad_source", i17);
        intent.putExtra("sns_gallery_userName", str2);
        int i27 = iArr[0];
        int i28 = iArr[1];
        intent.putExtra("sns_gallery_thumb_location", new android.graphics.Rect(i27, i28, i18 + i27, i19 + i28));
        intent.putExtra("sns_ad_exposure_start_time", j17);
        com.tencent.mm.plugin.sns.ui.SnsBrowseUI.w7(this.f169637b, intent, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showCommentImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
    }

    public void d(android.view.View view, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        e(view, i17, i18, null, 0L, false, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
    }

    public void e(android.view.View view, int i17, int i18, com.tencent.mm.plugin.sns.model.l7 l7Var, long j17, boolean z17, int i19) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.SnsImageDialogShowerMgr", "showImg", new java.lang.Object[0]);
        if (view == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] view is null! scene:%s", java.lang.Integer.valueOf(i17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
            return;
        }
        java.lang.Object tag = view.getTag();
        if (tag instanceof com.tencent.mm.plugin.sns.ui.oj) {
            com.tencent.mm.plugin.sns.ui.oj ojVar = (com.tencent.mm.plugin.sns.ui.oj) tag;
            java.lang.String str5 = ojVar.f170102a;
            int i27 = ojVar.f170103b;
            int i28 = ojVar.f170104c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isForbidAccess", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
            boolean z18 = ojVar.f170106e == 2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isForbidAccess", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
            java.util.List list = this.f169636a;
            if (!a(str5, i27, list)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] initDataMediaList, localId:%s position:%s", str5, java.lang.Integer.valueOf(i27));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
                return;
            }
            gm0.j1.i();
            if (!gm0.j1.u().l()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] isSDCardAvailable:false");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
                return;
            }
            com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.storage.l1.b(str5);
            if (!a(str5, i27, list)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] initDataMediaList, localId:%s position:%s", str5, java.lang.Integer.valueOf(i27));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            if (b17 != null) {
                if (l7Var != null) {
                    l7Var.a().e(b17);
                }
                com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = b17.getTimeLine();
                r45.jj4 jj4Var = ojVar.f170103b < timeLine.ContentObj.f369840h.size() ? (r45.jj4) timeLine.ContentObj.f369840h.get(ojVar.f170103b) : new r45.jj4();
                if (i17 == 1) {
                    m21.w.d(716);
                } else {
                    m21.w.c(716);
                }
                ca4.z0.T(b17);
                b17.isAd();
                b17.getUxinfo();
                java.lang.String str6 = jj4Var.f377855d;
                timeLine.ContentObj.f369840h.size();
                m21.w d17 = i17 == 1 ? m21.w.d(744) : m21.w.c(744);
                ca4.z0.T(b17);
                b17.isAd();
                b17.getUxinfo();
                d17.g(intent);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("stat_scene", 3);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sns_");
                str3 = "showImg";
                str4 = "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr";
                sb6.append(ca4.z0.t0(b17.field_snsId));
                bundle.putString("stat_msg_id", sb6.toString());
                bundle.putString("stat_send_msg_user", b17.getUserName());
                bundle.putInt("pay_qrcode_session_type", 3);
                bundle.putString("pay_qrcode_sender_username", b17.getUserName());
                bundle.putString("pay_qrcode_session_name", b17.getUserName());
                bundle.putString("pay_qrcode_timeline_objid", ca4.z0.t0(b17.field_snsId));
                intent.putExtra("_stat_obj", bundle);
            } else {
                str3 = "showImg";
                str4 = "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr";
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] info is null!");
            }
            int[] iArr = new int[2];
            if (com.tencent.mm.ui.bk.y()) {
                view.getLocationOnScreen(iArr);
            } else {
                view.getLocationInWindow(iArr);
            }
            int width = view.getWidth();
            int height = view.getHeight();
            if (i17 == -1) {
                intent.putExtra("k_is_from_sns_msg_ui", true);
            }
            if (i17 == -1) {
                intent.putExtra("key_from_scene", 3);
            } else if (i17 == 1) {
                intent.putExtra("key_from_scene", 1);
            } else if (i17 == 2) {
                intent.putExtra("key_from_scene", 2);
            }
            intent.putExtra("sns_gallery_localId", str5);
            intent.putExtra("sns_gallery_position", i27);
            intent.putExtra("sns_position", i28);
            intent.putExtra("sns_gallery_showtype", 1);
            intent.putExtra("K_ad_scene", i17);
            intent.putExtra("K_source", i17);
            intent.putExtra("K_ad_source", i18);
            intent.putExtra("k_is_from_sns_main_timeline", ojVar.f170105d);
            int i29 = iArr[0];
            int i37 = iArr[1];
            intent.putExtra("sns_gallery_thumb_location", new android.graphics.Rect(i29, i37, width + i29, height + i37));
            intent.putExtra("sns_ad_exposure_start_time", j17);
            intent.putExtra("k_forbid_access", z18);
            intent.putExtra("k_feedid_need_check_forbid_access", ojVar.f170107f);
            if (z17) {
                android.app.Activity activity = this.f169637b;
                int i38 = com.tencent.mm.plugin.sns.ui.SnsBrowseUI.Q1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startActivityForResult", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepare", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                intent.setClass(activity, com.tencent.mm.plugin.sns.ui.SnsBrowseUI.class);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepare", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i19));
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsBrowseUI", "startActivityForResult", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startActivityForResult", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            } else {
                com.tencent.mm.plugin.sns.ui.SnsBrowseUI.w7(this.f169637b, intent, null);
            }
            str = str3;
            str2 = str4;
        } else {
            str = "showImg";
            str2 = "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }
}
