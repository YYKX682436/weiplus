package el5;

/* loaded from: classes3.dex */
public final class a extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final int f254035a;

    public a(int i17) {
        this.f254035a = i17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        int i17 = android.os.Build.VERSION.SDK_INT;
        int i18 = this.f254035a;
        if (i17 > 31) {
            android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, view != null ? view.getMeasuredWidth() : 0.0f, view != null ? view.getMeasuredHeight() : 0.0f);
            if (outline != null) {
                outline.setPath(com.tencent.mm.ui.dl.c(rectF, i18, i18, i18, i18, 0.6f));
                return;
            }
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, view != null ? view.getMeasuredWidth() : 0, view != null ? view.getMeasuredHeight() : 0);
        if (outline != null) {
            outline.setRoundRect(rect, i18);
        }
    }
}
