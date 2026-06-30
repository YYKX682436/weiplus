package ih;

/* loaded from: classes12.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Application f291465a;

    /* renamed from: b, reason: collision with root package name */
    public qi.c f291466b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.matrix.lifecycle.q f291467c = new com.tencent.matrix.lifecycle.q(new com.tencent.matrix.lifecycle.supervisor.j0(false, false, kz5.p0.f313996d), false, false, new com.tencent.matrix.lifecycle.p(null, 0, 0, null, null, 31, null), false);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f291468d = new java.util.HashSet();

    public c(android.app.Application application) {
        if (application == null) {
            throw new java.lang.RuntimeException("matrix init, application is null");
        }
        this.f291465a = application;
    }

    public ih.c a(qi.b bVar) {
        java.lang.String b17 = bVar.b();
        java.util.HashSet hashSet = this.f291468d;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (b17.equals(((qi.b) it.next()).b())) {
                throw new java.lang.RuntimeException(java.lang.String.format("plugin with tag %s is already exist", b17));
            }
        }
        hashSet.add(bVar);
        return this;
    }
}
