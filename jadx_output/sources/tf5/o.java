package tf5;

/* loaded from: classes11.dex */
public final class o implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final tf5.g f419006d;

    /* renamed from: e, reason: collision with root package name */
    public final int f419007e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.address.MvvmAddressUIFragment f419008f;

    public o(com.tencent.mm.ui.contact.address.MvvmAddressUIFragment mvvmAddressUIFragment, tf5.g dataItem, int i17) {
        kotlin.jvm.internal.o.g(dataItem, "dataItem");
        this.f419008f = mvvmAddressUIFragment;
        this.f419006d = dataItem;
        this.f419007e = i17;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        if (contextMenuInfo instanceof android.widget.AdapterView.AdapterContextMenuInfo) {
            tf5.g gVar = this.f419006d;
            if (gVar instanceof tf5.g) {
                com.tencent.mm.storage.z3 z3Var = gVar.f418978d;
                boolean M = c01.e2.M(z3Var.d1());
                com.tencent.mm.ui.contact.address.MvvmAddressUIFragment mvvmAddressUIFragment = this.f419008f;
                int i17 = this.f419007e;
                if (M) {
                    if (contextMenu != null) {
                        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                        android.app.Activity context = mvvmAddressUIFragment.getContext();
                        java.lang.String g27 = z3Var.g2();
                        ((ke0.e) xVar).getClass();
                        contextMenu.setHeaderTitle(com.tencent.mm.pluginsdk.ui.span.c0.i(context, g27));
                    }
                    if (contextMenu != null) {
                        contextMenu.add(i17, 2, 0, com.tencent.mm.R.string.f489894eq);
                        return;
                    }
                    return;
                }
                if (com.tencent.mm.storage.z3.z4(z3Var.d1()) || com.tencent.mm.storage.z3.R3(z3Var.d1())) {
                    return;
                }
                if (contextMenu != null) {
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    android.app.Activity context2 = mvvmAddressUIFragment.getContext();
                    java.lang.String g28 = z3Var.g2();
                    ((ke0.e) xVar2).getClass();
                    contextMenu.setHeaderTitle(com.tencent.mm.pluginsdk.ui.span.c0.i(context2, g28));
                }
                if (z3Var.r2() && z3Var.F0() != 1 && contextMenu != null) {
                    contextMenu.add(i17, 7, 0, com.tencent.mm.R.string.bf9);
                }
                if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.global.RepairerConfigGlobalContactInfo()) != 1 || contextMenu == null) {
                    return;
                }
                contextMenu.add(i17, 8, 0, "Debug");
            }
        }
    }
}
