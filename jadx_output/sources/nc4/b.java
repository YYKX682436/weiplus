package nc4;

/* loaded from: classes4.dex */
public final class b implements nc4.c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f336120a;

    public b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f336120a = context;
    }

    @Override // nc4.c
    public db5.h4 a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildMenuItem", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        int type = type();
        android.content.Context context = this.f336120a;
        db5.h4 h4Var = new db5.h4(context, type, 0);
        h4Var.f228368i = i65.a.r(context, com.tencent.mm.R.string.f490415uc);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildMenuItem", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        return h4Var;
    }

    @Override // nc4.c
    public java.lang.Object b(yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleSelect", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        boolean l17 = gm0.j1.u().l();
        jz5.f0 f0Var = jz5.f0.f302826a;
        android.content.Context context = this.f336120a;
        if (!l17) {
            db5.t7.k(context, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleSelect", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
            return f0Var;
        }
        lVar.invoke(java.lang.Boolean.TRUE);
        if (r26.i0.p(context.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getString("gallery", "1"), "0", true)) {
            com.tencent.mm.pluginsdk.ui.tools.l7.h((android.app.Activity) context, 2, null);
        } else {
            int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsCanPickVideoFromAlbum", 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumEntrance", "takeVideo %d", new java.lang.Integer(b17));
            boolean z17 = x51.o1.f452042a;
            int i18 = b17 != 0 ? 3 : 1;
            android.content.Intent intent = new android.content.Intent();
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_enable_vlog, false);
            ((uy0.h) i95.n0.c(uy0.h.class)).getClass();
            boolean h17 = ez0.o.f257835a.h();
            boolean a17 = pc4.e.f353426a.a();
            intent.putExtra("Gallery_LivePhoto_Need_Query", a17);
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumEntrance", "enableSnsTemplate: " + h17 + " canPostLivePhoto: " + a17);
            if (h17) {
                i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_publish_template_media_num, 20);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaNum: " + i17);
            } else {
                i17 = 9;
            }
            int i19 = i17;
            intent.putExtra("key_can_select_video_and_pic", !(gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_VLOG_ENABLE_INT, 0) == 1 || fj6 || h17));
            intent.putExtra("key_edit_video_max_time_length", d11.s.fj().nj().f71195h);
            intent.putExtra("key_sns_publish_template", h17);
            intent.putExtra("key_filter_hdr_video", h17);
            intent.putExtra("gallery_report_tag", 4);
            intent.putExtra("key_check_third_party_video", true);
            intent.putExtra("KSnsFrom", 1);
            intent.putExtra("record_video_is_sight_capture", true);
            com.tencent.mm.plugin.sns.statistics.j0.f164861a.c(14);
            android.app.Activity activity = (android.app.Activity) context;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCancelCameraSheet", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil");
            boolean h18 = ih.a.h("clicfg_sns_cancel_camera_sheet", false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCancelCameraSheet", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil");
            com.tencent.mm.pluginsdk.ui.tools.l7.c(activity, 14, i19, 4, i18, h18, intent);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCancelCameraSheet", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil");
            boolean h19 = ih.a.h("clicfg_sns_cancel_camera_sheet", false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCancelCameraSheet", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil");
            if (h19) {
                activity.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleSelect", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        return f0Var;
    }

    @Override // nc4.c
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.graphics.Bitmap frameAtTime;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        if (i18 != -1 || intent == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
            return;
        }
        if (i17 == 14) {
            com.tencent.mm.plugin.sns.statistics.i0 i0Var = com.tencent.mm.plugin.sns.statistics.j0.f164861a;
            android.content.Context context = this.f336120a;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.app.Activity activity = (android.app.Activity) context;
            i0Var.f(activity);
            android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsUploadUI.class);
            intent2.putExtra("KSnsFrom", 14);
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(nc4.a.f336118d);
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_select_video_list");
            ca4.z0.C0(intent.getStringExtra("KSEGMENTMEDIAEDITID"));
            if ((stringArrayListExtra != null && stringArrayListExtra.size() > 0) || !com.tencent.mm.sdk.platformtools.t8.K0(intent.getStringExtra("K_SEGMENTVIDEOPATH"))) {
                java.lang.String stringExtra = (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) ? intent.getStringExtra("K_SEGMENTVIDEOPATH") : stringArrayListExtra.get(0);
                java.lang.String stringExtra2 = intent.getStringExtra("KSEGMENTVIDEOTHUMBPATH");
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2) || !com.tencent.mm.vfs.w6.j(stringExtra2)) {
                    java.lang.String str = com.tencent.mm.plugin.sns.model.l4.Ni() + com.tencent.mm.vfs.w6.p(stringExtra);
                    gp.d dVar = new gp.d();
                    try {
                        try {
                            dVar.setDataSource(stringExtra);
                            zj0.a aVar = new zj0.a();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            aVar.c(0L);
                            yj0.a.d(dVar, aVar.b(), "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/AlbumEntrance", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "getFrameAtTime", "(J)Landroid/graphics/Bitmap;");
                            zj0.c.f473285a.set(aVar);
                            long longValue = ((java.lang.Long) aVar.a(0)).longValue();
                            zj0.c.a();
                            frameAtTime = dVar.getFrameAtTime(longValue);
                            yj0.a.e(dVar, frameAtTime, "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/AlbumEntrance", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "getFrameAtTime", "(J)Landroid/graphics/Bitmap;");
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AlbumEntrance", "savebitmap error %s", e17.getMessage());
                        }
                        if (frameAtTime == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AlbumEntrance", "get bitmap error");
                            try {
                                dVar.release();
                            } catch (java.lang.Exception unused) {
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
                            return;
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumEntrance", "getBitmap1 %d %d", java.lang.Integer.valueOf(frameAtTime.getWidth()), java.lang.Integer.valueOf(frameAtTime.getHeight()));
                            com.tencent.mm.sdk.platformtools.x.D0(frameAtTime, 80, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
                            android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(str);
                            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumEntrance", "getBitmap2 %d %d", java.lang.Integer.valueOf(n07.outWidth), java.lang.Integer.valueOf(n07.outHeight));
                            try {
                                dVar.release();
                            } catch (java.lang.Exception unused2) {
                            }
                            stringExtra2 = str;
                        }
                    } catch (java.lang.Throwable th6) {
                        try {
                            dVar.release();
                        } catch (java.lang.Exception unused3) {
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
                        throw th6;
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AlbumEntrance", "video path %s thumb path %s and %s %s ", stringExtra, stringExtra2, java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(stringExtra)), java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(stringExtra2)));
                intent2.putExtra("key_extra_data", intent.getBundleExtra("key_extra_data"));
                intent2.putExtra("KSightPath", stringExtra);
                intent2.putExtra("KSightThumbPath", stringExtra2);
                intent2.putExtra("sight_md5", com.tencent.mm.vfs.w6.p(stringExtra));
                intent2.putExtra("KSnsPostManu", true);
                intent2.putExtra("KTouchCameraTime", com.tencent.mm.sdk.platformtools.t8.i1());
                intent2.putExtra("Ksnsupload_type", 14);
                intent2.putExtra("KSnsVideoTempalteInfo", intent.getByteArrayExtra("key_video_template_info"));
                if (intent.hasExtra("key_extra_data")) {
                    android.os.Bundle bundleExtra = intent.getBundleExtra("key_extra_data");
                    if (bundleExtra != null && bundleExtra.containsKey("key_composition_info")) {
                        intent2.putExtra("key_composition_info", bundleExtra.getByteArray("key_composition_info"));
                    }
                    if (bundleExtra != null && bundleExtra.containsKey("key_edit_video_bgm_listen_id") && bundleExtra.containsKey("key_edit_video_bgm_is_major_owned")) {
                        intent2.putExtra("key_edit_video_bgm_listen_id", bundleExtra.getString("key_edit_video_bgm_listen_id"));
                        intent2.putExtra("key_edit_video_bgm_is_major_owned", bundleExtra.getBoolean("key_edit_video_bgm_is_major_owned"));
                    }
                }
                intent2.putExtra("Kis_take_photo", false);
                dw3.u0.f244283a.b(intent2, intent);
                android.content.Context context2 = this.f336120a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/AlbumEntrance", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context2, "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/AlbumEntrance", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
                return;
            }
            java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("CropImage_OutputPath_List");
            java.util.ArrayList<? extends android.os.Parcelable> mediaList = intent.getParcelableArrayListExtra("key_select_multi_pic_item");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("imagePathSize: ");
            sb6.append(stringArrayListExtra2 != null ? java.lang.Integer.valueOf(stringArrayListExtra2.size()) : null);
            sb6.append(" liveItemList: ");
            sb6.append(mediaList != null ? java.lang.Integer.valueOf(mediaList.size()) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumEntrance", sb6.toString());
            if (stringArrayListExtra2 == null || stringArrayListExtra2.isEmpty()) {
                if (mediaList == null || mediaList.isEmpty()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AlbumEntrance", "no image selected");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
                    return;
                }
            }
            if (!(stringArrayListExtra2 == null || stringArrayListExtra2.isEmpty())) {
                i0Var.e(stringArrayListExtra2);
            }
            if (!(mediaList == null || mediaList.isEmpty())) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportYuanBaoEvent", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
                kotlin.jvm.internal.o.g(mediaList, "mediaList");
                ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.mm.plugin.sns.statistics.f0(mediaList));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportYuanBaoEvent", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            }
            java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
            intent2.putExtra("KSnsPostManu", true);
            intent2.putExtra("KTouchCameraTime", com.tencent.mm.sdk.platformtools.t8.i1());
            int intExtra = intent.getIntExtra("CropImage_filterId", 0);
            intent2.putExtra("sns_kemdia_path_list", stringArrayListExtra2);
            if (pc4.d.f353410a.B()) {
                intent2.putParcelableArrayListExtra("KMulti_Pic_Item_List", mediaList);
            }
            intent2.putExtra("KFilterId", intExtra);
            intent2.putStringArrayListExtra("sns_media_latlong_list", arrayList2);
            intent2.getIntExtra("Ksnsupload_type", -1);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(6);
            arrayList3.add(intent2);
            java.util.Collections.reverse(arrayList3);
            yj0.a.k(activity, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/AlbumEntrance", "onActivityResult", "(IILandroid/content/Intent;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
    }

    @Override // nc4.c
    public boolean show() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("show", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        return true;
    }

    @Override // nc4.c
    public int type() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("type", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        int h17 = nc4.d.f336124f.h();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("type", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.AlbumEntrance");
        return h17;
    }
}
