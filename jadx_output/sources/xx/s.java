package xx;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx.y f457821d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(xx.y yVar) {
        super(1);
        this.f457821d = yVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map getReportCommonData = (java.util.Map) obj;
        kotlin.jvm.internal.o.g(getReportCommonData, "$this$getReportCommonData");
        getReportCommonData.put("voice_id", this.f457821d.f457841n);
        return jz5.f0.f302826a;
    }
}
