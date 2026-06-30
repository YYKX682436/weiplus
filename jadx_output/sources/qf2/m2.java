package qf2;

/* loaded from: classes.dex */
public final class m2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.c3 f362480e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.u4 f362481f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362482g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(qf2.c3 c3Var, dk2.u4 u4Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362480e = c3Var;
        this.f362481f = u4Var;
        this.f362482g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.m2(this.f362480e, this.f362481f, this.f362482g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.m2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f362479d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            qf2.c3 c3Var = this.f362480e;
            java.lang.String str = this.f362481f.f234154a;
            if (str == null) {
                str = "";
            }
            qf2.l2 l2Var = new qf2.l2(this.f362482g);
            this.f362479d = 1;
            if (qf2.c3.h7(c3Var, 3, str, false, l2Var, this, 4, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
