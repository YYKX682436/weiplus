package uf5;

/* loaded from: classes10.dex */
public class g0 extends uf5.w0 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.ContactMgrOnlyChatUI f427230s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.ui.contact.privacy.ContactMgrOnlyChatUI contactMgrOnlyChatUI, com.tencent.mm.ui.contact.l4 l4Var) {
        super(contactMgrOnlyChatUI, l4Var);
        this.f427230s = contactMgrOnlyChatUI;
    }

    @Override // uf5.w0, com.tencent.mm.ui.contact.a5
    public void s() {
        super.s();
        gm0.j1.i();
        android.database.Cursor U = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().U(null, this.f427317q, "@social.black.android", "", this.f206588m);
        com.tencent.mm.ui.contact.privacy.ContactMgrOnlyChatUI contactMgrOnlyChatUI = this.f427230s;
        contactMgrOnlyChatUI.f207100d.clear();
        if (U != null) {
            for (int i17 = 0; U.moveToPosition(i17); i17++) {
                com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
                z3Var.convertFrom(U);
                contactMgrOnlyChatUI.f207100d.add(z3Var.d1());
            }
        }
        U.close();
    }

    @Override // uf5.w0
    public java.lang.String v() {
        return "@social.black.android";
    }
}
