package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderHomeAnimUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FinderHomeAnimUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: e, reason: collision with root package name */
    public static android.graphics.Bitmap f128581e;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f128582d = new com.tencent.mm.plugin.finder.ui.u6(this);

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mars.xlog.Log.i("FinderHomeAnimUI", "finish");
        int intExtra = getIntent().getIntExtra("KEY_ROUTER_LAUNCHER", -1);
        boolean z17 = true;
        if (intExtra == 1) {
            com.tencent.mars.xlog.Log.i("FinderHomeAnimUI", "routeToFindPage");
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            intent.addFlags(268435456);
            intent.putExtra("preferred_tab", 2);
            j45.l.u(this, ".ui.LauncherUI", intent, null);
            overridePendingTransition(com.tencent.mm.R.anim.f477880e4, com.tencent.mm.R.anim.f477889ed);
        } else if (intExtra != 2) {
            super.finish();
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderHomeAnimUI", "routeToMainPage");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.addFlags(67108864);
            intent2.putExtra("preferred_tab", 0);
            j45.l.u(this, ".ui.LauncherUI", intent2, null);
            overridePendingTransition(com.tencent.mm.R.anim.f477880e4, com.tencent.mm.R.anim.f477889ed);
        }
        if (z17) {
            pm0.v.V(0L, new com.tencent.mm.plugin.finder.ui.t6(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public void initActivityCloseAnimation() {
        if (com.tencent.mm.ui.bk.y()) {
            overridePendingTransition(0, 0);
        } else {
            overridePendingTransition(com.tencent.mm.R.anim.f477880e4, com.tencent.mm.R.anim.f477889ed);
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public void initActivityOpenAnimation(android.content.Intent intent) {
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean initNavigationSwipeBack() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean isSupportNavigationSwipeBack() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean needResetStatusBarColorOnActivityCreate() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean noActionBar() {
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("FinderHomeAnimUI", "onCreate");
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | 256);
        getWindow().setStatusBarColor(0);
        com.tencent.mm.ui.r0.a(this, false);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.w(new android.graphics.drawable.ColorDrawable(0));
            supportActionBar.o();
        }
        if (f128581e == null) {
            com.tencent.mars.xlog.Log.e("FinderHomeAnimUI", "onCreate: finderHomeSnapshot is null");
            finish();
            return;
        }
        android.view.View contentView = getContentView();
        contentView.setBackground(new android.graphics.drawable.BitmapDrawable(contentView.getResources(), f128581e));
        contentView.setWillNotDraw(false);
        android.view.View contentView2 = getContentView();
        kotlin.jvm.internal.o.f(contentView2, "getContentView(...)");
        contentView2.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.finder.ui.v6(contentView2, this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        setTheme(com.tencent.mm.R.style.f494207h2);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("FinderHomeAnimUI", "onDestroy");
        super.onDestroy();
        getContentView().removeCallbacks(this.f128582d);
        getContentView().setBackground(null);
        f128581e = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity
    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        com.tencent.mars.xlog.Log.i("FinderHomeAnimUI", "onEnterAnimationComplete");
        finish();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean supportNavigationSwipeBack() {
        return false;
    }
}
