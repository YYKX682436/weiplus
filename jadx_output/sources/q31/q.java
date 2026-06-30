package q31;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ q31.q f359918a = new q31.q();

    public final q31.o a(java.lang.Class clazz) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(clazz, "clazz");
        java.lang.Iterable all = ((fs.c) fs.g.f(q31.o.class)).all();
        kotlin.jvm.internal.o.f(all, "all(...)");
        java.util.Iterator it = all.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (clazz.isInstance(((fs.q) obj).get())) {
                break;
            }
        }
        fs.q qVar = (fs.q) obj;
        q31.o oVar = qVar != null ? (q31.o) qVar.get() : null;
        if (oVar instanceof q31.o) {
            return oVar;
        }
        return null;
    }
}
