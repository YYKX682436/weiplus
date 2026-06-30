package com.tencent.mm.plugin.location_soso;

@db5.a(19)
/* loaded from: classes13.dex */
public class SoSoProxyUI extends com.tencent.tencentmap.mapsdk.map.MapActivity implements d85.j0 {
    protected static final java.lang.String TAG = "MicroMsg.SoSoProxyUI";
    private ab3.e basemapUI;

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (this.basemapUI.a(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.basemapUI.b(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return (getAssets() == null || com.tencent.mm.sdk.platformtools.x2.f193075e == null) ? super.getResources() : com.tencent.mm.sdk.platformtools.x2.f193075e;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        java.lang.Object systemService = super.getSystemService(str);
        return (getAssets() == null || !"layout_inflater".equals(str)) ? systemService : com.tencent.mm.ui.id.c((android.view.LayoutInflater) systemService);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        this.basemapUI.c(i17, i18, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.basemapUI.d();
    }

    @Override // d85.j0
    public void onBusinessPermissionDenied(java.lang.String str) {
        java.lang.Object obj = this.basemapUI;
        if (obj instanceof d85.j0) {
            ((d85.j0) obj).onBusinessPermissionDenied(str);
        }
    }

    @Override // d85.j0
    public void onBusinessPermissionGranted(java.lang.String str) {
        java.lang.Object obj = this.basemapUI;
        if (obj instanceof d85.j0) {
            ((d85.j0) obj).onBusinessPermissionGranted(str);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.map.MapActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        ab3.e x1Var;
        com.tencent.mars.xlog.Log.i(TAG, "SoSoProxyUI onCreate");
        int intExtra = getIntent().getIntExtra("intent_map_key", -1);
        if (intExtra == 2) {
            requestWindowFeature(1);
        }
        super.onCreate(bundle);
        if (android.os.Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        if (((ab3.g) i95.n0.c(ab3.g.class)) == null) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[4];
                objArr[0] = java.lang.Boolean.valueOf(z65.c.f470455a);
                objArr[1] = java.lang.Boolean.valueOf(bundle != null);
                objArr[2] = getClass().getSimpleName();
                objArr[3] = java.lang.Integer.valueOf(hashCode());
                com.tencent.mars.xlog.Log.e(TAG, "summerasyncinit not init activity foreground[%b] savedInstanceState[%b], activity[%s, %d]", objArr);
                finish();
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "summerasyncinit finish:", new java.lang.Object[0]);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(598L, 20L, 1L, false);
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("map_talker_name");
        ((com.tencent.mm.plugin.location.ui.impl.x) ((ab3.g) i95.n0.c(ab3.g.class))).getClass();
        if (intExtra == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MapFactoryImp", "poi map");
            x1Var = new com.tencent.mm.plugin.location.ui.impl.x1(this, stringExtra);
        } else if (intExtra == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MapFactoryImp", "track map");
            x1Var = new com.tencent.mm.plugin.location.ui.impl.y1(this);
        } else if (intExtra != 5) {
            x1Var = null;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MapFactoryImp", "share map");
            x1Var = new com.tencent.mm.plugin.location.ui.impl.p0(this);
        }
        this.basemapUI = x1Var;
        if (x1Var == null) {
            finish();
        } else {
            x1Var.e(bundle);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.map.MapActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        ab3.e eVar = this.basemapUI;
        if (eVar != null) {
            eVar.f();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 82 || keyEvent.getAction() != 1) {
            return super.onKeyUp(i17, keyEvent);
        }
        this.basemapUI.g(i17, keyEvent);
        return true;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.MapActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.basemapUI.h();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i(TAG, "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i(TAG, "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 67 || i17 == 68) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                if (((t60.e) ((u60.g) i95.n0.c(u60.g.class))).Ai(this)) {
                    ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                    i11.u.a(com.tencent.mm.sdk.platformtools.x2.f193071a).d(this);
                } else {
                    db5.e1.C(this, getString(com.tencent.mm.R.string.hhm), getResources().getString(com.tencent.mm.R.string.hht), getResources().getString(com.tencent.mm.R.string.g6z), getResources().getString(com.tencent.mm.R.string.aq7), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.location_soso.SoSoProxyUI.3
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                            com.tencent.mm.plugin.location_soso.SoSoProxyUI soSoProxyUI = com.tencent.mm.plugin.location_soso.SoSoProxyUI.this;
                            ((sb0.f) jVar).getClass();
                            j35.u.g(soSoProxyUI);
                        }
                    }, null);
                }
            }
        } else if (i17 == 80 && iArr[0] != 0) {
            db5.e1.C(this, getString(com.tencent.mm.R.string.hhn), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.aq7), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.location_soso.SoSoProxyUI.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                    dialogInterface.dismiss();
                    tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                    com.tencent.mm.plugin.location_soso.SoSoProxyUI soSoProxyUI = com.tencent.mm.plugin.location_soso.SoSoProxyUI.this;
                    ((sb0.f) jVar).getClass();
                    j35.u.g(soSoProxyUI);
                }
            }, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.location_soso.SoSoProxyUI.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                    dialogInterface.dismiss();
                }
            });
        }
        super.onRequestPermissionsResult(i17, strArr, iArr);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.MapActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.basemapUI.i();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View view) {
        super.setContentView(view);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i17) {
        super.setContentView(i17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
    }
}
