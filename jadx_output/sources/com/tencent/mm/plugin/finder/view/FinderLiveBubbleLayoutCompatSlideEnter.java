package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderLiveBubbleLayoutCompatSlideEnter;", "Lcom/tencent/mm/plugin/finder/view/FinderFeedBubbleTipsLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLiveBubbleLayoutCompatSlideEnter extends com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout {
    public static final /* synthetic */ int R = 0;
    public uc2.i B;
    public android.view.GestureDetector C;
    public android.widget.Scroller D;
    public final android.widget.FrameLayout E;
    public float F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f131193J;
    public int K;
    public com.tencent.mm.plugin.finder.feed.k8 L;
    public boolean M;
    public boolean N;
    public int P;
    public final java.lang.Runnable Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveBubbleLayoutCompatSlideEnter(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.E = new android.widget.FrameLayout(getContext());
        this.Q = new com.tencent.mm.plugin.finder.view.xc(this);
        this.C = new android.view.GestureDetector(new com.tencent.mm.plugin.finder.view.yc(this));
        this.D = new android.widget.Scroller(getContext(), new android.view.animation.DecelerateInterpolator());
    }

    public static final void d(com.tencent.mm.plugin.finder.view.FinderLiveBubbleLayoutCompatSlideEnter finderLiveBubbleLayoutCompatSlideEnter) {
        android.view.View videoView;
        finderLiveBubbleLayoutCompatSlideEnter.getClass();
        com.tencent.mars.xlog.Log.i("FinderLiveBubbleLayoutCompatSlideEnter", "reset");
        android.widget.FrameLayout frameLayout = finderLiveBubbleLayoutCompatSlideEnter.E;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        if (frameLayout != null) {
            frameLayout.setX(finderLiveBubbleLayoutCompatSlideEnter.getWidth());
        }
        finderLiveBubbleLayoutCompatSlideEnter.f131193J = 0;
        finderLiveBubbleLayoutCompatSlideEnter.K = 0;
        if (frameLayout != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(frameLayout, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "invisible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(frameLayout, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderLiveBubbleLayoutCompatSlideEnter", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            frameLayout.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(frameLayout, "com/tencent/mm/plugin/finder/view/FinderLiveBubbleLayoutCompatSlideEnter", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(frameLayout, "com/tencent/mm/kt/CommonKt", "invisible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        finderLiveBubbleLayoutCompatSlideEnter.M = false;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout mediaView = ((com.tencent.mm.plugin.finder.view.FinderMediaLayout) finderLiveBubbleLayoutCompatSlideEnter.findViewById(com.tencent.mm.R.id.fs6)).getVideoBanner().getMediaView();
        cw2.da videoView2 = mediaView.getVideoView();
        if (videoView2 == null || (videoView = videoView2.getVideoView()) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.VideoLayout", "addVideoViewAndClearSnapShot");
        pm0.v.B(videoView);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(mediaView, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(intValue2));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(mediaView, arrayList4.toArray(), "com/tencent/mm/plugin/finder/video/FinderVideoLayout", "addVideoViewAndClearSnapShot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mediaView.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(mediaView, "com/tencent/mm/plugin/finder/video/FinderVideoLayout", "addVideoViewAndClearSnapShot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(mediaView, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (mediaView.getChildCount() > 0) {
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            mediaView.addView(videoView, 1, layoutParams);
        }
        android.widget.ImageView imageView = mediaView.f130708f;
        if (imageView != null) {
            pm0.v.B(imageView);
        }
        videoView.setTag(com.tencent.mm.R.id.tin, java.lang.Boolean.FALSE);
    }

    @Override // com.tencent.mm.plugin.finder.view.SimpleTouchableLayout, com.tencent.mm.plugin.finder.view.z
    public boolean canScrollHorizontally(int i17, android.view.ViewGroup parent, float f17, float f18) {
        kotlin.jvm.internal.o.g(parent, "parent");
        return (this.P == 4 && i17 > 0) || super.canScrollHorizontally(i17, parent, f17, f18);
    }

    @Override // android.view.View
    public void computeScroll() {
        android.widget.Scroller scroller = this.D;
        if (scroller == null || !scroller.computeScrollOffset()) {
            return;
        }
        android.widget.FrameLayout frameLayout = this.E;
        if (frameLayout != null) {
            frameLayout.setX(scroller.getCurrX());
        }
        postInvalidate();
        e(this.f131193J);
    }

    @Override // com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout, com.tencent.mm.plugin.finder.view.SimpleTouchableLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        boolean z17 = true;
        if (valueOf != null && valueOf.intValue() == 0) {
            new com.tencent.mm.autogen.events.FinderLiveFeedCancelTipShowEvent().e();
            this.N = true;
        } else {
            if ((valueOf == null || valueOf.intValue() != 1) && (valueOf == null || valueOf.intValue() != 3)) {
                z17 = false;
            }
            if (z17) {
                this.N = false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i17) {
        if (i17 != this.K) {
            if (i17 == 1) {
                com.tencent.mars.xlog.Log.i("FinderLiveBubbleLayoutCompatSlideEnter", "initTempContainer");
                android.widget.FrameLayout frameLayout = this.E;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                if (frameLayout != null) {
                    frameLayout.setX(getWidth());
                }
                if (frameLayout != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(frameLayout, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(java.lang.Integer.valueOf(intValue));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(frameLayout, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderLiveBubbleLayoutCompatSlideEnter", "initTempContainer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    frameLayout.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(frameLayout, "com/tencent/mm/plugin/finder/view/FinderLiveBubbleLayoutCompatSlideEnter", "initTempContainer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    yj0.a.f(frameLayout, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View U = ((com.tencent.mm.plugin.finder.view.FinderMediaLayout) findViewById(com.tencent.mm.R.id.fs6)).getVideoBanner().getMediaView().U();
                if (U != null) {
                    pm0.v.B(U);
                }
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                if (U != null && frameLayout != null) {
                    frameLayout.addView(U, new android.widget.FrameLayout.LayoutParams(-1, -1));
                }
            }
            this.K = i17;
        }
    }

    public final void f(int i17) {
        com.tencent.mars.xlog.Log.i("FinderLiveBubbleLayoutCompatSlideEnter", "processPageSelected position=" + i17);
        postDelayed(new com.tencent.mm.plugin.finder.view.ad(this, i17), 500L);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        addView(this.E, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.tencent.mm.plugin.finder.view.SimpleTouchableLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (ev6.getAction() == 0) {
            this.F = ev6.getX();
            android.widget.FrameLayout frameLayout = this.E;
            if (frameLayout != null) {
                frameLayout.setX(getWidth());
            }
            if (frameLayout != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(frameLayout, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(frameLayout, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderLiveBubbleLayoutCompatSlideEnter", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                frameLayout.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(frameLayout, "com/tencent/mm/plugin/finder/view/FinderLiveBubbleLayoutCompatSlideEnter", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(frameLayout, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.Scroller scroller = this.D;
            if (scroller != null) {
                scroller.abortAnimation();
            }
        }
        int action = ev6.getAction();
        if (action == 0) {
            this.H = (int) ev6.getX();
            this.I = (int) ev6.getY();
            android.view.GestureDetector gestureDetector = this.C;
            if (gestureDetector != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(ev6);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(gestureDetector, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/FinderLiveBubbleLayoutCompatSlideEnter", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList3.get(0)), "com/tencent/mm/plugin/finder/view/FinderLiveBubbleLayoutCompatSlideEnter", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            }
        } else if (action == 2) {
            int x17 = (int) ev6.getX();
            int y17 = (int) ev6.getY();
            int i17 = x17 - this.H;
            int i18 = y17 - this.I;
            if (this.P != 4) {
                return super.onInterceptTouchEvent(ev6);
            }
            if (this.f131193J == 0) {
                double d17 = i17;
                if (java.lang.Math.abs(d17) > java.lang.Math.abs(i18) && java.lang.Math.abs(d17) > 3.0d && i17 < 0) {
                    com.tencent.mars.xlog.Log.i("FinderLiveBubbleLayoutCompatSlideEnter", "onInterceptTouchEvent true");
                    requestDisallowInterceptTouchEvent(true);
                    this.M = true;
                    return true;
                }
            } else {
                double d18 = i17;
                if (java.lang.Math.abs(d18) > java.lang.Math.abs(i18) && java.lang.Math.abs(d18) >= 0.0d) {
                    com.tencent.mars.xlog.Log.i("FinderLiveBubbleLayoutCompatSlideEnter", "onInterceptTouchEvent true");
                    requestDisallowInterceptTouchEvent(true);
                    this.M = true;
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(ev6);
    }

    @Override // com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        android.widget.FrameLayout frameLayout = this.E;
        if (frameLayout != null) {
            frameLayout.layout(getWidth(), i18, getWidth() * 2, i27);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
    
        if (r0 != 3) goto L47;
     */
    @Override // com.tencent.mm.plugin.finder.view.SimpleTouchableLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.FinderLiveBubbleLayoutCompatSlideEnter.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
