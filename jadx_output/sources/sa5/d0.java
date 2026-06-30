package sa5;

/* loaded from: classes13.dex */
public final class d0 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f405333a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f405334b;

    public d0(boolean z17, float f17) {
        this.f405333a = z17;
        this.f405334b = f17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        int height;
        int height2;
        int height3;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            return;
        }
        if (this.f405333a) {
            height3 = view.getHeight();
            height = 0;
            height2 = 0;
        } else {
            height = view.getHeight();
            height2 = view.getHeight();
            height3 = view.getHeight();
        }
        float f17 = this.f405334b;
        outline.setRect(0, (int) (height + ((0 - height) * f17)), view.getWidth(), a06.d.b(height2 + ((height3 - height2) * f17)));
    }
}
