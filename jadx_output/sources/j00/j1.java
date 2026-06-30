package j00;

/* loaded from: classes9.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f296804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f296805e;

    public j1(j00.k1 k1Var, com.tencent.mm.storage.f9 f9Var) {
        this.f296804d = k1Var;
        this.f296805e = f9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r07;
        j00.k1 k1Var = this.f296804d;
        k1Var.getClass();
        l15.c cVar = new l15.c();
        com.tencent.mm.storage.f9 f9Var = this.f296805e;
        java.lang.String j17 = f9Var.j();
        if (j17 == null) {
            j17 = "";
        }
        cVar.fromXml(j17);
        v05.b k17 = cVar.k();
        w05.d dVar = k17 != null ? (w05.d) k17.getCustom(k17.f432315e + 66) : null;
        if (dVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "handleGiftMsgStatus, ecsGiftAppMsgInfo is null");
            return;
        }
        java.lang.String t17 = dVar.t();
        java.lang.String j18 = dVar.j();
        n00.d dVar2 = n00.d.f333815a;
        if (dVar2.a().D0(t17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "updateGiftMsgByCgi, giftmsgid:" + t17 + " has been in gift");
            if (dVar.s().size() <= 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "updateGiftMsgByCgi, gift msg list is empty");
                return;
            }
            java.lang.Object obj = dVar.s().get(0);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            w05.e eVar = (w05.e) obj;
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "updateGiftMsgByCgi, gift msg status:" + eVar.l() + ", status version:" + eVar.w());
            r07 = 0;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "updateGiftMsgByCgi, giftmsgid:" + t17 + " insert to db, msg locad Id:" + f9Var.getMsgId());
            n00.f a17 = dVar2.a();
            long msgId = f9Var.getMsgId();
            java.lang.String Q0 = f9Var.Q0();
            if (Q0 == null) {
                Q0 = "";
            }
            r07 = 0;
            a17.z0(t17, msgId, Q0, false, j18, false);
        }
        java.util.List list = k1Var.f296811e;
        if (list.contains(t17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "updateGiftMsgByCgi, giftMsgId: " + t17 + " has in limit list");
            return;
        }
        list.add(t17);
        if (dVar.s().size() <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "updateGiftMsgByCgi, gift msg list is empty");
            return;
        }
        java.lang.Object obj2 = dVar.s().get(r07);
        kotlin.jvm.internal.o.f(obj2, "get(...)");
        java.lang.String n17 = ((w05.e) obj2).n();
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "updateGiftMsgByCgi, giftMsgId: " + t17 + ", orderId: " + n17 + ", start request cgi");
        bw5.af0 af0Var = new bw5.af0();
        af0Var.f25176d = java.lang.Long.parseLong(n17);
        boolean[] zArr = af0Var.f25181i;
        zArr[2] = true;
        af0Var.f25177e = 1;
        zArr[3] = true;
        af0Var.f25179g = 1;
        zArr[5] = true;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = af0Var;
        lVar.f70665b = new bw5.bf0();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/mmec_getpresentorder";
        lVar.f70667d = 9823;
        com.tencent.mm.modelbase.z2.d(lVar.a(), new j00.n0(t17, k1Var, f9Var), r07);
    }
}
