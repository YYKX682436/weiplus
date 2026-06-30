package com.tencent.mm.plugin.soter.ui;

@db5.a(7)
/* loaded from: classes15.dex */
public class SoterAuthenticationUIWC extends com.tencent.mm.ui.MMActivity {

    /* renamed from: h, reason: collision with root package name */
    public static com.tencent.mm.ui.widget.dialog.j0 f171752h;

    /* renamed from: i, reason: collision with root package name */
    public static te4.e f171753i;

    /* renamed from: d, reason: collision with root package name */
    public pe4.o f171754d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f171755e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f171756f = -1;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f171757g = null;

    public final void T6(re4.d0 d0Var) {
        int i17;
        if (d0Var != null && this.f171756f == 0) {
            int i18 = d0Var.f394526a;
            if (i18 != 0) {
                switch (i18) {
                    default:
                        switch (i18) {
                            case 90006:
                            case 90007:
                            case 90011:
                                break;
                            case 90008:
                            case 90009:
                            case 90010:
                                i17 = 3;
                                break;
                            default:
                                i17 = -1;
                                break;
                        }
                    case com.tencent.thumbplayer.tmediacodec.codec.CodecError.FLUSH_CODECEXCEPTION /* 90001 */:
                    case 90002:
                    case 90003:
                    case 90004:
                        i17 = 2;
                        break;
                }
            } else {
                i17 = 0;
            }
            re4.f0.INSTANCE.a("requireSoterBiometricAuthentication", this.f171757g, i17, i18);
        }
    }

    public final android.content.Intent U6(re4.d0 d0Var) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("err_code", d0Var.f394526a);
        bundle.putString("err_msg", d0Var.f394527b);
        bundle.putByte("use_mode", d0Var.f394528c);
        bundle.putString("result_json", d0Var.f394529d);
        bundle.putString("result_json_signature", d0Var.f394530e);
        bundle.toString();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(bundle);
        return intent;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.ref.WeakReference weakReference;
        super.onCreate(bundle);
        if (26 != android.os.Build.VERSION.SDK_INT) {
            setRequestedOrientation(1);
        }
        getWindow().setStatusBarColor(0);
        te4.e eVar = f171753i;
        if (eVar != null && (weakReference = eVar.f418598a) != null) {
            weakReference.clear();
        }
        f171753i = new te4.e(this, null);
        re4.c0 c0Var = new re4.c0();
        re4.d0 d0Var = new re4.d0();
        java.lang.String stringExtra = getIntent().getStringExtra("auth_mode");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterAuthenticationUIWC", "hy: error authen mode : null");
            d0Var.f394526a = 90003;
            d0Var.f394527b = "authen mode is null";
        } else {
            try {
                java.lang.String substring = stringExtra.substring(2);
                if (substring == null) {
                    substring = "00";
                }
                c0Var.f394519a = java.lang.Byte.parseByte(substring, 16);
                c0Var.f394520b = getIntent().getStringExtra("challenge");
                c0Var.f394521c = getIntent().getStringExtra("auth_content");
                if (!re4.g0.c()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SoterAuthenticationUIWC", "hy: not support soter");
                    d0Var.f394526a = com.tencent.thumbplayer.tmediacodec.codec.CodecError.FLUSH_CODECEXCEPTION;
                    d0Var.f394527b = "not support soter";
                } else if (c0Var.f394519a <= 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SoterAuthenticationUIWC", "hy: param error: request mode illegal");
                    d0Var.f394526a = 90003;
                    d0Var.f394527b = "resp model error";
                } else if (com.tencent.mm.sdk.platformtools.t8.K0(c0Var.f394520b)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SoterAuthenticationUIWC", "hy: param error: challenge null");
                    d0Var.f394526a = 90004;
                    d0Var.f394527b = "challenge is null";
                } else if (c0Var.f394520b.length() >= 512) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SoterAuthenticationUIWC", "hy: param error: challenge too long");
                    d0Var.f394526a = 90004;
                    d0Var.f394527b = "challenge is too long. 512 chars at most";
                } else if (com.tencent.mm.sdk.platformtools.t8.K0(c0Var.f394521c)) {
                    c0Var.f394521c = getString(com.tencent.mm.R.string.jie);
                } else if (c0Var.f394521c.length() > 42) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SoterAuthenticationUIWC", "hy: param error: content too long. use default");
                    c0Var.f394521c = getString(com.tencent.mm.R.string.jie);
                }
            } catch (java.lang.IndexOutOfBoundsException | java.lang.NumberFormatException unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SoterAuthenticationUIWC", "hy: error authen mode format: %s", stringExtra);
                d0Var.f394526a = 90003;
                d0Var.f394527b = "authen mode is illegal: number format error. found: " + stringExtra;
            }
        }
        if (d0Var.f394526a != 0) {
            setResult(1, U6(d0Var));
            T6(d0Var);
            finish();
            return;
        }
        this.f171756f = getIntent().getIntExtra("key_soter_fp_mp_scene", 0);
        pe4.o a17 = pe4.a.IML.a(this, c0Var, d0Var, f171753i);
        this.f171754d = a17;
        if (a17 != null) {
            a17.f353723g = new oe4.i();
            this.f171754d.f353722f = new oe4.h();
            this.f171754d.f353724h = 2;
            this.f171757g = getIntent().getStringExtra("key_app_id");
            this.f171754d.c(bundle);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SoterAuthenticationUIWC", "hy: no corresponding authen mode");
        d0Var.f394526a = 90003;
        d0Var.f394527b = "no corresponding mode";
        setResult(1, U6(d0Var));
        T6(d0Var);
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        android.app.ProgressDialog progressDialog = this.f171755e;
        if (progressDialog != null && progressDialog.isShowing()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthenticationUIWC", "onDestroy mProgressDialog dismiss!");
            this.f171755e.dismiss();
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = f171752h;
        if (j0Var != null && j0Var.isShowing()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthenticationUIWC", "onDestroy mAuthenDialog dismiss!");
            f171752h.dismiss();
        }
        java.lang.ref.WeakReference weakReference = f171753i.f418598a;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        gu5.c cVar;
        super.onPause();
        pe4.o oVar = this.f171754d;
        if (oVar != null) {
            pe4.m mVar = (pe4.m) oVar;
            if (mVar.f353708j && (cVar = mVar.f353709k) != null) {
                zt5.h.e("Soter.SoterFingerprintCanceller", "soter: publishing cancellation. should publish: %b", java.lang.Boolean.TRUE);
                if (cVar.f275961a.isCanceled()) {
                    zt5.h.c("Soter.SoterFingerprintCanceller", "soter: cancellation signal already expired.", new java.lang.Object[0]);
                } else {
                    ju5.o.a().c(new gu5.a(cVar));
                    ju5.o.a().f302136b.postDelayed(new gu5.b(cVar), 350L);
                }
            }
            com.tencent.mm.ui.widget.dialog.j0 j0Var = mVar.f353710l;
            if (j0Var == null || !j0Var.isShowing()) {
                return;
            }
            mVar.f353710l.dismiss();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i17, strArr, iArr);
        pe4.o oVar = this.f171754d;
        if (oVar != null) {
            oVar.e(i17, strArr, iArr);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        pe4.o oVar = this.f171754d;
        if (oVar != null) {
            pe4.m mVar = (pe4.m) oVar;
            if (mVar.f353708j) {
                mVar.i();
            }
        }
    }
}
