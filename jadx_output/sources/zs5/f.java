package zs5;

/* loaded from: classes15.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zs5.y f475351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f475352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.iam_scan.y f475353f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(zs5.y yVar, byte[] bArr, com.tencent.wechat.aff.iam_scan.y yVar2) {
        super(0);
        this.f475351d = yVar;
        this.f475352e = bArr;
        this.f475353f = yVar2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        at5.b bVar = this.f475351d.f475523x;
        if (bVar != null) {
            bVar.d(this.f475352e, this.f475353f);
        }
        return jz5.f0.f302826a;
    }
}
