package ym5;

/* loaded from: classes5.dex */
public abstract class x {
    public static int a(android.content.Context context, float f17) {
        return (int) android.util.TypedValue.applyDimension(1, f17, context.getResources().getDisplayMetrics());
    }

    public static float b(android.content.Context context, float f17) {
        return f17 / context.getResources().getDisplayMetrics().density;
    }
}
