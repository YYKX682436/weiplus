package h41;

/* loaded from: classes11.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.t0 f278851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f278852e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(h41.t0 t0Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f278851d = t0Var;
        this.f278852e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new h41.r0(this.f278851d, this.f278852e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        h41.r0 r0Var = (h41.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        r0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        h41.t0 t0Var = this.f278851d;
        t0Var.f278868j = true;
        kotlinx.coroutines.r2 r2Var = t0Var.f278867i;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        t0Var.f278867i = null;
        com.tencent.mm.open_voice_control.card.PermissionRequestCard permissionRequestCard = t0Var.f278862b;
        if (permissionRequestCard == null) {
            permissionRequestCard = t0Var.f278866h;
        }
        if (permissionRequestCard == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCPermissionRequestUI", "dismiss: not attached yet, keep ui for late attach id=" + t0Var.f278864d);
        } else {
            permissionRequestCard.dismiss();
            int i17 = t0Var.f278864d;
            if (i17 > 0) {
                h41.t0.f278860k.a(i17);
                t0Var.f278864d = 0;
            }
        }
        t0Var.f278862b = null;
        t0Var.f278866h = null;
        t0Var.f278863c = 0L;
        com.tencent.wechat.aff.ovc.j jVar = t0Var.f278861a;
        if (jVar != null) {
            jVar.b(this.f278852e);
        }
        t0Var.f278861a = null;
        return jz5.f0.f302826a;
    }
}
