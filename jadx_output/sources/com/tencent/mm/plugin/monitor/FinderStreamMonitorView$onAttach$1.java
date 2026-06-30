package com.tencent.mm.plugin.monitor;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/monitor/FinderStreamMonitorView$onAttach$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FinderStreamMonitorView$onAttach$1 extends androidx.recyclerview.widget.LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        try {
            super.onLayoutChildren(z2Var, h3Var);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FinderStreamMonitorView", "onLayoutChildren:", th6);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        try {
            return super.scrollVerticallyBy(i17, z2Var, h3Var);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FinderStreamMonitorView", "scrollVerticallyBy:", th6);
            return 0;
        }
    }
}
