package pk0;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f355413a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f355414b = new java.util.HashMap();

    public static void a(java.lang.String str) {
        java.util.Set<pk0.b> set;
        if (str == null || str.length() == 0) {
            return;
        }
        java.util.Map map = f355414b;
        synchronized (map) {
            set = (java.util.Set) ((java.util.HashMap) map).remove(str);
        }
        if (set == null) {
            return;
        }
        rk0.c.c("IPC.ObjectRecycler", "recycleAll(%s)", str);
        synchronized (set) {
            for (pk0.b bVar : set) {
                rk0.c.c("IPC.ObjectRecycler", "recycle(%s)", java.lang.Integer.valueOf(bVar.hashCode()));
                ((com.tencent.mm.ipcinvoker.b0) bVar).e();
            }
            set.clear();
        }
    }
}
