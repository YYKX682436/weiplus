package xx;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx.y f457818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f457819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xx.d f457820f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(xx.y yVar, int i17, xx.d dVar) {
        super(1);
        this.f457818d = yVar;
        this.f457819e = i17;
        this.f457820f = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map getReportCommonData = (java.util.Map) obj;
        kotlin.jvm.internal.o.g(getReportCommonData, "$this$getReportCommonData");
        getReportCommonData.put("voice_id", this.f457818d.f457841n);
        getReportCommonData.put("word_cnt", java.lang.Integer.valueOf(this.f457819e));
        getReportCommonData.put("end_voice_reason", java.lang.Integer.valueOf(this.f457820f.f457783d));
        return jz5.f0.f302826a;
    }
}
