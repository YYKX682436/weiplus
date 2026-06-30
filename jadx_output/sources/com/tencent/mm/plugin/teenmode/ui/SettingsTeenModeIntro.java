package com.tencent.mm.plugin.teenmode.ui;

@ul5.d(0)
/* loaded from: classes.dex */
public class SettingsTeenModeIntro extends com.tencent.mm.ui.MMActivity {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f172845h = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f172846d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.CheckBox f172847e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f172848f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f172849g;

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return c01.e2.a0() ? com.tencent.mm.R.layout.env : com.tencent.mm.R.layout.cm7;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        boolean booleanExtra = getIntent().getBooleanExtra("IntentKey_ForceDisplay", false);
        xh4.x.f454644b = booleanExtra;
        if (booleanExtra) {
            setBackBtnVisible(false);
            if (getSwipeBackLayout() != null) {
                getSwipeBackLayout().setEnableGesture(false);
            }
        }
        java.lang.String stringExtra = getIntent().getStringExtra("IntentKey_DeadlineWord");
        if (c01.e2.a0() && !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.vcl);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.vcm);
            if (textView != null) {
                textView.setText(stringExtra);
            }
        }
        this.f172849g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.odf);
        java.lang.String stringExtra2 = getIntent().getStringExtra("IntentKey_Title");
        com.tencent.mm.ui.fk.b(this.f172849g);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            this.f172849g.setText(stringExtra2);
        }
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.nzr);
        this.f172846d = button;
        button.setEnabled(false);
        this.f172846d.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.k3(this));
        android.widget.CheckBox checkBox = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.hun);
        this.f172847e = checkBox;
        checkBox.post(new com.tencent.mm.plugin.teenmode.ui.m3(this));
        this.f172847e.setOnCheckedChangeListener(new com.tencent.mm.plugin.teenmode.ui.n3(this));
        java.lang.String string = getString(com.tencent.mm.R.string.jrr);
        java.lang.String string2 = getString(com.tencent.mm.R.string.jrs);
        int lastIndexOf = string.lastIndexOf(string2);
        if (lastIndexOf < 0) {
            return;
        }
        int length = string2.length() + lastIndexOf;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new com.tencent.mm.plugin.teenmode.ui.o3(this, 1, null), lastIndexOf, length, 18);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.huo);
        this.f172848f = textView2;
        textView2.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(this));
        this.f172848f.setClickable(true);
        this.f172848f.setText(spannableStringBuilder);
        setBackBtn(new com.tencent.mm.plugin.teenmode.ui.p3(this), getIntent().getIntExtra("IntentKey_BackIconRes", 0));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (xh4.x.f454644b) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        initView();
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z17) {
    }
}
