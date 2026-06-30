package qp1;

/* loaded from: classes14.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f365683a = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f480511a00);

    /* renamed from: b, reason: collision with root package name */
    public static final int f365684b = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f480510zz);

    public static final void a(com.tencent.mm.plugin.ball.model.BallInfo.BallBlurInfo blurInfo, com.tencent.mm.plugin.ball.view.FloatBallBlurView floatBallBlurView) {
        kotlin.jvm.internal.o.g(blurInfo, "blurInfo");
        if (floatBallBlurView != null) {
            floatBallBlurView.setBottomMaskColor(blurInfo.f93068f);
            java.lang.String str = blurInfo.f93066d;
            if (str == null || str.length() == 0) {
                floatBallBlurView.setBitmap(blurInfo.f93067e);
            } else {
                floatBallBlurView.setImageUrl(blurInfo.f93066d);
            }
        }
    }
}
