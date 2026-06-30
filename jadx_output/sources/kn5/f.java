package kn5;

/* loaded from: classes10.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final android.graphics.Rect f309807a = new android.graphics.Rect();

    public static final int a(androidx.recyclerview.widget.RecyclerView recyclerView, float f17, float f18) {
        kotlin.jvm.internal.o.g(recyclerView, "<this>");
        android.view.View k07 = recyclerView.k0(java.lang.Math.max(java.lang.Math.min(f17, recyclerView.getWidth()), 0.0f), java.lang.Math.max(java.lang.Math.min(f18, recyclerView.getHeight()), 0.0f));
        if (k07 == null) {
            return -1;
        }
        android.graphics.Rect rect = f309807a;
        if (k07.getGlobalVisibleRect(rect) && ((float) rect.height()) >= (((float) k07.getMeasuredHeight()) / 4.0f) * ((float) 3)) {
            return recyclerView.u0(k07);
        }
        return -1;
    }
}
