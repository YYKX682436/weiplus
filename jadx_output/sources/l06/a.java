package l06;

/* loaded from: classes13.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final l06.a f314867d = new l06.a();

    public a() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ServiceLoader load = java.util.ServiceLoader.load(l06.c.class, l06.c.class.getClassLoader());
        kotlin.jvm.internal.o.d(load);
        l06.c cVar = (l06.c) kz5.n0.Y(load);
        if (cVar != null) {
            return cVar;
        }
        throw new java.lang.IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
    }
}
