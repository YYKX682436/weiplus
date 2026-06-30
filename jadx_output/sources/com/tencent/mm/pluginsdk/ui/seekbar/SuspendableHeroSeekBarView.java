package com.tencent.mm.pluginsdk.ui.seekbar;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0018B\u001b\u0012\u0006\u0010)\u001a\u00020(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0016R#\u0010\u0012\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0017\u001a\n \r*\u0004\u0018\u00010\u00130\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006."}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView;", "Lcom/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView;", "", "getLayoutId", "", "visible", "Ljz5/f0;", "setBarVisible", "visibility", "setBarVisibleExcludeProgress", "drag", "setEnableDrag", "Lcom/tencent/mm/ui/base/MMImageButton;", "kotlin.jvm.PlatformType", "I", "Ljz5/g;", "getPlayMediaBtn", "()Lcom/tencent/mm/ui/base/MMImageButton;", "playMediaBtn", "Landroid/view/ViewGroup;", "J", "getControlProcessArea", "()Landroid/view/ViewGroup;", "controlProcessArea", "Lz35/s0;", "K", "Lz35/s0;", "getVideoPlayStatusListener", "()Lz35/s0;", "setVideoPlayStatusListener", "(Lz35/s0;)V", "videoPlayStatusListener", "Lz35/e0;", "L", "Lz35/e0;", "getUserOperateListener", "()Lz35/e0;", "setUserOperateListener", "(Lz35/e0;)V", "userOperateListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-playvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SuspendableHeroSeekBarView extends com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView {
    public static final /* synthetic */ int U = 0;

    /* renamed from: I, reason: from kotlin metadata */
    public final jz5.g playMediaBtn;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    public final jz5.g controlProcessArea;

    /* renamed from: K, reason: from kotlin metadata */
    public z35.s0 videoPlayStatusListener;

    /* renamed from: L, reason: from kotlin metadata */
    public z35.e0 userOperateListener;
    public volatile boolean M;
    public float N;
    public float P;
    public float Q;
    public long R;
    public final int S;
    public boolean T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendableHeroSeekBarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.playMediaBtn = jz5.h.b(new z35.v0(this));
        this.controlProcessArea = jz5.h.b(new z35.t0(this));
        getPlayMediaBtn().setBackground(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.play_filled, i65.a.d(context, com.tencent.mm.R.color.aby)));
        getPlayMediaBtn().setOnClickListener(new z35.q0(this));
        getHeroSeekBar().setOnSeekBarChangeListener(null);
        getHeroSeekBar().setEnabled(false);
        getControlProcessArea().setOnTouchListener(new z35.r0(this));
        this.S = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private final android.view.ViewGroup getControlProcessArea() {
        return (android.view.ViewGroup) ((jz5.n) this.controlProcessArea).getValue();
    }

    private final com.tencent.mm.ui.base.MMImageButton getPlayMediaBtn() {
        return (com.tencent.mm.ui.base.MMImageButton) ((jz5.n) this.playMediaBtn).getValue();
    }

    @Override // com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView
    public void d() {
        super.d();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("style", "light");
        com.tencent.mm.ui.jk.f209011a.b(jSONObject.toString());
    }

    @Override // com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView
    public void e() {
        z35.e0 e0Var = this.userOperateListener;
        if (e0Var != null) {
            z35.b bVar = (z35.b) e0Var;
            if (bVar.f470002a.isAccessibilityEnable) {
                return;
            }
            bVar.f470002a.a();
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView
    public int getLayoutId() {
        return com.tencent.mm.R.layout.eps;
    }

    public final z35.e0 getUserOperateListener() {
        return this.userOperateListener;
    }

    public final z35.s0 getVideoPlayStatusListener() {
        return this.videoPlayStatusListener;
    }

    public final boolean l(android.view.MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    this.P += motionEvent.getX() - this.Q;
                    this.Q = motionEvent.getX();
                    if (getUserTouching()) {
                        int max = (int) (getHeroSeekBar().getMax() * (this.P / getHeroSeekBar().getWidth()));
                        if (max != 0) {
                            int progress = getHeroSeekBar().getProgress() + max;
                            getHeroSeekBar().getMax();
                            getHeroSeekBar().getProgress();
                            getHeroSeekBar().setProgress(progress);
                            m(progress, true);
                            this.P = 0.0f;
                        }
                    } else if (java.lang.System.currentTimeMillis() - this.R >= 100 || java.lang.Math.abs(motionEvent.getX() - this.N) > this.S) {
                        setUserTouching(true);
                        setJumpSeekAnimation(true);
                        int h17 = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479671c8);
                        getHeroSeekBar().setPadding(h17, 0, h17, 0);
                        setHeroProgressDrawable(com.tencent.mm.R.drawable.d9s);
                        setBarVisibleExcludeProgress(4);
                        android.widget.TextView indCurrentTimeTv = getIndCurrentTimeTv();
                        android.view.View view = (android.view.View) (indCurrentTimeTv != null ? indCurrentTimeTv.getParent() : null);
                        if (view != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList.add(0);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView", "onSeekBarStartTrackingTouch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView", "onSeekBarStartTrackingTouch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        getHeroSeekBar().setVisibility(0);
                        z35.g0 visibleChangeListener = getVisibleChangeListener();
                        if (visibleChangeListener != null) {
                            visibleChangeListener.a(false);
                        }
                        getHeroSeekBar().setThumb(i65.a.i(getContext(), com.tencent.mm.R.drawable.agi));
                        z35.d0 heroSeekBarChangeListener = getHeroSeekBarChangeListener();
                        if (heroSeekBarChangeListener != null) {
                            heroSeekBarChangeListener.g6(getHeroSeekBar(), getUserSeekProgress());
                        }
                        e();
                        x25.b reporter = getReporter();
                        if (reporter != null) {
                            xd4.l0 l0Var = (xd4.l0) reporter;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProcessBarDragged", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
                            l0Var.a();
                            l0Var.f453678m++;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProcessBarDragged", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
                        }
                    }
                }
            } else if (getUserTouching()) {
                setUserTouching(false);
                z35.d0 heroSeekBarChangeListener2 = getHeroSeekBarChangeListener();
                if (heroSeekBarChangeListener2 != null) {
                    heroSeekBarChangeListener2.D0(getHeroSeekBar(), getUserSeekProgress());
                }
                int h18 = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479646bl);
                getHeroSeekBar().setPadding(h18, 0, h18, 0);
                setHeroProgressDrawable(com.tencent.mm.R.drawable.d9r);
                getHeroSeekBar().setThumb(i65.a.i(getContext(), com.tencent.mm.R.drawable.agh));
                setBarVisibleExcludeProgress(0);
                android.widget.TextView indCurrentTimeTv2 = getIndCurrentTimeTv();
                android.view.View view2 = (android.view.View) (indCurrentTimeTv2 != null ? indCurrentTimeTv2.getParent() : null);
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(4);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView", "onSeekBarStopTrackingTouch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView", "onSeekBarStopTrackingTouch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                z35.g0 visibleChangeListener2 = getVisibleChangeListener();
                if (visibleChangeListener2 != null) {
                    visibleChangeListener2.a(true);
                }
                e();
                e();
            } else {
                this.N = 0.0f;
                this.P = 0.0f;
                this.Q = 0.0f;
                this.R = 0L;
            }
        } else {
            float x17 = motionEvent.getX();
            this.N = x17;
            this.Q = x17;
            this.R = java.lang.System.currentTimeMillis();
        }
        return true;
    }

    public final void m(int i17, boolean z17) {
        z35.d0 heroSeekBarChangeListener = getHeroSeekBarChangeListener();
        if (heroSeekBarChangeListener != null) {
            heroSeekBarChangeListener.onProgressChanged(getHeroSeekBar(), i17, z17);
        }
        if (z17) {
            setUserSeekProgress(i17);
            setLastProgressMs(getMTotalTimeMs() * i17);
            k(i17);
            postDelayed(new z35.u0(this, i17), 500L);
        }
    }

    public final void n(boolean z17) {
        if (this.M == z17) {
            return;
        }
        this.M = z17;
        if (!getUserTouching()) {
            java.lang.Object tag = getPlayMediaBtn().getTag(com.tencent.mm.R.id.vca);
            if ((!this.M || !kotlin.jvm.internal.o.b(tag, "playing")) && (this.M || !kotlin.jvm.internal.o.b(tag, "pause"))) {
                if (this.M) {
                    getPlayMediaBtn().setBackground(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.pause_filled, i65.a.d(getContext(), com.tencent.mm.R.color.aby)));
                    getPlayMediaBtn().setTag(com.tencent.mm.R.id.vca, "playing");
                    getPlayMediaBtn().setContentDescription(getContext().getString(com.tencent.mm.R.string.f493851pc5));
                } else {
                    getPlayMediaBtn().setBackground(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.play_filled, i65.a.d(getContext(), com.tencent.mm.R.color.aby)));
                    com.tencent.mm.ui.base.MMImageButton playMediaBtn = getPlayMediaBtn();
                    if (playMediaBtn != null) {
                        playMediaBtn.setTag(com.tencent.mm.R.id.vca, "pause");
                    }
                    getPlayMediaBtn().setContentDescription(getContext().getString(com.tencent.mm.R.string.pc6));
                }
            }
        }
        z35.s0 s0Var = this.videoPlayStatusListener;
        if (s0Var != null) {
            s0Var.a(z17);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.T) {
            return l(motionEvent);
        }
        return false;
    }

    public final void setBarVisible(boolean z17) {
        if (z17) {
            android.view.View showInfoLayout = getShowInfoLayout();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(showInfoLayout, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView", "setBarVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            showInfoLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(showInfoLayout, "com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView", "setBarVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View showInfoLayout2 = getShowInfoLayout();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(showInfoLayout2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView", "setBarVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            showInfoLayout2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(showInfoLayout2, "com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView", "setBarVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        z35.g0 visibleChangeListener = getVisibleChangeListener();
        if (visibleChangeListener != null) {
            visibleChangeListener.a(z17);
        }
        e();
    }

    public final void setBarVisibleExcludeProgress(int i17) {
        getPlayMediaBtn().setVisibility(i17);
        android.view.View showInfoLayout = getShowInfoLayout();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(showInfoLayout, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView", "setBarVisibleExcludeProgress", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        showInfoLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(showInfoLayout, "com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView", "setBarVisibleExcludeProgress", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView
    public void setEnableDrag(boolean z17) {
        this.T = z17;
    }

    public final void setUserOperateListener(z35.e0 e0Var) {
        this.userOperateListener = e0Var;
    }

    public final void setVideoPlayStatusListener(z35.s0 s0Var) {
        this.videoPlayStatusListener = s0Var;
    }
}
