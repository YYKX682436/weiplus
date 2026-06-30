package h41;

/* loaded from: classes11.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.o0 f278825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f278826e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(h41.o0 o0Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f278825d = o0Var;
        this.f278826e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new h41.l0(this.f278825d, this.f278826e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        h41.l0 l0Var = (h41.l0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        l0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        h41.o0 o0Var = this.f278825d;
        o0Var.f278845k = true;
        kotlinx.coroutines.r2 r2Var = o0Var.f278844j;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        o0Var.f278844j = null;
        com.tencent.mm.open_voice_control.card.SendMsgCard sendMsgCard = o0Var.f278838b;
        if (sendMsgCard == null) {
            sendMsgCard = o0Var.f278843i;
        }
        if (sendMsgCard == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCMsgUI", "dismissAsync: not attached yet, keep ui for late attach id=" + o0Var.f278841e);
        } else {
            sendMsgCard.dismiss();
            int i17 = o0Var.f278841e;
            if (i17 > 0) {
                h41.o0.f278836l.a(i17);
                o0Var.f278841e = 0;
            }
        }
        o0Var.f278838b = null;
        o0Var.f278843i = null;
        o0Var.f278839c = 0L;
        o0Var.f278840d = "";
        com.tencent.wechat.aff.ovc.h hVar = o0Var.f278837a;
        if (hVar != null) {
            hVar.b(this.f278826e);
        }
        o0Var.f278837a = null;
        return jz5.f0.f302826a;
    }
}
