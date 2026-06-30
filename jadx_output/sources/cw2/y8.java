package cw2;

/* loaded from: classes2.dex */
public final class y8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f224124d;

    public y8(com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout) {
        this.f224124d = finderVideoLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View loading;
        android.view.View loading2;
        android.view.View loading3;
        yz5.l onCustomLoadingStatusChange;
        int i17 = com.tencent.mm.plugin.finder.video.FinderVideoLayout.f130704x0;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f224124d;
        finderVideoLayout.getClass();
        if (finderVideoLayout.isEnableShowLoading) {
            cw2.da videoView = finderVideoLayout.getVideoView();
            if (videoView != null && videoView.getIsViewFocused()) {
                com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar longVideoSeekBar = finderVideoLayout.getLongVideoSeekBar();
                if (longVideoSeekBar != null && (onCustomLoadingStatusChange = longVideoSeekBar.getOnCustomLoadingStatusChange()) != null) {
                    onCustomLoadingStatusChange.invoke(java.lang.Boolean.TRUE);
                    return;
                }
                if (finderVideoLayout.getNewSeekBarLayout() != null) {
                    com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                    if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.N5).getValue()).r()).booleanValue()) {
                        com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout newSeekBarLayout = finderVideoLayout.getNewSeekBarLayout();
                        kotlin.jvm.internal.o.d(newSeekBarLayout);
                        android.view.View loadingView = newSeekBarLayout.getLoadingView();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(loadingView, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/FinderFeedNewSeekBarLayout", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        loadingView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(loadingView, "com/tencent/mm/plugin/finder/video/FinderFeedNewSeekBarLayout", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, new int[]{android.graphics.Color.argb(0, 161, 161, 161), android.graphics.Color.argb(255, 161, 161, 161)});
                        gradientDrawable.setCornerRadius(newSeekBarLayout.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479644bj));
                        newSeekBarLayout.getLoadingView().setBackground(gradientDrawable);
                        newSeekBarLayout.getLoadingView().getLayoutParams().width = 0;
                        android.view.View loadingView2 = newSeekBarLayout.getLoadingView();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(java.lang.Float.valueOf(1.0f));
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(loadingView2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/video/FinderFeedNewSeekBarLayout", "showLoading", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        loadingView2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                        yj0.a.f(loadingView2, "com/tencent/mm/plugin/finder/video/FinderFeedNewSeekBarLayout", "showLoading", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, newSeekBarLayout.getContext().getResources().getDisplayMetrics().widthPixels - ((int) newSeekBarLayout.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479714d7)));
                        ofInt.addUpdateListener(new cw2.w0(newSeekBarLayout));
                        ofInt.setDuration(500L);
                        ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
                        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.addUpdateListener(new cw2.x0(newSeekBarLayout));
                        ofFloat.setDuration(500L);
                        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
                        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                        animatorSet.playSequentially(ofInt, ofFloat);
                        animatorSet.addListener(new cw2.y0(newSeekBarLayout));
                        animatorSet.setStartDelay(((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.O5).getValue()).r()).longValue() * 1000);
                        animatorSet.start();
                        newSeekBarLayout.C = animatorSet;
                        return;
                    }
                }
                loading = finderVideoLayout.getLoading();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(loading, arrayList3.toArray(), "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showLoading$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                loading.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(loading, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showLoading$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                loading2 = finderVideoLayout.getLoading();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(loading2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showLoading$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                loading2.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
                yj0.a.f(loading2, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$showLoading$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                com.tencent.mars.xlog.Log.i(finderVideoLayout.getFTPPTag(), "[showLoading] " + finderVideoLayout.d0());
                float floatValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.P5).getValue()).r()).floatValue();
                loading3 = finderVideoLayout.getLoading();
                loading3.animate().alpha(floatValue).setDuration(300L).setListener(new cw2.x8(finderVideoLayout, floatValue)).start();
            }
        }
    }
}
