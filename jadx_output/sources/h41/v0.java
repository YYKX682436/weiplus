package h41;

/* loaded from: classes11.dex */
public final class v0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.y0 f278875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f278876e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(h41.y0 y0Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f278875d = y0Var;
        this.f278876e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new h41.v0(this.f278875d, this.f278876e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        h41.v0 v0Var = (h41.v0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        v0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        h41.y0 y0Var = this.f278875d;
        y0Var.f278901j = true;
        kotlinx.coroutines.r2 r2Var = y0Var.f278900i;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        y0Var.f278900i = null;
        com.tencent.mm.open_voice_control.card.SelectContactCard selectContactCard = y0Var.f278895b;
        if (selectContactCard == null) {
            selectContactCard = y0Var.f278899h;
        }
        if (selectContactCard == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCSelectContactUI", "dismiss: not attached yet, keep ui for late attach id=" + y0Var.f278897d);
        } else {
            selectContactCard.dismiss();
            int i17 = y0Var.f278897d;
            if (i17 > 0) {
                h41.y0.f278893k.a(i17);
                y0Var.f278897d = 0;
            }
        }
        y0Var.f278895b = null;
        y0Var.f278899h = null;
        y0Var.f278896c = 0L;
        com.tencent.wechat.aff.ovc.l lVar = y0Var.f278894a;
        if (lVar != null) {
            lVar.b(this.f278876e);
        }
        y0Var.f278894a = null;
        return jz5.f0.f302826a;
    }
}
