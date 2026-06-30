package fv4;

/* loaded from: classes8.dex */
public final class f extends fv4.g {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f266989b = "";

    /* renamed from: c, reason: collision with root package name */
    public int f266990c;

    /* renamed from: d, reason: collision with root package name */
    public int f266991d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f266992e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.reflect.Field f266993f;

    /* renamed from: g, reason: collision with root package name */
    public io.flutter.view.TextureRegistry.SurfaceProducer f266994g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f266995h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f266996i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f266997j;

    /* renamed from: k, reason: collision with root package name */
    public int f266998k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f266999l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f267000m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.SurfaceTexture f267001n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.Surface f267002o;

    /* renamed from: p, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.SurfaceTextureWrapper f267003p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.reflect.Field f267004q;

    /* JADX WARN: Multi-variable type inference failed */
    public static final android.view.Surface j(fv4.f fVar, java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        boolean z17;
        android.view.Surface surface;
        fVar.getClass();
        io.flutter.plugin.platform.PlatformViewRenderTarget platformViewRenderTarget = obj instanceof io.flutter.plugin.platform.PlatformViewRenderTarget ? (io.flutter.plugin.platform.PlatformViewRenderTarget) obj : null;
        android.view.Surface surface2 = platformViewRenderTarget != null ? platformViewRenderTarget.getSurface() : null;
        if (android.os.Build.VERSION.SDK_INT != 29) {
            return surface2;
        }
        io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer = fVar.f266994g;
        if (!kotlin.jvm.internal.o.b(surfaceProducer != null ? surfaceProducer.getClass().getSimpleName() : null, "SurfaceTextureSurfaceProducer")) {
            return surface2;
        }
        if (fVar.f266996i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", "hookGetSurface, resumeFromBg is ture, replace surface");
            if (surface2 != null) {
                surface2.release();
            }
            io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer2 = fVar.f266994g;
            return surfaceProducer2 != null ? surfaceProducer2.getForcedNewSurface() : null;
        }
        if (fVar.f266995h) {
            z17 = true;
        } else {
            if (fVar.f267003p != null) {
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    if (fVar.f267004q == null) {
                        java.lang.reflect.Field declaredField = io.flutter.embedding.engine.renderer.SurfaceTextureWrapper.class.getDeclaredField("attached");
                        fVar.f267004q = declaredField;
                        if (declaredField != null) {
                            declaredField.setAccessible(true);
                        }
                    }
                    java.lang.reflect.Field field = fVar.f267004q;
                    java.lang.Object obj2 = field != null ? field.get(fVar.f267003p) : null;
                    m521constructorimpl = kotlin.Result.m521constructorimpl(obj2 instanceof java.lang.Boolean ? (java.lang.Boolean) obj2 : null);
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                    m521constructorimpl = null;
                }
                java.lang.Boolean bool = (java.lang.Boolean) m521constructorimpl;
                fVar.f266995h = bool != null ? bool.booleanValue() : false;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", "textureWrapper is null");
            }
            z17 = fVar.f266995h;
        }
        if (z17) {
            return surface2;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", "hookGetSurface, gl not attach, just use fake surface");
        if (fVar.f267002o == null) {
            try {
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(false);
                fVar.f267001n = surfaceTexture;
                surfaceTexture.setDefaultBufferSize(1, 1);
                surface = kotlin.Result.m521constructorimpl(new android.view.Surface(fVar.f267001n));
            } catch (java.lang.Throwable th7) {
                kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                surface = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(surface);
            if (m524exceptionOrNullimpl != null) {
                java.lang.String content = "createFakeSurface failed: " + m524exceptionOrNullimpl.getMessage();
                kotlin.jvm.internal.o.g(content, "content");
                com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", content);
            }
            android.view.Surface surface3 = kotlin.Result.m527isFailureimpl(surface) ? null : surface;
            fVar.f267002o = surface3;
            if (surface3 != null) {
                surface3.release();
            }
        }
        fVar.f266990c = 0;
        fVar.n();
        return fVar.f267002o;
    }

    public static final void k(fv4.f fVar, java.lang.Object obj, int i17, int i18) {
        android.view.View view;
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        fVar.f266999l = true;
        fVar.f267000m = true;
        int i19 = fVar.f266998k;
        if (i19 > 0 && i18 <= i19) {
            java.lang.String content = "hookResize, SKIP - buffer already large enough, requested: " + i17 + 'x' + i18 + ", preAllocated: " + fVar.f266998k;
            kotlin.jvm.internal.o.g(content, "content");
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", content);
            return;
        }
        fv4.i iVar = fVar.f267005a;
        int i27 = (iVar == null || (view = iVar.f267010d) == null || (resources = view.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 3000 : displayMetrics.heightPixels;
        fVar.f266998k += i27 * 3;
        java.lang.String content2 = "hookResize, PRE-ALLOCATE, requested: " + i17 + 'x' + i18 + ", allocating: " + i17 + 'x' + fVar.f266998k + ", screenHeight: " + i27;
        kotlin.jvm.internal.o.g(content2, "content");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content2);
        io.flutter.plugin.platform.PlatformViewRenderTarget platformViewRenderTarget = obj instanceof io.flutter.plugin.platform.PlatformViewRenderTarget ? (io.flutter.plugin.platform.PlatformViewRenderTarget) obj : null;
        if (platformViewRenderTarget != null) {
            platformViewRenderTarget.resize(i17, fVar.f266998k);
        }
    }

    public static final void l(fv4.f fVar, java.lang.Object obj) {
        boolean z17;
        tg0.c2 c2Var;
        tg0.s2 s2Var;
        android.view.View view;
        fVar.getClass();
        io.flutter.plugin.platform.PlatformViewRenderTarget platformViewRenderTarget = obj instanceof io.flutter.plugin.platform.PlatformViewRenderTarget ? (io.flutter.plugin.platform.PlatformViewRenderTarget) obj : null;
        if (platformViewRenderTarget != null) {
            fv4.i iVar = fVar.f267005a;
            int height = (iVar == null || (view = iVar.f267010d) == null) ? 0 : view.getHeight();
            fv4.i iVar2 = fVar.f267005a;
            if (iVar2 == null || (c2Var = iVar2.f267009c) == null || (s2Var = c2Var.f419051f) == null) {
                z17 = false;
            } else {
                com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView = ((ch0.p0) s2Var).f41251a;
                z17 = baseWebSearchWebView.K;
                baseWebSearchWebView.K = false;
            }
            if (!z17) {
                int i17 = fVar.f266990c;
                if (i17 < 60) {
                    fVar.f266990c = i17 + 1;
                    fVar.n();
                }
                platformViewRenderTarget.scheduleFrame();
                return;
            }
            fVar.f266990c = 0;
            platformViewRenderTarget.scheduleFrame();
            fVar.n();
            java.lang.String content = "hookScheduleFrame, WebView draw, WebView height: " + height;
            kotlin.jvm.internal.o.g(content, "content");
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", content);
        }
    }

    @Override // fv4.g
    public void a() {
        java.lang.Object m521constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            if (this.f266997j && this.f266992e != null && this.f266993f != null) {
                fv4.i iVar = this.f267005a;
                android.view.View view = iVar != null ? iVar.f267010d : null;
                android.view.ViewParent parent = view != null ? view.getParent() : null;
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup == null || !(viewGroup instanceof io.flutter.plugin.platform.PlatformViewWrapper)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FTSPlatformWebView", "dispose: parent is null or not PlatformViewWrapper, skip restore");
                } else {
                    java.lang.reflect.Field field = this.f266993f;
                    if (field != null) {
                        field.set(viewGroup, this.f266992e);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "dispose: restored original renderTarget");
                }
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            java.lang.String content = "dispose: failed to restore renderTarget: " + m524exceptionOrNullimpl.getMessage();
            kotlin.jvm.internal.o.g(content, "content");
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", content);
        }
        android.view.Surface surface = this.f267002o;
        if (surface != null) {
            surface.release();
        }
        android.graphics.SurfaceTexture surfaceTexture = this.f267001n;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.f267002o = null;
        this.f267001n = null;
        this.f266992e = null;
        this.f266993f = null;
        this.f267005a = null;
    }

    @Override // fv4.g
    public android.view.View b() {
        fv4.i iVar = this.f267005a;
        if (iVar != null) {
            return iVar.f267010d;
        }
        return null;
    }

    @Override // fv4.g
    public void c(io.flutter.plugin.common.MethodCall call, io.flutter.plugin.common.MethodChannel.Result result) {
        tg0.c2 c2Var;
        tg0.h2 h2Var;
        android.view.View view;
        kotlin.jvm.internal.o.g(call, "call");
        kotlin.jvm.internal.o.g(result, "result");
        if (kotlin.jvm.internal.o.b(call.method, "onSearchResult")) {
            java.lang.String str = (java.lang.String) call.argument("query");
            java.lang.String str2 = (java.lang.String) call.argument("resultJson");
            java.lang.String str3 = str == null ? "" : str;
            java.lang.String str4 = str2 == null ? "" : str2;
            java.lang.Integer num = (java.lang.Integer) call.argument("businessType");
            if (num == null) {
                num = 14;
            }
            java.lang.Integer num2 = (java.lang.Integer) call.argument("offset");
            int i17 = 0;
            if (num2 == null) {
                num2 = 0;
            }
            java.lang.String str5 = (java.lang.String) call.argument("requestId");
            java.lang.String str6 = str5 == null ? "" : str5;
            java.lang.String str7 = (java.lang.String) call.argument("parentSearchId");
            java.lang.String str8 = str7 == null ? "" : str7;
            fv4.i iVar = this.f267005a;
            if (iVar != null && (view = iVar.f267010d) != null && view.getVisibility() == 0) {
                i17 = 1;
            }
            tg0.c1 c1Var = new tg0.c1(i17 ^ 1, 0, null, str3, str4, num.intValue(), num2.intValue(), str6, str8, null, 0, null, 0, 0, 0, 0.0d, 0L, 130566, null);
            fv4.i iVar2 = this.f267005a;
            if (iVar2 == null || (c2Var = iVar2.f267009c) == null || (h2Var = c2Var.f419053h) == null) {
                return;
            }
            ((ch0.h0) h2Var).a(c2Var.f419049d.f419078d, c1Var);
        }
    }

    @Override // fv4.g
    public void d(java.lang.String str) {
        java.lang.Object m521constructorimpl;
        if (kotlin.jvm.internal.o.b(this.f266989b, str)) {
            return;
        }
        this.f266989b = str == null ? "" : str;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            org.json.JSONObject jSONObject = str != null ? new org.json.JSONObject(str) : null;
            m(jSONObject != null ? jSONObject.optDouble("height") : 0.0d);
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            java.lang.String content = "handleWebViewSizeChanged failed: " + m524exceptionOrNullimpl;
            kotlin.jvm.internal.o.g(content, "content");
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", content);
        }
    }

    @Override // fv4.g
    public void f(fv4.i ctx) {
        tg0.c2 c2Var;
        tg0.h2 h2Var;
        tg0.c2 c2Var2;
        tg0.c1 c1Var;
        android.view.ViewParent parent;
        kotlin.jvm.internal.o.g(ctx, "ctx");
        this.f267005a = ctx;
        android.view.View view = ctx.f267010d;
        java.lang.Double d17 = null;
        if ((view != null ? view.getParent() : null) != null && (parent = view.getParent()) != null) {
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            java.lang.String content = "H5Box, WebView has parent: " + viewGroup;
            kotlin.jvm.internal.o.g(content, "content");
            com.tencent.mars.xlog.Log.w("MicroMsg.FTSPlatformWebView", content);
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        fv4.i iVar = this.f267005a;
        this.f266991d = (int) ((iVar == null || (c2Var2 = iVar.f267009c) == null || (c1Var = c2Var2.f419055j) == null) ? 0.0d : c1Var.f419044p);
        java.lang.String content2 = "H5Box, init, realHeight: " + this.f266991d;
        kotlin.jvm.internal.o.g(content2, "content");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content2);
        fv4.i iVar2 = this.f267005a;
        if (iVar2 != null && (c2Var = iVar2.f267009c) != null && (h2Var = c2Var.f419053h) != null) {
            qx4.d0 d0Var = ((ch0.h0) h2Var).f41224a;
            java.lang.Double d18 = d0Var.f367403l;
            d0Var.f367403l = null;
            d17 = d18;
        }
        if (d17 != null) {
            m(d17.doubleValue());
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.FTSPlatformWebView", "H5Box no pending height");
        }
    }

    @Override // fv4.g
    public void h(android.view.View flutterView) {
        java.lang.Object m521constructorimpl;
        java.lang.Object m521constructorimpl2;
        java.lang.Object m521constructorimpl3;
        android.view.View view;
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        android.view.View view2;
        kotlin.jvm.internal.o.g(flutterView, "flutterView");
        fv4.i iVar = this.f267005a;
        android.view.ViewParent parent = (iVar == null || (view2 = iVar.f267010d) == null) ? null : view2.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (!(viewGroup instanceof io.flutter.plugin.platform.PlatformViewWrapper)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FTSPlatformWebView", "hook: parent is not PlatformViewWrapper, skip hook");
            return;
        }
        java.lang.reflect.Field field = this.f266993f;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (field == null) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                java.lang.reflect.Field declaredField = io.flutter.plugin.platform.PlatformViewWrapper.class.getDeclaredField("renderTarget");
                this.f266993f = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
                java.lang.reflect.Field field2 = this.f266993f;
                this.f266992e = field2 != null ? field2.get(viewGroup) : null;
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "hook: reflect originRenderTarget success");
                m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl != null) {
                java.lang.String content = "hook: failed to get renderTarget by reflection: " + m524exceptionOrNullimpl.getMessage();
                kotlin.jvm.internal.o.g(content, "content");
                com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", content);
            }
        }
        if (this.f266992e == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FTSPlatformWebView", "hook: originRenderTarget is null, skip further hook");
            q();
            return;
        }
        fv4.i iVar2 = this.f267005a;
        int i17 = (iVar2 == null || (view = iVar2.f267010d) == null || (resources = view.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 3000 : displayMetrics.heightPixels;
        this.f266998k = i17 * 3;
        java.lang.String content2 = "hookResize, PRE-ALLOCATE, allocating: " + this.f266998k + ", screenHeight: " + i17;
        kotlin.jvm.internal.o.g(content2, "content");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content2);
        java.lang.Object obj = this.f266992e;
        io.flutter.plugin.platform.PlatformViewRenderTarget platformViewRenderTarget = obj instanceof io.flutter.plugin.platform.PlatformViewRenderTarget ? (io.flutter.plugin.platform.PlatformViewRenderTarget) obj : null;
        if (platformViewRenderTarget != null) {
            platformViewRenderTarget.resize(platformViewRenderTarget.getWidth(), this.f266998k);
        }
        o();
        if ((this.f266992e instanceof io.flutter.plugin.platform.SurfaceProducerPlatformViewRenderTarget) && this.f266994g == null) {
            try {
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                java.lang.reflect.Field declaredField2 = io.flutter.plugin.platform.SurfaceProducerPlatformViewRenderTarget.class.getDeclaredField("producer");
                declaredField2.setAccessible(true);
                java.lang.Object obj2 = declaredField2.get(this.f266992e);
                this.f266994g = obj2 instanceof io.flutter.view.TextureRegistry.SurfaceProducer ? (io.flutter.view.TextureRegistry.SurfaceProducer) obj2 : null;
                p();
                if (android.os.Build.VERSION.SDK_INT == 29) {
                    io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer = this.f266994g;
                    if (kotlin.jvm.internal.o.b(surfaceProducer != null ? surfaceProducer.getClass().getSimpleName() : null, "SurfaceTextureSurfaceProducer")) {
                        java.lang.reflect.Field declaredField3 = java.lang.Class.forName("io.flutter.embedding.engine.renderer.SurfaceTextureSurfaceProducer").getDeclaredField("texture");
                        declaredField3.setAccessible(true);
                        io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer2 = this.f266994g;
                        if (surfaceProducer2 != null) {
                            java.lang.Object obj3 = declaredField3.get(surfaceProducer2);
                            java.lang.reflect.Field declaredField4 = java.lang.Class.forName("io.flutter.embedding.engine.renderer.FlutterRenderer$SurfaceTextureRegistryEntry").getDeclaredField("textureWrapper");
                            declaredField4.setAccessible(true);
                            java.lang.Object obj4 = declaredField4.get(obj3);
                            this.f267003p = obj4 instanceof io.flutter.embedding.engine.renderer.SurfaceTextureWrapper ? (io.flutter.embedding.engine.renderer.SurfaceTextureWrapper) obj4 : null;
                            com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "hook: reflect textureWrapper success");
                        }
                    }
                }
                m521constructorimpl3 = kotlin.Result.m521constructorimpl(f0Var);
            } catch (java.lang.Throwable th7) {
                kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                m521constructorimpl3 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
            }
            java.lang.Throwable m524exceptionOrNullimpl2 = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl3);
            if (m524exceptionOrNullimpl2 != null) {
                java.lang.String content3 = "hook: failed to get surface producer by reflection: " + m524exceptionOrNullimpl2.getMessage();
                kotlin.jvm.internal.o.g(content3, "content");
                com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", content3);
            }
        }
        if (!this.f266997j) {
            try {
                kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(java.lang.Thread.currentThread().getContextClassLoader(), new java.lang.Class[]{io.flutter.plugin.platform.PlatformViewRenderTarget.class}, new fv4.b(this));
                java.lang.reflect.Field field3 = this.f266993f;
                if (field3 != null) {
                    field3.set(viewGroup, newProxyInstance);
                }
                this.f266997j = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "hook: proxy renderTarget success");
                m521constructorimpl2 = kotlin.Result.m521constructorimpl(f0Var);
            } catch (java.lang.Throwable th8) {
                kotlin.Result.Companion companion6 = kotlin.Result.INSTANCE;
                m521constructorimpl2 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th8));
            }
            java.lang.Throwable m524exceptionOrNullimpl3 = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl2);
            if (m524exceptionOrNullimpl3 != null) {
                this.f266997j = false;
                java.lang.String content4 = "hook: failed to set proxy renderTarget: " + m524exceptionOrNullimpl3.getMessage();
                kotlin.jvm.internal.o.g(content4, "content");
                com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", content4);
            }
        }
        q();
    }

    @Override // fv4.g
    public void i() {
        this.f266996i = true;
    }

    public synchronized void m(double d17) {
        fv4.c cVar = new fv4.c(this);
        if (kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            cVar.run();
        } else {
            ((ku5.t0) ku5.t0.f312615d).D(new tg0.e2(cVar));
        }
        int i17 = (int) d17;
        java.lang.String content = "WebView size changed, new height: " + d17 + ", real: " + i17 + ", realHeight: " + this.f266991d;
        kotlin.jvm.internal.o.g(content, "content");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content);
        if (this.f266991d == i17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", "WebView size changed, but current height == real, quit");
            return;
        }
        this.f266991d = i17;
        fv4.d dVar = new fv4.d(this, kz5.b1.e(new jz5.l("newHeight", java.lang.Integer.valueOf(i17))));
        if (kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            dVar.run();
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(new tg0.d2(dVar));
        }
    }

    public void n() {
        android.view.View view;
        fv4.i iVar = this.f267005a;
        java.lang.Object parent = (iVar == null || (view = iVar.f267010d) == null) ? null : view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup instanceof io.flutter.plugin.platform.PlatformViewWrapper) {
            ((io.flutter.plugin.platform.PlatformViewWrapper) viewGroup).invalidate();
        }
    }

    public final void o() {
        fv4.i iVar = this.f267005a;
        android.view.View view = iVar != null ? iVar.f267010d : null;
        java.lang.Object parent = view != null ? view.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = this.f266998k;
            viewGroup.setLayoutParams(layoutParams);
        }
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.height = this.f266998k;
            view.setLayoutParams(layoutParams2);
        }
    }

    public final void p() {
        java.lang.Object m521constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer = this.f266994g;
            jz5.f0 f0Var = null;
            if (!(surfaceProducer instanceof io.flutter.view.TextureRegistry.TextureEntry)) {
                surfaceProducer = null;
            }
            if (surfaceProducer != null) {
                surfaceProducer.setOnFrameAvailableListener(new fv4.e(this));
                f0Var = jz5.f0.f302826a;
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            java.lang.String content = "setupFrameAvailableListener: failed: " + m524exceptionOrNullimpl.getMessage() + ", fallback to direct scheduleFrame";
            kotlin.jvm.internal.o.g(content, "content");
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", content);
        }
    }

    public final void q() {
        android.view.View view;
        android.view.View view2;
        ev4.d dVar;
        java.lang.Object m521constructorimpl;
        jz5.f0 f0Var;
        tg0.c2 c2Var;
        tg0.h2 h2Var;
        fv4.i iVar = this.f267005a;
        if (iVar != null && (view2 = iVar.f267010d) != null && view2.getVisibility() != 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/websearch/searchplatformwebview/logic/PlatformWebViewLogic", "setWebViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/websearch/searchplatformwebview/logic/PlatformWebViewLogic", "setWebViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "setWebViewVisibility, visible: 0");
            fv4.i iVar2 = this.f267005a;
            if (iVar2 != null && (dVar = iVar2.f267012f) != null) {
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.putOpt("visible", 1);
                    fv4.i iVar3 = dVar.f256944b;
                    if (iVar3 == null || (c2Var = iVar3.f267009c) == null || (h2Var = c2Var.f419053h) == null) {
                        f0Var = null;
                    } else {
                        ((ch0.h0) h2Var).b("onWebViewVisibilityChangedInFlutter", jSONObject);
                        f0Var = jz5.f0.f302826a;
                    }
                    m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
                if (m524exceptionOrNullimpl != null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", "notifyH5WebViewVisibilityChanged Failed", m524exceptionOrNullimpl);
                }
            }
        }
        fv4.i iVar4 = this.f267005a;
        if (iVar4 == null || (view = iVar4.f267010d) == null) {
            return;
        }
        if (view.getAlpha() <= 0.5f) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/websearch/searchplatformwebview/logic/PlatformWSFH5ComponentLogic", "showWebView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/websearch/searchplatformwebview/logic/PlatformWSFH5ComponentLogic", "showWebView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if ((viewGroup != null && viewGroup.getVisibility() == 0) || viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(0);
    }
}
