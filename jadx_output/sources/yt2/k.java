package yt2;

/* loaded from: classes3.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView f465312d;

    public k(com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView finderLiveShoppingSubsidyOverlayView) {
        this.f465312d = finderLiveShoppingSubsidyOverlayView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView finderLiveShoppingSubsidyOverlayView = this.f465312d;
        finderLiveShoppingSubsidyOverlayView.D = false;
        finderLiveShoppingSubsidyOverlayView.setClickable(false);
        yt2.i iVar = finderLiveShoppingSubsidyOverlayView.f126365z;
        com.tencent.mars.xlog.Log.i("Finder.SubsidyOverlay", "start exit anim, target=" + iVar);
        yz5.a aVar = finderLiveShoppingSubsidyOverlayView.A;
        if (aVar != null) {
            aVar.invoke();
        }
        finderLiveShoppingSubsidyOverlayView.A = null;
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(finderLiveShoppingSubsidyOverlayView.f126353n, "alpha", 0.4f, 0.0f);
        ofFloat.setDuration(100L);
        arrayList.add(ofFloat);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(finderLiveShoppingSubsidyOverlayView.f126354o, "alpha", 0.3f, 0.0f);
        ofFloat2.setDuration(100L);
        arrayList.add(ofFloat2);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(finderLiveShoppingSubsidyOverlayView.f126352m, "alpha", 0.3f, 0.0f);
        ofFloat3.setDuration(100L);
        ofFloat3.setStartDelay(100L);
        arrayList.add(ofFloat3);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(finderLiveShoppingSubsidyOverlayView.f126355p, "alpha", 1.0f, 0.0f);
        ofFloat4.setDuration(200L);
        ofFloat4.setStartDelay(100L);
        arrayList.add(ofFloat4);
        android.view.View view = finderLiveShoppingSubsidyOverlayView.f126348f;
        float width = view.getWidth();
        float height = view.getHeight();
        float f17 = 5.0f * width;
        float f18 = f17 / 8.0f;
        float f19 = height / 2.0f;
        float f27 = f17 / 16.0f;
        float e17 = e06.p.e(iVar.f465308b - view.getTop(), 0.0f, height);
        float f28 = (height / 4.0f) - (e17 * 0.5f);
        float f29 = iVar.f465309c;
        float f37 = width > 0.0f ? f29 / width : 0.0f;
        float f38 = height > 0.0f ? f29 / height : 0.0f;
        view.setPivotX(f18);
        view.setPivotY(f19);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.5f);
        ofFloat5.setDuration(250L);
        arrayList.add(ofFloat5);
        android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.5f);
        ofFloat6.setDuration(250L);
        arrayList.add(ofFloat6);
        android.animation.ObjectAnimator ofFloat7 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.7f);
        ofFloat7.setDuration(250L);
        arrayList.add(ofFloat7);
        android.animation.ObjectAnimator ofFloat8 = android.animation.ObjectAnimator.ofFloat(view, "scaleX", 0.5f, f37);
        ofFloat8.setStartDelay(250L);
        ofFloat8.setDuration(250L);
        ofFloat8.addListener(new yt2.p(finderLiveShoppingSubsidyOverlayView, 0.0f, e17, f27, f28));
        arrayList.add(ofFloat8);
        android.animation.ObjectAnimator ofFloat9 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", 0.5f, f38);
        ofFloat9.setStartDelay(250L);
        ofFloat9.setDuration(250L);
        arrayList.add(ofFloat9);
        android.animation.ObjectAnimator ofFloat10 = android.animation.ObjectAnimator.ofFloat(view, "translationX", f27, iVar.f465307a);
        ofFloat10.setStartDelay(250L);
        ofFloat10.setDuration(250L);
        arrayList.add(ofFloat10);
        android.animation.ObjectAnimator ofFloat11 = android.animation.ObjectAnimator.ofFloat(view, "translationY", f28, 0.0f);
        ofFloat11.setStartDelay(250L);
        ofFloat11.setDuration(250L);
        arrayList.add(ofFloat11);
        android.animation.ObjectAnimator ofFloat12 = android.animation.ObjectAnimator.ofFloat(view, "alpha", 0.7f, 0.0f);
        ofFloat12.setStartDelay(250L);
        ofFloat12.setDuration(250L);
        arrayList.add(ofFloat12);
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(new y3.b());
        animatorSet.addListener(new yt2.o(finderLiveShoppingSubsidyOverlayView));
        finderLiveShoppingSubsidyOverlayView.f126360u = animatorSet;
        animatorSet.start();
    }
}
