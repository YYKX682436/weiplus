package com.tencent.mm.plugin.setting.ui.setting;

@db5.a(19)
/* loaded from: classes11.dex */
public class FakeSwitchAccountUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f160141p = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView f160142d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f160143e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f160144f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f160145g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f160146h;

    /* renamed from: i, reason: collision with root package name */
    public int f160147i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f160148m;

    /* renamed from: n, reason: collision with root package name */
    public int f160149n;

    /* renamed from: o, reason: collision with root package name */
    public float f160150o;

    public static void T6(com.tencent.mm.plugin.setting.ui.setting.FakeSwitchAccountUI fakeSwitchAccountUI) {
        fakeSwitchAccountUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FakeSwitchAccountUI", "jump to launcher");
        fakeSwitchAccountUI.f160146h.d();
        try {
            android.graphics.Bitmap b07 = com.tencent.mm.sdk.platformtools.x.b0(fakeSwitchAccountUI.getBodyView());
            java.lang.String str = com.tencent.mm.ui.p2.f209490a;
            com.tencent.mm.vfs.w6.h(str);
            if (b07 != null) {
                com.tencent.mm.sdk.platformtools.x.D0(b07, 80, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.FakeSwitchAccountUI", "getBitmap from AccountGrid null!");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FakeSwitchAccountUI", "getBitmap from AccountGrid failed! %s", e17.getMessage());
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(fakeSwitchAccountUI, "com.tencent.mm.ui.LauncherUI");
        intent.addFlags(268468224);
        intent.putExtra("LauncherUI.jump_switch_account", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(fakeSwitchAccountUI, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/FakeSwitchAccountUI", "jumpToLauncher", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        fakeSwitchAccountUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(fakeSwitchAccountUI, "com/tencent/mm/plugin/setting/ui/setting/FakeSwitchAccountUI", "jumpToLauncher", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        fakeSwitchAccountUI.finish();
        db5.f.h(fakeSwitchAccountUI);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489454cm3;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.a48));
        setBackBtnVisible(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.FakeSwitchAccountUI", "FakeSwitchAccount onCreate");
        this.f160143e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nt9);
        com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView switchAccountGridView = (com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView) findViewById(com.tencent.mm.R.id.nt7);
        this.f160142d = switchAccountGridView;
        switchAccountGridView.setClickable(false);
        this.f160147i = getIntent().getIntExtra("key_mm_process_pid", 0);
        this.f160144f = getIntent().getStringExtra("key_switch_from_wx_username");
        com.tencent.mars.xlog.Log.i("MicroMsg.FakeSwitchAccountUI", "title %s", getResources().getString(com.tencent.mm.R.string.f493093iz5));
        this.f160143e.setText(getResources().getString(com.tencent.mm.R.string.f493093iz5));
        java.util.ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("key_switch_account_users");
        java.util.Map map = this.f160145g;
        if (parcelableArrayListExtra != null) {
            java.util.Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.setting.model.SwitchAccountModel switchAccountModel = (com.tencent.mm.plugin.setting.model.SwitchAccountModel) it.next();
                ((java.util.HashMap) map).put(switchAccountModel.f160047d, switchAccountModel);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FakeSwitchAccountUI", "account count %d", java.lang.Integer.valueOf(((java.util.HashMap) map).size()));
        this.f160142d.setUseSystemDecoder(true);
        this.f160142d.a(map);
        this.f160142d.setLastLoginWxUsername(this.f160144f);
        this.f160142d.setLogoutState(true);
        this.f160142d.b();
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.myLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.setting.ui.setting.m1(this), true);
        this.f160146h = b4Var;
        b4Var.c(1500L, 500L);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.f160148m = getIntent().getStringExtra("key_langauage_code");
            this.f160150o = getIntent().getFloatExtra("key_font_scale_size", 1.0f);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f160148m)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FakeSwitchAccountUI", "country %s", this.f160148m);
                com.tencent.mm.sdk.platformtools.e8.a("language_key", this.f160148m);
                com.tencent.mm.ui.MMActivity.initLanguage(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f160148m);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FakeSwitchAccountUI", "fontScale %f", java.lang.Float.valueOf(this.f160150o));
            i65.a.F(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f160150o);
            initView();
        } catch (java.lang.Throwable unused) {
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.FakeSwitchAccountUI", "fake switch account destroy");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            return true;
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.FakeSwitchAccountUI", "fake switch account resume");
        android.content.Intent intent = new android.content.Intent("action_kill_mm_process");
        intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        sendBroadcast(intent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.tencent.mars.xlog.Log.i("MicroMsg.FakeSwitchAccountUI", "fake switch account stop");
    }
}
