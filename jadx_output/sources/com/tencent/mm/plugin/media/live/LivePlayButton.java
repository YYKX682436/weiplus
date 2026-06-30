package com.tencent.mm.plugin.media.live;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/media/live/LivePlayButton;", "Lcom/tencent/mm/plugin/media/view/ShrinkBox;", "Lkg3/o;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LivePlayButton extends com.tencent.mm.plugin.media.view.ShrinkBox implements kg3.o {

    /* renamed from: h, reason: collision with root package name */
    public long f148567h;

    /* renamed from: i, reason: collision with root package name */
    public final long f148568i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LivePlayButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // kg3.o
    public void b(boolean z17) {
        java.lang.Double valueOf = java.lang.Double.valueOf(0.75d);
        if (!z17) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.smj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/media/live/LivePlayButton", "onShrinkStatusChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/media/live/LivePlayButton", "onShrinkStatusChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            setPadding(uf3.b.a(1), uf3.b.a(valueOf), uf3.b.a(1), uf3.b.a(valueOf));
            getLayoutParams().width = -2;
            return;
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.smj);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/media/live/LivePlayButton", "onShrinkStatusChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/media/live/LivePlayButton", "onShrinkStatusChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        setPadding(uf3.b.a(valueOf), uf3.b.a(valueOf), uf3.b.a(valueOf), uf3.b.a(valueOf));
        getLayoutParams().width = uf3.b.a(4);
    }

    public final void c() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f148567h < this.f148568i) {
            return;
        }
        this.f148567h = currentTimeMillis;
        performHapticFeedback(1, 2);
    }

    public final void d() {
        clearAnimation();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.tencent.mm.plugin.media.live.LivePlayButton, java.lang.Float>) android.view.View.SCALE_X, 1.0f, 0.9f);
        ofFloat.setDuration(150L);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.tencent.mm.plugin.media.live.LivePlayButton, java.lang.Float>) android.view.View.SCALE_Y, 1.0f, 0.9f);
        ofFloat2.setDuration(150L);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.tencent.mm.plugin.media.live.LivePlayButton, java.lang.Float>) android.view.View.SCALE_X, 0.9f, 0.9f);
        ofFloat3.setDuration(50L);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.tencent.mm.plugin.media.live.LivePlayButton, java.lang.Float>) android.view.View.SCALE_X, 0.9f, 1.0f);
        ofFloat4.setDuration(150L);
        ofFloat4.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<com.tencent.mm.plugin.media.live.LivePlayButton, java.lang.Float>) android.view.View.SCALE_Y, 0.9f, 1.0f);
        ofFloat5.setDuration(150L);
        ofFloat5.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.playTogether(ofFloat4, ofFloat5);
        android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
        animatorSet3.playSequentially(animatorSet, ofFloat3, animatorSet2);
        animatorSet3.start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivePlayButton(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ejj, (android.view.ViewGroup) this, true);
        setShrinkListener(this);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.smj);
        textView.setTextSize(12 * java.lang.Math.min(1.125f, i65.a.q(textView.getContext())));
        com.tencent.mm.ui.dl.i(textView.getPaint());
        int a17 = uf3.b.a(1);
        java.lang.Double valueOf = java.lang.Double.valueOf(0.75d);
        setPadding(a17, uf3.b.a(valueOf), uf3.b.a(1), uf3.b.a(valueOf));
        this.f148568i = 100L;
    }
}
