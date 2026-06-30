package com.tencent.mm.ui.base;

/* loaded from: classes7.dex */
public class BaseLuggageActivity extends com.tencent.mm.ui.BaseActivity implements nf.m {

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.Object f197233z = new byte[0];
    public volatile android.view.LayoutInflater A = null;

    public final boolean T6(java.lang.String str) {
        java.lang.String m17 = wo.w0.m();
        java.lang.String str2 = android.os.Build.DEVICE;
        if (str == null ? false : com.tencent.mm.sdk.platformtools.t8.D0(m17.toLowerCase(), str.toLowerCase())) {
            return true;
        }
        return (str2 == null || str == null) ? false : com.tencent.mm.sdk.platformtools.t8.D0(str2.toLowerCase(), str.toLowerCase());
    }

    @Override // com.tencent.mm.ui.BaseActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488023eo;
    }

    @Override // android.app.Activity
    public android.view.LayoutInflater getLayoutInflater() {
        if (this.A == null) {
            synchronized (this.f197233z) {
                if (this.A == null) {
                    this.A = db5.h0.f228358d.l0(this);
                }
            }
        }
        return this.A;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return com.tencent.mm.sdk.platformtools.x2.f193075e;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        if (this.A == null) {
            synchronized (this.f197233z) {
                if (this.A == null) {
                    this.A = db5.h0.f228358d.l0(this);
                }
            }
        }
        return this.A;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        nf.g.a(this).g(i17, i18, intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i17, strArr, iArr);
        nf.g.a(this).h(i17, strArr, iArr);
    }

    public void setNavigationbarColor(int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            if (T6("y83a") || T6("y83") || T6("v1732a") || T6("v1732t")) {
                return;
            }
            getWindow().setNavigationBarColor(i17);
            boolean g17 = com.tencent.mm.ui.uk.g(i17);
            android.view.View decorView = getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(g17 ? systemUiVisibility & (-17) : systemUiVisibility | 16);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i17) {
        try {
            super.setRequestedOrientation(i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BaseLuggageActivity", th6, "AndroidOSafety.safety uncaught", new java.lang.Object[0]);
        }
    }
}
