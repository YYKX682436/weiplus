package tf5;

/* loaded from: classes11.dex */
public final class p implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final tf5.g f419009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.address.MvvmAddressUIFragment f419010e;

    public p(com.tencent.mm.ui.contact.address.MvvmAddressUIFragment mvvmAddressUIFragment, tf5.g dataItem, int i17) {
        kotlin.jvm.internal.o.g(dataItem, "dataItem");
        this.f419010e = mvvmAddressUIFragment;
        this.f419009d = dataItem;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            tf5.g gVar = this.f419009d;
            com.tencent.mm.ui.contact.address.MvvmAddressUIFragment mvvmAddressUIFragment = this.f419010e;
            if (itemId == 1 || itemId == 2) {
                com.tencent.mm.storage.z3 z3Var = gVar.f418978d;
                int i18 = com.tencent.mm.ui.contact.address.MvvmAddressUIFragment.S;
                mvvmAddressUIFragment.getClass();
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var.d1(), true);
                n17.s3();
                c01.e2.g0(n17, true);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(n17.d1(), n17);
                return;
            }
            if (itemId == 7) {
                com.tencent.mm.storage.z3 z3Var2 = gVar.f418978d;
                int i19 = com.tencent.mm.ui.contact.address.MvvmAddressUIFragment.S;
                android.app.Activity context = mvvmAddressUIFragment.getContext();
                if (context == null || !z3Var2.r2()) {
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Contact_User", z3Var2.d1());
                intent.putExtra("view_mode", true);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.m(intent, context);
                return;
            }
            if (itemId != 8) {
                return;
            }
            ((zc0.h) ((xs.i1) i95.n0.c(xs.i1.class))).bj(com.tencent.mm.sdk.platformtools.t8.G1(gVar.f418978d.d1()) + '-' + k35.m1.d("yyyy-MM-dd_HH:mm:ss", c01.id.e()) + ".txt", gVar.f418978d);
        }
    }
}
