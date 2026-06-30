package y20;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qq.g f459016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qq.c0 f459017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f459018f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(qq.g gVar, qq.c0 c0Var, yz5.l lVar) {
        super(1);
        this.f459016d = gVar;
        this.f459017e = c0Var;
        this.f459018f = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        qq.c option = (qq.c) obj;
        kotlin.jvm.internal.o.g(option, "option");
        qq.c0 testService = this.f459017e;
        kotlin.jvm.internal.o.f(testService, "$testService");
        qq.g gVar = this.f459016d;
        gVar.getClass();
        java.lang.Object value = option.f365861b;
        kotlin.jvm.internal.o.g(value, "value");
        qq.s sVar = (qq.s) testService;
        java.lang.String key = gVar.f365871e;
        kotlin.jvm.internal.o.g(key, "key");
        try {
            java.lang.String concat = "ecs_test_".concat(key);
            if (value instanceof java.lang.Integer) {
                sVar.Di().putInt(concat, ((java.lang.Number) value).intValue());
            } else if (value instanceof java.lang.Long) {
                sVar.Di().putLong(concat, ((java.lang.Number) value).longValue());
            } else if (value instanceof java.lang.String) {
                sVar.Di().putString(concat, (java.lang.String) value);
            } else if (value instanceof java.lang.Boolean) {
                sVar.Di().putBoolean(concat, ((java.lang.Boolean) value).booleanValue());
            } else if (value instanceof java.lang.Float) {
                sVar.Di().putFloat(concat, ((java.lang.Number) value).floatValue());
            } else {
                com.tencent.mars.xlog.Log.e("EcsTestService", "setStringConfig failed for key: " + key + ", value: " + value);
            }
            com.tencent.mars.xlog.Log.i("EcsTestService", "setStringConfig: " + key + " = " + value);
            sVar.wi(key, value);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("EcsTestService", "setStringConfig failed for key: " + key + ", value: " + value, e17);
        }
        this.f459018f.invoke(value);
        return jz5.f0.f302826a;
    }
}
