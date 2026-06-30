package sz3;

/* loaded from: classes15.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f414072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sz3.a1 f414073e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f414074f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(kotlin.jvm.internal.h0 h0Var, sz3.a1 a1Var, yz5.q qVar) {
        super(0);
        this.f414072d = h0Var;
        this.f414073e = a1Var;
        this.f414074f = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sz3.a1 a1Var = this.f414073e;
        sz3.b1 b1Var = a1Var.f413962d;
        byte[] a17 = b1Var != null ? b1Var.a() : null;
        kotlin.jvm.internal.h0 h0Var = this.f414072d;
        h0Var.f310123d = a17;
        sz3.b1 b1Var2 = a1Var.f413962d;
        int i17 = b1Var2 != null ? b1Var2.f413968c : 0;
        int i18 = b1Var2 != null ? b1Var2.f413969d : 0;
        int i19 = b1Var2 != null ? b1Var2.f413970e : 0;
        com.tencent.mm.plugin.scanner.model.ScanProductInfo scanProductInfo = a1Var.f413959a;
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MixScanGoodsImageHandler", "handleClickProductAff uploadImageData null and use showImageData");
            sz3.b1 b1Var3 = a1Var.f413961c;
            h0Var.f310123d = b1Var3 != null ? b1Var3.a() : null;
            sz3.b1 b1Var4 = a1Var.f413961c;
            i17 = b1Var4 != null ? b1Var4.f413968c : 0;
            i18 = b1Var4 != null ? b1Var4.f413969d : 0;
            int i27 = b1Var4 != null ? b1Var4.f413970e : 0;
            scanProductInfo.setX1(0.0f);
            scanProductInfo.setY1(0.0f);
            scanProductInfo.setX2(1.0f);
            scanProductInfo.setY2(1.0f);
            i19 = i27;
        }
        java.lang.Object obj = h0Var.f310123d;
        if (obj != null) {
            a1Var.f413963e.f414169j = ((byte[]) obj).length;
            sz3.y0 y0Var = a1Var.f413963e;
            int i28 = 2;
            if (i17 != 1) {
                if (i17 != 2) {
                    i28 = 3;
                    if (i17 != 3) {
                        i28 = -1;
                    }
                } else {
                    i28 = 1;
                }
            }
            y0Var.f414174o = i28;
            com.tencent.mm.plugin.scanner.model.c cVar = a1Var.f413964f;
            if (cVar != null) {
                cVar.f158829f = 1;
                cVar.f158824a = i28;
                cVar.f158825b = y0Var.f414169j;
            }
            byte[] bArr = (byte[]) h0Var.f310123d;
            if (bArr != null) {
                this.f414074f.invoke(bArr, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MixScanGoodsImageHandler", "handleClickProductAff uploadImageData null, id: " + scanProductInfo.getId() + ", classId: " + scanProductInfo.getClassId());
        }
        return jz5.f0.f302826a;
    }
}
