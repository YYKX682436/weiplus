package o12;

/* loaded from: classes10.dex */
public final class i extends o12.k {

    /* renamed from: b, reason: collision with root package name */
    public static final o12.i f342156b = new o12.i();

    public i() {
        super(null);
    }

    @Override // o12.k
    public boolean a(android.graphics.Rect rect, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(rect, "rect");
        return o12.a.a(com.tencent.mm.plugin.emoji.editor.widgets.EmojiEditorClipView.f97451J, rect.left, rect.top, i17, i18, i19);
    }

    @Override // o12.k
    public void b(android.view.View view, android.graphics.Rect rect, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(rect, "rect");
        rect.set(e06.p.f(rect.left + i17, view.getPaddingLeft(), rect.right - i19), e06.p.f(rect.top + i18, view.getPaddingTop(), rect.bottom - i19), rect.right, rect.bottom);
    }

    @Override // o12.k
    public void c(android.view.View view, android.graphics.Rect rect, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(rect, "rect");
        int min = java.lang.Math.min(rect.right - view.getPaddingLeft(), rect.bottom - view.getPaddingTop());
        int i27 = java.lang.Math.abs(i17) > java.lang.Math.abs(i18) ? -i17 : -i18;
        int i28 = rect.left - i27;
        int i29 = rect.right;
        int f17 = e06.p.f(i28, i29 - min, i29 - i19);
        int i37 = rect.top - i27;
        int i38 = rect.bottom;
        rect.set(f17, e06.p.f(i37, i38 - min, i38 - i19), rect.right, rect.bottom);
    }
}
