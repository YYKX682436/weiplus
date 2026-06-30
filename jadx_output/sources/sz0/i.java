package sz0;

/* loaded from: classes14.dex */
public abstract class i {
    static {
        jz5.h.a(jz5.i.f302831f, sz0.h.f413924d);
    }

    public static final h1.c a(android.graphics.drawable.Drawable drawable) {
        kotlin.jvm.internal.o.g(drawable, "<this>");
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            android.graphics.Bitmap bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
            kotlin.jvm.internal.o.f(bitmap, "getBitmap(...)");
            return new h1.a(e1.e.b(bitmap), 0L, 0L, 6, null);
        }
        if (drawable instanceof android.graphics.drawable.ColorDrawable) {
            return new h1.b(e1.a0.b(((android.graphics.drawable.ColorDrawable) drawable).getColor()), null);
        }
        if (drawable instanceof android.graphics.drawable.AnimationDrawable) {
            android.graphics.drawable.Drawable mutate = drawable.mutate();
            kotlin.jvm.internal.o.f(mutate, "mutate(...)");
            return new sz0.f(mutate);
        }
        android.graphics.drawable.Drawable mutate2 = drawable.mutate();
        kotlin.jvm.internal.o.f(mutate2, "mutate(...)");
        return new sz0.g(mutate2);
    }
}
