package nm4;

/* loaded from: classes3.dex */
public final class q extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final float f338507a;

    public q(float f17) {
        this.f338507a = f17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f338507a);
    }
}
