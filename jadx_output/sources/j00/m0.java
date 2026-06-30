package j00;

/* loaded from: classes9.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f296831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f296832e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.bf0 f296833f;

    public m0(j00.k1 k1Var, com.tencent.mm.storage.f9 f9Var, bw5.bf0 bf0Var) {
        this.f296831d = k1Var;
        this.f296832e = f9Var;
        this.f296833f = bf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j00.k1 k1Var = this.f296831d;
        k1Var.getClass();
        l15.c cVar = new l15.c();
        com.tencent.mm.storage.f9 f9Var = this.f296832e;
        java.lang.String j17 = f9Var.j();
        if (j17 == null) {
            j17 = "";
        }
        cVar.fromXml(j17);
        v05.b k17 = cVar.k();
        w05.d dVar = k17 != null ? (w05.d) k17.getCustom(k17.f432315e + 66) : null;
        if (dVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "handleGetPresentOrderResponse, ecsGiftAppMsgInfo is null");
            return;
        }
        bw5.bf0 bf0Var = this.f296833f;
        if (!k1Var.oj(bf0Var)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "isPresentOrderRespValid, present order resp invalid");
            return;
        }
        bw5.ph0 ph0Var = (bw5.ph0) bf0Var.b().b().c().f32124d.get(0);
        int i17 = ph0Var.f31639m;
        int i18 = ph0Var.N;
        boolean[] zArr = ph0Var.f31659z1;
        java.lang.String str = zArr[32] ? ph0Var.L : "";
        int i19 = ph0Var.M;
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "updateGiftMsgByCgi, cgi return success, gift status:" + i17 + ", version:" + i18 + ", wording:" + str + ", style:" + i19);
        if (dVar.s().size() <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "gift app msg gift list size is empty");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "updateGiftMsgByCgi, msgContent:" + f9Var.j());
        ((w05.e) dVar.s().get(0)).z((long) i17);
        ((w05.e) dVar.s().get(0)).B((long) i18);
        ((w05.e) dVar.s().get(0)).A(i19);
        w05.e eVar = (w05.e) dVar.s().get(0);
        kotlin.jvm.internal.o.d(str);
        eVar.C(str);
        w05.e eVar2 = (w05.e) dVar.s().get(0);
        java.lang.String str2 = zArr[38] ? ph0Var.S : "";
        kotlin.jvm.internal.o.f(str2, "getDetailstatuswording(...)");
        eVar2.y(str2);
        java.lang.String hj6 = k1Var.hj(f9Var, cVar.toXml(false));
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "updateGiftMsgByCgi, giftMsgId:" + dVar.t());
        f9Var.d1(hj6);
        com.tencent.mm.storage.f9 k18 = pt0.f0.f358209b1.k(f9Var.Q0(), f9Var.getMsgId());
        if (k18 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "updateGiftMsgByCgi, oldMsg is null");
        }
        kotlin.jvm.internal.o.d(k18);
        if (!k1Var.Ni(k18, f9Var)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "updateGiftMsgByCgi, update failed");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "updateGiftMsgByCgi, update msg by id: " + ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.getMsgId(), f9Var, true));
    }
}
