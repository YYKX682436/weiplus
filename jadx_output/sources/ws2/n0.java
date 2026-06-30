package ws2;

/* loaded from: classes3.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f449102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f449103e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ws2.p0 f449104f;

    public n0(android.view.ViewGroup viewGroup, android.view.View view, ws2.p0 p0Var) {
        this.f449102d = viewGroup;
        this.f449103e = view;
        this.f449104f = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2 = this.f449102d;
        int measuredHeight = viewGroup2.getMeasuredHeight() != 0 ? viewGroup2.getMeasuredHeight() : i65.a.b(viewGroup2.getContext(), 32);
        boolean z17 = false;
        android.view.View view = this.f449103e;
        int measuredHeight2 = (view != null ? view.getMeasuredHeight() : 0) + measuredHeight;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        int i17 = measuredHeight2 + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
        ws2.p0 p0Var = this.f449104f;
        com.tencent.mm.plugin.finder.live.plugin.ad adVar = (com.tencent.mm.plugin.finder.live.plugin.ad) p0Var.f449117a.getPlugin(com.tencent.mm.plugin.finder.live.plugin.ad.class);
        if (adVar != null && adVar.w0() == 0) {
            z17 = true;
        }
        if (!z17) {
            at2.b bVar = (at2.b) p0Var.f449117a.getPlugin(at2.b.class);
            if (bVar != null) {
                bVar.t1(i17 + i65.a.b(viewGroup2.getContext(), 12));
                return;
            }
            return;
        }
        com.tencent.mm.plugin.finder.live.plugin.ad adVar2 = (com.tencent.mm.plugin.finder.live.plugin.ad) p0Var.f449117a.getPlugin(com.tencent.mm.plugin.finder.live.plugin.ad.class);
        if (adVar2 == null || (viewGroup = adVar2.f365323d) == null) {
            return;
        }
        viewGroup.post(new ws2.m0(viewGroup, p0Var, i17));
    }
}
