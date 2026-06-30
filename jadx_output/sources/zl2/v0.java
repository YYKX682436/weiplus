package zl2;

/* loaded from: classes3.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.l f473994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f473995e;

    public v0(com.tencent.mm.plugin.finder.live.plugin.l lVar, boolean z17) {
        this.f473994d = lVar;
        this.f473995e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f473994d;
        if (lVar.f113324f.getLayoutParams() != null && (lVar.f113324f.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) && lVar.x0()) {
            int u07 = lVar.u0();
            zl2.r4 r4Var = zl2.r4.f473950a;
            android.content.Context context = lVar.f113324f.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            int z07 = r4Var.z0(context, r4Var.W1(lVar.S0()) || r4Var.z1(lVar.S0()));
            boolean z17 = this.f473995e;
            if (z17) {
                android.view.ViewGroup.LayoutParams layoutParams = lVar.f113324f.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(z07);
            } else {
                android.view.ViewGroup.LayoutParams layoutParams2 = lVar.f113324f.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd(z07);
            }
            lVar.f113324f.requestLayout();
            if (zl2.q4.f473933a.E()) {
                com.tencent.mars.xlog.Log.i("FinderLiveUtil", "plugin:" + lVar.name() + ",Orientation:" + u07 + ",ifLeft:" + z17 + ", padding:" + z07);
            }
            lVar.f113324f.setTag(com.tencent.mm.R.id.ffz, java.lang.Integer.valueOf(u07));
        }
    }
}
