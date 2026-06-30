package tf5;

/* loaded from: classes11.dex */
public final class z implements com.tencent.mm.ui.contact.f8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.address.MvvmAddressUIFragment f419020a;

    public z(com.tencent.mm.ui.contact.address.MvvmAddressUIFragment mvvmAddressUIFragment) {
        this.f419020a = mvvmAddressUIFragment;
    }

    @Override // com.tencent.mm.ui.contact.f8
    public final void a(boolean z17) {
        com.tencent.mm.ui.contact.BizContactEntranceView bizContactEntranceView = this.f419020a.f206607t;
        if (bizContactEntranceView == null || bizContactEntranceView == null) {
            return;
        }
        bizContactEntranceView.c(!z17);
    }
}
