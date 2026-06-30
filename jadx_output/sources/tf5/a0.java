package tf5;

/* loaded from: classes10.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.address.MvvmAddressUIFragment f418953d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.ui.contact.address.MvvmAddressUIFragment mvvmAddressUIFragment) {
        super(0);
        this.f418953d = mvvmAddressUIFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.contact.address.MvvmAddressUIFragment mvvmAddressUIFragment = this.f418953d;
        return new com.tencent.mm.ui.contact.address.AddressLiveList((ym3.f) ((jz5.n) mvvmAddressUIFragment.H).getValue(), new xm3.n0(), mvvmAddressUIFragment);
    }
}
