package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class o6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.i6 f170088d;

    public o6(com.tencent.mm.plugin.sns.ui.i6 i6Var) {
        this.f170088d = i6Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        int i18;
        java.lang.String str;
        java.lang.String str2;
        boolean z17;
        com.tencent.mm.plugin.sns.ui.o6 o6Var;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        com.tencent.mm.ui.MMActivity mMActivity;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.NewSightWidget$4");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/NewSightWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        com.tencent.mm.plugin.sns.ui.i6 i6Var = this.f170088d;
        boolean z18 = i6Var.A;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        com.tencent.mm.ui.MMActivity mMActivity2 = i6Var.f169957c;
        java.lang.String str7 = "com/tencent/mm/plugin/sns/ui/NewSightWidget$4";
        if (z18) {
            gm0.j1.i();
            if (!gm0.j1.u().l()) {
                db5.t7.k(mMActivity2, null);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/NewSightWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.NewSightWidget$4");
                return;
            }
            if (com.tencent.mm.plugin.sns.ui.ws.a()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                i6Var.u();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                i6Var.z();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            }
            o6Var = this;
            str6 = "com.tencent.mm.plugin.sns.ui.NewSightWidget$4";
            str4 = "(Landroid/view/View;)V";
            str5 = "onClick";
            str3 = "android/view/View$OnClickListener";
        } else {
            com.tencent.mm.plugin.sns.statistics.w0 w0Var = com.tencent.mm.plugin.sns.statistics.w0.f164989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateEditPagePlayStartTime", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoPublishReporter", "sessionId: " + com.tencent.mm.plugin.sns.statistics.w0.f164990b + ", lastTimeStamp: " + com.tencent.mm.plugin.sns.statistics.w0.f164995g + ", currentTimeStamp: " + currentTimeMillis);
            com.tencent.mm.plugin.sns.statistics.w0.f164995g = currentTimeMillis;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateEditPagePlayCnt", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
            com.tencent.mm.autogen.mmdata.rpt.SnsVideoPublishLogStruct snsVideoPublishLogStruct = com.tencent.mm.plugin.sns.statistics.w0.f164991c;
            long j17 = snsVideoPublishLogStruct.f60799i;
            snsVideoPublishLogStruct.f60799i = j17 + 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoPublishReporter", "updateEditPagePlayCnt >> sessionId: " + com.tencent.mm.plugin.sns.statistics.w0.f164991c.f60794d + ", lastCnt: " + j17 + ", currentCnt: " + com.tencent.mm.plugin.sns.statistics.w0.f164991c.f60799i);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateEditPagePlayCnt", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateEditPagePlayStartTime", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
            int[] iArr = new int[2];
            if (view != null) {
                view.getLocationInWindow(iArr);
                i17 = view.getWidth();
                i18 = view.getHeight();
            } else {
                i17 = 0;
                i18 = 0;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            int i19 = iArr[0];
            int i27 = iArr[1];
            be4.b bVar = i6Var.I;
            com.tencent.mm.ui.MMActivity mMActivity3 = bVar.f19556a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doClick", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(bVar.f19557b == null);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVLogHelper", "doClick %b", objArr);
            if (bVar.f19557b == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
                str2 = "com/tencent/mm/plugin/sns/ui/NewSightWidget$4";
                z17 = false;
            } else {
                try {
                    str2 = "com/tencent/mm/plugin/sns/ui/NewSightWidget$4";
                    try {
                        int i28 = com.tencent.mm.plugin.vlog.ui.fake.VLogFakePlayActivity.f175909g;
                        android.content.Intent intent = new android.content.Intent(mMActivity3, (java.lang.Class<?>) com.tencent.mm.plugin.vlog.ui.fake.VLogFakePlayActivity.class);
                        str = "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper";
                        try {
                            intent.putExtra("intent_taskid", bVar.f19559d);
                            intent.putExtra("intent_thumbpath", bVar.f19557b.f376185i);
                            intent.putExtra("sns_video_scene", 6);
                            intent.putExtra("img_gallery_left", i19);
                            intent.putExtra("img_gallery_top", i27);
                            intent.putExtra("img_gallery_width", i17);
                            intent.putExtra("img_gallery_height", i18);
                            mMActivity3.startActivityForResult(intent, 12);
                            mMActivity3.overridePendingTransition(0, 0);
                        } catch (java.lang.ClassNotFoundException unused) {
                        }
                    } catch (java.lang.ClassNotFoundException unused2) {
                        str = "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper";
                    }
                } catch (java.lang.ClassNotFoundException unused3) {
                    str = "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper";
                    str2 = "com/tencent/mm/plugin/sns/ui/NewSightWidget$4";
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", str);
                z17 = true;
            }
            if (z17) {
                yj0.a.h(this, str2, "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.NewSightWidget$4");
                return;
            }
            o6Var = this;
            str3 = "android/view/View$OnClickListener";
            str4 = "(Landroid/view/View;)V";
            str5 = "onClick";
            str7 = str2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            boolean z19 = i6Var.O;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            if (z19 && !com.tencent.mm.plugin.sns.ui.i6.o(i6Var).isEmpty()) {
                android.content.Intent intent2 = new android.content.Intent();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                boolean z27 = i6Var.P;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                if (z27) {
                    mMActivity = mMActivity2;
                    intent2.setClassName(mMActivity, "com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoActivity");
                } else {
                    mMActivity = mMActivity2;
                    intent2.setClassName(mMActivity, "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoActivity");
                }
                intent2.putExtra("intent_video_background_word_id", com.tencent.mm.plugin.sns.ui.i6.o(i6Var));
                intent2.putExtra("intent_video_is_preview", true);
                intent2.putExtra("intent_left", iArr[0]);
                intent2.putExtra("intent_top", iArr[1]);
                intent2.putExtra("intent_width", i17);
                intent2.putExtra("intent_height", i18);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                java.lang.String str8 = i6Var.f168570j;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                intent2.putExtra("intent_video_thumb_path", str8);
                mMActivity.startActivityForResult(intent2, 12);
                mMActivity.overridePendingTransition(0, 0);
                yj0.a.h(o6Var, str7, str3, str5, str4);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, "com.tencent.mm.plugin.sns.ui.NewSightWidget$4");
                return;
            }
            int i29 = i18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            int i37 = i17;
            java.lang.String str9 = i6Var.f168572k;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            if (!com.tencent.mm.vfs.w6.j(str9)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click videopath is not exist ");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                java.lang.String str10 = i6Var.f168572k;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                sb6.append(str10);
                com.tencent.mars.xlog.Log.i("MicroMsg.NewSightWidget", sb6.toString());
                yj0.a.h(o6Var, str7, str3, str5, str4);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, "com.tencent.mm.plugin.sns.ui.NewSightWidget$4");
                return;
            }
            str6 = "com.tencent.mm.plugin.sns.ui.NewSightWidget$4";
            android.content.Intent intent3 = new android.content.Intent(mMActivity2, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.class);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            java.lang.String str11 = i6Var.f168572k;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            intent3.putExtra("intent_videopath", str11);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            java.lang.String str12 = i6Var.f168570j;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            intent3.putExtra("intent_thumbpath", str12);
            intent3.putExtra("intent_isad", false);
            intent3.putExtra("intent_ispreview", true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            boolean z28 = i6Var.G;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            intent3.putExtra("KBlockAdd", z28);
            intent3.putExtra("sns_video_scene", 6);
            intent3.putExtra("img_gallery_left", iArr[0]);
            intent3.putExtra("img_gallery_top", iArr[1]);
            intent3.putExtra("img_gallery_width", i37);
            intent3.putExtra("img_gallery_height", i29);
            mMActivity2.startActivityForResult(intent3, 12);
            mMActivity2.overridePendingTransition(0, 0);
        }
        yj0.a.h(o6Var, str7, str3, str5, str4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str6);
    }
}
