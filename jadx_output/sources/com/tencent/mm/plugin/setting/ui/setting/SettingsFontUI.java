package com.tencent.mm.plugin.setting.ui.setting;

@db5.a(17)
/* loaded from: classes5.dex */
public class SettingsFontUI extends com.tencent.mm.ui.vas.VASActivity {

    /* renamed from: d, reason: collision with root package name */
    public int f160385d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f160386e = 2;

    /* renamed from: f, reason: collision with root package name */
    public int f160387f = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f480241sa);

    /* renamed from: g, reason: collision with root package name */
    public float f160388g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f160389h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f160390i = 1.0f;

    /* renamed from: m, reason: collision with root package name */
    public int f160391m;

    public static void U6(com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI settingsFontUI, android.widget.ImageView imageView, int i17) {
        settingsFontUI.getClass();
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) imageView.getLayoutParams();
        float g17 = j65.f.g() / f14.e.c(i17);
        if (layoutParams != null) {
            layoutParams.width = (int) (i65.a.f(settingsFontUI.getContext(), com.tencent.mm.R.dimen.f479916iv) * g17);
            layoutParams.height = (int) (i65.a.f(settingsFontUI.getContext(), com.tencent.mm.R.dimen.f479916iv) * g17);
            imageView.setLayoutParams(layoutParams);
        }
    }

    public static float V6(android.content.Context context) {
        float n17 = i65.a.n(context);
        i65.a.x(context);
        if (n17 == 1.0f || n17 == i65.a.y(context) || n17 == i65.a.w(context) || n17 == i65.a.z(context) || n17 == i65.a.s(context) || n17 == i65.a.t(context) || n17 == i65.a.u(context) || n17 == i65.a.v(context)) {
            return n17;
        }
        i65.a.x(context);
        return 1.0f;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEvent(keyEvent);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11609, java.lang.Integer.valueOf(this.f160385d), java.lang.Integer.valueOf(this.f160386e), 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsFontUI", "choose font size kvReport logID:%s , changeFontSize: %s, curFontSize:%s", 11609, java.lang.Integer.valueOf(this.f160385d), java.lang.Integer.valueOf(this.f160386e));
        finish();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.clg;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.izv);
        float V6 = V6(getContext());
        this.f160388g = V6;
        this.f160389h = V6;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsFontUI", "fontSizeBefore=" + this.f160388g);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f483644bk3);
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.a_5);
        android.widget.ImageView imageView3 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.a_6);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) findViewById(com.tencent.mm.R.id.mpo);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2 = (com.tencent.mm.ui.widget.MMNeat7extView) findViewById(com.tencent.mm.R.id.mpm);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView3 = (com.tencent.mm.ui.widget.MMNeat7extView) findViewById(com.tencent.mm.R.id.mpn);
        if (gm0.j1.a()) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, c01.z1.r(), null);
        }
        int f17 = (int) (i65.a.f(getContext(), com.tencent.mm.R.dimen.f480241sa) / j65.f.f297943g);
        this.f160387f = f17;
        mMNeat7extView2.setMaxWidth(f17);
        mMNeat7extView3.setMaxWidth(this.f160387f);
        com.tencent.mm.plugin.setting.ui.widget.FontSelectorView fontSelectorView = (com.tencent.mm.plugin.setting.ui.widget.FontSelectorView) findViewById(com.tencent.mm.R.id.gbg);
        float V62 = V6(getContext());
        if (V62 != f14.e.a(getContext())) {
            f14.e.e(getContext(), V62);
        }
        if (V62 < i65.a.y(getContext()) || V62 > i65.a.v(getContext())) {
            V62 = i65.a.y(getContext());
        }
        fontSelectorView.setSliderIndex(V62 == i65.a.y(getContext()) ? 0 : V62 == i65.a.w(getContext()) ? 2 : V62 == i65.a.z(getContext()) ? 3 : V62 == i65.a.s(getContext()) ? 4 : V62 == i65.a.t(getContext()) ? 5 : V62 == i65.a.u(getContext()) ? 6 : V62 == i65.a.v(getContext()) ? 7 : 1);
        fontSelectorView.setOnChangeListener(new com.tencent.mm.plugin.setting.ui.setting.wb(this, mMNeat7extView, mMNeat7extView2, mMNeat7extView3, imageView, imageView2, imageView3));
        this.f160386e = i65.a.o(getContext());
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.xb(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.plugin.setting.ui.setting.yb(this), null, com.tencent.mm.ui.fb.GREEN);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getAction() != 1) {
            return super.onKeyDown(i17, keyEvent);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11609, java.lang.Integer.valueOf(this.f160385d), java.lang.Integer.valueOf(this.f160386e), 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsFontUI", "choose font size kvReport logID:%s , changeFontSize: %s, curFontSize:%s", 11609, java.lang.Integer.valueOf(this.f160385d), java.lang.Integer.valueOf(this.f160386e));
        finish();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(n14.e.class);
    }
}
