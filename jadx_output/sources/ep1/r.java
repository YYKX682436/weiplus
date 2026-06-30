package ep1;

/* loaded from: classes3.dex */
public final class r extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f255656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f255657b;

    public r(float f17, float f18) {
        this.f255656a = f17;
        this.f255657b = f18;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        float f17 = this.f255656a;
        outline.setRoundRect(0, (int) f17, view.getWidth(), view.getHeight() - ((int) f17), this.f255657b);
    }
}
