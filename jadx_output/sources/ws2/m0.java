package ws2;

/* loaded from: classes3.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f449096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ws2.p0 f449097e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f449098f;

    public m0(android.view.ViewGroup viewGroup, ws2.p0 p0Var, int i17) {
        this.f449096d = viewGroup;
        this.f449097e = p0Var;
        this.f449098f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup = this.f449096d;
        int measuredHeight = viewGroup.getMeasuredHeight();
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        int i17 = measuredHeight + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
        at2.b bVar = (at2.b) this.f449097e.f449117a.getPlugin(at2.b.class);
        if (bVar != null) {
            bVar.t1(this.f449098f + i17 + i65.a.b(viewGroup.getContext(), 12));
        }
    }
}
