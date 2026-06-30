package hr3;

/* loaded from: classes11.dex */
public class n1 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactInfoUI f283818b;

    public n1(com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI, java.lang.String str) {
        this.f283818b = contactInfoUI;
        this.f283817a = str;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "fetch contact result: username=" + str + ", succ=" + z17);
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = this.f283818b;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = contactInfoUI.F;
        if (u3Var != null && u3Var.isShowing()) {
            contactInfoUI.F.dismiss();
            contactInfoUI.F = null;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactInfoUI", "fetch contact failed, not show bodyWidget");
            gr3.c.c(52L);
            contactInfoUI.F = db5.e1.Q(contactInfoUI.getContext(), contactInfoUI.getString(com.tencent.mm.R.string.f490573yv), contactInfoUI.getString(com.tencent.mm.R.string.f490604zq), true, true, null);
            return;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
        if (n17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactInfoUI", "updated contact is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "updated contact bizType: " + n17.f236586x1);
        contactInfoUI.f153661n = n17;
        contactInfoUI.a7(this.f283817a);
    }
}
