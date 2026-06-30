package xx;

/* loaded from: classes14.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f457810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f457811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xx.b f457812f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String str, long j17, xx.b bVar) {
        super(1);
        this.f457810d = str;
        this.f457811e = j17;
        this.f457812f = bVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map getReportCommonData = (java.util.Map) obj;
        kotlin.jvm.internal.o.g(getReportCommonData, "$this$getReportCommonData");
        getReportCommonData.put("trace_id", this.f457810d);
        getReportCommonData.put("commenter_uin", java.lang.Long.valueOf(this.f457811e));
        getReportCommonData.put("comment_type", java.lang.Integer.valueOf(this.f457812f.f457773d));
        return jz5.f0.f302826a;
    }
}
