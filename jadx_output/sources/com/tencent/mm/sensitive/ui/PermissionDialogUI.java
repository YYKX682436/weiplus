package com.tencent.mm.sensitive.ui;

@db5.a(7)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/sensitive/ui/PermissionDialogUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "sensitive_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class PermissionDialogUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public static yz5.l f193192d;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        d85.g0 g0Var;
        d85.f0 f0Var;
        jz5.f0 f0Var2;
        super.onCreate(bundle);
        setRequestedOrientation(1);
        if (fp.h.c(21)) {
            getWindow().setStatusBarColor(0);
        }
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_PERMISSION");
        if (stringExtra != null) {
            try {
                d85.g0[] values = d85.g0.values();
                int length = values.length;
                for (int i17 = 0; i17 < length; i17++) {
                    g0Var = values[i17];
                    if (r26.i0.p(g0Var.f227192d, stringExtra, true)) {
                        break;
                    }
                }
            } catch (java.lang.IllegalArgumentException unused) {
            }
        }
        g0Var = null;
        java.lang.String stringExtra2 = getIntent().getStringExtra("KEY_BUSINESS");
        if (stringExtra2 != null) {
            try {
                d85.f0[] values2 = d85.f0.values();
                int length2 = values2.length;
                for (int i18 = 0; i18 < length2; i18++) {
                    f0Var = values2[i18];
                    if (r26.i0.p(f0Var.f227176d, stringExtra2, true)) {
                        break;
                    }
                }
            } catch (java.lang.IllegalArgumentException unused2) {
            }
        }
        f0Var = null;
        if (g0Var == null || f0Var == null) {
            f0Var2 = null;
        } else {
            j85.g.f298251a.c(g0Var, f0Var, null);
            k85.t.f305439a.i(this, g0Var, f0Var, new k85.a(this));
            f0Var2 = jz5.f0.f302826a;
        }
        if (f0Var2 == null) {
            f193192d = null;
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        yz5.l lVar = f193192d;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.FALSE);
        }
        f193192d = null;
    }
}
