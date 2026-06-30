package d6;

/* loaded from: classes14.dex */
public final class k implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f226648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d6.l f226649e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewTreeObserver f226650f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f226651g;

    public k(d6.l lVar, android.view.ViewTreeObserver viewTreeObserver, kotlinx.coroutines.q qVar) {
        this.f226649e = lVar;
        this.f226650f = viewTreeObserver;
        this.f226651g = qVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        d6.l lVar = this.f226649e;
        coil.size.PixelSize b17 = d6.i.b(lVar);
        if (b17 != null) {
            android.view.ViewTreeObserver viewTreeObserver = this.f226650f;
            kotlin.jvm.internal.o.f(viewTreeObserver, "viewTreeObserver");
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                ((d6.f) lVar).f226639c.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.f226648d) {
                this.f226648d = true;
                ((kotlinx.coroutines.r) this.f226651g).resumeWith(kotlin.Result.m521constructorimpl(b17));
            }
        }
        return true;
    }
}
