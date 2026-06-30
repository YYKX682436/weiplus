package rk4;

/* loaded from: classes14.dex */
public final class v5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.TingPlayerHalfProfileDialogFragment f397021d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(com.tencent.mm.plugin.ting.TingPlayerHalfProfileDialogFragment tingPlayerHalfProfileDialogFragment) {
        super(0);
        this.f397021d = tingPlayerHalfProfileDialogFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean d76;
        com.tencent.mm.plugin.ting.TingPlayerHalfProfileDialogFragment tingPlayerHalfProfileDialogFragment = this.f397021d;
        if (tingPlayerHalfProfileDialogFragment.f174631f == rk4.z5.f397127e) {
            if (tingPlayerHalfProfileDialogFragment.f174634i != 0) {
                d76 = false;
            }
            d76 = true;
        } else {
            m40.p0 p0Var = tingPlayerHalfProfileDialogFragment.f174636n;
            if (p0Var != null) {
                d76 = ((com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) p0Var).d7();
            }
            d76 = true;
        }
        return java.lang.Boolean.valueOf(d76);
    }
}
