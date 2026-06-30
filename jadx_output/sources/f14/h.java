package f14;

/* loaded from: classes4.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f258686d;

    public h(f14.i iVar, java.lang.String str) {
        this.f258686d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String str = this.f258686d;
        com.tencent.mm.storage.z3 n17 = Bi.n(str, true);
        if (n17 == null || n17.r2()) {
            return;
        }
        if (!((n17.getType() & 2) != 0) || n17.q2()) {
            return;
        }
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.j1(0);
        f9Var.u1(str);
        f9Var.r1(6);
        f9Var.d1(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.irm));
        f9Var.e1(c01.w9.m(str, java.lang.System.currentTimeMillis() / 1000));
        f9Var.setType(10000);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreSetting", "insert chatcontact verify sysmsg. %s", str);
    }
}
