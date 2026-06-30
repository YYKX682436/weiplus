package fq1;

/* loaded from: classes13.dex */
public final class a extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final float f265496a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f265497b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f265498c;

    public a(float f17, boolean z17, boolean z18) {
        this.f265496a = f17;
        this.f265497b = z17;
        this.f265498c = z18;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        float width = view.getWidth();
        float height = view.getHeight();
        android.graphics.Path path = new android.graphics.Path();
        float f17 = this.f265496a;
        boolean z17 = this.f265497b;
        path.moveTo(0.0f, z17 ? f17 : 0.0f);
        if (z17) {
            path.quadTo(0.0f, 0.0f, f17, 0.0f);
            path.lineTo(width - f17, 0.0f);
            path.quadTo(width, 0.0f, width, f17);
        } else {
            path.lineTo(width, 0.0f);
        }
        if (this.f265498c) {
            path.lineTo(width, height - f17);
            path.quadTo(width, height, width - f17, height);
            path.lineTo(f17, height);
            path.quadTo(0.0f, height, 0.0f, height - f17);
        } else {
            path.lineTo(width, height);
            path.lineTo(0.0f, height);
        }
        path.close();
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            outline.setPath(path);
            return;
        }
        try {
            outline.setConvexPath(path);
        } catch (java.lang.IllegalArgumentException e17) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            com.tencent.mars.xlog.Log.w("MicroMsg.BizViewUtils", "setConvexPath failed, fallback to rectangle outline: " + e17.getMessage());
        }
    }
}
