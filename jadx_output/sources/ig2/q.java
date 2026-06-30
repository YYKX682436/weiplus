package ig2;

/* loaded from: classes10.dex */
public final class q extends android.view.TextureView {

    /* renamed from: d, reason: collision with root package name */
    public int f291414d;

    /* renamed from: e, reason: collision with root package name */
    public int f291415e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        setOpaque(false);
        setSurfaceTextureListener(new ig2.p("FluentSwitchTextureView", false));
    }

    public final void a(int i17, int i18) {
        float f17 = i17;
        float f18 = f17 / this.f291414d;
        float f19 = i18;
        float f27 = f19 / this.f291415e;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (f18 < f27) {
            f18 = f27;
        }
        float f28 = 2;
        matrix.preTranslate((f17 - this.f291414d) / f28, (f19 - this.f291415e) / f28);
        matrix.preScale(this.f291414d / f17, this.f291415e / f19);
        matrix.postScale(f18, f18, f17 / f28, f19 / f28);
        setTransform(matrix);
        postInvalidate();
    }

    public final int getVideoHeight() {
        return this.f291415e;
    }

    public final int getVideoWidth() {
        return this.f291414d;
    }

    public final void setVideoHeight(int i17) {
        this.f291415e = i17;
    }

    public final void setVideoWidth(int i17) {
        this.f291414d = i17;
    }
}
