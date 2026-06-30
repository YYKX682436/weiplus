package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class li implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsGalleryUI f169743d;

    public li(com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI) {
        this.f169743d = snsGalleryUI;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$4");
        com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI = this.f169743d;
        snsGalleryUI.f166810o.getViewTreeObserver().removeOnPreDrawListener(this);
        int width = snsGalleryUI.f166810o.getWidth();
        int i17 = com.tencent.mm.plugin.sns.ui.SnsGalleryUI.I1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        snsGalleryUI.D1 = width;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        int height = snsGalleryUI.f166810o.getHeight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        snsGalleryUI.E1 = height;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        int width2 = snsGalleryUI.f166810o.getWidth();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        snsGalleryUI.f167156x1 = width2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        int height2 = snsGalleryUI.f166810o.getHeight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        snsGalleryUI.f167158y1 = height2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.model.l4.hj();
        java.lang.String r17 = com.tencent.mm.plugin.sns.model.i1.r(snsGalleryUI.f166810o.getCntMedia());
        if (r17 != null) {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(options);
            arrayList.add(r17);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsGalleryUI$4", "onPreDraw", "()Z", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            yj0.a.e(obj, android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1)), "com/tencent/mm/plugin/sns/ui/SnsGalleryUI$4", "onPreDraw", "()Z", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            if (options.outWidth > 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                int i18 = snsGalleryUI.f167156x1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                snsGalleryUI.f167158y1 = (int) ((i18 / options.outWidth) * options.outHeight);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                int i19 = snsGalleryUI.f167158y1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                if (i19 > snsGalleryUI.f166810o.getHeight()) {
                    int height3 = snsGalleryUI.f166810o.getHeight();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                    snsGalleryUI.f167158y1 = height3;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.ui.tools.s4 s4Var = snsGalleryUI.f167155x0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        int i27 = snsGalleryUI.f167156x1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        int i28 = snsGalleryUI.f167158y1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        s4Var.f210699f = i27;
        s4Var.f210700g = i28;
        android.view.KeyEvent.Callback currentImageView = snsGalleryUI.f166810o.getCurrentImageView();
        if (snsGalleryUI.X && !com.tencent.mm.plugin.sns.ui.SnsGalleryUI.v7(snsGalleryUI) && (currentImageView instanceof db5.f0)) {
            ((db5.f0) currentImageView).n(0.0f, true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.ui.tools.s4 s4Var2 = snsGalleryUI.f167155x0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = snsGalleryUI.f166810o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        android.widget.ImageView imageView = snsGalleryUI.f167152l1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        s4Var2.c(snsInfoFlip, imageView, new com.tencent.mm.plugin.sns.ui.ki(this));
        if (snsGalleryUI.X) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("runDragAnimation", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            com.tencent.mm.ui.base.MMViewPager gallery = snsGalleryUI.f166810o.getGallery();
            gallery.setGalleryScaleListener(new com.tencent.mm.plugin.sns.ui.oi(snsGalleryUI, gallery));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runDragAnimation", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$4");
        return true;
    }
}
