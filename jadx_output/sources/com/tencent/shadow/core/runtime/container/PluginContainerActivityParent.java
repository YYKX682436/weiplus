package com.tencent.shadow.core.runtime.container;

/* loaded from: classes7.dex */
public class PluginContainerActivityParent extends com.tencent.mm.ui.vas.VASActivity {
    private static final java.lang.String TAG = "WVA.PluginContainerActivityParent";
    private volatile android.widget.FrameLayout mContentView;
    private final java.lang.Object mLock = new java.lang.Object();
    private int mForceOrientation = -1;

    private android.widget.FrameLayout createContentViewIfNeeded() {
        android.widget.FrameLayout frameLayout;
        if (this.mContentView != null) {
            return this.mContentView;
        }
        synchronized (this.mLock) {
            if (this.mContentView == null) {
                this.mContentView = new android.widget.FrameLayout(this);
            }
            frameLayout = this.mContentView;
        }
        return frameLayout;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return this.mForceOrientation;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    /* renamed from: isSupportNavigationSwipeBack */
    public boolean getF65848t() {
        return false;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str = "VAS.onCreate: " + this + "; " + getWindow().getCallback();
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i(TAG, str, null);
        super.onCreate(bundle);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public android.view.View provideCustomActivityContentView() {
        return createContentViewIfNeeded();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i(TAG, "VAS.setContentView: " + this, null);
        this.mContentView.removeAllViews();
        this.mContentView.addView(view, layoutParams);
    }

    public void setForceOrientation(int i17) {
        this.mForceOrientation = i17;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setMMOrientation() {
        java.lang.String str = "VAS.setMMOrientation: " + getForceOrientation();
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i(TAG, str, null);
        super.setMMOrientation();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMFragmentActivity, android.app.Activity
    public void setRequestedOrientation(int i17) {
        pa1.t tVar;
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i(TAG, "VAS.setRequestedOrientation: " + i17, null);
        setForceOrientation(i17);
        com.tencent.mm.plugin.appbrand.o6 o6Var = com.tencent.mm.minigame.f0.f69069b;
        if (o6Var == null || o6Var.L0() || o6Var.S) {
            com.tencent.mars.xlog.Log.w("WVA.WVAActivityDelegate", "getRenderer but runtime is finishing");
            tVar = null;
        } else {
            com.tencent.mm.plugin.appbrand.page.n7 N2 = o6Var.N2();
            kotlin.jvm.internal.o.e(N2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.game.page.WAGamePageView");
            tVar = ((pa1.o) N2).o4();
        }
        if (tVar == null) {
            com.tencent.mars.xlog.Log.w("WVA.WVAActivityDelegate", "requestOrientationByAppBrand getRenderer is null");
            return;
        }
        ni1.e eVar = (ni1.e) tVar.r(ni1.e.class);
        xi1.o e17 = xi1.o.e(i17);
        if (eVar != null) {
            eVar.f(e17.name());
        }
        if (eVar != null) {
            eVar.d(null);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View view) {
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i(TAG, "VAS.setContentView: " + this, null);
        setContentView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
    }
}
