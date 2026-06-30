package tf5;

/* loaded from: classes11.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.address.MvvmAddressUIFragment f419017d;

    public w(com.tencent.mm.ui.contact.address.MvvmAddressUIFragment mvvmAddressUIFragment) {
        this.f419017d = mvvmAddressUIFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().w("@social.black.android", null, null) > 0) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CHATONLY_ENTRANCE_BOOLEAN, java.lang.Boolean.TRUE);
            com.tencent.mm.ui.contact.address.MvvmAddressUIFragment mvvmAddressUIFragment = this.f419017d;
            com.tencent.mm.ui.contact.g0 g0Var = mvvmAddressUIFragment.f206611x;
            if (g0Var != null) {
                g0Var.post(new tf5.v(mvvmAddressUIFragment));
            }
        }
    }
}
