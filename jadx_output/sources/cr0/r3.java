package cr0;

/* loaded from: classes12.dex */
public final class r3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f221736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221737e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221738f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221739g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(0);
        this.f221736d = i17;
        this.f221737e = str;
        this.f221738f = str2;
        this.f221739g = str3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Long>> accRxStats = this.f221736d == 0 ? cr0.w3.f221800a.a().getAccRxStats() : cr0.w3.f221800a.a().getAccTxStats();
        com.tencent.mm.matrix.battery.AccBinderCallsStats.Companion.getClass();
        kotlin.jvm.internal.o.g(accRxStats, "<this>");
        java.util.Map c17 = kotlin.jvm.internal.m0.c(accRxStats);
        java.lang.String str = this.f221737e;
        java.lang.Object obj = c17.get(str);
        if (obj == null) {
            obj = new java.util.LinkedHashMap();
            c17.put(str, obj);
        }
        java.util.Map map = (java.util.Map) obj;
        java.util.Map c18 = kotlin.jvm.internal.m0.c(map);
        java.lang.String str2 = this.f221738f;
        java.lang.Object obj2 = map.get(str2);
        if (obj2 == null) {
            obj2 = 0L;
        }
        c18.put(str2, java.lang.Long.valueOf(((java.lang.Number) obj2).longValue() + java.lang.Long.parseLong(this.f221739g)));
        cr0.w3 w3Var = cr0.w3.f221800a;
        if (w3Var.a().getAccBeginTime() <= 0) {
            w3Var.a().setAccBeginTime(java.lang.System.currentTimeMillis());
        }
        return jz5.f0.f302826a;
    }
}
