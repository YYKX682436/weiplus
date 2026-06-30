package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.AddressUI.AddressUIFragment f206575d;

    public a0(com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment) {
        this.f206575d = addressUIFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        gm0.j1.i();
        if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().w("@social.black.android", null, null) > 0) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CHATONLY_ENTRANCE_BOOLEAN, java.lang.Boolean.TRUE);
            this.f206575d.D.post(new com.tencent.mm.ui.contact.z(this));
        }
    }
}
