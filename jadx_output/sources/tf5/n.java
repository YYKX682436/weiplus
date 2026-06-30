package tf5;

/* loaded from: classes11.dex */
public final class n implements vg3.o3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.address.MvvmAddressUIFragment f419005d;

    public n(com.tencent.mm.ui.contact.address.MvvmAddressUIFragment mvvmAddressUIFragment) {
        this.f419005d = mvvmAddressUIFragment;
    }

    @Override // vg3.o3
    public void f(com.tencent.mm.storage.z3 z3Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MvvmAddressUIFragment.IContactRelationUpdateCallback", "beforeAddOpenIMContact");
        com.tencent.mm.ui.contact.q3 q3Var = this.f419005d.A;
        if (q3Var != null) {
            q3Var.b();
        }
    }

    @Override // vg3.o3
    public void i(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MvvmAddressUIFragment.IContactRelationUpdateCallback", "beforeAddContact");
    }

    @Override // vg3.o3
    public void q(com.tencent.mm.storage.z3 z3Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MvvmAddressUIFragment.IContactRelationUpdateCallback", "beforeDelOpenIMContact");
        com.tencent.mm.ui.contact.q3 q3Var = this.f419005d.A;
        if (q3Var != null) {
            q3Var.b();
        }
    }

    @Override // vg3.o3
    public void t(com.tencent.mm.storage.z3 z3Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MvvmAddressUIFragment.IContactRelationUpdateCallback", "beforeDelContact");
    }
}
