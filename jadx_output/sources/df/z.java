package df;

/* loaded from: classes15.dex */
public final class z extends io.flutter.embedding.android.FlutterView {

    /* renamed from: d, reason: collision with root package name */
    public final io.flutter.embedding.android.RenderMode f229615d;

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.RenderSurface f229616e;

    /* renamed from: f, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.RenderSurface f229617f;

    /* renamed from: g, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.SwapRenderSurface f229618g;

    /* renamed from: h, reason: collision with root package name */
    public io.flutter.embedding.android.FlutterImageView f229619h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f229620i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f229621m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f229622n;

    /* renamed from: o, reason: collision with root package name */
    public int f229623o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.SurfaceTexture f229624p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.content.Context context, io.flutter.embedding.android.FlutterSurfaceView flutterSurfaceView) {
        super(context, flutterSurfaceView);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(flutterSurfaceView, "flutterSurfaceView");
        this.f229620i = new java.util.concurrent.CopyOnWriteArraySet();
        this.f229621m = new java.util.concurrent.CopyOnWriteArraySet();
        this.f229623o = -1;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(8);
        }
        this.f229615d = io.flutter.embedding.android.RenderMode.surface;
        this.f229617f = flutterSurfaceView;
        flutterSurfaceView.getHolder().addCallback(new df.o(this, flutterSurfaceView));
    }

    public static final void a(df.z zVar, io.flutter.embedding.android.RenderMode renderMode) {
        zVar.getClass();
        if (renderMode == io.flutter.embedding.android.RenderMode.surface) {
            java.util.Iterator it = new java.util.LinkedList(zVar.f229621m).iterator();
            while (it.hasNext()) {
                ((df.q) it.next()).a();
            }
        } else if (renderMode == io.flutter.embedding.android.RenderMode.texture) {
            java.util.Iterator it6 = new java.util.LinkedList(zVar.f229620i).iterator();
            while (it6.hasNext()) {
                ((df.q) it6.next()).a();
            }
        }
    }

    public static final void b(df.z zVar, io.flutter.embedding.android.RenderMode renderMode, df.q qVar) {
        zVar.getClass();
        if (qVar == null) {
            return;
        }
        if (renderMode == io.flutter.embedding.android.RenderMode.surface) {
            zVar.f229621m.remove(qVar);
        } else if (renderMode == io.flutter.embedding.android.RenderMode.texture) {
            zVar.f229620i.remove(qVar);
        }
    }

    @Override // io.flutter.embedding.android.FlutterView
    public void attachToFlutterEngine(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        kotlin.jvm.internal.o.g(flutterEngine, "flutterEngine");
        super.attachToFlutterEngine(flutterEngine);
        onConfigurationChanged(getContext().getResources().getConfiguration());
    }

    public final void c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Context context2 = getContext();
        android.content.MutableContextWrapper mutableContextWrapper = context2 instanceof android.content.MutableContextWrapper ? (android.content.MutableContextWrapper) context2 : null;
        if (mutableContextWrapper == null) {
            return;
        }
        mutableContextWrapper.setBaseContext(context);
    }

    @Override // io.flutter.embedding.android.FlutterView
    public void convertToImageView() {
        super.convertToImageView();
        this.f229616e = this.f229617f;
        io.flutter.embedding.android.FlutterImageView flutterImageView = this.f229619h;
        kotlin.jvm.internal.o.d(flutterImageView);
        this.f229617f = flutterImageView;
    }

    @Override // io.flutter.embedding.android.FlutterView
    public io.flutter.embedding.android.FlutterImageView createImageView() {
        io.flutter.embedding.android.FlutterImageView createImageView = super.createImageView();
        kotlin.jvm.internal.o.f(createImageView, "createImageView(...)");
        this.f229619h = createImageView;
        return createImageView;
    }

    public final void d() {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.b(this)) {
            io.flutter.embedding.engine.renderer.RenderSurface renderSurface = this.f229617f;
            io.flutter.embedding.android.FlutterTextureView flutterTextureView = renderSurface instanceof io.flutter.embedding.android.FlutterTextureView ? (io.flutter.embedding.android.FlutterTextureView) renderSurface : null;
            android.view.TextureView.SurfaceTextureListener surfaceTextureListener = flutterTextureView != null ? flutterTextureView.getSurfaceTextureListener() : null;
            df.f1 f1Var = surfaceTextureListener instanceof df.f1 ? (df.f1) surfaceTextureListener : null;
            if (f1Var != null) {
                f1Var.f229457f = true;
            }
            io.flutter.embedding.engine.renderer.RenderSurface renderSurface2 = this.f229617f;
            io.flutter.embedding.android.FlutterTextureView flutterTextureView2 = renderSurface2 instanceof io.flutter.embedding.android.FlutterTextureView ? (io.flutter.embedding.android.FlutterTextureView) renderSurface2 : null;
            this.f229624p = flutterTextureView2 != null ? flutterTextureView2.getSurfaceTexture() : null;
        }
    }

    public final void e(io.flutter.embedding.android.RenderMode mode, boolean z17) {
        android.view.View view;
        kotlin.jvm.internal.o.g(mode, "mode");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchFlutterRenderSurface-");
        sb6.append(this.f229623o);
        sb6.append(" end, this.renderMode:");
        io.flutter.embedding.android.RenderMode renderMode = this.f229615d;
        sb6.append(renderMode);
        sb6.append(", to mode:");
        sb6.append(mode);
        sb6.append(", enforced:");
        sb6.append(z17);
        sb6.append(", isInSwapSurface:");
        sb6.append(isInSwapSurface());
        com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineFlutterView", sb6.toString(), new java.lang.Object[0]);
        io.flutter.embedding.android.RenderMode renderMode2 = io.flutter.embedding.android.RenderMode.surface;
        if (mode == renderMode) {
            super.switchSurface(false);
            if (z17) {
                com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineFlutterView", "switchRenderSurface toSwapSurface, do enforced job", new java.lang.Object[0]);
                io.flutter.embedding.android.FlutterViewUtils.toggleHideCurrentRenderSurface(this, false, true);
                io.flutter.embedding.engine.renderer.FlutterRenderer attachedRenderer = getAttachedRenderer();
                if (attachedRenderer != null) {
                    attachedRenderer.clearNextFrameDisplayedListener();
                }
                java.lang.Object obj = this.f229618g;
                view = obj instanceof android.view.View ? (android.view.View) obj : null;
                if (view != null) {
                    view.getLayoutParams().width = 1;
                    view.getLayoutParams().height = 1;
                    view.requestLayout();
                }
                this.f229617f.markSurfaceIsSwapOut(false);
                return;
            }
            return;
        }
        super.switchSurface(true);
        java.lang.Object obj2 = this.f229618g;
        view = obj2 instanceof android.view.View ? (android.view.View) obj2 : null;
        if (view != null) {
            view.getLayoutParams().width = -1;
            view.getLayoutParams().height = -1;
            view.requestLayout();
        }
        if (z17) {
            io.flutter.embedding.engine.renderer.FlutterRenderer attachedRenderer2 = getAttachedRenderer();
            if (attachedRenderer2 != null) {
                attachedRenderer2.clearNextFrameDisplayedListener();
            }
            io.flutter.embedding.android.FlutterViewUtils.toggleHideCurrentRenderSurface(this, true, true);
            java.lang.Object obj3 = this.f229618g;
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type android.view.View");
            ((android.view.View) obj3).bringToFront();
            this.f229617f.markSurfaceIsSwapOut(true);
        }
    }

    public final java.lang.Object f(io.flutter.embedding.android.RenderMode renderMode, kotlin.coroutines.Continuation continuation) {
        android.view.Surface surface;
        io.flutter.embedding.engine.renderer.RenderSurface renderSurface = this.f229617f;
        io.flutter.embedding.engine.renderer.SwapRenderSurface swapRenderSurface = this.f229618g;
        io.flutter.embedding.android.RenderMode renderMode2 = io.flutter.embedding.android.RenderMode.texture;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (renderMode == renderMode2 && (renderSurface instanceof io.flutter.embedding.android.FlutterTextureView)) {
            if (renderSurface.isAvailableForRendering()) {
                return f0Var;
            }
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
            rVar.k();
            ((io.flutter.embedding.android.FlutterTextureView) renderSurface).setVisibility(0);
            post(new df.w(rVar, renderSurface, this, renderMode));
            java.lang.Object j17 = rVar.j();
            return j17 == pz5.a.f359186d ? j17 : f0Var;
        }
        io.flutter.embedding.android.RenderMode renderMode3 = io.flutter.embedding.android.RenderMode.surface;
        if (renderMode != renderMode3 || !(swapRenderSurface instanceof io.flutter.embedding.android.SwapSurfaceViewRenderSurface) || ((surface = ((io.flutter.embedding.android.SwapSurfaceViewRenderSurface) swapRenderSurface).getHolder().getSurface()) != null && surface.isValid())) {
            return f0Var;
        }
        kotlinx.coroutines.r rVar2 = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar2.k();
        df.y yVar = new df.y(rVar2, this, renderMode);
        if (renderMode == renderMode3) {
            this.f229621m.add(yVar);
        } else if (renderMode == renderMode2) {
            this.f229620i.add(yVar);
        }
        java.lang.Object j18 = rVar2.j();
        return j18 == pz5.a.f359186d ? j18 : f0Var;
    }

    public final android.graphics.SurfaceTexture getOldRenderSurface() {
        io.flutter.embedding.engine.renderer.RenderSurface renderSurface = this.f229617f;
        io.flutter.embedding.android.FlutterTextureView flutterTextureView = renderSurface instanceof io.flutter.embedding.android.FlutterTextureView ? (io.flutter.embedding.android.FlutterTextureView) renderSurface : null;
        if ((flutterTextureView != null ? flutterTextureView.getSurfaceTexture() : null) == null) {
            return this.f229624p;
        }
        io.flutter.embedding.engine.renderer.RenderSurface renderSurface2 = this.f229617f;
        io.flutter.embedding.android.FlutterTextureView flutterTextureView2 = renderSurface2 instanceof io.flutter.embedding.android.FlutterTextureView ? (io.flutter.embedding.android.FlutterTextureView) renderSurface2 : null;
        if (flutterTextureView2 != null) {
            return flutterTextureView2.getSurfaceTexture();
        }
        return null;
    }

    public final io.flutter.embedding.android.RenderMode getRenderMode() {
        return this.f229615d;
    }

    public final io.flutter.embedding.engine.renderer.RenderSurface getRenderSurface() {
        return this.f229617f;
    }

    @Override // android.view.View
    public android.content.res.Resources getResources() {
        android.content.res.Resources resources = getContext().getResources();
        kotlin.jvm.internal.o.f(resources, "getResources(...)");
        return resources;
    }

    public final int getSkylineWindowId() {
        return this.f229623o;
    }

    @Override // io.flutter.embedding.android.FlutterView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo outAttrs) {
        kotlin.jvm.internal.o.g(outAttrs, "outAttrs");
        android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        yz5.l lVar = this.f229622n;
        if (lVar != null) {
            lVar.invoke(onCreateInputConnection);
        }
        return onCreateInputConnection;
    }

    @Override // io.flutter.embedding.android.FlutterView, android.view.View
    public void onProvideAutofillVirtualStructure(android.view.ViewStructure structure, int i17) {
        kotlin.jvm.internal.o.g(structure, "structure");
        try {
            super.onProvideAutofillVirtualStructure(structure, i17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("SkylineFlutterView", "onProvideAutofillVirtualStructure fail: e:" + e17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        if (view instanceof io.flutter.embedding.engine.renderer.SwapRenderSurface) {
            io.flutter.embedding.engine.renderer.SwapRenderSurface swapRenderSurface = (io.flutter.embedding.engine.renderer.SwapRenderSurface) view;
            this.f229618g = swapRenderSurface;
            kotlin.jvm.internal.o.d(swapRenderSurface);
            if (swapRenderSurface instanceof io.flutter.embedding.android.SwapTextureViewRenderSurface) {
                com.tencent.mm.sdk.platformtools.u3.h(new df.s(swapRenderSurface, this));
            } else if (swapRenderSurface instanceof io.flutter.embedding.android.SwapSurfaceViewRenderSurface) {
                ((io.flutter.embedding.android.SwapSurfaceViewRenderSurface) swapRenderSurface).getHolder().addCallback(new df.t(swapRenderSurface, this));
            }
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        if ((view instanceof io.flutter.embedding.engine.renderer.SwapRenderSurface) && kotlin.jvm.internal.o.b(this.f229618g, view)) {
            this.f229618g = null;
        }
    }

    @Override // io.flutter.embedding.android.FlutterView
    public void revertImageView(java.lang.Runnable onDone) {
        kotlin.jvm.internal.o.g(onDone, "onDone");
        super.revertImageView(onDone);
        io.flutter.embedding.engine.renderer.RenderSurface renderSurface = this.f229616e;
        kotlin.jvm.internal.o.d(renderSurface);
        this.f229617f = renderSurface;
        this.f229616e = null;
    }

    public final void setOnCreateInputConnectionListener(yz5.l lVar) {
        this.f229622n = lVar;
    }

    public final void setRenderSurface(io.flutter.embedding.engine.renderer.RenderSurface renderSurface) {
        kotlin.jvm.internal.o.g(renderSurface, "<set-?>");
        this.f229617f = renderSurface;
    }

    public final void setSkylineWindowId(int i17) {
        this.f229623o = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.content.Context context, io.flutter.embedding.android.FlutterTextureView flutterTextureView) {
        super(context, flutterTextureView);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(flutterTextureView, "flutterTextureView");
        this.f229620i = new java.util.concurrent.CopyOnWriteArraySet();
        this.f229621m = new java.util.concurrent.CopyOnWriteArraySet();
        this.f229623o = -1;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(8);
        }
        this.f229615d = io.flutter.embedding.android.RenderMode.texture;
        this.f229617f = flutterTextureView;
        flutterTextureView.setSurfaceTextureListener(new df.f1(flutterTextureView.getSurfaceTextureListener(), new df.p(this, flutterTextureView)));
    }
}
