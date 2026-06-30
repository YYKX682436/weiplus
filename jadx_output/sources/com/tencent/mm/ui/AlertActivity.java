package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class AlertActivity extends androidx.appcompat.app.AppCompatActivity {

    /* renamed from: m, reason: collision with root package name */
    public static com.tencent.mm.ui.widget.dialog.i0 f196556m;

    /* renamed from: n, reason: collision with root package name */
    public static db5.g7 f196557n;

    /* renamed from: o, reason: collision with root package name */
    public static com.tencent.mm.ui.widget.dialog.o3 f196558o;

    /* renamed from: p, reason: collision with root package name */
    public static com.tencent.mm.ui.widget.dialog.t3 f196559p;

    /* renamed from: q, reason: collision with root package name */
    public static com.tencent.mm.ui.widget.dialog.e4 f196560q;

    /* renamed from: r, reason: collision with root package name */
    public static al5.t4 f196561r;

    /* renamed from: d, reason: collision with root package name */
    public android.content.DialogInterface.OnDismissListener f196562d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f196563e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.q3 f196564f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.r3 f196565g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f196566h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f196567i = 1;

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.Window window;
        super.onCreate(bundle);
        boolean z17 = false;
        overridePendingTransition(0, 0);
        getWindow().getDecorView().setSystemUiVisibility(cc1.y.CTRL_INDEX);
        int i17 = android.os.Build.VERSION.SDK_INT;
        getWindow().setStatusBarColor(getResources().getColor(android.R.color.transparent));
        this.f196566h = getIntent().getBooleanExtra("dialog_show_top", false);
        int intExtra = getIntent().getIntExtra("dialog_scene", 1);
        this.f196567i = intExtra;
        com.tencent.mm.ui.yk.c("MicroMsg.AlertActivity", "show alert, scene:%s", java.lang.Integer.valueOf(intExtra));
        int i18 = this.f196567i;
        if (i18 == 1) {
            com.tencent.mm.ui.widget.dialog.i0 i0Var = f196556m;
            if (i0Var == null) {
                com.tencent.mm.ui.yk.b("MicroMsg.AlertActivity", "mBuilder is null, finish AlertActivity!", new java.lang.Object[0]);
                finish();
                return;
            }
            i0Var.f211820a = this;
            com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
            this.f196562d = aVar.H;
            this.f196563e = aVar.G;
            aVar.H = new com.tencent.mm.ui.v(this);
            aVar.G = new com.tencent.mm.ui.w(this);
            com.tencent.mm.ui.widget.dialog.j0 a17 = i0Var.a();
            if (this.f196566h && (window = a17.getWindow()) != null) {
                if (i17 >= 26) {
                    window.setType(2038);
                } else {
                    window.setType(2002);
                }
                com.tencent.mm.ui.yk.a("MicroMsg.AlertActivity", "show top window not null!!", new java.lang.Object[0]);
            }
            a17.show();
            if (a17.isShowing()) {
                return;
            }
            com.tencent.mm.ui.yk.b("MicroMsg.AlertActivity", "show dialog FAILED, finish AlertActivity!", new java.lang.Object[0]);
            finish();
            return;
        }
        if (i18 == 2) {
            db5.g7 g7Var = f196557n;
            if (g7Var == null) {
                com.tencent.mm.ui.yk.b("MicroMsg.AlertActivity", "mTipsBuilder is null, finish AlertActivity!", new java.lang.Object[0]);
                finish();
                return;
            }
            g7Var.f228351b = this;
            com.tencent.mm.ui.vj vjVar = g7Var.f228352c;
            this.f196562d = vjVar.f211167f;
            vjVar.f211167f = new com.tencent.mm.ui.x(this);
            vjVar.f211168g = new com.tencent.mm.ui.y(this);
            db5.h7 a18 = g7Var.a();
            a18.show();
            if (a18.isShowing()) {
                return;
            }
            com.tencent.mm.ui.yk.b("MicroMsg.AlertActivity", "show dialog FAILED, finish AlertActivity!", new java.lang.Object[0]);
            finish();
            return;
        }
        if (i18 == 3) {
            com.tencent.mm.ui.widget.dialog.o3 o3Var = f196558o;
            if (o3Var != null) {
                o3Var.f211938a = this;
                com.tencent.mm.ui.widget.dialog.h hVar = o3Var.f211939b;
                this.f196564f = hVar.f211814k;
                this.f196565g = hVar.f211813j;
                hVar.f211814k = new com.tencent.mm.ui.z(this);
                hVar.f211813j = new com.tencent.mm.ui.a0(this);
                com.tencent.mm.ui.widget.dialog.z2 a19 = o3Var.a();
                a19.C();
                if (a19.h()) {
                    return;
                }
                com.tencent.mm.ui.yk.b("MicroMsg.AlertActivity", "show dialog FAILED, finish AlertActivity!", new java.lang.Object[0]);
                finish();
                return;
            }
            return;
        }
        if (i18 == 4) {
            com.tencent.mm.ui.widget.dialog.t3 t3Var = f196559p;
            if (t3Var != null) {
                t3Var.f211981b = this;
                this.f196563e = t3Var.f211989j;
                t3Var.f211989j = new com.tencent.mm.ui.b0(this);
                com.tencent.mm.ui.widget.dialog.u3 a27 = t3Var.a();
                if (!f196559p.f211987h) {
                    a27.show();
                }
                if (!a27.isShowing()) {
                    com.tencent.mm.ui.yk.b("MicroMsg.AlertActivity", "show dialog FAILED, finish AlertActivity!", new java.lang.Object[0]);
                    finish();
                }
                com.tencent.mm.ui.widget.dialog.t3 t3Var2 = f196559p;
                t3Var2.f211986g = new com.tencent.mm.ui.c0(this, a27);
                android.content.DialogInterface.OnDismissListener onDismissListener = t3Var2.f211988i;
                if (onDismissListener != null) {
                    a27.setOnDismissListener(onDismissListener);
                }
                android.content.DialogInterface.OnCancelListener onCancelListener = f196559p.f211989j;
                if (onCancelListener != null) {
                    a27.setOnCancelListener(onCancelListener);
                }
                android.content.DialogInterface.OnShowListener onShowListener = f196559p.f211990k;
                if (onShowListener != null) {
                    a27.setOnShowListener(onShowListener);
                }
                android.content.DialogInterface.OnKeyListener onKeyListener = f196559p.f211991l;
                if (onKeyListener != null) {
                    a27.setOnKeyListener(onKeyListener);
                    return;
                }
                return;
            }
            return;
        }
        if (i18 == 5) {
            com.tencent.mm.ui.widget.dialog.e4 e4Var = f196560q;
            if (e4Var == null) {
                com.tencent.mm.ui.yk.b("MicroMsg.AlertActivity", "mWeToastBuilder is null, finish AlertActivity!", new java.lang.Object[0]);
                finish();
                return;
            }
            e4Var.f211775b = this;
            this.f196563e = e4Var.f211781h;
            this.f196562d = e4Var.f211782i;
            e4Var.f211781h = new com.tencent.mm.ui.e0(this);
            e4Var.f211782i = new com.tencent.mm.ui.s(this);
            com.tencent.mm.ui.widget.dialog.f4 a28 = e4Var.a();
            a28.show();
            int i19 = f196560q.f211780g;
            if (i19 == 0 || i19 == 1) {
                new android.os.Handler().postDelayed(new com.tencent.mm.ui.t(this, a28), 2000L);
            }
            if (a28.isShowing()) {
                return;
            }
            com.tencent.mm.ui.yk.b("MicroMsg.AlertActivity", "show wetoast FAILED, finish AlertActivity!", new java.lang.Object[0]);
            finish();
            return;
        }
        if (i18 == 6) {
            al5.t4 t4Var = f196561r;
            if (t4Var == null) {
                com.tencent.mm.ui.yk.b("MicroMsg.AlertActivity", "mSnackBarBuilder is null, finish AlertActivity!", new java.lang.Object[0]);
                finish();
                return;
            }
            t4Var.f6041d = this;
            t4Var.f6050m = false;
            new android.os.Handler().postDelayed(new com.tencent.mm.ui.u(this), 2000L);
            java.lang.String stringExtra = getIntent().getStringExtra("INTENT_SNACK_BAR_FORWARD_USERNAME");
            java.lang.String stringExtra2 = getIntent().getStringExtra("INTENT_SNACK_BAR_FROM_USERNAME");
            if (stringExtra != null) {
                int length = stringExtra.length();
                int i27 = 0;
                while (true) {
                    if (i27 >= length) {
                        z17 = true;
                        break;
                    }
                    int codePointAt = stringExtra.codePointAt(i27);
                    if (!java.lang.Character.isWhitespace(codePointAt)) {
                        break;
                    } else {
                        i27 += java.lang.Character.charCount(codePointAt);
                    }
                }
                if (!z17) {
                    al5.t4 t4Var2 = f196561r;
                    t4Var2.a(getString(com.tencent.mm.R.string.oei));
                    t4Var2.h(stringExtra, stringExtra2);
                    return;
                }
            }
            f196561r.h(null, stringExtra2);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        f196556m = null;
        f196557n = null;
        f196558o = null;
        f196559p = null;
        f196560q = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        overridePendingTransition(0, 0);
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (f196556m == null && f196557n == null && f196558o == null && f196559p == null && f196560q == null && f196561r == null) {
            com.tencent.mm.ui.yk.b("MicroMsg.AlertActivity", "AlertActivity onResume() with null mBuilder, exiting this transparent proxy activity...", new java.lang.Object[0]);
            finish();
        }
    }
}
