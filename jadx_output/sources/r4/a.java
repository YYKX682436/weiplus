package r4;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile r4.a f369491d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Object f369492e = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f369495c;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f369494b = new java.util.HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f369493a = new java.util.HashMap();

    public a(android.content.Context context) {
        this.f369495c = context.getApplicationContext();
    }

    public void a(android.os.Bundle bundle) {
        java.util.Set set;
        java.lang.String string = this.f369495c.getString(com.tencent.mm.R.string.f490000i2);
        if (bundle != null) {
            try {
                java.util.HashSet hashSet = new java.util.HashSet();
                java.util.Iterator<java.lang.String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    set = this.f369494b;
                    if (!hasNext) {
                        break;
                    }
                    java.lang.String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        java.lang.Class<?> cls = java.lang.Class.forName(next);
                        if (r4.b.class.isAssignableFrom(cls)) {
                            ((java.util.HashSet) set).add(cls);
                        }
                    }
                }
                java.util.Iterator it6 = ((java.util.HashSet) set).iterator();
                while (it6.hasNext()) {
                    b((java.lang.Class) it6.next(), hashSet);
                }
            } catch (java.lang.ClassNotFoundException e17) {
                throw new r4.c(e17);
            }
        }
    }

    public final java.lang.Object b(java.lang.Class cls, java.util.Set set) {
        if (t4.a.d()) {
            t4.a.f(cls.getSimpleName());
        }
        if (set.contains(cls)) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        java.util.Map map = this.f369493a;
        if (((java.util.HashMap) map).containsKey(cls)) {
            return ((java.util.HashMap) map).get(cls);
        }
        set.add(cls);
        try {
            r4.b bVar = (r4.b) cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            java.util.List<java.lang.Class> dependencies = bVar.dependencies();
            if (!dependencies.isEmpty()) {
                for (java.lang.Class cls2 : dependencies) {
                    if (!((java.util.HashMap) map).containsKey(cls2)) {
                        b(cls2, set);
                    }
                }
            }
            java.lang.Object l07 = bVar.l0(this.f369495c);
            set.remove(cls);
            ((java.util.HashMap) map).put(cls, l07);
            return l07;
        } catch (java.lang.Throwable th6) {
            throw new r4.c(th6);
        }
    }
}
