package lm4;

/* loaded from: classes3.dex */
public final class s extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f319591a;

    public s(float f17) {
        this.f319591a = f17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        int width = view.getWidth();
        float height = view.getHeight();
        float f17 = this.f319591a;
        outline.setRoundRect(0, 0, width, (int) (height + f17), f17);
    }
}
