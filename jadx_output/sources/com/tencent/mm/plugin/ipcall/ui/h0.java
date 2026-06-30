package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class h0 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.m0 f142842d;

    public h0(com.tencent.mm.plugin.ipcall.ui.m0 m0Var) {
        this.f142842d = m0Var;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.ipcall.ui.m0 m0Var = this.f142842d;
        com.tencent.mm.plugin.ipcall.ui.j3 j3Var = m0Var.f142930b;
        if (j3Var.f142880q == null) {
            j3Var.t();
        }
        android.widget.ListView listView = (android.widget.ListView) adapterView;
        s83.l lVar = (s83.l) m0Var.f142930b.f142880q.get(i17 - listView.getHeaderViewsCount());
        int headerViewsCount = i17 - listView.getHeaderViewsCount();
        if (lVar != null) {
            com.tencent.mm.plugin.ipcall.ui.IPCallAddressUI iPCallAddressUI = m0Var.f142932d;
            android.view.LayoutInflater.from(iPCallAddressUI);
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) iPCallAddressUI, 1, false);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            new java.util.ArrayList();
            com.tencent.mm.plugin.ipcall.ui.k0 k0Var2 = new com.tencent.mm.plugin.ipcall.ui.k0(m0Var);
            com.tencent.mm.plugin.ipcall.ui.l0 l0Var = new com.tencent.mm.plugin.ipcall.ui.l0(m0Var, lVar, headerViewsCount);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it.next());
                h4Var.f228381y = null;
                h4Var.f228382z = null;
            }
            arrayList.clear();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            db5.h4 h4Var2 = new db5.h4(iPCallAddressUI, 0, 0);
            h4Var2.f228376t = com.tencent.mm.R.string.f490367t0;
            arrayList2.add(h4Var2);
            if (arrayList2.size() == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
            } else {
                k0Var.f211872n = k0Var2;
                k0Var.f211881s = l0Var;
                k0Var.f211854d = null;
                k0Var.G = null;
                k0Var.v();
            }
        }
        return true;
    }
}
