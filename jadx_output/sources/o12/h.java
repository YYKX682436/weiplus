package o12;

/* loaded from: classes10.dex */
public final class h extends o12.k {

    /* renamed from: b, reason: collision with root package name */
    public static final o12.h f342153b = new o12.h();

    public h() {
        super(null);
    }

    @Override // o12.k
    public boolean a(android.graphics.Rect rect, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(rect, "rect");
        int i27 = rect.top;
        return i27 - i19 < i18 && i27 + i19 > i18 && rect.left < i17 && rect.right > i17;
    }

    @Override // o12.k
    public void b(android.view.View view, android.graphics.Rect rect, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(rect, "rect");
        rect.top = e06.p.f(rect.top + i18, view.getPaddingTop(), rect.bottom - i19);
    }

    @Override // o12.k
    public void c(android.view.View view, android.graphics.Rect rect, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(rect, "rect");
        int width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        int width2 = rect.width() - (i18 * 2);
        boolean z17 = false;
        if (i19 <= width2 && width2 <= width) {
            z17 = true;
        }
        if (z17) {
            rect.left += i18;
            rect.top += i18;
            rect.right -= i18;
            rect.bottom -= i18;
        }
    }
}
