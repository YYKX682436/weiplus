package yt2;

/* loaded from: classes3.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView f465314d;

    public m(com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView finderLiveShoppingSubsidyOverlayView) {
        this.f465314d = finderLiveShoppingSubsidyOverlayView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView finderLiveShoppingSubsidyOverlayView = this.f465314d;
        android.widget.TextView textView = finderLiveShoppingSubsidyOverlayView.f126356q;
        android.text.Layout layout = textView.getLayout();
        if (layout != null && layout.getLineCount() > 0 && layout.getEllipsisCount(layout.getLineCount() - 1) > 0) {
            java.lang.Float dpSize = java.lang.Float.valueOf(15.0f);
            kotlin.jvm.internal.o.g(dpSize, "dpSize");
            textView.setTextSize(1, ((dpSize.floatValue() * 1.0f) * j65.f.g()) / 400);
        }
        float width = finderLiveShoppingSubsidyOverlayView.getWidth();
        finderLiveShoppingSubsidyOverlayView.f126348f.setTranslationX(width);
        finderLiveShoppingSubsidyOverlayView.f126348f.setPivotX(0.0f);
        finderLiveShoppingSubsidyOverlayView.f126348f.setPivotY(r2.getHeight() / 2.0f);
        finderLiveShoppingSubsidyOverlayView.f126352m.setPivotX(r2.getWidth() / 2.0f);
        finderLiveShoppingSubsidyOverlayView.f126352m.setPivotY(r2.getHeight() / 2.0f);
        finderLiveShoppingSubsidyOverlayView.f126353n.setPivotX(r2.getWidth() / 2.0f);
        finderLiveShoppingSubsidyOverlayView.f126353n.setPivotY(r2.getHeight() / 2.0f);
        finderLiveShoppingSubsidyOverlayView.f126354o.setPivotX(r2.getWidth() / 2.0f);
        finderLiveShoppingSubsidyOverlayView.f126354o.setPivotY(r2.getHeight() / 2.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(finderLiveShoppingSubsidyOverlayView.f126348f, "translationX", width, 0.0f);
        ofFloat.setDuration(400L);
        ofFloat.setStartDelay(0L);
        arrayList.add(ofFloat);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(finderLiveShoppingSubsidyOverlayView.f126348f, "alpha", 0.0f, 1.0f);
        ofFloat2.setDuration(400L);
        ofFloat2.setStartDelay(0L);
        arrayList.add(ofFloat2);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(finderLiveShoppingSubsidyOverlayView.f126352m, "scaleX", 0.3f, 1.0f);
        ofFloat3.setDuration(200L);
        ofFloat3.setStartDelay(400L);
        arrayList.add(ofFloat3);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(finderLiveShoppingSubsidyOverlayView.f126352m, "scaleY", 0.3f, 1.0f);
        ofFloat4.setDuration(200L);
        ofFloat4.setStartDelay(400L);
        arrayList.add(ofFloat4);
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(finderLiveShoppingSubsidyOverlayView.f126352m, "alpha", 0.0f, 0.3f);
        ofFloat5.setDuration(200L);
        ofFloat5.setStartDelay(400L);
        arrayList.add(ofFloat5);
        android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(finderLiveShoppingSubsidyOverlayView.f126355p, "alpha", 0.0f, 1.0f);
        ofFloat6.setDuration(200L);
        ofFloat6.setStartDelay(400L);
        arrayList.add(ofFloat6);
        android.animation.ObjectAnimator ofFloat7 = android.animation.ObjectAnimator.ofFloat(finderLiveShoppingSubsidyOverlayView.f126353n, "scaleX", 0.0f, 1.0f);
        ofFloat7.setDuration(200L);
        ofFloat7.setStartDelay(600L);
        arrayList.add(ofFloat7);
        android.animation.ObjectAnimator ofFloat8 = android.animation.ObjectAnimator.ofFloat(finderLiveShoppingSubsidyOverlayView.f126353n, "scaleY", 0.0f, 1.0f);
        ofFloat8.setDuration(200L);
        ofFloat8.setStartDelay(600L);
        arrayList.add(ofFloat8);
        android.animation.ObjectAnimator ofFloat9 = android.animation.ObjectAnimator.ofFloat(finderLiveShoppingSubsidyOverlayView.f126353n, "alpha", 0.0f, 0.4f);
        ofFloat9.setDuration(200L);
        ofFloat9.setStartDelay(600L);
        arrayList.add(ofFloat9);
        android.animation.ObjectAnimator ofFloat10 = android.animation.ObjectAnimator.ofFloat(finderLiveShoppingSubsidyOverlayView.f126354o, "scaleX", 0.0f, 1.0f);
        ofFloat10.setDuration(100L);
        ofFloat10.setStartDelay(700L);
        arrayList.add(ofFloat10);
        android.animation.ObjectAnimator ofFloat11 = android.animation.ObjectAnimator.ofFloat(finderLiveShoppingSubsidyOverlayView.f126354o, "scaleY", 0.0f, 1.0f);
        ofFloat11.setDuration(100L);
        ofFloat11.setStartDelay(700L);
        arrayList.add(ofFloat11);
        android.animation.ObjectAnimator ofFloat12 = android.animation.ObjectAnimator.ofFloat(finderLiveShoppingSubsidyOverlayView.f126354o, "alpha", 0.0f, 0.3f);
        ofFloat12.setDuration(100L);
        ofFloat12.setStartDelay(700L);
        arrayList.add(ofFloat12);
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(new y3.b());
        animatorSet.addListener(new yt2.l(finderLiveShoppingSubsidyOverlayView));
        finderLiveShoppingSubsidyOverlayView.f126358s = animatorSet;
        animatorSet.start();
    }
}
