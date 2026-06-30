package tf5;

/* loaded from: classes11.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.address.MvvmAddressUIFragment f419011d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.ui.contact.address.MvvmAddressUIFragment mvvmAddressUIFragment) {
        super(0);
        this.f419011d = mvvmAddressUIFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.ui.contact.address.MvvmAddressUIFragment.S;
        xm3.t0 t0Var = new xm3.t0(this.f419011d.z0(), new in5.s() { // from class: com.tencent.mm.ui.contact.address.MvvmAddressUIFragment$buildItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new tf5.f();
            }
        }, false, 4, null);
        t0Var.setHasStableIds(true);
        return t0Var;
    }
}
