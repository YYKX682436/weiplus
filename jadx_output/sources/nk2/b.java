package nk2;

/* loaded from: classes3.dex */
public final class b extends com.tencent.mm.app.d {
    @Override // com.tencent.mm.app.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (nk2.c.f337962c) {
            java.lang.String simpleName = activity.getClass().getSimpleName();
            ((java.util.ArrayList) nk2.c.f337961b).add(simpleName);
            com.tencent.mars.xlog.Log.i("ExitLiveEventRecorder", "#onActivityCreated name=".concat(simpleName));
        }
    }
}
