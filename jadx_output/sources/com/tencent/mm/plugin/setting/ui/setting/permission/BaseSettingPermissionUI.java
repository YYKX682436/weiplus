package com.tencent.mm.plugin.setting.ui.setting.permission;

@db5.a(800)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/permission/BaseSettingPermissionUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lvj5/k;", "mStatusBarHeightCallback", "Lvj5/k;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class BaseSettingPermissionUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f161437d = "BaseSettingPermissionUI";
    private vj5.k mStatusBarHeightCallback;

    public abstract int T6();

    public abstract int U6();

    public abstract int V6();

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ckn;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        setSelfNavigationBarVisible(8);
        getContext().getWindow().addFlags(2097280);
        getContext().getWindow().addFlags(67108864);
        getContext().getWindow().clearFlags(67108864);
        getContext().getWindow().getDecorView().setSystemUiVisibility(1792);
        getContext().getWindow().addFlags(Integer.MIN_VALUE);
        getContext().getWindow().setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        getContext().getWindow().setNavigationBarColor(0);
        if (com.tencent.mm.ui.b4.c(this)) {
            getController().W0(this, getResources().getColor(com.tencent.mm.R.color.f478491c));
            ul5.k bounceView = getBounceView();
            if (bounceView != null) {
                bounceView.setEnd2StartBgColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
            }
        }
        getContext().getWindow().setFormat(-3);
        getContext().getWindow().setSoftInputMode(51);
        setMMTitle("");
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f483313aa1);
        if (findViewById != null) {
            findViewById.setOnClickListener(new s14.d(this));
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.obc);
        if (textView != null) {
            textView.setText(getString(V6()));
        }
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) findViewById(com.tencent.mm.R.id.obc)).getPaint(), 0.8f);
        if (!com.tencent.mm.ui.b4.c(this)) {
            ((android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.f487336oc0)).setPadding(0, com.tencent.mm.ui.bl.h(getContext()), 0, 0);
        }
        android.view.View inflate = com.tencent.mm.ui.id.b(this).inflate(T6(), (android.view.ViewGroup) null);
        ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).getClass();
        java.util.HashMap hashMap = e85.i.f250319e;
        kotlin.jvm.internal.o.d(inflate);
        com.tencent.mm.accessibility.base.MapExpandKt.visitChild(inflate, new s14.a(hashMap, this));
        ((android.widget.ScrollView) findViewById(com.tencent.mm.R.id.mcq)).addView(inflate);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.koc);
        if (textView2 != null) {
            textView2.setText(getString(V6()));
        }
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) findViewById(com.tencent.mm.R.id.koc)).getPaint(), 0.8f);
        supportLightStatusBar();
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.moj);
        if (textView3 != null) {
            textView3.setGravity(17);
            java.lang.String string = getString(U6());
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = getString(com.tencent.mm.R.string.ime);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            java.lang.String string3 = getString(com.tencent.mm.R.string.imf);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            java.lang.String concat = string.concat(string2);
            int L = r26.n0.L(concat, string3, 0, false, 6, null);
            int length = string3.length() + L;
            if (L <= 0 || length >= concat.length()) {
                textView3.setText(concat);
            } else {
                android.text.SpannableString spannableString = new android.text.SpannableString(concat);
                spannableString.setSpan(new s14.b(this), L, length, 33);
                textView3.setText(spannableString);
                textView3.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            }
        }
        android.widget.ScrollView scrollView = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.mcq);
        if (scrollView != null) {
            scrollView.setOnScrollChangeListener(new s14.c(i65.a.b(getContext(), 64), (android.widget.TextView) findViewById(com.tencent.mm.R.id.obc)));
        }
        if (com.tencent.mm.ui.b4.c(getContext())) {
            new n3.m3(getWindow(), getWindow().getDecorView()).b(true);
        }
    }
}
