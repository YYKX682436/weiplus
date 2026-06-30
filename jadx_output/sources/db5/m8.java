package db5;

/* loaded from: classes15.dex */
public class m8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.n8 f228441d;

    public m8(db5.n8 n8Var) {
        this.f228441d = n8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        db5.n8 n8Var = this.f228441d;
        n8Var.f228450c.f197608d.getImageMatrix().getValues(n8Var.f228449b);
        float f17 = n8Var.f228449b[5];
        float scale = n8Var.f228450c.f197608d.getScale() * n8Var.f228450c.f197608d.getImageHeight();
        com.tencent.mm.ui.base.MMViewPager mMViewPager = n8Var.f228450c;
        int i17 = mMViewPager.f197613i;
        float f18 = (scale < ((float) i17) ? (i17 / 2.0f) - (scale / 2.0f) : 0.0f) - f17;
        db5.f0 f0Var = mMViewPager.f197608d;
        if (f0Var instanceof com.tencent.mm.ui.base.WxImageView) {
            f18 = -((com.tencent.mm.ui.base.WxImageView) f0Var).getTranslationY();
        }
        if (f18 >= 0.0f) {
            n8Var.f228583a = true;
        } else if (java.lang.Math.abs(f18) <= 5.0f) {
            n8Var.f228583a = true;
        } else {
            f18 = (-((float) (java.lang.Math.abs(f18) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f18)) - 1.0d, 2.0d)))) * 2.0f;
        }
        n8Var.f228450c.f197608d.c(0.0f, f18);
        db5.f0 f0Var2 = n8Var.f228450c.f197608d;
        if (f0Var2 instanceof com.tencent.mm.ui.base.WxImageView) {
            ((com.tencent.mm.ui.base.WxImageView) f0Var2).y(0.0f, f18);
        }
    }
}
