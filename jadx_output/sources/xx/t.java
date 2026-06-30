package xx;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx.y f457822d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(xx.y yVar) {
        super(1);
        this.f457822d = yVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map getReportCommonData = (java.util.Map) obj;
        kotlin.jvm.internal.o.g(getReportCommonData, "$this$getReportCommonData");
        getReportCommonData.put("human_enter_room_duration", java.lang.Long.valueOf(c01.id.a() - this.f457822d.f457828a));
        return jz5.f0.f302826a;
    }
}
