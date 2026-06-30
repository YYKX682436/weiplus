package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class b1 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.s6 f162242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI f162243e;

    public b1(com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI shakeTvHistoryListUI, com.tencent.mm.ui.tools.s6 s6Var) {
        this.f162243e = shakeTvHistoryListUI;
        this.f162242d = s6Var;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI shakeTvHistoryListUI = this.f162243e;
        if (i17 < shakeTvHistoryListUI.f162220e.getHeaderViewsCount()) {
            return true;
        }
        this.f162242d.b(view, i17, j17, shakeTvHistoryListUI.getContext(), shakeTvHistoryListUI.f162222g);
        return true;
    }
}
