package zs5;

/* loaded from: classes15.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zs5.y f475469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f475470e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f475471f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f475472g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f475473h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(zs5.y yVar, long j17, java.util.List list, java.util.List list2, android.os.Bundle bundle) {
        super(0);
        this.f475469d = yVar;
        this.f475470e = j17;
        this.f475471f = list;
        this.f475472g = list2;
        this.f475473h = bundle;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        at5.b bVar = this.f475469d.f475523x;
        if (bVar != null) {
            bVar.b(this.f475470e, this.f475471f, this.f475472g, kz5.p0.f313996d, this.f475473h);
        }
        zs5.c cVar = this.f475469d.f475516q;
        if (cVar != null) {
            zs5.y yVar = this.f475469d;
            long j17 = this.f475470e;
            com.tencent.wechat.aff.iam_scan.d1 d1Var = cVar.f475328c;
            d1Var.f216993o = com.tencent.wechat.aff.iam_scan.f1.DECODE_SUCCESS;
            yVar.a(j17, d1Var);
        }
        return jz5.f0.f302826a;
    }
}
