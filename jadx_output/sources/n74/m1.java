package n74;

/* loaded from: classes4.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout f335396e;

    public m1(n74.n1 n1Var, java.lang.String str, com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout livingDescBarLayout) {
        this.f335395d = str;
        this.f335396e = livingDescBarLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$2");
        try {
            android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(this.f335395d, null);
            if (J2 != null && !J2.isRecycled()) {
                ((ku5.t0) ku5.t0.f312615d).B(new n74.l1(this, J2));
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdRollHelper", "setImageBitmapAsync decode bitmap drawable, exp = " + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$2");
    }
}
