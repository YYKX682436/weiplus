package hr3;

/* loaded from: classes11.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f283933d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.storage.ya f283934e;

    public r1(com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI, com.tencent.mm.storage.ya yaVar) {
        this.f283933d = new java.lang.ref.WeakReference(contactInfoUI);
        this.f283934e = yaVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = (com.tencent.mm.plugin.profile.ui.ContactInfoUI) this.f283933d.get();
        com.tencent.mm.storage.ya yaVar = this.f283934e;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "onNotifyChange stranger %s", yaVar);
        if (contactInfoUI == null || contactInfoUI.isFinishing() || contactInfoUI.isDestroyed()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "onNotifyChange verify:%b, contact.user:%s, notify.user:%s", java.lang.Boolean.valueOf(contactInfoUI.f153658h), contactInfoUI.f153661n.d1(), yaVar);
        com.tencent.mm.storage.z3 z3Var = contactInfoUI.f153661n;
        if (z3Var == null || yaVar == null || com.tencent.mm.sdk.platformtools.t8.K0(z3Var.d1()) || !contactInfoUI.f153661n.d1().equals(yaVar.field_encryptUsername) || c01.e2.U(contactInfoUI.f153661n.d1())) {
            return;
        }
        contactInfoUI.f153661n.n1(yaVar.field_conRemark);
        contactInfoUI.getIntent().putExtra("Contact_User", contactInfoUI.f153661n.d1());
        t25.a aVar = contactInfoUI.f153655e;
        if (aVar != null) {
            aVar.onDetach();
            ((com.tencent.mm.ui.base.preference.h0) contactInfoUI.f153654d).t();
        }
        contactInfoUI.initView();
    }
}
