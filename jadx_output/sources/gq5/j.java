package gq5;

/* loaded from: classes5.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f274637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.ud0 f274638e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274639f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gq5.o f274640g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(bw5.ud0 ud0Var, java.lang.String str, gq5.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f274638e = ud0Var;
        this.f274639f = str;
        this.f274640g = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gq5.j(this.f274638e, this.f274639f, this.f274640g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gq5.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f274637d;
        gq5.o oVar = this.f274640g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            aq5.p0 p0Var = aq5.p0.f13273a;
            bw5.ud0 decryptKeyResp = this.f274638e;
            kotlin.jvm.internal.o.f(decryptKeyResp, "$decryptKeyResp");
            aq5.q0 q0Var = (aq5.q0) ((jz5.n) oVar.f274624i).getValue();
            this.f274637d = 1;
            if (!aq5.p0.f13277e) {
                com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.addLifecycleCallback(aq5.p0.f13278f);
                aq5.p0.f13277e = true;
            }
            i95.m c17 = i95.n0.c(gz.l.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mars.xlog.Log.i("MicroMsg.NearConnectionService", "unInit");
            com.tencent.wechat.aff.local_connection.d.f217358c.m("F2F-Transfer");
            ((kp.s) ((gz.l) c17)).f310831d = null;
            aq5.p0.f13274b = new aq5.f(false);
            obj = aq5.p0.f13276d.c(decryptKeyResp, this.f274639f, q0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        aq5.s0 s0Var = (aq5.s0) obj;
        com.tencent.mars.xlog.Log.i(oVar.f274655m, "init sender: result " + s0Var.f13294a);
        int i18 = s0Var.f13294a;
        if (!(i18 == 0)) {
            if (i18 == 100206) {
                j75.f Q6 = oVar.Q6();
                if (Q6 != null) {
                    Q6.B3(new eq5.i(17));
                }
            } else if (i18 == 100202 && ((kp.i1) ((gz.m) i95.n0.c(gz.m.class))).bj()) {
                j75.f Q62 = oVar.Q6();
                if (Q62 != null) {
                    Q62.B3(new eq5.i(17));
                }
            } else {
                j75.f Q63 = oVar.Q6();
                if (Q63 != null) {
                    Q63.B3(new eq5.i(16));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
