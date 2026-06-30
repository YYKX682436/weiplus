package xx;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx.y f457824d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(xx.y yVar) {
        super(1);
        this.f457824d = yVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map getReportCommonData = (java.util.Map) obj;
        kotlin.jvm.internal.o.g(getReportCommonData, "$this$getReportCommonData");
        getReportCommonData.put("speak_duration", java.lang.Long.valueOf(c01.id.a() - this.f457824d.f457829b));
        return jz5.f0.f302826a;
    }
}
