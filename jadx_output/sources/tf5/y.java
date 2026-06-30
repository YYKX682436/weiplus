package tf5;

/* loaded from: classes11.dex */
public final class y implements com.tencent.mm.ui.contact.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.address.MvvmAddressUIFragment f419019a;

    public y(com.tencent.mm.ui.contact.address.MvvmAddressUIFragment mvvmAddressUIFragment) {
        this.f419019a = mvvmAddressUIFragment;
    }

    @Override // com.tencent.mm.ui.contact.p3
    public final void a(int i17) {
        com.tencent.mm.ui.contact.q3 q3Var = this.f419019a.A;
        if (q3Var == null) {
            return;
        }
        if (i17 <= 0) {
            if (q3Var == null) {
                return;
            }
            q3Var.setVisibility(8);
        } else {
            if (q3Var == null) {
                return;
            }
            q3Var.setVisibility(0);
        }
    }
}
