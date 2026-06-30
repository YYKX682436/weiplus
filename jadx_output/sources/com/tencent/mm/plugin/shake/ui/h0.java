package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class h0 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.s6 f162275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.ShakeMsgListUI f162276e;

    public h0(com.tencent.mm.plugin.shake.ui.ShakeMsgListUI shakeMsgListUI, com.tencent.mm.ui.tools.s6 s6Var) {
        this.f162276e = shakeMsgListUI;
        this.f162275d = s6Var;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.shake.ui.ShakeMsgListUI shakeMsgListUI = this.f162276e;
        if (i17 < shakeMsgListUI.f162104f.getHeaderViewsCount()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ShakeMsgListUI", "on header view long click, ignore");
            return true;
        }
        this.f162275d.b(view, i17, j17, shakeMsgListUI.getContext(), shakeMsgListUI.f162111p);
        return true;
    }
}
