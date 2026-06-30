package f4;

/* loaded from: classes13.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    public final long a(android.view.View view) {
        if (f4.q.f259403a < 0) {
            android.view.Window window = null;
            if ((view != null ? view.getContext() : null) instanceof android.app.Activity) {
                android.content.Context context = view.getContext();
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                window = ((android.app.Activity) context).getWindow();
            }
            float f17 = 60.0f;
            float refreshRate = window != null ? window.getWindowManager().getDefaultDisplay().getRefreshRate() : 60.0f;
            if (refreshRate >= 30.0f && refreshRate <= 200.0f) {
                f17 = refreshRate;
            }
            f4.q.f259403a = (1000 / f17) * 1000000;
        }
        return f4.q.f259403a;
    }
}
