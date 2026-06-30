package pi0;

/* loaded from: classes4.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f354621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi0.l1 f354622e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f354623f;

    public j1(android.view.ViewGroup viewGroup, pi0.l1 l1Var, kotlinx.coroutines.q qVar) {
        this.f354621d = viewGroup;
        this.f354622e = l1Var;
        this.f354623f = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup = this.f354621d;
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        io.flutter.Log.i(this.f354622e.k(), "container size:[" + width + ", " + height + ']');
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        ((kotlinx.coroutines.r) this.f354623f).resumeWith(kotlin.Result.m521constructorimpl(new android.graphics.Point(width, height)));
    }
}
