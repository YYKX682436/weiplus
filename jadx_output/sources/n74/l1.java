package n74;

/* loaded from: classes4.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f335389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n74.m1 f335390e;

    public l1(n74.m1 m1Var, android.graphics.Bitmap bitmap) {
        this.f335390e = m1Var;
        this.f335389d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$2$1");
        try {
            this.f335390e.f335396e.setIconImage(new android.graphics.drawable.BitmapDrawable(this.f335389d));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdRollHelper", "setImageBitmapAsync set bitmap drawable, exp = " + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$2$1");
    }
}
