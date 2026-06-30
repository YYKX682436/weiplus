package xx;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx.y f457795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xx.c f457796e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(xx.y yVar, xx.c cVar) {
        super(1);
        this.f457795d = yVar;
        this.f457796e = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map getReportCommonData = (java.util.Map) obj;
        kotlin.jvm.internal.o.g(getReportCommonData, "$this$getReportCommonData");
        getReportCommonData.put("loading_duration", java.lang.Long.valueOf(c01.id.a() - this.f457795d.f457830c));
        getReportCommonData.put("loading_end_type", java.lang.Integer.valueOf(this.f457796e.f457779d));
        return jz5.f0.f302826a;
    }
}
