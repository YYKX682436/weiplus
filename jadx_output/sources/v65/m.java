package v65;

/* loaded from: classes5.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlinx.coroutines.y0 f433580a = new v65.l();

    public static final kotlinx.coroutines.y0 a(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        if (!(view.getContext() instanceof androidx.lifecycle.y)) {
            return f433580a;
        }
        java.lang.Object context = view.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        androidx.lifecycle.o mo133getLifecycle = ((androidx.lifecycle.y) context).mo133getLifecycle();
        kotlin.jvm.internal.o.f(mo133getLifecycle, "getLifecycle(...)");
        return androidx.lifecycle.w.a(mo133getLifecycle);
    }

    public static final kotlinx.coroutines.y0 b(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        kotlin.jvm.internal.o.g(appCompatActivity, "<this>");
        androidx.lifecycle.o mo133getLifecycle = appCompatActivity.mo133getLifecycle();
        kotlin.jvm.internal.o.f(mo133getLifecycle, "getLifecycle(...)");
        return androidx.lifecycle.w.a(mo133getLifecycle);
    }
}
