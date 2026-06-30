package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class qy implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ty f114056d;

    public qy(com.tencent.mm.plugin.finder.live.plugin.ty tyVar) {
        this.f114056d = tyVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        boolean z17 = false;
        int itemId = menuItem != null ? menuItem.getItemId() : 0;
        int i18 = 2;
        if (itemId == 0) {
            this.f114056d.A1(2, 2);
        } else if (itemId == 1) {
            this.f114056d.A1(2, 3);
        }
        com.tencent.mm.plugin.finder.live.plugin.ty tyVar = this.f114056d;
        if (itemId != tyVar.Z) {
            tyVar.Z = itemId;
            com.tencent.mars.xlog.Log.i(tyVar.f114488q, "switchSortType currentSortType: " + this.f114056d.Z);
            com.tencent.mm.plugin.finder.live.plugin.ty tyVar2 = this.f114056d;
            if (tyVar2.v1()) {
                i18 = 1;
            } else {
                if (((mm2.n0) tyVar2.P0(mm2.n0.class)).f329273r) {
                    i18 = 16;
                }
            }
            int i19 = (tyVar2.Z == 1 && tyVar2.v1()) ? 3 : 0;
            bm2.n5 n5Var = tyVar2.R;
            if (tyVar2.Z == 1 && tyVar2.v1()) {
                z17 = true;
            }
            n5Var.L = z17;
            dk2.xf W0 = tyVar2.W0();
            if (W0 != null) {
                ((dk2.r4) W0).B(i18, i19, new com.tencent.mm.plugin.finder.live.plugin.iy(tyVar2));
            }
        }
    }
}
