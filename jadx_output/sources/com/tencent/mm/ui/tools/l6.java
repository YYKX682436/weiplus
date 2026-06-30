package com.tencent.mm.ui.tools;

/* loaded from: classes8.dex */
public class l6 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnCreateContextMenuListener f210546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.s6 f210547e;

    public l6(com.tencent.mm.ui.tools.s6 s6Var, android.view.View.OnCreateContextMenuListener onCreateContextMenuListener) {
        this.f210547e = s6Var;
        this.f210546d = onCreateContextMenuListener;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.tools.s6 s6Var = this.f210547e;
        s6Var.f210726m.clear();
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = new android.widget.AdapterView.AdapterContextMenuInfo(view, i17, j17);
        this.f210546d.onCreateContextMenu(s6Var.f210726m, view, adapterContextMenuInfo);
        java.util.Iterator it = ((java.util.ArrayList) s6Var.f210726m.f228344d).iterator();
        while (it.hasNext()) {
            ((db5.h4) ((android.view.MenuItem) it.next())).f228381y = adapterContextMenuInfo;
        }
        s6Var.f210722f = new com.tencent.mm.ui.tools.k6(this);
        s6Var.f210721e.V1 = true;
        s6Var.d();
        return true;
    }
}
