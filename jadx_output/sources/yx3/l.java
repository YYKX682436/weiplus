package yx3;

/* loaded from: classes10.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx3.v f467914d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yx3.v vVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467914d = vVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx3.l(this.f467914d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yx3.l lVar = (yx3.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        lVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yx3.v vVar = this.f467914d;
        if (vVar.f467957q != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RingtoneServiceHelper", "old vibrate has not release");
            ao4.b bVar = vVar.f467957q;
            if (bVar != null) {
                bVar.c();
            }
            vVar.f467957q = null;
        }
        vVar.f467957q = new ao4.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneServiceHelper", "init vibrate player in do shake only " + vVar.f467957q);
        vx3.i iVar = vVar.f467942b;
        if (iVar != null) {
            ey3.a i17 = iVar.i();
            com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneServiceHelper", "do shake only " + i17);
            ao4.b bVar2 = vVar.f467957q;
            if (bVar2 != null) {
                bVar2.a(i17, null);
            }
            ao4.b bVar3 = vVar.f467957q;
            if (bVar3 != null) {
                bVar3.b();
            }
            vVar.C = true;
        }
        return jz5.f0.f302826a;
    }
}
