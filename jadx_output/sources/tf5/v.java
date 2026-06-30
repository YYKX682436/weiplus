package tf5;

/* loaded from: classes11.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.address.MvvmAddressUIFragment f419016d;

    public v(com.tencent.mm.ui.contact.address.MvvmAddressUIFragment mvvmAddressUIFragment) {
        this.f419016d = mvvmAddressUIFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.contact.g0 g0Var = this.f419016d.f206611x;
        if (g0Var != null) {
            g0Var.setVisible(true);
        }
    }
}
