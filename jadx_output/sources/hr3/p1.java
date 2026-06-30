package hr3;

/* loaded from: classes11.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f283871d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f283872e;

    public p1(com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI, java.lang.String str) {
        this.f283871d = new java.lang.ref.WeakReference(contactInfoUI);
        this.f283872e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView;
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = (com.tencent.mm.plugin.profile.ui.ContactInfoUI) this.f283871d.get();
        java.lang.String str = this.f283872e;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "onNotifyChange contact %s", str);
        if (contactInfoUI == null || contactInfoUI.isFinishing() || contactInfoUI.isDestroyed()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "onNotifyChange verify:%b, contact.user:%s, notify.user:%s", java.lang.Boolean.valueOf(contactInfoUI.f153658h), contactInfoUI.f153661n.d1(), str);
        com.tencent.mm.storage.z3 z3Var = contactInfoUI.f153661n;
        if (z3Var == null || com.tencent.mm.sdk.platformtools.t8.K0(z3Var.d1())) {
            return;
        }
        if (contactInfoUI.f153661n.d1().equals(str) || contactInfoUI.f153661n.d1().equals(com.tencent.mm.storage.z3.Y4(str))) {
            contactInfoUI.f153661n = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            t25.a aVar = contactInfoUI.f153655e;
            if (aVar != null) {
                aVar.onDetach();
                if (com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isAccessibilityEnabled()) {
                    android.view.View X6 = contactInfoUI.X6(contactInfoUI.getWindow().getDecorView(), new hr3.x0$$a());
                    contactInfoUI.P = (X6 == null || (textView = (android.widget.TextView) X6.findViewById(android.R.id.title)) == null) ? "" : textView.getText().toString();
                }
                ((com.tencent.mm.ui.base.preference.h0) contactInfoUI.f153654d).t();
            }
            contactInfoUI.initView();
            if (com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isAccessibilityEnabled()) {
                android.view.View decorView = contactInfoUI.getWindow().getDecorView();
                decorView.post(new hr3.y0(contactInfoUI, decorView, contactInfoUI.P));
            }
        }
    }
}
