package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class TestVideoEditUI extends com.tencent.mm.ui.MMActivity implements qk.i6 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f149257e = 0;

    /* renamed from: d, reason: collision with root package name */
    public qk.o9 f149258d;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cyi;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, qk.i6
    public void m5() {
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f149258d.e()) {
            return;
        }
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        fullScreenNoTitleBar(true);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.cgi);
        ((wb0.e) ((xb0.e) i95.n0.c(xb0.e.class))).getClass();
        rj.l lVar = new rj.l();
        this.f149258d = lVar;
        qk.l9 l9Var = new qk.l9();
        l9Var.f364232b = false;
        l9Var.f364233c = true;
        l9Var.f364236f = new android.graphics.Rect(0, 0, 1080, 1080);
        l9Var.f364231a = qk.n9.VIDEO;
        lVar.d(l9Var);
        qk.s c17 = this.f149258d.c(getContext());
        c17.setActionBarCallback(this);
        frameLayout.addView(c17, new android.widget.FrameLayout.LayoutParams(-1, -1));
        c17.setSelectedFeatureListener(new com.tencent.mm.plugin.mmsight.ui.v3(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f149258d.f();
    }

    @Override // qk.i6
    public void onFinish() {
        this.f149258d.g(new com.tencent.mm.plugin.mmsight.ui.w3(this), true);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        super.onSwipeBack();
    }
}
