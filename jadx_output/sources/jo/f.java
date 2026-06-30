package jo;

/* loaded from: classes13.dex */
public final class f extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatting.widget.RoundClipFrameLayout f300869a;

    public f(com.tencent.mm.chatting.widget.RoundClipFrameLayout roundClipFrameLayout) {
        this.f300869a = roundClipFrameLayout;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            outline.setEmpty();
            return;
        }
        float min = java.lang.Math.min(width * 0.5f, height * 0.5f);
        com.tencent.mm.chatting.widget.RoundClipFrameLayout roundClipFrameLayout = this.f300869a;
        float clipRadius = roundClipFrameLayout.getClipRadius() + roundClipFrameLayout.getOuterStrokeWidth();
        outline.setRoundRect(0, 0, width, height, clipRadius > min ? min : clipRadius);
    }
}
