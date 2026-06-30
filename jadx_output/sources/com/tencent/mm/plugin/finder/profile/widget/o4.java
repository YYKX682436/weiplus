package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class o4 implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s4 f124661a;

    public o4(com.tencent.mm.plugin.finder.profile.widget.s4 s4Var) {
        this.f124661a = s4Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public final void dismiss() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = this.f124661a;
        java.util.Iterator it = ((java.util.ArrayList) s4Var.f124760n).iterator();
        while (it.hasNext()) {
            arrayList.add(((com.tencent.mm.plugin.finder.profile.widget.m3) it.next()).f124624a);
        }
        zy2.hc hcVar = s4Var.f124770x;
        if (hcVar != null) {
            r45.j32 j32Var = s4Var.f124764r;
            hcVar.a(arrayList, j32Var != null ? j32Var.getInteger(3) : 0, s4Var.f124765s, s4Var.f124767u);
        }
    }
}
