package com.tencent.mm.plugin.setting.ui.setting;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsSystemPermissionUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lvj5/k;", "mStatusBarHeightCallback", "Lvj5/k;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SettingsSystemPermissionUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f160702d = kz5.c0.i(java.lang.Integer.valueOf(com.tencent.mm.R.id.f484051cu3), java.lang.Integer.valueOf(com.tencent.mm.R.id.f484052cu4), java.lang.Integer.valueOf(com.tencent.mm.R.id.f484053cu5), java.lang.Integer.valueOf(com.tencent.mm.R.id.cu6), java.lang.Integer.valueOf(com.tencent.mm.R.id.cu7), java.lang.Integer.valueOf(com.tencent.mm.R.id.cu8), java.lang.Integer.valueOf(com.tencent.mm.R.id.cu9), java.lang.Integer.valueOf(com.tencent.mm.R.id.f484054t34), java.lang.Integer.valueOf(com.tencent.mm.R.id.f484055t35));

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f160703e = kz5.c0.i(java.lang.Integer.valueOf(com.tencent.mm.R.id.a4g), java.lang.Integer.valueOf(com.tencent.mm.R.id.a4h), java.lang.Integer.valueOf(com.tencent.mm.R.id.a4i), java.lang.Integer.valueOf(com.tencent.mm.R.id.a4j), java.lang.Integer.valueOf(com.tencent.mm.R.id.a4k), java.lang.Integer.valueOf(com.tencent.mm.R.id.a4l), java.lang.Integer.valueOf(com.tencent.mm.R.id.a4m), java.lang.Integer.valueOf(com.tencent.mm.R.id.sf6));

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f160704f;
    private vj5.k mStatusBarHeightCallback;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489456cm5;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0451 A[LOOP:1: B:27:0x044b->B:29:0x0451, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x04b5 A[LOOP:2: B:32:0x04af->B:34:0x04b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02f6  */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 1374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI.initView():void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        customfixStatusbar(true);
        super.onCreate(bundle);
        if (!com.tencent.mm.ui.b4.c(this)) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.f482435ei);
            this.f160704f = findViewById;
            if (findViewById != null && vj5.n.f437718k) {
                vj5.n b17 = vj5.n.b(this);
                com.tencent.mm.plugin.setting.ui.setting.wm wmVar = new com.tencent.mm.plugin.setting.ui.setting.wm(this);
                this.mStatusBarHeightCallback = wmVar;
                b17.d(wmVar);
                getWindow().getDecorView().requestApplyInsets();
                vj5.o.e(getWindow());
            }
        }
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(1280);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        setActionbarElementColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.fn(this));
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) findViewById(com.tencent.mm.R.id.obc)).getPaint(), 0.8f);
        supportLightStatusBar();
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        c0Var.f310112d = true;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.gth);
        kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type android.widget.ScrollView");
        ((android.widget.ScrollView) findViewById2).setOnScrollChangeListener(new com.tencent.mm.plugin.setting.ui.setting.gn(this, c0Var));
        java.lang.Integer[] numArr = {java.lang.Integer.valueOf(com.tencent.mm.R.id.gtc), java.lang.Integer.valueOf(com.tencent.mm.R.id.gtd)};
        for (int i17 = 0; i17 < 2; i17++) {
            android.widget.TextView textView = (android.widget.TextView) findViewById(numArr[i17].intValue());
            if (textView != null) {
                textView.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.hn(this));
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        initView();
    }
}
