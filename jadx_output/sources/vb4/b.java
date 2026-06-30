package vb4;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f434794a;

    /* renamed from: b, reason: collision with root package name */
    public android.animation.ValueAnimator f434795b;

    /* renamed from: c, reason: collision with root package name */
    public vb4.c f434796c;

    /* renamed from: d, reason: collision with root package name */
    public int f434797d;

    /* renamed from: e, reason: collision with root package name */
    public int f434798e;

    /* renamed from: f, reason: collision with root package name */
    public int f434799f;

    /* renamed from: g, reason: collision with root package name */
    public int f434800g;

    /* renamed from: h, reason: collision with root package name */
    public int f434801h;

    /* renamed from: i, reason: collision with root package name */
    public int f434802i;

    /* renamed from: j, reason: collision with root package name */
    public int f434803j;

    /* renamed from: k, reason: collision with root package name */
    public int f434804k;

    /* renamed from: l, reason: collision with root package name */
    public int f434805l;

    /* renamed from: m, reason: collision with root package name */
    public int f434806m;

    public b(android.app.Activity activity, android.view.View view, boolean z17) {
        this.f434794a = view;
    }

    public void a(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("putParams", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeAnimation");
        this.f434797d = bundle.getInt("param_thumb_left");
        this.f434798e = bundle.getInt("param_thumb_top");
        this.f434799f = bundle.getInt("param_thumb_width");
        this.f434800g = bundle.getInt("param_thumb_height");
        this.f434804k = bundle.getInt("param_target_width");
        this.f434803j = bundle.getInt("param_target_height");
        this.f434805l = bundle.getInt("param_target_left");
        this.f434806m = bundle.getInt("param_target_top");
        this.f434801h = this.f434803j - this.f434800g;
        this.f434802i = this.f434804k - this.f434799f;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdAnimation", "left=%s, top=%s, width=%s, height=%s, targetW=%s, targetH=%s, targetLeft=%s, targetTop=%s", java.lang.Integer.valueOf(this.f434797d), java.lang.Integer.valueOf(this.f434798e), java.lang.Integer.valueOf(this.f434799f), java.lang.Integer.valueOf(this.f434800g), java.lang.Integer.valueOf(this.f434804k), java.lang.Integer.valueOf(this.f434803j), java.lang.Integer.valueOf(this.f434805l), java.lang.Integer.valueOf(this.f434806m));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putParams", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeAnimation");
    }

    public void b(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOriginAndTargetParams", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeAnimation");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("param_thumb_left", i17);
        bundle.putInt("param_thumb_top", i18);
        bundle.putInt("param_thumb_width", i19);
        bundle.putInt("param_thumb_height", i27);
        bundle.putInt("param_target_left", i28);
        bundle.putInt("param_target_top", i29);
        bundle.putInt("param_target_width", i37);
        bundle.putInt("param_target_height", i38);
        a(bundle);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOriginAndTargetParams", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeAnimation");
    }

    public void c(vb4.c cVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsAnimaListener", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeAnimation");
        this.f434796c = cVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsAnimaListener", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeAnimation");
    }

    public void d(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeAnimation");
        android.animation.ValueAnimator valueAnimator = this.f434795b;
        if (valueAnimator != null && !valueAnimator.isStarted()) {
            this.f434795b.setStartDelay(j17);
            this.f434795b.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeAnimation");
    }
}
