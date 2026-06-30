package xx;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx.y f457816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f457817e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(xx.y yVar, int i17) {
        super(1);
        this.f457816d = yVar;
        this.f457817e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map getReportCommonData = (java.util.Map) obj;
        kotlin.jvm.internal.o.g(getReportCommonData, "$this$getReportCommonData");
        getReportCommonData.put("voice_id", this.f457816d.f457841n);
        getReportCommonData.put("word_cnt", java.lang.Integer.valueOf(this.f457817e));
        return jz5.f0.f302826a;
    }
}
