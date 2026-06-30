package mp5;

/* loaded from: classes9.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mp5.n f330490d;

    public m(mp5.n nVar) {
        this.f330490d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        mp5.n nVar = this.f330490d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayKeyBoard", "out of time, clean enterPayAmount:%s", nVar.f330491d.L);
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = nVar.f330491d;
        wcPayKeyboard.L = "";
        mp5.u uVar = wcPayKeyboard.H;
        if (uVar != null) {
            o05.j jVar = ((ps4.f) uVar).f358150a;
            if (jVar != null) {
                jVar.b(0, "#outtime");
            }
            if (wcPayKeyboard.N == null) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(29733, 3, 1);
            }
        }
    }
}
