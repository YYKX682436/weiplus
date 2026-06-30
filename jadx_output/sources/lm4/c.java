package lm4;

/* loaded from: classes3.dex */
public final class c extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f319541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f319542b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f319543c;

    public c(boolean z17, boolean z18, float f17) {
        this.f319541a = z17;
        this.f319542b = z18;
        this.f319543c = f17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        boolean z17 = this.f319542b;
        boolean z18 = this.f319541a;
        if (z18 && z17) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f319543c);
            return;
        }
        if (!z18) {
            if (z17) {
                outline.setRoundRect(0, (int) (0 - this.f319543c), view.getWidth(), view.getHeight(), this.f319543c);
            }
        } else {
            int width = view.getWidth();
            float height = view.getHeight();
            float f17 = this.f319543c;
            outline.setRoundRect(0, 0, width, (int) (height + f17), f17);
        }
    }
}
