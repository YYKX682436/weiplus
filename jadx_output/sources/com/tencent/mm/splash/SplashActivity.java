package com.tencent.mm.splash;

/* loaded from: classes12.dex */
public class SplashActivity extends com.tencent.mm.hellhoundlib.activities.HellActivity {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f193627h = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Intent f193628d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f193629e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f193630f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f193631g = false;

    public final void K6() {
        com.tencent.mm.splash.j.d("WxSplash.SplashActivity", "Call requestPermissions.", new java.lang.Object[0]);
        ((com.tencent.mm.legacy.app.n0) com.tencent.mm.splash.j.f193646e).f68510a.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "ingore check permission on init");
        M6();
    }

    public void L6() {
        com.tencent.mm.splash.d dVar = com.tencent.mm.splash.j.f193646e;
        if (dVar == null) {
            com.tencent.mm.splash.j.d("WxSplash.SplashActivity", "permissions delegate is null, call splash finish directly.", new java.lang.Object[0]);
            M6();
            return;
        }
        com.tencent.mm.splash.k kVar = new com.tencent.mm.splash.k(this);
        com.tencent.mm.legacy.app.n0 n0Var = (com.tencent.mm.legacy.app.n0) dVar;
        n0Var.getClass();
        if (((!gm0.j1.b().n() && c01.b9.f37069c.a("login_user_name", "").equals("")) && com.tencent.mm.sdk.platformtools.a0.f192447j) ? com.tencent.mm.ui.vb.j(this, new com.tencent.mm.legacy.app.m0(n0Var, kVar)) : false) {
            com.tencent.mm.splash.j.d("WxSplash.SplashActivity", "Waiting for GPRS permission permit.", new java.lang.Object[0]);
        } else {
            K6();
        }
    }

    public final void M6() {
        com.tencent.mm.splash.j.d("WxSplash.SplashActivity", "Call splashFinished.", new java.lang.Object[0]);
        if (this.f193631g) {
            return;
        }
        this.f193631g = true;
        com.tencent.mm.splash.j.d("WxSplash.SplashActivity", "this.isFinishing() = %s.", java.lang.Boolean.valueOf(isFinishing()));
        if (isFinishing()) {
            onBackPressed();
        } else {
            if (l75.d1.f316945a) {
                android.content.Intent intent = new android.content.Intent();
                intent.setComponent(new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageName(), "com.tencent.mm.plugin.clean.ui.fileindexui.StorageDisableAlertUI"));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/splash/SplashActivity", "splashFinished", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/splash/SplashActivity", "splashFinished", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
            if (this.f193630f) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setClassName(this, this.f193629e);
                intent2.setAction(this.f193628d.getAction());
                intent2.putExtras(this.f193628d);
                intent2.setClipData(this.f193628d.getClipData());
                com.tencent.mm.splash.j.d("WxSplash.SplashActivity", "mReplayRealActivity %s, mReplayIntent.getFlags() %x", this.f193629e, java.lang.Integer.valueOf(this.f193628d.getFlags()));
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    intent2.setIdentifier(this.f193628d.getIdentifier());
                }
                intent2.setSourceBounds(this.f193628d.getSourceBounds());
                intent2.setPackage(this.f193628d.getPackage());
                intent2.setDataAndType(this.f193628d.getData(), this.f193628d.getType());
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/splash/SplashActivity", "splashFinished", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(this, "com/tencent/mm/splash/SplashActivity", "splashFinished", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                overridePendingTransition(com.tencent.mm.R.anim.f477898em, com.tencent.mm.R.anim.f477899en);
                new android.os.Handler().postDelayed(new com.tencent.mm.splash.l(this), 300L);
            } else {
                setResult(-100);
                int intExtra = getIntent().getIntExtra("hashcode", 0);
                com.tencent.mm.splash.j.d("WxSplash.SplashActivity", "target hashcode = %s.", java.lang.Integer.valueOf(intExtra));
                java.util.Iterator it = com.tencent.mm.splash.j.f193642a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.tencent.mm.splash.SplashHackActivity splashHackActivity = (com.tencent.mm.splash.SplashHackActivity) it.next();
                    int hashCode = splashHackActivity.hashCode();
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    objArr[0] = java.lang.Integer.valueOf(hashCode);
                    objArr[1] = java.lang.Boolean.valueOf(intExtra == hashCode);
                    com.tencent.mm.splash.j.d("WxSplash.SplashActivity", "compare hashcode = %s, result: %s.", objArr);
                    if (intExtra == hashCode) {
                        com.tencent.mm.splash.j.h(splashHackActivity);
                        break;
                    }
                }
                new android.os.Handler().postDelayed(new com.tencent.mm.splash.m(this), 50L);
            }
        }
        new android.os.Handler().postDelayed(new com.tencent.mm.splash.n(this), 5000L);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        km0.c cVar;
        super.onCreate(bundle);
        ((java.util.HashSet) com.tencent.mm.splash.j.f193649h).add(this);
        com.tencent.mm.splash.j.d("WxSplash.SplashActivity", "onCreate", new java.lang.Object[0]);
        this.f193628d = (android.content.Intent) getIntent().getParcelableExtra("replay_intent");
        this.f193629e = getIntent().getStringExtra("real_activity");
        this.f193630f = this.f193628d != null;
        if (!com.tencent.mm.splash.j.f193650i) {
            com.tencent.mm.splash.j.d("WxSplash.SplashActivity", "no need splash, finish", new java.lang.Object[0]);
            L6();
        }
        if (com.tencent.mm.splash.j.f193655n == null || (cVar = com.tencent.mm.legacy.app.WeChatSplash.f68485a) == null || !cVar.a() || !com.tencent.mm.sdk.platformtools.x2.l()) {
            return;
        }
        com.tencent.mm.sdk.platformtools.x2.t();
        com.tencent.mm.xlog.app.XLogSetup.realSetupXlog();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        ((java.util.HashSet) com.tencent.mm.splash.j.f193649h).remove(this);
        com.tencent.mm.splash.j.d("WxSplash.SplashActivity", "onDestroy", new java.lang.Object[0]);
        super.onDestroy();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.splash.j.d("WxSplash.SplashActivity", "onPause", new java.lang.Object[0]);
        super.onPause();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.tencent.mm.splash.d dVar = com.tencent.mm.splash.j.f193646e;
        if (dVar != null) {
            ((com.tencent.mm.legacy.app.n0) dVar).f68510a.a(this, i17, strArr, iArr);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.splash.j.d("WxSplash.SplashActivity", "onResume", new java.lang.Object[0]);
    }
}
