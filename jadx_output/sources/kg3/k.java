package kg3;

/* loaded from: classes12.dex */
public final class k implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f307716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f307717e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kg3.n f307718f;

    public k(android.view.View view, android.app.Activity activity, kg3.n nVar) {
        this.f307716d = view;
        this.f307717e = activity;
        this.f307718f = nVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f307716d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        android.app.Activity activity = this.f307717e;
        boolean isFinishing = activity.isFinishing();
        kg3.n nVar = this.f307718f;
        if (isFinishing || activity.isDestroyed()) {
            nVar.getClass();
            return;
        }
        nVar.getClass();
        kg3.d dVar = nVar.f307722b;
        if (dVar != null) {
            dVar.H2();
        }
    }
}
