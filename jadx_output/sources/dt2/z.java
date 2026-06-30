package dt2;

/* loaded from: classes3.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dt2.a0 f243214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f243215e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.util.Size f243216f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.e1 f243217g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f243218h;

    public z(dt2.a0 a0Var, android.view.ViewGroup viewGroup, android.util.Size size, com.tencent.mm.pluginsdk.ui.e1 e1Var, boolean z17) {
        this.f243214d = a0Var;
        this.f243215e = viewGroup;
        this.f243216f = size;
        this.f243217g = e1Var;
        this.f243218h = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        dt2.a0 a0Var = this.f243214d;
        a0Var.getClass();
        com.tencent.mm.pluginsdk.ui.e1 e1Var = com.tencent.mm.pluginsdk.ui.e1.CONTAIN;
        android.view.ViewGroup viewGroup = this.f243215e;
        android.util.Size size = this.f243216f;
        jz5.l f17 = this.f243217g == e1Var ? zl2.q4.f473933a.f(android.widget.ImageView.ScaleType.FIT_CENTER.ordinal(), viewGroup.getWidth(), viewGroup.getHeight(), size.getWidth(), size.getHeight()) : zl2.q4.f473933a.f(android.widget.ImageView.ScaleType.CENTER_CROP.ordinal(), viewGroup.getWidth(), viewGroup.getHeight(), size.getWidth(), size.getHeight());
        com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = a0Var.f243158a;
        if (f17 != null) {
            finderLiveThumbPlayerProxy.O(((java.lang.Number) f17.f302833d).intValue(), ((java.lang.Number) f17.f302834e).intValue());
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null && viewGroup.getWidth() > 0 && viewGroup.getHeight() > 0) {
            finderLiveThumbPlayerProxy.O(viewGroup.getWidth(), viewGroup.getHeight());
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resetViewSize:container:");
        sb6.append(viewGroup.hashCode());
        sb6.append(" mediaSize width = ");
        sb6.append(size.getWidth());
        sb6.append(", height = ");
        sb6.append(size.getHeight());
        sb6.append(", container width = ");
        sb6.append(viewGroup.getWidth());
        sb6.append(", height = ");
        sb6.append(viewGroup.getHeight());
        sb6.append(", params width = ");
        sb6.append(f17 != null ? (java.lang.Integer) f17.f302833d : null);
        sb6.append(", height = ");
        sb6.append(f17 != null ? (java.lang.Integer) f17.f302834e : null);
        com.tencent.mars.xlog.Log.i("FinderLiveReplayerWidget", sb6.toString());
        a0Var.f243158a.setVideoViewFocused(true);
        a0Var.f243158a.setMute(false);
        a0Var.f243158a.setAlpha(1.0f);
        a0Var.f243158a.setVisibility(0);
        if (this.f243218h) {
            a0Var.f243158a.play();
        }
    }
}
