package dd4;

/* loaded from: classes4.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f229015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView f229016e;

    public k(android.graphics.Bitmap bitmap, com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView) {
        this.f229015d = bitmap;
        this.f229016e = flexibleLivePhotoView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$checkShowTranslateResImg$1$1");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView = this.f229016e;
        android.graphics.Bitmap bitmap = this.f229015d;
        if (bitmap != null) {
            flexibleLivePhotoView.m("set trans img success");
            dd4.v0 d17 = com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.d(flexibleLivePhotoView);
            if (d17 == null) {
                kotlin.jvm.internal.o.o("snsInfoFlipCallback");
                throw null;
            }
            ((com.tencent.mm.plugin.sns.ui.fk) d17).b(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.e(flexibleLivePhotoView), com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.c(flexibleLivePhotoView));
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.e(flexibleLivePhotoView).setEnableHorLongBmpMode(true);
            com.tencent.mm.ui.base.MultiTouchImageView e17 = com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.e(flexibleLivePhotoView);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            e17.f197651o = width;
            e17.f197652p = height;
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.e(flexibleLivePhotoView).setImageBitmap(bitmap);
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.e(flexibleLivePhotoView).setVisibility(0);
            int width2 = bitmap.getWidth();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setBmWidth$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            flexibleLivePhotoView.f169208z = width2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setBmWidth$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            int height2 = bitmap.getHeight();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setBmHeight$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            flexibleLivePhotoView.A = height2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setBmHeight$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBmWidth$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            int i17 = flexibleLivePhotoView.f169208z;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBmWidth$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBmHeight$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            int i18 = flexibleLivePhotoView.A;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBmHeight$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.q(flexibleLivePhotoView, i17, i18, false, null, 12, null);
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.e(flexibleLivePhotoView).post(new dd4.j(flexibleLivePhotoView));
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.h(flexibleLivePhotoView);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlexibleLivePhotoView", "set trans img error");
            dd4.f fVar = dd4.f.f228997f;
            int i19 = com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.G;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setBigImageDownLoadState$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            flexibleLivePhotoView.f169205w = fVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setBigImageDownLoadState$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView$checkShowTranslateResImg$1$1");
    }
}
