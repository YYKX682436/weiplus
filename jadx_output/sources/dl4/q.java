package dl4;

/* loaded from: classes3.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f235456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f235457e;

    public q(android.graphics.Bitmap bitmap, yz5.l lVar) {
        this.f235456d = bitmap;
        this.f235457e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rk4.g4 g4Var = rk4.g4.f396674a;
        dl4.p pVar = new dl4.p(this.f235457e);
        android.graphics.Bitmap bitmap = this.f235456d;
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        jz5.l c17 = g4Var.c(bitmap);
        if (c17 == null) {
            pVar.invoke(null);
            return;
        }
        byte[] imageData = (byte[]) c17.f302833d;
        bw5.tq0 imageInfo = (bw5.tq0) c17.f302834e;
        rk4.f4 f4Var = new rk4.f4(pVar);
        jm4.w5 w5Var = (jm4.w5) rk4.g4.f396675b;
        w5Var.getClass();
        kotlin.jvm.internal.o.g(imageData, "imageData");
        kotlin.jvm.internal.o.g(imageInfo, "imageInfo");
        byte[] byteArray = imageInfo.toByteArray();
        jm4.x1 x1Var = new jm4.x1();
        x1Var.f300451q = f4Var;
        long cppPointer = w5Var.getCppPointer();
        kotlin.jvm.internal.o.d(byteArray);
        urgen.ur_0025.UR_87ED.UR_DB53(cppPointer, imageData, byteArray, true, x1Var);
    }
}
