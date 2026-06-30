package oh5;

/* loaded from: classes12.dex */
public final class c extends com.tencent.matrix.lifecycle.a {
    @Override // com.tencent.matrix.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        oh5.d.f345489c = new java.lang.ref.WeakReference(activity);
    }

    @Override // com.tencent.matrix.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        oh5.d.f345489c = new java.lang.ref.WeakReference(activity);
    }
}
