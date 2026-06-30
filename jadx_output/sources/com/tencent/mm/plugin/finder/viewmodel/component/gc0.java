package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class gc0 implements cy3.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nc0 f134499a;

    public gc0(com.tencent.mm.plugin.finder.viewmodel.component.nc0 nc0Var) {
        this.f134499a = nc0Var;
    }

    @Override // cy3.v
    public void onPageSelected(int i17) {
        com.tencent.mm.plugin.finder.viewmodel.component.nc0 nc0Var = this.f134499a;
        int i18 = nc0Var.f135321s;
        if (i18 != i17) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = nc0Var.f135317o;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyItemChanged(i18, java.lang.Boolean.FALSE);
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = nc0Var.f135317o;
            if (wxRecyclerAdapter2 != null) {
                wxRecyclerAdapter2.notifyItemChanged(i17, java.lang.Boolean.TRUE);
            }
        }
        nc0Var.f135321s = i17;
    }
}
