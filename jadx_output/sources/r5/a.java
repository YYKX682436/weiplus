package r5;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final r5.a f392511a = new r5.a();

    /* renamed from: b, reason: collision with root package name */
    public static r5.j f392512b;

    public static final r5.j a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        r5.j jVar = f392512b;
        if (jVar != null) {
            return jVar;
        }
        synchronized (f392511a) {
            r5.j jVar2 = f392512b;
            if (jVar2 != null) {
                return jVar2;
            }
            context.getApplicationContext();
            int i17 = r5.j.f392532a;
            r5.j a17 = new r5.i(context).a();
            f392512b = a17;
            return a17;
        }
    }
}
