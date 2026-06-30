package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class q implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.s6 f162323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.ShakeItemListUI f162324e;

    public q(com.tencent.mm.plugin.shake.ui.ShakeItemListUI shakeItemListUI, com.tencent.mm.ui.tools.s6 s6Var) {
        this.f162324e = shakeItemListUI;
        this.f162323d = s6Var;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        if (i17 < this.f162324e.f162096g.getHeaderViewsCount()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ShakeItemListUI", "on header view long click, ignore");
            return true;
        }
        com.tencent.mm.ui.tools.s6 s6Var = this.f162323d;
        com.tencent.mm.plugin.shake.ui.ShakeItemListUI shakeItemListUI = this.f162324e;
        s6Var.b(view, i17, j17, shakeItemListUI, shakeItemListUI.f162101o);
        return true;
    }
}
