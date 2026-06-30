package com.tencent.mm.splash;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes12.dex */
public class SplashHackActivity extends com.tencent.mm.hellhoundlib.activities.HellActivity {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f193635d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f193636e;

    public SplashHackActivity() {
        this.f193636e = false;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 100) {
            finish();
            com.tencent.mm.splash.j.d("WxSplash.SplashHackActivity", "unknown request code.", new java.lang.Object[0]);
        } else if (i18 != -100) {
            com.tencent.mm.splash.j.d("WxSplash.SplashHackActivity", "Back pressed", new java.lang.Object[0]);
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                finish();
            } else {
                onBackPressed();
            }
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.splash.j.d("WxSplash.SplashHackActivity", "onCreate", new java.lang.Object[0]);
        setVisible(false);
        if (com.tencent.mm.splash.j.b()) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.splash.j.f193657p);
            intent.putExtra("hashcode", hashCode());
            if (!this.f193636e) {
                startActivityForResult(intent, 100);
                overridePendingTransition(0, 0);
                return;
            }
            intent.putExtra("replay_intent", getIntent());
            intent.putExtra("real_activity", this.f193635d);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/splash/SplashHackActivity", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/splash/SplashHackActivity", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
            overridePendingTransition(0, 0);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.splash.j.d("WxSplash.SplashHackActivity", "onDestroy", new java.lang.Object[0]);
        com.tencent.mm.splash.j.f193642a.remove(this);
        setVisible(true);
        super.onDestroy();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        boolean z17 = false;
        com.tencent.mm.splash.j.d("WxSplash.SplashHackActivity", "onNewIntent.", new java.lang.Object[0]);
        com.tencent.mm.splash.d dVar = com.tencent.mm.splash.j.f193646e;
        if (dVar != null) {
            ((com.tencent.mm.legacy.app.n0) dVar).getClass();
            if (intent != null && com.tencent.mm.sdk.platformtools.c2.g(intent, "absolutely_exit_pid", 0) == android.os.Process.myPid()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WeChatSplashStartup", "handle exit intent.");
                com.tencent.mm.ui.vb.h(com.tencent.mm.sdk.platformtools.c2.c(intent, "kill_service", true));
                z17 = true;
            }
            if (z17) {
                finish();
            }
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.splash.j.d("WxSplash.SplashHackActivity", "onPause", new java.lang.Object[0]);
        super.onPause();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.splash.j.d("WxSplash.SplashHackActivity", "onResume", new java.lang.Object[0]);
    }

    public SplashHackActivity(boolean z17) {
        this.f193636e = false;
        this.f193636e = z17;
    }
}
