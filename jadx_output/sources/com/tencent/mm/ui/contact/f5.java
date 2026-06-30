package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class f5 extends com.tencent.mm.ui.contact.o4 implements rd0.z0 {

    /* renamed from: m, reason: collision with root package name */
    public final rd0.a1 f206704m;

    public f5(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI, java.util.List list, boolean z17, int i17) {
        super(mMBaseSelectContactUI, z17, i17);
        ((rd0.j1) i95.n0.c(rd0.j1.class)).getClass();
        this.f206704m = new qd0.n0(this, list);
    }

    public com.tencent.mm.ui.contact.item.d a(int i17, int i18) {
        return ((qd0.n0) this.f206704m).f(i17, i18);
    }

    @Override // rd0.z0
    public com.tencent.mm.ui.contact.item.d c(int i17) {
        return ((qd0.n0) this.f206704m).d(i17);
    }

    public com.tencent.mm.ui.contact.item.d d(int i17) {
        return ((qd0.n0) this.f206704m).c(i17);
    }

    public void f(java.lang.String str, boolean z17) {
        com.tencent.mm.ui.contact.n4 n4Var = this.f207051i;
        if (n4Var != null) {
            n4Var.d4(str, getCount(), z17);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((qd0.n0) this.f206704m).f361575z;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        return ((qd0.n0) this.f206704m).e(i17);
    }

    @Override // com.tencent.mm.ui.contact.p4
    public void k() {
        h();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSearchContactAdapter", "finish!");
        r();
    }

    @Override // com.tencent.mm.ui.contact.p4
    public boolean n(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        int i18;
        qd0.n0 n0Var = (qd0.n0) this.f206704m;
        com.tencent.mm.ui.contact.o4 o4Var = n0Var.f361570u;
        int headerViewsCount = i17 - o4Var.f207076d.O3().getHeaderViewsCount();
        int i19 = n0Var.f361554e;
        com.tencent.mm.ui.contact.l4 l4Var = o4Var.f207076d;
        if (headerViewsCount == i19) {
            if (n0Var.f361553d) {
                int selectedItemPosition = l4Var.O3().getSelectedItemPosition();
                n0Var.f361553d = false;
                n0Var.j(n0Var.f361563n, true, false);
                l4Var.O3().setSelection(selectedItemPosition);
            } else {
                n0Var.f361553d = true;
                n0Var.j(n0Var.f361563n, true, false);
                l4Var.O3().setSelection(n0Var.f361554e);
            }
        } else {
            if (headerViewsCount != n0Var.f361557h) {
                com.tencent.mm.ui.contact.item.d item = o4Var.getItem(headerViewsCount);
                if (item == null || !item.f206855x || (i18 = n0Var.f361550a) == Integer.MAX_VALUE) {
                    return false;
                }
                if (item.f206833b == i18) {
                    com.tencent.mm.ui.contact.c9.b(1);
                    return false;
                }
                com.tencent.mm.ui.contact.c9.b(0);
                return false;
            }
            if (n0Var.f361556g) {
                int selectedItemPosition2 = l4Var.O3().getSelectedItemPosition();
                n0Var.f361556g = false;
                n0Var.j(n0Var.f361563n, true, false);
                l4Var.O3().setSelection(selectedItemPosition2);
            } else {
                n0Var.f361556g = true;
                n0Var.j(n0Var.f361563n, true, false);
                l4Var.O3().setSelection(n0Var.f361557h);
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public boolean o(com.tencent.mm.ui.contact.item.d dVar) {
        qd0.n0 n0Var = (qd0.n0) this.f206704m;
        n0Var.getClass();
        int i17 = dVar.f206833b + 1;
        int[] iArr = {n0Var.f361551b, n0Var.f361552c, n0Var.f361555f, n0Var.f361558i};
        for (int i18 = 0; i18 < 4; i18++) {
            if (i17 == iArr[i18]) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.contact.o4
    public void r() {
        ((qd0.n0) this.f206704m).i();
    }

    @Override // com.tencent.mm.ui.contact.o4
    public void s(java.lang.String str, int[] iArr, boolean z17) {
        ((qd0.n0) this.f206704m).g(str, iArr, z17);
    }

    public f5(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI, java.util.List list, boolean z17, int i17, boolean z18, int i18) {
        super(mMBaseSelectContactUI, z17, i17);
        ((rd0.j1) i95.n0.c(rd0.j1.class)).getClass();
        this.f206704m = new qd0.n0(this, list, z18, i18);
    }

    public f5(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI, java.util.List list, boolean z17, int i17, boolean z18, boolean z19) {
        super(mMBaseSelectContactUI, z17, i17);
        ((rd0.j1) i95.n0.c(rd0.j1.class)).getClass();
        this.f206704m = new qd0.n0(this, list, z18, z19);
    }
}
