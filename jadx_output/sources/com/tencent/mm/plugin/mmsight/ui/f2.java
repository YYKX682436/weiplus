package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.SightCaptureUI f149330d;

    public f2(com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI) {
        this.f149330d = sightCaptureUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        ei3.m mVar;
        java.lang.String str;
        int d17;
        com.tencent.mm.plugin.sight.base.b d18;
        org.json.JSONObject jSONObject;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149330d;
        int i17 = sightCaptureUI.f149231g;
        if (i17 == 4) {
            int i18 = sightCaptureUI.V.f148825o;
            if (i18 == 1 || i18 == 2 || i18 == 7) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13820, java.lang.Integer.valueOf(sightCaptureUI.Y ? sightCaptureUI.Z ? 2 : 1 : 0), java.lang.Integer.valueOf(sightCaptureUI.V.f148825o), sightCaptureUI.V.f148827q, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
            }
            com.tencent.mm.plugin.mmsight.SightParams sightParams = sightCaptureUI.V;
            if (sightParams != null && sightCaptureUI.A1) {
                gi3.c.a(new gi3.a(sightParams.f148825o));
            }
            android.content.Intent intent = new android.content.Intent();
            java.lang.String filePath = sightCaptureUI.f149235m.getFilePath();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String concat = (filePath == null ? "" : filePath).concat(".thumb");
            if (sightCaptureUI.V.f148826p) {
                sightCaptureUI.W6(filePath, false);
            }
            if (di3.b.b() != null) {
                r45.vh4 vh4Var = sightCaptureUI.M;
                di3.b b17 = di3.b.b();
                if (b17.I == null) {
                    try {
                        b17.I = new org.json.JSONObject();
                        jSONObject = new org.json.JSONObject();
                        b17.I.put("wxcamera", jSONObject);
                        jSONObject.put("model", b17.f232652a);
                        jSONObject.put("apiLevel", b17.f232653b);
                        jSONObject.put("screen", java.lang.String.format("%dx%d", java.lang.Integer.valueOf(b17.f232657f), java.lang.Integer.valueOf(b17.f232658g)));
                        jSONObject.put("crop", java.lang.String.format("%dx%d", java.lang.Integer.valueOf(b17.f232663l), java.lang.Integer.valueOf(b17.f232664m)));
                        jSONObject.put("preview", java.lang.String.format("%dx%d", java.lang.Integer.valueOf(b17.f232665n), java.lang.Integer.valueOf(b17.f232666o)));
                        jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_ENCODER, java.lang.String.format("%dx%d", java.lang.Integer.valueOf(b17.f232667p), java.lang.Integer.valueOf(b17.f232668q)));
                        jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, b17.f232669r);
                        jSONObject.put("deviceoutfps", b17.f232670s);
                        jSONObject.put("recordfps", b17.f232671t);
                        jSONObject.put("recordertype", b17.f232672u);
                        jSONObject.put("needRotateEachFrame", b17.f232674w);
                        jSONObject.put("isNeedRealtimeScale", b17.f232675x);
                        jSONObject.put("resolutionLimit", b17.f232676y);
                        jSONObject.put("videoBitrate", b17.f232673v);
                        str = "album_business_bubble_media_by_coordinate_longitude";
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        str = "album_business_bubble_media_by_coordinate_longitude";
                    }
                    try {
                        jSONObject.put("wait2playtime", b17.G);
                        jSONObject.put("useback", b17.H);
                        di3.f0 f0Var = di3.w.f232770d;
                        jSONObject.put("presetIndex", f0Var != null ? f0Var.f232702c : -1);
                        jSONObject.put("recorderOption", wo.v1.f447829i.f447694h);
                    } catch (java.lang.Exception e18) {
                        e = e18;
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CaptureStatistics", e, "buildJson error", new java.lang.Object[0]);
                        vh4Var.f388238h = b17.I.toString();
                        d17 = sightCaptureUI.f149235m.d();
                        if (sightCaptureUI.A1) {
                            d17 = java.lang.Math.round(d18.f162382a / 1000.0f);
                        }
                        intent.putExtra("key_req_result", new com.tencent.mm.plugin.mmsight.SightCaptureResult(sightCaptureUI.f149233i.Q, filePath, concat, sightCaptureUI.f149235m.a(), sightCaptureUI.C1, d17, sightCaptureUI.M));
                        intent.putExtra("KSessionID", sightCaptureUI.V.f148827q);
                        intent.putExtra("latitude", sightCaptureUI.getIntent().getDoubleExtra("album_business_bubble_media_by_coordinate_latitude", 91.0d));
                        intent.putExtra("longitude", sightCaptureUI.getIntent().getDoubleExtra(str, 181.0d));
                        sightCaptureUI.setResult(-1, intent);
                        sightCaptureUI.finish();
                        yj0.a.h(this, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                } else {
                    str = "album_business_bubble_media_by_coordinate_longitude";
                }
                vh4Var.f388238h = b17.I.toString();
            } else {
                str = "album_business_bubble_media_by_coordinate_longitude";
            }
            d17 = sightCaptureUI.f149235m.d();
            if (sightCaptureUI.A1 && (d18 = com.tencent.mm.plugin.sight.base.e.d(sightCaptureUI.f149235m.getFilePath(), true)) != null) {
                d17 = java.lang.Math.round(d18.f162382a / 1000.0f);
            }
            intent.putExtra("key_req_result", new com.tencent.mm.plugin.mmsight.SightCaptureResult(sightCaptureUI.f149233i.Q, filePath, concat, sightCaptureUI.f149235m.a(), sightCaptureUI.C1, d17, sightCaptureUI.M));
            intent.putExtra("KSessionID", sightCaptureUI.V.f148827q);
            intent.putExtra("latitude", sightCaptureUI.getIntent().getDoubleExtra("album_business_bubble_media_by_coordinate_latitude", 91.0d));
            intent.putExtra("longitude", sightCaptureUI.getIntent().getDoubleExtra(str, 181.0d));
            sightCaptureUI.setResult(-1, intent);
            sightCaptureUI.finish();
        } else if (i17 == 3) {
            wu5.c cVar = sightCaptureUI.f149250x1;
            if (cVar != null && !cVar.isDone()) {
                try {
                    sightCaptureUI.f149250x1.get();
                } catch (java.lang.Exception e19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SightCaptureUI", e19, "wait saveCaptureImageThread error: %s", e19.getMessage());
                }
            }
            int i19 = sightCaptureUI.V.f148825o;
            if (i19 == 1 || i19 == 2 || i19 == 7) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13820, java.lang.Integer.valueOf(sightCaptureUI.Y ? 1 : 0), java.lang.Integer.valueOf(sightCaptureUI.V.f148825o), sightCaptureUI.V.f148827q, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
            }
            int i27 = sightCaptureUI.V.f148825o;
            if (i27 == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13858, 1, 1, 1, 0);
            } else if (i27 == 2) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13858, 2, 1, 1, 0);
            }
            android.content.Intent intent2 = new android.content.Intent();
            if (!((com.tencent.mm.sdk.platformtools.t8.K0(sightCaptureUI.I1) || (mVar = sightCaptureUI.f149235m) == null || !sightCaptureUI.I1.equals(mVar.q())) ? false : true) && sightCaptureUI.V.f148826p) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "is not Photo editted!");
                sightCaptureUI.W6(sightCaptureUI.f149235m.q(), true);
            }
            intent2.putExtra("key_req_result", new com.tencent.mm.plugin.mmsight.SightCaptureResult(sightCaptureUI.f149233i.Q, sightCaptureUI.f149235m.q()));
            intent2.putExtra("KSessionID", sightCaptureUI.V.f148827q);
            intent2.putExtra("latitude", sightCaptureUI.getIntent().getDoubleExtra("album_business_bubble_media_by_coordinate_latitude", 91.0d));
            intent2.putExtra("longitude", sightCaptureUI.getIntent().getDoubleExtra("album_business_bubble_media_by_coordinate_longitude", 181.0d));
            sightCaptureUI.setResult(-1, intent2);
            android.os.Bundle bundle = sightCaptureUI.K1;
            if (bundle == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SightCaptureUI", "[reportPhotoEdit] date == null");
            } else if (sightCaptureUI.J1) {
                int i28 = bundle.getInt("report_info_emotion_count");
                int i29 = bundle.getInt("report_info_text_count");
                int i37 = bundle.getInt("report_info_mosaic_count");
                int i38 = bundle.getInt("report_info_doodle_count");
                boolean z18 = bundle.getBoolean("report_info_iscrop");
                int i39 = bundle.getInt("report_info_undo_count");
                boolean z19 = bundle.getBoolean("report_info_is_rotation");
                com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "[reportPhotoEdit] emojiCount:%s,textCount:%s,mosaicCount:%s,penCount:%s,isCrop:%s,undoCount:%s,isRotation:%s", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(z18 ? 1 : 0), java.lang.Integer.valueOf(i39), java.lang.Boolean.valueOf(z19));
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13857, 1, 1, java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(z18 ? 1 : 0), java.lang.Integer.valueOf(i39), 3, java.lang.Integer.valueOf(z19 ? 1 : 0), sightCaptureUI.V.f148827q, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "[reportPhotoEdit] reportPhotoEdit == false");
            }
            sightCaptureUI.finish();
            sightCaptureUI.Y6(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
