package com.tencent.mm.ui;

/* loaded from: classes7.dex */
public class pk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f209517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.qk f209518e;

    public pk(com.tencent.mm.ui.qk qkVar, android.app.Activity activity) {
        this.f209518e = qkVar;
        this.f209517d = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.Activity activity = this.f209517d;
        android.view.View decorView = activity.getWindow().getDecorView();
        if (decorView == null) {
            return;
        }
        decorView.setOnApplyWindowInsetsListener(new com.tencent.mm.ui.nk(this));
        android.app.Application application = activity.getApplication();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new com.tencent.mm.ui.ok(this, activity, decorView, application));
    }
}
