package n2;

/* loaded from: classes14.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f334208a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashSet f334209b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f334210c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f334211d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f334212e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f334213f;

    public d(yz5.a setAnimationsTimeCallback) {
        kotlin.jvm.internal.o.g(setAnimationsTimeCallback, "setAnimationsTimeCallback");
        this.f334208a = new java.util.HashSet();
        this.f334209b = new java.util.HashSet();
        this.f334210c = new java.util.HashMap();
        this.f334211d = new java.lang.Object();
        this.f334212e = new java.util.HashMap();
        this.f334213f = new java.lang.Object();
    }

    public final void a(z.l2 parent, yz5.a onSeek) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(onSeek, "onSeek");
        synchronized (this.f334213f) {
            if (this.f334212e.containsKey(parent)) {
                return;
            }
            this.f334212e.put(parent, new n2.b(((java.lang.Boolean) parent.b()).booleanValue() ? "Exit" : "Enter"));
            java.lang.String str = parent.f468722b;
            if (str == null) {
                str = "AnimatedVisibility";
            }
            n2.a aVar = new n2.a(parent, str);
            java.lang.Object obj = this.f334212e.get(parent);
            kotlin.jvm.internal.o.d(obj);
            jz5.l lVar = kotlin.jvm.internal.o.b(((n2.b) obj).f334205a, "Enter") ? new jz5.l(java.lang.Boolean.FALSE, java.lang.Boolean.TRUE) : new jz5.l(java.lang.Boolean.TRUE, java.lang.Boolean.FALSE);
            parent.g(java.lang.Boolean.valueOf(((java.lang.Boolean) lVar.f302833d).booleanValue()), java.lang.Boolean.valueOf(((java.lang.Boolean) lVar.f302834e).booleanValue()), 0L);
            onSeek.invoke();
            this.f334209b.add(aVar);
        }
    }

    public final void b(z.l2 transition) {
        kotlin.jvm.internal.o.g(transition, "transition");
        synchronized (this.f334211d) {
            if (this.f334210c.containsKey(transition)) {
                return;
            }
            this.f334210c.put(transition, new n2.c(transition.b(), transition.d()));
            java.lang.Object obj = ((z.e2) transition.c()).f468644a;
            java.lang.Object[] enumConstants = obj.getClass().getEnumConstants();
            java.util.Set D0 = enumConstants != null ? kz5.z.D0(enumConstants) : kz5.o1.c(obj);
            java.lang.String str = transition.f468722b;
            if (str == null) {
                str = kotlin.jvm.internal.i0.a(obj.getClass()).g();
            }
            this.f334208a.add(new n2.e(transition, D0, str));
        }
    }
}
