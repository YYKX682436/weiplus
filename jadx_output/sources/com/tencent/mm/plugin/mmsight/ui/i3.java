package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class i3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.SightCaptureUI f149346d;

    public i3(com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI) {
        this.f149346d = sightCaptureUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149346d;
        int i17 = sightCaptureUI.f149231g;
        if (i17 == 3) {
            sightCaptureUI.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "[gotoPhotoEditUI]");
            if (sightCaptureUI.f149235m == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SightCaptureUI", "mediaRecorder == NULL");
            } else {
                java.lang.String stringExtra = sightCaptureUI.getIntent().getStringExtra("GalleryUI_FromUser");
                java.lang.String stringExtra2 = sightCaptureUI.getIntent().getStringExtra("GalleryUI_ToUser");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("GalleryUI_FromUser", stringExtra);
                intent.putExtra("GalleryUI_ToUser", stringExtra2);
                int i18 = sightCaptureUI.V.f148825o;
                if (i18 == 1) {
                    intent.putExtra("from_scene", com.tencent.mm.plugin.appbrand.jsapi.audio.a0.CTRL_INDEX);
                } else if (i18 == 2) {
                    intent.putExtra("from_scene", 289);
                }
                intent.putExtra("raw_photo_path", com.tencent.mm.sdk.platformtools.t8.K0(sightCaptureUI.H1) ? sightCaptureUI.f149235m.q() : sightCaptureUI.H1);
                intent.putExtra("after_photo_edit", sightCaptureUI.I1);
                intent.setClassName(sightCaptureUI, "com.tencent.mm.ui.MMNewPhotoEditUI");
                sightCaptureUI.startActivityForResult(intent, 4369);
            }
        } else if (i17 == 4) {
            sightCaptureUI.getClass();
            if (com.tencent.mm.ui.bl.f(sightCaptureUI)) {
                sightCaptureUI.setSelfNavigationBarVisible(0);
            }
            sightCaptureUI.I = (com.tencent.mm.plugin.mmsight.ui.VideoSeekBarEditorView) sightCaptureUI.findViewById(com.tencent.mm.R.id.p09);
            if (com.tencent.mm.ui.bl.f(sightCaptureUI)) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) sightCaptureUI.I.getLayoutParams();
                marginLayoutParams.bottomMargin = java.lang.Math.max(com.tencent.mm.ui.bl.c(sightCaptureUI), com.tencent.mm.ui.bl.g(sightCaptureUI));
                sightCaptureUI.I.setLayoutParams(marginLayoutParams);
            }
            com.tencent.mm.plugin.mmsight.ui.a2 a2Var = new com.tencent.mm.plugin.mmsight.ui.a2();
            sightCaptureUI.K = a2Var;
            a2Var.f149288x = 2;
            a2Var.f149284t = true;
            a2Var.d(sightCaptureUI, sightCaptureUI.V.f148825o, sightCaptureUI.f149235m.getFilePath(), sightCaptureUI.I, sightCaptureUI.H, sightCaptureUI.f149245u, sightCaptureUI.f149232h, false);
            sightCaptureUI.K.f149280p = new com.tencent.mm.plugin.mmsight.ui.z2(sightCaptureUI);
            sightCaptureUI.f149238p.setVisibility(8);
            sightCaptureUI.f149241q.setVisibility(8);
            sightCaptureUI.f149248x.setVisibility(8);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
