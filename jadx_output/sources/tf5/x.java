package tf5;

/* loaded from: classes11.dex */
public final class x implements com.tencent.mm.ui.contact.e8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.address.MvvmAddressUIFragment f419018a;

    public x(com.tencent.mm.ui.contact.address.MvvmAddressUIFragment mvvmAddressUIFragment) {
        this.f419018a = mvvmAddressUIFragment;
    }

    @Override // com.tencent.mm.ui.contact.e8
    public final void a(int i17) {
        com.tencent.mm.ui.contact.address.MvvmAddressUIFragment mvvmAddressUIFragment = this.f419018a;
        com.tencent.mm.ui.contact.g8 g8Var = mvvmAddressUIFragment.f206613z;
        if (g8Var == null || mvvmAddressUIFragment.f206607t == null) {
            return;
        }
        if (i17 <= 0) {
            if (g8Var != null) {
                g8Var.setVisibility(8);
            }
            com.tencent.mm.ui.contact.BizContactEntranceView bizContactEntranceView = mvvmAddressUIFragment.f206607t;
            if (bizContactEntranceView != null) {
                bizContactEntranceView.c(true);
                return;
            }
            return;
        }
        if (g8Var != null) {
            g8Var.setVisibility(0);
        }
        com.tencent.mm.ui.contact.BizContactEntranceView bizContactEntranceView2 = mvvmAddressUIFragment.f206607t;
        if (bizContactEntranceView2 != null) {
            bizContactEntranceView2.c(false);
        }
    }
}
