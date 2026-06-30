package nm4;

/* loaded from: classes9.dex */
public final class p extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.widget.TingChatRoomView f338506a;

    public p(com.tencent.mm.plugin.ting.widget.TingChatRoomView tingChatRoomView) {
        this.f338506a = tingChatRoomView;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        int cornerRadius;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        int width = view.getWidth();
        int height = view.getHeight();
        cornerRadius = this.f338506a.getCornerRadius();
        outline.setRoundRect(0, 0, width, height, cornerRadius);
    }
}
