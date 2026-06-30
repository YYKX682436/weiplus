package t02;

/* loaded from: classes12.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t02.e f414413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f414415f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414416g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ byte[] f414417h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f414418i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t02.e eVar, java.lang.String str, int i17, java.lang.String str2, byte[] bArr, yz5.l lVar) {
        super(0);
        this.f414413d = eVar;
        this.f414414e = str;
        this.f414415f = i17;
        this.f414416g = str2;
        this.f414417h = bArr;
        this.f414418i = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zz.b bj6 = this.f414413d.bj(this.f414414e, this.f414415f, this.f414416g, this.f414417h);
        yz5.l lVar = this.f414418i;
        if (lVar == null) {
            return null;
        }
        lVar.invoke(bj6);
        return jz5.f0.f302826a;
    }
}
