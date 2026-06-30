package i06;

/* loaded from: classes12.dex */
public class c4 extends i06.e4 implements yz5.a {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f286615e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.ref.SoftReference f286616f;

    public c4(java.lang.Object obj, yz5.a aVar) {
        if (aVar == null) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }
        this.f286616f = null;
        this.f286615e = aVar;
        if (obj != null) {
            this.f286616f = new java.lang.ref.SoftReference(obj);
        }
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        java.lang.ref.SoftReference softReference = this.f286616f;
        java.lang.Object obj2 = i06.e4.f286629d;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        java.lang.Object invoke = this.f286615e.invoke();
        if (invoke != null) {
            obj2 = invoke;
        }
        this.f286616f = new java.lang.ref.SoftReference(obj2);
        return invoke;
    }
}
