package l6;

/* loaded from: classes16.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static l6.c f316713a;

    public static l6.c c(android.content.Context context) {
        if (f316713a == null) {
            synchronized (l6.c.class) {
                if (f316713a == null) {
                    f316713a = new l6.i(context);
                }
            }
        }
        return f316713a;
    }

    public abstract void a(java.lang.String str, int i17, int i18, int i19, int i27);

    public abstract void b(java.lang.String str, int i17, int i18, int i19, int i27);

    public abstract int d(java.lang.String str);

    public abstract void e();
}
