package o12;

/* loaded from: classes10.dex */
public final class c extends o12.k {

    /* renamed from: b, reason: collision with root package name */
    public static final o12.c f342132b = new o12.c();

    public c() {
        super(null);
    }

    @Override // o12.k
    public boolean a(android.graphics.Rect rect, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(rect, "rect");
        return o12.a.a(com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorClipView.f97451J, rect.left, rect.bottom, i17, i18, i19);
    }

    @Override // o12.k
    public void b(android.view.View view, android.graphics.Rect rect, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(rect, "rect");
        int f17 = e06.p.f(rect.left + i17, view.getPaddingLeft(), rect.right - i19);
        int i27 = rect.top;
        rect.set(f17, i27, rect.right, e06.p.f(rect.bottom + i18, i19 + i27, view.getHeight() - view.getPaddingBottom()));
    }

    @Override // o12.k
    public void c(android.view.View view, android.graphics.Rect rect, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(rect, "rect");
        int min = java.lang.Math.min(rect.right - view.getPaddingLeft(), (view.getHeight() - view.getPaddingBottom()) - rect.top);
        if (java.lang.Math.abs(i17) > java.lang.Math.abs(i18)) {
            i18 = -i17;
        }
        int i27 = rect.left - i18;
        int i28 = rect.right;
        int f17 = e06.p.f(i27, i28 - min, i28 - i19);
        int i29 = rect.top;
        rect.set(f17, i29, rect.right, e06.p.f(rect.bottom + i18, i19 + i29, min + i29));
    }
}
