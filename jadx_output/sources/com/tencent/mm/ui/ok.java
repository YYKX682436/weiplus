package com.tencent.mm.ui;

/* loaded from: classes7.dex */
public class ok implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f209480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f209481e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Application f209482f;

    public ok(com.tencent.mm.ui.pk pkVar, android.app.Activity activity, android.view.View view, android.app.Application application) {
        this.f209480d = activity;
        this.f209481e = view;
        this.f209482f = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        if (this.f209480d == activity) {
            this.f209481e.setOnApplyWindowInsetsListener(null);
            this.f209482f.unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
    }
}
