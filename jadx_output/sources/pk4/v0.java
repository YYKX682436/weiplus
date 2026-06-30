package pk4;

/* loaded from: classes4.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f356529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f356530e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(int i17, int i18) {
        super(1);
        this.f356529d = i17;
        this.f356530e = i18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ok4.d report = (ok4.d) obj;
        kotlin.jvm.internal.o.g(report, "$this$report");
        report.onError(this.f356529d, this.f356530e);
        return jz5.f0.f302826a;
    }
}
