package n0;

/* loaded from: classes16.dex */
public final class m5 extends kotlin.jvm.internal.q implements yz5.a {
    public static final n0.m5 C = new n0.m5();

    public m5() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yo0.f fVar = new yo0.f();
        fVar.f464078b = true;
        fVar.f464077a = true;
        fVar.f464081e = 1080;
        fVar.f464082f = com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
        fVar.f464084h = com.tencent.mm.R.color.BW_97;
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(180L);
        fVar.f464086j = alphaAnimation;
        fVar.f464090n = true;
        return fVar.a();
    }
}
