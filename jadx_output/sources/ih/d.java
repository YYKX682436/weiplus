package ih;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    public static volatile ih.d f291469c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f291470a;

    /* renamed from: b, reason: collision with root package name */
    public final android.app.Application f291471b;

    public d(android.app.Application application, qi.c cVar, java.util.HashSet hashSet, com.tencent.matrix.lifecycle.q qVar, ih.b bVar) {
        this.f291471b = application;
        this.f291470a = hashSet;
        com.tencent.matrix.lifecycle.g0.a(application, qVar);
        com.tencent.matrix.lifecycle.supervisor.d0.f52834k.c(application, qVar.f52775a);
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((qi.b) it.next()).c(this.f291471b, cVar);
        }
    }

    public static boolean c() {
        return f291469c != null;
    }

    public static ih.d d() {
        if (f291469c != null) {
            return f291469c;
        }
        throw new java.lang.RuntimeException("you must init Matrix sdk first");
    }

    public qi.b a(java.lang.Class cls) {
        java.lang.String name = cls.getName();
        java.util.Iterator it = this.f291470a.iterator();
        while (it.hasNext()) {
            qi.b bVar = (qi.b) it.next();
            if (bVar.getClass().getName().equals(name)) {
                return bVar;
            }
        }
        return null;
    }

    public qi.b b(java.lang.String str) {
        java.util.Iterator it = this.f291470a.iterator();
        while (it.hasNext()) {
            qi.b bVar = (qi.b) it.next();
            if (bVar.b().equals(str)) {
                return bVar;
            }
        }
        return null;
    }
}
