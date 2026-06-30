package com.tencent.mm.plugin.setting.ui.setting;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingFingerprintVerifyUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes14.dex */
public final class SettingFingerprintVerifyUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public boolean f160215d;

    /* renamed from: e, reason: collision with root package name */
    public final wd0.b2 f160216e = new wd0.b2(new du5.c(), new com.tencent.mm.plugin.setting.ui.setting.q3(this), "prefilled challenge");

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f160217f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f160218g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f160219h;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.enf;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        setBackBtnVisible(true);
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.r3(this), com.tencent.mm.R.raw.actionbar_icon_dark_back);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.odf);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f160217f = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.t3a);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f160218g = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.g5z);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f160219h = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById3;
        android.widget.TextView textView = this.f160217f;
        if (textView == null) {
            kotlin.jvm.internal.o.o("verifyTitleTv");
            throw null;
        }
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        if (((vc.s) ((wc.o) i95.n0.c(wc.o.class))).wi() == 2) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f160219h;
            if (weImageView == null) {
                kotlin.jvm.internal.o.o("verifyIcon");
                throw null;
            }
            weImageView.setVisibility(4);
        } else {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f160219h;
            if (weImageView2 == null) {
                kotlin.jvm.internal.o.o("verifyIcon");
                throw null;
            }
            weImageView2.setVisibility(0);
        }
        wd0.j1 j1Var = (wd0.j1) i95.n0.c(wd0.j1.class);
        kotlinx.coroutines.y0 b17 = v65.m.b(this);
        android.content.Context applicationContext = getApplicationContext();
        kotlin.jvm.internal.o.f(applicationContext, "getApplicationContext(...)");
        ((vd0.v1) j1Var).Vi(b17, applicationContext, this.f160216e, new com.tencent.mm.plugin.setting.ui.setting.u3(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).getClass();
        ju5.n.c().b();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (i17 == 4) {
            return false;
        }
        return super.onKeyDown(i17, event);
    }
}
