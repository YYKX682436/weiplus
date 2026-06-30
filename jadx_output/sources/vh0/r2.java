package vh0;

/* loaded from: classes.dex */
public final class r2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f436957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f436958e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vh0.f3 f436959f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(java.lang.String str, vh0.f3 f3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f436958e = str;
        this.f436959f = f3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vh0.r2(this.f436958e, this.f436959f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vh0.r2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar;
        r45.vq vqVar;
        boolean z17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f436957d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        java.lang.String str = this.f436958e;
        boolean z18 = true;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                r45.tq tqVar = new r45.tq();
                tqVar.set(1, str);
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                lVar.f70667d = 18551;
                lVar.f70666c = "/cgi-bin/micromsg-bin/bypgetweclawbotstatus";
                lVar.f70664a = tqVar;
                lVar.f70665b = new r45.vq();
                com.tencent.mm.modelbase.o a17 = lVar.a();
                com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
                iVar.p(a17);
                this.f436957d = 1;
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
            fVar = (com.tencent.mm.modelbase.f) obj;
            vqVar = (r45.vq) fVar.f70618d;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChatBotRoutineService", th6, "fetchWeClawStatus failed for " + str, new java.lang.Object[0]);
        }
        if (fVar.f70615a == 0 && fVar.f70616b == 0 && vqVar != null) {
            int integer = vqVar.getInteger(1);
            r45.uq uqVar = integer != 1 ? integer != 2 ? null : r45.uq.WECLAWBOT_STATUS_OFFLINE : r45.uq.WECLAWBOT_STATUS_ONLINE;
            if (uqVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ChatBotRoutineService", "fetchWeClawStatus: status is null for " + str);
                return f0Var;
            }
            int i18 = uqVar.f387563d;
            if (i18 == 1) {
                z17 = true;
            } else {
                if (i18 != 2) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ChatBotRoutineService", "fetchWeClawStatus: unknown status number " + i18 + " for " + str);
                    return f0Var;
                }
                z17 = false;
            }
            vh0.f3 f3Var = this.f436959f;
            if (!z17) {
                z18 = false;
            }
            f3Var.nj(str, z18);
            return f0Var;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ChatBotRoutineService", "fetchWeClawStatus failed for " + str + ", errType=" + fVar.f70615a + ", errCode=" + fVar.f70616b + ", errMsg=" + fVar.f70617c);
        return f0Var;
    }
}
