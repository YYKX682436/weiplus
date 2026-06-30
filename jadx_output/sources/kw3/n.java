package kw3;

/* loaded from: classes9.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kw3.p f313132e;

    public n(kw3.p pVar, java.lang.String str) {
        this.f313132e = pVar;
        this.f313131d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        kw3.p pVar = this.f313132e;
        java.lang.String str = this.f313131d;
        boolean Ri = pVar.Ri(str);
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str);
        if (p17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreRemittance", "update red flag: %s, %s", str, java.lang.Boolean.valueOf(Ri));
            p17.U1(Ri ? 1 : 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreRemittance", "update ret: %s", java.lang.Integer.valueOf(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().Y(p17, str, false, true)));
        }
    }
}
