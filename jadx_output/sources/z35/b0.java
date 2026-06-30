package z35;

/* loaded from: classes4.dex */
public final class b0 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView f470003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f470004e;

    public b0(com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView, android.content.Context context) {
        this.f470003d = heroSeekBarView;
        this.f470004e = context;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView = this.f470003d;
        z35.d0 heroSeekBarChangeListener = heroSeekBarView.getHeroSeekBarChangeListener();
        if (heroSeekBarChangeListener != null) {
            heroSeekBarChangeListener.onProgressChanged(seekBar, i17, z17);
        }
        if (z17) {
            heroSeekBarView.setUserSeekProgress(i17);
            heroSeekBarView.setLastProgressMs(heroSeekBarView.getMTotalTimeMs() * i17);
            heroSeekBarView.k(i17);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView = this.f470003d;
        heroSeekBarView.setUserTouching(true);
        heroSeekBarView.setJumpSeekAnimation(true);
        wu5.c hideTask = heroSeekBarView.getHideTask();
        if (hideTask != null) {
            hideTask.cancel(false);
        }
        android.content.Context context = this.f470004e;
        int h17 = i65.a.h(context, com.tencent.mm.R.dimen.f479738dv);
        android.view.ViewGroup.LayoutParams layoutParams = heroSeekBarView.getHeroSeekBar().getLayoutParams();
        layoutParams.height = h17;
        heroSeekBarView.getHeroSeekBar().setLayoutParams(layoutParams);
        heroSeekBarView.setHeroProgressDrawable(com.tencent.mm.R.drawable.agf);
        android.view.View showInfoLayout = heroSeekBarView.getShowInfoLayout();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(showInfoLayout, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$2", "onStartTrackingTouch", "(Landroid/widget/SeekBar;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        showInfoLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(showInfoLayout, "com/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$2", "onStartTrackingTouch", "(Landroid/widget/SeekBar;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView indCurrentTimeTv = heroSeekBarView.getIndCurrentTimeTv();
        android.view.View view = (android.view.View) (indCurrentTimeTv != null ? indCurrentTimeTv.getParent() : null);
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$2", "onStartTrackingTouch", "(Landroid/widget/SeekBar;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$2", "onStartTrackingTouch", "(Landroid/widget/SeekBar;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        heroSeekBarView.getHeroSeekBar().setVisibility(0);
        z35.g0 visibleChangeListener = heroSeekBarView.getVisibleChangeListener();
        if (visibleChangeListener != null) {
            visibleChangeListener.a(true);
        }
        heroSeekBarView.getHeroSeekBar().setThumb(i65.a.i(context, com.tencent.mm.R.drawable.agi));
        z35.d0 heroSeekBarChangeListener = heroSeekBarView.getHeroSeekBarChangeListener();
        if (heroSeekBarChangeListener != null) {
            heroSeekBarChangeListener.g6(seekBar, heroSeekBarView.getUserSeekProgress());
        }
        x25.b reporter = heroSeekBarView.getReporter();
        if (reporter != null) {
            xd4.l0 l0Var = (xd4.l0) reporter;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProcessBarDragged", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
            l0Var.a();
            l0Var.f453678m++;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProcessBarDragged", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView = this.f470003d;
        heroSeekBarView.setUserTouching(false);
        z35.d0 heroSeekBarChangeListener = heroSeekBarView.getHeroSeekBarChangeListener();
        if (heroSeekBarChangeListener != null) {
            heroSeekBarChangeListener.D0(seekBar, heroSeekBarView.getUserSeekProgress());
        }
        android.content.Context context = this.f470004e;
        int h17 = i65.a.h(context, com.tencent.mm.R.dimen.f479646bl);
        android.view.ViewGroup.LayoutParams layoutParams = heroSeekBarView.getHeroSeekBar().getLayoutParams();
        layoutParams.height = h17;
        heroSeekBarView.getHeroSeekBar().setLayoutParams(layoutParams);
        heroSeekBarView.setHeroProgressDrawable(com.tencent.mm.R.drawable.age);
        heroSeekBarView.getHeroSeekBar().setThumb(i65.a.i(context, com.tencent.mm.R.drawable.agh));
        android.view.View showInfoLayout = heroSeekBarView.getShowInfoLayout();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(showInfoLayout, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$2", "onStopTrackingTouch", "(Landroid/widget/SeekBar;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        showInfoLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(showInfoLayout, "com/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$2", "onStopTrackingTouch", "(Landroid/widget/SeekBar;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView indCurrentTimeTv = heroSeekBarView.getIndCurrentTimeTv();
        android.view.View view = (android.view.View) (indCurrentTimeTv != null ? indCurrentTimeTv.getParent() : null);
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$2", "onStopTrackingTouch", "(Landroid/widget/SeekBar;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$2", "onStopTrackingTouch", "(Landroid/widget/SeekBar;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        heroSeekBarView.e();
    }
}
