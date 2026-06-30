package p84;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: n, reason: collision with root package name */
    public static final p84.a f352778n = new p84.a(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f352779a;

    /* renamed from: b, reason: collision with root package name */
    public final int f352780b;

    /* renamed from: c, reason: collision with root package name */
    public long f352781c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f352782d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.u f352783e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView f352784f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f352785g;

    /* renamed from: h, reason: collision with root package name */
    public android.animation.AnimatorSet f352786h;

    /* renamed from: i, reason: collision with root package name */
    public android.animation.AnimatorSet f352787i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f352788j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f352789k;

    /* renamed from: l, reason: collision with root package name */
    public final p84.c f352790l;

    /* renamed from: m, reason: collision with root package name */
    public final p84.b f352791m;

    public e(com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView labelView) {
        kotlin.jvm.internal.o.g(labelView, "labelView");
        this.f352779a = "AnimLabelCtrl";
        this.f352780b = 1;
        this.f352784f = labelView;
        if (labelView.getVisibility() == 0) {
            labelView.setVisibility(4);
        }
        this.f352790l = new p84.c(this, android.os.Looper.getMainLooper());
        this.f352791m = new p84.b(this);
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        com.tencent.mars.xlog.Log.i(this.f352779a, "clear");
        this.f352781c = 0L;
        this.f352782d = null;
        this.f352783e = null;
        d();
        this.f352788j = false;
        this.f352789k = false;
        this.f352790l.removeCallbacksAndMessages(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
    }

    public final void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPlayEnd", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        com.tencent.mm.plugin.sns.storage.u uVar = this.f352783e;
        if (uVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlayEnd", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        } else {
            if (this.f352782d == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlayEnd", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
                return;
            }
            if (uVar != null) {
                e(uVar.f166148c);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlayEnd", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        }
    }

    public final void c(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        if (this.f352783e == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        } else if (this.f352782d == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        } else {
            e((int) j17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        }
    }

    public final void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetViewState", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        com.tencent.mars.xlog.Log.i(this.f352779a, "resetViewState");
        com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView animLabelView = this.f352784f;
        if (animLabelView.getVisibility() == 0) {
            animLabelView.setVisibility(4);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        android.animation.AnimatorSet animatorSet = animLabelView.f163516n;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        android.animation.AnimatorSet animatorSet2 = animLabelView.f163517o;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        android.animation.AnimatorSet animatorSet3 = animLabelView.f163518p;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopBackgroundAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView labelBackgroundView = animLabelView.f163515m;
        if (labelBackgroundView == null) {
            kotlin.jvm.internal.o.o("mBackgroundView");
            throw null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopTranslateAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
        labelBackgroundView.f163526m = true;
        labelBackgroundView.invalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopTranslateAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.LabelBackgroundView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopBackgroundAnim", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        android.view.View view = animLabelView.f163510e;
        if (view == null) {
            kotlin.jvm.internal.o.o("mContentView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/animlabel/AnimLabelView", "clear", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/animlabel/AnimLabelView", "clear", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = animLabelView.f163510e;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("mContentView");
            throw null;
        }
        view2.setTranslationX(0.0f);
        android.widget.ImageView imageView = animLabelView.f163514i;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("mArrowIcon");
            throw null;
        }
        imageView.setAlpha(0.0f);
        android.widget.ImageView imageView2 = animLabelView.f163514i;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("mArrowIcon");
            throw null;
        }
        imageView2.setTranslationX(0.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelView");
        android.animation.AnimatorSet animatorSet4 = this.f352786h;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
        android.animation.AnimatorSet animatorSet5 = this.f352787i;
        if (animatorSet5 != null) {
            animatorSet5.cancel();
        }
        android.view.View view3 = this.f352785g;
        if (view3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/animlabel/AnimLabelCtrl", "resetViewState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ad/widget/animlabel/AnimLabelCtrl", "resetViewState", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view4 = this.f352785g;
        if (view4 != null) {
            view4.setTranslationX(0.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetViewState", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
    }

    public final void e(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendPlayMsg", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
        android.os.Message obtain = android.os.Message.obtain();
        int i18 = this.f352780b;
        obtain.what = i18;
        obtain.arg1 = i17;
        p84.c cVar = this.f352790l;
        cVar.removeMessages(i18);
        cVar.sendMessageDelayed(obtain, 50L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendPlayMsg", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl");
    }
}
