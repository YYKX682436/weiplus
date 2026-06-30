package qx3;

/* loaded from: classes10.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f367369d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f367370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qx3.o f367371f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(qx3.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f367371f = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        qx3.m mVar = new qx3.m(this.f367371f, continuation);
        mVar.f367370e = obj;
        return mVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qx3.m) create((qx3.f) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        qx3.f fVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f367369d;
        qx3.o oVar = this.f367371f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            qx3.f fVar2 = (qx3.f) this.f367370e;
            com.tencent.mars.xlog.Log.i("MicroMsg.RingtonePlayerFlow", "actionFlow collect, state:" + fVar2.f367355c);
            if (fVar2.f367355c == 3) {
                ((kotlinx.coroutines.flow.h3) oVar.f367375e).k(new qx3.e(0L, 1));
                oVar.R6();
            } else {
                long j17 = fVar2.f367353a;
                vx3.i iVar = fVar2.f367354b;
                if (iVar == null) {
                    ((kotlinx.coroutines.flow.h3) oVar.f367375e).k(new qx3.e(j17, 1));
                    oVar.R6();
                } else {
                    ((kotlinx.coroutines.flow.h3) oVar.f367375e).k(new qx3.e(j17, 1));
                    oVar.R6();
                    this.f367370e = fVar2;
                    this.f367369d = 1;
                    oVar.getClass();
                    java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new qx3.h(oVar, iVar, null), this);
                    if (g17 == aVar) {
                        return aVar;
                    }
                    fVar = fVar2;
                    obj = g17;
                }
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fVar = (qx3.f) this.f367370e;
        kotlin.ResultKt.throwOnFailure(obj);
        vx3.i iVar2 = (vx3.i) obj;
        if (iVar2 != null) {
            long j18 = fVar.f367353a;
            kk4.v vVar = oVar.f367380m;
            if (vVar == null) {
                oVar.f367379i = j18;
                oVar.O6(iVar2);
            } else if (j18 != oVar.f367379i) {
                oVar.R6();
                oVar.f367379i = j18;
                oVar.O6(iVar2);
            } else {
                if (vVar.s()) {
                    oVar.R6();
                } else {
                    oVar.R6();
                    oVar.f367379i = j18;
                    oVar.O6(iVar2);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
