package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class kc0 implements in5.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nc0 f134955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f134956b;

    public kc0(com.tencent.mm.plugin.finder.viewmodel.component.nc0 nc0Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.f134955a = nc0Var;
        this.f134956b = appCompatActivity;
    }

    @Override // in5.y0
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, in5.w0 data) {
        java.util.List data2;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.finder.viewmodel.component.nc0 nc0Var = this.f134955a;
        com.tencent.mars.xlog.Log.i(nc0Var.f135309d, "onScrollStatsChanged");
        int i17 = data.f293152e;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = nc0Var.f135317o;
        int size = (wxRecyclerAdapter == null || (data2 = wxRecyclerAdapter.getData()) == null) ? 0 : data2.size();
        if (!nc0Var.f135320r && i17 != -1 && size - i17 <= 10 && size > 0) {
            nc0Var.Q6().v();
        }
        java.util.LinkedList linkedList = data.f293156i;
        if (!linkedList.isEmpty()) {
            kotlinx.coroutines.l.d(nc0Var.getLifecycleScope(), null, null, new com.tencent.mm.plugin.finder.viewmodel.component.jc0(linkedList, this.f134956b, null), 3, null);
        }
    }
}
