package ew3;

/* loaded from: classes.dex */
public abstract class a implements ew3.c {
    public java.util.Set a(java.lang.String str) {
        java.util.HashSet hashSet;
        java.util.Set b17 = b();
        if (str != null) {
            hashSet = new java.util.HashSet(d(str));
        } else {
            hashSet = new java.util.HashSet();
            java.util.Iterator it = c().keySet().iterator();
            while (it.hasNext()) {
                hashSet.addAll(d((java.lang.String) it.next()));
            }
        }
        java.util.Iterator it6 = b17.iterator();
        while (it6.hasNext()) {
            java.lang.Object newInstance = ((java.lang.Class) it6.next()).getConstructors()[0].newInstance(new java.lang.Object[0]);
            if (newInstance instanceof ew3.c) {
                hashSet.addAll(((ew3.a) ((ew3.c) newInstance)).a(str));
            }
        }
        return hashSet;
    }

    public java.util.Set b() {
        return kz5.r0.f314002d;
    }

    public java.util.Map c() {
        return kz5.q0.f314001d;
    }

    public java.util.Set d(java.lang.String type) {
        kotlin.jvm.internal.o.g(type, "type");
        return (java.util.Set) c().getOrDefault(type, kz5.r0.f314002d);
    }
}
