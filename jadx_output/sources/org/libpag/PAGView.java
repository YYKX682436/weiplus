package org.libpag;

/* loaded from: classes13.dex */
public class PAGView extends android.view.TextureView implements android.view.TextureView.SurfaceTextureListener, b56.d, org.libpag.PAGAnimator.Listener {

    /* renamed from: a, reason: collision with root package name */
    private android.view.TextureView.SurfaceTextureListener f347806a;

    /* renamed from: b, reason: collision with root package name */
    private org.libpag.PAGPlayer f347807b;

    /* renamed from: c, reason: collision with root package name */
    private org.libpag.PAGSurface f347808c;

    /* renamed from: d, reason: collision with root package name */
    private org.libpag.PAGAnimator f347809d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f347810e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f347811f;

    /* renamed from: g, reason: collision with root package name */
    private android.opengl.EGLContext f347812g;

    /* renamed from: h, reason: collision with root package name */
    private java.util.ArrayList f347813h;

    /* renamed from: i, reason: collision with root package name */
    private java.util.ArrayList f347814i;

    /* renamed from: j, reason: collision with root package name */
    private org.libpag.PAGView.PAGViewFrameUpdateListener f347815j;

    /* renamed from: k, reason: collision with root package name */
    private org.libpag.PAGView.SurfaceDestroyTaskExecutor f347816k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f347817l;

    @java.lang.Deprecated
    /* loaded from: classes13.dex */
    public interface PAGFlushListener {
        void onFlush();
    }

    /* loaded from: classes13.dex */
    public interface PAGViewFrameUpdateListener {
        void onAnimationUpdateWithFrameInfo(boolean z17, double d17);
    }

    /* loaded from: classes13.dex */
    public interface PAGViewListener {
        void onAnimationCancel(org.libpag.PAGView pAGView);

        void onAnimationEnd(org.libpag.PAGView pAGView);

        void onAnimationRepeat(org.libpag.PAGView pAGView);

        void onAnimationStart(org.libpag.PAGView pAGView);

        void onAnimationUpdate(org.libpag.PAGView pAGView);
    }

    /* loaded from: classes13.dex */
    public interface SurfaceDestroyTaskExecutor {
        void execute(java.lang.Runnable runnable);
    }

    /* loaded from: classes13.dex */
    public class a implements java.lang.Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean isOpaque = org.libpag.PAGView.this.isOpaque();
            org.libpag.PAGView.this.setOpaque(!isOpaque);
            org.libpag.PAGView.this.setOpaque(isOpaque);
        }
    }

    /* loaded from: classes13.dex */
    public class b implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.graphics.SurfaceTexture f347824a;

        public b(android.graphics.SurfaceTexture surfaceTexture) {
            this.f347824a = surfaceTexture;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f347824a.release();
        }
    }

    /* loaded from: classes13.dex */
    public class c implements java.lang.Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            java.util.ArrayList arrayList;
            synchronized (org.libpag.PAGView.this) {
                arrayList = new java.util.ArrayList(org.libpag.PAGView.this.f347814i);
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((org.libpag.PAGView.PAGFlushListener) it.next()).onFlush();
            }
        }
    }

    public PAGView(android.content.Context context) {
        super(context);
        this.f347810e = "";
        this.f347811f = false;
        this.f347812g = null;
        this.f347813h = new java.util.ArrayList();
        this.f347814i = new java.util.ArrayList();
        this.f347815j = null;
        this.f347816k = null;
        this.f347817l = false;
        b();
    }

    private void c() {
        post(new org.libpag.PAGView.a());
    }

    public void addListener(org.libpag.PAGView.PAGViewListener pAGViewListener) {
        synchronized (this) {
            this.f347813h.add(pAGViewListener);
        }
    }

    @java.lang.Deprecated
    public void addPAGFlushListener(org.libpag.PAGView.PAGFlushListener pAGFlushListener) {
        synchronized (this) {
            this.f347814i.add(pAGFlushListener);
        }
    }

    public boolean cacheEnabled() {
        return this.f347807b.cacheEnabled();
    }

    public float cacheScale() {
        return this.f347807b.cacheScale();
    }

    public long currentFrame() {
        return this.f347807b.currentFrame();
    }

    public long duration() {
        return this.f347807b.duration();
    }

    public boolean flush() {
        return this.f347807b.flush();
    }

    public void freeCache() {
        org.libpag.PAGSurface pAGSurface = this.f347808c;
        if (pAGSurface != null) {
            pAGSurface.freeCache();
        }
    }

    public android.graphics.RectF getBounds(org.libpag.PAGLayer pAGLayer) {
        return pAGLayer != null ? this.f347807b.getBounds(pAGLayer) : new android.graphics.RectF();
    }

    public org.libpag.PAGComposition getComposition() {
        return this.f347807b.getComposition();
    }

    public org.libpag.PAGLayer[] getLayersUnderPoint(float f17, float f18) {
        return this.f347807b.getLayersUnderPoint(f17, f18);
    }

    public java.lang.String getPath() {
        return this.f347810e;
    }

    public double getProgress() {
        return this.f347807b.getProgress();
    }

    public boolean isPlaying() {
        return this.f347809d.isRunning();
    }

    public boolean isSync() {
        return this.f347809d.isSync();
    }

    public android.graphics.Bitmap makeSnapshot() {
        org.libpag.PAGSurface pAGSurface = this.f347808c;
        if (pAGSurface != null) {
            return pAGSurface.makeSnapshot();
        }
        return null;
    }

    public android.graphics.Matrix matrix() {
        return this.f347807b.matrix();
    }

    public float maxFrameRate() {
        return this.f347807b.maxFrameRate();
    }

    @Override // org.libpag.PAGAnimator.Listener
    public void onAnimationCancel(org.libpag.PAGAnimator pAGAnimator) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.f347813h);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((org.libpag.PAGView.PAGViewListener) it.next()).onAnimationCancel(this);
        }
    }

    @Override // org.libpag.PAGAnimator.Listener
    public void onAnimationEnd(org.libpag.PAGAnimator pAGAnimator) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.f347813h);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((org.libpag.PAGView.PAGViewListener) it.next()).onAnimationEnd(this);
        }
    }

    @Override // org.libpag.PAGAnimator.Listener
    public void onAnimationRepeat(org.libpag.PAGAnimator pAGAnimator) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.f347813h);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((org.libpag.PAGView.PAGViewListener) it.next()).onAnimationRepeat(this);
        }
    }

    @Override // org.libpag.PAGAnimator.Listener
    public void onAnimationStart(org.libpag.PAGAnimator pAGAnimator) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.f347813h);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((org.libpag.PAGView.PAGViewListener) it.next()).onAnimationStart(this);
        }
    }

    @Override // org.libpag.PAGAnimator.Listener
    public void onAnimationUpdate(org.libpag.PAGAnimator pAGAnimator) {
        java.util.ArrayList arrayList;
        this.f347807b.setProgress(pAGAnimator.progress());
        synchronized (this) {
            if (this.f347811f) {
                if (this.f347817l) {
                    pAGAnimator.setDuration(this.f347807b.duration());
                }
                double nanoTime = java.lang.System.nanoTime();
                boolean flush = flush();
                double nanoTime2 = (java.lang.System.nanoTime() - nanoTime) / 1000000.0d;
                if (flush) {
                    c();
                }
                org.libpag.PAGView.PAGViewFrameUpdateListener pAGViewFrameUpdateListener = this.f347815j;
                if (pAGViewFrameUpdateListener != null) {
                    pAGViewFrameUpdateListener.onAnimationUpdateWithFrameInfo(flush, nanoTime2);
                }
                synchronized (this) {
                    arrayList = new java.util.ArrayList(this.f347813h);
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((org.libpag.PAGView.PAGViewListener) it.next()).onAnimationUpdate(this);
                }
                if (this.f347814i.isEmpty()) {
                    return;
                }
                post(new org.libpag.PAGView.c());
            }
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        this.f347811f = true;
        super.onAttachedToWindow();
        a();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.f347811f = false;
        super.onDetachedFromWindow();
        org.libpag.PAGSurface pAGSurface = this.f347808c;
        if (pAGSurface != null) {
            pAGSurface.release();
            this.f347808c = null;
        }
        a();
    }

    @Override // b56.d
    public void onResume() {
        if (this.f347817l) {
            setVisibility(4);
            setVisibility(0);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        org.libpag.PAGSurface pAGSurface = this.f347808c;
        if (pAGSurface != null) {
            pAGSurface.release();
            this.f347808c = null;
        }
        org.libpag.PAGSurface FromSurfaceTexture = org.libpag.PAGSurface.FromSurfaceTexture(surfaceTexture, this.f347812g);
        this.f347808c = FromSurfaceTexture;
        this.f347807b.setSurface(FromSurfaceTexture);
        org.libpag.PAGSurface pAGSurface2 = this.f347808c;
        if (pAGSurface2 == null) {
            return;
        }
        pAGSurface2.clearAll();
        this.f347809d.update();
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f347806a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i17, i18);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(final android.graphics.SurfaceTexture surfaceTexture) {
        org.libpag.PAGView.SurfaceDestroyTaskExecutor surfaceDestroyTaskExecutor = this.f347816k;
        if (surfaceDestroyTaskExecutor != null) {
            surfaceDestroyTaskExecutor.execute(new java.lang.Runnable() { // from class: org.libpag.PAGView$$a
                @Override // java.lang.Runnable
                public final void run() {
                    org.libpag.PAGView.this.b(surfaceTexture);
                }
            });
        } else {
            b(surfaceTexture);
        }
        post(new org.libpag.PAGView.b(surfaceTexture));
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        org.libpag.PAGSurface pAGSurface = this.f347808c;
        if (pAGSurface != null) {
            pAGSurface.updateSize();
            this.f347808c.clearAll();
            this.f347809d.update();
        }
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f347806a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i17, i18);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f347806a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z17) {
        super.onVisibilityAggregated(z17);
        a();
    }

    public void pause() {
        this.f347809d.cancel();
    }

    public void play() {
        this.f347807b.prepare();
        this.f347809d.a();
    }

    public void release() {
        org.libpag.PAGPlayer pAGPlayer = this.f347807b;
        if (pAGPlayer != null) {
            pAGPlayer.release();
        }
    }

    public void removeListener(org.libpag.PAGView.PAGViewListener pAGViewListener) {
        synchronized (this) {
            this.f347813h.remove(pAGViewListener);
        }
    }

    @java.lang.Deprecated
    public void removePAGFlushListener(org.libpag.PAGView.PAGFlushListener pAGFlushListener) {
        synchronized (this) {
            this.f347814i.remove(pAGFlushListener);
        }
    }

    public int repeatCount() {
        return this.f347809d.repeatCount();
    }

    public int scaleMode() {
        return this.f347807b.scaleMode();
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
    }

    public void setCacheEnabled(boolean z17) {
        this.f347807b.setCacheEnabled(z17);
    }

    public void setCacheScale(float f17) {
        this.f347807b.setCacheScale(f17);
    }

    public void setComposition(org.libpag.PAGComposition pAGComposition) {
        this.f347810e = null;
        this.f347807b.setComposition(pAGComposition);
        this.f347809d.setProgress(this.f347807b.getProgress());
        if (this.f347817l) {
            this.f347809d.setDuration(this.f347807b.duration());
        }
    }

    public void setFrameUpdateListener(org.libpag.PAGView.PAGViewFrameUpdateListener pAGViewFrameUpdateListener) {
        this.f347815j = pAGViewFrameUpdateListener;
    }

    public void setMatrix(android.graphics.Matrix matrix) {
        this.f347807b.setMatrix(matrix);
    }

    public void setMaxFrameRate(float f17) {
        this.f347807b.setMaxFrameRate(f17);
    }

    public boolean setPath(java.lang.String str) {
        org.libpag.PAGFile Load = (str == null || !str.startsWith("assets://")) ? org.libpag.PAGFile.Load(str) : org.libpag.PAGFile.Load(getContext().getAssets(), str.substring(9));
        setComposition(Load);
        this.f347810e = str;
        return Load != null;
    }

    public void setPathAsync(final java.lang.String str, final org.libpag.PAGFile.LoadListener loadListener) {
        org.libpag.NativeTask.Run(new java.lang.Runnable() { // from class: org.libpag.PAGView$$b
            @Override // java.lang.Runnable
            public final void run() {
                org.libpag.PAGView.this.a(str, loadListener);
            }
        });
    }

    public void setProgress(double d17) {
        this.f347807b.setProgress(d17);
        this.f347809d.setProgress(this.f347807b.getProgress());
        this.f347809d.update();
    }

    public void setRepeatCount(int i17) {
        this.f347809d.setRepeatCount(i17);
    }

    public void setScaleMode(int i17) {
        this.f347807b.setScaleMode(i17);
    }

    public void setSurfaceDestroyTaskExecutor(org.libpag.PAGView.SurfaceDestroyTaskExecutor surfaceDestroyTaskExecutor) {
        this.f347816k = surfaceDestroyTaskExecutor;
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(android.view.TextureView.SurfaceTextureListener surfaceTextureListener) {
        if (surfaceTextureListener == this) {
            super.setSurfaceTextureListener(surfaceTextureListener);
        } else {
            this.f347806a = surfaceTextureListener;
        }
    }

    public void setSync(boolean z17) {
        this.f347809d.setSync(z17);
    }

    public void setUseDiskCache(boolean z17) {
        this.f347807b.setUseDiskCache(z17);
    }

    public void setVideoEnabled(boolean z17) {
        this.f347807b.setVideoEnabled(z17);
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        a();
    }

    public void stop() {
        this.f347809d.cancel();
    }

    public boolean useDiskCache() {
        return this.f347807b.useDiskCache();
    }

    public boolean videoEnabled() {
        return this.f347807b.videoEnabled();
    }

    private void b() {
        b56.b bVar = b56.b.f18114f;
        bVar.getClass();
        if (getContext() instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) getContext();
            if (!activity.isDestroyed()) {
                android.app.FragmentManager fragmentManager = activity.getFragmentManager();
                b56.c cVar = (b56.c) ((java.util.HashMap) bVar.f18116e).get(fragmentManager);
                if (cVar == null && (cVar = (b56.c) fragmentManager.findFragmentByTag("io.pag.manager")) == null) {
                    cVar = new b56.c();
                    ((java.util.HashMap) bVar.f18116e).put(fragmentManager, cVar);
                    fragmentManager.beginTransaction().add(cVar, "io.pag.manager").commitAllowingStateLoss();
                    bVar.f18115d.obtainMessage(1, fragmentManager).sendToTarget();
                }
                synchronized (cVar.f18118e) {
                    cVar.f18117d.add(this);
                }
            }
        }
        setOpaque(false);
        this.f347807b = new org.libpag.PAGPlayer();
        setSurfaceTextureListener(this);
        this.f347809d = org.libpag.PAGAnimator.a(getContext(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.lang.String str, org.libpag.PAGFile.LoadListener loadListener) {
        setPath(str);
        if (loadListener != null) {
            loadListener.onLoad((org.libpag.PAGFile) this.f347807b.getComposition());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(android.graphics.SurfaceTexture surfaceTexture) {
        this.f347807b.setSurface(null);
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f347806a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        }
        org.libpag.PAGSurface pAGSurface = this.f347808c;
        if (pAGSurface != null) {
            pAGSurface.freeCache();
        }
    }

    private void a() {
        boolean z17 = this.f347811f && isShown();
        if (this.f347817l == z17) {
            return;
        }
        this.f347817l = z17;
        if (z17) {
            this.f347809d.setDuration(this.f347807b.duration());
            this.f347809d.update();
        } else {
            this.f347809d.setDuration(0L);
        }
    }

    public PAGView(android.content.Context context, android.opengl.EGLContext eGLContext) {
        super(context);
        this.f347810e = "";
        this.f347811f = false;
        this.f347812g = null;
        this.f347813h = new java.util.ArrayList();
        this.f347814i = new java.util.ArrayList();
        this.f347815j = null;
        this.f347816k = null;
        this.f347817l = false;
        this.f347812g = eGLContext;
        b();
    }

    public PAGView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f347810e = "";
        this.f347811f = false;
        this.f347812g = null;
        this.f347813h = new java.util.ArrayList();
        this.f347814i = new java.util.ArrayList();
        this.f347815j = null;
        this.f347816k = null;
        this.f347817l = false;
        b();
    }

    public PAGView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f347810e = "";
        this.f347811f = false;
        this.f347812g = null;
        this.f347813h = new java.util.ArrayList();
        this.f347814i = new java.util.ArrayList();
        this.f347815j = null;
        this.f347816k = null;
        this.f347817l = false;
        b();
    }
}
