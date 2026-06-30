package db5;

/* loaded from: classes15.dex */
public class k8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.l8 f228423d;

    public k8(db5.l8 l8Var) {
        this.f228423d = l8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        db5.l8 l8Var = this.f228423d;
        l8Var.f228434c.f197608d.getImageMatrix().getValues(l8Var.f228433b);
        float scale = l8Var.f228434c.f197608d.getScale() * l8Var.f228434c.f197608d.getImageWidth();
        float f17 = l8Var.f228433b[2] + scale;
        com.tencent.mm.ui.base.MMViewPager mMViewPager = l8Var.f228434c;
        int i17 = mMViewPager.f197612h;
        float f18 = i17;
        if (scale < i17) {
            f18 = (i17 / 2.0f) + (scale / 2.0f);
        }
        float f19 = f18 - f17;
        db5.f0 f0Var = mMViewPager.f197608d;
        if (f0Var instanceof com.tencent.mm.ui.base.WxImageView) {
            f19 = -((com.tencent.mm.ui.base.WxImageView) f0Var).getTranslationX();
        }
        if (f19 <= 0.0f) {
            l8Var.f228583a = true;
            db5.f0 f0Var2 = l8Var.f228434c.f197608d;
            if (f0Var2 instanceof com.tencent.mm.ui.base.WxImageView) {
                ((com.tencent.mm.ui.base.WxImageView) f0Var2).setDrawFullSampleSizeBitmap(false);
            }
        } else if (java.lang.Math.abs(f19) <= 5.0f) {
            l8Var.f228583a = true;
            db5.f0 f0Var3 = l8Var.f228434c.f197608d;
            if (f0Var3 instanceof com.tencent.mm.ui.base.WxImageView) {
                ((com.tencent.mm.ui.base.WxImageView) f0Var3).setDrawFullSampleSizeBitmap(false);
            }
        } else {
            f19 = ((float) (java.lang.Math.abs(f19) - java.lang.Math.pow(java.lang.Math.sqrt(java.lang.Math.abs(f19)) - 1.0d, 2.0d))) * 2.0f;
        }
        l8Var.f228434c.f197608d.c(f19, 0.0f);
        db5.f0 f0Var4 = l8Var.f228434c.f197608d;
        if (f0Var4 instanceof com.tencent.mm.ui.base.WxImageView) {
            ((com.tencent.mm.ui.base.WxImageView) f0Var4).y(f19, 0.0f);
        }
    }
}
