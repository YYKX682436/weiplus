package o50;

/* loaded from: classes5.dex */
public final class g implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o50.j f343064d;

    public g(o50.j jVar) {
        this.f343064d = jVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        o50.j jVar = this.f343064d;
        jVar.W6().h().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int i17 = -((int) ((jVar.W6().h().getHeight() * 0.3f) / 2));
        jVar.W6().h().setPadding(0, i17, 0, i17);
    }
}
