package ul5;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final ul5.e f428629a = new ul5.e();

    public final int a(java.lang.Class cls) {
        kotlin.jvm.internal.o.g(cls, "cls");
        ul5.d dVar = (ul5.d) cls.getAnnotation(ul5.d.class);
        if (dVar != null) {
            return dVar.value();
        }
        java.lang.Class superclass = cls.getSuperclass();
        if (superclass != null) {
            return a(superclass);
        }
        return 1;
    }
}
