package sz4;

/* loaded from: classes12.dex */
public class c0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz4.f0 f414187d;

    public c0(sz4.f0 f0Var) {
        this.f414187d = f0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        gm0.j1.e().j(new sz4.b0(this));
    }
}
