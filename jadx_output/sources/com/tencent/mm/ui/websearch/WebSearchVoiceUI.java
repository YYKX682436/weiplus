package com.tencent.mm.ui.websearch;

@db5.a(7)
/* loaded from: classes14.dex */
public class WebSearchVoiceUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.websearch.m f211224d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f211225e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f211226f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f211227g;

    /* renamed from: h, reason: collision with root package name */
    public int f211228h;

    /* renamed from: i, reason: collision with root package name */
    public int f211229i;

    /* renamed from: m, reason: collision with root package name */
    public vj5.h f211230m = null;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d9o;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getStatusBarColor() {
        return getResources().getColor(com.tencent.mm.R.color.aac);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean initNavigationSwipeBack() {
        boolean initNavigationSwipeBack = super.initNavigationSwipeBack();
        if (!getF65848t()) {
            vj5.a.a(getContentView(), getStatusBarColor(), true);
        }
        return initNavigationSwipeBack;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity
    public void initSwipeBack() {
        super.initSwipeBack();
        if (getSwipeBackLayout() != null && getSwipeBackLayout().getChildCount() > 0) {
            android.view.View childAt = getSwipeBackLayout().getChildAt(0);
            getSwipeBackLayout().removeView(childAt);
            vj5.h hVar = new vj5.h(this);
            this.f211230m = hVar;
            hVar.addView(childAt, new android.widget.FrameLayout.LayoutParams(-1, -1));
            getSwipeBackLayout().addView(this.f211230m);
            getSwipeBackLayout().setContentView(this.f211230m);
        }
        vj5.a.a(getContentView(), getStatusBarColor(), true);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setBackBtnColorFilter(com.tencent.mm.R.color.BW_0);
        setMMTitleColor(-16777216);
        if (getSupportActionBar() != null) {
            getSupportActionBar().j().setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.aac));
            getSupportActionBar().w(new android.graphics.drawable.ColorDrawable(getResources().getColor(com.tencent.mm.R.color.aac)));
        }
        setBackBtn(new zk5.b(this));
        if (getIntent() != null) {
            this.f211226f = getIntent().getStringExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            this.f211227g = getIntent().getStringExtra("subSessionId");
            this.f211228h = getIntent().getIntExtra("key_scene", -1);
            this.f211229i = getIntent().getIntExtra("key_is_nav_voice", 0);
        }
        this.f211225e = findViewById(com.tencent.mm.R.id.p7f);
        this.mController.J();
        if (this.f211224d == null) {
            com.tencent.mm.pluginsdk.ui.websearch.m mVar = new com.tencent.mm.pluginsdk.ui.websearch.m(getContext(), false, null);
            this.f211224d = mVar;
            mVar.setCallback(new zk5.c(this));
        }
        this.f211224d.d();
        com.tencent.mm.pluginsdk.ui.websearch.m mVar2 = this.f211224d;
        if (mVar2.F) {
            mVar2.F = false;
            android.view.View findViewById = mVar2.findViewById(com.tencent.mm.R.id.p5q);
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            int i17 = mVar2.E;
            if (layoutParams == null) {
                layoutParams = new android.widget.LinearLayout.LayoutParams(-1, i17);
            }
            layoutParams.height = i17;
            findViewById.setLayoutParams(layoutParams);
            mVar2.f();
            mVar2.requestLayout();
        }
        this.f211224d.setVisibility(0);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        ((android.view.ViewGroup) findViewById(com.tencent.mm.R.id.m7g)).addView(this.f211224d, layoutParams2);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15178, 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "", this.f211226f, this.f211227g, java.lang.Integer.valueOf(this.f211228h), java.lang.Integer.valueOf(this.f211229i));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.pluginsdk.ui.websearch.m mVar = this.f211224d;
        if (mVar != null) {
            mVar.c();
        }
    }
}
