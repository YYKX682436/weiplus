package dr0;

/* loaded from: classes12.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f242460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f242461e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f242462f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f242463g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(long j17, long j18, long j19, java.util.Map map) {
        super(1);
        this.f242460d = j17;
        this.f242461e = j18;
        this.f242462f = j19;
        this.f242463g = map;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dr0.u0 reportStage = (dr0.u0) obj;
        kotlin.jvm.internal.o.g(reportStage, "$this$reportStage");
        reportStage.f242558a = kz5.c0.i(java.lang.String.valueOf(this.f242460d), java.lang.String.valueOf(this.f242461e), java.lang.String.valueOf(this.f242462f));
        java.util.Map map = this.f242463g;
        kotlin.jvm.internal.o.g(map, "<set-?>");
        reportStage.f242560c = map;
        return jz5.f0.f302826a;
    }
}
