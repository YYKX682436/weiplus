package tr3;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static long f421427b;

    /* renamed from: a, reason: collision with root package name */
    public static final tr3.a f421426a = new tr3.a();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f421428c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.ArrayList f421429d = new java.util.ArrayList();

    public final void a(tr3.b event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (!event.f421431b) {
            f421429d.add(event);
            return;
        }
        ((java.util.HashMap) f421428c).put(java.lang.Integer.valueOf(event.f421430a), event);
    }
}
