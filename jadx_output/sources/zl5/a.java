package zl5;

/* loaded from: classes3.dex */
public final class a extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f474083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f474084b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f474085c;

    public a(boolean z17, boolean z18, float f17) {
        this.f474083a = z17;
        this.f474084b = z18;
        this.f474085c = f17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        boolean z17 = this.f474084b;
        boolean z18 = this.f474083a;
        if (z18 && z17) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f474085c);
            return;
        }
        if (!z18) {
            if (z17) {
                outline.setRoundRect(0, (int) (0 - this.f474085c), view.getWidth(), view.getHeight(), this.f474085c);
            }
        } else {
            int width = view.getWidth();
            float height = view.getHeight();
            float f17 = this.f474085c;
            outline.setRoundRect(0, 0, width, (int) (height + f17), f17);
        }
    }
}
