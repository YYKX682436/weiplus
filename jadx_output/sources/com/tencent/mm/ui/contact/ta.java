package com.tencent.mm.ui.contact;

/* loaded from: classes10.dex */
public class ta extends com.tencent.mm.ui.contact.o4 {

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.ui.contact.sa f207199m;

    public ta(com.tencent.mm.ui.contact.SelectContactsFromRangeUI selectContactsFromRangeUI, com.tencent.mm.ui.contact.l4 l4Var, com.tencent.mm.ui.contact.sa saVar) {
        super(l4Var, false, 0);
        this.f207199m = saVar;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f207199m.getCount();
    }

    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        return this.f207199m.j(i17);
    }

    @Override // com.tencent.mm.ui.contact.o4
    public void r() {
        com.tencent.mm.ui.contact.sa saVar = this.f207199m;
        if (!saVar.f207181q.equalsIgnoreCase("")) {
            saVar.f207181q = "";
        }
        saVar.s();
    }

    @Override // com.tencent.mm.ui.contact.o4
    public void s(java.lang.String str, int[] iArr, boolean z17) {
        com.tencent.mm.ui.contact.sa saVar = this.f207199m;
        if (!saVar.f207181q.equalsIgnoreCase(str)) {
            saVar.f207181q = str;
        }
        saVar.s();
        com.tencent.mm.ui.contact.n4 n4Var = this.f207051i;
        if (n4Var != null) {
            n4Var.d4(str, getCount(), true);
        }
    }
}
