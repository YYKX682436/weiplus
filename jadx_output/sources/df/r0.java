package df;

/* loaded from: classes15.dex */
public final class r0 extends df.c {

    /* renamed from: a, reason: collision with root package name */
    public final df.z f229542a;

    /* renamed from: b, reason: collision with root package name */
    public final int f229543b;

    public r0(df.z flutterView, int i17) {
        kotlin.jvm.internal.o.g(flutterView, "flutterView");
        this.f229542a = flutterView;
        this.f229543b = i17;
        flutterView.getRenderMode();
        io.flutter.embedding.android.RenderMode renderMode = io.flutter.embedding.android.RenderMode.surface;
        flutterView.setSkylineWindowId(i17);
        flutterView.setEnableSwitchSurface(false);
        df.b0 b0Var = df.b0.f229428d;
    }

    @Override // df.a0
    public void a(boolean z17) {
    }

    @Override // df.a0
    public void b(boolean z17) {
        this.f229542a.setVisibility(z17 ? 0 : 4);
    }

    @Override // df.a0
    public void d(io.flutter.embedding.android.RenderMode renderMode, java.lang.Runnable finish) {
        kotlin.jvm.internal.o.g(renderMode, "renderMode");
        kotlin.jvm.internal.o.g(finish, "finish");
        if (renderMode == io.flutter.embedding.android.RenderMode.texture) {
            finish.run();
            return;
        }
        com.tencent.skyline.SkylineLog.e("SkylineFlutterViewWrapperTextureViewImpl", "addOnSwitchRenderListener " + renderMode + " not support");
    }

    @Override // df.a0
    public void e() {
        this.f229542a.d();
    }

    @Override // df.a0
    public void f(df.d dVar) {
        df.z flutterView = this.f229542a;
        kotlin.jvm.internal.o.g(flutterView, "flutterView");
        flutterView.setWxKeyboardAction(new df.a(dVar));
        flutterView.setOnCreateInputConnectionListener(new df.b(dVar));
    }

    @Override // df.a0
    public void g() {
        df.z zVar = this.f229542a;
        try {
            com.tencent.skyline.SkylineLogic.detachFlutterView(zVar);
        } catch (java.lang.NullPointerException e17) {
            com.tencent.mm.plugin.appbrand.utils.s3.a("SkylineFlutterViewWrapperTextureViewImpl", "detachFlutterView NPE, flutterView in partial-attach state", e17);
        }
        df.g.f229458a.c(zVar);
    }

    @Override // df.a0
    public void h(boolean z17) {
    }

    @Override // df.a0
    public void i(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f229542a.c(context);
    }

    @Override // df.a0
    public void j(android.view.ViewGroup contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        df.z zVar = this.f229542a;
        zVar.d();
        android.graphics.SurfaceTexture oldRenderSurface = zVar.getOldRenderSurface();
        if (zVar.getParent() instanceof android.view.ViewGroup) {
            android.view.ViewParent parent = zVar.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(zVar);
        }
        if (oldRenderSurface == null || zVar.isInSwapSurface()) {
            com.tencent.mm.plugin.appbrand.utils.s3.a("SkylineFlutterViewWrapperTextureViewImpl", "switchContentView can't use oldRenderSurface ,oldRenderSurface: " + oldRenderSurface + " ,isInSwapSurface is " + zVar.isInSwapSurface() + " may cause flash", new java.lang.Object[0]);
        } else {
            try {
                io.flutter.embedding.engine.renderer.RenderSurface renderSurface = zVar.getRenderSurface();
                io.flutter.embedding.android.FlutterTextureView flutterTextureView = renderSurface instanceof io.flutter.embedding.android.FlutterTextureView ? (io.flutter.embedding.android.FlutterTextureView) renderSurface : null;
                if (flutterTextureView != null) {
                    flutterTextureView.setSurfaceTexture(oldRenderSurface);
                }
                com.tencent.skyline.SkylineLog.i("SkylineFlutterViewWrapperTextureViewImpl", "switchContentView setSurfaceTexture use oldRenderSurface");
            } catch (java.lang.Exception e17) {
                com.tencent.mm.plugin.appbrand.utils.s3.a("SkylineFlutterViewWrapperTextureViewImpl", "setSurfaceTexture error " + e17, new java.lang.Object[0]);
            }
        }
        m();
        contentView.addView(zVar);
    }

    @Override // df.a0
    public void l() {
        io.flutter.embedding.engine.FlutterEngine flutterEngine;
        io.flutter.embedding.engine.systemchannels.AccessibilityChannel accessibilityChannel;
        df.z zVar = this.f229542a;
        io.flutter.embedding.engine.FlutterEngine attachedFlutterEngine = zVar.getAttachedFlutterEngine();
        int i17 = this.f229543b;
        if (attachedFlutterEngine == null || !kotlin.jvm.internal.o.b(attachedFlutterEngine, com.tencent.skyline.SkylineLogic.getFlutterEngine(i17))) {
            try {
                com.tencent.skyline.SkylineLogic.attachFlutterEngine(i17, zVar);
            } catch (java.lang.IllegalStateException e17) {
                com.tencent.mm.plugin.appbrand.utils.s3.a("SkylineFlutterViewWrapperTextureViewImpl", "attachFlutterEngine failed, retry after surface ready", e17);
                zVar.post(new df.q0(this));
            }
            if (df.h.f229478i.get() || (flutterEngine = com.tencent.skyline.SkylineLogic.getFlutterEngine(i17)) == null || (accessibilityChannel = flutterEngine.getAccessibilityChannel()) == null) {
                return;
            }
            accessibilityChannel.onAndroidAccessibilityDisabled();
        }
    }

    @Override // df.a0
    public void m() {
        df.z zVar = this.f229542a;
        if (zVar.f229617f.isAvailableForRendering()) {
            io.flutter.embedding.engine.renderer.FlutterRenderer attachedRenderer = zVar.getAttachedRenderer();
            if ((attachedRenderer == null || attachedRenderer.isDisplayingFlutterUi()) ? false : true) {
                com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineFlutterViewWrapperTextureViewImpl", "reconnectSurfaceToRenderIfNotDisplaying", new java.lang.Object[0]);
                io.flutter.embedding.engine.renderer.FlutterRenderer attachedRenderer2 = zVar.getAttachedRenderer();
                if (attachedRenderer2 != null) {
                    attachedRenderer2.startRenderingToSurface(zVar.getRenderSurface().getRenderSurface(), false);
                }
            }
        }
    }

    @Override // df.a0
    public void setBackgroundColor(int i17) {
        this.f229542a.setBackgroundColor(i17);
    }
}
