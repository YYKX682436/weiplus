package ug5;

/* loaded from: classes3.dex */
public interface i {
    default void a(android.content.Context context, android.view.View view, android.widget.FrameLayout parent, ug5.v performer) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(performer, "performer");
        com.tencent.mars.xlog.Log.i("ViewFluentPerformer", "onDetachPerformView");
    }

    android.view.View b(android.content.Context context, android.widget.FrameLayout frameLayout, ug5.v vVar);
}
