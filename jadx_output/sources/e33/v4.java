package e33;

/* loaded from: classes10.dex */
public class v4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImagePreviewUI f247517d;

    public v4(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI) {
        this.f247517d = imagePreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider c17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI = this.f247517d;
        java.lang.String i17 = imagePreviewUI.f138579e.i(imagePreviewUI.f138593o.intValue());
        if (com.tencent.mm.sdk.platformtools.t8.K0(i17)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImagePreviewUI", "get path error, position %d", imagePreviewUI.f138593o);
            yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        jz5.l Ri = ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Ri();
        java.lang.Object obj = Ri.f302833d;
        java.lang.Object obj2 = Ri.f302834e;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "edit video path:%s thumb path:%s", obj, obj2);
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = (java.lang.String) obj2;
        if (imagePreviewUI.K) {
            c17 = ((ee0.b4) ((fe0.a4) i95.n0.c(fe0.a4.class))).wi(i17, imagePreviewUI.P * 1000, str, str2, 33, imagePreviewUI.d7());
        } else {
            c17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.c(i17, str, str2);
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
        if (((com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) imagePreviewUI.f138579e.k(imagePreviewUI.f138593o.intValue())).f138446x >= (imagePreviewUI.P * 1000) + 500) {
            imagePreviewUI.C1 = true;
        }
        if (!imagePreviewUI.B1) {
            dx1.g.f244489a.j("SnsPublishProcess", "actionTrace_", 5, bx1.u.f36311f);
            imagePreviewUI.B1 = true;
        }
        ut3.m.f431182a.f(imagePreviewUI.getContext(), 4370, com.tencent.mm.R.anim.f477876e0, -1, recordConfigProvider, 2, 0);
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
