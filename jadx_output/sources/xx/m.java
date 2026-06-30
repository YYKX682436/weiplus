package xx;

/* loaded from: classes14.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx.y f457803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xx.e f457804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f457805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f457806g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(xx.y yVar, xx.e eVar, boolean z17, java.lang.String str) {
        super(1);
        this.f457803d = yVar;
        this.f457804e = eVar;
        this.f457805f = z17;
        this.f457806g = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map getReportCommonData = (java.util.Map) obj;
        kotlin.jvm.internal.o.g(getReportCommonData, "$this$getReportCommonData");
        long a17 = c01.id.a();
        xx.y yVar = this.f457803d;
        getReportCommonData.put("model_speak_duration", java.lang.Long.valueOf(a17 - yVar.f457831d));
        getReportCommonData.put("model_speak_end_type", java.lang.Integer.valueOf(this.f457804e.f457788d));
        xx.f[] fVarArr = xx.f.f457789d;
        int i17 = 2;
        getReportCommonData.put("model_speak_type", 2);
        getReportCommonData.put("room_type", java.lang.Integer.valueOf(yVar.f457842o.f457793d));
        if (this.f457805f) {
            xx.a[] aVarArr = xx.a.f457769d;
            i17 = 1;
        } else {
            xx.a[] aVarArr2 = xx.a.f457769d;
        }
        getReportCommonData.put("answer_target", java.lang.Integer.valueOf(i17));
        getReportCommonData.put("trace_id", this.f457806g);
        return jz5.f0.f302826a;
    }
}
