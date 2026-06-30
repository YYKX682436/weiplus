package yx3;

/* loaded from: classes10.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx3.v f467917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ey3.a f467918e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(yx3.v vVar, ey3.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467917d = vVar;
        this.f467918e = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx3.o(this.f467917d, this.f467918e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yx3.o oVar = (yx3.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        oVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("do vibrate ");
        yx3.v vVar = this.f467917d;
        sb6.append(vVar.f467942b);
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneServiceHelper", sb6.toString());
        ao4.b bVar = vVar.f467957q;
        if (bVar != null) {
            bVar.a(this.f467918e, new yx3.n(vVar));
        }
        ao4.b bVar2 = vVar.f467957q;
        if (bVar2 != null) {
            bVar2.b();
        }
        return jz5.f0.f302826a;
    }
}
