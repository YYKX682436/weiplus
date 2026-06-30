package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class s1 implements com.tencent.mm.ui.tools.b9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.CountryCodeUI f210688d;

    public s1(com.tencent.mm.ui.tools.CountryCodeUI countryCodeUI) {
        this.f210688d = countryCodeUI;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String str) {
        com.tencent.mm.ui.tools.CountryCodeUI countryCodeUI = this.f210688d;
        countryCodeUI.getClass();
        com.tencent.mm.ui.tools.p1 p1Var = countryCodeUI.f209986e;
        if (p1Var == null || str == null) {
            return;
        }
        p1Var.f210632g = str.trim();
        java.util.List list = p1Var.f210630e;
        list.clear();
        java.util.ArrayList arrayList = (java.util.ArrayList) p1Var.f210629d;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            if (((u11.a) arrayList.get(i17)).f423729c.toUpperCase().contains(p1Var.f210632g.toUpperCase()) || ((u11.a) arrayList.get(i17)).f423730d.toUpperCase().contains(p1Var.f210632g.toUpperCase()) || ((u11.a) arrayList.get(i17)).f423728b.contains(p1Var.f210632g)) {
                list.add((u11.a) arrayList.get(i17));
            }
        }
        p1Var.c();
        p1Var.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void Z2() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String str) {
        return false;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
    }
}
