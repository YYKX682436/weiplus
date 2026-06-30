package i64;

/* loaded from: classes4.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f289212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i64.l1 f289213e;

    public k1(i64.l1 l1Var, android.graphics.Bitmap bitmap) {
        this.f289213e = l1Var;
        this.f289212d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        i64.l1 l1Var = this.f289213e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr$1$1");
        android.graphics.Bitmap bitmap = this.f289212d;
        if (bitmap != null) {
            try {
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsTimelineAdResourceMgr", "setImageToImageView set bitmap, exp=" + th6.toString());
            }
            if (!bitmap.isRecycled()) {
                i64.m1 m1Var = l1Var.f289228m;
                i64.m1 m1Var2 = i64.m1.f289238c;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
                com.tencent.mm.sdk.platformtools.r2 r2Var = m1Var.f289240b;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
                r2Var.put(l1Var.f289225g, bitmap);
                i64.m1 m1Var3 = l1Var.f289228m;
                android.widget.ImageView imageView = l1Var.f289227i;
                java.lang.String str = l1Var.f289225g;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
                m1Var3.a(imageView, str);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr$1$1");
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.SnsTimelineAdResourceMgr", "decode bitmap failed!!! Is the bitmap file valid?");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr$1$1");
    }
}
