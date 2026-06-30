package xx;

/* loaded from: classes14.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx.y f457798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f457799e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f457800f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(xx.y yVar, boolean z17, java.lang.String str) {
        super(1);
        this.f457798d = yVar;
        this.f457799e = z17;
        this.f457800f = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map getReportCommonData = (java.util.Map) obj;
        kotlin.jvm.internal.o.g(getReportCommonData, "$this$getReportCommonData");
        xx.f[] fVarArr = xx.f.f457789d;
        int i17 = 2;
        getReportCommonData.put("model_speak_type", 2);
        getReportCommonData.put("room_type", java.lang.Integer.valueOf(this.f457798d.f457842o.f457793d));
        if (this.f457799e) {
            xx.a[] aVarArr = xx.a.f457769d;
            i17 = 1;
        } else {
            xx.a[] aVarArr2 = xx.a.f457769d;
        }
        getReportCommonData.put("answer_target", java.lang.Integer.valueOf(i17));
        getReportCommonData.put("trace_id", this.f457800f);
        return jz5.f0.f302826a;
    }
}
