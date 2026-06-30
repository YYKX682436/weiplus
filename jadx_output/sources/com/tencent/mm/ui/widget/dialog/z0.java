package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes8.dex */
public class z0 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f212052d;

    public z0(com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f212052d = k0Var;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        db5.s4 s4Var;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f212052d;
        if (i17 >= k0Var.P.size()) {
            return false;
        }
        db5.h4 h4Var = (db5.h4) ((java.util.ArrayList) k0Var.P.f228344d).get(i17);
        if (h4Var != null && h4Var.f228375s) {
            return false;
        }
        if (i17 < k0Var.P.size() && (s4Var = k0Var.f211886x) != null) {
            s4Var.a(k0Var.P.getItem(i17), i17);
        }
        k0Var.f211888x1.notifyDataSetChanged();
        return false;
    }
}
