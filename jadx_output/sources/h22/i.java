package h22;

/* loaded from: classes3.dex */
public final class i extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f278304a;

    public i(android.content.Context context) {
        this.f278304a = context;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ym5.x.a(this.f278304a, 8.0f));
    }
}
