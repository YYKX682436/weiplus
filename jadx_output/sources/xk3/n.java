package xk3;

/* loaded from: classes3.dex */
public final class n extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f455051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f455052b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f455053c;

    public n(boolean z17, boolean z18, float f17) {
        this.f455051a = z17;
        this.f455052b = z18;
        this.f455053c = f17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        boolean z17 = this.f455052b;
        boolean z18 = this.f455051a;
        if (z18 && z17) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f455053c);
            return;
        }
        if (!z18) {
            if (z17) {
                outline.setRoundRect(0, (int) (0 - this.f455053c), view.getWidth(), view.getHeight(), this.f455053c);
            }
        } else {
            int width = view.getWidth();
            float height = view.getHeight();
            float f17 = this.f455053c;
            outline.setRoundRect(0, 0, width, (int) (height + f17), f17);
        }
    }
}
