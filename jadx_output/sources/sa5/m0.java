package sa5;

/* loaded from: classes13.dex */
public final class m0 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f405357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f405358b;

    public m0(boolean z17, float f17) {
        this.f405357a = z17;
        this.f405358b = f17;
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
        if (this.f405357a) {
            height2 = view.getHeight();
            height = 0;
            height3 = 0;
        } else {
            height = view.getHeight();
            height2 = view.getHeight();
            height3 = view.getHeight();
        }
        float f17 = this.f405358b;
        outline.setRect(0, (int) (0 + ((height - 0) * f17)), view.getWidth(), a06.d.b(height2 + ((height3 - height2) * f17)));
    }
}
