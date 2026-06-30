package uf5;

/* loaded from: classes10.dex */
public class r1 extends com.tencent.mm.ui.contact.o4 {

    /* renamed from: m, reason: collision with root package name */
    public final uf5.q1 f427294m;

    public r1(com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI selectPrivacyContactsFromRangeUI, com.tencent.mm.ui.contact.l4 l4Var, uf5.q1 q1Var) {
        super(l4Var, false, 0);
        this.f427294m = q1Var;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f427294m.getCount();
    }

    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        return this.f427294m.j(i17);
    }

    @Override // com.tencent.mm.ui.contact.o4
    public void r() {
        uf5.q1 q1Var = this.f427294m;
        if (!q1Var.f427288q.equalsIgnoreCase("")) {
            q1Var.f427288q = "";
        }
        q1Var.s();
    }

    @Override // com.tencent.mm.ui.contact.o4
    public void s(java.lang.String str, int[] iArr, boolean z17) {
        h();
        uf5.q1 q1Var = this.f427294m;
        if (!q1Var.f427288q.equalsIgnoreCase(str)) {
            q1Var.f427288q = str;
        }
        q1Var.s();
        com.tencent.mm.ui.contact.n4 n4Var = this.f207051i;
        if (n4Var != null) {
            n4Var.d4(str, getCount(), true);
        }
    }
}
