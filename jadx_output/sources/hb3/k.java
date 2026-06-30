package hb3;

/* loaded from: classes9.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f280125e;

    public k(hb3.o oVar, java.lang.String str, boolean z17) {
        this.f280124d = str;
        this.f280125e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        java.lang.String str = this.f280124d;
        com.tencent.mm.storage.l4 p17 = Di.p(str);
        if (p17 != null && com.tencent.mm.storage.z3.R4(str)) {
            boolean z18 = p17.P0() == 1;
            boolean z19 = this.f280125e;
            if (z18 != z19) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreLuckyMoney", "update red flag: %s, %s", str, java.lang.Boolean.valueOf(z19));
                p17.L1(z19 ? 1 : 0);
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreLuckyMoney", "update ret: %s", java.lang.Integer.valueOf(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().Y(p17, str, true, true)));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreLuckyMoney", "finish update red flag: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }
}
