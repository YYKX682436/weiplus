package o12;

/* loaded from: classes10.dex */
public final class d extends o12.k {

    /* renamed from: b, reason: collision with root package name */
    public static final o12.d f342135b = new o12.d();

    public d() {
        super(null);
    }

    @Override // o12.k
    public boolean a(android.graphics.Rect rect, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(rect, "rect");
        return o12.a.a(com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorClipView.f97451J, rect.right, rect.bottom, i17, i18, i19);
    }

    @Override // o12.k
    public void b(android.view.View view, android.graphics.Rect rect, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(rect, "rect");
        int i27 = rect.left;
        rect.set(i27, rect.top, e06.p.f(rect.right + i17, i27 + i19, view.getWidth() - view.getPaddingRight()), e06.p.f(rect.bottom + i18, rect.top + i19, view.getHeight() - view.getPaddingBottom()));
    }

    @Override // o12.k
    public void c(android.view.View view, android.graphics.Rect rect, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(rect, "rect");
        int min = java.lang.Math.min((view.getWidth() - view.getPaddingRight()) - rect.left, (view.getHeight() - view.getPaddingBottom()) - rect.top);
        if (java.lang.Math.abs(i17) <= java.lang.Math.abs(i18)) {
            i17 = i18;
        }
        int i27 = rect.left;
        int i28 = rect.top;
        int f17 = e06.p.f(rect.right + i17, i27 + i19, i27 + min);
        int i29 = rect.bottom + i17;
        int i37 = rect.top;
        rect.set(i27, i28, f17, e06.p.f(i29, i19 + i37, i37 + min));
    }
}
