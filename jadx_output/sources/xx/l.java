package xx;

/* loaded from: classes14.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx.y f457801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xx.e f457802e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(xx.y yVar, xx.e eVar) {
        super(1);
        this.f457801d = yVar;
        this.f457802e = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        java.util.Map getReportCommonData = (java.util.Map) obj;
        kotlin.jvm.internal.o.g(getReportCommonData, "$this$getReportCommonData");
        long a17 = c01.id.a();
        xx.y yVar = this.f457801d;
        getReportCommonData.put("model_speak_duration", java.lang.Long.valueOf(a17 - yVar.f457831d));
        getReportCommonData.put("model_speak_end_type", java.lang.Integer.valueOf(this.f457802e.f457788d));
        if (yVar.f457837j) {
            xx.f[] fVarArr = xx.f.f457789d;
            i17 = 2;
        } else {
            xx.f[] fVarArr2 = xx.f.f457789d;
            i17 = 1;
        }
        getReportCommonData.put("model_speak_type", java.lang.Integer.valueOf(i17));
        getReportCommonData.put("room_type", java.lang.Integer.valueOf(yVar.f457842o.f457793d));
        return jz5.f0.f302826a;
    }
}
