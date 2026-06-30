package i64;

/* loaded from: classes4.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f289222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f289223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f289224f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289225g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289226h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f289227i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i64.m1 f289228m;

    public l1(i64.m1 m1Var, int i17, int i18, int i19, java.lang.String str, java.lang.String str2, android.widget.ImageView imageView) {
        this.f289228m = m1Var;
        this.f289222d = i17;
        this.f289223e = i18;
        this.f289224f = i19;
        this.f289225g = str;
        this.f289226h = str2;
        this.f289227i = imageView;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap b17;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr$1");
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            int i18 = this.f289222d;
            if (i18 == 0) {
                int i19 = this.f289223e;
                b17 = (i19 <= 0 || (i17 = this.f289224f) <= 0) ? com.tencent.mm.sdk.platformtools.x.J(this.f289225g, options) : com.tencent.mm.sdk.platformtools.x.M(this.f289225g, i19, i17, false, options);
                m44.a.c(this.f289226h, b17, options);
            } else {
                b17 = i18 == 1 ? this.f289228m.b(this.f289225g) : null;
            }
            ((ku5.t0) ku5.t0.f312615d).B(new i64.k1(this, b17));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsTimelineAdResourceMgr", "setImageToImageView decode bitmap, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr$1");
    }
}
