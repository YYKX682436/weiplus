package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ze implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsBrowseUI f171689d;

    public ze(com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI) {
        this.f171689d = snsBrowseUI;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$4");
        com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI = this.f171689d;
        snsBrowseUI.f166810o.getViewTreeObserver().removeOnPreDrawListener(this);
        int width = snsBrowseUI.f166810o.getWidth();
        int i17 = com.tencent.mm.plugin.sns.ui.SnsBrowseUI.Q1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        snsBrowseUI.f166826l1 = width;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        int height = snsBrowseUI.f166810o.getHeight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        snsBrowseUI.f166828p1 = height;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        int width2 = snsBrowseUI.f166810o.getWidth();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        snsBrowseUI.f166829x0 = width2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        int height2 = snsBrowseUI.f166810o.getHeight();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        snsBrowseUI.f166831y0 = height2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.plugin.sns.model.l4.hj();
        java.lang.String r17 = com.tencent.mm.plugin.sns.model.i1.r(snsBrowseUI.f166810o.getCntMedia());
        if (r17 != null) {
            android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(r17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            int i18 = snsBrowseUI.f166829x0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            snsBrowseUI.f166831y0 = (int) ((i18 / n07.outWidth) * n07.outHeight);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            int i19 = snsBrowseUI.f166831y0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            if (i19 > snsBrowseUI.f166810o.getHeight()) {
                int height3 = snsBrowseUI.f166810o.getHeight();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                snsBrowseUI.f166831y0 = height3;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            }
        }
        com.tencent.mm.ui.tools.s4 s4Var = snsBrowseUI.A1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        int i27 = snsBrowseUI.f166829x0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        int i28 = snsBrowseUI.f166831y0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        s4Var.f210699f = i27;
        s4Var.f210700g = i28;
        com.tencent.mm.ui.tools.s4 s4Var2 = snsBrowseUI.A1;
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = snsBrowseUI.f166810o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        android.widget.ImageView imageView = snsBrowseUI.f166830x1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        s4Var2.c(snsInfoFlip, imageView, new com.tencent.mm.plugin.sns.ui.ye(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("runDragAnimation", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.ui.base.MMViewPager gallery = snsBrowseUI.f166810o.getGallery();
        gallery.setGalleryScaleListener(new com.tencent.mm.plugin.sns.ui.df(snsBrowseUI, gallery));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("runDragAnimation", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$4");
        return true;
    }
}
