package sz3;

/* loaded from: classes15.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz3.v0 f414109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f414110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f414111f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f414112g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sz3.a1 f414113h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sz3.c1 f414114i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(sz3.v0 v0Var, byte[] bArr, int i17, int i18, android.graphics.Point point, sz3.a1 a1Var, sz3.c1 c1Var) {
        super(0);
        this.f414109d = v0Var;
        this.f414110e = bArr;
        this.f414111f = i18;
        this.f414112g = point;
        this.f414113h = a1Var;
        this.f414114i = c1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        sz3.v0 v0Var = this.f414109d;
        byte[] bArr = this.f414110e;
        int i17 = this.f414111f;
        android.graphics.Point point = this.f414112g;
        jz5.l f17 = v0Var.f(bArr, 5, i17, point);
        byte[] bArr2 = (byte[]) f17.f302833d;
        int intValue = ((java.lang.Number) f17.f302834e).intValue();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleProductDetectedForAff asyncEncodeUploadImage cost: ");
        sb6.append(currentTimeMillis2 - currentTimeMillis);
        sb6.append(", ret: ");
        sb6.append(bArr2 != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MixScanGoodsImageHandler", sb6.toString());
        if (bArr2 != null) {
            sz3.a1 a1Var = this.f414113h;
            sz3.y0 y0Var = a1Var.f413963e;
            y0Var.f414169j = bArr2.length;
            int i18 = 2;
            if (intValue != 1) {
                if (intValue != 2) {
                    i18 = 3;
                    if (intValue != 3) {
                        i18 = -1;
                    }
                } else {
                    i18 = 1;
                }
            }
            y0Var.f414174o = i18;
            sz3.b1 b1Var = new sz3.b1(bArr2);
            b1Var.f413968c = intValue;
            b1Var.f413969d = point.x;
            b1Var.f413970e = point.y;
            a1Var.f413962d = b1Var;
            com.tencent.mm.plugin.scanner.model.c cVar = a1Var.f413964f;
            if (cVar != null) {
                cVar.f158829f = 1;
                sz3.y0 y0Var2 = a1Var.f413963e;
                cVar.f158824a = y0Var2.f414174o;
                cVar.f158825b = y0Var2.f414169j;
            }
            this.f414114i.f413978e = null;
        }
        return jz5.f0.f302826a;
    }
}
