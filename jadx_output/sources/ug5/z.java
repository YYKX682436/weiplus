package ug5;

/* loaded from: classes3.dex */
public final class z extends ug5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.fluent.ViewFluentTransparentActivity f427667d;

    public z(com.tencent.mm.ui.fluent.ViewFluentTransparentActivity viewFluentTransparentActivity) {
        this.f427667d = viewFluentTransparentActivity;
    }

    @Override // ug5.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (((java.lang.Boolean) ((ug5.y) this.f427667d.f208611f).invoke(activity)).booleanValue()) {
            com.tencent.mars.xlog.Log.i("ViewFluentTransparentActivity", "unregisterActivityLifecycleCallbacks activity: " + activity + ' ');
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            android.app.Application application = context instanceof android.app.Application ? (android.app.Application) context : null;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this);
            }
        }
    }
}
