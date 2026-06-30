package s2;

/* loaded from: classes3.dex */
public final class y extends android.view.ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline result) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(result, "result");
        result.setRect(0, 0, view.getWidth(), view.getHeight());
        result.setAlpha(0.0f);
    }
}
