package com.tencent.mm.rfx;

/* loaded from: classes13.dex */
public class RfxPagView extends android.view.TextureView implements android.view.TextureView.SurfaceTextureListener, gs.c, com.tencent.mm.rfx.inner.g {
    private com.tencent.mm.rfx.inner.RfxPagAnimator mAnimator;
    private java.lang.String mFilePath;
    private boolean mIsAttachedToWindow;
    private boolean mIsVisible;
    private android.view.TextureView.SurfaceTextureListener mListener;
    private final java.util.ArrayList<com.tencent.mm.rfx.h> mPagFlushListeners;
    private com.tencent.mm.rfx.RfxPagPlayer mPagPlayer;
    private com.tencent.mm.rfx.RfxPagSurface mPagSurface;
    private android.opengl.EGLContext mSharedContext;
    private com.tencent.mm.rfx.j mSurfaceDestroyTaskExecutor;
    private final java.util.ArrayList<com.tencent.mm.rfx.i> mViewListeners;

    public RfxPagView(android.content.Context context) {
        super(context);
        this.mPagPlayer = null;
        this.mPagSurface = null;
        this.mAnimator = null;
        this.mFilePath = "";
        this.mIsAttachedToWindow = false;
        this.mSharedContext = null;
        this.mViewListeners = new java.util.ArrayList<>();
        this.mPagFlushListeners = new java.util.ArrayList<>();
        this.mSurfaceDestroyTaskExecutor = null;
        this.mIsVisible = false;
        setupSurfaceTexture();
    }

    private void checkVisible() {
        boolean z17 = this.mIsAttachedToWindow && isShown();
        if (this.mIsVisible == z17) {
            return;
        }
        this.mIsVisible = z17;
        if (!z17) {
            getPagAnimator().setDuration(0L);
        } else {
            getPagAnimator().setDuration(getPagPlayer().duration());
            getPagAnimator().update();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroySurface(android.graphics.SurfaceTexture surfaceTexture) {
        getPagPlayer().setSurface(null);
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.mListener;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        }
    }

    private com.tencent.mm.rfx.inner.RfxPagAnimator getPagAnimator() {
        getPagPlayer();
        if (this.mAnimator == null) {
            this.mAnimator = com.tencent.mm.rfx.inner.RfxPagAnimator.MakeFrom(getContext(), this);
        }
        return this.mAnimator;
    }

    private com.tencent.mm.rfx.RfxPagPlayer getPagPlayer() {
        if (this.mPagPlayer == null) {
            this.mPagPlayer = new com.tencent.mm.rfx.RfxPagPlayer();
        }
        return this.mPagPlayer;
    }

    private void setupSurfaceTexture() {
        gs.a aVar = gs.a.f274958f;
        aVar.getClass();
        if (getContext() instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) getContext();
            if (!activity.isDestroyed()) {
                android.app.FragmentManager fragmentManager = activity.getFragmentManager();
                gs.b bVar = (gs.b) ((java.util.HashMap) aVar.f274960e).get(fragmentManager);
                if (bVar == null && (bVar = (gs.b) fragmentManager.findFragmentByTag("io.rfxpag.manager")) == null) {
                    bVar = new gs.b();
                    ((java.util.HashMap) aVar.f274960e).put(fragmentManager, bVar);
                    fragmentManager.beginTransaction().add(bVar, "io.rfxpag.manager").commitAllowingStateLoss();
                    aVar.f274959d.obtainMessage(1, fragmentManager).sendToTarget();
                }
                synchronized (bVar.f274962e) {
                    bVar.f274961d.add(this);
                }
            }
        }
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    private void updateTextureView() {
        post(new com.tencent.mm.rfx.d(this));
    }

    public void addListener(com.tencent.mm.rfx.i iVar) {
        synchronized (this) {
            this.mViewListeners.add(iVar);
        }
    }

    @java.lang.Deprecated
    public void addPagFlushListener(com.tencent.mm.rfx.h hVar) {
        synchronized (this) {
            this.mPagFlushListeners.add(hVar);
        }
    }

    public long duration() {
        return getPagPlayer().duration();
    }

    public boolean flush() {
        return getPagPlayer().flush();
    }

    public com.tencent.mm.rfx.RfxPagFrameInfo flushWithInfo() {
        return getPagPlayer().flushWithInfo();
    }

    public void freeCache() {
    }

    public com.tencent.mm.rfx.RfxPagFile getComposition() {
        return getPagPlayer().getComposition();
    }

    public java.lang.String getPath() {
        return this.mFilePath;
    }

    public double getProgress() {
        return getPagPlayer().getProgress();
    }

    public boolean isPlaying() {
        return getPagAnimator().isRunning();
    }

    public boolean isSync() {
        return getPagAnimator().isSync();
    }

    public android.graphics.Matrix matrix() {
        return getPagPlayer().matrix();
    }

    public float maxFrameRate() {
        return getPagPlayer().maxFrameRate();
    }

    @Override // com.tencent.mm.rfx.inner.g
    public void onAnimationCancel(com.tencent.mm.rfx.inner.RfxPagAnimator rfxPagAnimator) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.mViewListeners);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.rfx.i) it.next()).c(this);
        }
    }

    @Override // com.tencent.mm.rfx.inner.g
    public void onAnimationEnd(com.tencent.mm.rfx.inner.RfxPagAnimator rfxPagAnimator) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.mViewListeners);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.rfx.i) it.next()).d(this);
        }
    }

    @Override // com.tencent.mm.rfx.inner.g
    public void onAnimationRepeat(com.tencent.mm.rfx.inner.RfxPagAnimator rfxPagAnimator) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.mViewListeners);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.rfx.i) it.next()).a(this);
        }
    }

    @Override // com.tencent.mm.rfx.inner.g
    public void onAnimationStart(com.tencent.mm.rfx.inner.RfxPagAnimator rfxPagAnimator) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.mViewListeners);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.rfx.i) it.next()).f(this);
        }
    }

    @Override // com.tencent.mm.rfx.inner.g
    public void onAnimationUpdate(com.tencent.mm.rfx.inner.RfxPagAnimator rfxPagAnimator) {
        java.util.ArrayList arrayList;
        getPagPlayer().setProgress(rfxPagAnimator.progress());
        synchronized (this) {
            if (this.mIsAttachedToWindow) {
                if (this.mIsVisible) {
                    rfxPagAnimator.setDuration(getPagPlayer().duration());
                }
                com.tencent.mm.rfx.RfxPagFrameInfo flushWithInfo = flushWithInfo();
                if (flushWithInfo != null) {
                    if (flushWithInfo.frameChanged) {
                        updateTextureView();
                    }
                    synchronized (this) {
                        arrayList = new java.util.ArrayList(this.mViewListeners);
                    }
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.rfx.i iVar = (com.tencent.mm.rfx.i) it.next();
                        iVar.b(this);
                        iVar.e(this, flushWithInfo);
                    }
                    if (this.mPagFlushListeners.isEmpty()) {
                        return;
                    }
                    post(new com.tencent.mm.rfx.g(this));
                }
            }
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        this.mIsAttachedToWindow = true;
        super.onAttachedToWindow();
        checkVisible();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.mIsAttachedToWindow = false;
        super.onDetachedFromWindow();
        com.tencent.mm.rfx.RfxPagSurface rfxPagSurface = this.mPagSurface;
        if (rfxPagSurface != null) {
            rfxPagSurface.release();
            this.mPagSurface = null;
        }
        checkVisible();
    }

    @Override // gs.c
    public void onResume() {
        if (this.mIsVisible) {
            setVisibility(4);
            setVisibility(0);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mm.rfx.RfxPagSurface rfxPagSurface = this.mPagSurface;
        if (rfxPagSurface != null) {
            rfxPagSurface.release();
            this.mPagSurface = null;
        }
        this.mPagSurface = com.tencent.mm.rfx.RfxPagSurface.FromSurfaceTexture(surfaceTexture, this.mSharedContext);
        getPagPlayer().setSurface(this.mPagSurface);
        if (this.mPagSurface == null) {
            return;
        }
        getPagAnimator().update();
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.mListener;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i17, i18);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mm.rfx.j jVar = this.mSurfaceDestroyTaskExecutor;
        if (jVar != null) {
            com.tencent.mm.rfx.e eVar = new com.tencent.mm.rfx.e(this, surfaceTexture);
            ((ym5.y1) jVar).getClass();
            ((ku5.t0) ku5.t0.f312615d).g(eVar);
        } else {
            destroySurface(surfaceTexture);
        }
        post(new com.tencent.mm.rfx.f(this, surfaceTexture));
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mm.rfx.RfxPagSurface rfxPagSurface = this.mPagSurface;
        if (rfxPagSurface != null) {
            rfxPagSurface.updateSize();
            getPagAnimator().update();
        }
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.mListener;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i17, i18);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.mListener;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z17) {
        super.onVisibilityAggregated(this.mIsVisible);
        checkVisible();
    }

    public void pause() {
        getPagAnimator().cancel();
    }

    public void play() {
        getPagPlayer().prepare();
        getPagAnimator().start();
    }

    public void release() {
        com.tencent.mm.rfx.RfxPagSurface rfxPagSurface = this.mPagSurface;
        if (rfxPagSurface != null) {
            rfxPagSurface.release();
            this.mPagSurface = null;
        }
        com.tencent.mm.rfx.RfxPagPlayer rfxPagPlayer = this.mPagPlayer;
        if (rfxPagPlayer != null) {
            rfxPagPlayer.release();
        }
    }

    public void removeListener(com.tencent.mm.rfx.i iVar) {
        synchronized (this) {
            this.mViewListeners.remove(iVar);
        }
    }

    @java.lang.Deprecated
    public void removePagFlushListener(com.tencent.mm.rfx.h hVar) {
        synchronized (this) {
            this.mPagFlushListeners.remove(hVar);
        }
    }

    public int repeatCount() {
        return getPagAnimator().repeatCount();
    }

    public int scaleMode() {
        return getPagPlayer().scaleMode();
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
    }

    public void setComposition(com.tencent.mm.rfx.RfxPagFile rfxPagFile) {
        this.mFilePath = null;
        getPagPlayer().setComposition(rfxPagFile);
        getPagAnimator().setProgress(getPagPlayer().getProgress());
        if (this.mIsVisible) {
            getPagAnimator().setDuration(getPagPlayer().duration());
        }
    }

    public void setMatrix(android.graphics.Matrix matrix) {
        getPagPlayer().setMatrix(matrix);
    }

    public void setMaxFrameRate(float f17) {
        getPagPlayer().setMaxFrameRate(f17);
    }

    public boolean setPath(java.lang.String str) {
        com.tencent.mm.rfx.RfxPagFile Load = (str == null || !str.startsWith("assets://")) ? com.tencent.mm.rfx.RfxPagFile.Load(str) : com.tencent.mm.rfx.RfxPagFile.Load(getContext().getAssets(), str.substring(9));
        setComposition(Load);
        this.mFilePath = str;
        return Load != null;
    }

    public void setPathAsync(java.lang.String str, com.tencent.mm.rfx.a aVar) {
    }

    public void setProgress(double d17) {
        getPagPlayer().setProgress(d17);
        getPagAnimator().setProgress(getPagPlayer().getProgress());
        getPagAnimator().update();
    }

    public void setRepeatCount(int i17) {
        getPagAnimator().setRepeatCount(i17);
    }

    public void setScaleMode(int i17) {
        getPagPlayer().setScaleMode(i17);
    }

    public void setSurfaceDestroyTaskExecutor(com.tencent.mm.rfx.j jVar) {
        this.mSurfaceDestroyTaskExecutor = jVar;
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(android.view.TextureView.SurfaceTextureListener surfaceTextureListener) {
        if (surfaceTextureListener == this) {
            super.setSurfaceTextureListener(surfaceTextureListener);
        } else {
            this.mListener = surfaceTextureListener;
        }
    }

    public void setSync(boolean z17) {
        getPagAnimator().setSync(z17);
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        checkVisible();
    }

    public void stop() {
        getPagAnimator().cancel();
    }

    public RfxPagView(android.content.Context context, android.opengl.EGLContext eGLContext) {
        super(context);
        this.mPagPlayer = null;
        this.mPagSurface = null;
        this.mAnimator = null;
        this.mFilePath = "";
        this.mIsAttachedToWindow = false;
        this.mSharedContext = null;
        this.mViewListeners = new java.util.ArrayList<>();
        this.mPagFlushListeners = new java.util.ArrayList<>();
        this.mSurfaceDestroyTaskExecutor = null;
        this.mIsVisible = false;
        this.mSharedContext = eGLContext;
        setupSurfaceTexture();
    }

    public RfxPagView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPagPlayer = null;
        this.mPagSurface = null;
        this.mAnimator = null;
        this.mFilePath = "";
        this.mIsAttachedToWindow = false;
        this.mSharedContext = null;
        this.mViewListeners = new java.util.ArrayList<>();
        this.mPagFlushListeners = new java.util.ArrayList<>();
        this.mSurfaceDestroyTaskExecutor = null;
        this.mIsVisible = false;
        setupSurfaceTexture();
    }

    public RfxPagView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.mPagPlayer = null;
        this.mPagSurface = null;
        this.mAnimator = null;
        this.mFilePath = "";
        this.mIsAttachedToWindow = false;
        this.mSharedContext = null;
        this.mViewListeners = new java.util.ArrayList<>();
        this.mPagFlushListeners = new java.util.ArrayList<>();
        this.mSurfaceDestroyTaskExecutor = null;
        this.mIsVisible = false;
        setupSurfaceTexture();
    }
}
