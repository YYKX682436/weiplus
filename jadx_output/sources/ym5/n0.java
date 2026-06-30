package ym5;

/* loaded from: classes15.dex */
public abstract class n0 {
    public boolean getAdditionalCondition(android.view.View target) {
        kotlin.jvm.internal.o.g(target, "target");
        return true;
    }

    public float getExposePercent(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return 0.0f;
    }

    public long getExposedId(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return view.hashCode();
    }

    public abstract void onViewExposed(android.view.View view, long j17, long j18, boolean z17);
}
