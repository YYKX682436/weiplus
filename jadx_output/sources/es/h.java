package es;

/* loaded from: classes11.dex */
public abstract class h {
    static {
        new android.util.SparseIntArray();
    }

    public static int a(android.content.Context context, int i17) {
        return java.lang.Math.round(b(context) * i17);
    }

    public static float b(android.content.Context context) {
        if (context != null || (context = zc.c.f471339b) != null) {
            return context.getResources().getDisplayMetrics().density;
        }
        kotlin.jvm.internal.o.o("appContext");
        throw null;
    }
}
