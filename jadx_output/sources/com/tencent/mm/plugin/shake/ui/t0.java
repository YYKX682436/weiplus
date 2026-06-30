package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class t0 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.s6 f162333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI f162334e;

    public t0(com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI shakeSayHiListUI, com.tencent.mm.ui.tools.s6 s6Var) {
        this.f162334e = shakeSayHiListUI;
        this.f162333d = s6Var;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        if (i17 < this.f162334e.f162214f.getHeaderViewsCount()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SayHiListUI", "on header view long click, ignore");
            return true;
        }
        com.tencent.mm.ui.tools.s6 s6Var = this.f162333d;
        com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI shakeSayHiListUI = this.f162334e;
        s6Var.b(view, i17, j17, shakeSayHiListUI, shakeSayHiListUI.f162218m);
        return true;
    }
}
