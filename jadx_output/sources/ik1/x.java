package ik1;

/* loaded from: classes7.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f291845a = new x.b();

    public void a() {
        synchronized (this.f291845a) {
            java.util.Iterator it = ((x.b) this.f291845a).values().iterator();
            while (it.hasNext()) {
                ((java.util.Set) it.next()).clear();
            }
            ((x.n) this.f291845a).clear();
        }
    }

    public void b(java.lang.Object obj, m3.a aVar) {
        if (obj == null || aVar == null) {
            return;
        }
        java.util.Iterator it = d(obj).iterator();
        while (it.hasNext()) {
            aVar.accept(it.next());
        }
    }

    public final java.util.Set c(java.lang.Object obj, boolean z17) {
        java.util.Set set;
        synchronized (this.f291845a) {
            set = (java.util.Set) ((x.n) this.f291845a).getOrDefault(obj, null);
            if (set == null && z17) {
                set = new java.util.HashSet();
                ((x.n) this.f291845a).put(obj, set);
            }
        }
        return set;
    }

    public java.util.Set d(java.lang.Object obj) {
        java.util.HashSet hashSet;
        if (obj == null) {
            return null;
        }
        java.util.Set c17 = c(obj, false);
        if (c17 == null) {
            return java.util.Collections.emptySet();
        }
        synchronized (c17) {
            hashSet = new java.util.HashSet(c17);
        }
        return hashSet;
    }

    public boolean e(java.lang.Object obj, java.lang.Object obj2) {
        boolean add;
        if (obj == null || obj2 == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            return false;
        }
        java.util.Set c17 = c(obj, true);
        synchronized (c17) {
            add = c17.add(obj2);
        }
        return add;
    }

    public boolean f(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Set c17;
        boolean remove;
        if (obj2 == null || (c17 = c(obj, false)) == null) {
            return false;
        }
        synchronized (c17) {
            remove = c17.remove(obj2);
        }
        return remove;
    }

    public java.util.Set g(java.lang.Object obj) {
        java.util.Set set;
        if (obj == null) {
            return null;
        }
        synchronized (this.f291845a) {
            set = (java.util.Set) ((x.n) this.f291845a).remove(obj);
        }
        return set;
    }
}
