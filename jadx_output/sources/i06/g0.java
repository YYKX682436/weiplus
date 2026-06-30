package i06;

/* loaded from: classes16.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.k0 f286648d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i06.k0 k0Var) {
        super(0);
        this.f286648d = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.reflect.Type[] lowerBounds;
        i06.k0 k0Var = this.f286648d;
        java.lang.reflect.Type type = null;
        if (k0Var.isSuspend()) {
            java.lang.Object k07 = kz5.n0.k0(k0Var.i().a());
            java.lang.reflect.ParameterizedType parameterizedType = k07 instanceof java.lang.reflect.ParameterizedType ? (java.lang.reflect.ParameterizedType) k07 : null;
            if (kotlin.jvm.internal.o.b(parameterizedType != null ? parameterizedType.getRawType() : null, kotlin.coroutines.Continuation.class)) {
                java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                kotlin.jvm.internal.o.f(actualTypeArguments, "getActualTypeArguments(...)");
                java.lang.Object l07 = kz5.z.l0(actualTypeArguments);
                java.lang.reflect.WildcardType wildcardType = l07 instanceof java.lang.reflect.WildcardType ? (java.lang.reflect.WildcardType) l07 : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    type = (java.lang.reflect.Type) kz5.z.L(lowerBounds);
                }
            }
        }
        return type == null ? k0Var.i().getReturnType() : type;
    }
}
