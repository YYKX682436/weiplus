package yt2;

/* loaded from: classes3.dex */
public final class j extends android.graphics.drawable.ShapeDrawable.ShaderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f465310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float[] f465311b;

    public j(int[] iArr, float[] fArr) {
        this.f465310a = iArr;
        this.f465311b = fArr;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public android.graphics.Shader resize(int i17, int i18) {
        return new android.graphics.LinearGradient(0.0f, 0.0f, i17, i18, this.f465310a, this.f465311b, android.graphics.Shader.TileMode.CLAMP);
    }
}
