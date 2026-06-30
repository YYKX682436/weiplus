package u06;

/* loaded from: classes12.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final u06.g f423501d = new u06.g();

    public g() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.reflect.ParameterizedType it = (java.lang.reflect.ParameterizedType) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.reflect.Type ownerType = it.getOwnerType();
        if (ownerType instanceof java.lang.reflect.ParameterizedType) {
            return (java.lang.reflect.ParameterizedType) ownerType;
        }
        return null;
    }
}
