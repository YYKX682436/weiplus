package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes11.dex */
public class i1 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.s6 f152147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI f152148e;

    public i1(com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI nearbySayHiListUI, com.tencent.mm.ui.tools.s6 s6Var) {
        this.f152148e = nearbySayHiListUI;
        this.f152147d = s6Var;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        if (i17 < this.f152148e.f152112f.getHeaderViewsCount()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SayHiListUI", "on header view long click, ignore");
            return true;
        }
        com.tencent.mm.ui.tools.s6 s6Var = this.f152147d;
        com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI nearbySayHiListUI = this.f152148e;
        s6Var.b(view, i17, j17, nearbySayHiListUI, nearbySayHiListUI.f152122s);
        return true;
    }
}
