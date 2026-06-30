package tf5;

/* loaded from: classes11.dex */
public final class b0 implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.address.MvvmAddressUIFragment f418957d;

    public b0(com.tencent.mm.ui.contact.address.MvvmAddressUIFragment mvvmAddressUIFragment) {
        this.f418957d = mvvmAddressUIFragment;
    }

    @Override // in5.u
    public boolean a(android.view.View itemView, android.view.MotionEvent event, in5.c cVar, int i17) {
        tf5.g item = (tf5.g) cVar;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(item, "item");
        if (event.getAction() != 0) {
            return false;
        }
        int rawX = (int) event.getRawX();
        com.tencent.mm.ui.contact.address.MvvmAddressUIFragment mvvmAddressUIFragment = this.f418957d;
        mvvmAddressUIFragment.D = rawX;
        mvvmAddressUIFragment.E = (int) event.getRawY();
        return false;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        tf5.g data = (tf5.g) cVar;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick ");
        com.tencent.mm.storage.z3 z3Var = data.f418978d;
        sb6.append(z3Var.d1());
        com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.MvvmAddressUIFragment", sb6.toString());
        java.lang.String d17 = z3Var.d1();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", d17);
        if (c01.e2.M(d17)) {
            intent.putExtra("Is_group_card", true);
        }
        com.tencent.mm.ui.contact.g1.c(intent, d17);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 4);
        j45.l.j(this.f418957d.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).hj(d17, 10L);
    }

    @Override // in5.u
    public boolean v(android.view.View view, in5.c cVar, int i17) {
        com.tencent.mm.ui.contact.address.MvvmAddressUIFragment mvvmAddressUIFragment;
        rl5.r rVar;
        tf5.g data = (tf5.g) cVar;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.storage.z3 z3Var = data.f418978d;
        if (com.tencent.mm.storage.z3.k4(z3Var.d1()) || com.tencent.mm.storage.z3.b4(z3Var.d1()) || kotlin.jvm.internal.o.b(c01.z1.r(), z3Var.d1()) || com.tencent.mm.storage.z3.L3(z3Var.d1()) || (rVar = (mvvmAddressUIFragment = this.f418957d).C) == null) {
            return true;
        }
        rVar.g(view, i17, 0L, new tf5.o(mvvmAddressUIFragment, data, i17), new tf5.p(mvvmAddressUIFragment, data, i17), mvvmAddressUIFragment.D, mvvmAddressUIFragment.E);
        return true;
    }
}
