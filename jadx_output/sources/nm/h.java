package nm;

/* loaded from: classes12.dex */
public final class h extends com.tencent.mm.app.d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f338434d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nm.i f338435e;

    public h(nm.i iVar, nm.d dVar) {
        this.f338435e = iVar;
    }

    public void a(android.app.Application application) {
        application.registerActivityLifecycleCallbacks(this);
        if (android.os.Build.VERSION.SDK_INT < 35) {
            this.f338435e.f338438b.post(this);
            return;
        }
        java.util.List historicalProcessStartReasons = ((android.app.ActivityManager) application.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getHistoricalProcessStartReasons(1);
        if (historicalProcessStartReasons.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FirstScreenArrangement2", "[!] Fail to get startup reason, treat as start without ui.");
            return;
        }
        int reason = ((android.app.ApplicationStartInfo) historicalProcessStartReasons.get(0)).getReason();
        if (reason == 6 || reason == 7 || reason == 11) {
            this.f338434d = true;
        } else {
            this.f338434d = false;
        }
        synchronized (this.f338435e.f338440d) {
            this.f338435e.f338440d[0] = java.lang.Boolean.valueOf(this.f338434d);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FirstScreenArrangement2", "[+] Check has ui created by ApplicationStartInfo, result: %s", java.lang.Boolean.valueOf(this.f338434d));
    }

    @Override // com.tencent.mm.app.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        this.f338434d = true;
    }

    @Override // com.tencent.mm.app.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        android.view.View decorView;
        if (!k95.b.a(activity)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FirstScreenArrangement2", "[!] Not business ui (%s), skip triggering arranged first screen actions.", activity);
            return;
        }
        nm.i iVar = this.f338435e;
        synchronized (iVar.f338440d) {
            if (iVar.f338442f) {
                return;
            }
            android.view.Window window = activity.getWindow();
            if (window == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FirstScreenArrangement2", "[-] Fail to get window of '%s'.", activity);
                decorView = null;
            } else {
                decorView = window.getDecorView();
                if (decorView == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FirstScreenArrangement2", "[-] Fail to get decor view of '%s'.", activity);
                }
            }
            if (decorView == null) {
                iVar.f338438b.a();
            } else if (decorView.getViewTreeObserver() != null) {
                decorView.getViewTreeObserver().addOnGlobalLayoutListener(new nm.e(iVar, decorView));
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.FirstScreenArrangement2", "[-] Fail to get view tree observer of '%s'.", activity);
                iVar.f338438b.a();
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FirstScreenArrangement2", "[+] Startup by ui detect runnable was invoked.");
        synchronized (this.f338435e.f338440d) {
            this.f338435e.f338440d[0] = java.lang.Boolean.valueOf(this.f338434d);
            if (!this.f338434d) {
                nm.i.a(this.f338435e);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FirstScreenArrangement2", "[+] Startup by ui detect runnable was invoked over, has_ui_created: %s", java.lang.Boolean.valueOf(this.f338434d));
        }
    }
}
