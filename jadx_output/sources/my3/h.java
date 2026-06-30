package my3;

/* loaded from: classes2.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.eh3 f332804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ my3.q f332805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332806g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r45.eh3 eh3Var, my3.q qVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332804e = eh3Var;
        this.f332805f = qVar;
        this.f332806g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new my3.h(this.f332804e, this.f332805f, this.f332806g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((my3.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332803d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                r45.eh3 eh3Var = this.f332804e;
                eh3Var.getClass();
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                lVar.f70667d = 9076;
                lVar.f70666c = "/cgi-bin/micromsg-bin/get_ilink_device_oauth_ticket";
                lVar.f70664a = eh3Var;
                lVar.f70665b = new r45.fh3();
                com.tencent.mm.modelbase.o a17 = lVar.a();
                com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
                iVar.p(a17);
                this.f332803d = 1;
                obj = rm0.h.b(iVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "onGYNetEnd errType = " + fVar.f70615a + " errCode = " + fVar.f70616b + ' ' + fVar.f70617c);
            boolean b17 = fVar.b();
            my3.q qVar = this.f332805f;
            if (b17) {
                com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
                if (fVar2 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosServiceImpl", "ticketScene.getResp() == null");
                    qVar.fj(fVar.f70615a, 7);
                } else {
                    com.tencent.mm.protobuf.g gVar = ((r45.fh3) fVar2).f374349d;
                    byte[] g17 = gVar != null ? gVar.g() : null;
                    my3.q.Ai(qVar, this.f332806g, g17 != null ? new java.lang.String(g17, r26.c.f368865a) : null);
                }
            } else {
                int i18 = fVar.f70616b;
                if (i18 == -2047) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosServiceImpl", "second device login no allow");
                    qVar.fj(fVar.f70615a, 15);
                } else if (i18 == -2039) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosServiceImpl", "license not register");
                    qVar.fj(fVar.f70615a, 3);
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosServiceImpl", "Get Ticket Fail");
                    qVar.fj(fVar.f70615a, 7);
                }
            }
        } catch (rm0.j e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Rtos.RtosServiceImpl", "GetILinkDeviceOAuthTicketReq error, errCode:" + e17.f397425f + ", errType:" + e17.f397424e);
        }
        return jz5.f0.f302826a;
    }
}
