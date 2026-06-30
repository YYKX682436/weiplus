package e33;

/* loaded from: classes10.dex */
public class u4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImagePreviewUI f247490d;

    public u4(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI) {
        this.f247490d = imagePreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider c17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI = this.f247490d;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem k17 = imagePreviewUI.f138579e.k(imagePreviewUI.f138593o.intValue());
        if (k17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "[mEditVideoBtnInNormalFooter click] raw:%s orignal:%s", k17.f138431f, k17.f138430e);
            java.lang.String str = k17.f138431f;
            imagePreviewUI.f138596p1 = str;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str) || imagePreviewUI.f138594p) {
                imagePreviewUI.f138596p1 = k17.f138430e;
                imagePreviewUI.f138606x1 = "";
            } else {
                imagePreviewUI.f138606x1 = k17.f138430e;
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImagePreviewUI", "[mEditVideoBtnInNormalFooter click] item == null mPosition:%s", imagePreviewUI.f138593o);
            imagePreviewUI.f138596p1 = imagePreviewUI.f138579e.i(imagePreviewUI.f138593o.intValue());
            long intValue = imagePreviewUI.f138593o.intValue();
            java.lang.String str2 = imagePreviewUI.f138575b2;
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem b17 = com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem.b(2, intValue, str2, str2, "video_edit");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(b17);
            t23.p0.p(arrayList2);
        }
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.t8.K0(imagePreviewUI.f138606x1) ? imagePreviewUI.f138596p1 : imagePreviewUI.f138606x1;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "editVideoMaxTimeLength : %d", java.lang.Integer.valueOf(imagePreviewUI.P));
        jz5.l Ri = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Ri();
        java.lang.Object obj = Ri.f302833d;
        java.lang.Object obj2 = Ri.f302834e;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "edit video path:%s thumb path:%s", obj, obj2);
        java.lang.String str4 = (java.lang.String) obj;
        java.lang.String str5 = (java.lang.String) obj2;
        if (imagePreviewUI.K) {
            c17 = ((ee0.b4) ((fe0.a4) i95.n0.c(fe0.a4.class))).wi(str3, imagePreviewUI.P * 1000, str4, str5, 34, imagePreviewUI.d7());
            c17.f155688z = false;
            c17.f155683u = java.lang.Boolean.TRUE;
            c17.f155685w = 600000;
            c17.M.putBoolean("key_edit_video_remux_show_progress", ((pc0.y1) ((qc0.b1) i95.n0.c(qc0.b1.class))).wi());
            com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo = new com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo();
            c17.I = videoCaptureReportInfo;
            videoCaptureReportInfo.f155690d = 1;
        } else if (imagePreviewUI.A1) {
            c17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.c(str3, "", "");
            ((pc0.s2) ((qc0.k1) i95.n0.c(qc0.k1.class))).wi(c17, true);
            c17.f155685w = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_imagepreview_c2c_edit_max_video_duration, 3600) * 1000;
            c17.f155688z = false;
            c17.f155683u = java.lang.Boolean.TRUE;
            c17.F = imagePreviewUI.r7();
            c17.a(2, "com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout");
            c17.M.putBoolean("key_edit_video_remux_show_progress", ((pc0.y1) ((qc0.b1) i95.n0.c(qc0.b1.class))).wi());
            c17.M.putBoolean("key_edit_video_need_remux_by_edit_change", true);
            c17.M.putInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 2);
        } else {
            c17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.c(str3, str4, str5);
            c17.f155685w = imagePreviewUI.P * 1000;
            c17.F = imagePreviewUI.r7();
        }
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = c17;
        recordConfigProvider.f155676n = d11.s.fj().nj();
        if (imagePreviewUI.E1) {
            recordConfigProvider.M.putInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 65);
        }
        com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
        java.util.Map map = uICustomParam.f64779h;
        ((java.util.HashMap) map).put("plugin_filter", java.lang.Boolean.TRUE);
        ((java.util.HashMap) map).put("plugin_poi", true);
        ((java.util.HashMap) map).put("plugin_tip", true);
        ((java.util.HashMap) map).put("plugin_menu", true);
        recordConfigProvider.f155677o = uICustomParam;
        if (!imagePreviewUI.B1) {
            dx1.g.f244489a.j("SnsPublishProcess", "actionTrace_", 5, bx1.u.f36311f);
            imagePreviewUI.B1 = true;
        }
        ut3.m.f431182a.f(imagePreviewUI.getContext(), 4370, com.tencent.mm.R.anim.f477876e0, -1, recordConfigProvider, 2, 0);
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
