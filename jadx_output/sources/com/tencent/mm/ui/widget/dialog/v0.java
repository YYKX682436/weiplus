package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes8.dex */
public class v0 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f212010d;

    public v0(com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f212010d = k0Var;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f212010d;
        if (i17 < k0Var.L.size() || k0Var.M.size() <= 0 || i17 >= k0Var.L.size() + k0Var.M.size()) {
            return true;
        }
        db5.h4 h4Var = (db5.h4) k0Var.M.getItem(i17 - k0Var.L.size());
        if (h4Var == null || h4Var.f228375s) {
            return false;
        }
        db5.s4 s4Var = k0Var.f211883u;
        if (s4Var == null) {
            return true;
        }
        s4Var.a(h4Var, i17);
        return true;
    }
}
