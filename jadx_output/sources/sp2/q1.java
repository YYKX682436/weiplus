package sp2;

/* loaded from: classes2.dex */
public final class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.res.Configuration f411187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411188e;

    public q1(android.content.res.Configuration configuration, sp2.o2 o2Var) {
        this.f411187d = configuration;
        this.f411188e = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onConfigurationChanged postDelayed orientation: ");
        sb6.append(this.f411187d.orientation);
        sb6.append(" rv: ");
        sp2.o2 o2Var = this.f411188e;
        com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView finderParentRecyclerView = o2Var.f411139j;
        if (finderParentRecyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        sb6.append(finderParentRecyclerView.getWidth());
        sb6.append(" ui: ");
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i18 = a17.f197135a;
        if (!z17 && i18 > (i17 = a17.f197136b)) {
            i18 = i17;
        }
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", sb6.toString());
        int i19 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        if (i19 >= i65.a.b(o2Var.f411121a, 600)) {
            com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView finderParentRecyclerView2 = o2Var.f411139j;
            if (finderParentRecyclerView2 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(finderParentRecyclerView2.getWidth());
            java.lang.Integer num = valueOf.intValue() > 0 ? valueOf : null;
            if (num != null) {
                i19 = num.intValue();
            }
        }
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.NewEntranceItemConvertFactory newEntranceItemConvertFactory = o2Var.f411153q;
        if (newEntranceItemConvertFactory != null) {
            newEntranceItemConvertFactory.updateLivingWidth(i19);
        }
        up2.h hVar = o2Var.f411151p;
        if (hVar != null) {
            hVar.f213717v.clear();
        }
        up2.h hVar2 = o2Var.f411151p;
        if (hVar2 != null) {
            hVar2.notifyDataSetChanged();
        }
    }
}
