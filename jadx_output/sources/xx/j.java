package xx;

/* loaded from: classes14.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx.y f457797d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(xx.y yVar) {
        super(1);
        this.f457797d = yVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        java.util.Map getReportCommonData = (java.util.Map) obj;
        kotlin.jvm.internal.o.g(getReportCommonData, "$this$getReportCommonData");
        xx.y yVar = this.f457797d;
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
