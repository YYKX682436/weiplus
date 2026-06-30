package lj2;

/* loaded from: classes10.dex */
public final class z implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lj2.c0 f318967d;

    public z(lj2.c0 c0Var) {
        this.f318967d = c0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        lj2.c0 c0Var = this.f318967d;
        android.view.ViewTreeObserver viewTreeObserver = c0Var.f318830a.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        c0Var.f318830a.getLeft();
        if (c0Var.f318837h) {
            c0Var.b().f318937a.setTranslationX(-c0Var.f318830a.getWidth());
            c0Var.c().f318947a.setTranslationX(-c0Var.f318830a.getWidth());
            return true;
        }
        c0Var.b().f318937a.setTranslationX(c0Var.f318830a.getWidth());
        c0Var.c().f318947a.setTranslationX(c0Var.f318830a.getWidth());
        return true;
    }
}
