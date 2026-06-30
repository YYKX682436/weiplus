package gx1;

/* loaded from: classes12.dex */
public class p implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx1.s f277322d;

    public p(gx1.s sVar) {
        this.f277322d = sVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        gm0.j1.e().j(new gx1.o(this));
    }
}
