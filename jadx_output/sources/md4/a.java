package md4;

/* loaded from: classes3.dex */
public final class a extends android.graphics.drawable.ShapeDrawable.ShaderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f325869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float[] f325870b;

    public a(int[] iArr, float[] fArr) {
        this.f325869a = iArr;
        this.f325870b = fArr;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public android.graphics.Shader resize(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resize", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper$addGradientBackground$pd$1$1");
        android.graphics.LinearGradient linearGradient = new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, i18, this.f325869a, this.f325870b, android.graphics.Shader.TileMode.CLAMP);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resize", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper$addGradientBackground$pd$1$1");
        return linearGradient;
    }
}
