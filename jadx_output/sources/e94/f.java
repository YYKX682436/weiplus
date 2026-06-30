package e94;

/* loaded from: classes3.dex */
public final class f extends android.graphics.drawable.ShapeDrawable.ShaderFactory {
    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public android.graphics.Shader resize(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resize", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView$sf$1");
        android.graphics.LinearGradient linearGradient = new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, i18, new int[]{0, android.graphics.Color.parseColor("#26FFFFFF"), android.graphics.Color.parseColor("#26FFFFFF"), 0}, new float[]{0.0f, 0.25f, 0.75f, 1.0f}, android.graphics.Shader.TileMode.CLAMP);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resize", "com.tencent.mm.plugin.sns.ad.widget.twistad.FlyingFlipAnimView$sf$1");
        return linearGradient;
    }
}
