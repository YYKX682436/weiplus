package com.tencent.mm.pluginsdk.permission;

@com.tencent.mm.ui.a2
/* loaded from: classes5.dex */
public class PermissionActivity extends com.tencent.mm.ui.MMBaseActivity {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f189513s = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String[] f189514e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f189515f;

    /* renamed from: g, reason: collision with root package name */
    public int f189516g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f189517h;

    /* renamed from: i, reason: collision with root package name */
    public int f189518i;

    /* renamed from: m, reason: collision with root package name */
    public android.content.Intent f189519m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f189520n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f189521o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f189522p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f189523q;

    /* renamed from: r, reason: collision with root package name */
    public wu5.c f189524r;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PermissionActivity", "onActivityResult(),  scene=%d, requestCode=%d, resultCode=%d", java.lang.Integer.valueOf(this.f189518i), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        int i19 = this.f189518i;
        if (i19 == 2) {
            j35.g0 g0Var = (j35.g0) j35.u.f297522b.remove(this.f189515f);
            if (g0Var != null) {
                g0Var.a(i17, i18, intent);
            }
            finish();
            return;
        }
        if (i19 == 3) {
            if (i18 == -1) {
                android.content.Intent intent2 = this.f189519m;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/pluginsdk/permission/PermissionActivity", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/pluginsdk/permission/PermissionActivity", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.h9z, 1).show();
            }
            finish();
            return;
        }
        if (i19 != 4) {
            finish();
            return;
        }
        boolean b17 = com.tencent.mm.booter.o.b(this);
        if (b17) {
            if (com.tencent.mm.booter.o.a().getBoolean("954_84_first", true)) {
                jx3.f.INSTANCE.idkeyStat(954L, 84L, 1L, false);
                com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.booter.o.a();
                a17.getClass();
                a17.putBoolean("954_84_first", false);
            }
            com.tencent.mm.booter.o.h(true);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PermissionActivity", "onActivityResult ADD_IGNORING_BATTERY_OPTIMIZATIONS result=%s", java.lang.Boolean.valueOf(b17));
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.e(this);
        super.onCreate(bundle);
        com.tencent.mm.ui.bk.k0(getWindow());
        getWindow().getDecorView().setSystemUiVisibility(1280);
        getWindow().setStatusBarColor(0);
        if (com.tencent.mm.ui.b4.c(this)) {
            getWindow().setNavigationBarColor(0);
        }
        if (getIntent() == null || !getIntent().hasExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            finish();
            return;
        }
        this.f189517h = true;
        this.f189518i = getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
        this.f189520n = getIntent().getStringExtra("reasonTitle");
        this.f189521o = getIntent().getStringExtra("reasonMsg");
        this.f189522p = getIntent().getStringExtra("forceReasonMsg");
        this.f189523q = getIntent().getStringExtra("forceBusiness");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f189520n) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f189521o)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PermissionActivity", "scene: %d, reasonTitle: %s, reasonMsg: %s", java.lang.Integer.valueOf(this.f189518i), this.f189520n, this.f189521o);
        }
        this.f189515f = getIntent().getStringExtra("key");
        int i17 = this.f189518i;
        if (i17 != 1) {
            if (i17 == 2) {
                this.f189519m = getIntent().getSelector();
                return;
            }
            if (i17 != 3) {
                if (i17 == 4) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PermissionActivity", "scene: %d", java.lang.Integer.valueOf(i17));
                    return;
                }
                return;
            } else {
                android.content.Intent selector = getIntent().getSelector();
                this.f189519m = selector;
                if (selector != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PermissionActivity", "scene: %d, intent: %s", java.lang.Integer.valueOf(this.f189518i), this.f189519m.toString());
                    return;
                }
                return;
            }
        }
        overridePendingTransition(0, 0);
        this.f189514e = getIntent().getStringArrayExtra("permission");
        this.f189516g = getIntent().getIntExtra("requestCode", 0);
        if (!com.tencent.mm.sdk.platformtools.t8.N0(this.f189514e)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PermissionActivity", "scene: %d, permission: %s, requestCode: %d", java.lang.Integer.valueOf(this.f189518i), this.f189514e.toString(), java.lang.Integer.valueOf(this.f189516g));
        }
        setContentView(com.tencent.mm.R.layout.c9g);
        ku5.u0 u0Var = ku5.t0.f312615d;
        j35.v vVar = new j35.v(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f189524r = t0Var.z(vVar, 500L, false);
        java.lang.String[] strArr = this.f189514e;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        if (getResources().getConfiguration().orientation == 2) {
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.h5n);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.topMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);
            imageView.setLayoutParams(layoutParams);
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.h5n);
        android.content.res.Resources resources = getResources();
        java.lang.String str = this.f189514e[0];
        boolean equals = "android.permission.ACCESS_FINE_LOCATION".equals(str);
        int i18 = com.tencent.mm.R.raw.icons_filled_location;
        if (!equals && !"android.permission.ACCESS_COARSE_LOCATION".equals(str)) {
            if ("android.permission.READ_EXTERNAL_STORAGE".equals(str) || "android.permission.WRITE_EXTERNAL_STORAGE".equals(str) || "android.permission.READ_MEDIA_IMAGES".equals(str) || "android.permission.READ_MEDIA_VIDEO".equals(str) || "android.permission.READ_MEDIA_VISUAL_USER_SELECTED".equals(str)) {
                i18 = com.tencent.mm.R.raw.icons_filled_folder;
            } else if ("android.permission.RECORD_AUDIO".equals(str)) {
                i18 = com.tencent.mm.R.raw.icons_filled_mike;
            } else if ("android.permission.CAMERA".equals(str)) {
                i18 = com.tencent.mm.R.raw.icons_filled_camera;
            } else if ("android.permission.READ_CONTACTS".equals(str)) {
                i18 = com.tencent.mm.R.raw.icons_filled_contacts;
            } else if ("android.permission.ACTIVITY_RECOGNITION".equals(str)) {
                i18 = com.tencent.mm.R.raw.icons_outlined_sports;
            } else if ("android.permission.BLUETOOTH_CONNECT".equals(str) || "android.permission.BLUETOOTH_SCAN".equals(str)) {
                i18 = com.tencent.mm.R.raw.icons_filled_bluetooth;
            } else if ("android.permission.POST_NOTIFICATIONS".equals(str)) {
                i18 = com.tencent.mm.R.raw.icons_filled_bell_ring_on;
            }
        }
        android.graphics.drawable.Drawable drawable = resources.getDrawable(i18);
        com.tencent.mm.ui.uk.f(drawable, com.tencent.mm.R.color.f478553an);
        imageView2.setImageDrawable(drawable);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.obc);
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String str2 = "";
        objArr[0] = com.tencent.mm.sdk.platformtools.t8.K0(this.f189522p) ? getString(com.tencent.mm.R.string.f490927ba3) : "";
        java.lang.String str3 = this.f189514e[0];
        objArr[1] = ("android.permission.ACCESS_FINE_LOCATION".equals(str3) || "android.permission.ACCESS_COARSE_LOCATION".equals(str3)) ? getString(com.tencent.mm.R.string.ba_) : ("android.permission.READ_EXTERNAL_STORAGE".equals(str3) || "android.permission.WRITE_EXTERNAL_STORAGE".equals(str3) || "android.permission.READ_MEDIA_IMAGES".equals(str3) || "android.permission.READ_MEDIA_VIDEO".equals(str3) || "android.permission.READ_MEDIA_VISUAL_USER_SELECTED".equals(str3)) ? getString(com.tencent.mm.R.string.bai) : "android.permission.RECORD_AUDIO".equals(str3) ? getString(com.tencent.mm.R.string.baf) : "android.permission.CAMERA".equals(str3) ? getString(com.tencent.mm.R.string.ba8) : "android.permission.READ_CONTACTS".equals(str3) ? getString(com.tencent.mm.R.string.ba9) : "android.permission.ACTIVITY_RECOGNITION".equals(str3) ? getString(com.tencent.mm.R.string.bag) : ("android.permission.BLUETOOTH_CONNECT".equals(str3) || "android.permission.BLUETOOTH_SCAN".equals(str3)) ? !com.tencent.mm.sdk.platformtools.m2.j() ? "Bluetooth" : getString(com.tencent.mm.R.string.f490933mf3) : "android.permission.POST_NOTIFICATIONS".equals(str3) ? getString(com.tencent.mm.R.string.f490934mf4) : "android.permission.NEARBY_WIFI_DEVICES".equals(str3) ? getString(com.tencent.mm.R.string.f491310nk5) : this.f189520n;
        textView.setText(getString(com.tencent.mm.R.string.baj, objArr));
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484050cu2);
        java.lang.String str4 = this.f189514e[0];
        java.lang.String str5 = this.f189521o;
        java.lang.String str6 = this.f189522p;
        if (str6 == null || str6.isEmpty()) {
            java.lang.String string = getString(com.tencent.mm.R.string.il9);
            if ("android.permission.ACCESS_FINE_LOCATION".equals(str4) || "android.permission.ACCESS_COARSE_LOCATION".equals(str4)) {
                java.lang.String bj6 = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).bj(d85.g0.LOCAION.f227192d, null);
                str2 = bj6.isEmpty() ? getString(com.tencent.mm.R.string.bab) : string + bj6;
            }
            if ("android.permission.READ_EXTERNAL_STORAGE".equals(str4) || "android.permission.WRITE_EXTERNAL_STORAGE".equals(str4) || "android.permission.READ_MEDIA_IMAGES".equals(str4) || "android.permission.READ_MEDIA_VIDEO".equals(str4) || "android.permission.READ_MEDIA_VISUAL_USER_SELECTED".equals(str4)) {
                java.lang.String bj7 = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).bj(d85.g0.STORAGE.f227192d, null);
                str2 = bj7.isEmpty() ? getString(com.tencent.mm.R.string.bah) : string + bj7;
            }
            if ("android.permission.RECORD_AUDIO".equals(str4)) {
                java.lang.String bj8 = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).bj(d85.g0.MICRO_PHONE.f227192d, null);
                str2 = bj8.isEmpty() ? getString(com.tencent.mm.R.string.bac) : string + bj8;
            }
            if ("android.permission.CAMERA".equals(str4)) {
                java.lang.String bj9 = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).bj(d85.g0.CAMERA.f227192d, null);
                str2 = bj9.isEmpty() ? getString(com.tencent.mm.R.string.baa) : string + bj9;
            }
            if ("android.permission.READ_CONTACTS".equals(str4)) {
                java.lang.String bj10 = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).bj(d85.g0.CONTRACT.f227192d, null);
                str2 = bj10.isEmpty() ? getString(com.tencent.mm.R.string.bad) : string + bj10;
            }
            if ("android.permission.ACTIVITY_RECOGNITION".equals(str4)) {
                java.lang.String bj11 = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).bj(d85.g0.HEALTHY.f227192d, null);
                str2 = bj11.isEmpty() ? getString(com.tencent.mm.R.string.bae) : string + bj11;
            }
            if ("android.permission.NEARBY_WIFI_DEVICES".equals(str4)) {
                str2 = getString(com.tencent.mm.R.string.nk6);
            }
            if ("android.permission.BLUETOOTH_CONNECT".equals(str4)) {
                str2 = !com.tencent.mm.sdk.platformtools.m2.j() ? "After tapping \"Allow\" in the pop-up window below, you can use Bluetooth device to send voice messages, make audio/video calls in chats." : getString(com.tencent.mm.R.string.f490935mf5);
            }
            if ("android.permission.POST_NOTIFICATIONS".equals(str4)) {
                str2 = getString(com.tencent.mm.R.string.mf6);
            }
            str6 = str2.isEmpty() ? str5 : str2;
        }
        textView2.setText(str6);
        d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
        java.lang.String[] permission = this.f189514e;
        java.lang.Long l17 = 151L;
        java.lang.String str7 = this.f189523q;
        d85.d1 d1Var = (d85.d1) m0Var;
        d1Var.getClass();
        long longValue = l17.longValue();
        kotlin.jvm.internal.o.g(permission, "permission");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str8 : permission) {
            d85.g0 g0Var = (d85.g0) e85.i.f250316b.get(str8);
            if (g0Var != null && !linkedList.contains(g0Var)) {
                linkedList.add(g0Var);
            }
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            d1Var.tj((d85.g0) it.next(), longValue, str7);
        }
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PermissionActivity", "onDestroy(), scene=%d", java.lang.Integer.valueOf(this.f189518i));
        int i17 = this.f189518i;
        if (i17 == 1) {
        } else if (i17 == 2) {
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        wu5.c cVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.PermissionActivity", "onRequestPermissionsResult(),  scene=%d, requestCode=%d, permissions=%s, grantResults=%s", java.lang.Integer.valueOf(this.f189518i), java.lang.Integer.valueOf(i17), java.util.Arrays.toString(strArr), java.util.Arrays.toString(iArr));
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i18 = 0; i18 < strArr.length; i18++) {
            java.lang.String str = strArr[i18];
            int i19 = iArr[i18];
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).getClass();
            d85.g0 g0Var = (d85.g0) e85.i.f250316b.get(str);
            if (g0Var != null) {
                hashMap.put(g0Var, i19 == -1 ? z2.h.b(this, str) ? 163L : 164L : 162L);
            }
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            d85.g0 g0Var2 = (d85.g0) entry.getKey();
            java.lang.Long l17 = (java.lang.Long) entry.getValue();
            d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
            java.lang.String str2 = this.f189523q;
            d85.d1 d1Var = (d85.d1) m0Var;
            d1Var.getClass();
            d1Var.tj(g0Var2, l17.longValue(), str2);
        }
        boolean z17 = true;
        if (this.f189518i == 1) {
            j35.b0 b0Var = (j35.b0) j35.u.f297521a.remove(this.f189515f);
            if (b0Var != null) {
                b0Var.onRequestPermissionsResult(i17, strArr, iArr);
            }
        }
        for (int i27 = 0; i27 < strArr.length; i27++) {
            if (iArr[i27] != -1 || z2.h.b(this, strArr[i27])) {
                z17 = false;
                break;
            }
        }
        if (z17 && (cVar = this.f189524r) != null) {
            cVar.cancel(false);
        }
        finish();
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PermissionActivity", "onResume(), scene=%d", java.lang.Integer.valueOf(this.f189518i));
        super.onResume();
        if (!this.f189517h) {
            this.f189517h = true;
            return;
        }
        int i17 = this.f189518i;
        if (i17 == 1) {
            j35.u.l(this, this.f189514e, this.f189516g);
        } else if (i17 == 2) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f189521o) && com.tencent.mm.sdk.platformtools.t8.K0(this.f189520n)) {
                try {
                    startActivityForResult(this.f189519m, 1);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.PermissionActivity", "onResume scene = %d startActivityForResult() Exception = %s ", java.lang.Integer.valueOf(this.f189518i), e17.getMessage());
                }
            } else {
                db5.e1.K(this, false, this.f189521o, this.f189520n, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.g6z), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490347sg), new j35.w(this), new j35.x(this));
            }
        } else if (i17 == 3) {
            if (android.os.Build.VERSION.SDK_INT < 26) {
                android.content.Intent intent = this.f189519m;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/pluginsdk/permission/PermissionActivity", "onResume", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/pluginsdk/permission/PermissionActivity", "onResume", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (getPackageManager().canRequestPackageInstalls()) {
                android.content.Intent intent2 = this.f189519m;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/pluginsdk/permission/PermissionActivity", "onResume", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(this, "com/tencent/mm/pluginsdk/permission/PermissionActivity", "onResume", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                try {
                    startActivityForResult(new android.content.Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", android.net.Uri.parse("package:" + getPackageName())), 1);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.PermissionActivity", "onResume scene = %d startActivityForResult() Exception = %s ", java.lang.Integer.valueOf(this.f189518i), e18.getMessage());
                }
            }
        } else if (i17 == 4) {
            if (com.tencent.mm.booter.o.a().getBoolean("954_95_first", true)) {
                jx3.f.INSTANCE.idkeyStat(954L, 95L, 1L, false);
                com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.booter.o.a();
                a17.getClass();
                a17.putBoolean("954_95_first", false);
            }
            jx3.f.INSTANCE.idkeyStat(954L, 96L, 1L, false);
            db5.e1.K(this, false, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hhj), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hht), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.g6z), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490347sg), new j35.y(this), new j35.z(this));
        }
        this.f189517h = false;
    }
}
