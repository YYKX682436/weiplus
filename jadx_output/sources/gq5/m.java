package gq5;

/* loaded from: classes5.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f274644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aq5.x0 f274645e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gq5.o f274646f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(aq5.x0 x0Var, gq5.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f274645e = x0Var;
        this.f274646f = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gq5.m(this.f274645e, this.f274646f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gq5.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f274644d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            aq5.p0 p0Var = aq5.p0.f13273a;
            this.f274644d = 1;
            obj = aq5.p0.f13276d.e(this.f274645e, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        aq5.v0 v0Var = (aq5.v0) obj;
        gq5.o oVar = this.f274646f;
        oVar.f274660r = true;
        boolean z17 = v0Var.f13308a;
        int i18 = v0Var.f13310c;
        if (!(z17 && i18 == 0)) {
            com.tencent.mars.xlog.Log.e(oVar.f274655m, "prepareSendFile failed, result.errorCode:" + i18);
            if (i18 == 1) {
                j75.f Q6 = oVar.Q6();
                eq5.h hVar = Q6 != null ? (eq5.h) Q6.getState() : null;
                if (hVar != null) {
                    hVar.f255921o = true;
                }
            }
            j75.f Q62 = oVar.Q6();
            if (Q62 != null) {
                Q62.B3(new eq5.i(11));
            }
        } else if (v0Var.f13309b) {
            j75.f Q63 = oVar.Q6();
            if (Q63 != null) {
                Q63.B3(new eq5.i(15));
            }
        } else {
            oVar.Y6();
        }
        return jz5.f0.f302826a;
    }
}
