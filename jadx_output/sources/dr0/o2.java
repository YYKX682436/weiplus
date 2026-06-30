package dr0;

/* loaded from: classes12.dex */
public final class o2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f242483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f242484e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f242485f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(java.lang.String str, java.lang.String str2, java.util.Map map) {
        super(1);
        this.f242483d = str;
        this.f242484e = str2;
        this.f242485f = map;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dr0.u0 reportStage = (dr0.u0) obj;
        kotlin.jvm.internal.o.g(reportStage, "$this$reportStage");
        reportStage.f242558a = kz5.c0.i("no", this.f242483d, this.f242484e);
        java.util.Map map = this.f242485f;
        kotlin.jvm.internal.o.g(map, "<set-?>");
        reportStage.f242560c = map;
        return jz5.f0.f302826a;
    }
}
