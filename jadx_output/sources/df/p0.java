package df;

/* loaded from: classes15.dex */
public final class p0 extends df.c {

    /* renamed from: a, reason: collision with root package name */
    public final df.z f229532a;

    /* renamed from: b, reason: collision with root package name */
    public final int f229533b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f229534c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f229535d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f229536e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f229537f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.r2 f229538g;

    public p0(df.z flutterView, int i17) {
        kotlin.jvm.internal.o.g(flutterView, "flutterView");
        this.f229532a = flutterView;
        this.f229533b = i17;
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f229534c = hashMap;
        flutterView.setEnableSwitchSurface(true);
        flutterView.setSkylineWindowId(i17);
        hashMap.put(io.flutter.embedding.android.RenderMode.surface, new java.util.ArrayList());
        hashMap.put(io.flutter.embedding.android.RenderMode.texture, new java.util.ArrayList());
        df.b0 b0Var = df.b0.f229428d;
        this.f229536e = kotlinx.coroutines.z0.b();
    }

    public static final java.lang.Object n(df.p0 p0Var, io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer, kotlin.coroutines.Continuation continuation) {
        p0Var.getClass();
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        flutterRenderer.onNextFrameDisplayed(new df.n0(rVar));
        flutterRenderer.requestDrawLastFrame();
        java.lang.Object j17 = rVar.j();
        return j17 == pz5.a.f359186d ? j17 : jz5.f0.f302826a;
    }

    @Override // df.a0
    public void a(boolean z17) {
        p(io.flutter.embedding.android.RenderMode.surface, z17);
    }

    @Override // df.a0
    public void b(boolean z17) {
        io.flutter.embedding.engine.renderer.FlutterRenderer attachedRenderer;
        int i17 = z17 ? 0 : 4;
        df.z zVar = this.f229532a;
        zVar.setVisibility(i17);
        if (!z17 || (attachedRenderer = zVar.getAttachedRenderer()) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("SkylineFlutterViewWrapperSwapRenderSurfaceImpl", "setRenderSurfaceVisible " + this.f229533b + ", visible:" + z17 + ", displaying:" + attachedRenderer.isDisplayingFlutterUi());
        if (attachedRenderer.isDisplayingFlutterUi()) {
            return;
        }
        attachedRenderer.requestDrawLastFrame();
    }

    @Override // df.a0
    public void d(io.flutter.embedding.android.RenderMode renderMode, java.lang.Runnable finish) {
        kotlin.jvm.internal.o.g(renderMode, "renderMode");
        kotlin.jvm.internal.o.g(finish, "finish");
        synchronized (this.f229534c) {
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f229534c.get(renderMode);
            if (arrayList == null) {
                return;
            }
            if (!arrayList.contains(finish)) {
                arrayList.add(finish);
            }
        }
    }

    @Override // df.a0
    public void e() {
        this.f229532a.d();
    }

    @Override // df.a0
    public void f(df.d dVar) {
        df.z flutterView = this.f229532a;
        kotlin.jvm.internal.o.g(flutterView, "flutterView");
        flutterView.setWxKeyboardAction(new df.a(dVar));
        flutterView.setOnCreateInputConnectionListener(new df.b(dVar));
    }

    @Override // df.a0
    public void g() {
        df.z zVar = this.f229532a;
        try {
            com.tencent.skyline.SkylineLogic.detachFlutterView(zVar);
        } catch (java.lang.NullPointerException e17) {
            com.tencent.mm.plugin.appbrand.utils.s3.a("SkylineFlutterViewWrapperSwapRenderSurfaceImpl", "detachFlutterView NPE, flutterView in partial-attach state", e17);
        }
        df.g.f229458a.c(zVar);
    }

    @Override // df.a0
    public void h(boolean z17) {
        p(io.flutter.embedding.android.RenderMode.texture, z17);
    }

    @Override // df.a0
    public void i(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f229532a.c(context);
    }

    @Override // df.a0
    public void j(android.view.ViewGroup contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        df.z zVar = this.f229532a;
        zVar.d();
        android.graphics.SurfaceTexture oldRenderSurface = zVar.getOldRenderSurface();
        if (zVar.getParent() instanceof android.view.ViewGroup) {
            android.view.ViewParent parent = zVar.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(zVar);
        }
        if (oldRenderSurface == null || zVar.isInSwapSurface()) {
            com.tencent.mm.plugin.appbrand.utils.s3.a("SkylineFlutterViewWrapperSwapRenderSurfaceImpl", "switchContentView can't use oldRenderSurface ,oldRenderSurface: " + oldRenderSurface + " ,isInSwapSurface is " + zVar.isInSwapSurface() + " may cause flash", new java.lang.Object[0]);
        } else {
            try {
                io.flutter.embedding.engine.renderer.RenderSurface renderSurface = zVar.getRenderSurface();
                io.flutter.embedding.android.FlutterTextureView flutterTextureView = renderSurface instanceof io.flutter.embedding.android.FlutterTextureView ? (io.flutter.embedding.android.FlutterTextureView) renderSurface : null;
                if (flutterTextureView != null) {
                    flutterTextureView.setSurfaceTexture(oldRenderSurface);
                }
                com.tencent.skyline.SkylineLog.i("SkylineFlutterViewWrapperSwapRenderSurfaceImpl", "switchContentView setSurfaceTexture use oldRenderSurface");
            } catch (java.lang.Exception e17) {
                com.tencent.mm.plugin.appbrand.utils.s3.a("SkylineFlutterViewWrapperSwapRenderSurfaceImpl", "setSurfaceTexture error " + e17, new java.lang.Object[0]);
            }
        }
        m();
        contentView.addView(zVar);
    }

    @Override // df.a0
    public void k(io.flutter.embedding.android.RenderMode renderMode, java.lang.Runnable finish) {
        kotlin.jvm.internal.o.g(renderMode, "renderMode");
        kotlin.jvm.internal.o.g(finish, "finish");
        synchronized (this.f229534c) {
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f229534c.get(renderMode);
            if (arrayList == null) {
                return;
            }
            arrayList.remove(finish);
        }
    }

    @Override // df.a0
    public void l() {
        io.flutter.embedding.engine.FlutterEngine flutterEngine;
        io.flutter.embedding.engine.systemchannels.AccessibilityChannel accessibilityChannel;
        int i17 = this.f229533b;
        df.z zVar = this.f229532a;
        com.tencent.skyline.SkylineLogic.attachFlutterEngine(i17, zVar);
        if (!df.h.f229478i.get() && (flutterEngine = com.tencent.skyline.SkylineLogic.getFlutterEngine(i17)) != null && (accessibilityChannel = flutterEngine.getAccessibilityChannel()) != null) {
            accessibilityChannel.onAndroidAccessibilityDisabled();
        }
        io.flutter.embedding.engine.renderer.FlutterRenderer attachedRenderer = zVar.getAttachedRenderer();
        if (attachedRenderer == null) {
            return;
        }
        attachedRenderer.setCheckSurfaceOnStopOrPause(true);
    }

    @Override // df.a0
    public void m() {
        df.z zVar = this.f229532a;
        if (zVar.f229617f.isAvailableForRendering()) {
            io.flutter.embedding.engine.renderer.FlutterRenderer attachedRenderer = zVar.getAttachedRenderer();
            if ((attachedRenderer == null || attachedRenderer.isDisplayingFlutterUi()) ? false : true) {
                com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineFlutterViewWrapperSwapRenderSurfaceImpl", "reconnectSurfaceToRenderIfNotDisplaying", new java.lang.Object[0]);
                io.flutter.embedding.engine.renderer.FlutterRenderer attachedRenderer2 = zVar.getAttachedRenderer();
                if (attachedRenderer2 != null) {
                    attachedRenderer2.startRenderingToSurface(zVar.getRenderSurface().getRenderSurface(), false);
                }
            }
        }
    }

    public final void o(io.flutter.embedding.android.RenderMode renderMode) {
        synchronized (this.f229534c) {
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f229534c.get(renderMode);
            if (arrayList == null) {
                return;
            }
            java.util.Iterator it = new java.util.ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(io.flutter.embedding.android.RenderMode r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df.p0.p(io.flutter.embedding.android.RenderMode, boolean):void");
    }

    @Override // df.a0
    public void setBackgroundColor(int i17) {
        this.f229532a.setBackgroundColor(i17);
    }
}
