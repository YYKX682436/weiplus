package com.tencent.wxa.ui;

/* loaded from: classes15.dex */
public class WxaFlutterActivity extends androidx.appcompat.app.AppCompatActivity implements ox5.l, mx5.b {

    /* renamed from: d, reason: collision with root package name */
    public androidx.appcompat.widget.Toolbar f220182d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f220183e;

    /* renamed from: f, reason: collision with root package name */
    public ox5.a f220184f;

    /* renamed from: g, reason: collision with root package name */
    public int f220185g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.b0 f220186h = new androidx.lifecycle.b0(this, true);

    static {
        io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque.name();
    }

    @Override // io.flutter.embedding.android.FlutterEngineConfigurator
    public void cleanUpFlutterEngine(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
    }

    @Override // io.flutter.embedding.android.FlutterEngineConfigurator
    public void configureFlutterEngine(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
    }

    @Override // ox5.l
    /* renamed from: getActivity */
    public android.app.Activity m42getActivity() {
        return this;
    }

    @Override // ox5.l
    public java.lang.String getAppBundlePath() {
        java.lang.String dataString;
        if (((getApplicationInfo().flags & 2) != 0) && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    @Override // ox5.l
    public java.lang.String getCachedEngineId() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    @Override // ox5.l
    public android.content.Context getContext() {
        return this;
    }

    @Override // ox5.l
    public java.lang.String getDartEntrypointFunctionName() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            android.os.Bundle bundle = getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
            java.lang.String string = bundle != null ? bundle.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;
        }
    }

    @Override // ox5.l
    public mx5.b getFlutterActivity() {
        return this;
    }

    @Override // mx5.b
    /* renamed from: getFlutterEngineId */
    public int getF45967f() {
        return this.f220185g;
    }

    @Override // mx5.b
    public java.lang.String getFlutterViewId() {
        if (getIntent().hasExtra("activityId") && !android.text.TextUtils.isEmpty(getIntent().getStringExtra("activityId"))) {
            return getIntent().getStringExtra("activityId");
        }
        if (android.text.TextUtils.isEmpty(this.f220183e)) {
            this.f220183e = java.lang.String.format("%d-%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(hashCode()));
        }
        return this.f220183e;
    }

    @Override // mx5.b
    public java.lang.String getFlutterViewName() {
        return getIntent().hasExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME) ? getIntent().getStringExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME) : "";
    }

    @Override // mx5.b
    /* renamed from: getFlutterViewParams */
    public java.util.Map getE() {
        if (!getIntent().hasExtra("params")) {
            return null;
        }
        getIntent().getSerializableExtra("params");
        return null;
    }

    @Override // ox5.l
    public java.lang.String getInitialRoute() {
        if (getIntent().hasExtra("initial_route")) {
            return getIntent().getStringExtra("initial_route");
        }
        try {
            android.os.Bundle bundle = getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
            java.lang.String string = bundle != null ? bundle.getString("io.flutter.InitialRoute") : null;
            return string != null ? string : "/";
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return "/";
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f220186h;
    }

    @Override // ox5.l
    public io.flutter.embedding.android.RenderMode getRenderMode() {
        return (getIntent().hasExtra("background_mode") ? io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.valueOf(getIntent().getStringExtra("background_mode")) : io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque) == io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque ? io.flutter.embedding.android.RenderMode.surface : io.flutter.embedding.android.RenderMode.texture;
    }

    @Override // ox5.l
    public io.flutter.embedding.android.TransparencyMode getTransparencyMode() {
        return (getIntent().hasExtra("background_mode") ? io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.valueOf(getIntent().getStringExtra("background_mode")) : io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque) == io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.opaque ? io.flutter.embedding.android.TransparencyMode.opaque : io.flutter.embedding.android.TransparencyMode.transparent;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        this.f220184f.c(i17, i18, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f220184f.d(true, false);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        try {
            android.os.Bundle bundle2 = getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
            if (bundle2 != null) {
                int i17 = bundle2.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i17 != -1) {
                    setTheme(i17);
                }
            } else {
                nx5.c.a("FlutterActivity", "Using the launch theme as normal theme.", new java.lang.Object[0]);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            nx5.c.b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.", new java.lang.Object[0]);
        }
        super.onCreate(bundle);
        this.f220186h.f(androidx.lifecycle.m.ON_CREATE);
        ox5.a aVar = new ox5.a(this, 0, null);
        this.f220184f = aVar;
        this.f220185g = aVar.f349792a;
        aVar.e();
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this);
        linearLayout.setOrientation(1);
        androidx.appcompat.widget.Toolbar toolbar = new androidx.appcompat.widget.Toolbar(this, null);
        toolbar.setLayoutParams(new androidx.appcompat.widget.Toolbar.LayoutParams(-1, -2));
        if (toolbar.f9497z == null) {
            toolbar.f9497z = new androidx.appcompat.widget.q1();
        }
        androidx.appcompat.widget.q1 q1Var = toolbar.f9497z;
        q1Var.f9691h = false;
        q1Var.f9688e = 0;
        q1Var.f9684a = 0;
        q1Var.f9689f = 0;
        q1Var.f9685b = 0;
        toolbar.setVisibility(8);
        this.f220182d = toolbar;
        linearLayout.addView(toolbar);
        setSupportActionBar(this.f220182d);
        linearLayout.addView(this.f220184f.f(null, null, null), new android.widget.LinearLayout.LayoutParams(-1, -1));
        setContentView(linearLayout);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f220184f.g(false);
        this.f220186h.f(androidx.lifecycle.m.ON_DESTROY);
    }

    @Override // ox5.l
    public void onFlutterUiDisplayed() {
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        this.f220184f.h(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f220184f.i();
        this.f220186h.f(androidx.lifecycle.m.ON_PAUSE);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f220184f.j();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        this.f220184f.k(i17, strArr, iArr);
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f220186h.f(androidx.lifecycle.m.ON_RESUME);
        this.f220184f.l();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f220186h.f(androidx.lifecycle.m.ON_START);
        this.f220184f.m();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f220184f.n();
        this.f220186h.f(androidx.lifecycle.m.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        this.f220184f.o(i17);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onUserLeaveHint() {
        this.f220184f.p();
    }

    @Override // ox5.l
    public io.flutter.plugin.platform.PlatformPlugin providePlatformPlugin(android.app.Activity activity, io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        return null;
    }

    @Override // ox5.l
    public boolean shouldAttachEngineToActivity() {
        return true;
    }
}
