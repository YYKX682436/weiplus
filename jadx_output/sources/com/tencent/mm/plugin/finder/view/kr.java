package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class kr implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.LiveMarqueeTextView f132532d;

    public kr(com.tencent.mm.plugin.finder.view.LiveMarqueeTextView liveMarqueeTextView) {
        this.f132532d = liveMarqueeTextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.LiveMarqueeTextView liveMarqueeTextView = this.f132532d;
        if (!liveMarqueeTextView.f131529d.isEmpty()) {
            liveMarqueeTextView.f131532g = 0.0f;
            if (liveMarqueeTextView.f131530e >= ((java.util.ArrayList) liveMarqueeTextView.f131529d).size() - 1) {
                liveMarqueeTextView.f131530e++;
                liveMarqueeTextView.b();
                return;
            }
            liveMarqueeTextView.f131530e++;
            android.animation.ValueAnimator valueAnimator = liveMarqueeTextView.f131535m;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
    }
}
