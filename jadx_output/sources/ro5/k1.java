package ro5;

/* loaded from: classes14.dex */
public final /* synthetic */ class k1 extends kotlin.jvm.internal.m implements yz5.l {
    public k1(java.lang.Object obj) {
        super(1, obj, ro5.m1.class, "onEncodeQosParamUpdate", "onEncodeQosParamUpdate(Lcom/tencent/mm/voipmp/v2/render/raw/hw_codec/QoSParams;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        uo5.u p07 = (uo5.u) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        ro5.m1 m1Var = (ro5.m1) this.receiver;
        m1Var.getClass();
        ro5.m mVar = (ro5.m) m1Var.f398240b;
        mVar.getClass();
        ro5.b0 b0Var = mVar.f398237a;
        er4.r rVar = b0Var.f398146c;
        if (rVar == er4.r.MP_ROOM_TYPE_MULTI_TALK || rVar == er4.r.MP_ROOM_TYPE_TRANS_MUTLTI) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPRenderController", "current is in multitalk,not allow to switch preview");
        } else if (p07.f429754k != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPRenderController", "current remote user ui is not full screen,not allow to switch preview");
        } else if ((p07.f429753j & 128) == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPRenderController", "0x80");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPRenderController", "onEncodeParamsUpdate");
            so5.k0 k0Var = b0Var.f398149f;
            if (k0Var != null) {
                kotlinx.coroutines.l.d(k0Var.f410857d, null, null, new so5.f0(k0Var, p07, null), 3, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
