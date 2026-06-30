package sz3;

/* loaded from: classes15.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.c1 f414076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.a1 f414077e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sz3.v0 f414078f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f414079g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f414080h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(sz3.c1 c1Var, sz3.a1 a1Var, sz3.v0 v0Var, int i17, int i18) {
        super(3);
        this.f414076d = c1Var;
        this.f414077e = a1Var;
        this.f414078f = v0Var;
        this.f414079g = i17;
        this.f414080h = i18;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        byte[] uploadImageData = (byte[]) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(uploadImageData, "uploadImageData");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, 247);
        com.tencent.mars.xlog.Log.i("MicroMsg.MixScanGoodsImageHandler", "handleClickProduct uploadImageData: " + uploadImageData.length + ", width: " + intValue + ", height: " + intValue2);
        sz3.c1 c1Var = this.f414076d;
        if (c1Var.f413976c == 0) {
            c1Var.f413976c = 1001;
        }
        sz3.p pVar = new sz3.p(this.f414077e, 1, uploadImageData, intValue, intValue2);
        pVar.f413947d = c1Var.f413974a;
        pVar.f413946c = c1Var.f413975b;
        pVar.f413948e = c1Var.f413976c;
        sz3.z0 z0Var = new sz3.z0(this.f414079g, this.f414080h);
        pVar.f413950g = z0Var;
        r45.sk6 sk6Var = new r45.sk6();
        sz3.a1 a1Var = this.f414077e;
        float x17 = a1Var.f413959a.getX1();
        com.tencent.mm.plugin.scanner.model.ScanProductInfo scanProductInfo = a1Var.f413959a;
        float f17 = 2;
        sk6Var.f385818d = (x17 + scanProductInfo.getX2()) / f17;
        sk6Var.f385819e = (scanProductInfo.getY1() + scanProductInfo.getY2()) / f17;
        z0Var.f414181c = sk6Var;
        pVar.f414089k = false;
        this.f414078f.f414128h.n(pVar);
        return jz5.f0.f302826a;
    }
}
