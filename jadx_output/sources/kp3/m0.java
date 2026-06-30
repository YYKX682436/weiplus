package kp3;

/* loaded from: classes12.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp3.p0 f311011d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(kp3.p0 p0Var) {
        super(1);
        this.f311011d = p0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintPreviewUIC", "[setFinishBlurIv] get effectBitmap:" + bitmap);
        ((ku5.t0) ku5.t0.f312615d).B(new kp3.l0(this.f311011d, bitmap));
        return jz5.f0.f302826a;
    }
}
