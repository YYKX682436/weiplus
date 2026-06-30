package zs5;

/* loaded from: classes15.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f475403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zs5.y f475404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f475405f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j17, zs5.y yVar, long j18) {
        super(0);
        this.f475403d = j17;
        this.f475404e = yVar;
        this.f475405f = j18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        at5.b bVar;
        zs5.y yVar = this.f475404e;
        com.tencent.wechat.aff.iam_scan.d1 d1Var = yVar.f475508i;
        long j17 = this.f475403d;
        if ((d1Var != null && j17 == d1Var.f216985d) && (bVar = yVar.f475523x) != null) {
            bVar.c(j17, this.f475405f);
        }
        return jz5.f0.f302826a;
    }
}
