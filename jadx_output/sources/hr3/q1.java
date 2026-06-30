package hr3;

/* loaded from: classes11.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f283905d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.storage.u7 f283906e;

    public q1(com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI, com.tencent.mm.storage.u7 u7Var) {
        this.f283905d = new java.lang.ref.WeakReference(contactInfoUI);
        this.f283906e = u7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = (com.tencent.mm.plugin.profile.ui.ContactInfoUI) this.f283905d.get();
        com.tencent.mm.storage.u7 u7Var = this.f283906e;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "onNotifyFriendUserChange user: %s", u7Var);
        if (contactInfoUI == null || contactInfoUI.isFinishing() || contactInfoUI.isDestroyed()) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = contactInfoUI.f153661n.d1();
        objArr[1] = u7Var != null ? u7Var.field_encryptUsername : "";
        objArr[2] = u7Var.field_username;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "onNotifyFriendUserChange contact.user:%s, notify.user:%s, friendUser:%s", objArr);
        com.tencent.mm.storage.z3 z3Var = contactInfoUI.f153661n;
        if (z3Var == null || u7Var == null || com.tencent.mm.sdk.platformtools.t8.K0(z3Var.d1()) || !contactInfoUI.f153661n.d1().equals(u7Var.field_encryptUsername) || c01.e2.U(contactInfoUI.f153661n.d1())) {
            return;
        }
        java.lang.String str = u7Var.field_username;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !str.equals(contactInfoUI.f153661n.d1())) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1430, 4);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            contactInfoUI.f153661n = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        }
        contactInfoUI.getIntent().putExtra("Contact_User", contactInfoUI.f153661n.d1());
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "new contact user:%s", contactInfoUI.f153661n.d1());
        t25.a aVar = contactInfoUI.f153655e;
        if (aVar != null) {
            aVar.onDetach();
            ((com.tencent.mm.ui.base.preference.h0) contactInfoUI.f153654d).t();
        }
        contactInfoUI.initView();
    }
}
