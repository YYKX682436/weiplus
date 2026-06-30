package dl4;

/* loaded from: classes3.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f235372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235373e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.w1 f235374f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f235375g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dl4.m0 f235376h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ff0.r f235377i;

    public c0(android.graphics.Bitmap bitmap, java.lang.String str, com.tencent.mm.sdk.platformtools.w1 w1Var, android.view.View view, dl4.m0 m0Var, ff0.r rVar) {
        this.f235372d = bitmap;
        this.f235373e = str;
        this.f235374f = w1Var;
        this.f235375g = view;
        this.f235376h = m0Var;
        this.f235377i = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rk4.g4 g4Var = rk4.g4.f396674a;
        dl4.b0 b0Var = new dl4.b0(this.f235373e, this.f235374f, this.f235375g, this.f235376h, this.f235377i);
        android.graphics.Bitmap bitmap = this.f235372d;
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        jz5.l c17 = g4Var.c(bitmap);
        if (c17 == null) {
            b0Var.invoke(null);
            return;
        }
        byte[] imageData = (byte[]) c17.f302833d;
        bw5.tq0 imageInfo = (bw5.tq0) c17.f302834e;
        rk4.e4 e4Var = new rk4.e4(b0Var);
        jm4.w5 w5Var = (jm4.w5) rk4.g4.f396675b;
        w5Var.getClass();
        kotlin.jvm.internal.o.g(imageData, "imageData");
        kotlin.jvm.internal.o.g(imageInfo, "imageInfo");
        byte[] byteArray = imageInfo.toByteArray();
        jm4.x1 x1Var = new jm4.x1();
        x1Var.f300451q = e4Var;
        long cppPointer = w5Var.getCppPointer();
        kotlin.jvm.internal.o.d(byteArray);
        urgen.ur_0025.UR_87ED.UR_0BDC(cppPointer, imageData, byteArray, x1Var);
    }
}
