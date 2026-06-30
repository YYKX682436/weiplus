package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class FaceFlashActionPreviewLayout extends android.widget.RelativeLayout implements com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTReflectListener, android.view.TextureView.SurfaceTextureListener, com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitFrameworkEventListener, com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTBaseFunctionListener, com.tencent.mm.modelbase.u0 {

    /* renamed from: l1, reason: collision with root package name */
    public static final int f137063l1 = rz2.g.a();
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public final boolean F;
    public wu5.c G;
    public wu5.c H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public float f137064J;
    public long K;
    public boolean L;
    public int M;
    public long N;
    public boolean P;
    public long Q;
    public java.lang.String R;
    public java.lang.String S;
    public java.lang.String T;
    public float U;
    public java.lang.String V;
    public float W;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.SurfaceTexture f137065d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.flash.view.FaceReflectMask f137066e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f137067f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f137068g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f137069h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMTextureView f137070i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f137071m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ProgressBar f137072n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.flash.view.FaceNumberLayout f137073o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f137074p;

    /* renamed from: p0, reason: collision with root package name */
    public tz2.l f137075p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f137076q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.flash.d0 f137077r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.flash.action.FaceFlashActionUI f137078s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.flash.r f137079t;

    /* renamed from: u, reason: collision with root package name */
    public final android.content.Context f137080u;

    /* renamed from: v, reason: collision with root package name */
    public tz2.u f137081v;

    /* renamed from: w, reason: collision with root package name */
    public final tz2.j f137082w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode f137083x;

    /* renamed from: x0, reason: collision with root package name */
    public wu5.b f137084x0;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.animation.Animation f137085y;

    /* renamed from: y0, reason: collision with root package name */
    public final android.os.CountDownTimer f137086y0;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.animation.Animation f137087z;

    public FaceFlashActionPreviewLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String getFaceCheckResultSerialId() {
        tz2.u uVar = this.f137081v;
        return uVar instanceof com.tencent.mm.plugin.flash.action.s0 ? ((com.tencent.mm.plugin.flash.action.s0) uVar).Y : "";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:(2:91|92)|(3:94|95|(3:96|97|(2:99|100)))|(5:102|103|104|105|(1:107))|109|110|111|(2:114|115)|(2:120|121)|125|126|127|128) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:91|92|94|95|96|97|(2:99|100)|(5:102|103|104|105|(1:107))|109|110|111|(2:114|115)|(2:120|121)|125|126|127|128) */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x04ac, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x04ad, code lost:
    
        r2 = new java.lang.StringBuilder("release camera2 failed : ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0484, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0485, code lost:
    
        com.tencent.mars.xlog.Log.i("FaceUtilNew", "release previewTexture failed : " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0434, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0435, code lost:
    
        com.tencent.mars.xlog.Log.i("FaceUtilNew", "stop camera preview failed : " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0338, code lost:
    
        com.tencent.mars.xlog.Log.e("FaceUtilNew", "openCamera found front Camera ");
        r0 = new java.util.ArrayList();
        r14 = zj0.c.f473285a;
        r0.add(java.lang.Integer.valueOf(r13));
        r16 = new java.lang.Object();
        java.util.Collections.reverse(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0369, code lost:
    
        r13 = (android.hardware.Camera) yj0.a.k(r16, r0.toArray(), "com/tencent/mm/plugin/flash/utils/FaceUtilNew", "checkCam", "(Z)V", "android/hardware/Camera", "open", "(I)Landroid/hardware/Camera;");
        r14 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x044a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0467 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0428 A[Catch: all -> 0x04b4, TRY_LEAVE, TryCatch #10 {all -> 0x04b4, blocks: (B:105:0x038e, B:107:0x03aa, B:149:0x03c2, B:151:0x03de, B:145:0x03e6, B:147:0x0402, B:141:0x040a, B:143:0x0428), top: B:96:0x037d }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0402 A[Catch: all -> 0x04b4, TryCatch #10 {all -> 0x04b4, blocks: (B:105:0x038e, B:107:0x03aa, B:149:0x03c2, B:151:0x03de, B:145:0x03e6, B:147:0x0402, B:141:0x040a, B:143:0x0428), top: B:96:0x037d }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03de A[Catch: all -> 0x04b4, TryCatch #10 {all -> 0x04b4, blocks: (B:105:0x038e, B:107:0x03aa, B:149:0x03c2, B:151:0x03de, B:145:0x03e6, B:147:0x0402, B:141:0x040a, B:143:0x0428), top: B:96:0x037d }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x05e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0644  */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.ThreadLocal] */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v9, types: [int] */
    /* JADX WARN: Type inference failed for: r15v11, types: [android.graphics.Canvas] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r9v17, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r25) {
        /*
            Method dump skipped, instructions count: 1636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout.b(int):void");
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTBaseFunctionListener
    public java.lang.String base64Encode(byte[] bArr, int i17) {
        return null;
    }

    public final void c() {
        com.tencent.mm.plugin.flash.d0 d0Var;
        if (this.f137065d != null && (d0Var = this.f137077r) != null) {
            android.graphics.Point c17 = d0Var.c();
            android.graphics.SurfaceTexture surfaceTexture = this.f137065d;
            com.tencent.mm.plugin.flash.action.b bVar = new com.tencent.mm.plugin.flash.action.b(this, c17);
            if (d0Var.f(surfaceTexture, new com.tencent.mm.plugin.flash.action.c(this))) {
                d0Var.f137201d.h(new com.tencent.mm.plugin.flash.w(d0Var, bVar));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "resetWithoutPreview");
        vz2.b.b(this.f137083x);
        com.tencent.mm.plugin.flash.view.FaceReflectMask faceReflectMask = this.f137066e;
        faceReflectMask.getClass();
        faceReflectMask.setColorMatrixColorFilter(new android.graphics.ColorMatrixColorFilter(new float[]{1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        int d17 = i65.a.d(getContext(), com.tencent.mm.R.color.BW_0);
        com.tencent.mm.plugin.flash.action.FaceFlashActionUI faceFlashActionUI = this.f137078s;
        faceFlashActionUI.Z6(d17);
        this.f137069h.setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.BW_0));
        this.f137068g.setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.BW_0));
        this.f137067f.setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
        this.A = false;
        this.B = false;
        this.K = 0L;
        this.E = 0;
        this.f137066e.setProgress(0.0f);
        this.f137072n.setVisibility(8);
        this.f137073o.a();
        this.f137073o.removeAllViews();
        android.view.View view = this.f137074p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/flash/action/FaceFlashActionPreviewLayout", "resetWithoutPreview", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/flash/action/FaceFlashActionPreviewLayout", "resetWithoutPreview", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f137082w.c();
        if (this.P) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.flash.action.j0 j0Var = (com.tencent.mm.plugin.flash.action.j0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.flash.action.j0.class);
            if (j0Var.f137149e) {
                tz2.q qVar = j0Var.f137148d;
                if (qVar.f423317a && qVar.f423320d != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashRecordManagerForPay", "resetRecord");
                    if (qVar.f423317a) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashRecordManagerForPay", "releaseRecord");
                        h72.s.e().d();
                    }
                    qVar.d(qVar.f423320d);
                }
                qVar.e();
                j0Var.f137150f = "";
            }
            android.content.Context context2 = getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.flash.action.j0 j0Var2 = (com.tencent.mm.plugin.flash.action.j0) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.flash.action.j0.class);
            if (j0Var2.f137149e) {
                j0Var2.f137148d.e();
            }
            this.f137075p0 = tz2.l.f423303e;
        }
        this.f137081v.reset();
        this.f137079t.getClass();
        com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance().reset();
        faceFlashActionUI.Z6(i65.a.d(getContext(), com.tencent.mm.R.color.BW_0));
        f(i65.a.r(getContext(), com.tencent.mm.R.string.fl_pose_incorrect));
    }

    public final java.lang.String d(int i17, java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, i17);
            jSONObject.put("err_code", i17);
            jSONObject.put("err_msg", str);
            android.content.Intent intent = ((android.app.Activity) getContext()).getIntent();
            if (intent != null) {
                jSONObject.put("otherVerifyTitle", intent.getStringExtra("otherVerifyTitle"));
            }
            jSONObject.put("err_retry", 0);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashActionPreviewLayout", "packageErrorResult error:%s", e17.getMessage());
        }
        return jSONObject.toString();
    }

    public final void e() {
        if (this.f137066e.getCircleY() <= 0.0f) {
            this.f137066e.setCallback(new com.tencent.mm.plugin.flash.action.t(this));
            return;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f137071m.getLayoutParams();
        marginLayoutParams.topMargin = (int) (this.f137066e.getCircleY() - (this.f137071m.getHeight() / 2));
        this.f137071m.setLayoutParams(marginLayoutParams);
    }

    public final void f(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "resetTranslateAnimation prepareVerifying:%s", java.lang.Boolean.valueOf(this.A));
        wu5.c cVar = this.G;
        if (cVar != null) {
            cVar.cancel(false);
            this.G = null;
        }
        wu5.c cVar2 = this.H;
        if (cVar2 != null) {
            cVar2.cancel(false);
            this.H = null;
        }
        g(this.f137068g, str);
        this.f137068g.setTextColor(android.graphics.Color.parseColor("#000000"));
        this.f137069h.setTextColor(android.graphics.Color.parseColor("#000000"));
        this.f137087z.setAnimationListener(null);
        this.f137085y.setAnimationListener(null);
        this.f137068g.clearAnimation();
        this.f137069h.clearAnimation();
        this.f137068g.setVisibility(0);
        this.f137069h.setVisibility(4);
        this.f137073o.setVisibility(4);
    }

    public final void g(android.widget.TextView textView, java.lang.String str) {
        textView.setText(str);
        tz2.e eVar = (tz2.e) this.f137081v;
        eVar.getClass();
        eVar.f423274s = java.lang.System.currentTimeMillis();
    }

    public float getCircleY() {
        return this.f137066e.getCircleY();
    }

    public java.lang.String getFaceOtherVerifyTitle() {
        android.content.Intent intent = ((android.app.Activity) getContext()).getIntent();
        return intent != null ? intent.getStringExtra("otherVerifyTitle") : "";
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTBaseFunctionListener
    public byte[] getVoiceData() {
        h();
        return com.tencent.mm.vfs.w6.N(((tz2.i) this.f137081v).F.f249893c, -1, -1);
    }

    public final void h() {
        tz2.u uVar;
        tz2.j jVar = this.f137082w;
        if (jVar == null || (uVar = this.f137081v) == null) {
            return;
        }
        jVar.f(((tz2.e) uVar).f423265g);
    }

    public final void i(tz2.l cdnUploadType) {
        if (this.P) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.flash.action.j0 j0Var = (com.tencent.mm.plugin.flash.action.j0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.flash.action.j0.class);
            j0Var.getClass();
            kotlin.jvm.internal.o.g(cdnUploadType, "cdnUploadType");
            if (j0Var.f137149e) {
                tz2.q qVar = j0Var.f137148d;
                qVar.getClass();
                if (qVar.f423317a && h72.s.e().h()) {
                    h72.s.e().l(new tz2.o(qVar, cdnUploadType));
                }
            }
        }
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitFrameworkEventListener
    public void onFrameworkEvent(java.util.HashMap hashMap) {
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.flash.action.a0(this, hashMap));
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTReflectListener
    public float onGetAppBrightness() {
        return 1.0f;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitFrameworkEventListener
    public void onNetworkRequestEvent(java.lang.String str, java.lang.String str2, java.util.HashMap hashMap, com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        this.f137081v.onNetworkRequestEvent(str, str2, hashMap, iYtSDKKitNetResponseParser);
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTReflectListener
    public void onReflectEvent(android.graphics.ColorMatrixColorFilter colorMatrixColorFilter, float f17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "onReflectEvent change color :%s isVerifying:%s", colorMatrixColorFilter, java.lang.Boolean.valueOf(this.B));
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.flash.action.d(this, colorMatrixColorFilter));
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTReflectListener
    public void onReflectStart(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "onReflectStart duration:%s", java.lang.Long.valueOf(j17));
        if (j17 > 0) {
            vz2.c.j("reflect");
            this.f137064J = (float) j17;
            this.K = java.lang.System.currentTimeMillis();
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.flash.action.e(this));
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", " onSceneEnd errType：%s errCode：%s errMsg：%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var instanceof j72.b) {
            r45.kf3 kf3Var = ((j72.b) m1Var).f298040f;
            com.tencent.mm.plugin.flash.action.FaceFlashActionUI faceFlashActionUI = this.f137078s;
            if (i17 != 0 || i18 != 0) {
                this.f137067f.setVisibility(8);
                faceFlashActionUI.a7(d(90037, i65.a.r(getContext(), com.tencent.mm.R.string.c7q)));
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", " response.ret_code：%s response.ret_msg：%s", java.lang.Integer.valueOf(kf3Var.f378645d), kf3Var.f378646e);
            if (kf3Var.f378645d != 0) {
                this.f137067f.setVisibility(8);
                faceFlashActionUI.a7(d(kf3Var.f378645d, kf3Var.f378646e));
                return;
            }
            boolean z17 = kf3Var.f378648g;
            this.P = z17;
            this.f137076q = kf3Var.f378651m;
            tz2.t.f423325a = kf3Var.f378652n;
            int i19 = kf3Var.f378649h;
            if (i19 > 0) {
                this.Q = i19;
            }
            r45.il6 il6Var = kf3Var.f378650i;
            this.R = il6Var.f377138f;
            this.T = il6Var.f377137e;
            this.S = il6Var.f377136d;
            this.U = il6Var.f377139g;
            this.V = il6Var.f377141i;
            this.W = il6Var.f377140h;
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "NetSceneGetFaceCheckLiveType response shouldRecordExtraVideo: %s, response extra_video_max_size: %s, extraVideoMaxSize: ", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(kf3Var.f378649h), java.lang.Long.valueOf(this.Q));
            b(kf3Var.f378647f);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "onSurfaceTextureAvailable width:%s,height:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        e();
        this.f137065d = surfaceTexture;
        com.tencent.mm.plugin.flash.d0 d0Var = this.f137077r;
        if (d0Var.f137208k || this.B || getVisibility() != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "jump start preview again. isPreviewing:%s isVerifying:%s", java.lang.Boolean.valueOf(d0Var.f137208k), java.lang.Boolean.valueOf(this.B));
            return;
        }
        this.N = java.lang.System.currentTimeMillis();
        this.f137066e.setVisibility(0);
        d0Var.d(this.f137070i, new com.tencent.mm.plugin.flash.action.s(this, surfaceTexture));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "onSurfaceTextureDestroyed");
        this.f137065d = null;
        this.f137077r.g();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "onSurfaceTextureSizeChanged width:%s,height:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    public FaceFlashActionPreviewLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.f137077r = new com.tencent.mm.plugin.flash.d0(getContext());
        this.f137078s = (com.tencent.mm.plugin.flash.action.FaceFlashActionUI) getContext();
        this.f137079t = new com.tencent.mm.plugin.flash.r();
        android.content.Context context2 = getContext();
        this.f137080u = context2;
        this.f137082w = new tz2.j();
        this.f137083x = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE;
        this.f137085y = new android.view.animation.TranslateAnimation(0.0f, -i65.a.B(getContext()), 0.0f, 0.0f);
        this.f137087z = new android.view.animation.TranslateAnimation(i65.a.B(getContext()), 0.0f, 0.0f, 0.0f);
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = 0;
        this.E = 0;
        this.F = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_face_action_new_ui_copy_data, true);
        this.I = 2;
        this.f137064J = 0.0f;
        this.K = 0L;
        this.L = false;
        this.M = 1;
        this.P = false;
        this.Q = 8388608L;
        this.R = "";
        this.S = "";
        this.T = "";
        this.U = 0.0f;
        this.V = "";
        this.W = 0.0f;
        this.f137075p0 = tz2.l.f423303e;
        this.f137086y0 = new com.tencent.mm.plugin.flash.action.m(this, 25000L, 50000L);
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488749aa4, (android.view.ViewGroup) this, true);
        this.f137066e = (com.tencent.mm.plugin.flash.view.FaceReflectMask) findViewById(com.tencent.mm.R.id.f485009g82);
        this.f137068g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.g89);
        this.f137069h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.g88);
        this.f137071m = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.dme);
        this.f137072n = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.dnv);
        this.f137073o = (com.tencent.mm.plugin.flash.view.FaceNumberLayout) findViewById(com.tencent.mm.R.id.g7x);
        this.f137074p = findViewById(com.tencent.mm.R.id.g7u);
        this.f137067f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.g8_);
        android.content.Intent intent = ((android.app.Activity) getContext()).getIntent();
        if (intent == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "intent == null");
            db5.e1.y(context2, com.tencent.mm.sdk.platformtools.t8.K0("") ? context2.getString(com.tencent.mm.R.string.c7q) : "", "", context2.getString(com.tencent.mm.R.string.c7p), new com.tencent.mm.plugin.flash.action.f(this, 90013, "init data failed"));
            return;
        }
        int intExtra = intent.getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        java.lang.String stringExtra = intent.getStringExtra("package");
        java.lang.String stringExtra2 = intent.getStringExtra("packageSign");
        java.lang.String stringExtra3 = intent.getStringExtra("faceVerifyTitle");
        boolean booleanExtra = intent.getBooleanExtra("useHttp", false);
        tz2.t.f423325a = false;
        tz2.t.f423326b = false;
        tz2.t.f423327c = "";
        tz2.t.f423328d = null;
        tz2.t.f423329e = null;
        if (booleanExtra) {
            com.tencent.mars.cdn.CronetLogic.CronetRequestParams cronetRequestParams = new com.tencent.mars.cdn.CronetLogic.CronetRequestParams();
            cronetRequestParams.taskType = 1;
            cronetRequestParams.url = "https://payapp.wechatpay.cn/faceplat/getfacechecklivetype";
            cronetRequestParams.method = "POST";
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("user-agent", ik1.l0.a(com.tencent.mm.sdk.platformtools.x2.f193071a, "", (ik1.k0) nd.f.a(ik1.k0.class)));
            hashMap.put("Accept-Encoding", "gzip,compress,br,deflate");
            hashMap.put("charset", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            cronetRequestParams.makeRequestHeader(hashMap);
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(intExtra));
            hashMap2.put("package", stringExtra);
            cronetRequestParams.bodyData = new org.json.JSONObject(hashMap2).toString().getBytes();
            com.tencent.mars.cdn.CronetLogic.CronetHttpsCreateResult startCronetHttpTask = com.tencent.mars.cdn.CronetLogic.startCronetHttpTask(cronetRequestParams, new com.tencent.mm.plugin.flash.action.h(this));
            this.f137084x0 = new com.tencent.mm.plugin.flash.action.j(this, startCronetHttpTask);
            if (startCronetHttpTask != null) {
                if (startCronetHttpTask.createRet != 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "GetFaceCheckLiveType use http request, CronetLogic startCronetHttpTask fail!");
                    ku5.u0 u0Var = ku5.t0.f312615d;
                    com.tencent.mm.plugin.flash.action.k kVar = new com.tencent.mm.plugin.flash.action.k(this);
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    t0Var.z(kVar, 1000L, false);
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "GetFaceCheckLiveType use http request, CronetLogic startCronetHttpTask success!");
                ((ku5.t0) ku5.t0.f312615d).k(this.f137084x0, androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS);
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashActionPreviewLayout", "GetFaceCheckLiveType use http request, CronetHttpsCreateResult is null!");
            ku5.u0 u0Var2 = ku5.t0.f312615d;
            com.tencent.mm.plugin.flash.action.l lVar = new com.tencent.mm.plugin.flash.action.l(this);
            ku5.t0 t0Var2 = (ku5.t0) u0Var2;
            t0Var2.getClass();
            t0Var2.z(lVar, 1000L, false);
            return;
        }
        j72.b bVar = new j72.b(intExtra, stringExtra, stringExtra2, stringExtra3);
        gm0.j1.d().a(5965, this);
        gm0.j1.d().g(bVar);
    }
}
