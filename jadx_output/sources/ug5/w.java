package ug5;

/* loaded from: classes3.dex */
public final class w extends ug5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f427664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f427665e;

    public w(yz5.l lVar, android.content.Context context) {
        this.f427664d = lVar;
        this.f427665e = context;
    }

    @Override // ug5.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (((java.lang.Boolean) this.f427664d.invoke(activity)).booleanValue()) {
            com.tencent.mars.xlog.Log.i("ViewFluentPerformer", "unregisterActivityLifecycleCallbacks destroy activity: " + activity);
            ((android.app.Application) this.f427665e).unregisterActivityLifecycleCallbacks(this);
        }
    }
}
