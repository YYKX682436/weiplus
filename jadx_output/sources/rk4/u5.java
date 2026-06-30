package rk4;

/* loaded from: classes14.dex */
public final class u5 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.TingPlayerHalfProfileDialogFragment f397011d;

    public u5(com.tencent.mm.plugin.ting.TingPlayerHalfProfileDialogFragment tingPlayerHalfProfileDialogFragment) {
        this.f397011d = tingPlayerHalfProfileDialogFragment;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        al5.f3 f3Var = (com.tencent.mm.ui.vas.VASActivity) obj;
        boolean z17 = f3Var instanceof lk5.a;
        com.tencent.mm.plugin.ting.TingPlayerHalfProfileDialogFragment tingPlayerHalfProfileDialogFragment = this.f397011d;
        if (z17) {
            rk4.t5 t5Var = new rk4.t5(tingPlayerHalfProfileDialogFragment);
            com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = (com.tencent.mm.plugin.profile.ui.ContactInfoUI) ((lk5.a) f3Var);
            contactInfoUI.getClass();
            java.util.Objects.toString(t5Var);
            contactInfoUI.T = t5Var;
        }
        if (f3Var instanceof m40.p0) {
            tingPlayerHalfProfileDialogFragment.f174636n = (m40.p0) f3Var;
        }
        return jz5.f0.f302826a;
    }
}
