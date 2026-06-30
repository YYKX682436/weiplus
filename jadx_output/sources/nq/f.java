package nq;

/* loaded from: classes8.dex */
public final class f implements nq.w {

    /* renamed from: n, reason: collision with root package name */
    public static long f338866n = 500;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.dynamicbackground.model.DynamicBackgroundNative f338867a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f338868b;

    /* renamed from: c, reason: collision with root package name */
    public int f338869c;

    /* renamed from: d, reason: collision with root package name */
    public int f338870d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f338871e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f338872f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f338873g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f338874h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.dynamicbackground.view.GameGLSurfaceView f338875i;

    /* renamed from: j, reason: collision with root package name */
    public int f338876j;

    /* renamed from: k, reason: collision with root package name */
    public nq.a f338877k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f338878l;

    /* renamed from: m, reason: collision with root package name */
    public final lq.c f338879m;

    public f(android.content.Context context) {
        kotlin.jvm.internal.o.h(context, "context");
        lq.c cVar = lq.d.f320447a;
        lq.c cVar2 = lq.d.f320447a;
        this.f338879m = cVar2;
        if (cVar2 == null || !cVar2.getIsEnable() || cVar2 == null || cVar2.willCrash()) {
            mq.h.a("MicroMsg.DynamicBgSurfaceView", "alvinluo AppBrandDesktopConfig not enableNativeDynamicBackground", new java.lang.Object[0]);
        } else {
            this.f338867a = new com.tencent.mm.dynamicbackground.model.DynamicBackgroundNative();
        }
        this.f338868b = new java.lang.ref.WeakReference(context);
    }

    public final void a() {
        mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo NativeRender init", new java.lang.Object[0]);
        com.tencent.mm.dynamicbackground.model.DynamicBackgroundNative dynamicBackgroundNative = this.f338867a;
        if (dynamicBackgroundNative != null) {
            try {
                if (dynamicBackgroundNative.f64876a <= 0) {
                    dynamicBackgroundNative.f64876a = dynamicBackgroundNative.nativeInit();
                    mq.h.b("MicroMsg.DynamicBackgroundNative", "create DynamicBackgroundNative inst: " + dynamicBackgroundNative.f64876a, new java.lang.Object[0]);
                }
            } catch (java.lang.Throwable th6) {
                mq.h.c("MicroMsg.DynamicBgSurfaceView", th6, "alvinluo nativeInit exception", new java.lang.Object[0]);
                if (th6 instanceof java.lang.UnsatisfiedLinkError) {
                    mq.h.a("MicroMsg.DynamicBgSurfaceView", "alvinluo nativeInit called failed, try to load so once more", new java.lang.Object[0]);
                    try {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add("dynamicBg");
                        java.lang.Object obj = new java.lang.Object();
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView$GLRenderer", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
                        yj0.a.f(obj, "com/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView$GLRenderer", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                        if (dynamicBackgroundNative != null) {
                            dynamicBackgroundNative.nativeInit();
                        }
                        this.f338878l = true;
                        return;
                    } catch (java.lang.Throwable unused) {
                        lq.c cVar = this.f338879m;
                        if (cVar != null) {
                            cVar.onInitCrash();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
        this.f338878l = true;
        nq.a aVar = this.f338877k;
        if (aVar == null || dynamicBackgroundNative == null) {
            return;
        }
        int i17 = aVar.f338857a;
        int i18 = aVar.f338858b;
        int i19 = aVar.f338859c;
        int i27 = aVar.f338860d;
        int i28 = aVar.f338861e;
        long j17 = dynamicBackgroundNative.f64876a;
        if (j17 > 0) {
            dynamicBackgroundNative.setColor(j17, i17, i18, i19, i27, i28);
        }
    }

    public final void b() {
        com.tencent.mm.dynamicbackground.model.DynamicBackgroundNative dynamicBackgroundNative = this.f338867a;
        if (dynamicBackgroundNative != null) {
            int i17 = this.f338869c;
            int i18 = this.f338870d;
            long j17 = dynamicBackgroundNative.f64876a;
            if (j17 > 0) {
                dynamicBackgroundNative.surfaceCreated(j17, i17, i18);
            }
        }
        android.content.Context context = (android.content.Context) this.f338868b.get();
        if (context != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            mq.e eVar = mq.e.f330510a;
            sb6.append(eVar.b(context));
            sb6.append("scene_shaderv.glsl");
            java.lang.String vertexShader = sb6.toString();
            java.lang.String fragmentShader = eVar.b(context) + "scene_shaderf.glsl";
            java.lang.String vertexFrameBuffer = eVar.b(context) + "vertex_framebuffer_plane.glsl";
            java.lang.String fragFrameBuffer = eVar.b(context) + "frag_framebuffer_plane.glsl";
            java.lang.String textureVertexShader = eVar.b(context) + "texture_vertex_shader.glsl";
            java.lang.String textureFragmentShader = eVar.b(context) + "texture_fragment_shader.glsl";
            java.lang.String bgVertexShader = eVar.b(context) + "bg_gradient_vertex_shader.glsl";
            java.lang.String bgFragmentShader = eVar.b(context) + "bg_gradient_fragment_shader.glsl";
            com.tencent.mm.dynamicbackground.model.DynamicBackgroundNative dynamicBackgroundNative2 = this.f338867a;
            if (dynamicBackgroundNative2 != null) {
                kotlin.jvm.internal.o.h(vertexShader, "vertexShader");
                kotlin.jvm.internal.o.h(fragmentShader, "fragmentShader");
                kotlin.jvm.internal.o.h(vertexFrameBuffer, "vertexFrameBuffer");
                kotlin.jvm.internal.o.h(fragFrameBuffer, "fragFrameBuffer");
                kotlin.jvm.internal.o.h(textureVertexShader, "textureVertexShader");
                kotlin.jvm.internal.o.h(textureFragmentShader, "textureFragmentShader");
                kotlin.jvm.internal.o.h(bgVertexShader, "bgVertexShader");
                kotlin.jvm.internal.o.h(bgFragmentShader, "bgFragmentShader");
                if (dynamicBackgroundNative2.f64876a > 0) {
                    synchronized (com.tencent.mm.dynamicbackground.model.DynamicBackgroundNative.class) {
                        dynamicBackgroundNative2.setupGlslFiles(dynamicBackgroundNative2.f64876a, vertexShader, fragmentShader, vertexFrameBuffer, fragFrameBuffer, textureVertexShader, textureFragmentShader, bgVertexShader, bgFragmentShader);
                    }
                }
            }
            com.tencent.mm.dynamicbackground.model.DynamicBackgroundNative dynamicBackgroundNative3 = this.f338867a;
            if (dynamicBackgroundNative3 != null) {
                long j18 = dynamicBackgroundNative3.f64876a;
                if (j18 > 0) {
                    dynamicBackgroundNative3.initView(j18);
                }
            }
            this.f338876j = 0;
        }
    }

    public void c(javax.microedition.khronos.opengles.GL10 gl10, boolean z17) {
        android.view.View view;
        lq.c cVar = this.f338879m;
        if (cVar != null && cVar.needMarkDrawPoint() && cVar != null) {
            cVar.markDrawStartPoint();
        }
        try {
            com.tencent.mm.dynamicbackground.model.DynamicBackgroundNative dynamicBackgroundNative = this.f338867a;
            if (dynamicBackgroundNative != null) {
                long j17 = dynamicBackgroundNative.f64876a;
                if (j17 > 0) {
                    dynamicBackgroundNative.draw(j17);
                }
            }
        } catch (java.lang.Throwable th6) {
            mq.h.c("MicroMsg.DynamicBgSurfaceView", th6, "alvinluo onDraw exception", new java.lang.Object[0]);
            if (cVar != null) {
                cVar.setEnableNativeDynamicBackground(false);
            }
        }
        if (cVar != null && cVar.needMarkDrawPoint()) {
            int i17 = this.f338876j + 1;
            this.f338876j = i17;
            if (i17 >= 2 && cVar != null) {
                cVar.markDrawEndPoint();
            }
        }
        boolean z18 = this.f338872f;
        if (!z18 && !this.f338874h) {
            this.f338874h = true;
            android.view.View view2 = this.f338871e;
            if (view2 != null) {
                view2.post(new nq.c(this));
                return;
            }
            return;
        }
        if (z18) {
            android.view.View view3 = this.f338871e;
            if ((view3 == null || view3.getVisibility() != 0) && (view = this.f338871e) != null) {
                view.post(new nq.e(this));
            }
        }
    }

    public void d(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        android.graphics.Point point;
        lq.c cVar = this.f338879m;
        try {
            a();
            android.content.Context context = (android.content.Context) this.f338868b.get();
            if (context != null) {
                if (cVar == null || (point = cVar.getDisplayRealSize(context)) == null) {
                    point = new android.graphics.Point(0, 0);
                }
                int i17 = point.x;
                this.f338869c = i17;
                this.f338870d = point.y;
                mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo onEGLCreated width: %d, height: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f338870d));
                b();
                if (cVar == null || !cVar.getIsEnable() || cVar == null || cVar.isInitCrash() || cVar == null) {
                    return;
                }
                cVar.onInitEnd();
            }
        } catch (java.lang.Throwable th6) {
            mq.h.c("MicroMsg.DynamicBgSurfaceView", th6, "alvinluo onEGLCreated exception", new java.lang.Object[0]);
            if (cVar != null) {
                cVar.onInitCrash();
            }
        }
    }

    public void e(java.lang.Throwable th6) {
        mq.h.a("MicroMsg.DynamicBgSurfaceView", "alvinluo GLSurfaceView onError", new java.lang.Object[0]);
        lq.c cVar = this.f338879m;
        if (cVar != null) {
            cVar.markWillCrash();
        }
    }

    public void f(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        try {
            mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo onSurfaceSizeChanged width: %d, height: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            int i19 = this.f338869c;
            if ((i19 == i17 || this.f338870d != i18) && (this.f338870d == i18 || i19 == i17)) {
                return;
            }
            a();
            this.f338869c = i17;
            this.f338870d = i18;
            mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo onSurfaceSizeChanged reCreated width: %d, height: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f338870d));
            b();
        } catch (java.lang.Throwable th6) {
            mq.h.c("MicroMsg.DynamicBgSurfaceView", th6, "alvinluo onSurfaceSizeChanged exception", new java.lang.Object[0]);
            lq.c cVar = this.f338879m;
            if (cVar != null) {
                cVar.setEnableNativeDynamicBackground(false);
            }
        }
    }

    public void g() {
        mq.h.b("MicroMsg.DynamicBgSurfaceView", "preDestroy", new java.lang.Object[0]);
        com.tencent.mm.dynamicbackground.model.DynamicBackgroundNative dynamicBackgroundNative = this.f338867a;
        if (dynamicBackgroundNative == null || dynamicBackgroundNative.f64877b > 0) {
            return;
        }
        mq.h.b("MicroMsg.DynamicBackgroundNative", "preRelease: " + dynamicBackgroundNative.f64876a, new java.lang.Object[0]);
        dynamicBackgroundNative.f64877b = dynamicBackgroundNative.f64876a;
        dynamicBackgroundNative.f64876a = -1L;
    }
}
