package com.tencent.mm.ui.fluent;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/fluent/ViewFluentTransparentActivity;", "Landroid/app/Activity;", "<init>", "()V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes3.dex */
public abstract class ViewFluentTransparentActivity extends com.tencent.mm.hellhoundlib.activities.HellActivity {

    /* renamed from: d, reason: collision with root package name */
    public boolean f208609d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f208610e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f208611f = new ug5.y(this);

    /* renamed from: g, reason: collision with root package name */
    public final ug5.z f208612g = new ug5.z(this);

    public abstract boolean K6(android.app.Activity activity);

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        java.lang.ref.WeakReference weakReference = this.f208610e;
        ug5.v vVar = weakReference != null ? (ug5.v) weakReference.get() : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBackPressed isNeedFinishWhenResume: ");
        sb6.append(this.f208609d);
        sb6.append(" isCompleted: ");
        sb6.append(vVar != null ? java.lang.Boolean.valueOf(vVar.f427662e) : null);
        com.tencent.mars.xlog.Log.i("ViewFluentTransparentActivity", sb6.toString());
        if (this.f208609d) {
            return;
        }
        boolean z17 = false;
        if (vVar != null && !vVar.f427662e) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        finish();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.tencent.mars.xlog.Log.i("ViewFluentTransparentActivity", "[onConfigurationChanged] orientation=" + newConfig.orientation);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        overridePendingTransition(0, 0);
        android.view.Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(1024);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        super.onCreate(bundle);
        android.view.Window window2 = getWindow();
        kotlin.jvm.internal.o.f(window2, "getWindow(...)");
        ug5.x.f(window2);
        com.tencent.mars.xlog.Log.i("ViewFluentTransparentActivity", "onCreate hashCode: " + hashCode());
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.app.Application application = context instanceof android.app.Application ? (android.app.Application) context : null;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(this.f208612g);
        }
        this.f208610e = new java.lang.ref.WeakReference(ug5.v.f427655g.b(this));
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("ViewFluentTransparentActivity", "onDestroy hashCode: " + hashCode());
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.app.Application application = context instanceof android.app.Application ? (android.app.Application) context : null;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.f208612g);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        com.tencent.mars.xlog.Log.i("ViewFluentTransparentActivity", "[onNewIntent]");
        this.f208609d = false;
        if (intent != null) {
            getIntent().putExtras(intent);
        }
        ug5.v b17 = ug5.v.f427655g.b(this);
        this.f208610e = new java.lang.ref.WeakReference(b17);
        if (b17 == null) {
            finish();
        }
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.tencent.mars.xlog.Log.i("ViewFluentTransparentActivity", "[onWindowFocusChanged] hasFocus=" + z17 + " isNeedFinishWhenResume=" + this.f208609d);
        if (z17 && this.f208609d) {
            finish();
        } else {
            if (z17) {
                return;
            }
            this.f208609d = true;
        }
    }
}
