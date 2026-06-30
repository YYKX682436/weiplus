package com.tencent.mm.plugin.flash;

/* loaded from: classes14.dex */
public class FaceFlashPreviewLayout extends android.widget.RelativeLayout implements com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTReflectListener, android.view.TextureView.SurfaceTextureListener, com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitFrameworkEventListener, com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTBaseFunctionListener {
    public static final /* synthetic */ int P = 0;
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public float F;
    public long G;
    public boolean H;
    public final com.tencent.mm.sdk.platformtools.o4 I;

    /* renamed from: J, reason: collision with root package name */
    public long f137018J;
    public final java.util.List K;
    public java.lang.String L;
    public java.lang.String M;
    public final android.os.CountDownTimer N;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.flash.view.FaceFlashReflectMask f137019d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f137020e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f137021f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMTextureView f137022g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f137023h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ProgressBar f137024i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.flash.view.FaceNumberLayout f137025m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f137026n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f137027o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f137028p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.flash.FaceFlashUI f137029q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.flash.p f137030r;

    /* renamed from: s, reason: collision with root package name */
    public final android.content.Context f137031s;

    /* renamed from: t, reason: collision with root package name */
    public tz2.u f137032t;

    /* renamed from: u, reason: collision with root package name */
    public final tz2.j f137033u;

    /* renamed from: v, reason: collision with root package name */
    public sz2.b f137034v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode f137035w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f137036x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f137037y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f137038z;

    static {
        rz2.g.a();
    }

    public FaceFlashPreviewLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getDegree() {
        int rotation = ((android.app.Activity) getContext()).getWindowManager().getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    public final void a() {
        this.f137026n.setVisibility(4);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "resetWithoutPreview");
        vz2.b.b(this.f137035w);
        com.tencent.mm.plugin.flash.view.FaceFlashReflectMask faceFlashReflectMask = this.f137019d;
        faceFlashReflectMask.getClass();
        faceFlashReflectMask.setColorMatrixColorFilter(new android.graphics.ColorMatrixColorFilter(new float[]{1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        int d17 = i65.a.d(getContext(), com.tencent.mm.R.color.f478712f3);
        com.tencent.mm.plugin.flash.FaceFlashUI faceFlashUI = this.f137029q;
        faceFlashUI.Z6(d17);
        this.f137020e.setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.f478712f3));
        this.f137036x = false;
        this.f137037y = false;
        this.G = 0L;
        this.C = 0;
        this.f137019d.setProgress(0.0f);
        this.f137024i.setVisibility(8);
        this.f137025m.a();
        this.f137025m.removeAllViews();
        android.view.View view = this.f137027o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout", "resetWithoutPreview", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout", "resetWithoutPreview", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z17 = this.f137038z;
        tz2.j jVar = this.f137033u;
        if (z17) {
            if (jVar.f423296m == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "recordManager reset abort");
                this.f137032t.reset();
                faceFlashUI.Z6(i65.a.d(getContext(), com.tencent.mm.R.color.f478712f3));
                e(i65.a.r(getContext(), com.tencent.mm.R.string.fl_pose_incorrect));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "recordManager reset");
        jVar.c();
        this.f137032t.reset();
        faceFlashUI.Z6(i65.a.d(getContext(), com.tencent.mm.R.color.f478712f3));
        e(i65.a.r(getContext(), com.tencent.mm.R.string.fl_pose_incorrect));
    }

    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "onPause");
        if (this.f137037y) {
            com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().fireEvent(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_CANCEL_LIVENESS, null);
        }
        com.tencent.mm.plugin.flash.p pVar = this.f137030r;
        pVar.a();
        pVar.f137240a.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "releaseYTSdk");
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().deInit();
        com.tencent.mm.plugin.flash.d0 d0Var = pVar.f137241b;
        if (d0Var != null) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = d0Var.f137200c;
            if (n3Var != null) {
                n3Var.post(new com.tencent.mm.plugin.flash.a0(d0Var));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerCamera", "back thread is not running");
            }
        }
        g();
        a();
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTBaseFunctionListener
    public java.lang.String base64Encode(byte[] bArr, int i17) {
        return null;
    }

    public void c() {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "onResume");
        if (getVisibility() == 0) {
            com.tencent.mm.plugin.flash.p pVar = this.f137030r;
            pVar.getClass();
            com.tencent.mm.plugin.flash.r rVar = new com.tencent.mm.plugin.flash.r();
            pVar.f137240a = rVar;
            if (rVar.c()) {
                vz2.c.j("initSdk");
                vz2.c.m(10);
                z17 = true;
            } else {
                vz2.c.k("initSdk", -1);
                vz2.c.b().B = 2;
                pVar.f137242c.W6(90013, "init lib failed");
                z17 = false;
            }
            if (z17) {
                if (this.f137022g.isAvailable()) {
                    onSurfaceTextureAvailable(this.f137022g.getSurfaceTexture(), this.f137022g.getWidth(), this.f137022g.getHeight());
                }
                this.f137022g.setSurfaceTextureListener(this);
                this.N.start();
                if (this.E == -1) {
                    this.E = getDegree();
                }
            }
        }
    }

    public final void d() {
        if (this.f137019d.getCircleY() <= 0.0f) {
            this.f137019d.setCallback(new com.tencent.mm.plugin.flash.g(this));
            return;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f137023h.getLayoutParams();
        marginLayoutParams.topMargin = (int) (this.f137019d.getCircleY() - (this.f137023h.getHeight() / 2));
        this.f137023h.setLayoutParams(marginLayoutParams);
        this.f137024i.getHeight();
    }

    public final void e(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "resetTranslateAnimation prepareVerifying:%s", java.lang.Boolean.valueOf(this.f137036x));
        f(this.f137020e, str);
        this.f137020e.setTextColor(android.graphics.Color.parseColor("#000000"));
        if (!android.text.TextUtils.isEmpty(this.L)) {
            if (android.text.TextUtils.isEmpty(this.M)) {
                this.f137021f.setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            } else {
                this.f137021f.setTextColor(android.graphics.Color.parseColor(this.M));
            }
        }
        this.f137020e.clearAnimation();
        this.f137020e.setVisibility(0);
        this.f137025m.setVisibility(4);
    }

    public final void f(android.widget.TextView textView, java.lang.String str) {
        wz2.a.j(textView, str);
        tz2.e eVar = (tz2.e) this.f137032t;
        eVar.getClass();
        eVar.f423274s = java.lang.System.currentTimeMillis();
    }

    public final void g() {
        this.f137025m.a();
        this.f137033u.f(((tz2.e) this.f137032t).f423265g);
        com.tencent.mm.autogen.mmdata.rpt.FaceFlashLogOpenStruct b17 = vz2.c.b();
        b17.f56200y = b17.b("BioId", java.lang.String.valueOf(((tz2.e) this.f137032t).f423265g), true);
        tz2.u uVar = this.f137032t;
        if (uVar instanceof tz2.i) {
            ((tz2.i) uVar).p();
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTBaseFunctionListener
    public byte[] getVoiceData() {
        g();
        int i17 = -1;
        byte[] N = com.tencent.mm.vfs.w6.N(((tz2.i) this.f137032t).F.f249893c, -1, -1);
        if (N != null && N.length > 0) {
            i17 = 0;
        }
        vz2.c.k("voiceData", java.lang.Integer.valueOf(i17));
        return N;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        this.f137022g.setRotation(-(getDegree() - this.E));
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitFrameworkEventListener
    public void onFrameworkEvent(java.util.HashMap hashMap) {
        if (hashMap.containsKey(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.STATE_STATS)) {
            java.util.HashMap hashMap2 = (java.util.HashMap) hashMap.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.STATE_STATS);
            if (vz2.c.f441662e == null) {
                vz2.c.f441662e = new org.json.JSONArray();
            }
            if ((vz2.c.f441662e.toString().length() <= 1000) && hashMap2 != null && hashMap2.size() > 0) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(hashMap2);
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerReport", "updateFaceSdkState:%s", jSONObject);
                if (vz2.c.f441662e.length() >= 5) {
                    vz2.c.f441662e.remove(0);
                    vz2.c.f441662e.put(jSONObject);
                }
            }
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.flash.j(this, hashMap));
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTReflectListener
    public float onGetAppBrightness() {
        return 1.0f;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitFrameworkEventListener
    public void onNetworkRequestEvent(java.lang.String str, java.lang.String str2, java.util.HashMap hashMap, com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        this.f137032t.onNetworkRequestEvent(str, str2, hashMap, iYtSDKKitNetResponseParser);
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTReflectListener
    public void onReflectEvent(android.graphics.ColorMatrixColorFilter colorMatrixColorFilter, float f17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "change color :%s isVerifying:%s", colorMatrixColorFilter, java.lang.Boolean.valueOf(this.f137037y));
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.flash.b(this, colorMatrixColorFilter));
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTReflectListener
    public void onReflectStart(long j17) {
        vz2.c.j("reflect");
        this.F = (float) j17;
        this.G = java.lang.System.currentTimeMillis();
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.flash.c(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "onReflectStart duration:%s", java.lang.Long.valueOf(j17));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "onSurfaceTextureAvailable width:%s,height:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        d();
        com.tencent.mm.plugin.flash.p pVar = this.f137030r;
        com.tencent.mm.plugin.flash.d0 d0Var = pVar.f137241b;
        if ((d0Var == null ? false : d0Var.f137208k) || this.f137037y || getVisibility() != 0) {
            com.tencent.mm.plugin.flash.d0 d0Var2 = pVar.f137241b;
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "jump start preview again. isPreviewing:%s isVerifying:%s", java.lang.Boolean.valueOf(d0Var2 != null ? d0Var2.f137208k : false), java.lang.Boolean.valueOf(this.f137037y));
            return;
        }
        com.tencent.mm.ui.base.MMTextureView mMTextureView = this.f137022g;
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode = this.f137035w;
        com.tencent.mm.plugin.flash.e eVar = new com.tencent.mm.plugin.flash.e(this);
        com.tencent.mm.plugin.flash.d0 d0Var3 = new com.tencent.mm.plugin.flash.d0(pVar.f137242c);
        pVar.f137241b = d0Var3;
        d0Var3.d(mMTextureView, new com.tencent.mm.plugin.flash.o(pVar, this, this, ytSDKKitFrameworkWorkMode, this, surfaceTexture, eVar));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "onSurfaceTextureDestroyed");
        this.f137030r.a();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "onSurfaceTextureSizeChanged width:%s,height:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceFlashPreviewLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        android.hardware.SensorManager sensorManager;
        int i18 = 0;
        com.tencent.mm.plugin.flash.FaceFlashUI faceFlashUI = (com.tencent.mm.plugin.flash.FaceFlashUI) getContext();
        this.f137029q = faceFlashUI;
        this.f137030r = new com.tencent.mm.plugin.flash.p(faceFlashUI);
        this.f137031s = getContext();
        tz2.j jVar = new tz2.j();
        this.f137033u = jVar;
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE;
        this.f137035w = ytSDKKitFrameworkWorkMode;
        this.f137036x = false;
        this.f137037y = false;
        this.f137038z = false;
        this.A = false;
        this.B = 0;
        this.C = 0;
        this.D = -1;
        this.E = -1;
        this.F = 0.0f;
        this.G = 0L;
        this.H = false;
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("face-flash");
        this.I = M;
        this.f137018J = M.q("show-dialog", 0L);
        this.K = java.util.Arrays.asList(com.tencent.youtu.sdkkitframework.common.StringCode.FL_NO_LEFT_FACE, com.tencent.youtu.sdkkitframework.common.StringCode.FL_NO_RIGHT_FACE, com.tencent.youtu.sdkkitframework.common.StringCode.FL_NO_CHIN, com.tencent.youtu.sdkkitframework.common.StringCode.FL_NO_MOUTH, com.tencent.youtu.sdkkitframework.common.StringCode.FL_NO_NOSE, com.tencent.youtu.sdkkitframework.common.StringCode.FL_NO_LEFT_EYE, com.tencent.youtu.sdkkitframework.common.StringCode.FL_NO_RIGHT_EYE, com.tencent.youtu.sdkkitframework.common.StringCode.FL_POSE_KEEP, com.tencent.youtu.sdkkitframework.common.StringCode.FL_REFLECT_PREPARE, com.tencent.youtu.sdkkitframework.common.StringCode.FL_POSE_OPEN_EYE, com.tencent.youtu.sdkkitframework.common.StringCode.FL_POSE_NOT_IN_RECT, com.tencent.youtu.sdkkitframework.common.StringCode.FL_POSE_CLOSER, com.tencent.youtu.sdkkitframework.common.StringCode.FL_POSE_FARER, com.tencent.youtu.sdkkitframework.common.StringCode.FL_POSE_INCORRECT, com.tencent.youtu.sdkkitframework.common.StringCode.FL_TOO_MANY_FACES, com.tencent.youtu.sdkkitframework.common.StringCode.FL_INCOMPLETE_FACE, com.tencent.youtu.sdkkitframework.common.StringCode.FL_ACT_BLINK, com.tencent.youtu.sdkkitframework.common.StringCode.FL_ACT_OPEN_MOUTH, com.tencent.youtu.sdkkitframework.common.StringCode.FL_ACT_SHAKE_HEAD, com.tencent.youtu.sdkkitframework.common.StringCode.FL_ACT_NOD_HEAD, com.tencent.youtu.sdkkitframework.common.StringCode.FL_ACT_SILENCE, com.tencent.youtu.sdkkitframework.common.StringCode.FL_ACT_SCREEN_SHAKING);
        this.L = null;
        this.M = null;
        this.N = new com.tencent.mm.plugin.flash.a(this, 25000L, 1000L);
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.aa8, (android.view.ViewGroup) this, true);
        this.f137019d = (com.tencent.mm.plugin.flash.view.FaceFlashReflectMask) findViewById(com.tencent.mm.R.id.f485009g82);
        this.f137020e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.g89);
        this.f137021f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.g8_);
        this.f137023h = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.dme);
        this.f137024i = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.dnv);
        this.f137025m = (com.tencent.mm.plugin.flash.view.FaceNumberLayout) findViewById(com.tencent.mm.R.id.g7x);
        this.f137027o = findViewById(com.tencent.mm.R.id.g7u);
        this.f137026n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dod);
        this.f137028p = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.dno);
        android.content.Intent intent = ((android.app.Activity) getContext()).getIntent();
        int intExtra = intent.getIntExtra("check_alive_type", 4);
        if (intExtra == 1) {
            this.f137035w = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE;
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "biz choose REFLECTION");
            this.D = 2;
            i18 = intExtra;
        } else if (intExtra == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "biz choose CHOOSE_BY_LUX");
            wz2.f fVar = wz2.e.f450770a;
            fVar.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
            wz2.d dVar = fVar.f450772b;
            float f17 = dVar != null ? dVar.f450769d : -1.0f;
            if (fVar.f450773c && (sensorManager = fVar.f450771a) != null) {
                fVar.f450773c = false;
                sensorManager.unregisterListener(dVar);
            }
            if (f17 < intent.getFloatExtra("mLight_threshold", -1.0f)) {
                this.f137035w = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE;
                this.D = 5;
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "biz choose CHOOSE_BY_LUX  REFLECTION");
                i18 = 1;
            } else {
                this.f137035w = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_LIPREAD_TYPE;
                this.D = 6;
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "biz choose CHOOSE_BY_LUX  READ_NUMBER");
            }
        } else if (intExtra != 4) {
            this.f137035w = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_LIPREAD_TYPE;
            this.D = 3;
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "biz choose READ_NUMBER");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "biz choose CHOOSE_BY_LUX  ACTREFLECT");
            this.f137035w = ytSDKKitFrameworkWorkMode;
            this.D = 4;
            i18 = 4;
        }
        vz2.c.b().f56180e = this.D;
        tz2.u a17 = tz2.f.a(i18);
        this.f137032t = a17;
        a17.c(intent, (android.app.Activity) getContext());
        jVar.a(intent, i18);
        this.L = intent.getStringExtra("business_tips");
        this.M = intent.getStringExtra("business_tips_color");
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "face detect type:%s  after type:%s topTip: %s, topTipColor: %s", this.f137035w, java.lang.Integer.valueOf(i18), this.L, this.M);
        if (android.text.TextUtils.isEmpty(this.L)) {
            this.f137021f.setVisibility(8);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f137020e.getLayoutParams();
            layoutParams.removeRule(3);
            layoutParams.topMargin = i65.a.b(getContext(), 100);
            this.f137020e.setLayoutParams(layoutParams);
        } else {
            this.f137021f.setText(this.L);
            if (!android.text.TextUtils.isEmpty(this.M)) {
                this.f137021f.setTextColor(android.graphics.Color.parseColor(this.M));
            }
            this.f137021f.setVisibility(4);
        }
        this.f137019d.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.flash.FaceFlashPreviewLayout$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.flash.FaceFlashPreviewLayout faceFlashPreviewLayout = com.tencent.mm.plugin.flash.FaceFlashPreviewLayout.this;
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManager", "faceReflectMask post faceTipTextView.getHeight(): %d, top: %d ", java.lang.Integer.valueOf(faceFlashPreviewLayout.f137020e.getHeight()), java.lang.Integer.valueOf(faceFlashPreviewLayout.f137020e.getTop()));
                faceFlashPreviewLayout.f137019d.setCircleMarginY(faceFlashPreviewLayout.f137020e.getTop() + faceFlashPreviewLayout.f137020e.getHeight() + i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 24));
                faceFlashPreviewLayout.f137019d.invalidate();
                faceFlashPreviewLayout.d();
            }
        });
        f(this.f137020e, i65.a.r(getContext(), com.tencent.mm.R.string.fl_pose_not_in_rect));
        this.f137022g = (com.tencent.mm.ui.base.MMTextureView) findViewById(com.tencent.mm.R.id.g7v);
        this.f137034v = new sz2.b(getContext());
    }
}
