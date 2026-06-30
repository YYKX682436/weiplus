package xx;

/* loaded from: classes14.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f457813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f457814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xx.b f457815f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String str, long j17, xx.b bVar) {
        super(1);
        this.f457813d = str;
        this.f457814e = j17;
        this.f457815f = bVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map getReportCommonData = (java.util.Map) obj;
        kotlin.jvm.internal.o.g(getReportCommonData, "$this$getReportCommonData");
        getReportCommonData.put("trace_id", this.f457813d);
        getReportCommonData.put("commenter_uin", java.lang.Long.valueOf(this.f457814e));
        getReportCommonData.put("comment_type", java.lang.Integer.valueOf(this.f457815f.f457773d));
        return jz5.f0.f302826a;
    }
}
