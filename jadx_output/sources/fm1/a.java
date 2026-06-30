package fm1;

/* loaded from: classes7.dex */
public final class a extends ik1.a {
    @Override // ik1.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        int indexOfValue;
        kotlin.jvm.internal.o.g(activity, "activity");
        android.util.SparseArray sparseArray = fm1.b.f264015b;
        if (sparseArray.size() > 0 && (indexOfValue = sparseArray.indexOfValue(activity)) >= 0) {
            sparseArray.removeAt(indexOfValue);
        }
    }
}
