package fq5;

/* loaded from: classes5.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f265662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wedrop.ui.code.TransferFileUIC f265663e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.wedrop.ui.code.TransferFileUIC transferFileUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f265663e = transferFileUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fq5.d(this.f265663e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fq5.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.view.View view;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f265662d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            aq5.p0 p0Var = aq5.p0.f13273a;
            this.f265662d = 1;
            if (!aq5.p0.f13277e) {
                com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.addLifecycleCallback(aq5.p0.f13278f);
                aq5.p0.f13277e = true;
            }
            i95.m c17 = i95.n0.c(gz.l.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mars.xlog.Log.i("MicroMsg.NearConnectionService", "unInit");
            com.tencent.wechat.aff.local_connection.d.f217358c.m("F2F-Transfer");
            ((kp.s) ((gz.l) c17)).f310831d = null;
            aq5.p0.f13274b = new aq5.f(true);
            obj = aq5.p0.f13275c.e(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        aq5.r0 r0Var = (aq5.r0) obj;
        com.tencent.mm.wedrop.ui.code.TransferFileUIC transferFileUIC = this.f265663e;
        transferFileUIC.f214287s = r0Var;
        aq5.p0 p0Var2 = aq5.p0.f13273a;
        aq5.q0 callback = (aq5.q0) ((jz5.n) transferFileUIC.f214282n).getValue();
        kotlin.jvm.internal.o.g(callback, "callback");
        aq5.f fVar = aq5.p0.f13274b;
        if (fVar != null) {
            fVar.f13234d = callback;
        }
        if (fVar == null || fVar.f13233c == null) {
            aq5.a aVar2 = aq5.a.f13215d;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WeDrop.TransferFileUIC", "init() called with: result = " + r0Var.f13291a);
        int i18 = r0Var.f13291a;
        if (i18 == 0) {
            transferFileUIC.f214278g = r0Var.f13292b;
            com.tencent.mars.xlog.Log.i("MicroMsg.WeDrop.TransferFileUIC", "loadQrcode() called");
            transferFileUIC.V6(3);
            v65.i.b(transferFileUIC.f214283o, null, new fq5.h(transferFileUIC, null), 1, null);
        } else {
            transferFileUIC.f214278g = null;
            if (i18 == 100206) {
                em.j4 j4Var = transferFileUIC.f214276e;
                if (j4Var != null && (view = j4Var.f254476a) != null) {
                    view.post(new fq5.f(transferFileUIC));
                }
                transferFileUIC.V6(6);
            } else {
                jq5.l lVar = jq5.n.f301282a;
                if (lVar.c() && lVar.e()) {
                    transferFileUIC.V6(5);
                } else {
                    transferFileUIC.V6(2);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
