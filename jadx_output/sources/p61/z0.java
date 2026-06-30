package p61;

/* loaded from: classes5.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI f352415d;

    public z0(com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI bindMContactIntroUI) {
        this.f352415d = bindMContactIntroUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (r61.q0.i()) {
            int i17 = com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI.f72961y;
            com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI bindMContactIntroUI = this.f352415d;
            bindMContactIntroUI.getClass();
            int p17 = c01.z1.p();
            r61.q0.k(true);
            gm0.j1.u().c().w(7, java.lang.Integer.valueOf(p17 & (-131073)));
            ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
            bindMContactIntroUI.f72966i.setText(bindMContactIntroUI.getString(com.tencent.mm.R.string.age));
            bindMContactIntroUI.f72968n = js.x0.SUCC;
            boolean m17 = com.tencent.mm.sdk.platformtools.t8.m1((java.lang.Boolean) gm0.j1.u().c().l(12322, java.lang.Boolean.FALSE), false);
            if (bindMContactIntroUI.f72973s && m17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11002, 3, 3);
            }
        }
    }
}
