package hf2;

/* loaded from: classes5.dex */
public final class a2 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.b2 f280999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f281000e;

    public a2(hf2.b2 b2Var, v65.n nVar) {
        this.f280999d = b2Var;
        this.f281000e = nVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.ViewTreeObserver viewTreeObserver;
        hf2.b2 b2Var = this.f280999d;
        android.view.View view = b2Var.f281014i;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        android.view.View view2 = b2Var.f281014i;
        if (view2 != null) {
            view2.post(new hf2.z1(this.f281000e));
        }
    }
}
