package wc3;

/* loaded from: classes7.dex */
public class b extends lc3.e implements jc3.g0, jc3.u {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f444506d = kz5.p1.d(new yc3.c(), new yc3.b(), new vd3.d(), new vd3.f(), new ce3.a("MagicBrushDemo"));

    /* renamed from: e, reason: collision with root package name */
    public jc3.j0 f444507e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f444508f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Activity f444509g;

    @Override // lc3.e
    public android.app.Activity B0() {
        android.app.Activity activity = this.f444509g;
        if (activity != null) {
            return activity;
        }
        kotlin.jvm.internal.o.o("activityContext");
        throw null;
    }

    public final void C0(android.app.Activity context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MagicBrushDemoLogic", "start");
        this.f444509g = context;
        if (this instanceof wc3.d) {
            com.tencent.mars.xlog.Log.i("MagicBrushDemoLogic", "publicServiceLogic");
        } else {
            com.tencent.mars.xlog.Log.i("MagicBrushDemoLogic", "magicBrushLogic");
        }
        jc3.j0 wi6 = ((com.tencent.mm.plugin.magicbrush.b6) ((com.tencent.mm.plugin.magicbrush.p4) i95.n0.c(com.tencent.mm.plugin.magicbrush.p4.class))).wi("MagicBrushDemo");
        rc3.w0 w0Var = (rc3.w0) wi6;
        w0Var.w(this);
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = new com.tencent.mm.plugin.magicbrush.MBBuildConfig(null, null, null, null, false, false, false, null, false, null, 1023, null);
        mBBuildConfig.f147834x = this;
        mBBuildConfig.f147828r = this;
        mBBuildConfig.a(this.f444506d);
        w0Var.W(mBBuildConfig);
        com.tencent.mars.xlog.Log.i("MagicBrushDemoLogic", "MagicBrush setUp");
        this.f444507e = wi6;
    }

    @Override // jc3.g0
    public void Me(int i17, android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MagicBrushDemoLogic", "onCanvasViewCreated canvasId:" + i17);
        android.view.ViewGroup viewGroup = this.f444508f;
        if (viewGroup != null) {
            viewGroup.addView(view);
        } else {
            kotlin.jvm.internal.o.o("containerView");
            throw null;
        }
    }

    @Override // jc3.g0
    public void P8(int i17, android.view.View view, int i18, int i19, int i27, int i28) {
        kotlin.jvm.internal.o.g(view, "view");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = i27;
        marginLayoutParams.height = i28;
        marginLayoutParams.topMargin = i19;
        marginLayoutParams.leftMargin = i18;
        view.setLayoutParams(marginLayoutParams);
    }

    @Override // jc3.u
    public void Q9(java.lang.String envId, java.lang.String msg) {
        kotlin.jvm.internal.o.g(envId, "envId");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.e("MagicBrushDemoLogic", "onJSException msg:".concat(msg));
    }

    @Override // jc3.g0
    public void Zf(int i17, android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MagicBrushDemoLogic", "onCanvasViewDestroy canvasId:" + i17);
        android.view.ViewGroup viewGroup = this.f444508f;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        } else {
            kotlin.jvm.internal.o.o("containerView");
            throw null;
        }
    }

    @Override // jc3.u
    public void b1() {
        com.tencent.mars.xlog.Log.e("MagicBrushDemoLogic", "onConnException");
    }

    @Override // jc3.g0
    public void c(int i17, boolean z17) {
    }

    public void destroy() {
        jc3.j0 j0Var = this.f444507e;
        if (j0Var == null) {
            kotlin.jvm.internal.o.o("magicBrush");
            throw null;
        }
        ((rc3.w0) j0Var).destroy();
        android.view.ViewGroup viewGroup = this.f444508f;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        } else {
            kotlin.jvm.internal.o.o("containerView");
            throw null;
        }
    }

    @Override // jc3.u
    public void n() {
        com.tencent.mars.xlog.Log.i("MagicBrushDemoLogic", "onMainScriptInjected");
        jc3.j0 j0Var = this.f444507e;
        if (j0Var == null) {
            kotlin.jvm.internal.o.o("magicBrush");
            throw null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("width", i65.a.B(com.tencent.mm.sdk.platformtools.x2.f193071a));
        jSONObject.put("height", i65.a.k(com.tencent.mm.sdk.platformtools.x2.f193071a));
        jSONObject.put("top", 0);
        jSONObject.put("left", 0);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        ((rc3.w0) j0Var).k("createCanvas", jSONObject2);
    }

    @Override // jc3.u
    public void onCreated() {
        com.tencent.mars.xlog.Log.i("MagicBrushDemoLogic", "onCreated");
        jc3.j0 j0Var = this.f444507e;
        if (j0Var != null) {
            ((rc3.w0) j0Var).start();
        } else {
            kotlin.jvm.internal.o.o("magicBrush");
            throw null;
        }
    }

    @Override // jc3.u
    public void onDestroy(int i17) {
    }

    @Override // jc3.u
    public void onPause() {
    }

    @Override // jc3.u
    public void onResume() {
    }
}
