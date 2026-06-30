package com.tencent.rtmp.ui;

/* loaded from: classes14.dex */
public class TXCloudVideoView extends android.widget.FrameLayout implements android.view.ScaleGestureDetector.OnScaleGestureListener {
    private static final int FOCUS_AREA_SIZE_IN_DP = 70;
    private java.lang.ref.WeakReference<com.tencent.rtmp.ui.TXCloudVideoView.b> mCallback;
    private final android.graphics.Rect mDashMargin;
    private final com.tencent.rtmp.ui.Dashboard mDashboard;
    private final com.tencent.rtmp.ui.TXCloudVideoView.a mDelayedTapRunnable;
    private final java.util.HashSet<android.view.TextureView> mDeprecatedTextureViewSet;
    private boolean mEnableShowLog;
    private boolean mEnableTouchToFocus;
    private boolean mEnableZoom;
    private com.tencent.rtmp.ui.FocusIndicatorView mFocusIndicatorView;
    protected java.lang.Object mGLContext;
    private final java.lang.Runnable mHideIndicatorViewRunnable;
    private float mLastScaleFactor;
    private float mScaleFactor;
    private android.view.ScaleGestureDetector mScaleGestureDetector;
    private java.lang.ref.WeakReference<android.view.Surface> mSurface;
    private final java.lang.ref.WeakReference<android.view.SurfaceView> mSurfaceView;
    private final java.lang.String mTAG;
    private android.view.TextureView mTopTextureView;
    private java.lang.String mUserId;
    private android.view.TextureView mVideoViewSetByUser;
    private com.tencent.rtmp.ui.AndroidViewEventListener mViewEventListener;

    /* loaded from: classes14.dex */
    public interface b {
        void onShowLog(boolean z17);
    }

    public TXCloudVideoView(android.content.Context context) {
        this(context, null, null);
    }

    private void addViewInternal(android.view.TextureView textureView) {
        if (textureView == null) {
            com.tencent.liteav.base.util.LiteavLog.w(this.mTAG, "addViewInternal,TextureView is null.");
            return;
        }
        if (textureView.getParent() == null) {
            addView(textureView);
            updateTopTextureView();
        } else if (textureView.getParent() == this) {
            com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "view has been added.");
        } else {
            com.tencent.liteav.base.util.LiteavLog.w(this.mTAG, "view has been added to other parent view. parent=" + textureView.getParent());
        }
        this.mDeprecatedTextureViewSet.remove(textureView);
    }

    private android.view.TextureView getTextureViewSetByUser() {
        return this.mVideoViewSetByUser;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideIndicatorView() {
        com.tencent.rtmp.ui.FocusIndicatorView focusIndicatorView = this.mFocusIndicatorView;
        if (focusIndicatorView != null) {
            focusIndicatorView.setVisibility(8);
        }
    }

    private boolean isShowLogEnabled() {
        return this.mEnableShowLog;
    }

    private static int px2dip(android.content.Context context, float f17) {
        return (int) ((f17 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void removeDeprecatedViews(android.view.TextureView textureView) {
        java.util.Iterator<android.view.TextureView> it = this.mDeprecatedTextureViewSet.iterator();
        while (it.hasNext()) {
            android.view.TextureView next = it.next();
            if (next != null && next != textureView) {
                try {
                    removeView(next);
                } catch (java.lang.Exception e17) {
                    com.tencent.liteav.base.util.LiteavLog.e(this.mTAG, "removeView view error: ", e17);
                }
                it.remove();
            }
        }
        updateTopTextureView();
    }

    private void removeViewInternal(android.view.TextureView textureView, boolean z17) {
        if (textureView == null) {
            return;
        }
        if (z17) {
            try {
                removeView(textureView);
            } catch (java.lang.Exception e17) {
                com.tencent.liteav.base.util.LiteavLog.e(this.mTAG, "removeView view error: ", e17);
            }
            updateTopTextureView();
            this.mDeprecatedTextureViewSet.remove(textureView);
            return;
        }
        if (textureView.getParent() == this) {
            removeDeprecatedViews(textureView);
            this.mDeprecatedTextureViewSet.add(textureView);
        } else if (textureView.getParent() == null) {
            com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "current view has been removed from the parent view. view=".concat(java.lang.String.valueOf(textureView)));
        } else if (textureView.getParent() != this) {
            com.tencent.liteav.base.util.LiteavLog.w(this.mTAG, "current view is not a child view of this view. parent=" + textureView.getParent());
        }
    }

    private void repositionDashBoard() {
        try {
            removeView(this.mDashboard);
        } catch (java.lang.Exception e17) {
            com.tencent.liteav.base.util.LiteavLog.e(this.mTAG, "removeView dashboard view error: ", e17);
        }
        addView(this.mDashboard);
    }

    private void setAndroidViewEventListener(com.tencent.rtmp.ui.AndroidViewEventListener androidViewEventListener) {
        this.mViewEventListener = androidViewEventListener;
    }

    private void setBackgroundColorForInternalView(int i17) {
        com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "setBackgroundColorForInternalView color:".concat(java.lang.String.valueOf(i17)));
        if (this.mSurface == null && this.mSurfaceView == null) {
            int i18 = (i17 >> 16) & 255;
            post(com.tencent.rtmp.ui.b.a(this, i17 & 255, (i17 >> 24) & 255, i18, (i17 >> 8) & 255));
        }
    }

    private void setShowLogCallback(java.lang.ref.WeakReference<com.tencent.rtmp.ui.TXCloudVideoView.b> weakReference) {
        this.mCallback = weakReference;
    }

    private void setTouchToFocusEnabled(boolean z17) {
        this.mEnableTouchToFocus = z17;
    }

    private void setZoomEnabled(boolean z17) {
        com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "setZoomEnabled: ".concat(java.lang.String.valueOf(z17)));
        this.mEnableZoom = z17;
    }

    private void showFocusView(int i17, int i18, int i19, int i27) {
        post(com.tencent.rtmp.ui.c.a(this, i17, i18, i19, i27));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showFocusViewInternal(int i17, int i18, int i19, int i27) {
        if ((i19 != 0 && i19 != getWidth()) || (i27 != 0 && i27 != getHeight())) {
            com.tencent.liteav.base.util.LiteavLog.i(this.mTAG, "ignore show indicator view when view size changed");
            return;
        }
        com.tencent.liteav.base.util.LiteavLog.v(this.mTAG, "show indicator view at (%d,%d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        removeCallbacks(this.mHideIndicatorViewRunnable);
        int i28 = (int) ((getResources().getDisplayMetrics().density * 70.0f) + 0.5f);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i28, i28);
        int i29 = i28 / 2;
        layoutParams.leftMargin = com.tencent.liteav.base.util.g.a(i17 - i29, 0, getWidth() - i28);
        layoutParams.topMargin = com.tencent.liteav.base.util.g.a(i18 - i29, 0, getHeight() - i28);
        android.view.View view = this.mFocusIndicatorView;
        if (view == null) {
            com.tencent.rtmp.ui.FocusIndicatorView focusIndicatorView = new com.tencent.rtmp.ui.FocusIndicatorView(getContext());
            this.mFocusIndicatorView = focusIndicatorView;
            addView(focusIndicatorView, layoutParams);
        } else if (indexOfChild(view) != getChildCount() - 1) {
            try {
                removeView(this.mFocusIndicatorView);
            } catch (java.lang.Exception e17) {
                com.tencent.liteav.base.util.LiteavLog.e(this.mTAG, "removeView focus indicator view error: ", e17);
            }
            addView(this.mFocusIndicatorView, layoutParams);
        } else {
            this.mFocusIndicatorView.setLayoutParams(layoutParams);
        }
        this.mFocusIndicatorView.setVisibility(0);
        com.tencent.rtmp.ui.FocusIndicatorView focusIndicatorView2 = this.mFocusIndicatorView;
        focusIndicatorView2.startAnimation(focusIndicatorView2.f215277a);
        postDelayed(this.mHideIndicatorViewRunnable, java.util.concurrent.TimeUnit.SECONDS.toMillis(1L));
    }

    private void updateTopTextureView() {
        android.view.TextureView textureView;
        int childCount = getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                textureView = null;
                break;
            }
            android.view.View childAt = getChildAt(childCount);
            if (childAt instanceof android.view.TextureView) {
                textureView = (android.view.TextureView) childAt;
                break;
            }
            childCount--;
        }
        if (this.mTopTextureView != textureView) {
            this.mTopTextureView = textureView;
        }
    }

    public void addVideoView(android.view.TextureView textureView) {
        removeViewInternal(this.mVideoViewSetByUser, true);
        addViewInternal(textureView);
        this.mVideoViewSetByUser = textureView;
        repositionDashBoard();
    }

    public void clearLastFrame(boolean z17) {
        if (z17) {
            setVisibility(8);
        }
    }

    public void clearLog() {
        com.tencent.rtmp.ui.Dashboard dashboard = this.mDashboard;
        if (dashboard != null) {
            dashboard.f215270a.setLength(0);
            android.widget.TextView textView = dashboard.f215271b;
            if (textView != null) {
                textView.setText("");
            }
            android.widget.TextView textView2 = dashboard.f215272c;
            if (textView2 != null) {
                textView2.setText("");
            }
        }
    }

    public void disableLog(boolean z17) {
    }

    @java.lang.Deprecated
    public android.view.TextureView getHWVideoView() {
        return getVideoView();
    }

    public java.lang.Object getOpenGLContext() {
        return this.mGLContext;
    }

    public android.view.Surface getSurface() {
        java.lang.ref.WeakReference<android.view.Surface> weakReference = this.mSurface;
        if (weakReference == null) {
            return null;
        }
        android.view.Surface surface = weakReference.get();
        if (surface == null) {
            com.tencent.liteav.base.util.LiteavLog.w(this.mTAG, "surface is null.");
        }
        return surface;
    }

    public android.view.SurfaceView getSurfaceView() {
        java.lang.ref.WeakReference<android.view.SurfaceView> weakReference = this.mSurfaceView;
        if (weakReference == null) {
            return null;
        }
        android.view.SurfaceView surfaceView = weakReference.get();
        if (surfaceView == null) {
            com.tencent.liteav.base.util.LiteavLog.w(this.mTAG, "surfaceView is null.");
        }
        return surfaceView;
    }

    public java.lang.String getUserId() {
        return this.mUserId;
    }

    @java.lang.Deprecated
    public android.view.TextureView getVideoView() {
        android.view.TextureView textureView = this.mVideoViewSetByUser;
        return textureView != null ? textureView : this.mTopTextureView;
    }

    public void onDestroy() {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        com.tencent.rtmp.ui.Dashboard dashboard = this.mDashboard;
        android.graphics.Rect rect = this.mDashMargin;
        dashboard.a(rect.left, rect.top, rect.right, rect.bottom);
        this.mDashboard.setStatusTextSize((float) (px2dip(getContext(), getWidth()) / 30.0d));
        this.mDashboard.setEventTextSize((float) (px2dip(getContext(), getWidth()) / 25.0d));
    }

    public void onPause() {
    }

    public void onResume() {
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(android.view.ScaleGestureDetector scaleGestureDetector) {
        if (!this.mEnableZoom) {
            return false;
        }
        float scaleFactor = scaleGestureDetector.getScaleFactor() - this.mLastScaleFactor;
        this.mLastScaleFactor = scaleGestureDetector.getScaleFactor();
        float a17 = com.tencent.liteav.base.util.g.a(this.mScaleFactor + scaleFactor, 0.0f);
        this.mScaleFactor = a17;
        com.tencent.rtmp.ui.AndroidViewEventListener androidViewEventListener = this.mViewEventListener;
        if (androidViewEventListener != null) {
            androidViewEventListener.onZoom(a17);
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(android.view.ScaleGestureDetector scaleGestureDetector) {
        this.mLastScaleFactor = scaleGestureDetector.getScaleFactor();
        return this.mEnableZoom;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(android.view.ScaleGestureDetector scaleGestureDetector) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        com.tencent.rtmp.ui.AndroidViewEventListener androidViewEventListener = this.mViewEventListener;
        if (androidViewEventListener != null) {
            androidViewEventListener.onSizeChanged(i17, i18, i19, i27);
        }
        super.onSizeChanged(i17, i18, i19, i27);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1 && motionEvent.getAction() == 0) {
            if (this.mEnableTouchToFocus) {
                com.tencent.rtmp.ui.TXCloudVideoView.a aVar = this.mDelayedTapRunnable;
                int x17 = (int) motionEvent.getX();
                int y17 = (int) motionEvent.getY();
                int width = getWidth();
                int height = getHeight();
                android.graphics.Point point = aVar.f215286a;
                point.x = x17;
                point.y = y17;
                aVar.f215287b = width;
                aVar.f215288c = height;
                removeCallbacks(this.mDelayedTapRunnable);
                postDelayed(this.mDelayedTapRunnable, 100L);
            }
        } else if (motionEvent.getPointerCount() > 1 && motionEvent.getAction() == 2 && this.mEnableZoom) {
            removeCallbacks(this.mDelayedTapRunnable);
            hideIndicatorView();
            if (this.mScaleGestureDetector == null) {
                this.mScaleGestureDetector = new android.view.ScaleGestureDetector(getContext(), this);
            }
            this.mScaleGestureDetector.onTouchEvent(motionEvent);
        }
        if (!this.mEnableZoom) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            performClick();
        }
        return true;
    }

    public void removeVideoView() {
        removeViewInternal(this.mVideoViewSetByUser, true);
        this.mVideoViewSetByUser = null;
    }

    public void setDashBoardMarginInPx(int i17, int i18, int i19, int i27) {
        android.graphics.Rect rect = this.mDashMargin;
        rect.left = i17;
        rect.right = i18;
        rect.top = i19;
        rect.bottom = i27;
        this.mDashboard.a(i17, i19, i18, i27);
    }

    public void setDashBoardMarginInRatio(final float f17, final float f18, final float f19, final float f27) {
        postDelayed(new java.lang.Runnable() { // from class: com.tencent.rtmp.ui.TXCloudVideoView.1
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.rtmp.ui.TXCloudVideoView.this.setDashBoardMarginInPx((int) (r0.getWidth() * f17), (int) (com.tencent.rtmp.ui.TXCloudVideoView.this.getWidth() * f18), (int) (com.tencent.rtmp.ui.TXCloudVideoView.this.getHeight() * f19), (int) (com.tencent.rtmp.ui.TXCloudVideoView.this.getHeight() * f27));
            }
        }, 100L);
    }

    public void setLogMargin(float f17, float f18, float f19, float f27) {
        setDashBoardMarginInPx((int) f17, (int) f18, (int) f19, (int) f27);
    }

    public void setOpenGLContext(java.lang.Object obj) {
        this.mGLContext = obj;
    }

    public void setUserId(java.lang.String str) {
        this.mUserId = str;
    }

    public void showLog(boolean z17) {
        this.mEnableShowLog = z17;
        java.lang.ref.WeakReference<com.tencent.rtmp.ui.TXCloudVideoView.b> weakReference = this.mCallback;
        com.tencent.rtmp.ui.TXCloudVideoView.b bVar = weakReference == null ? null : weakReference.get();
        if (bVar != null) {
            bVar.onShowLog(z17);
        }
    }

    public TXCloudVideoView(android.view.SurfaceView surfaceView) {
        this(surfaceView.getContext(), null, surfaceView);
    }

    public TXCloudVideoView(android.content.Context context, android.view.Surface surface) {
        this(context, null, null);
        this.mSurface = surface != null ? new java.lang.ref.WeakReference<>(surface) : null;
    }

    /* loaded from: classes14.dex */
    public class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final android.graphics.Point f215286a;

        /* renamed from: b, reason: collision with root package name */
        int f215287b;

        /* renamed from: c, reason: collision with root package name */
        int f215288c;

        private a() {
            this.f215286a = new android.graphics.Point();
            this.f215287b = 0;
            this.f215288c = 0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (com.tencent.rtmp.ui.TXCloudVideoView.this.mViewEventListener != null) {
                com.tencent.rtmp.ui.AndroidViewEventListener androidViewEventListener = com.tencent.rtmp.ui.TXCloudVideoView.this.mViewEventListener;
                android.graphics.Point point = this.f215286a;
                androidViewEventListener.onTap(point.x, point.y, this.f215287b, this.f215288c);
            }
        }

        public /* synthetic */ a(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, byte b17) {
            this();
        }
    }

    public TXCloudVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, null);
    }

    public TXCloudVideoView(android.content.Context context, android.util.AttributeSet attributeSet, android.view.SurfaceView surfaceView) {
        super(context, attributeSet);
        this.mTAG = "TXCloudVideoView_" + hashCode();
        this.mDashMargin = new android.graphics.Rect();
        this.mDeprecatedTextureViewSet = new java.util.HashSet<>();
        this.mEnableTouchToFocus = false;
        this.mDelayedTapRunnable = new com.tencent.rtmp.ui.TXCloudVideoView.a(this, (byte) 0);
        this.mEnableZoom = false;
        this.mUserId = "";
        this.mHideIndicatorViewRunnable = com.tencent.rtmp.ui.a.a(this);
        this.mDashboard = new com.tencent.rtmp.ui.Dashboard(context);
        this.mSurfaceView = surfaceView != null ? new java.lang.ref.WeakReference<>(surfaceView) : null;
    }
}
