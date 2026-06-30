package tb2;

/* loaded from: classes.dex */
public final class a implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f416952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f416953e;

    public a(in5.s0 s0Var, yz5.l lVar) {
        this.f416952d = s0Var;
        this.f416953e = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        in5.s0 s0Var = this.f416952d;
        s0Var.itemView.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f416953e.invoke(java.lang.Integer.valueOf(s0Var.itemView.getWidth()));
        return true;
    }
}
