package lf3;

/* loaded from: classes3.dex */
public final class a0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf3.c0 f318306d;

    public a0(lf3.c0 c0Var) {
        this.f318306d = c0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        lf3.j jVar;
        android.view.ViewTreeObserver viewTreeObserver;
        lf3.c0 c0Var = this.f318306d;
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2 = c0Var.f318310d;
        if (viewPager2 != null && (viewTreeObserver = viewPager2.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager22 = c0Var.f318310d;
        if (viewPager22 == null || (jVar = (lf3.j) c0Var.U6(lf3.j.class)) == null) {
            return true;
        }
        jVar.m6(viewPager22, viewPager22.getWidth(), viewPager22.getHeight());
        return true;
    }
}
