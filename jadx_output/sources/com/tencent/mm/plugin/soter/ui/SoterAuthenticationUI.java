package com.tencent.mm.plugin.soter.ui;

/* loaded from: classes15.dex */
public class SoterAuthenticationUI extends androidx.appcompat.app.AppCompatActivity {

    /* renamed from: q, reason: collision with root package name */
    public static com.tencent.mm.ui.widget.dialog.j0 f171740q;

    /* renamed from: r, reason: collision with root package name */
    public static te4.c f171741r;

    /* renamed from: n, reason: collision with root package name */
    public android.os.ResultReceiver f171749n;

    /* renamed from: d, reason: collision with root package name */
    public pe4.o f171742d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f171743e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f171744f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f171745g = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f171746h = false;

    /* renamed from: i, reason: collision with root package name */
    public zt5.r f171747i = null;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f171748m = null;

    /* renamed from: o, reason: collision with root package name */
    public final pe4.n f171750o = new te4.a(this);

    /* renamed from: p, reason: collision with root package name */
    public final eu5.b f171751p = new te4.b(this);

    public final void O6(re4.d0 d0Var) {
        int i17;
        if (d0Var != null && this.f171744f == 1) {
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
            ((ch1.d) ((com.tencent.mm.plugin.appbrand.profile.c) nd.f.d(com.tencent.mm.plugin.appbrand.profile.c.class, true))).c(13711, 0, this.f171748m, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        }
    }

    public final void P6(re4.d0 d0Var) {
        this.f171749n.send(1, Q6(d0Var));
        O6(d0Var);
        finish();
    }

    public final android.os.Bundle Q6(re4.d0 d0Var) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("err_code", d0Var.f394526a);
        bundle.putString("err_msg", d0Var.f394527b);
        bundle.putByte("use_mode", d0Var.f394528c);
        bundle.putString("result_json", d0Var.f394529d);
        bundle.putString("result_json_signature", d0Var.f394530e);
        bundle.toString();
        return bundle;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return com.tencent.mm.sdk.platformtools.x2.f193075e;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.ref.WeakReference weakReference;
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        this.f171749n = (android.os.ResultReceiver) getIntent().getParcelableExtra("Soter_Result_Receiver");
        te4.c cVar = f171741r;
        if (cVar != null && (weakReference = cVar.f418597a) != null) {
            weakReference.clear();
        }
        f171741r = new te4.c(this, null);
        re4.c0 c0Var = new re4.c0();
        re4.d0 d0Var = new re4.d0();
        java.lang.String stringExtra = getIntent().getStringExtra("auth_mode");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterAuthenticationUI", "hy: error authen mode : null");
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
                if (!wt5.a.l()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SoterAuthenticationUI", "hy: not support soter");
                    d0Var.f394526a = com.tencent.thumbplayer.tmediacodec.codec.CodecError.FLUSH_CODECEXCEPTION;
                    d0Var.f394527b = "not support soter";
                } else if (c0Var.f394519a <= 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SoterAuthenticationUI", "hy: param error: request mode illegal");
                    d0Var.f394526a = 90003;
                    d0Var.f394527b = "resp model error";
                } else if (com.tencent.mm.sdk.platformtools.t8.K0(c0Var.f394520b)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SoterAuthenticationUI", "hy: param error: challenge null");
                    d0Var.f394526a = 90004;
                    d0Var.f394527b = "challenge is null";
                } else if (c0Var.f394520b.length() >= 512) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SoterAuthenticationUI", "hy: param error: challenge too long");
                    d0Var.f394526a = 90004;
                    d0Var.f394527b = "challenge is too long. 512 chars at most";
                } else if (com.tencent.mm.sdk.platformtools.t8.K0(c0Var.f394521c)) {
                    c0Var.f394521c = getString(com.tencent.mm.R.string.jie);
                } else if (c0Var.f394521c.length() > 42) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SoterAuthenticationUI", "hy: param error: content too long. use default");
                    c0Var.f394521c = getString(com.tencent.mm.R.string.jie);
                }
            } catch (java.lang.IndexOutOfBoundsException | java.lang.NumberFormatException unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SoterAuthenticationUI", "hy: error authen mode format: %s", stringExtra);
                d0Var.f394526a = 90003;
                d0Var.f394527b = "authen mode is illegal: number format error. found: " + stringExtra;
            }
        }
        if (d0Var.f394526a != 0) {
            P6(d0Var);
            return;
        }
        this.f171744f = getIntent().getIntExtra("key_soter_fp_luggage_fromscene", 1);
        this.f171745g = getIntent().getIntExtra("key_soter_fp_luggage_scene", 2048);
        pe4.o a17 = pe4.a.IML.a(this, c0Var, d0Var, f171741r);
        this.f171742d = a17;
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterAuthenticationUI", "hy: no corresponding authen mode");
            d0Var.f394526a = 90003;
            d0Var.f394527b = "no corresponding mode";
            P6(d0Var);
            return;
        }
        a17.f353723g = null;
        a17.f353722f = null;
        a17.f353724h = this.f171745g;
        a17.f353725i = this.f171750o;
        boolean d17 = fu5.d.b().d();
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthenticationUI", "hy: isInit:" + d17);
        if (!d17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthenticationUI", "hy: init scene:" + this.f171742d.f353724h);
            ju5.h hVar = new ju5.h(null);
            hVar.f302093b = new int[]{this.f171742d.f353724h};
            ju5.o.a().c(new cu5.a(getApplicationContext(), hVar, this.f171751p));
            this.f171746h = true;
        }
        this.f171748m = getIntent().getStringExtra("key_app_id");
        this.f171742d.c(bundle);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        android.app.ProgressDialog progressDialog = this.f171743e;
        if (progressDialog != null && progressDialog.isShowing()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthenticationUI", "onDestroy mProgressDialog dismiss!");
            this.f171743e.dismiss();
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = f171740q;
        if (j0Var != null && j0Var.isShowing()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterAuthenticationUI", "onDestroy mAuthenDialog dismiss!");
            f171740q.dismiss();
        }
        java.lang.ref.WeakReference weakReference = f171741r.f418597a;
        if (weakReference != null) {
            weakReference.clear();
        }
        if (this.f171746h) {
            ju5.n.c().b();
            fu5.d b17 = fu5.d.b();
            b17.getClass();
            synchronized (fu5.d.class) {
                b17.f266912a = false;
                b17.f266913b = false;
                b17.f266914c = new android.util.SparseArray(10);
                b17.f266915d = null;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        gu5.c cVar;
        super.onPause();
        pe4.o oVar = this.f171742d;
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i17, strArr, iArr);
        pe4.o oVar = this.f171742d;
        if (oVar != null) {
            oVar.e(i17, strArr, iArr);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        pe4.o oVar = this.f171742d;
        if (oVar != null) {
            pe4.m mVar = (pe4.m) oVar;
            if (mVar.f353708j) {
                mVar.i();
            }
        }
        overridePendingTransition(0, 0);
    }
}
