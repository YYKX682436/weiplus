package x73;

/* loaded from: classes11.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public static x73.c f452440b;

    /* renamed from: a, reason: collision with root package name */
    public final x73.h f452441a;

    public c(android.content.Context context, x73.h hVar, x73.b bVar) {
        this.f452441a = hVar;
    }

    public static x73.c a(android.content.Context context) {
        synchronized (x73.c.class) {
            if (f452440b == null) {
                if (context == null) {
                    throw new java.lang.RuntimeException("Context must not be null.");
                }
                f452440b = new x73.c(context, new x73.g(context), null);
            }
        }
        return f452440b;
    }
}
