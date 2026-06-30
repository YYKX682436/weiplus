package w11;

/* loaded from: classes11.dex */
public class p0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w11.q0 f442101d;

    public p0(w11.q0 q0Var) {
        this.f442101d = q0Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.setHasCallbackToQueue(true);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        w11.q0 q0Var = this.f442101d;
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(((java.util.ArrayList) q0Var.f442112e.f442123o).size());
        w11.r0 r0Var = q0Var.f442112e;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendMsg", "summerdktext verifypsw onSceneEnd[%d, %d] needVerifyPswList size[%d] errMsg[%s] verifyingPsw[%b], retryVerifyCount[%d]", valueOf, valueOf2, valueOf3, str, java.lang.Boolean.valueOf(r0Var.f442122n), java.lang.Integer.valueOf(r0Var.f442121m));
        if (i17 == 0 && i18 == 0) {
            ((java.util.ArrayList) r0Var.f442123o).clear();
            r0Var.H(str);
        } else {
            java.util.List list = r0Var.f442123o;
            int i19 = 0;
            while (true) {
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (i19 >= arrayList.size()) {
                    break;
                }
                r0Var.J((com.tencent.mm.storage.f9) arrayList.get(i19));
                i19++;
            }
            r0Var.f442115d.onSceneEnd(4, -49, q0Var.f442111d, r0Var);
            java.util.List list2 = r0Var.f442123o;
            int i27 = 0;
            while (true) {
                java.util.ArrayList arrayList2 = (java.util.ArrayList) list2;
                if (i27 >= arrayList2.size()) {
                    break;
                }
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) arrayList2.get(i27);
                com.tencent.mm.autogen.events.SendMsgFailEvent sendMsgFailEvent = new com.tencent.mm.autogen.events.SendMsgFailEvent();
                sendMsgFailEvent.f54753g.f7461a = f9Var;
                sendMsgFailEvent.e();
                f9Var.getMsgId();
                i27++;
            }
            ((java.util.ArrayList) r0Var.f442123o).clear();
        }
        r0Var.f442122n = false;
        x51.o1.K = false;
    }
}
